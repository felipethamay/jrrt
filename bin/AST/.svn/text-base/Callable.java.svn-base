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
public interface Callable extends Parameterisable, Scope {
 
		  
		public void setParameter(ParameterDeclaration pd, int i);

		 
		public List<ParameterDeclaration> getParameterList();

		 
		public List<Access> getExceptionList();

		 
		public boolean isStatic();

		 
		public boolean isNative();

		 
		public boolean hasBlock();

		 
		public Block getBlock();

		 
		public void setBlock(Block b);

		 
		public String signature();

		 
		public boolean fromSource();
public String fullName();

public void setParameter(String name, ParameterDeclaration pd);

public void insertParameter(ParameterDeclaration pd, int i);

public void removeParameter(int i);

public int getIndexOfParameter(ParameterDeclaration pd);

public ParameterDeclaration getParameter(String name);

  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:56
   */
  @SuppressWarnings({"unchecked", "cast"})
  public int getIndexOfParameter(String name);
  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:91
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean throwsSameExceptionsAs(Callable that);
  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:100
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean throwsExactException(TypeDecl exnType);
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:24
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasVariable(String name);
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:224
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessParameter(Variable decl);
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:121
   */
  public UnknownVarAccess unknownVarAccess();
}
