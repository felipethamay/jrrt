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
 * @production ForStmt : {@link BranchTargetStmt} ::= <span class="component">InitStmt:{@link Stmt}*</span> <span class="component">[Condition:{@link Expr}]</span> <span class="component">UpdateStmt:{@link Stmt}*</span> <span class="component">{@link Stmt}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:210
 */
public class ForStmt extends BranchTargetStmt implements Cloneable, VariableScope, Scope {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    targetOf_ContinueStmt_values = null;
    targetOf_BreakStmt_values = null;
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    isDUbeforeCondition_Variable_values = null;
    localLookup_String_values = null;
    localVariableDeclaration_String_values = null;
    canCompleteNormally_computed = false;
    succ_computed = false;
    succ_value = null;
    accessLocalVariable_Variable_values = null;
    lookupVariable_String_values = null;
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
  public ForStmt clone() throws CloneNotSupportedException {
    ForStmt node = (ForStmt)super.clone();
    node.targetOf_ContinueStmt_values = null;
    node.targetOf_BreakStmt_values = null;
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.isDUbeforeCondition_Variable_values = null;
    node.localLookup_String_values = null;
    node.localVariableDeclaration_String_values = null;
    node.canCompleteNormally_computed = false;
    node.succ_computed = false;
    node.succ_value = null;
    node.accessLocalVariable_Variable_values = null;
    node.lookupVariable_String_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ForStmt copy() {
    try {
      ForStmt node = (ForStmt) clone();
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
  public ForStmt fullCopy() {
    ForStmt tree = (ForStmt) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:604
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    s.append("for(");
    if(getNumInitStmt() > 0) {
      if(getInitStmt(0) instanceof VariableDeclaration) {
        int minDimension = Integer.MAX_VALUE;
        for(int i = 0; i < getNumInitStmt(); i++) {
          VariableDeclaration v = (VariableDeclaration)getInitStmt(i);
          minDimension = Math.min(minDimension, v.type().dimension());
        }
        VariableDeclaration v = (VariableDeclaration)getInitStmt(0);
        v.getModifiers().toString(s);
        s.append(v.type().elementType().typeName());
        for(int i = minDimension; i > 0; i--)
          s.append("[]");

        for(int i = 0; i < getNumInitStmt(); i++) {
          if(i != 0)
            s.append(",");
          v = (VariableDeclaration)getInitStmt(i);
          s.append(" " + v.name());
          for(int j = v.type().dimension() - minDimension; j > 0; j--)
            s.append("[]");
          if(v.hasInit()) {
            s.append(" = ");
            v.getInit().toString(s);
          }
        }
      }
      else if(getInitStmt(0) instanceof ExprStmt) {
        ExprStmt stmt = (ExprStmt)getInitStmt(0);
        stmt.getExpr().toString(s);
        for(int i = 1; i < getNumInitStmt(); i++) {
          s.append(", ");
          stmt = (ExprStmt)getInitStmt(i);
          stmt.getExpr().toString(s);
        }
      }
      else {
        throw new Error("Unexpected initializer in for loop: " + getInitStmt(0));
      }
    }
    
    s.append("; ");
    if(hasCondition()) {
      getCondition().toString(s);
    }
    s.append("; ");

    if(getNumUpdateStmt() > 0) {
      ExprStmt stmt = (ExprStmt)getUpdateStmt(0);
      stmt.getExpr().toString(s);
      for(int i = 1; i < getNumUpdateStmt(); i++) {
        s.append(", ");
        stmt = (ExprStmt)getUpdateStmt(i);
        stmt.getExpr().toString(s);
      }
    }
    
    s.append(") ");
    getStmt().toString(s);
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:334
   */
  public void typeCheck() {
    if(hasCondition()) {
      TypeDecl cond = getCondition().type();
      if(!cond.isBoolean()) {
        error("the type of \"" + getCondition() + "\" is " + cond.name() + " which is not boolean");
      }
    }
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
  public ForStmt() {
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
    children = new ASTNode[4];
    setChild(new List(), 0);
    setChild(new Opt(), 1);
    setChild(new List(), 2);
  }
  /**
   * @ast method 
   * 
   */
  public ForStmt(List<Stmt> p0, Opt<Expr> p1, List<Stmt> p2, Stmt p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
    setChild(p3, 3);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 4;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean mayHaveRewrite() {
    return true;
  }
  /**
   * Replaces the InitStmt list.
   * @param list The new list node to be used as the InitStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setInitStmtList(List<Stmt> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the InitStmt list.
   * @return Number of children in the InitStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumInitStmt() {
    return getInitStmtList().getNumChild();
  }
  /**
   * Retrieves the number of children in the InitStmt list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the InitStmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumInitStmtNoTransform() {
    return getInitStmtListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the InitStmt list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the InitStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt getInitStmt(int i) {
    return (Stmt)getInitStmtList().getChild(i);
  }
  /**
   * Append an element to the InitStmt list.
   * @param node The element to append to the InitStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addInitStmt(Stmt node) {
    List<Stmt> list = (parent == null || state == null) ? getInitStmtListNoTransform() : getInitStmtList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addInitStmtNoTransform(Stmt node) {
    List<Stmt> list = getInitStmtListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the InitStmt list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setInitStmt(Stmt node, int i) {
    List<Stmt> list = getInitStmtList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the InitStmt list.
   * @return The node representing the InitStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Stmt> getInitStmts() {
    return getInitStmtList();
  }
  /**
   * Retrieves the InitStmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the InitStmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Stmt> getInitStmtsNoTransform() {
    return getInitStmtListNoTransform();
  }
  /**
   * Retrieves the InitStmt list.
   * @return The node representing the InitStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Stmt> getInitStmtList() {
    List<Stmt> list = (List<Stmt>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the InitStmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the InitStmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Stmt> getInitStmtListNoTransform() {
    return (List<Stmt>)getChildNoTransform(0);
  }
  /**
   * Replaces the optional node for the Condition child. This is the {@code Opt} node containing the child Condition, not the actual child!
   * @param opt The new node to be used as the optional node for the Condition child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setConditionOpt(Opt<Expr> opt) {
    setChild(opt, 1);
  }
  /**
   * Check whether the optional Condition child exists.
   * @return {@code true} if the optional Condition child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasCondition() {
    return getConditionOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Condition child.
   * @return The Condition child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr getCondition() {
    return (Expr)getConditionOpt().getChild(0);
  }
  /**
   * Replaces the (optional) Condition child.
   * @param node The new node to be used as the Condition child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setCondition(Expr node) {
    getConditionOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Expr> getConditionOpt() {
    return (Opt<Expr>)getChild(1);
  }
  /**
   * Retrieves the optional node for child Condition. This is the {@code Opt} node containing the child Condition, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Condition.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Expr> getConditionOptNoTransform() {
    return (Opt<Expr>)getChildNoTransform(1);
  }
  /**
   * Replaces the UpdateStmt list.
   * @param list The new list node to be used as the UpdateStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setUpdateStmtList(List<Stmt> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the UpdateStmt list.
   * @return Number of children in the UpdateStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumUpdateStmt() {
    return getUpdateStmtList().getNumChild();
  }
  /**
   * Retrieves the number of children in the UpdateStmt list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the UpdateStmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumUpdateStmtNoTransform() {
    return getUpdateStmtListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the UpdateStmt list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the UpdateStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt getUpdateStmt(int i) {
    return (Stmt)getUpdateStmtList().getChild(i);
  }
  /**
   * Append an element to the UpdateStmt list.
   * @param node The element to append to the UpdateStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addUpdateStmt(Stmt node) {
    List<Stmt> list = (parent == null || state == null) ? getUpdateStmtListNoTransform() : getUpdateStmtList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addUpdateStmtNoTransform(Stmt node) {
    List<Stmt> list = getUpdateStmtListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the UpdateStmt list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setUpdateStmt(Stmt node, int i) {
    List<Stmt> list = getUpdateStmtList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the UpdateStmt list.
   * @return The node representing the UpdateStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Stmt> getUpdateStmts() {
    return getUpdateStmtList();
  }
  /**
   * Retrieves the UpdateStmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the UpdateStmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Stmt> getUpdateStmtsNoTransform() {
    return getUpdateStmtListNoTransform();
  }
  /**
   * Retrieves the UpdateStmt list.
   * @return The node representing the UpdateStmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Stmt> getUpdateStmtList() {
    List<Stmt> list = (List<Stmt>)getChild(2);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the UpdateStmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the UpdateStmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Stmt> getUpdateStmtListNoTransform() {
    return (List<Stmt>)getChildNoTransform(2);
  }
  /**
   * Replaces the Stmt child.
   * @param node The new node to replace the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setStmt(Stmt node) {
    setChild(node, 3);
  }
  /**
   * Retrieves the Stmt child.
   * @return The current node used as the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Stmt getStmt() {
    return (Stmt)getChild(3);
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
    return (Stmt)getChildNoTransform(3);
  }
  protected java.util.Map targetOf_ContinueStmt_values;
  /**
   * @attribute syn
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:71
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
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:79
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
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:612
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
    if(!(!hasCondition() || getCondition().isDAafterFalse(v)))
      return false;
    for(Iterator iter = targetBreaks().iterator(); iter.hasNext(); ) {
      BreakStmt stmt = (BreakStmt)iter.next();
      if(!stmt.isDAafterReachedFinallyBlocks(v))
        return false;
    }
    return true;
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:625
   */
  public boolean isDAafterInitialization(Variable v) {
    ASTNode$State state = state();
    try {  return getNumInitStmt() == 0 ? isDAbefore(v) : getInitStmt(getNumInitStmt()-1).isDAafter(v);  }
    finally {
    }
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1096
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
    if(!isDUbeforeCondition(v)) // start a circular evaluation here
      return false;
    if(!(!hasCondition() || getCondition().isDUafterFalse(v))) {
      return false;
    }
    for(Iterator iter = targetBreaks().iterator(); iter.hasNext(); ) {
      BreakStmt stmt = (BreakStmt)iter.next();
      if(!stmt.isDUafterReachedFinallyBlocks(v))
        return false;
    }
    //if(!isDUafterUpdate(v))
    //  return false;
    return true;
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1116
   */
  public boolean isDUafterInit(Variable v) {
    ASTNode$State state = state();
    try {  return getNumInitStmt() == 0 ? isDUbefore(v) : getInitStmt(getNumInitStmt()-1).isDUafter(v);  }
    finally {
    }
  }
  protected java.util.Map isDUbeforeCondition_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1118
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUbeforeCondition(Variable v) {
    Object _parameters = v;
    if(isDUbeforeCondition_Variable_values == null) isDUbeforeCondition_Variable_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isDUbeforeCondition_Variable_values.containsKey(_parameters)) {
      Object _o = isDUbeforeCondition_Variable_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isDUbeforeCondition_Variable_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isDUbeforeCondition_Variable_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isDUbeforeCondition_Variable_value = isDUbeforeCondition_compute(v);
        if (new_isDUbeforeCondition_Variable_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isDUbeforeCondition_Variable_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isDUbeforeCondition_Variable_values.put(_parameters, new_isDUbeforeCondition_Variable_value);
      }
      else {
        isDUbeforeCondition_Variable_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isDUbeforeCondition_compute(v);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isDUbeforeCondition_Variable_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isDUbeforeCondition_Variable_value = isDUbeforeCondition_compute(v);
      if (state.RESET_CYCLE) {
        isDUbeforeCondition_Variable_values.remove(_parameters);
      }
      else if (new_isDUbeforeCondition_Variable_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isDUbeforeCondition_Variable_value;
      }
      return new_isDUbeforeCondition_Variable_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isDUbeforeCondition_compute(Variable v) {
    if(!isDUafterInit(v))
      return false;
    else if(!isDUafterUpdate(v))
      return false;
    return true;
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1129
   */
  public boolean isDUafterUpdate(Variable v) {
    ASTNode$State state = state();
    try {
    if(!isDUbeforeCondition(v)) // start a circular evaluation here
      return false;
    if(getNumUpdateStmt() > 0)
      return getUpdateStmt(getNumUpdateStmt()-1).isDUafter(v);
    if(!getStmt().isDUafter(v))
      return false;
    for(Iterator iter = targetContinues().iterator(); iter.hasNext(); ) {
      ContinueStmt stmt = (ContinueStmt)iter.next();
      if(!stmt.isDUafterReachedFinallyBlocks(v))
        return false;
    }
    return true;
  }
    finally {
    }
  }
  protected java.util.Map localLookup_String_values;
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:91
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet localLookup(String name) {
    Object _parameters = name;
    if(localLookup_String_values == null) localLookup_String_values = new java.util.HashMap(4);
    if(localLookup_String_values.containsKey(_parameters)) {
      return (SimpleSet)localLookup_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet localLookup_String_value = localLookup_compute(name);
      if(isFinal && num == state().boundariesCrossed) localLookup_String_values.put(_parameters, localLookup_String_value);
    return localLookup_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet localLookup_compute(String name) {
    VariableDeclaration v = localVariableDeclaration(name);
    if(v != null) return v;
    return lookupVariable(name);
  }
  protected java.util.Map localVariableDeclaration_String_values;
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:123
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableDeclaration localVariableDeclaration(String name) {
    Object _parameters = name;
    if(localVariableDeclaration_String_values == null) localVariableDeclaration_String_values = new java.util.HashMap(4);
    if(localVariableDeclaration_String_values.containsKey(_parameters)) {
      return (VariableDeclaration)localVariableDeclaration_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    VariableDeclaration localVariableDeclaration_String_value = localVariableDeclaration_compute(name);
      if(isFinal && num == state().boundariesCrossed) localVariableDeclaration_String_values.put(_parameters, localVariableDeclaration_String_value);
    return localVariableDeclaration_String_value;
  }
  /**
   * @apilevel internal
   */
  private VariableDeclaration localVariableDeclaration_compute(String name) {
    for(int i = 0; i < getNumInitStmt(); i++)
      if(getInitStmt(i).declaresVariable(name))
        return (VariableDeclaration)getInitStmt(i);
    return null;
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
  protected boolean canCompleteNormally_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_value;
  /**
   * @attribute syn
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:102
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
  private boolean canCompleteNormally_compute() {  return reachable() && hasCondition() && (!getCondition().isConstant() || !getCondition().isTrue()) || reachableBreak();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:464
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
  private SmallSet<CFGNode> succ_compute() {  return SmallSet.<CFGNode>singleton(getNumInitStmt() > 0 ? getInitStmt(0) : getCondition().first());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:768
   */
  public CFGNode targetForContinue() {
    ASTNode$State state = state();
    try {  return getNumUpdateStmt() > 0 ? getUpdateStmt(0) : (hasCondition() ? getCondition().first() : getStmt());  }
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
    try {  return localVariableDeclaration(name) != null;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:217
   */
  public SymbolicVarAccess localAccess(Variable decl) {
    ASTNode$State state = state();
    try {
		SymbolicVarAccess acc = accessLocalVariable(decl);
		if(!acc.isUnknownVarAccess()) return acc;
		return accessVariable(decl).moveInto(this);
	}
    finally {
    }
  }
  protected java.util.Map accessLocalVariable_Variable_values;
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:242
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessLocalVariable(Variable decl) {
    Object _parameters = decl;
    if(accessLocalVariable_Variable_values == null) accessLocalVariable_Variable_values = new java.util.HashMap(4);
    if(accessLocalVariable_Variable_values.containsKey(_parameters)) {
      return (SymbolicVarAccess)accessLocalVariable_Variable_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SymbolicVarAccess accessLocalVariable_Variable_value = accessLocalVariable_compute(decl);
      if(isFinal && num == state().boundariesCrossed) accessLocalVariable_Variable_values.put(_parameters, accessLocalVariable_Variable_value);
    return accessLocalVariable_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private SymbolicVarAccess accessLocalVariable_compute(Variable decl) {
		for(Stmt s : getInitStmts())
			if(s == decl)
				return (LocalDeclaration)decl;
		return unknownVarAccess();
	}
  protected java.util.Map lookupVariable_String_values;
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:18
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    Object _parameters = name;
    if(lookupVariable_String_values == null) lookupVariable_String_values = new java.util.HashMap(4);
    if(lookupVariable_String_values.containsKey(_parameters)) {
      return (SimpleSet)lookupVariable_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
      if(isFinal && num == state().boundariesCrossed) lookupVariable_String_values.put(_parameters, lookupVariable_String_value);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:134
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:636
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getUpdateStmtListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    if(!getStmt().isDAafter(v))
      return false;
    for(Iterator iter = targetContinues().iterator(); iter.hasNext(); ) {
      ContinueStmt stmt = (ContinueStmt)iter.next();
      if(!stmt.isDAafterReachedFinallyBlocks(v))
        return false;
    }
    return true;
  }
  }
    else if(caller == getStmtNoTransform()){
    if(hasCondition() && getCondition().isDAafterTrue(v))
      return true;
    if(!hasCondition() && isDAafterInitialization(v))
      return true;
    return false;
  }
    else if(caller == getConditionOptNoTransform()) {
      return isDAafterInitialization(v);
    }
    else if(caller == getInitStmtListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return i == 0 ? isDAbefore(v) : getInitStmt(i-1).isDAafter(v);
  }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1145
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getUpdateStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
    if(!isDUbeforeCondition(v)) // start a circular evaluation here
      return false;
    if(i == 0) {
      if(!getStmt().isDUafter(v))
        return false;
      for(Iterator iter = targetContinues().iterator(); iter.hasNext(); ) {
        ContinueStmt stmt = (ContinueStmt)iter.next();
        if(!stmt.isDUafterReachedFinallyBlocks(v))
          return false;
      }
      return true;
    }
    else
      return getUpdateStmt(i-1).isDUafter(v);
  }
  }
    else if(caller == getStmtNoTransform()) {
      return isDUbeforeCondition(v) && (hasCondition() ?
    getCondition().isDUafterTrue(v) : isDUafterInit(v));
    }
    else if(caller == getConditionOptNoTransform()) {
      return isDUbeforeCondition(v);
    }
    else if(caller == getInitStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return childIndex == 0 ? isDUbefore(v) : getInitStmt(childIndex-1).isDUafter(v);
  }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:90
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtNoTransform()) {
      return localLookup(name);
    }
    else if(caller == getUpdateStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return localLookup(name);
  }
    else if(caller == getConditionOptNoTransform()) {
      return localLookup(name);
    }
    else if(caller == getInitStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return localLookup(name);
  }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:299
   * @apilevel internal
   */
  public VariableScope Define_VariableScope_outerScope(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return this;
    }
    else if(caller == getInitStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return this;
  }
    else {      return getParent().Define_VariableScope_outerScope(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:370
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:103
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return reachable() && (!hasCondition() || (!getCondition().isConstant() || !getCondition().isFalse()));
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:151
   * @apilevel internal
   */
  public boolean Define_boolean_reportUnreachable(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return reachable();
    }
    else {      return getParent().Define_boolean_reportUnreachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:473
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getUpdateStmtListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return SmallSet.<CFGNode>singleton(i + 1 < getNumUpdateStmt() ? getUpdateStmt(i + 1) : getCondition().first());
  }
    else if(caller == getStmtNoTransform()) {
      return SmallSet.<CFGNode>singleton(getNumUpdateStmt() > 0 ? getUpdateStmt(0) : getCondition().first());
    }
    else if(caller == getConditionOptNoTransform()) {
      return getCondition().followingWhenTrue().union(getCondition().followingWhenFalse());
    }
    else if(caller == getInitStmtListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return SmallSet.<CFGNode>singleton(i + 1 < getNumInitStmt() ? getInitStmt(i + 1) : getCondition().first());
  }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:468
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    if(caller == getConditionOptNoTransform()) {
      return SmallSet.<CFGNode>singleton(getStmt());
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:469
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    if(caller == getConditionOptNoTransform()) {
      return following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:72
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getConditionOptNoTransform()) {
      return Integer.MAX_VALUE;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:214
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getStmtNoTransform()) {
      return localAccess(decl);
    }
    else if(caller == getUpdateStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return localAccess(decl);
  }
    else if(caller == getConditionOptNoTransform()) {
      return localAccess(decl);
    }
    else if(caller == getInitStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return localAccess(decl);
  }
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:22
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    if(caller == getInitStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return !hasNestingLocal(name) && !hasNestedLocal(name);
  }
    else {      return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:14
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()){ setStmt(new EmptyStmt()); return true; }
    else if(caller == getUpdateStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    { getUpdateStmtList().removeChild(i); return true; }
  }
    else if(caller == getInitStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    { getInitStmtList().removeChild(i); return true; }
  }
    else {      return getParent().Define_boolean_delete(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:42
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtNoTransform()){
		setStmt(new Block(new List<Stmt>().add(s).add(getStmt())));
		return s;
	}
    else if(caller == getUpdateStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return insertStmtBefore(s);
  }
    else if(caller == getInitStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return insertStmtBefore(s);
  }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:99
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtNoTransform()){
		if(!getStmt().canCompleteNormally())
			throw new RefactoringException("cannot insert statement here");
		setStmt(new Block(new List<Stmt>().add(getStmt()).add(s)));
		return s;
	}
    else if(caller == getUpdateStmtListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    { throw new RefactoringException("cannot insert statement here"); }
  }
    else if(caller == getInitStmtListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    { throw new RefactoringException("cannot insert statement here"); }
  }
    else {      return getParent().Define_Stmt_insertStmtAfter(this, caller, s);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    // Declared in /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag at line 1163
    if(!hasCondition()) {
      state().duringDU++;
      ASTNode result = rewriteRule0();
      state().duringDU--;
      return result;
    }

    return super.rewriteTo();
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1163
   * @apilevel internal
   */  private ForStmt rewriteRule0() {
{
      setCondition(new BooleanLiteral("true"));
      return this;
    }  }
}
