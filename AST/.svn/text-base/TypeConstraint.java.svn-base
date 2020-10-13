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
public abstract class TypeConstraint extends java.lang.Object {

		// node giving rise to the constraint
		private ASTNode node;


		
		// further description of why the constraint was generated
		private String cause;


		
		public TypeConstraint(ASTNode node, String cause) {
			this.node = node;
			this.cause = cause;
		}


		
		public abstract boolean solved();


		public abstract String describe();


		
		public boolean fromSource() {
			return node.fromSource();
		}


		
		public String toString() {
			return cause + " at node " + node.toString() + ": " + describe(); 
		}

public abstract boolean relevantForGeneralisation(TypeDecl C);

public abstract boolean relevantForSubtree(ASTNode nd);

public abstract void propagateGeneralisation(TypeDecl newType, Collection<TypeConstraintVariable> update);

protected void addConstraintVar(Collection<TypeConstraintVariable> update, TypeConstraintVariable tcvar) {
		if(tcvar.isFixed())
			throw new RefactoringException("cannot satisfy constraint " + this);
		update.add(tcvar);
	}

public abstract void propagateBackwards(TypeDecl newType, Collection<TypeConstraintVariable> update);


}
