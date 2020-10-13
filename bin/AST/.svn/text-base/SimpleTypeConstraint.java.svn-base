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
public class SimpleTypeConstraint extends TypeConstraint {

		private TypeConstraintVariable left, right;


		private Operator op;


		
		public SimpleTypeConstraint(ASTNode node, String cause, TypeConstraintVariable left, Operator op, TypeConstraintVariable right) {
			super(node, cause);
			this.left = left;
			this.op = op;
			this.right = right;
		}


		
		public boolean solved() {
			TypeDecl lefttp = left.getConstrainedType().refresh(),
			         righttp = right.getConstrainedType().refresh();
			return op.eval(lefttp, righttp);
		}


		
		public String describe() {
			return left.describeConstraintVariable() + " " + op + " " + right.describeConstraintVariable();
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof SimpleTypeConstraint))
				return false;
			SimpleTypeConstraint that = (SimpleTypeConstraint)o;
			return this.left.equals(that.left) && this.op == that.op && this.right.equals(that.right);
		}


		
		public TypeConstraintVariable getLeft() { return left; }


		public TypeConstraintVariable getRight() { return right; }

public boolean relevantForGeneralisation(TypeDecl C) {
		return left instanceof Expr && C.subtype(((Expr)left).type())
			|| right instanceof Expr && C.subtype(((Expr)right).type());
	}

public boolean relevantForSubtree(ASTNode nd) {
		return left instanceof Expr && ((Expr)left).isDescendantTo(nd)
		    || right instanceof Expr && ((Expr)right).isDescendantTo(nd)
			// constant constraints are always relevant
			|| left instanceof TypeDecl && right instanceof TypeDecl;
	}

public void propagateGeneralisation(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		if(op == Operator.EQ) {
			if(update.contains(left)) {
				addConstraintVar(update, right);
			} else if(update.contains(right)) {
				addConstraintVar(update, left);
			}
		} else if(op == Operator.LE) {
			if(update.contains(left) && !newType.subtype(right.getConstrainedType())) {
				if(!right.getConstrainedType().subtype(newType))
					throw new RefactoringException("cannot change to unrelated type");
				addConstraintVar(update, right);
			}
		} else if(op == Operator.LT) {
			if(update.contains(left))
				throw new RefactoringException("cannot propagate through constraint " + this);
		} else {
			throw new RefactoringException("cannot propagate through constraint " + this);
		}
	}

public void propagateBackwards(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		if(op == Operator.EQ) {
			if(!update.contains(left)) {
				update.remove(right);
			} else if(!update.contains(right)) {
				update.remove(left);
			}
		} else if(op == Operator.LE) {
			if(!update.contains(right) && !newType.subtype(right.getConstrainedType())) {
				update.remove(left);
			}
		} else if(op == Operator.LT) {
			if(!update.contains(right))
				update.remove(left);
		} else {
			throw new RefactoringException("cannot propagate through constraint " + this);
		}
	}


}
