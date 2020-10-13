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
 * @production LabeledStmt : {@link BranchTargetStmt} ::= <span class="component">&lt;Label:String&gt;</span> <span class="component">{@link Stmt}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:199
 */
public class LabeledStmt extends BranchTargetStmt implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    targetOf_ContinueStmt_values = null;
    targetOf_BreakStmt_values = null;
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    canCompleteNormally_computed = false;
    succ_computed = false;
    succ_value = null;
    lookupLabel_String_values = null;
    LabeledStmt_uses_computed = false;
    LabeledStmt_uses_value = null;
    LabeledStmt_uses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    LabeledStmt_uses_computed = false;
    LabeledStmt_uses_value = null;
    LabeledStmt_uses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LabeledStmt clone() throws CloneNotSupportedException {
    LabeledStmt node = (LabeledStmt)super.clone();
    node.targetOf_ContinueStmt_values = null;
    node.targetOf_BreakStmt_values = null;
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.canCompleteNormally_computed = false;
    node.succ_computed = false;
    node.succ_value = null;
    node.lookupLabel_String_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LabeledStmt copy() {
    try {
      LabeledStmt node = (LabeledStmt) clone();
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
  public LabeledStmt fullCopy() {
    LabeledStmt tree = (LabeledStmt) copy();
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
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:356
   */
  public void nameCheck() {
    LabeledStmt stmt = lookupLabel(getLabel());
    if(stmt != null) {
      if(stmt.enclosingBodyDecl() == enclosingBodyDecl()) {
        error("Labels can not shadow labels in the same member");
      }
    }
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:542
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    s.append(getLabel() + ":");
    getStmt().toString(s);
  }
  /**
   * @ast method 
   * @aspect LabelExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LabelExt.jrag:31
   */
  public Stmt removeUselessLabel() {
		if(uses().isEmpty()) {
			Stmt stmt = getStmt();
			replaceWith(stmt);
			return stmt;
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:78
   */
  public boolean canIntroduceLabel(String name) {
		if(name.equals(getLabel()))
			return false;
		return super.canIntroduceLabel(name);
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:216
   */
  public LabeledStmt findStmtWithLabel(String l) {
		if(getLabel().equals(l))
			return this;
		return super.findStmtWithLabel(l);
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:222
   */
  public Stmt unlabel() {
		Stmt s = getStmt();
		replaceWith(s);
		return s;
	}
  /**
   * @ast method 
   * 
   */
  public LabeledStmt() {
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
    children = new ASTNode[1];
  }
  /**
   * @ast method 
   * 
   */
  public LabeledStmt(String p0, Stmt p1) {
    setLabel(p0);
    setChild(p1, 0);
  }
  /**
   * @ast method 
   * 
   */
  public LabeledStmt(beaver.Symbol p0, Stmt p1) {
    setLabel(p0);
    setChild(p1, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 1;
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
   * Replaces the lexeme Label.
   * @param value The new value for the lexeme Label.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setLabel(String value) {
    tokenString_Label = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_Label;
  /**
   * @ast method 
   * 
   */
  
  public int Labelstart;
  /**
   * @ast method 
   * 
   */
  
  public int Labelend;
  /**
   * JastAdd-internal setter for lexeme Label using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setLabel(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setLabel is only valid for String lexemes");
    tokenString_Label = (String)symbol.value;
    Labelstart = symbol.getStart();
    Labelend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Label.
   * @return The value for the lexeme Label.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getLabel() {
    return tokenString_Label != null ? tokenString_Label : "";
  }
  /**
   * Replaces the Stmt child.
   * @param node The new node to replace the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setStmt(Stmt node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Stmt child.
   * @return The current node used as the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Stmt getStmt() {
    return (Stmt)getChild(0);
  }
  /**
   * Retrieves the Stmt child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Stmt child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Stmt getStmtNoTransform() {
    return (Stmt)getChildNoTransform(0);
  }
  protected java.util.Map targetOf_ContinueStmt_values;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:67
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean targetOf(ContinueStmt stmt) {
    Object _parameters = stmt;
    if(targetOf_ContinueStmt_values == null) targetOf_ContinueStmt_values = new java.util.HashMap(4);
    if(targetOf_ContinueStmt_values.containsKey(_parameters)) {
      return ((Boolean)targetOf_ContinueStmt_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean targetOf_ContinueStmt_value = targetOf_compute(stmt);
      if(isFinal && num == state().boundariesCrossed) targetOf_ContinueStmt_values.put(_parameters, Boolean.valueOf(targetOf_ContinueStmt_value));
    return targetOf_ContinueStmt_value;
  }
  /**
   * @apilevel internal
   */
  private boolean targetOf_compute(ContinueStmt stmt) {  return stmt.hasLabel() && stmt.getLabel().equals(getLabel());  }
  protected java.util.Map targetOf_BreakStmt_values;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:74
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean targetOf(BreakStmt stmt) {
    Object _parameters = stmt;
    if(targetOf_BreakStmt_values == null) targetOf_BreakStmt_values = new java.util.HashMap(4);
    if(targetOf_BreakStmt_values.containsKey(_parameters)) {
      return ((Boolean)targetOf_BreakStmt_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean targetOf_BreakStmt_value = targetOf_compute(stmt);
      if(isFinal && num == state().boundariesCrossed) targetOf_BreakStmt_values.put(_parameters, Boolean.valueOf(targetOf_BreakStmt_value));
    return targetOf_BreakStmt_value;
  }
  /**
   * @apilevel internal
   */
  private boolean targetOf_compute(BreakStmt stmt) {  return stmt.hasLabel() && stmt.getLabel().equals(getLabel());  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:511
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
    if(!getStmt().isDAafter(v))
      return false;
    for(Iterator iter = targetBreaks().iterator(); iter.hasNext(); ) {
      BreakStmt stmt = (BreakStmt)iter.next();
      if(!stmt.isDAafterReachedFinallyBlocks(v))
        return false;
    }
    return true;
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:894
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
    if(!getStmt().isDUafter(v))
      return false;
    for(Iterator iter = targetBreaks().iterator(); iter.hasNext(); ) {
      BreakStmt stmt = (BreakStmt)iter.next();
      if(!stmt.isDUafterReachedFinallyBlocks(v))
        return false;
    }
    return true;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:46
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
  private boolean canCompleteNormally_compute() {  return getStmt().canCompleteNormally() || reachableBreak();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:494
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
  private SmallSet<CFGNode> succ_compute() {  return SmallSet.<CFGNode>singleton(getStmt());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:768
   */
  public CFGNode targetForContinue() {
    ASTNode$State state = state();
    try {  return getStmt().targetForContinue();  }
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
    try {  return true;  }
    finally {
    }
  }
  protected java.util.Map lookupLabel_String_values;
  /**
   * @attribute inh
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:170
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LabeledStmt lookupLabel(String name) {
    Object _parameters = name;
    if(lookupLabel_String_values == null) lookupLabel_String_values = new java.util.HashMap(4);
    if(lookupLabel_String_values.containsKey(_parameters)) {
      return (LabeledStmt)lookupLabel_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    LabeledStmt lookupLabel_String_value = getParent().Define_LabeledStmt_lookupLabel(this, null, name);
      if(isFinal && num == state().boundariesCrossed) lookupLabel_String_values.put(_parameters, lookupLabel_String_value);
    return lookupLabel_String_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:171
   * @apilevel internal
   */
  public LabeledStmt Define_LabeledStmt_lookupLabel(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtNoTransform()) {
      return name.equals(getLabel()) ? this : lookupLabel(name);
    }
    else {      return getParent().Define_LabeledStmt_lookupLabel(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:510
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getStmtNoTransform()) {
      return isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:893
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getStmtNoTransform()) {
      return isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:47
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return reachable();
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:495
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:16
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()){
		if(!uses().isEmpty())
			throw new RefactoringException("cannot delete this statement");
		return delete();
	}
    else {      return getParent().Define_boolean_delete(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:19
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtNoTransform()) {
      return insertStmtBefore(s);
    }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:68
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtNoTransform()) {
      return insertStmtAfter(s);
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
  /**
   * @apilevel internal
   */
  protected boolean LabeledStmt_uses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<Stmt> LabeledStmt_uses_value;
  /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:93
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<Stmt> uses() {
    if(LabeledStmt_uses_computed) {
      return LabeledStmt_uses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    LabeledStmt_uses_value = uses_compute();
      if(isFinal && num == state().boundariesCrossed) LabeledStmt_uses_computed = true;
    return LabeledStmt_uses_value;
  }
  java.util.Set LabeledStmt_uses_contributors;
  public java.util.Set LabeledStmt_uses_contributors() {
    if(LabeledStmt_uses_contributors == null) LabeledStmt_uses_contributors  = new ASTNode$State.IdentityHashSet(4);
    return LabeledStmt_uses_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<Stmt> uses_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof BodyDecl))
      node = node.getParent();
    BodyDecl root = (BodyDecl)node;
    root.collect_contributors_LabeledStmt_uses();
    LabeledStmt_uses_value = new HashSet<Stmt>();
    if(LabeledStmt_uses_contributors != null)
    for(java.util.Iterator iter = LabeledStmt_uses_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_LabeledStmt_LabeledStmt_uses(LabeledStmt_uses_value);
    }
    return LabeledStmt_uses_value;
  }

}
