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
 * @production IfStmt : {@link Stmt} ::= <span class="component">Condition:{@link Expr}</span> <span class="component">Then:{@link Stmt}</span> <span class="component">[Else:{@link Stmt}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:207
 */
public class IfStmt extends Stmt implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    canCompleteNormally_computed = false;
    succ_computed = false;
    succ_value = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public IfStmt clone() throws CloneNotSupportedException {
    IfStmt node = (IfStmt)super.clone();
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.canCompleteNormally_computed = false;
    node.succ_computed = false;
    node.succ_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public IfStmt copy() {
    try {
      IfStmt node = (IfStmt) clone();
      node.parent = null;
      if(children != null)
        node.children = (ASTNode[]) children.clone();
      return node;
    } catch (CloneNotSupportedException e) {
      throw new Error("Error: clone not supported for " +
        getClass().getName());
    }
  }
  /**
   * Create a deep copy of the AST subtree at this node.
   * The copy is dangling, i.e. has no parent.
   * @return dangling copy of the subtree at this node
   * @apilevel low-level
   */
  @SuppressWarnings({"unchecked", "cast"})
  public IfStmt fullCopy() {
    IfStmt tree = (IfStmt) copy();
    if (children != null) {
      for (int i = 0; i < children.length; ++i) {
        ASTNode child = (ASTNode) children[i];
        if(child != null) {
          child = child.fullCopy();
          tree.setChild(child, i);
        }
      }
    }
    return tree;
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:66
   */
  public IfStmt(Expr cond, Stmt thenBranch) {
    this(cond, thenBranch, new Opt());
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:70
   */
  public IfStmt(Expr cond, Stmt thenBranch, Stmt elseBranch) {
    this(cond, thenBranch, new Opt(elseBranch));
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:574
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    s.append("if(");
    getCondition().toString(s);
    s.append(") ");
    getThen().toString(s);
    if(hasElse()) {
      s.append(indent());
      s.append("else ");
      getElse().toString(s);
    }
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:316
   */
  public void typeCheck() {
    TypeDecl cond = getCondition().type();
    if(!cond.isBoolean()) {
      error("the type of \"" + getCondition() + "\" is " + cond.name() + " which is not boolean");
    }
  }
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:340
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(!getCondition().type().isPrimitiveType())
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "if statement", getCondition(), Operator.EQ, getCondition().type()));
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public IfStmt() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @ast method 
   * 
   */
  public IfStmt(Expr p0, Stmt p1, Opt<Stmt> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 3;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean mayHaveRewrite() {
    return false;
  }
  /**
   * Replaces the Condition child.
   * @param node The new node to replace the Condition child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setCondition(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Condition child.
   * @return The current node used as the Condition child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Expr getCondition() {
    return (Expr)getChild(0);
  }
  /**
   * Retrieves the Condition child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Condition child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Expr getConditionNoTransform() {
    return (Expr)getChildNoTransform(0);
  }
  /**
   * Replaces the Then child.
   * @param node The new node to replace the Then child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setThen(Stmt node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Then child.
   * @return The current node used as the Then child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Stmt getThen() {
    return (Stmt)getChild(1);
  }
  /**
   * Retrieves the Then child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Then child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Stmt getThenNoTransform() {
    return (Stmt)getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Else child. This is the {@code Opt} node containing the child Else, not the actual child!
   * @param opt The new node to be used as the optional node for the Else child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setElseOpt(Opt<Stmt> opt) {
    setChild(opt, 2);
  }
  /**
   * Check whether the optional Else child exists.
   * @return {@code true} if the optional Else child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasElse() {
    return getElseOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Else child.
   * @return The Else child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt getElse() {
    return (Stmt)getElseOpt().getChild(0);
  }
  /**
   * Replaces the (optional) Else child.
   * @param node The new node to be used as the Else child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setElse(Stmt node) {
    getElseOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Stmt> getElseOpt() {
    return (Opt<Stmt>)getChild(2);
  }
  /**
   * Retrieves the optional node for child Else. This is the {@code Opt} node containing the child Else, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Else.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Stmt> getElseOptNoTransform() {
    return (Opt<Stmt>)getChildNoTransform(2);
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:525
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
  private boolean isDAafter_compute(Variable v) {  return hasElse() ? getThen().isDAafter(v) && getElse().isDAafter(v) : getThen().isDAafter(v) && getCondition().isDAafterFalse(v);  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:994
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
  private boolean isDUafter_compute(Variable v) {  return hasElse() ? getThen().isDUafter(v) && getElse().isDUafter(v) : getThen().isDUafter(v) && getCondition().isDUafterFalse(v);  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:141
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
  private boolean canCompleteNormally_compute() {  return (reachable() && !hasElse()) || (getThen().canCompleteNormally() ||
    (hasElse() && getElse().canCompleteNormally()));  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:414
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
  private SmallSet<CFGNode> succ_compute() {  return SmallSet.<CFGNode>singleton(getCondition().first());  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:528
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getElseOptNoTransform()) {
      return getCondition().isDAafterFalse(v);
    }
    else if(caller == getThenNoTransform()) {
      return getCondition().isDAafterTrue(v);
    }
    else if(caller == getConditionNoTransform()) {
      return isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:997
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getElseOptNoTransform()) {
      return getCondition().isDUafterFalse(v);
    }
    else if(caller == getThenNoTransform()) {
      return getCondition().isDUafterTrue(v);
    }
    else if(caller == getConditionNoTransform()) {
      return isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:144
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getElseOptNoTransform()) {
      return reachable();
    }
    else if(caller == getThenNoTransform()) {
      return reachable();
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:150
   * @apilevel internal
   */
  public boolean Define_boolean_reportUnreachable(ASTNode caller, ASTNode child) {
    if(caller == getElseOptNoTransform()) {
      return reachable();
    }
    else if(caller == getThenNoTransform()) {
      return reachable();
    }
    else {      return getParent().Define_boolean_reportUnreachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:415
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    if(caller == getConditionNoTransform()) {
      return SmallSet.<CFGNode>singleton(getThen());
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:416
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    if(caller == getConditionNoTransform()) {
      return hasElse() ? SmallSet.<CFGNode>singleton(getElse()) : following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:421
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getElseOptNoTransform()) {
      return following();
    }
    else if(caller == getThenNoTransform()) {
      return following();
    }
    else if(caller == getConditionNoTransform()) {
      return getCondition().followingWhenTrue().union(getCondition().followingWhenFalse());
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:68
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getConditionNoTransform()) {
      return Integer.MAX_VALUE;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:9
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    if(caller == getElseOptNoTransform()){ setElseOpt(new Opt()); return true; }
    else if(caller == getThenNoTransform()){ setThen(new EmptyStmt()); return true; }
    else {      return getParent().Define_boolean_delete(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:28
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getElseOptNoTransform()){
		setElse(new Block(new List<Stmt>().add(s).add(getElse())));
		return s;
	}
    else if(caller == getThenNoTransform()){
		setThen(new Block(new List<Stmt>().add(s).add(getThen())));
		return s;
	}
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:79
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getElseOptNoTransform()){
		if(!getElse().canCompleteNormally())
			throw new RefactoringException("cannot insert statement here");
		setElse(new Block(new List<Stmt>().add(getElse()).add(s)));
		return s;
	}
    else if(caller == getThenNoTransform()){
		if(!getThen().canCompleteNormally())
			throw new RefactoringException("cannot insert statement here");
		setThen(new Block(new List<Stmt>().add(getThen()).add(s)));
		return s;
	}
    else {      return getParent().Define_Stmt_insertStmtAfter(this, caller, s);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
