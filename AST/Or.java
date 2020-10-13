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
import tests.jdolly.ConditionsPushDownField;
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
public class Or extends java.lang.Object {

		public static void or(Refactoring... refactorings) {
			for (int i = 0; i < refactorings.length; i++) {
				ASTUndoCheckPoint checkPoint = Program.createASTUndoCheckPoint();
				try {
					refactorings[i].refactor();
				} catch (RefactoringException re) {
					Program.undoUntil(checkPoint);
					continue;
				}
				return;
			}
//			if (ConditionsPushDownMethod.cond3) {
				throw new RefactoringException("Or of refactorings: no refactoring succeeded");
//			}
		}


		

		interface Refactoring {
			void refactor() throws RefactoringException;
		}


		
		public final static Refactoring ID = new Refactoring() {
			public void refactor() throws RefactoringException {
				// ID();
			}
		};


}
