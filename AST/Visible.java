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
  * @ast interface
 * 
 */
public interface Visible {

		 
		public boolean isPrivate();

		 
		public boolean isProtected();

		 
		public boolean isPublic();

		 
		public Modifiers getModifiers();

		 
		public boolean fromSource();

		 
		public Program programRoot();

		 
		public String name();
public int getVisibility();

public void setVisibility(int vis);

public void collectSourceVisibles(Collection<Visible> visibles);

public Collection<AccessibilityConstraint> referencingAccessibilityConstraints();

public void refined_AccessibilityConstraints_Visible_referencedBy(AccessibilityConstraint c);

public void changeAccessibility(int v);


	
	public boolean isAnonymousType();

  public void referencedBy(final AccessibilityConstraint c);

  /**
   * @attribute syn
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public IntVariable creamVariable(Network network);
}
