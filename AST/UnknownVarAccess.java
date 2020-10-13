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

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
  * @ast class
 * 
 */
public class UnknownVarAccess extends SymbolicFieldAccess {

		public UnknownVarAccess(FieldDeclaration unknownField) {
			super(unknownField);
		}


		
		public UnknownVarAccess moveDownTo(TypeDecl td) { return this; }


		public UnknownVarAccess moveInto(Scope s) { return this; }


		public UnknownVarAccess ensureStatic() { return this; }


		public UnknownVarAccess ensureFinal() { return this; }


		public UnknownVarAccess ensureAccessible(Expr e) { return this; }


		
		public boolean isUnknownVarAccess() { return true; }

		public Access accessByModifyingAccess(VarAccess originalAccess) {
		  if (ConditionsPushDownField.cond3 && ConditionsJRRTInputs.ConditionsPullUpMethod.cond8.isEnabled()) {
			throw new RefactoringException("cannot access variable");
		  } else {
			return null;
		  }
		}


}
