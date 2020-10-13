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
 * @production AbstractDot : {@link Access} ::= <span class="component">Left:{@link Expr}</span> <span class="component">Right:{@link Access}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:16
 */
public class AbstractDot extends Access implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    type_computed = false;
    type_value = null;
    getLocation_computed = false;
    getLocation_value = null;
    shouldMakeConversionExplicit_TypeDecl_values = null;
    getMonitor_computed = false;
    getMonitor_value = null;
    computeType_int_values = null;
    possibleTypes_computed = false;
    possibleTypes_value = null;
    isDUbefore_Variable_values = null;
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
  public AbstractDot clone() throws CloneNotSupportedException {
    AbstractDot node = (AbstractDot)super.clone();
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.type_computed = false;
    node.type_value = null;
    node.getLocation_computed = false;
    node.getLocation_value = null;
    node.shouldMakeConversionExplicit_TypeDecl_values = null;
    node.getMonitor_computed = false;
    node.getMonitor_value = null;
    node.computeType_int_values = null;
    node.possibleTypes_computed = false;
    node.possibleTypes_value = null;
    node.isDUbefore_Variable_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AbstractDot copy() {
    try {
      AbstractDot node = (AbstractDot) clone();
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
  public AbstractDot fullCopy() {
    AbstractDot tree = (AbstractDot) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:446
   */
  public void toString(StringBuffer s) {
    getLeft().toString(s);
    if(!nextAccess().isArrayAccess())
      s.append(".");
    getRight().toString(s);
  }
  /**
   * @ast method 
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:135
   */
  public Access extractLast() {
    return getRightNoTransform();
 }
  /**
   * @ast method 
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:138
   */
  public void replaceLast(Access access) {
    setRight(access);
  }
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:219
   */
  public Access getDestLocation() {
		return getRight().getDestLocation();
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:115
   */
  public void rotateLeft() {
		Expr l = getLeft(); setLeft(null);
		Access r = getRight(); setRight(null);
		while(r instanceof AbstractDot) {
			AbstractDot rdot = (AbstractDot)r;
			Access rdot_left = (Access) rdot.getLeft(); rdot.setLeft(null);
			l = new AbstractDot(l, rdot_left);
			r = rdot.getRight(); rdot.setRight(null);
		}
		setLeft(l);
		setRight(r);
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:128
   */
  public void rotateRight() {
		Expr l = getLeft(); setLeft(null);
		Access r = getRight(); setRight(null);
		while(l instanceof AbstractDot) {
			AbstractDot ldot = (AbstractDot)l;
			Access ldot_right = (Access)ldot.getRight(); ldot.setRight(null);
			r = new AbstractDot(ldot_right, r);
			l = ldot.getLeft(); ldot.setLeft(null);
		}
		setLeft(l);
		setRight(r);
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:177
   */
  public void eliminateWith(List<Access> qualifiers, TypeDecl hostType) {
		rotateLeft();
		if(isThisAccess() || isSuperAccess()) {
			super.eliminateWith(qualifiers, hostType);
		} else {
			getRight().eliminateWith(qualifiers, hostType);
			getLeft().eliminateWith(qualifiers, hostType);
		}
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:84
   */
  public void removeSuper() {
		rotateLeft();
		if(getLeft().isSuperAccess() && !getRight().isMethodAccess())
			replaceWith(getRight());
		else
			super.removeSuper();
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:78
   */
  public void eliminateLockedNames() {
		if(getRight() instanceof AbstractDot)
			rotateLeft();
		super.eliminateLockedNames();	
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:271
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(!isTypeAccess())
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "abstract dot", this, Operator.EQ, getRight()));
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public AbstractDot() {
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
  public AbstractDot(Expr p0, Access p1) {
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
   * Replaces the Left child.
   * @param node The new node to replace the Left child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setLeft(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Left child.
   * @return The current node used as the Left child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Expr getLeft() {
    return (Expr)getChild(0);
  }
  /**
   * Retrieves the Left child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Left child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Expr getLeftNoTransform() {
    return (Expr)getChildNoTransform(0);
  }
  /**
   * Replaces the Right child.
   * @param node The new node to replace the Right child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setRight(Access node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Right child.
   * @return The current node used as the Right child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Access getRight() {
    return (Access)getChild(1);
  }
  /**
   * Retrieves the Right child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Right child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Access getRightNoTransform() {
    return (Access)getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:98
   */
  public Constant constant() {
    ASTNode$State state = state();
    try {  return lastAccess().constant();  }
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
    try {  return lastAccess().isConstant();  }
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
    try {  return lastAccess().varDecl();  }
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
    try {  return isDAafter(v);  }
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
    try {  return isDAafter(v);  }
    finally {
    }
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:354
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
  private boolean isDAafter_compute(Variable v) {  return lastAccess().isDAafter(v);  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:702
   */
  public boolean isDUafterTrue(Variable v) {
    ASTNode$State state = state();
    try {  return isDUafter(v);  }
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
    try {  return isDUafter(v);  }
    finally {
    }
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:835
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
  private boolean isDUafter_compute(Variable v) {  return lastAccess().isDUafter(v);  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:62
   */
  public String typeName() {
    ASTNode$State state = state();
    try {  return lastAccess().typeName();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:13
   */
  public boolean isTypeAccess() {
    ASTNode$State state = state();
    try {  return getRight().isTypeAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:17
   */
  public boolean isMethodAccess() {
    ASTNode$State state = state();
    try {  return getRight().isMethodAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:21
   */
  public boolean isFieldAccess() {
    ASTNode$State state = state();
    try {  return getRight().isFieldAccess();  }
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
    try {  return getRight().isSuperAccess();  }
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
    try {  return getRight().isThisAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:37
   */
  public boolean isPackageAccess() {
    ASTNode$State state = state();
    try {  return getRight().isPackageAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:41
   */
  public boolean isArrayAccess() {
    ASTNode$State state = state();
    try {  return getRight().isArrayAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:45
   */
  public boolean isClassAccess() {
    ASTNode$State state = state();
    try {  return getRight().isClassAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:49
   */
  public boolean isSuperConstructorAccess() {
    ASTNode$State state = state();
    try {  return getRight().isSuperConstructorAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:58
   */
  public boolean isQualified() {
    ASTNode$State state = state();
    try {  return hasParentDot();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:63
   */
  public Expr leftSide() {
    ASTNode$State state = state();
    try {  return getLeft();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:64
   */
  public Access rightSide() {
    ASTNode$State state = state();
    try {  return getRight/*NoTransform*/() instanceof AbstractDot ? (Access)((AbstractDot)getRight/*NoTransform*/()).getLeft() : (Access)getRight();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:66
   */
  public Access lastAccess() {
    ASTNode$State state = state();
    try {  return getRight().lastAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:75
   */
  public Access nextAccess() {
    ASTNode$State state = state();
    try {  return rightSide();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:77
   */
  public Expr prevExpr() {
    ASTNode$State state = state();
    try {  return leftSide();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:88
   */
  public boolean hasPrevExpr() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:56
   */
  public NameType predNameType() {
    ASTNode$State state = state();
    try {  return getLeft() instanceof Access ? ((Access)getLeft()).predNameType() : NameType.NO_NAME;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:249
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
  private TypeDecl type_compute() {  return lastAccess().type();  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:15
   */
  public boolean isVariable() {
    ASTNode$State state = state();
    try {  return lastAccess().isVariable();  }
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
    try {  return lastAccess().staticContextQualifier();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean getLocation_computed = false;
  /**
   * @apilevel internal
   */
  protected Location getLocation_value;
  /**
   * @attribute syn
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Location getLocation() {
    if(getLocation_computed) {
      return getLocation_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getLocation_value = getLocation_compute();
      if(isFinal && num == state().boundariesCrossed) getLocation_computed = true;
    return getLocation_value;
  }
  /**
   * @apilevel internal
   */
  private Location getLocation_compute() {  return getRight().getLocation();  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return getLeft().first();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:2
   */
  public boolean isStatementExpression() {
    ASTNode$State state = state();
    try {  return getRight().isStatementExpression();  }
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
    try {  return super.notAnObject() || !isArrayAccess() && !isClassAccess() && getRight().notAnObject();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:80
   */
  public Expr convertSuperToThis() {
    ASTNode$State state = state();
    try {  return new AbstractDot(getLeft().convertSuperToThis(), 
														  (Access)getRight().convertSuperToThis());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:85
   */
  public Expr convertThisToSuper() {
    ASTNode$State state = state();
    try {  return new AbstractDot((Expr)getLeft().fullCopyAndDetach(), (Access)getRight().convertThisToSuper());  }
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
    try {  return getLeft().isPure() && getRight().isPure();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:45
   */
  public boolean isFieldAccessInThis(FieldDeclaration fd) {
    ASTNode$State state = state();
    try {  return getLeft().isThisAccess() && getRight().isFieldAccessInThis(fd);  }
    finally {
    }
  }
  protected java.util.Map shouldMakeConversionExplicit_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect MakeConversionExplicit
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/MakeConversionExplicit.jrag:16
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean shouldMakeConversionExplicit(TypeDecl destType) {
    Object _parameters = destType;
    if(shouldMakeConversionExplicit_TypeDecl_values == null) shouldMakeConversionExplicit_TypeDecl_values = new java.util.HashMap(4);
    if(shouldMakeConversionExplicit_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)shouldMakeConversionExplicit_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean shouldMakeConversionExplicit_TypeDecl_value = shouldMakeConversionExplicit_compute(destType);
      if(isFinal && num == state().boundariesCrossed) shouldMakeConversionExplicit_TypeDecl_values.put(_parameters, Boolean.valueOf(shouldMakeConversionExplicit_TypeDecl_value));
    return shouldMakeConversionExplicit_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean shouldMakeConversionExplicit_compute(TypeDecl destType) {  return getRight().shouldMakeConversionExplicit(destType);  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/Monitor.jrag:104
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
  private Monitor getMonitor_compute() {  return getRight().getMonitor();  }
  protected java.util.Map computeType_int_values;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:20
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl computeType(int i) {
    Object _parameters = Integer.valueOf(i);
    if(computeType_int_values == null) computeType_int_values = new java.util.HashMap(4);
    if(computeType_int_values.containsKey(_parameters)) {
      return (TypeDecl)computeType_int_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    TypeDecl computeType_int_value = computeType_compute(i);
      if(isFinal && num == state().boundariesCrossed) computeType_int_values.put(_parameters, computeType_int_value);
    return computeType_int_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl computeType_compute(int i) {  return getRight().computeType(i);  }
  /**
   * @apilevel internal
   */
  protected boolean possibleTypes_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeDecl> possibleTypes_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:87
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeDecl> possibleTypes() {
    if(possibleTypes_computed) {
      return possibleTypes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    possibleTypes_value = possibleTypes_compute();
      if(isFinal && num == state().boundariesCrossed) possibleTypes_computed = true;
    return possibleTypes_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeDecl> possibleTypes_compute() {  return getRight().possibleTypes();  }
  protected java.util.Map isDUbefore_Variable_values;
  /**
   * @attribute inh
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:697
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUbefore(Variable v) {
    Object _parameters = v;
    if(isDUbefore_Variable_values == null) isDUbefore_Variable_values = new java.util.HashMap(4);
    if(isDUbefore_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDUbefore_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDUbefore_Variable_value = getParent().Define_boolean_isDUbefore(this, null, v);
      if(isFinal && num == state().boundariesCrossed) isDUbefore_Variable_values.put(_parameters, Boolean.valueOf(isDUbefore_Variable_value));
    return isDUbefore_Variable_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:21
   * @apilevel internal
   */
  public boolean Define_boolean_isDest(ASTNode caller, ASTNode child) {
    if(caller == getLeftNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isDest(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:31
   * @apilevel internal
   */
  public boolean Define_boolean_isSource(ASTNode caller, ASTNode child) {
    if(caller == getLeftNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_isSource(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:353
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getRightNoTransform()) {
      return getLeft().isDAafter(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:834
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getRightNoTransform()) {
      return getLeft().isDUafter(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:17
   * @apilevel internal
   */
  public Collection Define_Collection_lookupConstructor(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return getLeft().type().constructors();
    }
    else {      return getParent().Define_Collection_lookupConstructor(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:25
   * @apilevel internal
   */
  public Collection Define_Collection_lookupSuperConstructor(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return getLeft().type().lookupSuperConstructor();
    }
    else {      return getParent().Define_Collection_lookupSuperConstructor(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:20
   * @apilevel internal
   */
  public Expr Define_Expr_nestedScope(ASTNode caller, ASTNode child) {
    if(caller == getLeftNoTransform()) {
      return isQualified() ? nestedScope() : this;
    }
    else if(caller == getRightNoTransform()) {
      return isQualified() ? nestedScope() : this;
    }
    else {      return getParent().Define_Expr_nestedScope(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:64
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
    if(caller == getRightNoTransform()) {
      return getLeft().type().memberMethods(name);
    }
    else {      return getParent().Define_Collection_lookupMethod(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:82
   * @apilevel internal
   */
  public boolean Define_boolean_hasPackage(ASTNode caller, ASTNode child, String packageName) {
    if(caller == getRightNoTransform()) {
      return getLeft().hasQualifiedPackage(packageName);
    }
    else {      return getParent().Define_boolean_hasPackage(this, caller, packageName);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:429
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    if(caller == getRightNoTransform()) {
      return getLeft().qualifiedLookupType(name);
    }
    else {      return getParent().Define_SimpleSet_lookupType(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:139
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getRightNoTransform()) {
      return getLeft().qualifiedLookupVariable(name);
    }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:59
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getLeftNoTransform()) {
      return getRight().predNameType();
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:516
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingInstance(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return getLeft().type();
    }
    else {      return getParent().Define_TypeDecl_enclosingInstance(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:13
   * @apilevel internal
   */
  public String Define_String_methodHost(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return getLeft().type().typeName();
    }
    else {      return getParent().Define_String_methodHost(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:290
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return SmallSet.<CFGNode>singleton(this);
    }
    else if(caller == getLeftNoTransform()) {
      return SmallSet.<CFGNode>singleton(getRight().first());
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:35
   * @apilevel internal
   */
  public boolean Define_boolean_inInextractiblePosition(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_inInextractiblePosition(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:64
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getRightNoTransform()) {
      return 0;
    }
    else if(caller == getLeftNoTransform()) {
      return getRight().isArrayAccess() ? 0 : 1;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:53
   * @apilevel internal
   */
  public boolean Define_boolean_escapes(ASTNode caller, ASTNode child) {
    if(caller == getLeftNoTransform()){
		Access acc = rightSide();
		if(acc instanceof MethodAccess) {
			return ((MethodAccess)acc).thisEscapes(getLeft());
		} else {
			return acc instanceof ConstructorAccess || acc instanceof ClassInstanceExpr;
		}
	}
    else {      return getParent().Define_boolean_escapes(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:113
   * @apilevel internal
   */
  public MethodAccessInfo Define_MethodAccessInfo_accessMethod(ASTNode caller, ASTNode child, MethodDecl md) {
    if(caller == getRightNoTransform()) {
      return getLeft().type().accessMemberMethod(md);
    }
    else {      return getParent().Define_MethodAccessInfo_accessMethod(this, caller, md);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:256
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getRightNoTransform()) {
      return getLeft().qualifiedAccessVariable(decl);
    }
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
