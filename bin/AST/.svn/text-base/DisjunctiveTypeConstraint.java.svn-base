package AST;

import java.util.HashSet;
import java.io.File;
import java.util.*;
import beaver.*;
import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
import java.io.FileNotFoundException;
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
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
  * @ast class
 * 
 */
public class DisjunctiveTypeConstraint extends TypeConstraint {

		private Collection<TypeConstraint> constraints;


		
		public DisjunctiveTypeConstraint(ASTNode node, String cause, TypeConstraintVariable left, Operator op, Collection<? extends TypeConstraintVariable> rights) {
			super(node, cause);
			this.constraints = new LinkedList<TypeConstraint>();
			for(TypeConstraintVariable right : rights)
				this.constraints.add(new SimpleTypeConstraint(node, cause, left, op, right));
		}


		
		public DisjunctiveTypeConstraint(ASTNode node, String cause, TypeConstraintVariable left, Operator op, TypeConstraintVariable... rights) {
			this(node, cause, left, op, Arrays.asList(rights));
		}


		
		public boolean solved() {
			for(TypeConstraint tc : constraints)
				if(tc.solved())
					return true;
			return false;
		}


		
		public String describe() {
			StringBuffer res = new StringBuffer();
			boolean first = true;
			for(TypeConstraint tc : constraints) {
				if(first) {
					first = false;
				} else {
					res.append(" or ");
				}
				res.append(tc.describe());
			}
			return res.toString();
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof DisjunctiveTypeConstraint))
				return false;
			DisjunctiveTypeConstraint that = (DisjunctiveTypeConstraint)o;
			return this.constraints.equals(that.constraints);
		}


		
		public int getNumAlternatives() {
			return constraints.size();
		}


		
		public Iterator<TypeConstraint> getSubconstraints() {
			return constraints.iterator();
		}

public boolean relevantForGeneralisation(TypeDecl C) {
		for(TypeConstraint constr : constraints)
			if(constr.relevantForGeneralisation(C))
				return true;
		return false;
	}

public boolean relevantForSubtree(ASTNode nd) {
		for(TypeConstraint constr : constraints)
			if(constr.relevantForSubtree(nd))
				return true;
		return false;		
	}

public void propagateGeneralisation(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		SimpleTypeConstraint constr = (SimpleTypeConstraint)constraints.iterator().next();
		if(update.contains(constr.getLeft())) {
			for(Iterator<TypeConstraint> iter=constraints.iterator();iter.hasNext();) {
				constr = (SimpleTypeConstraint)iter.next();
				if(newType.subtype(constr.getRight().getConstrainedType()))
					return;
			}
			throw new RefactoringException("cannot satisfy " + this);
		}
	}

public void propagateBackwards(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		SimpleTypeConstraint constr = (SimpleTypeConstraint)constraints.iterator().next();
		if(update.contains(constr.getLeft())) {
			for(Iterator<TypeConstraint> iter=constraints.iterator();iter.hasNext();) {
				constr = (SimpleTypeConstraint)iter.next();
				if(newType.subtype(constr.getRight().getConstrainedType()))
					return;
			}
			update.remove(constr.getLeft());
		}
	}


}
