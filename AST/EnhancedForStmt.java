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
 * @production EnhancedForStmt : {@link BranchTargetStmt} ::= <span class="component">{@link VariableDeclaration}</span> <span class="component">{@link Expr}</span> <span class="component">{@link Stmt}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.ast:1
 */
public class EnhancedForStmt extends BranchTargetStmt implements Cloneable, VariableScope, Scope {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    targetOf_ContinueStmt_values = null;
    targetOf_BreakStmt_values = null;
    canCompleteNormally_computed = false;
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
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
  public EnhancedForStmt clone() throws CloneNotSupportedException {
    EnhancedForStmt node = (EnhancedForStmt)super.clone();
    node.targetOf_ContinueStmt_values = null;
    node.targetOf_BreakStmt_values = null;
    node.canCompleteNormally_computed = false;
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
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
  public EnhancedForStmt copy() {
    try {
      EnhancedForStmt node = (EnhancedForStmt) clone();
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
  public EnhancedForStmt fullCopy() {
    EnhancedForStmt tree = (EnhancedForStmt) copy();
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
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:15
   */
  public void typeCheck() {
		if (!getExpr().type().isArrayDecl() && !getExpr().type().isIterable()) {
			error("type " + getExpr().type().name() + 
			      " of expression in foreach is neither array type nor java.lang.Iterable");
		}	
    else if(getExpr().type().isArrayDecl() && !getExpr().type().componentType().assignConversionTo(getVariableDeclaration().type(), null))
      error("parameter of type " + getVariableDeclaration().type().typeName() + " can not be assigned an element of type " + getExpr().type().componentType().typeName()); 
    else if(getExpr().type().isIterable() && !getExpr().type().isUnknown()) {
      MethodDecl iterator = (MethodDecl)getExpr().type().memberMethods("iterator").iterator().next();
      MethodDecl next = (MethodDecl)iterator.type().memberMethods("next").iterator().next();
      TypeDecl componentType = next.type();
      if(!componentType.assignConversionTo(getVariableDeclaration().type(), null))
        error("parameter of type " + getVariableDeclaration().type().typeName() + " can not be assigned an element of type " + componentType.typeName()); 
    }
	}
  /**
   * @ast method 
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:58
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    s.append("for (");
    getVariableDeclaration().getModifiers().toString(s);
    getVariableDeclaration().getTypeAccess().toString(s);
    s.append(" " + getVariableDeclaration().name());
    s.append(" : ");
    getExpr().toString(s);
    s.append(") ");
    getStmt().toString(s);
  }
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:144
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		addConstraint(constraints, pred, new SimpleTypeConstraint(this, "for each statement", getExpr(), Operator.EQ, getExpr().type()));
		// In theory, we might be less restrictive here. What we need to ensure is (getExpr().type().isArrayDecl() || getExpr().type().isIterable()) 
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:30
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
   * 
   */
  public EnhancedForStmt() {
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
  }
  /**
   * @ast method 
   * 
   */
  public EnhancedForStmt(VariableDeclaration p0, Expr p1, Stmt p2) {
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
   * Replaces the VariableDeclaration child.
   * @param node The new node to replace the VariableDeclaration child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setVariableDeclaration(VariableDeclaration node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the VariableDeclaration child.
   * @return The current node used as the VariableDeclaration child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public VariableDeclaration getVariableDeclaration() {
    return (VariableDeclaration)getChild(0);
  }
  /**
   * Retrieves the VariableDeclaration child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the VariableDeclaration child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public VariableDeclaration getVariableDeclarationNoTransform() {
    return (VariableDeclaration)getChildNoTransform(0);
  }
  /**
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setExpr(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Expr getExpr() {
    return (Expr)getChild(1);
  }
  /**
   * Retrieves the Expr child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Expr child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Expr getExprNoTransform() {
    return (Expr)getChildNoTransform(1);
  }
  /**
   * Replaces the Stmt child.
   * @param node The new node to replace the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setStmt(Stmt node) {
    setChild(node, 2);
  }
  /**
   * Retrieves the Stmt child.
   * @return The current node used as the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Stmt getStmt() {
    return (Stmt)getChild(2);
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
    return (Stmt)getChildNoTransform(2);
  }
  /**
   * @attribute syn
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:50
   */
  public SimpleSet localLookupVariable(String name) {
    ASTNode$State state = state();
    try {
		if(getVariableDeclaration().name().equals(name)) {
      return SimpleSet.emptySet.add(getVariableDeclaration());
    }
 	  return lookupVariable(name);
	}
    finally {
    }
  }
  protected java.util.Map targetOf_ContinueStmt_values;
  /**
   * @attribute syn
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:75
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
  private boolean targetOf_compute(ContinueStmt stmt) {  return !stmt.hasLabel();  }
  protected java.util.Map targetOf_BreakStmt_values;
  /**
   * @attribute syn
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:76
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
  private boolean targetOf_compute(BreakStmt stmt) {  return !stmt.hasLabel();  }
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
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:79
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
  private boolean canCompleteNormally_compute() {  return reachable();  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:83
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
    if(!getExpr().isDAafter(v))
      return false;
    /*
    for(Iterator iter = targetBreaks().iterator(); iter.hasNext(); ) {
      BreakStmt stmt = (BreakStmt)iter.next();
      if(!stmt.isDAafterReachedFinallyBlocks(v))
        return false;
    }
    */
    return true;
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:99
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
    if(!getExpr().isDUafter(v))
      return false;
    for(Iterator iter = targetBreaks().iterator(); iter.hasNext(); ) {
      BreakStmt stmt = (BreakStmt)iter.next();
      if(!stmt.isDUafterReachedFinallyBlocks(v))
        return false;
    }
    return true;
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:401
   */
  public boolean continueLabel() {
    ASTNode$State state = state();
    try {  return true;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:482
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
  private SmallSet<CFGNode> succ_compute() {  return SmallSet.<CFGNode>singleton(getExpr().first());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:768
   */
  public CFGNode targetForContinue() {
    ASTNode$State state = state();
    try {  return getVariableDeclaration();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:23
   */
  public boolean hasVariable(String name) {
    ASTNode$State state = state();
    try {  return getVariableDeclaration().name().equals(name);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:367
   */
  public SymbolicVarAccess localAccessVariable(Variable decl) {
    ASTNode$State state = state();
    try {
		if(getVariableDeclaration() == decl)
			return getVariableDeclaration();
		return accessVariable(decl).moveInto(this);
	}
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect EnhancedFor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:38
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    ASTNode$State state = state();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
    return lookupVariable_String_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:41
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtNoTransform()) {
      return localLookupVariable(name);
    }
    else if(caller == getExprNoTransform()) {
      return localLookupVariable(name);
    }
    else if(caller == getVariableDeclarationNoTransform()) {
      return localLookupVariable(name);
    }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:43
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getVariableDeclarationNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:48
   * @apilevel internal
   */
  public VariableScope Define_VariableScope_outerScope(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return this;
    }
    else if(caller == getExprNoTransform()) {
      return this;
    }
    else if(caller == getVariableDeclarationNoTransform()) {
      return this;
    }
    else {      return getParent().Define_VariableScope_outerScope(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:71
   * @apilevel internal
   */
  public boolean Define_boolean_isMethodParameter(ASTNode caller, ASTNode child) {
    if(caller == getVariableDeclarationNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isMethodParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:72
   * @apilevel internal
   */
  public boolean Define_boolean_isConstructorParameter(ASTNode caller, ASTNode child) {
    if(caller == getVariableDeclarationNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isConstructorParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:73
   * @apilevel internal
   */
  public boolean Define_boolean_isExceptionHandlerParameter(ASTNode caller, ASTNode child) {
    if(caller == getVariableDeclarationNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isExceptionHandlerParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:80
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:97
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getStmtNoTransform()) {
      return getExpr().isDAafter(v);
    }
    else if(caller == getExprNoTransform()) {
      return v == getVariableDeclaration() || isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:111
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getStmtNoTransform()) {
      return getExpr().isDUafter(v);
    }
    else if(caller == getExprNoTransform()) {
      return v != getVariableDeclaration() && isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/EnhancedFor.jrag:113
   * @apilevel internal
   */
  public boolean Define_boolean_insideLoop(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_insideLoop(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:485
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return SmallSet.<CFGNode>singleton(getVariableDeclaration());
    }
    else if(caller == getVariableDeclarationNoTransform()) {
      return following().union(getStmt());
    }
    else if(caller == getExprNoTransform()) {
      return SmallSet.<CFGNode>singleton(getVariableDeclaration());
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:78
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getExprNoTransform()) {
      return Integer.MAX_VALUE;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:364
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getStmtNoTransform()) {
      return localAccessVariable(decl);
    }
    else if(caller == getExprNoTransform()) {
      return localAccessVariable(decl);
    }
    else if(caller == getVariableDeclarationNoTransform()) {
      return localAccessVariable(decl);
    }
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:23
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    if(caller == getVariableDeclarationNoTransform()) {
      return !hasNestingLocal(name) && !hasNestedLocal(name);
    }
    else {      return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:15
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()){ setStmt(new EmptyStmt()); return true; }
    else {      return getParent().Define_boolean_delete(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:47
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtNoTransform()){
		setStmt(new Block(new List<Stmt>().add(s).add(getStmt())));
		return s;
	}
    else if(caller == getVariableDeclarationNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:106
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtNoTransform()){
		if(!getStmt().canCompleteNormally())
			throw new RefactoringException("cannot insert statement here");
		setStmt(new Block(new List<Stmt>().add(getStmt()).add(s)));
		return s;
	}
    else if(caller == getVariableDeclarationNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
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
