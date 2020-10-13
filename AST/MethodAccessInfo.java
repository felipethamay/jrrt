package AST;

import java.util.HashSet;
import java.io.File;
import java.util.*;

import beaver.*;

import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Collections;

import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Constraint;
import jp.ac.kobe_u.cs.cream.Equals;
import jp.ac.kobe_u.cs.cream.NotEquals;
import jp.ac.kobe_u.cs.cream.IntComparison;
import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.Solution;
import jp.ac.kobe_u.cs.cream.IntArith;

import java.util.Map;
import java.util.Arrays;

import tests.CompileHelper;
import tests.jdolly.ConditionsMoveMethod;
import tests.jdolly.ConditionsPushDownMethod;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
  * @ast class
 * 
 */
public class MethodAccessInfo extends java.lang.Object {

		private MethodDecl target;


		private TypeDecl source;


		private TypeDecl bend;


		private Collection<MethodDecl> competitors;


		private boolean directlyVisible;


		
		public MethodAccessInfo(MethodDecl target, TypeDecl td, 
								Collection<MethodDecl> competitors) {
			this.target = target;
			this.source = td;
			this.bend = td;
			this.competitors = competitors;
			this.directlyVisible = true;
		}


		
		public TypeDecl getSource() { return source; }


		public TypeDecl getBend() { return bend; }

public MethodAccessInfo moveDownTo(TypeDecl td) {
		bend = td;
		if(!td.localMethodsSignature(target.signature()).isEmpty()) {
			directlyVisible = false;
		} else {
			if(directlyVisible)
				source = td;
			for(Iterator<MethodDecl> iter=td.localMethods(target.name()).iterator(); iter.hasNext();)
				competitors.add(iter.next());
		}
		return this;
	}

public MethodAccessInfo moveInto(TypeDecl td) {
		if(!td.memberMethods(target.name()).isEmpty())
			directlyVisible = false;
		return this;
	}

public Access eliminate(MethodAccess original, Expr qualifier, TypeDecl enclosing, boolean isMonoCall, boolean inStaticCtxt, List<Expr> args) {
		if(qualifier == null)
			return eliminate(original, enclosing, isMonoCall, inStaticCtxt, args);
		else
			return eliminateQualified(original, qualifier, enclosing, isMonoCall, inStaticCtxt, args);
	}

public Access eliminate(MethodAccess original, TypeDecl enclosing, boolean isMonoCall, boolean inStaticCtxt, List<Expr> args) {
		if(!directlyVisible) {
			if(target.isStatic())
				return (Access) original.replace(original).with(
						computeStaticAccess(original, enclosing, args));
			if(inStaticCtxt)
				throw new RefactoringException("cannot access non-static method in static context");
			MethodAccess ma = constructAccess(original, args);
			ma.flushCaches();
			if(isMonoCall && !target.isPrivate()) {
				// need to construct a super call
				if(bend instanceof ClassDecl && source == ((ClassDecl)bend).superclass()) {
					if(bend == enclosing) {
						ma.affectedByUnlock(ma);
						return (Access)original.replace(original).with(new SuperAccess("super").qualifiesAccess(ma));
					} else {
						Access bendAccess = bend.createLockedAccess();
						ma.affectedByUnlock(bendAccess, ma);
						return (Access)original.replace(original).with(bendAccess.qualifiesAccess(new SuperAccess("super").qualifiesAccess(ma)));
					}
				}
				throw new RefactoringException("cannot construct monomorphic call");
			} else {
				if(source != bend && target.isPrivate())
					throw new RefactoringException("cannot access private method here");
				if(bend == enclosing) {
					return (Access)original.replace(original).with(ma);
				} else {
					Access bendAccess = bend.createLockedAccess();
					ma.affectedByUnlock(bendAccess, ma);
					return (Access)original.replace(original).with(bendAccess.qualifiesAccess(new ThisAccess("this").qualifiesAccess(ma)));
				}
				/* Note: We do not distiguish whether source == bend or not, but since we are constructing a virtuall call
				 *       there is no semantic difference between ((A)this).m() and this.m(), and ((A)B.this).m() and 
				 *       B.this.m() anyway.
				 *        
				 * TODO: this might lead to problems with overloading*/
			}
		} else {
			return (Access)original.replace(original).with(constructAccess(original, args));
		}
	}

public Access computeStaticAccess(MethodAccess original, TypeDecl enclosing, List<Expr> args) {
		Access sourceAccess = source.createLockedAccess();
		Access methodAccess = constructAccess(original, args);
		methodAccess.affectedByUnlock(sourceAccess, methodAccess);
		return sourceAccess.qualifiesAccess(methodAccess);
	}

protected MethodAccess constructAccess(MethodAccess original, List<Expr> args) {
		// check if any of the competitors is more specific than the target for
		// this argument list; then we need casts
		for(MethodDecl cand : competitors)
			if(cand.applicableTo(args))
				if(cand.moreSpecificThan(target) || !target.moreSpecificThan(cand))
					return (MethodAccess) original.replace(original).with(new MethodAccess(target.name(), insertCasts(target, args)));
		return original;
	}

public static List<Expr> insertCasts(Callable target, List<Expr> args) {
		List<Expr> new_args = new List<Expr>();
		for(int i=0;i<target.getNumParameter();++i) {
			ParameterDeclaration parm = target.getParameter(i);
			Expr arg = args.getChild(i);
			TypeDecl tp = parm.type();
			if(parm.isVariableArity() && !arg.type().methodInvocationConversionTo(tp)) {
				List<Expr> varargs = new List<Expr>();
				while(i<args.getNumChild())
					varargs.add(args.getChild(i++));
				Access tpAccess = tp.createLockedAccess();
				((ASTNode)target).affectedByUnlock(tpAccess);
				new_args.addChild(new ArrayCreationExpr(tpAccess, new Opt(new ArrayInit(varargs))));
			} else {
				Access tpAccess = tp.createLockedAccess();
				((ASTNode)target).affectedByUnlock(tpAccess);
				new_args.addChild(new CastExpr(tpAccess, arg));
			}
		}
		return new_args;
	}

public Access eliminateQualified(MethodAccess original, Expr qualifier, TypeDecl enclosing,
			boolean isMonoCall, boolean inStaticCtxt, List<Expr> args) {
		MethodAccess ma = constructAccess(original, args);
		if(!directlyVisible) {
//			if (ConditionsPushDownMethod.cond1) {
				if(!target.isStatic())
					throw new RefactoringException("cannot access method");
//			}
			if(inStaticCtxt)
				if(qualifier.isTypeAccess() && qualifier.type().equals(source))
					return ma.parentDot();
				else
					throw new RefactoringException("cannot access method");
			if(source == bend && source.equals(qualifier.type()))
				return ma.parentDot();
			else if(!qualifier.isTypeAccess() && qualifier.type().equals(bend)) {
				ma.parentDot().flushCaches();
				Access sourceAccess = source.createLockedAccess();
				ma.affectedByUnlock(sourceAccess, ma);
				return (Access) ma.parentDot().replace(ma.parentDot()).with(
						new ParExpr(new CastExpr(sourceAccess, qualifier)).qualifiesAccess(ma));
			}
			throw new RefactoringException("cannot access method");
		} else {
			if (ConditionsMoveMethod.cond6) {
			  if(!target.accessibleFrom(enclosing))
				  if (false) // ConditionMT 32
			    throw new RefactoringException("method not accessible");
			}
			return ma.parentDot();
		}
	}


}
