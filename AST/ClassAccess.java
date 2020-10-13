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
 * @production ClassAccess : {@link Access};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:39
 */
public class ClassAccess extends Access implements Cloneable {
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
  public ClassAccess clone() throws CloneNotSupportedException {
    ClassAccess node = (ClassAccess)super.clone();
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
  public ClassAccess copy() {
    try {
      ClassAccess node = (ClassAccess) clone();
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
  public ClassAccess fullCopy() {
    ClassAccess tree = (ClassAccess) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:177
   */
  public void nameCheck() {
    if(isQualified() && !qualifier().isTypeAccess())
      error("class literal may only contain type names");
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:520
   */
  public void toString(StringBuffer s) {
    s.append("class");
  }
  /**
   * @ast method 
   * 
   */
  public ClassAccess() {
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
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 0;
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
   * @ast method 
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:401
   */
  private TypeDecl refined_TypeAnalysis_ClassAccess_type()
{ return lookupType("java.lang", "Class"); }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:45
   */
  public boolean isClassAccess() {
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
    try {  return NameType.TYPE_NAME;  }
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
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:119
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
  private TypeDecl type_compute() {
    GenericClassDecl d = (GenericClassDecl)refined_TypeAnalysis_ClassAccess_type();
    TypeDecl type = qualifier().type();
    if(type.isPrimitiveType())
      type = type.boxed();
    ArrayList list = new ArrayList();
    list.add(type);
    return d.lookupParTypeDecl(list);
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:15
   */
  public boolean notAnObject() {
    ASTNode$State state = state();
    try {  return true;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/Monitor.jrag:105
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
  private Monitor getMonitor_compute() {  return new ClassMonitor(qualifier().type());  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
