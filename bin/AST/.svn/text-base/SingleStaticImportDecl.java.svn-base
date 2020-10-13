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
 * 7.5.3 A single-static-import declaration imports all accessible (\u00a76.6) static members
 * with a given simple name from a type. This makes these static members available
 * under their simple name in the class and interface declarations of the
 * compilation unit in which the single-static import declaration appears.
 * @production SingleStaticImportDecl : {@link StaticImportDecl} ::= <span class="component">&lt;ID:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.ast:12
 */
public class SingleStaticImportDecl extends StaticImportDecl implements Cloneable {
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
  public SingleStaticImportDecl clone() throws CloneNotSupportedException {
    SingleStaticImportDecl node = (SingleStaticImportDecl)super.clone();
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
  public SingleStaticImportDecl copy() {
    try {
      SingleStaticImportDecl node = (SingleStaticImportDecl) clone();
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
  public SingleStaticImportDecl fullCopy() {
    SingleStaticImportDecl tree = (SingleStaticImportDecl) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:61
   */
  public void typeCheck() { 
    if(!getAccess().type().typeName().equals(typeName()) && !getAccess().type().isUnknown())
      error("Single-type import " + typeName() + " is not the canonical name of type " + getAccess().type().typeName());
  }
  /**
   * @ast method 
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:93
   */
  public void nameCheck() {
    if(importedFields(name()).isEmpty() && importedMethods(name()).isEmpty() && importedTypes(name()).isEmpty() &&
       !getAccess().type().isUnknown()) {
      error("Semantic Error: At least one static member named " + name() + " must be available in static imported type " + type().fullName());
    }
  }
  /**
   * @ast method 
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:207
   */
  public void toString(StringBuffer s) {
    s.append("import static ");
    getAccess().toString(s);
    s.append("." + getID());
    s.append(";\n");
  }
  /**
   * @ast method 
   * @aspect LockedSingleStaticImportDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedSingleStaticImportDecl.jrag:6
   */
  
	/* renaming can affect single static import decls; currently, we only check
	 * that such a declaration always has something to import and remove if it doesn't;
	 * we don't try to adjust it to import a member whose name has changed (instead,
	 * the renaming framework will compute a qualified name) */
	private boolean locked = false;
  /**
   * @ast method 
   * @aspect LockedSingleStaticImportDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedSingleStaticImportDecl.jrag:7
   */
  private void refined_LockedSingleStaticImportDecl_SingleStaticImportDecl_setLocked(boolean value) {
		locked = value;
	}
  /**
   * @ast method 
   * @aspect LockedSingleStaticImportDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedSingleStaticImportDecl.jrag:11
   */
  public ASTNode lockNames(Collection<String> endangered) {
		if(endangered.contains(name()))
			setLocked(true);
		return super.lockNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedSingleStaticImportDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedSingleStaticImportDecl.jrag:17
   */
  public ASTNode lockMethodNames(Collection<String> endangered) {
		if(endangered.contains(name()))
			setLocked(true);
		return super.lockMethodNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedSingleStaticImportDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedSingleStaticImportDecl.jrag:23
   */
  public ASTNode lockAllNames() {
		setLocked(true);
		return super.lockAllNames();
	}
  /**
   * @ast method 
   * @aspect LockedSingleStaticImportDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedSingleStaticImportDecl.jrag:28
   */
  public void eliminateLockedNames() {
		if(locked) {
			setLocked(false);
			if(importedFields(name()).isEmpty() && importedMethods(name()).isEmpty() && importedTypes(name()).isEmpty() &&
					!getAccess().type().isUnknown()) {
				getParent().removeChild(getChildIndex());
				return;
			}
		}
		super.eliminateLockedNames();	
	}
  /**
   * @ast method 
   * 
   */
  public SingleStaticImportDecl() {
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
  public SingleStaticImportDecl(Access p0, String p1) {
    setChild(p0, 0);
    setID(p1);
  }
  /**
   * @ast method 
   * 
   */
  public SingleStaticImportDecl(Access p0, beaver.Symbol p1) {
    setChild(p0, 0);
    setID(p1);
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__SingleStaticImportDecl_setID(String value) {
    tokenString_ID = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_ID;
  /**
   * @ast method 
   * 
   */
  
  public int IDstart;
  /**
   * @ast method 
   * 
   */
  
  public int IDend;
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
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:244
   */
    private void setLocked(final boolean value) {
		final boolean saved = locked;
		refined_LockedSingleStaticImportDecl_SingleStaticImportDecl_setLocked(value);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				
				@Override
				public void undo() {
					locked = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedSingleStaticImportDecl_SingleStaticImportDecl_setLocked(value);
				}
				
				@Override
				public String toString() {
					return "SingleStaticImportDecl.setLocked";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1367
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__SingleStaticImportDecl_setID(oldValue);
				}
				@Override
				public String toString() {
					return "SingleStaticImportDecl.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__SingleStaticImportDecl_setID(value);
				}
			});
		}
		refined__SingleStaticImportDecl_setID(value);
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
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:99
   */
  public String name() {
    ASTNode$State state = state();
    try {  return getID();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:114
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
  private SimpleSet importedFields_compute() {  return removeInstanceVariables(type().memberFields(name()));  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:203
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
