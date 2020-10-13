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
 * @production BoundTypeAccess : {@link TypeAccess} ::= <span class="component">&lt;TypeDecl:TypeDecl&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.ast:8
 */
public class BoundTypeAccess extends TypeAccess implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    decls_computed = false;
    decls_value = null;
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
  public BoundTypeAccess clone() throws CloneNotSupportedException {
    BoundTypeAccess node = (BoundTypeAccess)super.clone();
    node.decls_computed = false;
    node.decls_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BoundTypeAccess copy() {
    try {
      BoundTypeAccess node = (BoundTypeAccess) clone();
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
  public BoundTypeAccess fullCopy() {
    BoundTypeAccess tree = (BoundTypeAccess) copy();
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
   * @aspect GenericsTypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:333
   */
  public boolean isRaw() {
    return getTypeDecl().isRawType();
  }
  /**
   * @ast method 
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:24
   */
  public TypeAccess substituteAll(Parameterization parTypeDecl) {
		return decl().createBoundAccess();
	}
  /**
   * @ast method 
   * 
   */
  public BoundTypeAccess() {
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
  public BoundTypeAccess(String p0, String p1, TypeDecl p2) {
    setPackage(p0);
    setID(p1);
    setTypeDecl(p2);
  }
  /**
   * @ast method 
   * 
   */
  public BoundTypeAccess(beaver.Symbol p0, beaver.Symbol p1, TypeDecl p2) {
    setPackage(p0);
    setID(p1);
    setTypeDecl(p2);
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
   * Replaces the lexeme Package.
   * @param value The new value for the lexeme Package.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__BoundTypeAccess_setPackage(String value) {
    tokenString_Package = value;
  }
  /**
   * JastAdd-internal setter for lexeme Package using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setPackage(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setPackage is only valid for String lexemes");
    tokenString_Package = (String)symbol.value;
    Packagestart = symbol.getStart();
    Packageend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Package.
   * @return The value for the lexeme Package.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getPackage() {
    return tokenString_Package != null ? tokenString_Package : "";
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__BoundTypeAccess_setID(String value) {
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
   * Replaces the lexeme TypeDecl.
   * @param value The new value for the lexeme TypeDecl.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeDecl(TypeDecl value) {
    tokenTypeDecl_TypeDecl = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected TypeDecl tokenTypeDecl_TypeDecl;
  /**
   * Retrieves the value for the lexeme TypeDecl.
   * @return The value for the lexeme TypeDecl.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public TypeDecl getTypeDecl() {
    return tokenTypeDecl_TypeDecl;
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1675
   */
   public void setPackage(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, Packagestart, Packageend, tokenString_Package, value) {
				@Override
				public void undo() {
					refined__BoundTypeAccess_setPackage(oldValue);
				}
				@Override
				public String toString() {
					return "BoundTypeAccess.setPackage (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__BoundTypeAccess_setPackage(value);
				}
			});
		}
		refined__BoundTypeAccess_setPackage(value);
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:223
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__BoundTypeAccess_setID(oldValue);
				}
				@Override
				public String toString() {
					return "BoundTypeAccess.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__BoundTypeAccess_setID(value);
				}
			});
		}
		refined__BoundTypeAccess_setID(value);
	}
  /**
   * @apilevel internal
   */
  protected boolean decls_computed = false;
  /**
   * @apilevel internal
   */
  protected SimpleSet decls_value;
  /**
   * @attribute syn
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:62
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet decls() {
    if(decls_computed) {
      return decls_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    decls_value = decls_compute();
      if(isFinal && num == state().boundariesCrossed) decls_computed = true;
    return decls_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet decls_compute() {  return SimpleSet.emptySet.add(getTypeDecl().refresh());  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:800
   */
  public String dumpString() {
    ASTNode$State state = state();
    try {  return getClass().getName() + " [" + getTypeDecl().fullName() + "]";  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
