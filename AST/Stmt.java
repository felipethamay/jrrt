/* This file was generated with JastAdd2 (http://jastadd.org) version R20130212 (r1031) */
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
 * @production Stmt : {@link ASTNode};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:195
 */
public abstract class Stmt extends ASTNode<ASTNode> implements Cloneable, CFGNode {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    canCompleteNormally_computed = false;
    exceptionalSucc_computed = false;
    exceptionalSucc_value = null;
    succ_computed = false;
    succ_value = null;
    dotLabel_computed = false;
    dotLabel_value = null;
    dotNode_computed = false;
    dotNode_value = null;
    reachingDefinitionsFor_Location_values = null;
    reachedUsesFor_Location_values = null;
    hasReachingDefinitionBefore_Location_CFGNode_values = null;
    hasReachedUseAfter_Location_CFGNode_values = null;
    weakSucc_computed = false;
    weakSucc_value = null;
    collect_BackwardEdge_CFGNode_values = null;
    collect_ForwardEdge_CFGNode_values = null;
    precedingDefsUpTo_CFGNode_values = null;
    isAnticipated_VariableDeclaration_values = null;
    makesAnticipated_VariableDeclaration_values = null;
    killsAnticipated_VariableDeclaration_values = null;
    isAvailable_ASTNode_values = null;
    uncheckedExnTarget_computed = false;
    uncheckedExnTarget_value = null;
    following_computed = false;
    following_value = null;
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt clone() throws CloneNotSupportedException {
    Stmt node = (Stmt)super.clone();
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.canCompleteNormally_computed = false;
    node.exceptionalSucc_computed = false;
    node.exceptionalSucc_value = null;
    node.succ_computed = false;
    node.succ_value = null;
    node.dotLabel_computed = false;
    node.dotLabel_value = null;
    node.dotNode_computed = false;
    node.dotNode_value = null;
    node.reachingDefinitionsFor_Location_values = null;
    node.reachedUsesFor_Location_values = null;
    node.hasReachingDefinitionBefore_Location_CFGNode_values = null;
    node.hasReachedUseAfter_Location_CFGNode_values = null;
    node.weakSucc_computed = false;
    node.weakSucc_value = null;
    node.collect_BackwardEdge_CFGNode_values = null;
    node.collect_ForwardEdge_CFGNode_values = null;
    node.precedingDefsUpTo_CFGNode_values = null;
    node.isAnticipated_VariableDeclaration_values = null;
    node.makesAnticipated_VariableDeclaration_values = null;
    node.killsAnticipated_VariableDeclaration_values = null;
    node.isAvailable_ASTNode_values = null;
    node.uncheckedExnTarget_computed = false;
    node.uncheckedExnTarget_value = null;
    node.following_computed = false;
    node.following_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:14
   */
  void checkUnreachableStmt() {
    if(!reachable() && reportUnreachable())
      error("statement is unreachable");
  }
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:57
   */
  public boolean isInBlock() {
		return getParent() != null && getParent().getParent() instanceof Block;
	}
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:18
   */
  public Block enclosingBlock() {
		ASTNode n = this;
		while(n!=null && !(n instanceof Block))
			n = n.getParent();
		return (Block)n;
	}
  /**
   * @ast method 
   * @aspect InsertUnusedType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/InsertUnusedType.jrag:34
   */
  public LocalClassDeclStmt insertLocalClass(ClassDecl cd) {
		LocalClassDeclStmt lcd = new LocalClassDeclStmt(cd);
		insertStmtBefore(lcd);
		cd.checkEnclosingTypeNames(hostType());
		hostBodyDecl().flushCaches();
		return lcd;
	}
  /**
   * @ast method 
   * @aspect InsertUnusedLocal
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/IntroduceUnusedLocal.jrag:3
   */
  public VariableDeclaration insertUnusedLocal(VariableDeclaration decl) {
		Block block = this.enclosingBlock();
		if(block == null)
			throw new RefactoringException("local variable cannot be created outside block");
		// ensure that output compiles
		if(!canIntroduceLocal(decl.name()))
			throw new RefactoringException("local variable of same name exists");
		// ensure that bindings are preserved
		block.lockNames(Collections.singleton(decl.name()));
		insertStmtBefore(decl);
		block.hostType().flushCaches();
		return decl;
	}
  /**
   * @ast method 
   * @aspect PullStatementFromBlock
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/PullStatementFromBlock.jrag:2
   */
  public void pullFromBlock() {
		if (!(getParent().getParent() instanceof Block))
			throw new RefactoringException("block we're pulling statement from is not inside a block");
		Block block = (Block)getParent().getParent();
		Block outer_block = (Block)block.getParent().getParent();
		int idx = outer_block.getIndexOfStmt(block);
		block.removeStmt(this);
		outer_block.insertStmt(idx, this);
		hostType().flushCaches();
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:39
   */
  public boolean hasNestingLocal(String name) {
		for(Iterator<Variable> iter=lookupVariable(name).iterator(); iter.hasNext();) {
			Variable v = iter.next();
			if(v instanceof LocalDeclaration && ((LocalDeclaration)v).enclosingBodyDecl() == enclosingBodyDecl())
				return true;
		}
		return false;
	}
  /**
   * @ast method 
   * @aspect InsertEmptyStmt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:5
   */
  public EmptyStmt insertEmptyStmtBefore() {
		return (EmptyStmt)insertStmtBefore(new EmptyStmt());
	}
  /**
   * @ast method 
   * @aspect InsertEmptyStmt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:9
   */
  public EmptyStmt insertEmptyStmtAfter() {
		return (EmptyStmt)insertStmtAfter(new EmptyStmt());
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:335
   */
  public Stmt findStmtFollowing(int line) {
		int l = ASTNode.getLine(getStart());
		if(l == line || l == line+1)
			return this;
		return super.findStmtFollowing(line);
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:351
   */
  public Stmt findStmtPreceding(int line) {
		int l = ASTNode.getLine(getEnd());
		if(l == line || l == line-1)
			return this;
		return super.findStmtPreceding(line);
	}
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:50
   */
  public SmallSet<CFGNode> pred() { return collPred(); }
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:66
   */
  public void dot() {
		String thisName = String.valueOf(hashCode());
		for(CFGNode that : succ())
			System.out.println("\t" + this.dotNode() + " -> " + that.dotNode() + ";");
		super.dot();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:14
   */
  public void lockControlFlow() {
		if(lockedSucc == null)
			lockedSucc = weakSucc();
		super.lockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:20
   */
  public void unlockControlFlow() {
		if(lockedSucc != null) {
			if(!lockedSucc.equals(weakSucc()))
				throw new RefactoringException("control flow successors not preserved");
			lockedSucc = null;
		}
		super.unlockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:69
   */
  public void lockThrowEdges() {
		if(lockedThrowEdges == null) {
			SmallSet<CFGNode> throwEdges = exceptionalSucc();
			if(!throwEdges.isEmpty())
				lockedThrowEdges = throwEdges;
		}
		super.lockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:78
   */
  public void unlockThrowEdges() {
		if(lockedThrowEdges != null) {
			if(!exceptionalSucc().equals(lockedThrowEdges))
				throw new RefactoringException("throw edges have changed");
			lockedThrowEdges = null;
		}
		super.unlockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:86
   */
  public IdentityHashMap<DependencyEdge, SmallSet<CFGNode>> getDependencies() {
		if(dependencies == null)
			dependencies = new IdentityHashMap<DependencyEdge, SmallSet<CFGNode>>();
		return dependencies;
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:100
   */
  public void lockDependencies(DependencyEdge... edges) {
		for(DependencyEdge e : edges)
			if(e.isStart(this))
				getDependencies().put(e, e.collect(this));
		super.lockDependencies(edges);
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:115
   */
  public void unlockDependencies(PreservationStrategy r) {
		DependencyEdge e = r.getEdge();
		if(e.isStart(this)) {
			SmallSet<CFGNode> old_edges = getDependencies().get(e);
			if(old_edges != null) {
				SmallSet<CFGNode> new_edges = e.collect(this);
				if(r.preserve(this) && !old_edges.subsetOf(new_edges))
					throw new RefactoringException("couldn't preserve edge: "+e);
				if(r.reflect(this) && !new_edges.subsetOf(old_edges))
					throw new RefactoringException("couldn't reflect edge: "+e);
			}
		}
		super.unlockDependencies(r);
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:54
   */
  public SmallSet<CFGNode> collectExceptionalSucc() {
		return exceptionalSucc().union(super.collectExceptionalSucc());
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:99
   */
  public boolean makesAvailable(ASTNode e) {
		return this == e;
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:103
   */
  public boolean makesUnavailable(ASTNode e) {
		for(Location l : (Collection<Location>)e.locationsRead())
			if(isReachingDefinitionFor(l))
				return true;
		return false;
	}
  /**
   * @ast method 
   * 
   */
  public Stmt() {
    super();


  }
  /**
   * Initializes the child array to the correct size.
   * Initializes List and Opt nta children.
   * @apilevel internal
   * @ast method
   * @ast method 
   * 
   */
  public void init$Children() {
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 0;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:325
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAafter(Variable v) {
    Object _parameters = v;
    if(isDAafter_Variable_values == null) isDAafter_Variable_values = new java.util.HashMap(4);
    if(isDAafter_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDAafter_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDAafter_Variable_value = isDAafter_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDAafter_Variable_values.put(_parameters, Boolean.valueOf(isDAafter_Variable_value));
    return isDAafter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDAafter_compute(Variable v) {  return isDAbefore(v);  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:777
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUafter(Variable v) {
    Object _parameters = v;
    if(isDUafter_Variable_values == null) isDUafter_Variable_values = new java.util.HashMap(4);
    if(isDUafter_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDUafter_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDUafter_Variable_value = isDUafter_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDUafter_Variable_values.put(_parameters, Boolean.valueOf(isDUafter_Variable_value));
    return isDUafter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDUafter_compute(Variable v) {
    throw new Error("isDUafter in " + getClass().getName());
  }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:129
   */
  public boolean declaresVariable(String name) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:401
   */
  public boolean continueLabel() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:758
   */
  public boolean addsIndentationLevel() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_value;
  /**
   * @attribute syn
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean canCompleteNormally() {
    if(canCompleteNormally_computed) {
      return canCompleteNormally_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    canCompleteNormally_value = canCompleteNormally_compute();
      if(isFinal && num == state().boundariesCrossed) canCompleteNormally_computed = true;
    return canCompleteNormally_value;
  }
  /**
   * @apilevel internal
   */
  private boolean canCompleteNormally_compute() {  return true;  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:768
   */
  public CFGNode targetForContinue() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:86
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:87
   */
  public boolean isBlockingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:88
   */
  public boolean isReachedUseFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean exceptionalSucc_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> exceptionalSucc_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> exceptionalSucc() {
    if(exceptionalSucc_computed) {
      return exceptionalSucc_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    exceptionalSucc_value = exceptionalSucc_compute();
      if(isFinal && num == state().boundariesCrossed) exceptionalSucc_computed = true;
    return exceptionalSucc_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> exceptionalSucc_compute() {  return SmallSet.<CFGNode>empty();  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean succ_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> succ_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:57
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> succ() {
    if(succ_computed) {
      return succ_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    succ_value = succ_compute();
      if(isFinal && num == state().boundariesCrossed) succ_computed = true;
    return succ_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> succ_compute() {  return following().union(exceptionalSucc());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:777
   */
  public SmallSet<Stmt> succStmt() {
    ASTNode$State state = state();
    try {
		SmallSet<Stmt> res = new SmallSet<Stmt>();
		for(CFGNode n : succ()) {
			if(n instanceof Stmt)
				res = res.union((Stmt)n);
			else
				res = res.union(n.succStmt());
		}
		return res;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:788
   */
  public SmallSet<Stmt> predStmt() {
    ASTNode$State state = state();
    try {
		SmallSet<Stmt> res = new SmallSet<Stmt>();
		for(CFGNode n : pred()) {
			if(n instanceof Stmt)
				res = res.union((Stmt)n);
			else
				res = res.union(n.predStmt());
		}
		return res;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean dotLabel_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotLabel_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotLabel() {
    if(dotLabel_computed) {
      return dotLabel_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotLabel_value = dotLabel_compute();
      if(isFinal && num == state().boundariesCrossed) dotLabel_computed = true;
    return dotLabel_value;
  }
  /**
   * @apilevel internal
   */
  private String dotLabel_compute() {
		String label = toString();
		label = label.replace('"', '\'').replace('\n', ' ');
		if(label.length() > 20)
			label = label.substring(0, 10) + label.substring(label.length()-10, label.length());
		return label;
	}
  /**
   * @apilevel internal
   */
  protected boolean dotNode_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotNode_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotNode() {
    if(dotNode_computed) {
      return dotNode_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotNode_value = dotNode_compute();
      if(isFinal && num == state().boundariesCrossed) dotNode_computed = true;
    return dotNode_value;
  }
  /**
   * @apilevel internal
   */
  private String dotNode_compute() {
		String n = String.valueOf(hashCode());
		String label = dotLabel();
		System.out.println("\t" + n + "[label=\"" + label + "\"];");
		return n;
	}
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:2
   */
  public boolean isDef() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  protected java.util.Map reachingDefinitionsFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> reachingDefinitionsFor(Location l) {
    Object _parameters = l;
    if(reachingDefinitionsFor_Location_values == null) reachingDefinitionsFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachingDefinitionsFor_Location_values.containsKey(_parameters)) {
      Object _o = reachingDefinitionsFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachingDefinitionsFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
        if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachingDefinitionsFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachingDefinitionsFor_Location_values.put(_parameters, new_reachingDefinitionsFor_Location_value);
      }
      else {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachingDefinitionsFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachingDefinitionsFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
      if (state.RESET_CYCLE) {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      }
      else if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachingDefinitionsFor_Location_value;
      }
      return new_reachingDefinitionsFor_Location_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> reachingDefinitionsFor_compute(Location l) {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		if(isReachingDefinitionFor(l)) {
			res = SmallSet.singleton((CFGNode)this);
			if(isBlockingDefinitionFor(l))
				return res;
		}
		for(CFGNode p : pred())
			res = res.union(p.reachingDefinitionsFor(l));
		return res;
	}
  protected java.util.Map reachedUsesFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Access> reachedUsesFor(Location l) {
    Object _parameters = l;
    if(reachedUsesFor_Location_values == null) reachedUsesFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachedUsesFor_Location_values.containsKey(_parameters)) {
      Object _o = reachedUsesFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<Access>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachedUsesFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<Access> new_reachedUsesFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachedUsesFor_Location_value = reachedUsesFor_compute(l);
        if ((new_reachedUsesFor_Location_value==null && (SmallSet<Access>)_value.value!=null) || (new_reachedUsesFor_Location_value!=null && !new_reachedUsesFor_Location_value.equals((SmallSet<Access>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachedUsesFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachedUsesFor_Location_values.put(_parameters, new_reachedUsesFor_Location_value);
      }
      else {
        reachedUsesFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachedUsesFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachedUsesFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<Access> new_reachedUsesFor_Location_value = reachedUsesFor_compute(l);
      if (state.RESET_CYCLE) {
        reachedUsesFor_Location_values.remove(_parameters);
      }
      else if ((new_reachedUsesFor_Location_value==null && (SmallSet<Access>)_value.value!=null) || (new_reachedUsesFor_Location_value!=null && !new_reachedUsesFor_Location_value.equals((SmallSet<Access>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachedUsesFor_Location_value;
      }
      return new_reachedUsesFor_Location_value;
    }
    return (SmallSet<Access>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<Access> reachedUsesFor_compute(Location l) {
		SmallSet<Access> res = SmallSet.<Access>empty();
		if(isBlockingDefinitionFor(l))
			return res;
		for(CFGNode s : succ())
			res = res.union(s.reachedUsesFor(l));
		return res;
	}
  protected java.util.Map hasReachingDefinitionBefore_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:159
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachingDefinitionBefore(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachingDefinitionBefore_Location_CFGNode_values == null) hasReachingDefinitionBefore_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachingDefinitionBefore_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachingDefinitionBefore_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
        if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachingDefinitionBefore_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, new_hasReachingDefinitionBefore_Location_CFGNode_value);
      }
      else {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachingDefinitionBefore_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachingDefinitionBefore_Location_CFGNode_value;
      }
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachingDefinitionBefore_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachingDefinitionsFor(l).isEmpty();
		if(isBlockingDefinitionFor(l))
			return false;
		for(CFGNode pred : pred())
			if(pred.hasReachingDefinitionBefore(l, n))
				return true;
		return false;
	}
  protected java.util.Map hasReachedUseAfter_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:199
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachedUseAfter(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachedUseAfter_Location_CFGNode_values == null) hasReachedUseAfter_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachedUseAfter_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachedUseAfter_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachedUseAfter_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachedUseAfter_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachedUseAfter_Location_CFGNode_value = hasReachedUseAfter_compute(l, n);
        if (new_hasReachedUseAfter_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachedUseAfter_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachedUseAfter_Location_CFGNode_values.put(_parameters, new_hasReachedUseAfter_Location_CFGNode_value);
      }
      else {
        hasReachedUseAfter_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachedUseAfter_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachedUseAfter_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachedUseAfter_Location_CFGNode_value = hasReachedUseAfter_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachedUseAfter_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachedUseAfter_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachedUseAfter_Location_CFGNode_value;
      }
      return new_hasReachedUseAfter_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachedUseAfter_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachedUsesFor(l).isEmpty();
		if(isBlockingDefinitionFor(l))
			return false;
		for(CFGNode succ : succ())
			if(succ.hasReachedUseAfter(l, n))
				return true;
		return false;
	}
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:13
   */
  public boolean isAcquire() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:14
   */
  public boolean isRelease() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:15
   */
  public boolean isThreadManagementAction() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:16
   */
  public boolean isSyncAction() {
    ASTNode$State state = state();
    try {  return isAcquire() || isRelease() || isThreadManagementAction();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:17
   */
  public boolean isMemoryAction() {
    ASTNode$State state = state();
    try {  return isSyncAction();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:36
   */
  public boolean isFlowThrough() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean weakSucc_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> weakSucc_value;
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> weakSucc() {
    if(weakSucc_computed) {
      return weakSucc_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    weakSucc_value = weakSucc_compute();
      if(isFinal && num == state().boundariesCrossed) weakSucc_computed = true;
    return weakSucc_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> weakSucc_compute() {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		for(CFGNode s : succ())
			if(s.isFlowThrough())
				res = res.union(s.weakSucc());
			else
				res = res.union(s);
		return res;
	}
  protected java.util.Map collect_BackwardEdge_CFGNode_values;
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(BackwardEdge be, CFGNode start) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(be);
    _parameters.add(start);
    if(collect_BackwardEdge_CFGNode_values == null) collect_BackwardEdge_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(collect_BackwardEdge_CFGNode_values.containsKey(_parameters)) {
      Object _o = collect_BackwardEdge_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      collect_BackwardEdge_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode> empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_collect_BackwardEdge_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_collect_BackwardEdge_CFGNode_value = collect_compute(be, start);
        if ((new_collect_BackwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_BackwardEdge_CFGNode_value!=null && !new_collect_BackwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_collect_BackwardEdge_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        collect_BackwardEdge_CFGNode_values.put(_parameters, new_collect_BackwardEdge_CFGNode_value);
      }
      else {
        collect_BackwardEdge_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      collect_compute(be, start);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_collect_BackwardEdge_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_collect_BackwardEdge_CFGNode_value = collect_compute(be, start);
      if (state.RESET_CYCLE) {
        collect_BackwardEdge_CFGNode_values.remove(_parameters);
      }
      else if ((new_collect_BackwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_BackwardEdge_CFGNode_value!=null && !new_collect_BackwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_collect_BackwardEdge_CFGNode_value;
      }
      return new_collect_BackwardEdge_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collect_compute(BackwardEdge be, CFGNode start) {
		SmallSet<CFGNode> res = be.isTarget(start, this) ? SmallSet.singleton((CFGNode)this)
													  : SmallSet.<CFGNode>empty();
		if(be.terminates(start, this))
			return res;
		for(CFGNode p : pred())
			res = res.union(p.collect(be, start));
		return res;
	}
  protected java.util.Map collect_ForwardEdge_CFGNode_values;
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(ForwardEdge fe, CFGNode start) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(fe);
    _parameters.add(start);
    if(collect_ForwardEdge_CFGNode_values == null) collect_ForwardEdge_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(collect_ForwardEdge_CFGNode_values.containsKey(_parameters)) {
      Object _o = collect_ForwardEdge_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      collect_ForwardEdge_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode> empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_collect_ForwardEdge_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_collect_ForwardEdge_CFGNode_value = collect_compute(fe, start);
        if ((new_collect_ForwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_ForwardEdge_CFGNode_value!=null && !new_collect_ForwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_collect_ForwardEdge_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        collect_ForwardEdge_CFGNode_values.put(_parameters, new_collect_ForwardEdge_CFGNode_value);
      }
      else {
        collect_ForwardEdge_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      collect_compute(fe, start);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_collect_ForwardEdge_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_collect_ForwardEdge_CFGNode_value = collect_compute(fe, start);
      if (state.RESET_CYCLE) {
        collect_ForwardEdge_CFGNode_values.remove(_parameters);
      }
      else if ((new_collect_ForwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_ForwardEdge_CFGNode_value!=null && !new_collect_ForwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_collect_ForwardEdge_CFGNode_value;
      }
      return new_collect_ForwardEdge_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collect_compute(ForwardEdge fe, CFGNode start) {
		SmallSet<CFGNode> res = fe.isTarget(start, this) ? SmallSet.singleton((CFGNode)this)
												  	  : SmallSet.<CFGNode>empty();
		if(fe.terminates(start, this))
			return res;
		for(CFGNode p : succ())
			res = res.union(p.collect(fe, start));
		return res;
	}
  protected java.util.Map precedingDefsUpTo_CFGNode_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> precedingDefsUpTo(CFGNode n) {
    Object _parameters = n;
    if(precedingDefsUpTo_CFGNode_values == null) precedingDefsUpTo_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(precedingDefsUpTo_CFGNode_values.containsKey(_parameters)) {
      Object _o = precedingDefsUpTo_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      precedingDefsUpTo_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_precedingDefsUpTo_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_precedingDefsUpTo_CFGNode_value = precedingDefsUpTo_compute(n);
        if ((new_precedingDefsUpTo_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_precedingDefsUpTo_CFGNode_value!=null && !new_precedingDefsUpTo_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_precedingDefsUpTo_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        precedingDefsUpTo_CFGNode_values.put(_parameters, new_precedingDefsUpTo_CFGNode_value);
      }
      else {
        precedingDefsUpTo_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      precedingDefsUpTo_compute(n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_precedingDefsUpTo_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_precedingDefsUpTo_CFGNode_value = precedingDefsUpTo_compute(n);
      if (state.RESET_CYCLE) {
        precedingDefsUpTo_CFGNode_values.remove(_parameters);
      }
      else if ((new_precedingDefsUpTo_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_precedingDefsUpTo_CFGNode_value!=null && !new_precedingDefsUpTo_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_precedingDefsUpTo_CFGNode_value;
      }
      return new_precedingDefsUpTo_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> precedingDefsUpTo_compute(CFGNode n) {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		if(this == n)
			return res;
		if(isDef())
			res = SmallSet.singleton((CFGNode)this);
		for(CFGNode p : pred())
			res = res.union(p.precedingDefsUpTo(n));
		return res;
	}
  protected java.util.Map isAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:71
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(isAnticipated_VariableDeclaration_values == null) isAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      Object _o = isAnticipated_VariableDeclaration_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isAnticipated_VariableDeclaration_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isAnticipated_VariableDeclaration_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isAnticipated_VariableDeclaration_value = isAnticipated_compute(v);
        if (new_isAnticipated_VariableDeclaration_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isAnticipated_VariableDeclaration_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isAnticipated_VariableDeclaration_values.put(_parameters, new_isAnticipated_VariableDeclaration_value);
      }
      else {
        isAnticipated_VariableDeclaration_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isAnticipated_compute(v);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isAnticipated_VariableDeclaration_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isAnticipated_VariableDeclaration_value = isAnticipated_compute(v);
      if (state.RESET_CYCLE) {
        isAnticipated_VariableDeclaration_values.remove(_parameters);
      }
      else if (new_isAnticipated_VariableDeclaration_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isAnticipated_VariableDeclaration_value;
      }
      return new_isAnticipated_VariableDeclaration_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isAnticipated_compute(VariableDeclaration v) {
		if(makesAnticipated(v))
			return true;
		for(CFGNode s : succ())
			if(!s.isAnticipated(v))
				return false;
		return !killsAnticipated(v);
	}
  protected java.util.Map makesAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean makesAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(makesAnticipated_VariableDeclaration_values == null) makesAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    if(makesAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)makesAnticipated_VariableDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean makesAnticipated_VariableDeclaration_value = makesAnticipated_compute(v);
      if(isFinal && num == state().boundariesCrossed) makesAnticipated_VariableDeclaration_values.put(_parameters, Boolean.valueOf(makesAnticipated_VariableDeclaration_value));
    return makesAnticipated_VariableDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean makesAnticipated_compute(VariableDeclaration v) {  return false;  }
  protected java.util.Map killsAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:84
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean killsAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(killsAnticipated_VariableDeclaration_values == null) killsAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    if(killsAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)killsAnticipated_VariableDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean killsAnticipated_VariableDeclaration_value = killsAnticipated_compute(v);
      if(isFinal && num == state().boundariesCrossed) killsAnticipated_VariableDeclaration_values.put(_parameters, Boolean.valueOf(killsAnticipated_VariableDeclaration_value));
    return killsAnticipated_VariableDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean killsAnticipated_compute(VariableDeclaration v) {  return false;  }
  protected java.util.Map isAvailable_ASTNode_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:88
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAvailable(ASTNode e) {
    Object _parameters = e;
    if(isAvailable_ASTNode_values == null) isAvailable_ASTNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isAvailable_ASTNode_values.containsKey(_parameters)) {
      Object _o = isAvailable_ASTNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isAvailable_ASTNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isAvailable_ASTNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isAvailable_ASTNode_value = isAvailable_compute(e);
        if (new_isAvailable_ASTNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isAvailable_ASTNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isAvailable_ASTNode_values.put(_parameters, new_isAvailable_ASTNode_value);
      }
      else {
        isAvailable_ASTNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isAvailable_compute(e);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isAvailable_ASTNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isAvailable_ASTNode_value = isAvailable_compute(e);
      if (state.RESET_CYCLE) {
        isAvailable_ASTNode_values.remove(_parameters);
      }
      else if (new_isAvailable_ASTNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isAvailable_ASTNode_value;
      }
      return new_isAvailable_ASTNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isAvailable_compute(ASTNode e) {
		if(makesAvailable(e))
			return true;
		if(makesUnavailable(e))
			return false;
		for(CFGNode p : pred())
			if(!p.isAvailable(e))
				return false;
		return true;
	}
  /**
   * @attribute inh
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:232
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAbefore(Variable v) {
    ASTNode$State state = state();
    boolean isDAbefore_Variable_value = getParent().Define_boolean_isDAbefore(this, null, v);
    return isDAbefore_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:691
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUbefore(Variable v) {
    ASTNode$State state = state();
    boolean isDUbefore_Variable_value = getParent().Define_boolean_isDUbefore(this, null, v);
    return isDUbefore_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:24
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection lookupMethod(String name) {
    ASTNode$State state = state();
    Collection lookupMethod_String_value = getParent().Define_Collection_lookupMethod(this, null, name);
    return lookupMethod_String_value;
  }
  /**
   * @attribute inh
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:96
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupType(String packageName, String typeName) {
    ASTNode$State state = state();
    TypeDecl lookupType_String_String_value = getParent().Define_TypeDecl_lookupType(this, null, packageName, typeName);
    return lookupType_String_String_value;
  }
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:262
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupType(String name) {
    ASTNode$State state = state();
    SimpleSet lookupType_String_value = getParent().Define_SimpleSet_lookupType(this, null, name);
    return lookupType_String_value;
  }
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:16
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    ASTNode$State state = state();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:511
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl enclosingBodyDecl() {
    ASTNode$State state = state();
    BodyDecl enclosingBodyDecl_value = getParent().Define_BodyDecl_enclosingBodyDecl(this, null);
    return enclosingBodyDecl_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:587
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl hostType() {
    ASTNode$State state = state();
    TypeDecl hostType_value = getParent().Define_TypeDecl_hostType(this, null);
    return hostType_value;
  }
  /**
   * @attribute inh
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:27
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean reachable() {
    ASTNode$State state = state();
    boolean reachable_value = getParent().Define_boolean_reachable(this, null);
    return reachable_value;
  }
  /**
   * @attribute inh
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:147
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean reportUnreachable() {
    ASTNode$State state = state();
    boolean reportUnreachable_value = getParent().Define_boolean_reportUnreachable(this, null);
    return reportUnreachable_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:662
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> breakTarget(BreakStmt stmt) {
    ASTNode$State state = state();
    SmallSet<CFGNode> breakTarget_BreakStmt_value = getParent().Define_SmallSet_CFGNode__breakTarget(this, null, stmt);
    return breakTarget_BreakStmt_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:663
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> continueTarget(ContinueStmt stmt) {
    ASTNode$State state = state();
    SmallSet<CFGNode> continueTarget_ContinueStmt_value = getParent().Define_SmallSet_CFGNode__continueTarget(this, null, stmt);
    return continueTarget_ContinueStmt_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:664
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> returnTarget() {
    ASTNode$State state = state();
    SmallSet<CFGNode> returnTarget_value = getParent().Define_SmallSet_CFGNode__returnTarget(this, null);
    return returnTarget_value;
  }
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:665
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> throwTarget(TypeDecl exn) {
    ASTNode$State state = state();
    SmallSet<CFGNode> throwTarget_TypeDecl_value = getParent().Define_SmallSet_CFGNode__throwTarget(this, null, exn);
    return throwTarget_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean uncheckedExnTarget_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> uncheckedExnTarget_value;
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:667
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> uncheckedExnTarget() {
    if(uncheckedExnTarget_computed) {
      return uncheckedExnTarget_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uncheckedExnTarget_value = getParent().Define_SmallSet_CFGNode__uncheckedExnTarget(this, null);
      if(isFinal && num == state().boundariesCrossed) uncheckedExnTarget_computed = true;
    return uncheckedExnTarget_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:120
   */
  @SuppressWarnings({"unchecked", "cast"})
  public UnknownVarAccess unknownVarAccess() {
    ASTNode$State state = state();
    UnknownVarAccess unknownVarAccess_value = getParent().Define_UnknownVarAccess_unknownVarAccess(this, null);
    return unknownVarAccess_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:132
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean canIntroduceLocal(String name) {
    ASTNode$State state = state();
    boolean canIntroduceLocal_String_value = getParent().Define_boolean_canIntroduceLocal(this, null, name);
    return canIntroduceLocal_String_value;
  }
  /**
   * @attribute inh
   * @aspect InsertEmptyStmt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:5
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean delete() {
    ASTNode$State state = state();
    boolean delete_value = getParent().Define_boolean_delete(this, null);
    return delete_value;
  }
  /**
   * @attribute inh
   * @aspect InsertEmptyStmt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:14
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt insertStmtBefore(Stmt s) {
    ASTNode$State state = state();
    Stmt insertStmtBefore_Stmt_value = getParent().Define_Stmt_insertStmtBefore(this, null, s);
    return insertStmtBefore_Stmt_value;
  }
  /**
   * @attribute inh
   * @aspect InsertEmptyStmt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:61
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt insertStmtAfter(Stmt s) {
    ASTNode$State state = state();
    Stmt insertStmtAfter_Stmt_value = getParent().Define_Stmt_insertStmtAfter(this, null, s);
    return insertStmtAfter_Stmt_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean following_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> following_value;
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> following() {
    if(following_computed) {
      return following_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    following_value = getParent().Define_SmallSet_CFGNode__following(this, null);
      if(isFinal && num == state().boundariesCrossed) following_computed = true;
    return following_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:352
   * @apilevel internal
   */
  public String Define_String_typeDeclIndent(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return indent();
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /**
   * @apilevel internal
   */
  protected boolean CFGNode_collPred_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> CFGNode_collPred_value;
  /**
   * @attribute coll
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:37
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collPred() {
    if(CFGNode_collPred_computed) {
      return CFGNode_collPred_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    CFGNode_collPred_value = collPred_compute();
      if(isFinal && num == state().boundariesCrossed) CFGNode_collPred_computed = true;
    return CFGNode_collPred_value;
  }
  java.util.Set CFGNode_collPred_contributors;
  public java.util.Set CFGNode_collPred_contributors() {
    if(CFGNode_collPred_contributors == null) CFGNode_collPred_contributors  = new ASTNode$State.IdentityHashSet(4);
    return CFGNode_collPred_contributors;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collPred_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof TypeDecl))
      node = node.getParent();
    TypeDecl root = (TypeDecl)node;
    root.collect_contributors_CFGNode_collPred();
    CFGNode_collPred_value = SmallSet.mutable();
    if(CFGNode_collPred_contributors != null)
    for(java.util.Iterator iter = CFGNode_collPred_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_CFGNode_CFGNode_collPred(CFGNode_collPred_value);
    }
    return CFGNode_collPred_value;
  }

  protected void collect_contributors_CFGNode_collPred() {
    /**
   * @attribute coll
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:38
   */
    for(java.util.Iterator iter = (succ()).iterator(); iter.hasNext(); ) {
      CFGNode ref = (CFGNode)iter.next();
      if(ref != null)
      ref.CFGNode_collPred_contributors().add(this);
    }
    super.collect_contributors_CFGNode_collPred();
  }
  protected void contributeTo_CFGNode_CFGNode_collPred(SmallSet<CFGNode> collection) {
    super.contributeTo_CFGNode_CFGNode_collPred(collection);
    collection.add(this);
  }

}
