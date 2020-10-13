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
public interface BranchPropagation {
public void collectBranches(Collection c);

public Stmt branchTarget(Stmt branchStmt);

public void collectFinally(Stmt branchStmt, ArrayList list);

  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:32
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection targetContinues();
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:33
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection targetBreaks();
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:34
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection targetBranches();
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:35
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection escapedBranches();
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:36
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection branches();
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:39
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean targetOf(ContinueStmt stmt);
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:40
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean targetOf(BreakStmt stmt);
}
