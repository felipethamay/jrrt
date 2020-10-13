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
 * @production WithStmt : {@link Stmt} ::= <span class="component">Qualifier:{@link Access}*</span> <span class="component">{@link Stmt}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.ast:1
 */
public class WithStmt extends Stmt implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
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
  public WithStmt clone() throws CloneNotSupportedException {
    WithStmt node = (WithStmt)super.clone();
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
  public WithStmt copy() {
    try {
      WithStmt node = (WithStmt) clone();
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
  public WithStmt fullCopy() {
    WithStmt tree = (WithStmt) copy();
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
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:2
   */
  public WithStmt(Access acc, Block block) {
		this(new List<Access>().add(acc), block);
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:7
   */
  public void toString(StringBuffer s) {
		s.append(indent());
		s.append("with(");
		for(int i=0;i<getNumQualifier();++i) {
			if(i!=0)
				s.append(", ");
			getQualifier(i).toString(s);
		}
		s.append(") ");
		getStmt().toString(s);
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:108
   */
  public Stmt eliminateWith() {
		getStmt().eliminateWith(getQualifiers(), hostType());
		getStmt().removeSyntheticThis();
		return getStmt();
	}
  /**
   * @ast method 
   * 
   */
  public WithStmt() {
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
    setChild(new List(), 0);
  }
  /**
   * @ast method 
   * 
   */
  public WithStmt(List<Access> p0, Stmt p1) {
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
   * Replaces the Qualifier list.
   * @param list The new list node to be used as the Qualifier list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setQualifierList(List<Access> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Qualifier list.
   * @return Number of children in the Qualifier list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumQualifier() {
    return getQualifierList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Qualifier list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Qualifier list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumQualifierNoTransform() {
    return getQualifierListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Qualifier list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Qualifier list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getQualifier(int i) {
    return (Access)getQualifierList().getChild(i);
  }
  /**
   * Append an element to the Qualifier list.
   * @param node The element to append to the Qualifier list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addQualifier(Access node) {
    List<Access> list = (parent == null || state == null) ? getQualifierListNoTransform() : getQualifierList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addQualifierNoTransform(Access node) {
    List<Access> list = getQualifierListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Qualifier list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setQualifier(Access node, int i) {
    List<Access> list = getQualifierList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Qualifier list.
   * @return The node representing the Qualifier list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Access> getQualifiers() {
    return getQualifierList();
  }
  /**
   * Retrieves the Qualifier list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Qualifier list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Access> getQualifiersNoTransform() {
    return getQualifierListNoTransform();
  }
  /**
   * Retrieves the Qualifier list.
   * @return The node representing the Qualifier list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getQualifierList() {
    List<Access> list = (List<Access>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Qualifier list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Qualifier list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getQualifierListNoTransform() {
    return (List<Access>)getChildNoTransform(0);
  }
  /**
   * Replaces the Stmt child.
   * @param node The new node to replace the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setStmt(Stmt node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the Stmt child.
   * @return The current node used as the Stmt child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Stmt getStmt() {
    return (Stmt)getChild(1);
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
    return (Stmt)getChildNoTransform(1);
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
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:69
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
  private SmallSet<CFGNode> succ_compute() {  return getNumQualifier() == 0 ? SmallSet.<CFGNode>singleton(getStmt()) : SmallSet.<CFGNode>singleton(getQualifier(0).first());  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:20
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return getNumQualifier() == 0;
    }
    else {      return getParent().Define_boolean_inStaticContext(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:22
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_hostType(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return getQualifier(getNumQualifier()-1).type();
    }
    else {      return getParent().Define_TypeDecl_hostType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:24
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtNoTransform()){
		for(int i=getNumQualifier()-1;i>=0;--i) {
			TypeDecl td = getQualifier(i).type();
			SimpleSet c = td.memberFields(name);
			if(td.inStaticContext() || td.isStatic())
				c = removeInstanceVariables(c);
			if(!c.isEmpty())
				return c;
		}
		return removeFields(lookupVariable(name));
	}
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:48
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtNoTransform()){
		for(int i=getNumQualifier()-1;i>=0;--i) {
			TypeDecl td = getQualifier(i).type();
			Collection c = td.memberMethods(name);
			if(!c.isEmpty())
				return c;
		}
		return Collections.EMPTY_LIST;
	}
    else {      return getParent().Define_Collection_lookupMethod(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:58
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtNoTransform()){
		for(int i=getNumQualifier()-1;i>=0;--i) {
			SimpleSet c = getQualifier(i).qualifiedLookupType(name);
			if(!c.isEmpty())
				return c;
		}
		// TODO: filter out non-static ones?
		return lookupType(name);
	}
    else {      return getParent().Define_SimpleSet_lookupType(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:73
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getStmtNoTransform()) {
      return following();
    }
    else if(caller == getQualifierListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return i+1 < getNumQualifier() ? SmallSet.<CFGNode>singleton(getQualifier(i+1).first()) : SmallSet.<CFGNode>singleton(getStmt());
  }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
