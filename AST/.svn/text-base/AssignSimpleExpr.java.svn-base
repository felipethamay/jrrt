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
 * @production AssignSimpleExpr : {@link AssignExpr};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:108
 */
public class AssignSimpleExpr extends AssignExpr implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
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
  public AssignSimpleExpr clone() throws CloneNotSupportedException {
    AssignSimpleExpr node = (AssignSimpleExpr)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AssignSimpleExpr copy() {
    try {
      AssignSimpleExpr node = (AssignSimpleExpr) clone();
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
  public AssignSimpleExpr fullCopy() {
    AssignSimpleExpr tree = (AssignSimpleExpr) copy();
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
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:44
   */
  public void typeCheck() {
    if(!getDest().isVariable())
      error("left hand side is not a variable");
    else if(!sourceType().assignConversionTo(getDest().type(), getSource()) && !sourceType().isUnknown())
      error("can not assign " + getDest() + " of type " + getDest().type().typeName() +
            " a value of type " + sourceType().typeName());
  }
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:2
   */
  public void inline() {
		if(!(getParent() instanceof ExprStmt))
			throw new RefactoringException("cannot inline this assignment");
		if(!(getDest() instanceof VarAccess) || !((VarAccess)getDest()).decl().isLocalVariable())
			throw new RefactoringException("can only inline assignment to local variable");
		Stmt stmt = (Stmt)getParent();
		VarAccess v = (VarAccess)getDest();
		Expr rhs = makeConversionExplicit();
		if(!rhs.locationsWritten().isEmpty())
			throw new RefactoringException("cannot inline expressions with side effects");
		SmallSet<Access> U = v.reachedUses();
		SmallSet<CFGNode> C = rhs.collectExceptionalSucc();
		if(!C.isEmpty() && !isAnticipated((VariableDeclaration)v.decl()))
			throw new RefactoringException("expression may throw exception, but not inlined along all paths");
		for(Access u : U) {
			if(u.isDest())
				throw new RefactoringException("cannot inline into destinations");
			if(!u.reachingDefinitions().isSingleton())
				throw new RefactoringException("ambiguous dataflow");
			if(u.hostBodyDecl() != stmt.hostBodyDecl())
				throw new RefactoringException("cannot inline across method boundaries");
			if(!u.isAvailable(rhs))
				throw new RefactoringException("expression to inline not available at inline location");
			for(CFGNode c : C)
				for(CFGNode w : u.precedingDefsUpTo(v))
					if(!c.reachedUsesFor(((Access)w).getLocation()).isEmpty())
						throw new RefactoringException("write to live variable may be lost");
			Expr old_rhs = (Expr)rhs.fullCopyAndDetach();
			rhs.lockAllNames();
			rhs.lockThrowEdges();
			rhs.lockSyncDependencies();
			rhs.replaceWith(old_rhs);
			u.replaceWith(rhs.precedence() > u.maxPrecedence() ? new ParExpr(rhs) : rhs);
			rhs = old_rhs;
			hostType().flushCaches();
		}
		// delete assignment
		stmt.delete();
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:42
   */
  public void doInline() {
		TypeDecl td = hostType();
		inline();
    	td.eliminate(LOCKED_THROW, LOCKED_SYNC, LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect MakeConversionExplicit
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/MakeConversionExplicit.jrag:2
   */
  public Expr makeConversionExplicit() {
		Expr rhs = getSource().makeConversionExplicit(getDest().type());
		setSource(rhs);
		return rhs;
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:150
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(getSource().type().isSubtypeConstrainable() && getDest().type().isSubtypeConstrainable()) {
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "assignment", getSource(), Operator.LE, getDest()));
		} else {
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "assignment", getSource(), Operator.EQ, getSource().type()));
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "assignment", getDest(), Operator.EQ, getDest().type()));			
		}
		addConstraint(constraints, pred, new SimpleTypeConstraint(this, "simple assignment expression", this, Operator.EQ, getDest()));
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public AssignSimpleExpr() {
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
  public AssignSimpleExpr(Expr p0, Expr p1) {
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
   * Replaces the Dest child.
   * @param node The new node to replace the Dest child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setDest(Expr node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Dest child.
   * @return The current node used as the Dest child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Expr getDest() {
    return (Expr)getChild(0);
  }
  /**
   * Retrieves the Dest child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Dest child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Expr getDestNoTransform() {
    return (Expr)getChildNoTransform(0);
  }
  /**
   * Replaces the Source child.
   * @param node The new node to replace the Source child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setSource(Expr node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Source child.
   * @return The current node used as the Source child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Expr getSource() {
    return (Expr)getChild(1);
  }
  /**
   * Retrieves the Source child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Source child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Expr getSourceNoTransform() {
    return (Expr)getChildNoTransform(1);
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:247
   */
  public String printOp() {
    ASTNode$State state = state();
    try {  return " = ";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:121
   */
  public TypeDecl sourceType() {
    ASTNode$State state = state();
    try {  return getSource().type();  }
    finally {
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:17
   * @apilevel internal
   */
  public boolean Define_boolean_isDest(ASTNode caller, ASTNode child) {
    if(caller == getDestNoTransform()) {
      return true;
    }
    else {      return super.Define_boolean_isDest(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:27
   * @apilevel internal
   */
  public boolean Define_boolean_isSource(ASTNode caller, ASTNode child) {
    if(caller == getDestNoTransform()) {
      return false;
    }
    else {      return super.Define_boolean_isSource(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:36
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_assignConvertedType(ASTNode caller, ASTNode child) {
    if(caller == getSourceNoTransform()) {
      return getDest().type();
    }
    else {      return getParent().Define_TypeDecl_assignConvertedType(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
