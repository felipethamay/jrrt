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
 * @production CompilationUnit : {@link ASTNode} ::= <span class="component">&lt;PackageDecl:java.lang.String&gt;</span> <span class="component">{@link ImportDecl}*</span> <span class="component">{@link TypeDecl}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:4
 */
public class CompilationUnit extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    packageName_computed = false;
    packageName_value = null;
    lookupType_String_values = null;
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
  public CompilationUnit clone() throws CloneNotSupportedException {
    CompilationUnit node = (CompilationUnit)super.clone();
    node.packageName_computed = false;
    node.packageName_value = null;
    node.lookupType_String_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public CompilationUnit copy() {
    try {
      CompilationUnit node = (CompilationUnit) clone();
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
  public CompilationUnit fullCopy() {
    CompilationUnit tree = (CompilationUnit) copy();
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
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:159
   */
  

  private String relativeName;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:160
   */
  
  private String pathName;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:161
   */
  
  private boolean fromSource;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:163
   */
  public void setRelativeName(String name) {
    relativeName = name;
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:166
   */
  public void setPathName(String name) {
    pathName = name;
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:169
   */
  public void setFromSource(boolean value) {
    fromSource = value;
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:65
   */
  

  protected java.util.ArrayList errors = new java.util.ArrayList();
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:66
   */
  
  protected java.util.ArrayList warnings = new java.util.ArrayList();
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:68
   */
  public Collection parseErrors() { return parseErrors; }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:69
   */
  public void addParseError(Problem msg) { parseErrors.add(msg); }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:70
   */
  
  protected Collection parseErrors = new ArrayList();
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:228
   */
  public void errorCheck(Collection collection) {
    collectErrors();
    collection.addAll(errors);
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:232
   */
  public void errorCheck(Collection err, Collection warn) {
    collectErrors();
    err.addAll(errors);
    warn.addAll(warnings);
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:35
   */
  public void refined_NameCheck_CompilationUnit_nameCheck() {
    for(int i = 0; i < getNumImportDecl(); i++) {
      ImportDecl decl = getImportDecl(i);
      if(decl instanceof SingleTypeImportDecl) {
        TypeDecl importedType = decl.getAccess().type();
        Iterator iter = localLookupType(importedType.name()).iterator();
        while (iter.hasNext()) {
          TypeDecl local = (TypeDecl) iter.next();
          if (local != importedType)
            error("imported type " + decl + " is conflicting with visible type");
        }
      }
    }
  }
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:19
   */
  public void dot() {
		if(!fromSource())
			return;
		super.dot();
	}
  /**
   * @ast method 
   * @aspect CompilationUnitExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/CompilationUnitExt.jrag:2
   */
  public String getID() {
		char pathsep = File.separatorChar;
		String path = pathName();
		if(path == null)
			return null;
		int i = path.lastIndexOf(pathsep);
		String relname_tail = i == -1 ? path : path.substring(i+1);
		int j = relname_tail.lastIndexOf(".");
		return relname_tail.substring(0, j);	 		
	}
  /**
   * @ast method 
   * @aspect CompilationUnitExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/CompilationUnitExt.jrag:13
   */
  public void refined_CompilationUnitExt_CompilationUnit_setID(String id) {
		setRelativeName(patchName(relativeName(), id));
		setPathName(patchName(pathName(), id));
	}
  /**
   * @ast method 
   * @aspect CompilationUnitExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/CompilationUnitExt.jrag:18
   */
  private static String patchName(String path, String name) {
		char pathsep = File.separatorChar;
		int i = path.lastIndexOf(pathsep);
		String relname_head = i == -1 ? "" : path.substring(0, i+1);
		String relname_tail = i == -1 ? path : path.substring(i+1);
		int j = relname_tail.lastIndexOf(".");
		return relname_head + name + relname_tail.substring(j);
	}
  /**
   * @ast method 
   * @aspect Errors
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Errors.jrag:2
   */
  public void clearErrors() {
		errors.clear();
	}
  /**
   * @ast method 
   * @aspect Comments
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJComments.jrag:2
   */
  
	public HashMap<FileRange, String> comments;
  /**
   * @ast method 
   * @aspect Comments
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJComments.jrag:4
   */
  public void setComments(HashMap<FileRange, String> map) {
		comments = map;
	}
  /**
   * @ast method 
   * @aspect Comments
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJComments.jrag:8
   */
  public FileRange findComment(String comment) {
		for(Map.Entry<FileRange, String> e : comments.entrySet())
			if(e.getValue().equals(comment))
				return e.getKey();
		return null;
	}
  /**
   * @ast method 
   * @aspect JastAddJOffsets
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJOffsets.jrag:2
   */
  public void setOffsets(HashMap map) {
    offsets = map;
  }
  /**
   * @ast method 
   * @aspect JastAddJOffsets
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJOffsets.jrag:5
   */
  
  private HashMap offsets;
  /**
   * @ast method 
   * @aspect JastAddJOffsets
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJOffsets.jrag:6
   */
  public int offset(int line, int column) {
    if(line == 1) return column - 1;
    Integer key = new Integer(line);
    if(offsets == null || !offsets.containsKey(key))
      return -1;
    Integer lineOffset = (Integer)offsets.get(key);
    return lineOffset.intValue() + column - 1;
  }
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:180
   */
  protected void collectSourceMethods(Collection<MethodDecl> res) {
		if(fromSource())
			super.collectSourceMethods(res);
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:202
   */
  protected void collectSourceClassDecls(Collection<ClassDecl> res) {
		if(fromSource())
			super.collectSourceClassDecls(res);
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:224
   */
  protected void collectPackageDecls(Collection<String> res) {
		if(fromSource())
			res.add(packageName());
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:94
   */
  public void collectSourceVisibles(Collection<Visible> visibles) {
		if(!fromSource())
			return;
		super.collectSourceVisibles(visibles);
	}
  /**
   * @ast method 
   * @aspect InsertUnusedType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/InsertUnusedType.jrag:43
   */
  public void insertUnusedType(TypeDecl td) {
		TypeDecl res = programRoot().lookupType(getPackageDecl(), td.name());
		if(res != null && res != td || programRoot().hasPackage(getPackageDecl()+td.name()))
			throw new RefactoringException("different toplevel type of same name exists");
		addTypeDecl(td);
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:18
   */
  public ASTNode lockAllPackageAccesses() {
		// make sure the package of this compilation unit is registered with the program root
		programRoot().getPackageDecl(getPackageDecl());
		return super.lockAllPackageAccesses();
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:107
   */
  public void eliminateLockedNames() {
		if(fromSource()) {
			for(int i=getNumImportDecl()-1;i>=0;--i) {
				ImportDecl id = getImportDecl(i);
				if(id.shouldRemove())
					getImportDeclList().removeChild(i);
			}
		}
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:157
   */
  
	
	// output names of compilation units; this helps when comparing results
	public static boolean printCUNames = false;
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:312
   */
  public Stmt findStmtFollowingComment(String comment) {
		FileRange fr = findComment(comment);
		if(fr == null)
			return null;
		return findStmtFollowing(fr.el);
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:319
   */
  public Stmt findStmtPrecedingComment(String comment) {
		FileRange fr = findComment(comment);
		if(fr == null)
			return null;
		return findStmtPreceding(fr.el);
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:488
   */
  public void writeBack() throws IOException {
		FileWriter fw = new FileWriter(pathName);
		fw.write(toString());
		fw.close();
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:45
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		// sometimes JastAddJ seems to load conflicting jars, so libraries don't always typecheck :-S
		if(fromSource() || packageName().startsWith("java."))
			super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public CompilationUnit() {
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
    setChild(new List(), 1);
  }
  /**
   * @ast method 
   * 
   */
  public CompilationUnit(java.lang.String p0, List<ImportDecl> p1, List<TypeDecl> p2) {
    setPackageDecl(p0);
    setChild(p1, 0);
    setChild(p2, 1);
  }
  /**
   * @ast method 
   * 
   */
  public CompilationUnit(beaver.Symbol p0, List<ImportDecl> p1, List<TypeDecl> p2) {
    setPackageDecl(p0);
    setChild(p1, 0);
    setChild(p2, 1);
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
   * Replaces the lexeme PackageDecl.
   * @param value The new value for the lexeme PackageDecl.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__CompilationUnit_setPackageDecl(java.lang.String value) {
    tokenjava_lang_String_PackageDecl = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected java.lang.String tokenjava_lang_String_PackageDecl;
  /**
   * @ast method 
   * 
   */
  
  public int PackageDeclstart;
  /**
   * @ast method 
   * 
   */
  
  public int PackageDeclend;
  /**
   * JastAdd-internal setter for lexeme PackageDecl using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setPackageDecl(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setPackageDecl is only valid for String lexemes");
    tokenjava_lang_String_PackageDecl = (String)symbol.value;
    PackageDeclstart = symbol.getStart();
    PackageDeclend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme PackageDecl.
   * @return The value for the lexeme PackageDecl.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public java.lang.String getPackageDecl() {
    return tokenjava_lang_String_PackageDecl != null ? tokenjava_lang_String_PackageDecl : "";
  }
  /**
   * Replaces the ImportDecl list.
   * @param list The new list node to be used as the ImportDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setImportDeclList(List<ImportDecl> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the ImportDecl list.
   * @return Number of children in the ImportDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumImportDecl() {
    return getImportDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the ImportDecl list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the ImportDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumImportDeclNoTransform() {
    return getImportDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the ImportDecl list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the ImportDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ImportDecl getImportDecl(int i) {
    return (ImportDecl)getImportDeclList().getChild(i);
  }
  /**
   * Append an element to the ImportDecl list.
   * @param node The element to append to the ImportDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addImportDecl(ImportDecl node) {
    List<ImportDecl> list = (parent == null || state == null) ? getImportDeclListNoTransform() : getImportDeclList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addImportDeclNoTransform(ImportDecl node) {
    List<ImportDecl> list = getImportDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the ImportDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setImportDecl(ImportDecl node, int i) {
    List<ImportDecl> list = getImportDeclList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the ImportDecl list.
   * @return The node representing the ImportDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<ImportDecl> getImportDecls() {
    return getImportDeclList();
  }
  /**
   * Retrieves the ImportDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ImportDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<ImportDecl> getImportDeclsNoTransform() {
    return getImportDeclListNoTransform();
  }
  /**
   * Retrieves the ImportDecl list.
   * @return The node representing the ImportDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<ImportDecl> getImportDeclList() {
    List<ImportDecl> list = (List<ImportDecl>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the ImportDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the ImportDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<ImportDecl> getImportDeclListNoTransform() {
    return (List<ImportDecl>)getChildNoTransform(0);
  }
  /**
   * Replaces the TypeDecl list.
   * @param list The new list node to be used as the TypeDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeDeclList(List<TypeDecl> list) {
    setChild(list, 1);
  }
  /**
   * Retrieves the number of children in the TypeDecl list.
   * @return Number of children in the TypeDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumTypeDecl() {
    return getTypeDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TypeDecl list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the TypeDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumTypeDeclNoTransform() {
    return getTypeDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TypeDecl list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TypeDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl getTypeDecl(int i) {
    return (TypeDecl)getTypeDeclList().getChild(i);
  }
  /**
   * Append an element to the TypeDecl list.
   * @param node The element to append to the TypeDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addTypeDecl(TypeDecl node) {
    List<TypeDecl> list = (parent == null || state == null) ? getTypeDeclListNoTransform() : getTypeDeclList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addTypeDeclNoTransform(TypeDecl node) {
    List<TypeDecl> list = getTypeDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TypeDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeDecl(TypeDecl node, int i) {
    List<TypeDecl> list = getTypeDeclList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TypeDecl list.
   * @return The node representing the TypeDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<TypeDecl> getTypeDecls() {
    return getTypeDeclList();
  }
  /**
   * Retrieves the TypeDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypeDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<TypeDecl> getTypeDeclsNoTransform() {
    return getTypeDeclListNoTransform();
  }
  /**
   * Retrieves the TypeDecl list.
   * @return The node representing the TypeDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeDecl> getTypeDeclList() {
    List<TypeDecl> list = (List<TypeDecl>)getChild(1);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the TypeDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypeDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeDecl> getTypeDeclListNoTransform() {
    return (List<TypeDecl>)getChildNoTransform(1);
  }
  /**
   * @ast method 
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:181
   */
    public void nameCheck() {
    refined_NameCheck_CompilationUnit_nameCheck();
    for(int i = 0; i < getNumImportDecl(); i++) {
      if(getImportDecl(i) instanceof SingleStaticImportDecl) {
        SingleStaticImportDecl decl = (SingleStaticImportDecl)getImportDecl(i);
        String name = decl.name();
        if(!decl.importedTypes(name).isEmpty()) {
          TypeDecl type = (TypeDecl)decl.importedTypes(name).iterator().next();
          if(localLookupType(name).contains(type))
            decl.error(packageName() + "." + name + " is already defined in this compilation unit");
        }
      }
    }
  }
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:158
   */
    public void toString(StringBuffer s) {
		if(printCUNames)
			s.append("compilation unit "+getID()+"\n");
	    try {
	        if(!getPackageDecl().equals("")) {
	          s.append("package " + getPackageDecl() + ";\n");
	        }
	        for(int i = 0; i < getNumImportDecl(); i++) {
	          getImportDecl(i).toString(s);
	        }
			ArrayList<TypeDecl> tds = new ArrayList<TypeDecl>();
			for(int i=0;i<getNumTypeDecl();++i)
				tds.add(getTypeDecl(i));
			Collections.sort(tds, new Comparator<TypeDecl>() {
				public int compare(TypeDecl td1, TypeDecl td2) {
					return td1.name().compareTo(td2.name());
				}
			});
	        for(TypeDecl td : tds) {
	          td.toString(s);
	          s.append("\n");
	        }
	      } catch (NullPointerException e) {
	        System.out.print("Error in compilation unit hosting " + getTypeDecl(0).typeName());
	        throw e;
	      }
	}
  /**
   * @ast method 
   * @aspect UndoRefines
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoRefines.jrag:47
   */
    public void setID(final String value) {
		String oldPathName = pathName();
		String oldValue = getID();
		refined_CompilationUnitExt_CompilationUnit_setID(value);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationCompilationUnitSetId(this.isInTree(), this, oldValue, value, oldPathName, pathName()) {
				@Override
				public void undo() {
					refined_CompilationUnitExt_CompilationUnit_setID(oldValue);
				}
				@Override
				public String toString() {
					return "CompilationUnit.setID";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_CompilationUnitExt_CompilationUnit_setID(value);
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoRefines
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoRefines.jrag:4
   */
   public void setPackageDecl(final java.lang.String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, PackageDeclstart, PackageDeclend, tokenjava_lang_String_PackageDecl, value) {
				@Override
				public void undo() {
					refined__CompilationUnit_setPackageDecl(oldValue);
				}
				@Override
				public String toString() {
					return "CompilationUnit.setPackageDecl";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__CompilationUnit_setPackageDecl(value);
				}
			});
		}
		refined__CompilationUnit_setPackageDecl(value);
	}
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:270
   */
  private SimpleSet refined_TypeScopePropagation_CompilationUnit_Child_lookupType_String(String name)
{
    // locally declared types in compilation unit
    SimpleSet set = localLookupType(name);
    if(!set.isEmpty()) return set;

    // imported types
    set = importedTypes(name);
    if(!set.isEmpty()) return set;

    // types in the same package
    TypeDecl result = lookupType(packageName(), name);
    if(result != null && result.accessibleFromPackage(packageName())) 
      return SimpleSet.emptySet.add(result);
    
    // types imported on demand
    set = importedTypesOnDemand(name);
    if(!set.isEmpty()) return set;
    
    // include primitive types
    result = lookupType(PRIMITIVE_PACKAGE_NAME, name);
    if(result != null) return SimpleSet.emptySet.add(result);
    
    // 7.5.5 Automatic Imports
    result = lookupType("java.lang", name);
    if(result != null && result.accessibleFromPackage(packageName()))
      return SimpleSet.emptySet.add(result);
    return lookupType(name);
  }
  /**
   * @attribute syn
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:27
   */
  public String relativeName() {
    ASTNode$State state = state();
    try {  return relativeName;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:28
   */
  public String pathName() {
    ASTNode$State state = state();
    try {  return pathName;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:29
   */
  public boolean fromSource() {
    ASTNode$State state = state();
    try {  return fromSource;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:299
   */
  public SimpleSet localLookupType(String name) {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < getNumTypeDecl(); i++)
      if(getTypeDecl(i).name().equals(name))
        return SimpleSet.emptySet.add(getTypeDecl(i));
    return SimpleSet.emptySet;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:306
   */
  public SimpleSet importedTypes(String name) {
    ASTNode$State state = state();
    try {
    SimpleSet set = SimpleSet.emptySet;
    for(int i = 0; i < getNumImportDecl(); i++)
      if(!getImportDecl(i).isOnDemand())
        for(Iterator iter = getImportDecl(i).importedTypes(name).iterator(); iter.hasNext(); )
          set = set.add(iter.next());
    return set;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:314
   */
  public SimpleSet importedTypesOnDemand(String name) {
    ASTNode$State state = state();
    try {
    SimpleSet set = SimpleSet.emptySet;
    for(int i = 0; i < getNumImportDecl(); i++)
      if(getImportDecl(i).isOnDemand())
        for(Iterator iter = getImportDecl(i).importedTypes(name).iterator(); iter.hasNext(); )
          set = set.add(iter.next());
    return set;
  }
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
    try {  return getClass().getName() + " [" + getPackageDecl() + "]";  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean packageName_computed = false;
  /**
   * @apilevel internal
   */
  protected String packageName_value;
  /**
   * @attribute syn
   * @aspect TypeName
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:92
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String packageName() {
    if(packageName_computed) {
      return packageName_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    packageName_value = packageName_compute();
      if(isFinal && num == state().boundariesCrossed) packageName_computed = true;
    return packageName_value;
  }
  /**
   * @apilevel internal
   */
  private String packageName_compute() {return getPackageDecl();}
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:112
   */
  public SimpleSet importedFields(String name) {
    ASTNode$State state = state();
    try {
    SimpleSet set = SimpleSet.emptySet;
    for(int i = 0; i < getNumImportDecl(); i++)
      if(!getImportDecl(i).isOnDemand())
        for(Iterator iter = getImportDecl(i).importedFields(name).iterator(); iter.hasNext(); )
          set = set.add(iter.next());
    return set;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:120
   */
  public SimpleSet importedFieldsOnDemand(String name) {
    ASTNode$State state = state();
    try {
    SimpleSet set = SimpleSet.emptySet;
    for(int i = 0; i < getNumImportDecl(); i++)
      if(getImportDecl(i).isOnDemand())
        for(Iterator iter = getImportDecl(i).importedFields(name).iterator(); iter.hasNext(); )
          set = set.add(iter.next());
    return set;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:141
   */
  public Collection importedMethods(String name) {
    ASTNode$State state = state();
    try {
    Collection list = new ArrayList();
    for(int i = 0; i < getNumImportDecl(); i++)
      if(!getImportDecl(i).isOnDemand())
        list.addAll(getImportDecl(i).importedMethods(name));
    return list;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:148
   */
  public Collection importedMethodsOnDemand(String name) {
    ASTNode$State state = state();
    try {
    Collection list = new ArrayList();
    for(int i = 0; i < getNumImportDecl(); i++)
      if(getImportDecl(i).isOnDemand())
        list.addAll(getImportDecl(i).importedMethods(name));
    return list;
  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:99
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupType(String packageName, String typeName) {
    ASTNode$State state = state();
    TypeDecl lookupType_String_String_value = getParent().Define_TypeDecl_lookupType(this, null, packageName, typeName);
    return lookupType_String_String_value;
  }
  protected java.util.Map lookupType_String_values;
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:259
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupType(String name) {
    Object _parameters = name;
    if(lookupType_String_values == null) lookupType_String_values = new java.util.HashMap(4);
    if(lookupType_String_values.containsKey(_parameters)) {
      return (SimpleSet)lookupType_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet lookupType_String_value = getParent().Define_SimpleSet_lookupType(this, null, name);
      if(isFinal && num == state().boundariesCrossed) lookupType_String_values.put(_parameters, lookupType_String_value);
    return lookupType_String_value;
  }
  /**
   * @attribute inh
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:111
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    ASTNode$State state = state();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect StaticImports
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:140
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection lookupMethod(String name) {
    ASTNode$State state = state();
    Collection lookupMethod_String_value = getParent().Define_Collection_lookupMethod(this, null, name);
    return lookupMethod_String_value;
  }
  /**
   * @attribute inh
   * @aspect AccessMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:184
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodAccessInfo accessMethod(MethodDecl md) {
    ASTNode$State state = state();
    MethodAccessInfo accessMethod_MethodDecl_value = getParent().Define_MethodAccessInfo_accessMethod(this, null, md);
    return accessMethod_MethodDecl_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:360
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:32
   * @apilevel internal
   */
  public CompilationUnit Define_CompilationUnit_compilationUnit(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return this;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:51
   * @apilevel internal
   */
  public boolean Define_boolean_isIncOrDec(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_isIncOrDec(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:198
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    if(caller == getImportDeclListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    return !exceptionType.isUncheckedException();
  }
  }
    else if(caller == getTypeDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return !exceptionType.isUncheckedException();
  }
    else {      return getParent().Define_boolean_handlesException(this, caller, exceptionType);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:355
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    if(caller == getImportDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return lookupType(name);
  }
    else  { 
   int childIndex = this.getIndexOfChild(caller);
{
    SimpleSet result = SimpleSet.emptySet;
    for(Iterator iter = refined_TypeScopePropagation_CompilationUnit_Child_lookupType_String(name).iterator(); iter.hasNext(); ) {
      TypeDecl typeDecl = (TypeDecl)iter.next();
      if(typeDecl instanceof ParTypeDecl)
        result = result.add(((ParTypeDecl)typeDecl).genericDecl());
      else
        result = result.add(typeDecl);
    }
    return result;
  }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:27
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_allImportedTypes(ASTNode caller, ASTNode child, String name) {
    if(caller == getImportDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return importedTypes(name);
  }
    else {      return getParent().Define_SimpleSet_allImportedTypes(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:90
   * @apilevel internal
   */
  public String Define_String_packageName(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return packageName();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:69
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getImportDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.PACKAGE_NAME;
  }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:493
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:519
   * @apilevel internal
   */
  public boolean Define_boolean_isNestedType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:529
   * @apilevel internal
   */
  public boolean Define_boolean_isMemberType(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_isMemberType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:541
   * @apilevel internal
   */
  public boolean Define_boolean_isLocalClass(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:563
   * @apilevel internal
   */
  public String Define_String_hostPackage(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return packageName();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:583
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_hostType(ASTNode caller, ASTNode child) {
    if(caller == getImportDeclListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return null;
  }
    else {      return getParent().Define_TypeDecl_hostType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:104
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getTypeDeclListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    SimpleSet set = importedFields(name);
    if(!set.isEmpty()) return set;
    set = importedFieldsOnDemand(name);
    if(!set.isEmpty()) return set;
    return lookupVariable(name);
  }
  }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/StaticImports.jrag:133
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
    if(caller == getTypeDeclListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
    Collection list = importedMethods(name);
    if(!list.isEmpty()) return list;
    list = importedMethodsOnDemand(name);
    if(!list.isEmpty()) return list;
    return lookupMethod(name);
  }
  }
    else {      return getParent().Define_Collection_lookupMethod(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:166
   * @apilevel internal
   */
  public MethodAccessInfo Define_MethodAccessInfo_accessMethod(ASTNode caller, ASTNode child, MethodDecl md) {
    if(caller == getTypeDeclListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
		String name = md.name();
		for(ImportDecl i : getImportDecls())
			if(!i.isOnDemand())
				for(Iterator iter = i.importedMethods(name).iterator(); iter.hasNext(); ) {
					MethodDecl md2 = (MethodDecl)iter.next();
					if(md == md2)
						return new MethodAccessInfo(md, md.hostType(), new HashSet());
				}
		for(ImportDecl i : getImportDecls())
			if(i.isOnDemand())
				for(Iterator iter = i.importedMethods(name).iterator(); iter.hasNext(); ) {
					MethodDecl md2 = (MethodDecl)iter.next();
					if(md == md2)
						return new MethodAccessInfo(md, md.hostType(), new HashSet());
				}
		return accessMethod(md);
	}
  }
    else {      return getParent().Define_MethodAccessInfo_accessMethod(this, caller, md);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:342
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getTypeDeclListNoTransform())  { 
    int childIndex = caller.getIndexOfChild(child);
    {
		String name = decl.name();
		for(ImportDecl i : getImportDecls())
			if(!i.isOnDemand())
				for(Iterator iter = i.importedFields(name).iterator(); iter.hasNext(); ) {
					FieldDeclaration fd = (FieldDeclaration)iter.next();
					if(fd == decl)
						return new SymbolicFieldAccess(fd);
				}
		for(ImportDecl i : getImportDecls())
			if(i.isOnDemand())
				for(Iterator iter = i.importedFields(name).iterator(); iter.hasNext(); ) {
					FieldDeclaration fd = (FieldDeclaration)iter.next();
					if(fd == decl)
						return new SymbolicFieldAccess(fd);
				}
		return accessVariable(decl);
	}
  }
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
