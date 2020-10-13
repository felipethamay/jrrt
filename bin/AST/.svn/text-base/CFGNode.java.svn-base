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
public interface CFGNode {
public SmallSet<CFGNode> pred();

public void dot();

public void lockControlFlow();

public void unlockControlFlow();

public void lockThrowEdges();

public void unlockThrowEdges();

public IdentityHashMap<DependencyEdge, SmallSet<CFGNode>> getDependencies();

public void lockDependencies(DependencyEdge... edges);

public void unlockDependencies(PreservationStrategy r);

public SmallSet<CFGNode> collectExceptionalSucc();

public boolean makesAvailable(ASTNode e);

public boolean makesUnavailable(ASTNode e);

  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> exceptionalSucc();
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:31
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> succ();
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  @SuppressWarnings({"unchecked", "cast"})
  public CFGNode first();
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:777
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Stmt> succStmt();
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:788
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Stmt> predStmt();
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotLabel();
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotNode();
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDef();
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> reachingDefinitionsFor(Location l);
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Access> reachedUsesFor(Location l);
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:159
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachingDefinitionBefore(Location l, CFGNode n);
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:199
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachedUseAfter(Location l, CFGNode n);
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAcquire();
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:14
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isRelease();
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isThreadManagementAction();
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:16
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isSyncAction();
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:17
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isMemoryAction();
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:36
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isFlowThrough();
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> weakSucc();
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(BackwardEdge be, CFGNode start);
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(ForwardEdge fe, CFGNode start);
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> precedingDefsUpTo(CFGNode n);
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:71
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAnticipated(VariableDeclaration v);
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean makesAnticipated(VariableDeclaration v);
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:84
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean killsAnticipated(VariableDeclaration v);
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:88
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAvailable(ASTNode e);
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:29
   */
  public SmallSet<CFGNode> following();
  /**
   * @apilevel internal
   */
  public java.util.Set CFGNode_collPred_contributors();
}
