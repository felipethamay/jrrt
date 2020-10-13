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
 * @production PackageDecl : {@link ASTNode} ::= <span class="component">&lt;Name:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.ast:1
 */
public class PackageDecl extends ASTNode<ASTNode> implements Cloneable, Declaration, SimpleSet, Iterator {
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
  public PackageDecl clone() throws CloneNotSupportedException {
    PackageDecl node = (PackageDecl)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public PackageDecl copy() {
    try {
      PackageDecl node = (PackageDecl) clone();
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
  public PackageDecl fullCopy() {
    PackageDecl tree = (PackageDecl) copy();
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
   * @aspect Declaration
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Declaration.jrag:9
   */
  public String name() {
		return getName();
	}
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:40
   */
  public SimpleSet add(Object o) {
		return new SimpleSetImpl().add(this).add(o);
	}
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:44
   */
  public boolean isSingleton() { return true; }
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:45
   */
  public boolean isSingleton(Object o) { return contains(o); }
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:48
   */
  
	private PackageDecl iterElem;
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:49
   */
  public Iterator iterator() { iterElem = this; return this; }
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:50
   */
  public boolean hasNext() { return iterElem != null; }
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:51
   */
  public Object next() { Object o = iterElem; iterElem = null; return o; }
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:52
   */
  public void remove() { throw new UnsupportedOperationException(); }
  /**
   * @ast method 
   * @aspect RenamePackage
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenamePackage.jrag:3
   */
  public void rename(String new_name) {
		String old_name = getName();
		if(old_name.equals(new_name))
			return;
		if(!isValidPackageName(new_name))
			throw new RefactoringException("not a valid name: "+new_name);
		Program root = programRoot();
		if(root.hasPackage(new_name))
			throw new RefactoringException("package exists");
		root.lockAllPackageAccesses();
		setName(new_name);
		for(Iterator<CompilationUnit> iter=root.compilationUnitIterator();iter.hasNext();) {
			CompilationUnit cu = iter.next();
			if(cu.getPackageDecl().equals(old_name))
				cu.setPackageDecl(new_name);
			else if(cu.getPackageDecl().startsWith(old_name + "."))
				cu.setPackageDecl(new_name + "." + cu.getPackageDecl().substring(old_name.length()+1));
		}
		for(PackageDecl subpd : root.getSubPackageDecls(old_name))
			subpd.setName(new_name + "." + subpd.getName().substring(old_name.length()+1));
		root.flushCaches();
		if(!root.typeWithSameNameAsPackage().isEmpty())
			throw new RefactoringException("name clash between member type and subpackage");
		root.eliminate(LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:136
   */
  public void collectAllDecls(Collection<Declaration> res) {
		res.add(this);
		super.collectAllDecls(res);
	}
  /**
   * @ast method 
   * 
   */
  public PackageDecl() {
    super();

    is$Final(true);

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
  public PackageDecl(String p0) {
    setName(p0);
    is$Final(true);
  }
  /**
   * @ast method 
   * 
   */
  public PackageDecl(beaver.Symbol p0) {
    setName(p0);
    is$Final(true);
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
   * Replaces the lexeme Name.
   * @param value The new value for the lexeme Name.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__PackageDecl_setName(String value) {
    tokenString_Name = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_Name;
  /**
   * @ast method 
   * 
   */
  
  public int Namestart;
  /**
   * @ast method 
   * 
   */
  
  public int Nameend;
  /**
   * JastAdd-internal setter for lexeme Name using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setName(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setName is only valid for String lexemes");
    tokenString_Name = (String)symbol.value;
    Namestart = symbol.getStart();
    Nameend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Name.
   * @return The value for the lexeme Name.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getName() {
    return tokenString_Name != null ? tokenString_Name : "";
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1631
   */
   public void setName(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, Namestart, Nameend, tokenString_Name, value) {
				@Override
				public void undo() {
					refined__PackageDecl_setName(oldValue);
				}
				@Override
				public String toString() {
					return "PackageDecl.setName (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__PackageDecl_setName(value);
				}
			});
		}
		refined__PackageDecl_setName(value);
	}
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:38
   */
  public int size() {
    ASTNode$State state = state();
    try {  return 1;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:39
   */
  public boolean isEmpty() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:43
   */
  public boolean contains(Object o) {
    ASTNode$State state = state();
    try {  return this == o;  }
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
