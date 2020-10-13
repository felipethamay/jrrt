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
 * @production ImportDecl : {@link ASTNode} ::= <span class="component">{@link Access}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:10
 */
public abstract class ImportDecl extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    importedTypes_String_values = null;
    importedFields_String_values = null;
    importedMethods_String_values = null;
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
  public ImportDecl clone() throws CloneNotSupportedException {
    ImportDecl node = (ImportDecl)super.clone();
    node.importedTypes_String_values = null;
    node.importedFields_String_values = null;
    node.importedMethods_String_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * 
   */
  public ImportDecl() {
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
  public ImportDecl(Access p0) {
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
   * Replaces the Access child.
   * @param node The new node to replace the Access child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setAccess(Access node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Access child.
   * @return The current node used as the Access child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Access getAccess() {
    return (Access)getChild(0);
  }
  /**
   * Retrieves the Access child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Access child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Access getAccessNoTransform() {
    return (Access)getChildNoTransform(0);
  }
  /**
   * @ast method 
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:51
   */
  private String refined_Names_ImportDecl_typeName()
{
    Access a = getAccess().lastAccess();
    String name = a.isTypeAccess() ? ((TypeAccess)a).nameWithPackage() : "";
    while(a.hasPrevExpr() && a.prevExpr() instanceof Access) {
      Access pred = (Access)a.prevExpr();
      if(pred.isTypeAccess())
        name = ((TypeAccess)pred).nameWithPackage() + "." + name;
      a = pred;
    }
    return name;
  }
  protected java.util.Map importedTypes_String_values;
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:322
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet importedTypes(String name) {
    Object _parameters = name;
    if(importedTypes_String_values == null) importedTypes_String_values = new java.util.HashMap(4);
    if(importedTypes_String_values.containsKey(_parameters)) {
      return (SimpleSet)importedTypes_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet importedTypes_String_value = importedTypes_compute(name);
      if(isFinal && num == state().boundariesCrossed) importedTypes_String_values.put(_parameters, importedTypes_String_value);
    return importedTypes_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet importedTypes_compute(String name) {  return SimpleSet.emptySet;  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:351
   */
  public boolean isOnDemand() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:51
   */
  public String typeName() {
    ASTNode$State state = state();
    try {
    	if(getAccess() instanceof AbstractDot)
    		((AbstractDot)getAccess()).rotateRight();
    	return refined_Names_ImportDecl_typeName();
	}
    finally {
    }
  }
  protected java.util.Map importedFields_String_values;
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet importedFields(String name) {
    Object _parameters = name;
    if(importedFields_String_values == null) importedFields_String_values = new java.util.HashMap(4);
    if(importedFields_String_values.containsKey(_parameters)) {
      return (SimpleSet)importedFields_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet importedFields_String_value = importedFields_compute(name);
      if(isFinal && num == state().boundariesCrossed) importedFields_String_values.put(_parameters, importedFields_String_value);
    return importedFields_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet importedFields_compute(String name) {  return SimpleSet.emptySet;  }
  protected java.util.Map importedMethods_String_values;
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:41
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection importedMethods(String name) {
    Object _parameters = name;
    if(importedMethods_String_values == null) importedMethods_String_values = new java.util.HashMap(4);
    if(importedMethods_String_values.containsKey(_parameters)) {
      return (Collection)importedMethods_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    Collection importedMethods_String_value = importedMethods_compute(name);
      if(isFinal && num == state().boundariesCrossed) importedMethods_String_values.put(_parameters, importedMethods_String_value);
    return importedMethods_String_value;
  }
  /**
   * @apilevel internal
   */
  private Collection importedMethods_compute(String name) {  return Collections.EMPTY_LIST;  }
  /**
   * @attribute syn
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:118
   */
  public boolean shouldRemove() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:349
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String packageName() {
    ASTNode$State state = state();
    String packageName_value = getParent().Define_String_packageName(this, null);
    return packageName_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:23
   * @apilevel internal
   */
  public boolean Define_boolean_isDest(ASTNode caller, ASTNode child) {
    if(caller == getAccessNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isDest(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:32
   * @apilevel internal
   */
  public boolean Define_boolean_isSource(ASTNode caller, ASTNode child) {
    if(caller == getAccessNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_isSource(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeAccessExt.jrag:5
   * @apilevel internal
   */
  public boolean Define_boolean_inImportDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return true;
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
