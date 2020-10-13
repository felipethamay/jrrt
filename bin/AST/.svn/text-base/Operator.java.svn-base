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
abstract class Operator extends java.lang.Object {

		String sym;


		
		protected Operator(String sym) {
			this.sym = sym;
		}


		
		public abstract <T> boolean eval(IAmPartiallyOrdered<T> left, T right);


		
		// convenience method for comparing integers
		public boolean eval(final int left, final int right) {
			return eval(new IAmPartiallyOrdered<Integer>() { 
				public boolean leq(Integer right) { return left <= right; }
				public boolean equals(Object o) { return new Integer(left).equals(o); }
			}, right);
		}


		
		public String toString() {
			return sym;
		}


	
	public static final Operator LT = new LTOperator();


	public static final Operator LE = new LEOperator();


	public static final Operator EQ = new EQOperator();


	public static final Operator NE = new NEOperator();

public void generateCreamConstraint(IntVariable left, IntVariable right) {
		new IntComparison(left.getNetwork(), getComparisonOperator(), left, right);
	}

protected int getComparisonOperator() { return -1; }


}
