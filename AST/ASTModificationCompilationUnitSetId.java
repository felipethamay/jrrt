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
public abstract class ASTModificationCompilationUnitSetId extends ASTModification {

		boolean isInTree;


		ASTNode node;


		ASTModificationCompilationUnitSetId(boolean isInTree, ASTNode node, String oldValue, String newValue, String oldPathName, String newPathName) {
			this.isInTree = isInTree;
			this.node = node;
			this.oldValue = oldValue;
			this.newValue = newValue;
			this.newPathName = newPathName;
			this.oldPathName = oldPathName;
		}


		public String newValue;


		public String oldValue;


		public String newPathName;


		public String oldPathName;


}
