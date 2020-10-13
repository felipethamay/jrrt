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
public class MaxAccessibility extends AccessibilityConstraintVariable {

		private AccessibilityConstraintVariable left, right;


		
		public MaxAccessibility(AccessibilityConstraintVariable left, AccessibilityConstraintVariable right) {
			this.left = left;
			this.right = right;
		}


		
		public MaxAccessibility(int left, Visible right) {
			this(AccessModifierConstant.fromVisibility(left), new AccessModifierVariable(right));
		}


		
		public int getAccessModifier() {
			return Math.max(left.getAccessModifier(), right.getAccessModifier());
		}


		
		public Collection<Visible> referencedVisibles() {
			Collection<Visible> res = new HashSet<Visible>();
			res.addAll(left.referencedVisibles());
			res.addAll(right.referencedVisibles());
			return res;
		}


		
		public void referencedBy(AccessibilityConstraint constraint) {
			left.referencedBy(constraint);
			right.referencedBy(constraint);
		}


		
		public String toString() {
			return "max(" + left.toString() + ", " + right.toString() + ")";
		}


	
	private IntVariable creamVariable = null;

public IntVariable creamVariable(Network network) {
		if(creamVariable == null)
			creamVariable = new IntVariable(network, ASTNode.VIS_PRIVATE, ASTNode.VIS_PUBLIC, toString());
		return creamVariable;
	}

public void generateCreamConstraint(Network network) {
		new IntArith(network, IntArith.MAX, this.creamVariable(network), left.creamVariable(network), right.creamVariable(network));
	}


}
