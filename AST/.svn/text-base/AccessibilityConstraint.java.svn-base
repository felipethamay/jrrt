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
public class AccessibilityConstraint extends java.lang.Object {

		// the node which gives rise to this constraint
		private ASTNode node;


		
		// the two sides of the constraint and the operator connecting them
		private AccessibilityConstraintVariable left, right;


		private Operator op;


		
		public AccessibilityConstraint(ASTNode node, AccessibilityConstraintVariable left, Operator op, AccessibilityConstraintVariable right) {
			this.node = node;
			this.left = left;
			this.op = op;
			this.right = right;
			left.referencedBy(this);
			right.referencedBy(this);
		}


		
		// several convenience constructors
		public AccessibilityConstraint(ASTNode node, int left, Visible right) {
			this(node, AccessModifierConstant.fromVisibility(left), Operator.LE, AccessModifierVariable.forVisible(right));
		}


		
		public AccessibilityConstraint(ASTNode node, Visible left, Operator op, int right) {
			this(node, AccessModifierVariable.forVisible(left), op, AccessModifierConstant.fromVisibility(right));
		}


		
		public AccessibilityConstraint(ASTNode node, int left, Operator op, Visible right) {
			this(node, AccessModifierConstant.fromVisibility(left), op, AccessModifierVariable.forVisible(right));
		}


		
		public AccessibilityConstraint(ASTNode node, Visible left, Operator op, AccessibilityConstraintVariable right) {
			this(node, AccessModifierVariable.forVisible(left), op, right);
		}


		
		public AccessibilityConstraint(ASTNode node, Visible left, Operator op, Visible right) {
			this(node, AccessModifierVariable.forVisible(left), op, AccessModifierVariable.forVisible(right));
		}


		
		// assorted setters and getters
		public boolean fromSource() {
			return node.fromSource();
		}


		
		public ASTNode getNode() {
			return node;
		}


		
		public AccessibilityConstraintVariable getLeft() {
			return left;
		}


		
		public AccessibilityConstraintVariable getRight() {
			return right;
		}


		
		public boolean isSolved() {
			return op.eval(left.getAccessModifier(), right.getAccessModifier());
		}


		
		public String toString() {
			return toString(node) + ": " + left + " " + op + " " + right;
		}


		
		public Collection<Visible> referencedVisibles() {
			LinkedList<Visible> res = new LinkedList<Visible>();
			res.addAll(left.referencedVisibles());
			res.addAll(right.referencedVisibles());
			return res;
		}



		// special-purpose pretty printing method for AST nodes that occur in constraints
		public static String toString(ASTNode nd) {
			if(nd instanceof TypeDecl)
				return ((TypeDecl)nd).fullName();
			if(nd instanceof MethodDecl)
				return ((MethodDecl)nd).fullName();
			return nd.toString();
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof AccessibilityConstraint))
				return false;
			AccessibilityConstraint that = (AccessibilityConstraint)o;
			return this.left.equals(that.left) && this.right.equals(that.right) && this.op.equals(that.op);
		}

public void generateCreamConstraint(Network network) {
		left.generateCreamConstraint(network);
		right.generateCreamConstraint(network);
		op.generateCreamConstraint(left.creamVariable(network), right.creamVariable(network));
	}


}
