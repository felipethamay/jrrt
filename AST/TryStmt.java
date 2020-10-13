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
 * @production TryStmt : {@link Stmt} ::= <span class="component">{@link Block}</span> <span class="component">{@link CatchClause}*</span> <span class="component">[Finally:{@link Block}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:219
 */
public class TryStmt extends Stmt implements Cloneable, FinallyHost {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    branches_computed = false;
    branches_value = null;
    branchesFromFinally_computed = false;
    branchesFromFinally_value = null;
    targetBranches_computed = false;
    targetBranches_value = null;
    escapedBranches_computed = false;
    escapedBranches_value = null;
    isDAafter_Variable_values = null;
    isDUbefore_Variable_values = null;
    isDUafter_Variable_values = null;
    catchableException_TypeDecl_values = null;
    canCompleteNormally_computed = false;
    succ_computed = false;
    succ_value = null;
    uncaughtExceptions_computed = false;
    uncaughtExceptions_value = null;
    handlesException_TypeDecl_values = null;
    typeError_computed = false;
    typeError_value = null;
    typeRuntimeException_computed = false;
    typeRuntimeException_value = null;
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
  public TryStmt clone() throws CloneNotSupportedException {
    TryStmt node = (TryStmt)super.clone();
    node.branches_computed = false;
    node.branches_value = null;
    node.branchesFromFinally_computed = false;
    node.branchesFromFinally_value = null;
    node.targetBranches_computed = false;
    node.targetBranches_value = null;
    node.escapedBranches_computed = false;
    node.escapedBranches_value = null;
    node.isDAafter_Variable_values = null;
    node.isDUbefore_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.catchableException_TypeDecl_values = null;
    node.canCompleteNormally_computed = false;
    node.succ_computed = false;
    node.succ_value = null;
    node.uncaughtExceptions_computed = false;
    node.uncaughtExceptions_value = null;
    node.handlesException_TypeDecl_values = null;
    node.typeError_computed = false;
    node.typeError_value = null;
    node.typeRuntimeException_computed = false;
    node.typeRuntimeException_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TryStmt copy() {
    try {
      TryStmt node = (TryStmt) clone();
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
  public TryStmt fullCopy() {
    TryStmt tree = (TryStmt) copy();
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
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:60
   */
  public void collectBranches(Collection c) {
    c.addAll(escapedBranches());
  }
  /**
   * @ast method 
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:161
   */
  public Stmt branchTarget(Stmt branchStmt) {
    if(targetBranches().contains(branchStmt))
      return this;
    return super.branchTarget(branchStmt);
  }
  /**
   * @ast method 
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:199
   */
  public void collectFinally(Stmt branchStmt, ArrayList list) {
    if(hasFinally() && !branchesFromFinally().contains(branchStmt))
      list.add(this);
    if(targetBranches().contains(branchStmt))
      return;
    super.collectFinally(branchStmt, list);
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:231
   */
  protected boolean reachedException(TypeDecl type) {
    boolean found = false;
    // found is true if the exception type is caught by a catch clause
    for(int i = 0; i < getNumCatchClause() && !found; i++)
      if(getCatchClause(i).handles(type))
        found = true;
    // if an exception is thrown in the block and the exception is not caught and
    // either there is no finally block or the finally block can complete normally
    if(!found && (!hasFinally() || getFinally().canCompleteNormally()) )
      if(getBlock().reachedException(type))
        return true;
    // even if the exception is caught by the catch clauses they may 
    // throw new exceptions
    for(int i = 0; i < getNumCatchClause(); i++)
      if(getCatchClause(i).reachedException(type))
        return true;
    return hasFinally() && getFinally().reachedException(type);
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:707
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    s.append("try ");
    getBlock().toString(s);
    for(int i = 0; i < getNumCatchClause(); i++) {
      s.append(indent());
      getCatchClause(i).toString(s);
    }
    if(hasFinally()) {
      s.append(indent());
      s.append("finally ");
      getFinally().toString(s);
    }
  }
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:136
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		for(CatchClause cc : getCatchClauses())
			addConstraint(constraints, pred, new SimpleTypeConstraint(cc, "catch clause", ((BasicCatch)cc).getParameter().getTypeAccess(), Operator.LE, cc.typeThrowable()));
		// there is also a constraint that types in later catch clauses may not be subtypes of types in earlier ones, but we cannot express it
		// we circumvent this by never allowing subtypes of Throwable to be generalised
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public TryStmt() {
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
    setChild(new List(), 1);
    setChild(new Opt(), 2);
  }
  /**
   * @ast method 
   * 
   */
  public TryStmt(Block p0, List<CatchClause> p1, Opt<Block> p2) {
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
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBlock(Block node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Block getBlock() {
    return (Block)getChild(0);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Block getBlockNoTransform() {
    return (Block)getChildNoTransform(0);
  }
  /**
   * Replaces the CatchClause list.
   * @param list The new list node to be used as the CatchClause list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setCatchClauseList(List<CatchClause> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the CatchClause list.
   * @return Number of children in the CatchClause list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumCatchClause() {
    return getCatchClauseList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CatchClause list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the CatchClause list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumCatchClauseNoTransform() {
    return getCatchClauseListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CatchClause list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CatchClause list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public CatchClause getCatchClause(int i) {
    return (CatchClause)getCatchClauseList().getChild(i);
  }
  /**
   * Append an element to the CatchClause list.
   * @param node The element to append to the CatchClause list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addCatchClause(CatchClause node) {
    List<CatchClause> list = (parent == null || state == null) ? getCatchClauseListNoTransform() : getCatchClauseList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addCatchClauseNoTransform(CatchClause node) {
    List<CatchClause> list = getCatchClauseListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CatchClause list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setCatchClause(CatchClause node, int i) {
    List<CatchClause> list = getCatchClauseList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CatchClause list.
   * @return The node representing the CatchClause list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<CatchClause> getCatchClauses() {
    return getCatchClauseList();
  }
  /**
   * Retrieves the CatchClause list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CatchClause list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<CatchClause> getCatchClausesNoTransform() {
    return getCatchClauseListNoTransform();
  }
  /**
   * Retrieves the CatchClause list.
   * @return The node representing the CatchClause list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<CatchClause> getCatchClauseList() {
    List<CatchClause> list = (List<CatchClause>)getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the CatchClause list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CatchClause list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<CatchClause> getCatchClauseListNoTransform() {
    return (List<CatchClause>)getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the Finally child. This is the {@code Opt} node containing the child Finally, not the actual child!
   * @param opt The new node to be used as the optional node for the Finally child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setFinallyOpt(Opt<Block> opt) {
    setChild(opt, 2);
  }
  /**
   * Check whether the optional Finally child exists.
   * @return {@code true} if the optional Finally child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasFinally() {
    return getFinallyOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Finally child.
   * @return The Finally child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Block getFinally() {
    return (Block)getFinallyOpt().getChild(0);
  }
  /**
   * Replaces the (optional) Finally child.
   * @param node The new node to be used as the Finally child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setFinally(Block node) {
    getFinallyOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Block> getFinallyOpt() {
    return (Opt<Block>)getChild(2);
  }
  /**
   * Retrieves the optional node for child Finally. This is the {@code Opt} node containing the child Finally, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Finally.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Block> getFinallyOptNoTransform() {
    return (Opt<Block>)getChildNoTransform(2);
  }
  /**
   * @apilevel internal
   */
  protected boolean branches_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection branches_value;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:115
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection branches() {
    if(branches_computed) {
      return branches_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    branches_value = branches_compute();
      if(isFinal && num == state().boundariesCrossed) branches_computed = true;
    return branches_value;
  }
  /**
   * @apilevel internal
   */
  private Collection branches_compute() {
    HashSet set = new HashSet();
    getBlock().collectBranches(set);
    for(int i = 0; i < getNumCatchClause(); i++)
      getCatchClause(i).collectBranches(set);
    return set;
  }
  /**
   * @apilevel internal
   */
  protected boolean branchesFromFinally_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection branchesFromFinally_value;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:123
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection branchesFromFinally() {
    if(branchesFromFinally_computed) {
      return branchesFromFinally_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    branchesFromFinally_value = branchesFromFinally_compute();
      if(isFinal && num == state().boundariesCrossed) branchesFromFinally_computed = true;
    return branchesFromFinally_value;
  }
  /**
   * @apilevel internal
   */
  private Collection branchesFromFinally_compute() {
    HashSet set = new HashSet();
    if(hasFinally())
      getFinally().collectBranches(set);
    return set;
  }
  /**
   * @apilevel internal
   */
  protected boolean targetBranches_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection targetBranches_value;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:131
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection targetBranches() {
    if(targetBranches_computed) {
      return targetBranches_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    targetBranches_value = targetBranches_compute();
      if(isFinal && num == state().boundariesCrossed) targetBranches_computed = true;
    return targetBranches_value;
  }
  /**
   * @apilevel internal
   */
  private Collection targetBranches_compute() {
    HashSet set = new HashSet();
    if(hasFinally() && !getFinally().canCompleteNormally())
      set.addAll(branches());
    return set;
  }
  /**
   * @apilevel internal
   */
  protected boolean escapedBranches_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection escapedBranches_value;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:139
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection escapedBranches() {
    if(escapedBranches_computed) {
      return escapedBranches_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    escapedBranches_value = escapedBranches_compute();
      if(isFinal && num == state().boundariesCrossed) escapedBranches_computed = true;
    return escapedBranches_value;
  }
  /**
   * @apilevel internal
   */
  private Collection escapedBranches_compute() {
    HashSet set = new HashSet();
    if(hasFinally())
      set.addAll(branchesFromFinally());
    if(!hasFinally() || getFinally().canCompleteNormally())
      set.addAll(branches());
    return set;
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:666
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
  private boolean isDAafter_compute(Variable v) {
    // 16.2.15 4th bullet
    if(!hasFinally()) {
      if(!getBlock().isDAafter(v))
        return false;
      for(int i = 0; i < getNumCatchClause(); i++)
        if(!getCatchClause(i).getBlock().isDAafter(v))
          return false;
      return true;
    }
    else {
      // 16.2.15 5th bullet
      if(getFinally().isDAafter(v))
        return true;
      if(!getBlock().isDAafter(v))
        return false;
      for(int i = 0; i < getNumCatchClause(); i++)
        if(!getCatchClause(i).getBlock().isDAafter(v))
          return false;
      return true;
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:914
   */
  public boolean isDUafterFinally(Variable v) {
    ASTNode$State state = state();
    try {  return getFinally().isDUafter(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:917
   */
  public boolean isDAafterFinally(Variable v) {
    ASTNode$State state = state();
    try {  return getFinally().isDAafter(v);  }
    finally {
    }
  }
  protected java.util.Map isDUbefore_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1185
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUbefore(Variable v) {
    Object _parameters = v;
    if(isDUbefore_Variable_values == null) isDUbefore_Variable_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isDUbefore_Variable_values.containsKey(_parameters)) {
      Object _o = isDUbefore_Variable_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isDUbefore_Variable_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isDUbefore_Variable_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isDUbefore_Variable_value = isDUbefore_compute(v);
        if (new_isDUbefore_Variable_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isDUbefore_Variable_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isDUbefore_Variable_values.put(_parameters, new_isDUbefore_Variable_value);
      }
      else {
        isDUbefore_Variable_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isDUbefore_compute(v);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isDUbefore_Variable_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isDUbefore_Variable_value = isDUbefore_compute(v);
      if (state.RESET_CYCLE) {
        isDUbefore_Variable_values.remove(_parameters);
      }
      else if (new_isDUbefore_Variable_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isDUbefore_Variable_value;
      }
      return new_isDUbefore_Variable_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isDUbefore_compute(Variable v) {  return super.isDUbefore(v);  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1221
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
    // 16.2.14 4th bullet
    if(!hasFinally()) {
      if(!getBlock().isDUafter(v))
        return false;
      for(int i = 0; i < getNumCatchClause(); i++)
        if(!getCatchClause(i).getBlock().isDUafter(v))
          return false;
      return true;
    }
    else
      return getFinally().isDUafter(v);
  }
  protected java.util.Map catchableException_TypeDecl_values;
  /**
   * The block of the try statement can throw an exception of
   * a type assignable to the given type.
   * @attribute syn
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:221
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean catchableException(TypeDecl type) {
    Object _parameters = type;
    if(catchableException_TypeDecl_values == null) catchableException_TypeDecl_values = new java.util.HashMap(4);
    if(catchableException_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)catchableException_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean catchableException_TypeDecl_value = catchableException_compute(type);
      if(isFinal && num == state().boundariesCrossed) catchableException_TypeDecl_values.put(_parameters, Boolean.valueOf(catchableException_TypeDecl_value));
    return catchableException_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean catchableException_compute(TypeDecl type) {  return getBlock().reachedException(type);  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:113
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
  private boolean canCompleteNormally_compute() {
     boolean anyCatchClauseCompleteNormally = false;
     for(int i = 0; i < getNumCatchClause() && !anyCatchClauseCompleteNormally; i++)
       anyCatchClauseCompleteNormally = getCatchClause(i).getBlock().canCompleteNormally();
     return (getBlock().canCompleteNormally() || anyCatchClauseCompleteNormally) &&
       (!hasFinally() || getFinally().canCompleteNormally());
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:550
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
  private SmallSet<CFGNode> succ_compute() {  return SmallSet.<CFGNode>singleton(getBlock());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:580
   */
  public SmallSet<CFGNode> collectBranches() {
    ASTNode$State state = state();
    try {
		// Try
		SmallSet<CFGNode> branchesInTry = getBlock().collectBranches(); //add try
		EmptyStmt emptyStmt = new EmptyStmt();
		if(getBlock().canCompleteNormally())
			branchesInTry = branchesInTry.union(emptyStmt); //try_normally

		// Catch
		SmallSet<CFGNode> remainingBranches = SmallSet.empty();
		for(CFGNode branch : branchesInTry) {
			if(branch instanceof ThrowStmt) {
				ThrowStmt throwStmt = (ThrowStmt)branch;
				boolean caught = false;
				for (int i = 0; i < getNumCatchClause() && !caught; i++) {
					if(getCatchClause(i).handles(throwStmt.getExpr().type())) {
						caught = true;
						remainingBranches = //add catch
							remainingBranches.union(getCatchClause(i).getBlock().collectBranches());
						if(getCatchClause(i).getBlock().canCompleteNormally())
							remainingBranches = remainingBranches.union(emptyStmt);
					}
				}
				if (!caught) 
					remainingBranches = remainingBranches.union(throwStmt);  		
			}
			else
				remainingBranches = remainingBranches.union(branch);   	
		}

		if(!hasFinally()) return remainingBranches;

		// hasFinally
		SmallSet<CFGNode> branchesInFinally = SmallSet.empty();
		SmallSet<CFGNode> branchesInAll = SmallSet.empty();

		// Ensure that branchesInFinally does not contain EmptyStmt
		for(CFGNode branch : getFinally().collectBranches())
			if(!(branch instanceof EmptyStmt))
				branchesInFinally = branchesInFinally.union(branch);

		if(getFinally().canCompleteNormally()) { 
			// branches above Finally are available
			branchesInAll = branchesInAll.union(remainingBranches);
			// branches(in Finally) except EmptyStmt can replace the branches above
			branchesInAll = branchesInAll.union(branchesInFinally);
		} else {
			//Branches in Finally except EmptyStmt replace all the possible branches above 
			branchesInAll = branchesInAll.union(branchesInFinally);
		}        	     

		return branchesInAll;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean uncaughtExceptions_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<TypeDecl> uncaughtExceptions_value;
  /**
   * @attribute syn
   * @aspect Exceptions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Exceptions.jrag:14
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<TypeDecl> uncaughtExceptions() {
    if(uncaughtExceptions_computed) {
      return uncaughtExceptions_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uncaughtExceptions_value = uncaughtExceptions_compute();
      if(isFinal && num == state().boundariesCrossed) uncaughtExceptions_computed = true;
    return uncaughtExceptions_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<TypeDecl> uncaughtExceptions_compute() {
    // Create a set containing the remaining throws after a throw-catch match
    SmallSet<TypeDecl> res = SmallSet.empty();
    for(TypeDecl exn : getBlock().uncaughtExceptions()) {
      boolean caught = false;
      for(int i = 0; i < getNumCatchClause() && !caught; i++)
	  caught = getCatchClause(i).handles(exn);
      if(!caught)
	  res = res.union(exn);
    }
    // Add throws from catch blocks and finally
    for(int i = 0; i < getNumCatchClause(); i++)
      res = res.union(getCatchClause(i).getBlock().uncaughtExceptions());
    if (hasFinally())
      res = res.union(getFinally().uncaughtExceptions());
    return res;
  }
  protected java.util.Map handlesException_TypeDecl_values;
  /**
   * @attribute inh
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:49
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean handlesException(TypeDecl exceptionType) {
    Object _parameters = exceptionType;
    if(handlesException_TypeDecl_values == null) handlesException_TypeDecl_values = new java.util.HashMap(4);
    if(handlesException_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)handlesException_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean handlesException_TypeDecl_value = getParent().Define_boolean_handlesException(this, null, exceptionType);
      if(isFinal && num == state().boundariesCrossed) handlesException_TypeDecl_values.put(_parameters, Boolean.valueOf(handlesException_TypeDecl_value));
    return handlesException_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean typeError_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeError_value;
  /**
   * @attribute inh
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:138
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeError() {
    if(typeError_computed) {
      return typeError_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeError_value = getParent().Define_TypeDecl_typeError(this, null);
      if(isFinal && num == state().boundariesCrossed) typeError_computed = true;
    return typeError_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean typeRuntimeException_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeRuntimeException_value;
  /**
   * @attribute inh
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:139
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeRuntimeException() {
    if(typeRuntimeException_computed) {
      return typeRuntimeException_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeRuntimeException_value = getParent().Define_TypeDecl_typeRuntimeException(this, null);
      if(isFinal && num == state().boundariesCrossed) typeRuntimeException_computed = true;
    return typeRuntimeException_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:665
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getFinallyOptNoTransform()) {
      return isDAbefore(v);
    }
    else if(caller == getCatchClauseListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return getBlock().isDAbefore(v);
  }
    else if(caller == getBlockNoTransform()) {
      return isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1212
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getFinallyOptNoTransform()){
    if(!getBlock().isDUeverywhere(v))
      return false;
    for(int i = 0; i < getNumCatchClause(); i++)
      if(!getCatchClause(i).getBlock().unassignedEverywhere(v, this))
        return false;
    return true;
  }
    else if(caller == getCatchClauseListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    if(!getBlock().isDUafter(v))
      return false;
    if(!getBlock().isDUeverywhere(v))
      return false;
    return true;
  }
  }
    else if(caller == getBlockNoTransform()) {
      return isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:202
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    if(caller == getBlockNoTransform()){
    for(int i = 0; i < getNumCatchClause(); i++)
      if(getCatchClause(i).handles(exceptionType))
        return true;
    if(hasFinally() && !getFinally().canCompleteNormally())
      return true;
    return handlesException(exceptionType);
  }
    else if(caller == getCatchClauseListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    if(hasFinally() && !getFinally().canCompleteNormally())
      return true;
    return handlesException(exceptionType);
  }
  }
    else {      return getParent().Define_boolean_handlesException(this, caller, exceptionType);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:121
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getFinallyOptNoTransform()) {
      return reachable();
    }
    else if(caller == getBlockNoTransform()) {
      return reachable();
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:128
   * @apilevel internal
   */
  public boolean Define_boolean_reachableCatchClause(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    if(caller == getCatchClauseListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    for(int i = 0; i < childIndex; i++)
      if(getCatchClause(i).handles(exceptionType))
        return false;
    if(catchableException(exceptionType))
      return true;
    if(exceptionType.mayCatch(typeError()) || exceptionType.mayCatch(typeRuntimeException()))
      return true;
    return false;
  }
  }
    else {      return getParent().Define_boolean_reachableCatchClause(this, caller, exceptionType);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:156
   * @apilevel internal
   */
  public boolean Define_boolean_reportUnreachable(ASTNode caller, ASTNode child) {
    if(caller == getFinallyOptNoTransform()) {
      return reachable();
    }
    else if(caller == getCatchClauseListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return reachable();
  }
    else if(caller == getBlockNoTransform()) {
      return reachable();
    }
    else {      return getParent().Define_boolean_reportUnreachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:558
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getFinallyOptNoTransform()){ 
		SmallSet<CFGNode> branches = collectBranches(); // all the branches accumulated at the end of Finally()
		SmallSet<CFGNode> succ = SmallSet.empty();

		for(CFGNode branch : branches) {
			// TODO: this is very ugly
			if(branch instanceof EmptyStmt) // can complete normally
				succ = succ.union(following());
			else if(branch instanceof BreakStmt)
				succ = succ.union(breakTarget((BreakStmt)branch));
			else if(branch instanceof ContinueStmt)
				succ = succ.union(continueTarget((ContinueStmt)branch));
			else if(branch instanceof ThrowStmt)
				succ = succ.union(throwTarget(((ThrowStmt)branch).getExpr().type()));
			else
				succ = succ.union(returnTarget());
		}   

		return succ;
	}
    else if(caller == getCatchClauseListNoTransform())  {
    int index = caller.getIndexOfChild(child);
    return hasFinally() ? SmallSet.<CFGNode>singleton(getFinally()) : following();
  }
    else if(caller == getBlockNoTransform()) {
      return hasFinally() ? SmallSet.<CFGNode>singleton(getFinally()) : following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:725
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__breakTarget(ASTNode caller, ASTNode child, BreakStmt stmt) {
    if(caller == getBlockNoTransform()) {
      return hasFinally() ? SmallSet.<CFGNode>singleton(getFinally()) : breakTarget(stmt);
    }
    else {      return getParent().Define_SmallSet_CFGNode__breakTarget(this, caller, stmt);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:727
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__continueTarget(ASTNode caller, ASTNode child, ContinueStmt stmt) {
    if(caller == getBlockNoTransform()) {
      return hasFinally() ? SmallSet.<CFGNode>singleton(getFinally()) : continueTarget(stmt);
    }
    else {      return getParent().Define_SmallSet_CFGNode__continueTarget(this, caller, stmt);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:729
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__returnTarget(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return hasFinally() ? SmallSet.<CFGNode>singleton(getFinally()) : returnTarget();
    }
    else {      return getParent().Define_SmallSet_CFGNode__returnTarget(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:731
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__throwTarget(ASTNode caller, ASTNode child, TypeDecl exn) {
    if(caller == getBlockNoTransform()){
		for(int i = 0; i < getNumCatchClause(); i++) 
			if(getCatchClause(i).handles(exn))
				return SmallSet.<CFGNode>singleton(((BasicCatch)getCatchClause(i)).getParameter());
		return hasFinally() ? SmallSet.<CFGNode>singleton(getFinally()) : throwTarget(exn);
	}
    else {      return getParent().Define_SmallSet_CFGNode__throwTarget(this, caller, exn);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:740
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()){
		SmallSet<CFGNode> res = SmallSet.empty();
		for(CatchClause clause : getCatchClauses()) {
			if(clause.handlesAllUncheckedExceptions())
				return res.union(((BasicCatch)clause).getParameter());
			if(clause.handlesUncheckedException())
				res = res.union(((BasicCatch)clause).getParameter());
		}
		return res.union(uncheckedExnTarget());
	}
    else {      return getParent().Define_SmallSet_CFGNode__uncheckedExnTarget(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:58
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getFinallyOptNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else if(caller == getBlockNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:119
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getFinallyOptNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else if(caller == getBlockNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
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
