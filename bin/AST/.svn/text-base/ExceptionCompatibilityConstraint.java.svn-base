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
public class ExceptionCompatibilityConstraint extends TypeConstraint {

		private MethodDecl sub, sup;


		
		public ExceptionCompatibilityConstraint(MethodDecl sub, MethodDecl sup) {
			super(sub, "compatible throws clauses");
			this.sub = sub;
			this.sup = sup;
		}


		
		public boolean solved() {
			for(Access acc : sub.getExceptions())
				if(!acc.type().isCheckedException() && !sup.throwsException(acc.type()))
					return false;
			return true;
		}


		
		public String describe() {
			return sub.fullName() + " cannot throw more exceptions than " + sup.fullName();
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof ExceptionCompatibilityConstraint))
				return false;
			ExceptionCompatibilityConstraint that = (ExceptionCompatibilityConstraint)o;
			return this.sub.equals(that.sub) && this.sup.equals(that.sup);
		}

public boolean relevantForGeneralisation(TypeDecl C) {
		return false;
	}

public boolean relevantForSubtree(ASTNode nd) {
		return sub.getExceptionList().isDescendantTo(nd) || sup.getExceptionList().isDescendantTo(nd);
	}

public void propagateGeneralisation(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		if(!solved())
			throw new RefactoringException(describe());
	}

public void propagateBackwards(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		if(!solved())
			throw new RefactoringException(describe());
	}


}
