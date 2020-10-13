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
 * 7.5.4 A static-import-on-demand declaration allows all accessible (\u00a76.6) static
 * members declared in the type named by a canonical name to be imported as
 * needed.
 * @production StaticImportOnDemandDecl : {@link StaticImportDecl};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.ast:19
 */
public class StaticImportOnDemandDecl extends StaticImportDecl implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    importedFields_computed = false;
    importedFields_value = null;
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
  public StaticImportOnDemandDecl clone() throws CloneNotSupportedException {
    StaticImportOnDemandDecl node = (StaticImportOnDemandDecl)super.clone();
    node.importedFields_computed = false;
    node.importedFields_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public StaticImportOnDemandDecl copy() {
    try {
      StaticImportOnDemandDecl node = (StaticImportOnDemandDecl) clone();
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
  public StaticImportOnDemandDecl fullCopy() {
    StaticImportOnDemandDecl tree = (StaticImportOnDemandDecl) copy();
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
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:213
   */
  public void toString(StringBuffer s) {
    s.append("import static ");
    getAccess().toString(s);
    s.append(".*;\n");
  }
  /**
   * @ast method 
   * 
   */
  public StaticImportOnDemandDecl() {
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
  public StaticImportOnDemandDecl(Access p0) {
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
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:53
   */
  public TypeDecl type() {
    ASTNode$State state = state();
    try {  return getAccess().type();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:351
   */
  public boolean isOnDemand() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean importedFields_computed = false;
  /**
   * @apilevel internal
   */
  protected SimpleSet importedFields_value;
  /**
   * @attribute syn
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:115
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet importedFields() {
    if(importedFields_computed) {
      return importedFields_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    importedFields_value = importedFields_compute();
      if(isFinal && num == state().boundariesCrossed) importedFields_computed = true;
    return importedFields_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet importedFields_compute() {
		SimpleSet res = SimpleSet.emptySet;
		for(Object o : type().memberFieldsMap().values())
			if(o instanceof FieldDeclaration && ((FieldDeclaration)o).isStatic())
				res = res.add(o);
		return res;
	}
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:204
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getAccessNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
