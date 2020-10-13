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
 * @production ParExpr : {@link PrimaryExpr} ::= <span class="component">{@link Expr}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:131
 */
public class ParExpr extends PrimaryExpr implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    type_computed = false;
    type_value = null;
    getMonitor_computed = false;
    getMonitor_value = null;
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
  public ParExpr clone() throws CloneNotSupportedException {
    ParExpr node = (ParExpr)super.clone();
    node.type_computed = false;
    node.type_value = null;
    node.getMonitor_computed = false;
    node.getMonitor_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParExpr copy() {
    try {
      ParExpr node = (ParExpr) clone();
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
  public ParExpr fullCopy() {
    ParExpr tree = (ParExpr) copy();
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
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:321
   */
  public void toString(StringBuffer s) {
    s.append("(");
    getExpr().toString(s);
    s.append(")");
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:263
   */
  public void typeCheck() {
    if(getExpr().isTypeAccess())
      error("" + getExpr() + " is a type and may not be used in parenthesized expression");
  }
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:216
   */
  public Access getDestLocation() {
		return getExpr().getDestLocation();
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:198
   */
  public Expr findDoublyParenthesised() {
		if(getExpr() instanceof ParExpr)
			return ((ParExpr)getExpr()).getExpr();
		return super.findDoublyParenthesised();
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:266
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		addConstraint(constraints, pred, new SimpleTypeConstraint(this, "this", this, Operator.EQ, getExpr()));
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public ParExpr() {
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
  public ParExpr(Expr p0) {
    setChild(p0, 0);
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
   * Replaces the Expr child.
   * @param node The new node to replace the Expr child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setExpr(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Expr child.
   * @return The current node used as the Expr child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Expr getExpr() {
    return (Expr)getChild(0);
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
    return (Expr)getChildNoTransform(0);
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:98
   */
  public Constant constant() {
    ASTNode$State state = state();
    try {  return getExpr().constant();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:482
   */
  public boolean isConstant() {
    ASTNode$State state = state();
    try {  return getExpr().isConstant();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:58
   */
  public Variable varDecl() {
    ASTNode$State state = state();
    try {  return getExpr().varDecl();  }
    finally {
    }
  }
  /*eq Stmt.isDAafter(Variable v) {
    //System.out.println("### isDAafter reached in " + getClass().getName());
    //throw new NullPointerException();
    throw new Error("Can not compute isDAafter for " + getClass().getName() + " at " + errorPrefix());
  }* @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:332
   */
  public boolean isDAafterTrue(Variable v) {
    ASTNode$State state = state();
    try {  return getExpr().isDAafterTrue(v) || isFalse();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:333
   */
  public boolean isDAafterFalse(Variable v) {
    ASTNode$State state = state();
    try {  return getExpr().isDAafterFalse(v) || isTrue();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:235
   */
  public boolean isDAafter(Variable v) {
    ASTNode$State state = state();
    try {  return getExpr().isDAafter(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:702
   */
  public boolean isDUafterTrue(Variable v) {
    ASTNode$State state = state();
    try {  return getExpr().isDUafterTrue(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:703
   */
  public boolean isDUafterFalse(Variable v) {
    ASTNode$State state = state();
    try {  return getExpr().isDUafterFalse(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:694
   */
  public boolean isDUafter(Variable v) {
    ASTNode$State state = state();
    try {  return getExpr().isDUafter(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:25
   */
  public boolean isSuperAccess() {
    ASTNode$State state = state();
    try {  return getExpr().isSuperAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:31
   */
  public boolean isThisAccess() {
    ASTNode$State state = state();
    try {  return getExpr().isThisAccess();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean type_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl type_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:309
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl type() {
    if(type_computed) {
      return type_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    type_value = type_compute();
      if(isFinal && num == state().boundariesCrossed) type_computed = true;
    return type_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl type_compute() {  return getExpr().isTypeAccess() ? unknownType() : getExpr().type();  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:15
   */
  public boolean isVariable() {
    ASTNode$State state = state();
    try {  return getExpr().isVariable();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:150
   */
  public boolean staticContextQualifier() {
    ASTNode$State state = state();
    try {  return getExpr().staticContextQualifier();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return getExpr().first();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:15
   */
  public boolean notAnObject() {
    ASTNode$State state = state();
    try {  return super.notAnObject() || getExpr().notAnObject();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Precedence
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:2
   */
  public int precedence() {
    ASTNode$State state = state();
    try {  return 0;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Purity
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Purity.jrag:2
   */
  public boolean isPure() {
    ASTNode$State state = state();
    try {  return getExpr().isPure();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean getMonitor_computed = false;
  /**
   * @apilevel internal
   */
  protected Monitor getMonitor_value;
  /**
   * @attribute syn
   * @aspect Monitor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/Monitor.jrag:97
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Monitor getMonitor() {
    if(getMonitor_computed) {
      return getMonitor_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getMonitor_value = getMonitor_compute();
      if(isFinal && num == state().boundariesCrossed) getMonitor_computed = true;
    return getMonitor_value;
  }
  /**
   * @apilevel internal
   */
  private Monitor getMonitor_compute() {  return getExpr().getMonitor();  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:241
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getExprNoTransform()) {
      return SmallSet.<CFGNode>singleton(this);
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:372
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    if(caller == getExprNoTransform()) {
      return SmallSet.<CFGNode>singleton(this);
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:373
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    if(caller == getExprNoTransform()) {
      return SmallSet.<CFGNode>singleton(this);
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:91
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
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
