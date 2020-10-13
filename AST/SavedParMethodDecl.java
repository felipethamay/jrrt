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
public class SavedParMethodDecl extends SavedMethodDecl {

		private ArrayList<TypeDecl> parms;


		public SavedParMethodDecl(ParMethodDecl pmd) {
			super(pmd.genericMethodDecl());
			parms = new ArrayList<TypeDecl>();
			for(Access acc : pmd.getTypeArguments())
				parms.add(acc.type());
		}


		
		public MethodDecl getDecl() {
			ArrayList<TypeDecl> parmtypes = new ArrayList<TypeDecl>();
			for(TypeDecl std : parms)
				parmtypes.add(std.refresh());
			return ((GenericMethodDecl)super.getDecl()).lookupParMethodDecl(parmtypes);
		}


}
