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
 * @production PackageAccess : {@link Access} ::= <span class="component">&lt;Package:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:29
 */
public class PackageAccess extends Access implements Cloneable, LockableName {
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
  public PackageAccess clone() throws CloneNotSupportedException {
    PackageAccess node = (PackageAccess)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public PackageAccess copy() {
    try {
      PackageAccess node = (PackageAccess) clone();
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
  public PackageAccess fullCopy() {
    PackageAccess tree = (PackageAccess) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:50
   */
  public void nameCheck() {
    if(!hasPackage(packageName())) {
      error(packageName() + " not found");
    }
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:18
   */
  public PackageAccess(String name, int start, int end) {
    this(name);
    this.start = this.Packagestart = start;
    this.end = this.Packageend = end;
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:510
   */
  public void toString(StringBuffer s) {
    s.append(getPackage());
  }
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:54
   */
  public String getTopLevelPackage() {
		String[] comp = getPackage().split("\\.");
		if(comp.length == 0)
			return null;
		return comp[0];
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:148
   */
  public void collectAllDecls(Collection<Declaration> res) {
		res.add(lookupPackage(getTopLevelPackage()));
		super.collectAllDecls(res);
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:2
   */
  
	private PackageDecl targetPackage = null;
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:5
   */
  private void refined_LockedPackageAccess_PackageAccess_setTargetPackage(PackageDecl pd) {
		targetPackage = pd;
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:24
   */
  public ASTNode lockAllPackageAccesses() {
		if(!isLocked())
			lock();
		return super.lockAllPackageAccesses();
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:36
   */
  public ASTNode lockNames(Collection<String> endangered) {
		if(!isLocked() && endangered.contains(getTopLevelPackage()))
			lock();
		return super.lockNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:42
   */
  public ASTNode lock() {
		return lock(decl());
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:46
   */
  public ASTNode lock(PackageDecl target) { 
		setTargetPackage(target);
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:51
   */
  public void eliminateLockedNames() {
		unlock();
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:56
   */
  public PackageAccess unlock() {
		if(isLocked()) {
			if(fromSource())
				setPackage(targetPackage.getName());
			if(!lookupName(getTopLevelPackage()).isSingleton(lookupPackage(getTopLevelPackage())))
				throw new RefactoringException("cannot access obscured package");
			setTargetPackage(null);
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:67
   */
  public boolean isLocked() { return targetPackage != null; }
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:137
   */
  public PackageAccess lockedCopy() {
		PackageAccess res = (PackageAccess)super.lockedCopy();
		res.lock(decl());
		return res;
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:56
   */
  public ASTNode lockAllNames() {
		ASTNode res = lock();
		if(res == this)
			return super.lockAllNames();
		else
			return res.lockAllNames();
	}
  /**
   * @ast method 
   * 
   */
  public PackageAccess() {
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
  public PackageAccess(String p0) {
    setPackage(p0);
  }
  /**
   * @ast method 
   * 
   */
  public PackageAccess(beaver.Symbol p0) {
    setPackage(p0);
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
  public void refined__PackageAccess_setPackage(String value) {
    tokenString_Package = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_Package;
  /**
   * @ast method 
   * 
   */
  
  public int Packagestart;
  /**
   * @ast method 
   * 
   */
  
  public int Packageend;
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
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:138
   */
    private void setTargetPackage(final PackageDecl pd) {
		final PackageDecl saved = targetPackage;
		refined_LockedPackageAccess_PackageAccess_setTargetPackage(pd);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModification() {
				
				@Override
				public void undo() {
					targetPackage = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedPackageAccess_PackageAccess_setTargetPackage(pd);
				}
				
				@Override
				public String toString() {
					return "PackageAccess.setTargetPackage";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1785
   */
   public void setPackage(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, Packagestart, Packageend, tokenString_Package, value) {
				@Override
				public void undo() {
					refined__PackageAccess_setPackage(oldValue);
				}
				@Override
				public String toString() {
					return "PackageAccess.setPackage (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__PackageAccess_setPackage(value);
				}
			});
		}
		refined__PackageAccess_setPackage(value);
	}
  /**
   * @attribute syn
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:83
   */
  public boolean hasQualifiedPackage(String packageName) {
    ASTNode$State state = state();
    try {  return hasPackage(packageName() + "." + packageName);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:430
   */
  public SimpleSet qualifiedLookupType(String name) {
    ASTNode$State state = state();
    try {
    SimpleSet c = SimpleSet.emptySet;
    TypeDecl typeDecl = lookupType(packageName(), name);
    if(nextAccess() instanceof ClassInstanceExpr) {
      if(typeDecl != null && typeDecl.accessibleFrom(hostType()))
        c = c.add(typeDecl);
      return c;
    }
    else {
      if(typeDecl != null) {
        if(hostType() != null && typeDecl.accessibleFrom(hostType()))
          c = c.add(typeDecl);
        else if(hostType() == null && typeDecl.accessibleFromPackage(hostPackage()))
          c = c.add(typeDecl);
      }
      return c;
    }
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:148
   */
  public SimpleSet qualifiedLookupVariable(String name) {
    ASTNode$State state = state();
    try {  return SimpleSet.emptySet;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:800
   */
  public String dumpString() {
    ASTNode$State state = state();
    try {  return getClass().getName() + " [" + getPackage() + "]";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:23
   */
  public String name() {
    ASTNode$State state = state();
    try {  return getPackage();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:25
   */
  public String packageName() {
    ASTNode$State state = state();
    try {
    StringBuffer s = new StringBuffer();
    if(hasPrevExpr()) {
      s.append(prevExpr().packageName());
      s.append(".");
    }
    s.append(getPackage());
    return s.toString();
  }
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
    try {  return NameType.PACKAGE_NAME;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:20
   */
  public boolean isUnknown() {
    ASTNode$State state = state();
    try {  return !hasPackage(packageName());  }
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
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:35
   */
  public PackageDecl decl() {
    ASTNode$State state = state();
    try {  return lookupPackage(getPackage());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:263
   */
  public SymbolicVarAccess qualifiedAccessVariable(Variable decl) {
    ASTNode$State state = state();
    try {  return unknownVarAccess();  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:243
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasPackage(String packageName) {
    ASTNode$State state = state();
    boolean hasPackage_String_value = getParent().Define_boolean_hasPackage(this, null, packageName);
    return hasPackage_String_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
