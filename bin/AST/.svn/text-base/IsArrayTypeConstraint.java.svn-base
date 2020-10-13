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
public class IsArrayTypeConstraint extends TypeConstraint {

		private TypeConstraintVariable var;


		
		public IsArrayTypeConstraint(ASTNode node, String cause, TypeConstraintVariable var) {
			super(node, cause);
			this.var = var;
		}


		
		public boolean solved() {
			return var.getConstrainedType().refresh().isArrayDecl();
		}


		
		public String describe() {
			return var.describeConstraintVariable() + " is array type";
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof IsArrayTypeConstraint))
				return false;
			return this.var.equals(((IsArrayTypeConstraint)o).var);
		}

public boolean relevantForGeneralisation(TypeDecl C) {
		return var instanceof Expr && C.subtype(((Expr)var).type());
	}

public boolean relevantForSubtree(ASTNode nd) {
		return var instanceof Expr && ((Expr)var).isDescendantTo(nd) || var instanceof TypeDecl;
	}

public void propagateGeneralisation(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		if(update.contains(var) && !newType.isArrayDecl())
			throw new RefactoringException(var + " has to be an array");
	}

public void propagateBackwards(TypeDecl newType, Collection<TypeConstraintVariable> update) {
		if(!newType.isArrayDecl())
			update.remove(var);
	}


}
