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
 * @production ReturnStmt : {@link Stmt} ::= <span class="component">[Result:{@link Expr}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:214
 */
public class ReturnStmt extends Stmt implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    finallyList_computed = false;
    finallyList_value = null;
    isDAafter_Variable_values = null;
    isDUafterReachedFinallyBlocks_Variable_values = null;
    isDAafterReachedFinallyBlocks_Variable_values = null;
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
  public ReturnStmt clone() throws CloneNotSupportedException {
    ReturnStmt node = (ReturnStmt)super.clone();
    node.finallyList_computed = false;
    node.finallyList_value = null;
    node.isDAafter_Variable_values = null;
    node.isDUafterReachedFinallyBlocks_Variable_values = null;
    node.isDAafterReachedFinallyBlocks_Variable_values = null;
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
  public ReturnStmt copy() {
    try {
      ReturnStmt node = (ReturnStmt) clone();
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
  public ReturnStmt fullCopy() {
    ReturnStmt tree = (ReturnStmt) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:54
   */
  public void collectBranches(Collection c) {
    c.add(this);
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:62
   */
  public ReturnStmt(Expr expr) {
    this(new Opt(expr));
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:683
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    s.append("return ");
    if(hasResult()) {
      getResult().toString(s);
    }
    s.append(";");
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:408
   */
  public void typeCheck() {
    if(hasResult() && !returnType().isVoid()) {
      if(!getResult().type().assignConversionTo(returnType(), getResult()))
        error("return value must be an instance of " + returnType().typeName() + " which " + getResult().type().typeName() + " is not");
    }
    // 8.4.5 8.8.5
    if(returnType().isVoid() && hasResult())
      error("return stmt may not have an expression in void methods");
    // 8.4.5
    if(!returnType().isVoid() && !hasResult())
      error("return stmt must have an expression in non void methods");
    if(enclosingBodyDecl() instanceof InstanceInitializer || enclosingBodyDecl() instanceof StaticInitializer)
      error("Initializers may not return");

  }
  /**
   * @ast method 
   * @aspect IntroduceOutParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/IntroduceOutParameter.jrag:34
   */
  public void addAssignToReturns(Variable v) {
		if(hasResult()) {
			insertStmtBefore(AssignExpr.asStmt(v.createLockedAccess(), getResult()));
			setResultOpt(new Opt());
			hostType().flushCaches();
		}
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:123
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(hasResult()) {
			MethodDecl md = (MethodDecl)hostBodyDecl();
			if(getResult().type().isSubtypeConstrainable() && md.type().isSubtypeConstrainable()) {
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "return", getResult(), Operator.LE, md.getTypeAccess()));
			} else {
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "return invariant", getResult(), Operator.EQ, getResult().type()));
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "return invariant", md.getTypeAccess(), Operator.EQ, md.type()));				
			}
		}
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public ReturnStmt() {
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
    setChild(new Opt(), 0);
  }
  /**
   * @ast method 
   * 
   */
  public ReturnStmt(Opt<Expr> p0) {
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
   * Replaces the optional node for the Result child. This is the {@code Opt} node containing the child Result, not the actual child!
   * @param opt The new node to be used as the optional node for the Result child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setResultOpt(Opt<Expr> opt) {
    setChild(opt, 0);
  }
  /**
   * Check whether the optional Result child exists.
   * @return {@code true} if the optional Result child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasResult() {
    return getResultOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Result child.
   * @return The Result child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr getResult() {
    return (Expr)getResultOpt().getChild(0);
  }
  /**
   * Replaces the (optional) Result child.
   * @param node The new node to be used as the Result child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setResult(Expr node) {
    getResultOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Expr> getResultOpt() {
    return (Opt<Expr>)getChild(0);
  }
  /**
   * Retrieves the optional node for child Result. This is the {@code Opt} node containing the child Result, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Result.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Expr> getResultOptNoTransform() {
    return (Opt<Expr>)getChildNoTransform(0);
  }
  /**
   * @apilevel internal
   */
  protected boolean finallyList_computed = false;
  /**
   * @apilevel internal
   */
  protected ArrayList finallyList_value;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:185
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ArrayList finallyList() {
    if(finallyList_computed) {
      return finallyList_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    finallyList_value = finallyList_compute();
      if(isFinal && num == state().boundariesCrossed) finallyList_computed = true;
    return finallyList_value;
  }
  /**
   * @apilevel internal
   */
  private ArrayList finallyList_compute() {
    ArrayList list = new ArrayList();
    collectFinally(this, list);
    return list;
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:649
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
  private boolean isDAafter_compute(Variable v) {  return true;  }
  protected java.util.Map isDUafterReachedFinallyBlocks_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:942
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUafterReachedFinallyBlocks(Variable v) {
    Object _parameters = v;
    if(isDUafterReachedFinallyBlocks_Variable_values == null) isDUafterReachedFinallyBlocks_Variable_values = new java.util.HashMap(4);
    if(isDUafterReachedFinallyBlocks_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDUafterReachedFinallyBlocks_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDUafterReachedFinallyBlocks_Variable_value = isDUafterReachedFinallyBlocks_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDUafterReachedFinallyBlocks_Variable_values.put(_parameters, Boolean.valueOf(isDUafterReachedFinallyBlocks_Variable_value));
    return isDUafterReachedFinallyBlocks_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDUafterReachedFinallyBlocks_compute(Variable v) {
    if(!isDUbefore(v) && finallyList().isEmpty())
      return false;
    for(Iterator iter = finallyList().iterator(); iter.hasNext(); ) {
      FinallyHost f = (FinallyHost)iter.next();
      if(!f.isDUafterFinally(v))
        return false;
    }
    return true;
  }
  protected java.util.Map isDAafterReachedFinallyBlocks_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:978
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAafterReachedFinallyBlocks(Variable v) {
    Object _parameters = v;
    if(isDAafterReachedFinallyBlocks_Variable_values == null) isDAafterReachedFinallyBlocks_Variable_values = new java.util.HashMap(4);
    if(isDAafterReachedFinallyBlocks_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDAafterReachedFinallyBlocks_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDAafterReachedFinallyBlocks_Variable_value = isDAafterReachedFinallyBlocks_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDAafterReachedFinallyBlocks_Variable_values.put(_parameters, Boolean.valueOf(isDAafterReachedFinallyBlocks_Variable_value));
    return isDAafterReachedFinallyBlocks_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDAafterReachedFinallyBlocks_compute(Variable v) {
    if(hasResult() ? getResult().isDAafter(v) : isDAbefore(v))
      return true;
    if(finallyList().isEmpty())
      return false;
    for(Iterator iter = finallyList().iterator(); iter.hasNext(); ) {
      FinallyHost f = (FinallyHost)iter.next();
      if(!f.isDAafterFinally(v))
        return false;
    }
    return true;
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1172
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
  private boolean isDUafter_compute(Variable v) {  return true;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:107
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
  private boolean canCompleteNormally_compute() {  return false;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:539
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
  private SmallSet<CFGNode> succ_compute() {  return hasResult() ? SmallSet.<CFGNode>singleton(getResult().first()) : returnTarget();  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:580
   */
  public SmallSet<CFGNode> collectBranches() {
    ASTNode$State state = state();
    try {  return SmallSet.<CFGNode>singleton(this);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:72
   */
  public TypeDecl type() {
    ASTNode$State state = state();
    try {  return hasResult() ? getResult().type() : typeVoid();  }
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
  /**
   * @attribute syn
   * @aspect ReturnVoid
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/ReturnVoid.jrag:2
   */
  public boolean returnsVoid() {
    ASTNode$State state = state();
    try {  return hasResult() && getResult().type().isVoid();  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:403
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl returnType() {
    ASTNode$State state = state();
    TypeDecl returnType_value = getParent().Define_TypeDecl_returnType(this, null);
    return returnType_value;
  }
  /**
   * @attribute inh
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:71
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeVoid() {
    ASTNode$State state = state();
    TypeDecl typeVoid_value = getParent().Define_TypeDecl_typeVoid(this, null);
    return typeVoid_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:652
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getResultOptNoTransform()) {
      return isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1175
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getResultOptNoTransform()) {
      return isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:38
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_assignConvertedType(ASTNode caller, ASTNode child) {
    if(caller == getResultOptNoTransform()) {
      return returnType();
    }
    else {      return getParent().Define_TypeDecl_assignConvertedType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:540
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getResultOptNoTransform()) {
      return returnTarget();
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:541
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    if(caller == getResultOptNoTransform()) {
      return returnTarget();
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:542
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    if(caller == getResultOptNoTransform()) {
      return returnTarget();
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:69
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getResultOptNoTransform()) {
      return Integer.MAX_VALUE;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:47
   * @apilevel internal
   */
  public boolean Define_boolean_escapes(ASTNode caller, ASTNode child) {
    if(caller == getResultOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_escapes(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
