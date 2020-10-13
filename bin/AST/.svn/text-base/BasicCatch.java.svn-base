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
 * A catch clause which can catch a single exception type.
 * @production BasicCatch : {@link CatchClause} ::= <span class="component">Parameter:{@link ParameterDeclaration}</span> <span class="component">{@link Block}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/CatchClause.ast:9
 */
public class BasicCatch extends CatchClause implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    parameterDeclaration_String_values = null;
    accessParameter_Variable_values = null;
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
  public BasicCatch clone() throws CloneNotSupportedException {
    BasicCatch node = (BasicCatch)super.clone();
    node.parameterDeclaration_String_values = null;
    node.accessParameter_Variable_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BasicCatch copy() {
    try {
      BasicCatch node = (BasicCatch) clone();
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
  public BasicCatch fullCopy() {
    BasicCatch tree = (BasicCatch) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:722
   */
  public void toString(StringBuffer s) {
    s.append("catch (");
    getParameter().toString(s);
    s.append(") ");
    getBlock().toString(s);
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:368
   */
  public void typeCheck() {
    if(!getParameter().type().instanceOf(typeThrowable()))
      error("*** The catch variable must extend Throwable");
  }
  /**
   * @ast method 
   * @aspect ParameterExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:25
   */
  public int getNumParameter() { return 1; }
  /**
   * @ast method 
   * @aspect ParameterExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:26
   */
  public ParameterDeclaration getParameter(int i) {
		if(i == 0)
			return getParameter();
		throw new IllegalArgumentException("catch clauses only have one argument");
	}
  /**
   * @ast method 
   * @aspect ParameterExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:31
   */
  public int getIndexOfParameter(ParameterDeclaration pd) {
		return pd == this.getParameter() ? 0 : -1;
	}
  /**
   * @ast method 
   * 
   */
  public BasicCatch() {
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
    children = new ASTNode[2];
  }
  /**
   * @ast method 
   * 
   */
  public BasicCatch(ParameterDeclaration p0, Block p1) {
    setChild(p0, 0);
    setChild(p1, 1);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 2;
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
   * Replaces the Parameter child.
   * @param node The new node to replace the Parameter child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setParameter(ParameterDeclaration node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Parameter child.
   * @return The current node used as the Parameter child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public ParameterDeclaration getParameter() {
    return (ParameterDeclaration)getChild(0);
  }
  /**
   * Retrieves the Parameter child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Parameter child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public ParameterDeclaration getParameterNoTransform() {
    return (ParameterDeclaration)getChildNoTransform(0);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBlock(Block node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Block getBlock() {
    return (Block)getChild(1);
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
    return (Block)getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:212
   */
  public boolean handles(TypeDecl exceptionType) {
    ASTNode$State state = state();
    try {  return !getParameter().type().isUnknown()
    && exceptionType.instanceOf(getParameter().type());  }
    finally {
    }
  }
  protected java.util.Map parameterDeclaration_String_values;
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:113
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet parameterDeclaration(String name) {
    Object _parameters = name;
    if(parameterDeclaration_String_values == null) parameterDeclaration_String_values = new java.util.HashMap(4);
    if(parameterDeclaration_String_values.containsKey(_parameters)) {
      return (SimpleSet)parameterDeclaration_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet parameterDeclaration_String_value = parameterDeclaration_compute(name);
      if(isFinal && num == state().boundariesCrossed) parameterDeclaration_String_values.put(_parameters, parameterDeclaration_String_value);
    return parameterDeclaration_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet parameterDeclaration_compute(String name) {  return getParameter().name().equals(name) ? getParameter() : SimpleSet.emptySet;  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:755
   */
  public boolean handlesAllUncheckedExceptions() {
    ASTNode$State state = state();
    try {  return handles(typeRuntimeException()) && handles(typeError());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:761
   */
  public boolean handlesUncheckedException() {
    ASTNode$State state = state();
    try {  return handles(typeRuntimeException()) || handles(typeError())
			|| getParameter().type().instanceOf(typeRuntimeException())
			|| getParameter().type().instanceOf(typeError());  }
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
    try {  return getParameter().name().equals(name);  }
    finally {
    }
  }
  protected java.util.Map accessParameter_Variable_values;
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:232
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessParameter(Variable decl) {
    Object _parameters = decl;
    if(accessParameter_Variable_values == null) accessParameter_Variable_values = new java.util.HashMap(4);
    if(accessParameter_Variable_values.containsKey(_parameters)) {
      return (SymbolicVarAccess)accessParameter_Variable_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SymbolicVarAccess accessParameter_Variable_value = accessParameter_compute(decl);
      if(isFinal && num == state().boundariesCrossed) accessParameter_Variable_values.put(_parameters, accessParameter_Variable_value);
    return accessParameter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private SymbolicVarAccess accessParameter_compute(Variable decl) {  return getParameter() == decl ? getParameter() : unknownVarAccess();  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:83
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterNoTransform()) {
      return parameterDeclaration(name);
    }
    else {      return super.Define_SimpleSet_lookupVariable(caller, child, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:295
   * @apilevel internal
   */
  public VariableScope Define_VariableScope_outerScope(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return this;
    }
    else {      return getParent().Define_VariableScope_outerScope(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:86
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:122
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return reachableCatchClause(getParameter().type());
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:64
   * @apilevel internal
   */
  public boolean Define_boolean_isMethodParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isMethodParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:65
   * @apilevel internal
   */
  public boolean Define_boolean_isConstructorParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isConstructorParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:66
   * @apilevel internal
   */
  public boolean Define_boolean_isExceptionHandlerParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_isExceptionHandlerParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:23
   * @apilevel internal
   */
  public boolean Define_boolean_variableArityValid(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_variableArityValid(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:553
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return SmallSet.<CFGNode>singleton(getBlock());
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:39
   * @apilevel internal
   */
  public Parameterisable Define_Parameterisable_parameterOwner(ASTNode caller, ASTNode child) {
    if(caller == getParameterNoTransform()) {
      return this;
    }
    else {      return getParent().Define_Parameterisable_parameterOwner(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:207
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getParameterNoTransform()) {
      return accessParameter(decl);
    }
    else {      return super.Define_SymbolicVarAccess_accessVariable(caller, child, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:26
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterNoTransform()) {
      return !hasNestingLocal(name) && !hasNestedLocal(name);
    }
    else {      return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
