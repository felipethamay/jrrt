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
 * @production BoundFieldAccess : {@link VarAccess} ::= <span class="component">&lt;FieldDeclaration:FieldDeclaration&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.ast:6
 */
public class BoundFieldAccess extends VarAccess implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    decl_computed = false;
    decl_value = null;
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
  public BoundFieldAccess clone() throws CloneNotSupportedException {
    BoundFieldAccess node = (BoundFieldAccess)super.clone();
    node.decl_computed = false;
    node.decl_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BoundFieldAccess copy() {
    try {
      BoundFieldAccess node = (BoundFieldAccess) clone();
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
  public BoundFieldAccess fullCopy() {
    BoundFieldAccess tree = (BoundFieldAccess) copy();
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
   * @aspect BoundNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.jrag:68
   */
  public BoundFieldAccess(FieldDeclaration f) {
    this(f.name(), f);
  }
  /**
   * @ast method 
   * @aspect BoundNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.jrag:73
   */
  public boolean isExactVarAccess() {
    return false;
  }
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:47
   */
  protected void collectAccessibilityConstraints(Collection<AccessibilityConstraint> res) {
		// bound field accesses are used internally by the frontend to circumvent name binding rules, so we leave them alone
	}
  /**
   * @ast method 
   * 
   */
  public BoundFieldAccess() {
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
   * @ast method 
   * 
   */
  public BoundFieldAccess(String p0, FieldDeclaration p1) {
    setID(p0);
    setFieldDeclaration(p1);
  }
  /**
   * @ast method 
   * 
   */
  public BoundFieldAccess(beaver.Symbol p0, FieldDeclaration p1) {
    setID(p0);
    setFieldDeclaration(p1);
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__BoundFieldAccess_setID(String value) {
    tokenString_ID = value;
  }
  /**
   * JastAdd-internal setter for lexeme ID using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setID(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setID is only valid for String lexemes");
    tokenString_ID = (String)symbol.value;
    IDstart = symbol.getStart();
    IDend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme ID.
   * @return The value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getID() {
    return tokenString_ID != null ? tokenString_ID : "";
  }
  /**
   * Replaces the lexeme FieldDeclaration.
   * @param value The new value for the lexeme FieldDeclaration.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setFieldDeclaration(FieldDeclaration value) {
    tokenFieldDeclaration_FieldDeclaration = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected FieldDeclaration tokenFieldDeclaration_FieldDeclaration;
  /**
   * Retrieves the value for the lexeme FieldDeclaration.
   * @return The value for the lexeme FieldDeclaration.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public FieldDeclaration getFieldDeclaration() {
    return tokenFieldDeclaration_FieldDeclaration;
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:25
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__BoundFieldAccess_setID(oldValue);
				}
				@Override
				public String toString() {
					return "BoundFieldAccess.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__BoundFieldAccess_setID(value);
				}
			});
		}
		refined__BoundFieldAccess_setID(value);
	}
  /**
   * @apilevel internal
   */
  protected boolean decl_computed = false;
  /**
   * @apilevel internal
   */
  protected Variable decl_value;
  /**
   * @attribute syn
   * @aspect BoundNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.jrag:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Variable decl() {
    if(decl_computed) {
      return decl_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    decl_value = decl_compute();
      if(isFinal && num == state().boundariesCrossed) decl_computed = true;
    return decl_value;
  }
  /**
   * @apilevel internal
   */
  private Variable decl_compute() {  return getFieldDeclaration();  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
