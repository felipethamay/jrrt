/* This file was generated with JastAdd2 (http://jastadd.org) version R20130212 (r1031) */
package AST;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;

import jp.ac.kobe_u.cs.cream.DefaultSolver;
import jp.ac.kobe_u.cs.cream.IntArith;
import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import jp.ac.kobe_u.cs.cream.Solution;
import tests.CompileHelper;
import tests.jdolly.ConditionsAddParameter;
import tests.jdolly.ConditionsMoveMethod;
import tests.jdolly.ConditionsPullUpMethod;
import tests.jdolly.ConditionsPushDownMethod;
import tests.jdolly.ConditionsRenameMethod;
/**
 * @production Program : {@link ASTNode} ::= <span class="component">{@link CompilationUnit}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:1
 */
public class Program extends ASTNode<ASTNode> implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    typeObject_computed = false;
    typeObject_value = null;
    typeCloneable_computed = false;
    typeCloneable_value = null;
    typeSerializable_computed = false;
    typeSerializable_value = null;
    typeBoolean_computed = false;
    typeBoolean_value = null;
    typeByte_computed = false;
    typeByte_value = null;
    typeShort_computed = false;
    typeShort_value = null;
    typeChar_computed = false;
    typeChar_value = null;
    typeInt_computed = false;
    typeInt_value = null;
    typeLong_computed = false;
    typeLong_value = null;
    typeFloat_computed = false;
    typeFloat_value = null;
    typeDouble_computed = false;
    typeDouble_value = null;
    typeString_computed = false;
    typeString_value = null;
    typeVoid_computed = false;
    typeVoid_value = null;
    typeNull_computed = false;
    typeNull_value = null;
    unknownType_computed = false;
    unknownType_value = null;
    hasPackage_String_values = null;
    lookupType_String_String_values = null;
    lookupLibType_String_String_values = null;
    getLibCompilationUnit_String_values = null;
    getLibCompilationUnit_String_list = null;    getPrimitiveCompilationUnit_computed = false;
    getPrimitiveCompilationUnit_value = null;
    unknownConstructor_computed = false;
    unknownConstructor_value = null;
    wildcards_computed = false;
    wildcards_value = null;
    sourceMethods_computed = false;
    sourceMethods_value = null;
    sourceClassDecls_computed = false;
    sourceClassDecls_value = null;
    sourcePackageDecls_computed = false;
    sourcePackageDecls_value = null;
    getPackageDecl_String_values = null;
    getSubPackageDecls_String_values = null;
    typeReentrantLock_computed = false;
    typeReentrantLock_value = null;
    typeCondition_computed = false;
    typeCondition_value = null;
    methodNotify_computed = false;
    methodNotify_value = null;
    methodNotifyAll_computed = false;
    methodNotifyAll_value = null;
    methodWait_computed = false;
    methodWait_value = null;
    methodWaitLong_computed = false;
    methodWaitLong_value = null;
    methodWaitLongInt_computed = false;
    methodWaitLongInt_value = null;
    waitNotifyMethods_computed = false;
    waitNotifyMethods_value = null;
    monitorActions_computed = false;
    monitorActions_value = null;
    unknownVarAccess_computed = false;
    unknownVarAccess_value = null;
    Program_accessibilityConstraints_computed = false;
    Program_accessibilityConstraints_value = null;
    Program_accessibilityConstraints_contributors = null;
    Program_typeWithSameNameAsPackage_computed = false;
    Program_typeWithSameNameAsPackage_value = null;
    Program_typeWithSameNameAsPackage_contributors = null;
    collect_contributors_Program_accessibilityConstraints = false;
    collect_contributors_Program_typeWithSameNameAsPackage = false;
    collect_contributors_TypeDecl_childTypes = false;
    collecting_contributors_TypeDecl_childTypes = false;
    collect_contributors_TypeDecl_uses = false;
    collect_contributors_TypeDecl_instantiations = false;
    collect_contributors_ConstructorDecl_uses = false;
    collect_contributors_FieldDeclaration_staticImports = false;
    collect_contributors_MethodDecl_coll_overridingMethods = false;
    collect_contributors_MethodDecl_polyUses_ = false;
    collect_contributors_GenericMethodDecl_parUses = false;
    collect_contributors_GenericConstructorDecl_parUses = false;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    Program_accessibilityConstraints_computed = false;
    Program_accessibilityConstraints_value = null;
    Program_accessibilityConstraints_contributors = null;
    Program_typeWithSameNameAsPackage_computed = false;
    Program_typeWithSameNameAsPackage_value = null;
    Program_typeWithSameNameAsPackage_contributors = null;
    collect_contributors_Program_accessibilityConstraints = false;
    collect_contributors_Program_typeWithSameNameAsPackage = false;
    collect_contributors_TypeDecl_childTypes = false;
    collecting_contributors_TypeDecl_childTypes = false;
    collect_contributors_TypeDecl_uses = false;
    collect_contributors_TypeDecl_instantiations = false;
    collect_contributors_ConstructorDecl_uses = false;
    collect_contributors_FieldDeclaration_staticImports = false;
    collect_contributors_MethodDecl_coll_overridingMethods = false;
    collect_contributors_MethodDecl_polyUses_ = false;
    collect_contributors_GenericMethodDecl_parUses = false;
    collect_contributors_GenericConstructorDecl_parUses = false;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Program clone() throws CloneNotSupportedException {
    Program node = (Program)super.clone();
    node.typeObject_computed = false;
    node.typeObject_value = null;
    node.typeCloneable_computed = false;
    node.typeCloneable_value = null;
    node.typeSerializable_computed = false;
    node.typeSerializable_value = null;
    node.typeBoolean_computed = false;
    node.typeBoolean_value = null;
    node.typeByte_computed = false;
    node.typeByte_value = null;
    node.typeShort_computed = false;
    node.typeShort_value = null;
    node.typeChar_computed = false;
    node.typeChar_value = null;
    node.typeInt_computed = false;
    node.typeInt_value = null;
    node.typeLong_computed = false;
    node.typeLong_value = null;
    node.typeFloat_computed = false;
    node.typeFloat_value = null;
    node.typeDouble_computed = false;
    node.typeDouble_value = null;
    node.typeString_computed = false;
    node.typeString_value = null;
    node.typeVoid_computed = false;
    node.typeVoid_value = null;
    node.typeNull_computed = false;
    node.typeNull_value = null;
    node.unknownType_computed = false;
    node.unknownType_value = null;
    node.hasPackage_String_values = null;
    node.lookupType_String_String_values = null;
    node.lookupLibType_String_String_values = null;
    node.getLibCompilationUnit_String_values = null;
    node.getLibCompilationUnit_String_list = null;    node.getPrimitiveCompilationUnit_computed = false;
    node.getPrimitiveCompilationUnit_value = null;
    node.unknownConstructor_computed = false;
    node.unknownConstructor_value = null;
    node.wildcards_computed = false;
    node.wildcards_value = null;
    node.sourceMethods_computed = false;
    node.sourceMethods_value = null;
    node.sourceClassDecls_computed = false;
    node.sourceClassDecls_value = null;
    node.sourcePackageDecls_computed = false;
    node.sourcePackageDecls_value = null;
    node.getPackageDecl_String_values = null;
    node.getSubPackageDecls_String_values = null;
    node.typeReentrantLock_computed = false;
    node.typeReentrantLock_value = null;
    node.typeCondition_computed = false;
    node.typeCondition_value = null;
    node.methodNotify_computed = false;
    node.methodNotify_value = null;
    node.methodNotifyAll_computed = false;
    node.methodNotifyAll_value = null;
    node.methodWait_computed = false;
    node.methodWait_value = null;
    node.methodWaitLong_computed = false;
    node.methodWaitLong_value = null;
    node.methodWaitLongInt_computed = false;
    node.methodWaitLongInt_value = null;
    node.waitNotifyMethods_computed = false;
    node.waitNotifyMethods_value = null;
    node.monitorActions_computed = false;
    node.monitorActions_value = null;
    node.unknownVarAccess_computed = false;
    node.unknownVarAccess_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Program copy() {
    try {
      Program node = (Program) clone();
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
  public Program fullCopy() {
    Program tree = (Program) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:22
   */
  

  protected BytecodeReader bytecodeReader;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:23
   */
  public void initBytecodeReader(BytecodeReader r) { bytecodeReader = r; }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:24
   */
  
  protected JavaParser javaParser;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:25
   */
  public void initJavaParser(JavaParser p) { javaParser = p; }
  /**
   * Add a filename to the list of source files to process.
   * @return The CompilationUnit representing the source file,
   * or <code>null</code> if no such file exists
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:39
   */
  public CompilationUnit addSourceFile(String name) {
    return sourceFiles.addSourceFile(name);
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:44
   */
  public Iterator compilationUnitIterator() {
    initPaths();
    return new Iterator() {
      int index = 0;
      public boolean hasNext() {
        return index < getNumCompilationUnit() || !sourceFiles.isEmpty();
      }
      public Object next() {
        if(getNumCompilationUnit() == index) {
          String typename = (String)sourceFiles.keySet().iterator().next();
          CompilationUnit u = getCompilationUnit(typename);
          if(u != null) {
            addCompilationUnit(u);
            getCompilationUnit(getNumCompilationUnit()-1);
          }
          else
            throw new Error("File " + typename + " not found");
        }
        return getCompilationUnit(index++);
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:73
   */
  public InputStream getInputStream(String name) {
    initPaths();
    try {
      for(Iterator iter = classPath.iterator(); iter.hasNext(); ) {
        PathPart part = (PathPart)iter.next();
        if(part.selectCompilationUnit(name))
          return part.is;
      }
    }
    catch(IOException e) {
    }
    throw new Error("Could not find nested type " + name);
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:96
   */
  public CompilationUnit getCompilationUnit(String name) {
    initPaths();
    try {
      if(sourceFiles.selectCompilationUnit(name))
        return sourceFiles.getCompilationUnit();
      PathPart sourcePart = null;
      PathPart classPart = null;
      for(Iterator iter = sourcePath.iterator(); iter.hasNext() && sourcePart == null; ) {
        PathPart part = (PathPart)iter.next();
        if(part.selectCompilationUnit(name))
          sourcePart = part;
      }
      for(Iterator iter = classPath.iterator(); iter.hasNext() && classPart == null; ) {
        PathPart part = (PathPart)iter.next();
        if(part.selectCompilationUnit(name))
          classPart = part;
      }
      
      if(sourcePart != null && (classPart == null || classPart.age < sourcePart.age)) {
        CompilationUnit unit = sourcePart.getCompilationUnit();
        int index = name.lastIndexOf('.');
        if(index == -1)
          return unit;
        String pkgName = name.substring(0, index);
        if(pkgName.equals(unit.getPackageDecl()))
          return unit;
      }
      if(classPart != null) {
        CompilationUnit unit = classPart.getCompilationUnit();
        int index = name.lastIndexOf('.');
        if(index == -1)
          return unit;
        String pkgName = name.substring(0, index);
        if(pkgName.equals(unit.getPackageDecl()))
          return unit;
      }
      return null;
    }
    catch(IOException e) {
    }
    return null;
  }
  /**
   * @return <code>true</code> if there is a package with the given name on
   * the path
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:143
   */
  public boolean isPackage(String name) {
    if(sourceFiles.hasPackage(name))
      return true;
    if (classPath != null)
    for(Iterator iter = classPath.iterator(); iter.hasNext(); ) {
      PathPart part = (PathPart)iter.next();
      if(part.hasPackage(name))
        return true;
    }
    if (sourcePath != null)
    for(Iterator iter = sourcePath.iterator(); iter.hasNext(); ) {
      PathPart part = (PathPart)iter.next();
      if(part.hasPackage(name))
        return true;
    }
    return false;
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:173
   */
  

  private boolean pathsInitialized = false;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:174
   */
  
  private java.util.ArrayList classPath;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:175
   */
  
  private java.util.ArrayList sourcePath;
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:176
   */
  
  private FileNamesPart sourceFiles = new FileNamesPart(this);
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:178
   */
  public void pushClassPath(String name) {
    PathPart part = PathPart.createSourcePath(name, this);
    if(part != null) {
      sourcePath.add(part);
      System.out.println("Pushing source path " + name);
    }
    else
      throw new Error("Could not push source path " + name);
    part = PathPart.createClassPath(name, this);
    if(part != null) {
      classPath.add(part);
      System.out.println("Pushing class path " + name);
    }
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:192
   */
  public void popClassPath() {
    if(sourcePath.size() > 0)
      sourcePath.remove(sourcePath.size()-1);
    if(classPath.size() > 0)
      classPath.remove(classPath.size()-1);
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:199
   */
  public void initPaths() {
    if(!pathsInitialized) {
      pathsInitialized = true;

      //System.err.println("Initializing class paths");
      
      ArrayList classPaths = new ArrayList();
      ArrayList sourcePaths = new ArrayList();
      
      String[] bootclasspaths;
      if(options().hasValueForOption("-bootclasspath"))
        bootclasspaths = options().getValueForOption("-bootclasspath").split(File.pathSeparator);
      else
        bootclasspaths = System.getProperty("sun.boot.class.path").split(File.pathSeparator);
      for(int i = 0; i < bootclasspaths.length; i++) {
        classPaths.add(bootclasspaths[i]);
        //System.err.println("Adding classpath " + bootclasspaths[i]);
      }
      
      String[] extdirs;
      if(options().hasValueForOption("-extdirs"))
        extdirs = options().getValueForOption("-extdirs").split(File.pathSeparator);
      else
        extdirs = System.getProperty("java.ext.dirs").split(File.pathSeparator);
      for(int i = 0; i < extdirs.length; i++) {
        classPaths.add(extdirs[i]);
        //System.err.println("Adding classpath " + extdirs[i]);
      }

      String[] userClasses = null;
      if(options().hasValueForOption("-classpath"))
        userClasses = options().getValueForOption("-classpath").split(File.pathSeparator);
      else if(options().hasValueForOption("-cp"))
        userClasses = options().getValueForOption("-cp").split(File.pathSeparator);
      else {
        userClasses = ".".split(File.pathSeparator);
      }
      if(!options().hasValueForOption("-sourcepath")) {
        for(int i = 0; i < userClasses.length; i++) {
          classPaths.add(userClasses[i]);
          sourcePaths.add(userClasses[i]);
          //System.err.println("Adding classpath/sourcepath " + userClasses[i]);
        }
      }
      else {
        for(int i = 0; i < userClasses.length; i++) {
          classPaths.add(userClasses[i]);
          //System.err.println("Adding classpath " + userClasses[i]);
        }
        userClasses = options().getValueForOption("-sourcepath").split(File.pathSeparator);
        for(int i = 0; i < userClasses.length; i++) {
          sourcePaths.add(userClasses[i]);
          //System.err.println("Adding sourcepath " + userClasses[i]);
        }
      }
        
      classPath = new ArrayList();
      sourcePath = new ArrayList();
      
      for(Iterator iter = classPaths.iterator(); iter.hasNext(); ) {
        String s = (String)iter.next();
        PathPart part = PathPart.createClassPath(s, this);
        if(part != null) {
          classPath.add(part);
          //System.out.println("Adding classpath " + s);
        }
        else if(options().verbose())
          System.out.println("Warning: Could not use " + s + " as class path");
      }
      for(Iterator iter = sourcePaths.iterator(); iter.hasNext(); ) {
        String s = (String)iter.next();
        PathPart part = PathPart.createSourcePath(s, this);
        if(part != null) {
          sourcePath.add(part);
          //System.out.println("Adding sourcepath " + s);
        }
        else if(options().verbose())
          System.out.println("Warning: Could not use " + s + " as source path");
      }
    }
  }
  /**
   * Add a path part to the library class path.
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:284
   */
  public void addClassPath(PathPart pathPart) {
    classPath.add(pathPart);
    pathPart.program = this;
  }
  /**
   * Add a path part to the user class path.
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:292
   */
  public void addSourcePath(PathPart pathPart) {
    sourcePath.add(pathPart);
    pathPart.program = this;
  }
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:298
   */
  public void simpleReset() {
    lookupType_String_String_values = new HashMap();
    hasPackage_String_values = new HashMap();
    List list = new List();
    for(int i = 0; i < getNumCompilationUnit(); i++) {
      CompilationUnit unit = getCompilationUnit(i);
      if(!unit.fromSource()) {
        list.add(unit);
      }
    }
    setCompilationUnitList(list);
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:208
   */
  public void errorCheck(Collection collection) {
    for(Iterator iter = compilationUnitIterator(); iter.hasNext(); ) {
      CompilationUnit cu = (CompilationUnit)iter.next();
      if(cu.fromSource()) {
        cu.collectErrors();
        collection.addAll(cu.errors);
      }
    }
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:217
   */
  public void errorCheck(Collection collection, Collection warn) {
    for(Iterator iter = compilationUnitIterator(); iter.hasNext(); ) {
      CompilationUnit cu = (CompilationUnit)iter.next();
      if(cu.fromSource()) {
        cu.collectErrors();
        collection.addAll(cu.errors);
        warn.addAll(cu.warnings);
      }
    }
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:238
   */
  public boolean errorCheck() {
    Collection collection = new LinkedList();
    errorCheck(collection);
    if(collection.isEmpty())
      return false;
    System.out.println("Errors:");
    for(Iterator iter = collection.iterator(); iter.hasNext(); ) {
      String s = (String)iter.next();
      System.out.println(s);
    }
    return true;
  }
  /**
   * @ast method 
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:101
   */
  

  public int classFileReadTime;
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:821
   */
  public String dumpTree() {
    StringBuffer s = new StringBuffer();
    for(Iterator iter = compilationUnitIterator(); iter.hasNext(); ) {
      CompilationUnit cu = (CompilationUnit)iter.next();
      if(cu.fromSource()) { 
        s.append(cu.dumpTree());
      }
    }
    return s.toString();
  }
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:13
   */
  public void dot() {
		System.out.println("digraph " + String.valueOf(hashCode()) + " {");
		super.dot();
		System.out.println("}");
	}
  /**
   * @ast method 
   * @aspect Errors
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Errors.jrag:6
   */
  public void clearErrors() {
		for(CompilationUnit cu : getCompilationUnits())
			if(cu.fromSource())
				cu.clearErrors();
	}
  /**
   * @ast method 
   * @aspect Comments
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/JastAddJComments.jrag:15
   */
  public FileRange findComment(String comment) {
		for(CompilationUnit cu : getCompilationUnits()) {
			if(cu.fromSource()) {
				FileRange fr = cu.findComment(comment);
				if(fr != null)
					return fr;
			}
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:3
   */
  public TypeDecl findType(String pkg, String name) {
		String path[] = name.split("\\.");
		TypeDecl tp = lookupType(pkg, path[0]);
		if(tp == null) return null;
		for(int i=1;i<path.length;++i) {
			Iterator<TypeDecl> iter = tp.memberTypes(path[i]).iterator();
			if(!iter.hasNext()) return null;
			tp = iter.next();
		}
		return tp;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:16
   */
  public TypeDecl findType(String name) {
		String path[] = name.split("\\.");
		String pkg = "";
		int i;
		for(i=0;i<path.length;++i) {
			String new_pkg = pkg + (i == 0 ? "" : ".") + path[i];
			if(!hasPackage(new_pkg))
				break;
			pkg = new_pkg;
		}
		TypeDecl tp = pkg.length()==0 ? findSimpleType(path[(i=1)-1]) : findType(pkg, path[i++]);
		if(tp == null)
			return null;
		for(;i<path.length;++i) {
			Iterator<TypeDecl> iter = tp.memberTypes(path[i]).iterator();
			if(!iter.hasNext()) return null;
			tp = iter.next();
		}
		return tp;		
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:37
   */
  public ConstructorDecl findConstructor(String name) {
		TypeDecl td = findType(name);
		if(td != null)
			return (ConstructorDecl)td.constructors().iterator().next();
		return null;
	}
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:2
   */
  
	private Collection<PackageDecl> packageDecls = new LinkedList<PackageDecl>();
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:20
   */
  private void refined_PackageDecl_Program_addPackageDecl(PackageDecl pd) {
		packageDecls.add(pd);
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:83
   */
  public Collection<Visible> sourceVisibles() {
		Collection<Visible> visibles = new HashSet<Visible>();
		collectSourceVisibles(visibles);
		return visibles;
	}
  /**
   * @ast method 
   * @aspect AccessibilityGlue
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityGlue.jrag:15
   */
  public void eliminateLockedNamesInSubtree() {
		// check naming constraints first; if that fails we don't have to solve constraints
		checkNamingConstraints();
		adjustAccessibility();
		eliminateLockedNames();
		while(!affectedByUnlock.isEmpty()) {
			adjustAccessibility(collectAccessibilityConstraints(affectedByUnlock));
			affectedByUnlock.clear();
			eliminateLockedNames();
		}
		flushCaches();
	}
  /**
   * @ast method 
   * @aspect AccessibilityGlue
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityGlue.jrag:28
   */
  private Collection<AccessibilityConstraint> collectAccessibilityConstraints(Collection<Access> accs) {
		Collection<AccessibilityConstraint> seed = new LinkedList<AccessibilityConstraint>();
		for(Access acc : accs)
			acc.collectAccessibilityConstraints(seed);
		return seed;
	}
  /**
   * @ast method 
   * @aspect AccessibilityGlue
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityGlue.jrag:35
   */
  private void adjustAccessibility() {
		adjustAccessibility(accessibilityConstraints());
	}
  /**
   * @ast method 
   * @aspect AccessibilityGlue
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityGlue.jrag:39
   */
  private void adjustAccessibility(Collection<AccessibilityConstraint> seed) {
		Collection<AccessibilityConstraint> accessibilityConstraints = relevantAccessibilityConstraints(seed);	
		if(accessibilityConstraints.isEmpty())
			return;
		Map<Visible, Integer> acc_map = solve(accessibilityConstraints);
		if (ConditionsMoveMethod.cond4 && ConditionsPullUpMethod.cond1 && ConditionsRenameMethod.cond3 
		&& ConditionsPushDownMethod.cond2 && ConditionsAddParameter.cond3) {
		if(acc_map == null)
			if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond5.isEnabled())
		  throw new RefactoringException("cannot adjust accessibilities");
		adjustAccessibilities(acc_map);
  }
		flushCaches();
	}
  

  /**
   * @ast method 
   * @aspect AccessibilityGlue
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityGlue.jrag:50
   */
  protected void adjustAccessibilities(Map<Visible, Integer> acc_map) {
		for(Map.Entry<Visible, Integer> e : acc_map.entrySet()) {
			Visible vis = e.getKey();
			if(!vis.fromSource())
				throw new RefactoringException("cannot adjust accessibility of library element");
			// TODO: hide this behind an interface (see ChangeAccessibility.jrag)
			if(vis instanceof FieldDeclaration) {
				FieldDeclaration fd = (FieldDeclaration)vis;
				programRoot().lockNames(fd.name());
			} else if(vis instanceof MethodDecl) {
				MethodDecl md = (MethodDecl)vis;
				programRoot().lockMethodNames(md.name());
			} else if(vis instanceof TypeDecl) {
				TypeDecl td = (TypeDecl)vis;
				programRoot().lockNames(td.name());
			}
			vis.setVisibility(e.getValue());
		}
	}
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:179
   */
  public Collection<AccessibilityConstraint> relevantAccessibilityConstraints() {
		return relevantAccessibilityConstraints(accessibilityConstraints());
	}
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:183
   */
  public Collection<AccessibilityConstraint> relevantAccessibilityConstraints(Collection<AccessibilityConstraint> seed) {
		java.util.Set<AccessibilityConstraint> accessibilityConstraints = new HashSet<AccessibilityConstraint>();
		java.util.Set<Visible> visiblesToDo = new HashSet<Visible>();
		java.util.Set<Visible> visiblesDone = new HashSet<Visible>();
		
		for(AccessibilityConstraint ac : seed) {
			if(!ac.isSolved()) {
				Collection<Visible> vis = ac.referencedVisibles();
				if(vis.isEmpty()) {
					// constraint is violated, and there is nothing we can do about it
					throw new RefactoringException("unfixable accessibility constraint");
				}
				visiblesToDo.addAll(vis);
			}
		}
		
		while (!visiblesToDo.isEmpty()) {
			Visible actual = visiblesToDo.iterator().next();
			visiblesDone.add(actual);
			for (AccessibilityConstraint ac : actual.referencingAccessibilityConstraints()) {
				if(accessibilityConstraints.contains(ac))
					continue;
				accessibilityConstraints.add(ac);
				for (Visible v : ac.referencedVisibles())
					if (!visiblesDone.contains(v))
						visiblesToDo.add(v);
			}
			visiblesToDo.remove(actual);
		}
		return accessibilityConstraints;
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:78
   */
  public Network generateNetwork(Collection<AccessibilityConstraint> accessibilityConstraints, boolean setObjective) {
		Network network = new Network();
		IntVariable w = setObjective ? new IntVariable(network, 0) : null;
		int i = 0;
		// make sure we have variables for all visible elements references by a constraint
		for(Visible vis : referencedVisibles(accessibilityConstraints)) {
			IntVariable var = vis.creamVariable(network);
			if(setObjective) {
				++i;
				IntVariable x = new IntVariable(network, 0, 4*i);
				// x = w + v
				new IntArith(network, IntArith.ADD, x, w, var.subtract(vis.getVisibility()).abs());
				w = x;
			}
		}
		for(AccessibilityConstraint constr : accessibilityConstraints)
			constr.generateCreamConstraint(network);
		if(setObjective)
			network.setObjective(w);
		return network;
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:100
   */
  public Map<Visible, Integer> solve(Network network, Collection<AccessibilityConstraint> constraints) {
		DefaultSolver solver = new DefaultSolver(network);
		Solution sol = solver.findBest();
		if(sol == null)
			return null;
		return generateAccessibilityMap(network, sol, constraints);
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:109
   */
  public Collection<Map<Visible, Integer>> allPossibleSolutions(Network network, Collection<AccessibilityConstraint> constraints) {
		Collection<Map<Visible, Integer>> res = new LinkedList<Map<Visible, Integer>>();
		DefaultSolver solver = new DefaultSolver(network);
		for(solver.start(); solver.waitNext(); solver.resume())
			res.add(generateAccessibilityMap(network, solver.getSolution(), constraints));
		solver.stop();
		return res;
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:118
   */
  public Map<Visible, Integer> solve(Collection<AccessibilityConstraint> accessibilityConstraints) {
		return solve(generateNetwork(accessibilityConstraints, true), accessibilityConstraints);
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:122
   */
  public Collection<Map<Visible, Integer>> allPossibleSolutions(Collection<AccessibilityConstraint> accessibilityConstraints) {
		return allPossibleSolutions(generateNetwork(accessibilityConstraints, false), accessibilityConstraints);
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:126
   */
  public Collection<Map<Visible, Integer>> allPossibleSolutions() {
		return allPossibleSolutions(generateNetwork(accessibilityConstraints(), false), accessibilityConstraints());
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:130
   */
  private Map<Visible, Integer> generateAccessibilityMap(Network network, Solution solution, Collection<AccessibilityConstraint> constraints) {
		Map<Visible, Integer> map = new HashMap<Visible, Integer>();
		for(Visible element : referencedVisibles(constraints)) {
			IntVariable var = element.creamVariable(network);
			int val = solution.getIntValue(var);
			if(val != element.getVisibility())
				map.put(element, val);
		}
		return map;
	}
  /**
   * @ast method 
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:141
   */
  private Collection<Visible> referencedVisibles(Collection<AccessibilityConstraint> constraints) {
		HashSet<Visible> res = new HashSet<Visible>();
		for(AccessibilityConstraint constraint : constraints) {
			for (Visible visible : constraint.referencedVisibles()) {
				res.add(visible);
			}
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect InsertUnusedType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/InsertUnusedType.jrag:51
   */
  public CompilationUnit insertUnusedType(String path, String pkg, List<ImportDecl> imports, TypeDecl td) {
		TypeDecl res = lookupType(pkg, td.name());
		if(res != null && res != td || hasPackage(pkg + td.name()))
			throw new RefactoringException("different toplevel type of same name exists");
		CompilationUnit new_cu = new CompilationUnit(pkg, imports, new List<TypeDecl>().add(td));
		new_cu.setFromSource(true);
		new_cu.setPathName(path + td.name() + ".java");
		addCompilationUnit(new_cu);
		return new_cu;
	}
  /**
   * @ast method 
   * @aspect Rename
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Rename.jrag:27
   */
  
	
	/* Any sweep over the tree to unlock names may introduce new locked names. We collect these 
	 * and all names that have been re-qualified in the program node, if it is accessible. */
	protected final Collection<Access> affectedByUnlock = new LinkedList<Access>();
  /**
   * @ast method 
   * @aspect Rename
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Rename.jrag:29
   */
  public void flushCaches() {
		affectedByUnlock.clear();
		super.flushCaches();
	}
  /**
   * @ast method 
   * @aspect AdjustVirtualCalls
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/AdjustVirtualCalls.jrag:5
   */
  public static void adjustVirtualCalls(Map<Expr, TypeDecl> typeUpdate) {
		for(Map.Entry<Expr, TypeDecl> entry : typeUpdate.entrySet()) {
			Expr e = entry.getKey();
			if(e.isLeftChildOfDot() && e.nextAccess() instanceof MethodAccess) {
				TypeDecl newType = entry.getValue();
				MethodAccess ma = (MethodAccess)e.nextAccess();
				if(ma.isMonoCall())
					continue;
				MethodDecl oldTarget = ma.decl(),
						   newTarget = oldTarget.ancestorIn(newType);
				if(newTarget == null)
					throw new RefactoringException("invalid type change");
				if(!oldTarget.throwsSameExceptionsAs(newTarget))
					throw new RefactoringException("new target throws different exceptions");
				if(oldTarget.type() != newTarget.type())
					throw new RefactoringException("new target has different return type");
				ma.lock(newTarget);				
			}
		}
	}
  /**
   * @ast method 
   * @aspect SmartLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/SmartLocking.jrag:3
   */
  public void lockOverridingAndNames(Map<Expr, TypeDecl> typeUpdate, Map<MemberDecl, TypeDecl> memberMove,
			Map<MethodDecl, Collection<MethodDecl>> methodOverriding) {
		// lock calls that have an argument type changed
		for(Expr e : typeUpdate.keySet()) {
			if(e.isArgument()) {
				Call c = (Call)e.getParent().getParent();
				// TODO: introduce method Call.lock()
				if(c instanceof MethodAccess)
					((MethodAccess)c).lock();
				else if(c instanceof ConstructorAccess)
					((ConstructorAccess)c).lock();
				else if(c instanceof ClassInstanceExpr)
					((ClassInstanceExpr)c).lock();
			}
		}
		
		// find names of potentially affected methods, constructors, fields and types
		Collection<String> potentiallyAffectedMethods = new HashSet<String>();
		Collection<TypeDecl> potentiallyAffectedConstructors = new HashSet<TypeDecl>();
		Collection<String> potentiallyAffectedFields = new HashSet<String>();
		for(Expr e : typeUpdate.keySet()) {
			if(e.isParameterType()) {
				Callable c = ((ParameterDeclaration)e.getParent()).getParameterisedCallable();
				if(c instanceof MethodDecl)
					potentiallyAffectedMethods.add(((MethodDecl)c).name());
				else if(c instanceof ConstructorDecl)
					potentiallyAffectedConstructors.add(((ConstructorDecl)c).hostType());
			}			
		}
		for(MemberDecl md : memberMove.keySet()) {
			if(md instanceof MethodDecl)
				potentiallyAffectedMethods.add(((MethodDecl)md).name());
			if(md instanceof FieldDeclaration)
				potentiallyAffectedFields.add(((FieldDeclaration)md).name());
			if(md instanceof MemberTypeDecl)
				potentiallyAffectedFields.add(((MemberTypeDecl)md).typeDecl().name());
		}
		
		// explicitly set overriding dependencies
		for(Map.Entry<MethodDecl, Collection<MethodDecl>> entry : methodOverriding.entrySet())
			entry.getKey().lockOverriding(entry.getValue());
		
		// lock existing overriding dependencies and names for the rest
		lockOverridingDependencies(potentiallyAffectedMethods);
		lockMethodNames(potentiallyAffectedMethods);
		lockConstructorCalls(potentiallyAffectedConstructors);
		lockNames(potentiallyAffectedFields);
		
		for(MemberDecl md : memberMove.keySet())
			md.lockAllNames();
	}
  /**
   * @ast method 
   * @aspect ProgramFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/ProgramFactory.jrag:4
   */
  public static Program fromStmts(String... stmts) {
		File f = null;
		Program p = null;
		try {
			f = createTempFile("Test.java");
			FileWriter fw = new FileWriter(f);
			fw.write("class Test {\n");
			fw.write("  void m() {\n");
			for(String s : stmts)
				fw.write(s+"\n");
			fw.write("  }\n");
			fw.write("}\n");
			fw.close();
			p = CompileHelper.compile(f.getAbsolutePath());
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(f != null)
				f.delete();
		}
		return p;
	}
  /**
   * @ast method 
   * @aspect ProgramFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/ProgramFactory.jrag:27
   */
  public static Program fromBodyDecls(String... bodydecls) {			
		File f = null;
		Program p = null;
		try {
			f = createTempFile("Test.java");
			FileWriter fw = new FileWriter(f);
			fw.write("class Test {\n");
			for(String s : bodydecls)
				fw.write(s+"\n");
			fw.write("}\n");
			fw.close();
			p = CompileHelper.compile(f.getAbsolutePath());
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(f != null)
				f.delete();
		}
		return p;
	}
  /**
   * @ast method 
   * @aspect ProgramFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/ProgramFactory.jrag:48
   */
  public static Program fromClasses(String... classes) {			
		File f = null;
		Program p = null;
		try {
			f = createTempFile("Test.java");
			FileWriter fw = new FileWriter(f);
			for(String s : classes)
				fw.write(s+"\n");
			fw.close();
			p = CompileHelper.compile(f.getAbsolutePath());
		} catch(IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if(f != null)
				f.delete();
		}
		return p;
	}
  /**
   * @ast method 
   * @aspect ProgramFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/ProgramFactory.jrag:67
   */
  public static Program fromCompilationUnits(RawCU... cus) {
		ArrayList<File> files = new ArrayList<File>();
		Program p = null;
		File dir = null;
		try {
			String[] filenames = new String[cus.length];
			int i=0;
			dir = createTempDirectory();
			for(RawCU cu : cus) {
				File f = new File(dir, cu.getName());
				FileWriter fw = new FileWriter(f);
				fw.write(cu.getContent());
				fw.close();
				filenames[i++] = f.getAbsolutePath();
			}
			p = CompileHelper.compile(filenames);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			for(File f : files)
				if(f != null)
					f.delete();
			if(dir != null)
				dir.delete();
		}
		return p;
	}
  /**
   * @ast method 
   * @aspect ProgramFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/ProgramFactory.jrag:96
   */
  public static File createTempDirectory() throws IOException {
		final File temp;
		temp = File.createTempFile("temp", Long.toString(System.nanoTime()));
		if(!(temp.delete())) {
			throw new IOException("Could not delete temp file: " + temp.getAbsolutePath());
		}
		if(!(temp.mkdir())) {
			throw new IOException("Could not create temp directory: " + temp.getAbsolutePath());
		}
		return (temp);
	}
  /**
   * @ast method 
   * @aspect ProgramFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/ProgramFactory.jrag:108
   */
  public static File createTempFile(String name) throws IOException {
		File dir = createTempDirectory();
		File f = new File(dir, name);
		return f;
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:280
   */
  public static Program fromRTXF(rtxf.Program prog) {
		if(prog.getCu() != null) {
			RawCU[] cus = new RawCU[prog.getCu().size()];
			for(int i=0;i<cus.length;++i) {
				rtxf.Cu cu = prog.getCu().get(i);
				String name = cu.getName().substring(cu.getName().lastIndexOf('/')+1);
				cus[i] = new RawCU(name, cu.getContent());
			}
			return Program.fromCompilationUnits(cus);
		}
		if(prog.getTypedecl() != null) {
			String[] strs = new String[prog.getTypedecl().size()];
			for(int i=0;i<strs.length;++i)
				strs[i] = prog.getTypedecl().get(i).getContent();
			return Program.fromClasses(strs);
		}
		if(prog.getBodydecl() != null) {
			String[] strs = new String[prog.getBodydecl().size()];
			for(int i=0;i<strs.length;++i)
				strs[i] = prog.getBodydecl().get(i).getContent();
			return Program.fromBodyDecls(strs);
		}
		if(prog.getStmt() != null) {
			String[] strs = new String[prog.getStmt().size()];
			for(int i=0;i<strs.length;++i)
				strs[i] = prog.getStmt().get(i).getContent();
			return Program.fromStmts(strs);
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:311
   */
  public FieldDeclaration resolveFieldRef(rtxf.Fieldref fr) {
		String host = fr.getHost();
		TypeDecl td = resolveTypeRef(host);
		if(td == null)
			return null;
		SimpleSet fields = td.localFields(fr.getName());
		return fields.isSingleton() ? (FieldDeclaration)fields.iterator().next() : null;
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:320
   */
  public MethodDecl resolveMethodRef(rtxf.Methodref mr) {
		String host = mr.getHost();
		TypeDecl td = resolveTypeRef(host);
		if(td == null)
			return null;
		SimpleSet meths = td.localMethodsSignature(mr.getSignature());
		return meths.isSingleton() ? (MethodDecl)meths.iterator().next() : null;
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:329
   */
  public Variable resolveTempRef(rtxf.Tempref tr) {
		String host = tr.getHost();
		ASTNode nd = resolveTypeOrMethodRef(host);
		return nd == null ? null : nd.findVariable(tr.getName());
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:335
   */
  public TypeDecl resolveTypeRef(String ref) {
		if(ref.contains("#")) {
			int idx = ref.lastIndexOf('#');
			String outer = ref.substring(0, idx);
			String inner = ref.substring(idx+1);
			if(inner.contains("."))
				return null;
			ASTNode nd = resolveTypeOrMethodRef(outer);
			return nd == null ? null : nd.findSimpleType(inner);
		} else if(ref.contains("@")) {
			int idx = ref.indexOf('@');
			String outer = ref.substring(0, idx);
			String inner = ref.substring(idx+1);
			if(inner.contains("@") || inner.contains("#") || inner.contains("."))
				return null;
			ASTNode nd = resolveTypeOrMethodRef(outer);
			if(!(nd instanceof GenericElement))
				return null;
			GenericElement ge = (GenericElement)nd;
			for(int i=0;i<ge.getNumTypeParameter();++i)
				if(ge.getTypeParameter(i).name().equals(inner))
					return ge.getTypeParameter(i);
			return null;
		} else {
			return findType(ref);
		}
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:363
   */
  public MethodDecl resolveMethodRef(String ref) {
		int idx1 = ref.lastIndexOf('(');
		String sub = ref.substring(0, idx1);
		int idx2 = sub.lastIndexOf('.');
		if(idx2 == -1)
			return findMethodBySig(ref);
		String tpname = ref.substring(0, idx2);
		String sig = ref.substring(idx2+1);
		TypeDecl tp = resolveTypeRef(tpname);
		if(tp == null)
			return null;
		SimpleSet s = tp.localMethodsSignature(sig);
		return s.isSingleton() ? (MethodDecl)s.iterator().next() : null; 
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:378
   */
  public ASTNode resolveTypeOrMethodRef(String ref) {
		return ref.contains("(") ? resolveMethodRef(ref) : resolveTypeRef(ref);
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:382
   */
  public Stmt resolveStmtRef(rtxf.Stmtref bstmt) {
		Stmt from;
		if(bstmt.getAfter() != null)
			from = (Stmt)findNodeAfter(Stmt.class, bstmt.getAfter());
		else
			from = (Stmt)findNodeBefore(Stmt.class, bstmt.getBefore());
		return from;
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:391
   */
  public Expr resolveExpref(rtxf.Expref eref) {
		return (Expr)findNodeBetween(Expr.class, eref.getAfter(), eref.getBefore());
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:235
   */
  public ASTNode findNodeAfter(Class clazz, String comment) {
		for(CompilationUnit cu : getCompilationUnits()) {
			FileRange fr = cu.findComment(comment);
			if(fr != null)
				return cu.findNodeAfter(clazz, fr.el, fr.ec);
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:259
   */
  public ASTNode findNodeBefore(Class clazz, String comment) {
		for(CompilationUnit cu : getCompilationUnits()) {
			FileRange fr = cu.findComment(comment);
			if(fr != null)
				return cu.findNodeBefore(clazz, fr.sl, fr.sc);
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:283
   */
  public ASTNode findNodeBetween(Class clazz, String startComment, String endComment) {
		for(CompilationUnit cu : getCompilationUnits()) {
			FileRange fr1 = findComment(startComment),
					  fr2 = findComment(endComment);
			if(fr1 != null && fr2 != null)
				return findNodeBetween(clazz, fr1.el, fr1.ec, fr2.sl, fr2.sc);
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:480
   */
  public void writeBack() throws IOException {
		for(Iterator i = compilationUnitIterator(); i.hasNext();) {
			CompilationUnit cu = (CompilationUnit) i.next();
			if (cu.fromSource())
				cu.writeBack();
		}
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:2
   */
  
	public static boolean DEBUG_UNDO = false;
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:3
   */
  
	private static boolean RECORDING_CHANGES = false;
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:4
   */
  
	public static long undoActionCount = 0;
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:6
   */
  public static boolean isRecordingASTChanges() {
		return RECORDING_CHANGES;
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:11
   */
  public static void startRecordingASTChangesAndFlush() {
		RECORDING_CHANGES = true;
		undoStack = new Stack<ASTModification>();
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:15
   */
  public static void stopRecordingASTChangesAndFlush() {
		RECORDING_CHANGES = false;
		undoStack = new Stack<ASTModification>();
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:22
   */
  
	
	// CheckPoints
	
	private static ASTUndoCheckPoint lastCheckPoint = null;
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:23
   */
  public static ASTUndoCheckPoint createASTUndoCheckPoint() {
		if (!isRecordingASTChanges())
			startRecordingASTChangesAndFlush();
		ASTUndoCheckPoint cp = new ASTUndoCheckPoint();
		lastCheckPoint = cp;
		undoStack.push(cp);
		return cp;
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:58
   */
  
	
	/*
	 * Undo Stack
	 * 
	 * problem with non-static stack: creating new subtrees that are not attached to the
	 * main tree with a Program root node -> no undo in the new subtree
	 */
	private static Stack<ASTModification> undoStack = new Stack<ASTModification>();
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:60
   */
  public static Stack<ASTModification> getUndoStack() {
		return undoStack;
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:64
   */
  public static Stack<ASTModification> cloneUndoStack() {
		return (Stack<ASTModification>) (undoStack != null ? undoStack.clone() : null);
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:70
   */
  public static void addUndoAction(ASTModification action) {
		undoStack.push(action);
		undoActionCount++;
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:75
   */
  public static void undoAll() {
		undoUntil(null);
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:79
   */
  public static void undoUntilLastCheckPoint() {
		undoUntil(lastCheckPoint);
	}
  /**
   * @ast method 
   * @aspect Undo
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/Undo.jrag:83
   */
  public static void undoUntil(ASTUndoCheckPoint cp) {
		if (DEBUG_UNDO) System.out.print("Undoing " + undoStack.size() + " actions... ");
		while (!undoStack.isEmpty()) {
			ASTModification mod = undoStack.pop();
			mod.undo();
			if (cp != null && cp.equals(mod))
				break;
		}
		if (DEBUG_UNDO) System.out.println("done.");
		if (DEBUG_UNDO) System.out.println("Total undo actions: " + undoActionCount);
	}
  /**
   * @ast method 
   * @aspect TypeConstraintSolving
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraintSolving.jrag:91
   */
  public Collection<TypeConstraintVariable> allUpdatableExprs(TypeDecl type) {
		Collection<TypeConstraintVariable> res = new HashSet<TypeConstraintVariable>();
		collectAllUpdatableExprs(type, res);
		return res;
	}
  /**
   * @ast method 
   * 
   */
  public Program() {
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
    children = new ASTNode[1];
    setChild(new List(), 0);
  }
  /**
   * @ast method 
   * 
   */
  public Program(List<CompilationUnit> p0) {
    setChild(p0, 0);
    is$Final(true);
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
   * Replaces the CompilationUnit list.
   * @param list The new list node to be used as the CompilationUnit list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setCompilationUnitList(List<CompilationUnit> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the CompilationUnit list.
   * @return Number of children in the CompilationUnit list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumCompilationUnit() {
    return getCompilationUnitList().getNumChild();
  }
  /**
   * Retrieves the number of children in the CompilationUnit list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the CompilationUnit list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumCompilationUnitNoTransform() {
    return getCompilationUnitListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the CompilationUnit list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the CompilationUnit list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public CompilationUnit getCompilationUnit(int i) {
    return (CompilationUnit)getCompilationUnitList().getChild(i);
  }
  /**
   * Append an element to the CompilationUnit list.
   * @param node The element to append to the CompilationUnit list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addCompilationUnit(CompilationUnit node) {
    List<CompilationUnit> list = (parent == null || state == null) ? getCompilationUnitListNoTransform() : getCompilationUnitList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addCompilationUnitNoTransform(CompilationUnit node) {
    List<CompilationUnit> list = getCompilationUnitListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the CompilationUnit list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setCompilationUnit(CompilationUnit node, int i) {
    List<CompilationUnit> list = getCompilationUnitList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the CompilationUnit list.
   * @return The node representing the CompilationUnit list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<CompilationUnit> getCompilationUnits() {
    return getCompilationUnitList();
  }
  /**
   * Retrieves the CompilationUnit list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CompilationUnit list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<CompilationUnit> getCompilationUnitsNoTransform() {
    return getCompilationUnitListNoTransform();
  }
  /**
   * Retrieves the CompilationUnit list.
   * @return The node representing the CompilationUnit list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<CompilationUnit> refined__Program_getCompilationUnitList() {
    List<CompilationUnit> list = (List<CompilationUnit>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the CompilationUnit list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the CompilationUnit list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<CompilationUnit> getCompilationUnitListNoTransform() {
    return (List<CompilationUnit>)getChildNoTransform(0);
  }
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:12
   */
    public void toString(StringBuffer s) {
		ArrayList<CompilationUnit> cus = new ArrayList<CompilationUnit>();
		for(Iterator<CompilationUnit> iter = compilationUnitIterator(); iter.hasNext();) {
			CompilationUnit cu = iter.next();
			if(cu.fromSource())
				cus.add(cu);
		}
		Collections.sort(cus, new Comparator<CompilationUnit>() {
			public int compare(CompilationUnit cu1, CompilationUnit cu2) {
				String id1 = cu1.getPackageDecl() + "." + cu1.getID();
				String id2 = cu2.getPackageDecl() + "." + cu2.getID();
				return id1.compareTo(id2);
			} 
		});  
		for(CompilationUnit cu : cus)
			cu.toString(s);
	}
  /**
   * @ast method 
   * @aspect UndoRefines
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoRefines.jrag:24
   */
    private void addPackageDecl(final PackageDecl pd) {
		if (Program.isRecordingASTChanges()) {
			final PackageDecl fpd = pd;
			Program.addUndoAction(new ASTModification() {
				@Override
				public void undo() {
					packageDecls.remove(fpd);
				}
				@Override
				public String toString() {
					return "Program.addPackageDecl";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_PackageDecl_Program_addPackageDecl(pd);
				}
			});
		}
		refined_PackageDecl_Program_addPackageDecl(pd);
	}
  /**
   * @ast method 
   * @aspect ClassPath
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ClassPath.jrag:87
   */
   public List getCompilationUnitList() {
    initPaths();
    return refined__Program_getCompilationUnitList();
  }
  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:8
   */
    private boolean collect_contributors_Program_accessibilityConstraints = false;
  protected void collect_contributors_Program_accessibilityConstraints() {
    if(collect_contributors_Program_accessibilityConstraints) return;
    super.collect_contributors_Program_accessibilityConstraints();
    collect_contributors_Program_accessibilityConstraints = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenamePackage.jrag:39
   */
    private boolean collect_contributors_Program_typeWithSameNameAsPackage = false;
  protected void collect_contributors_Program_typeWithSameNameAsPackage() {
    if(collect_contributors_Program_typeWithSameNameAsPackage) return;
    super.collect_contributors_Program_typeWithSameNameAsPackage();
    collect_contributors_Program_typeWithSameNameAsPackage = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Inheritance.jrag:3
   */
    private boolean collect_contributors_TypeDecl_childTypes = false;
  public boolean collecting_contributors_TypeDecl_childTypes = false;
  protected void collect_contributors_TypeDecl_childTypes() {
    if(collect_contributors_TypeDecl_childTypes) return;
    collecting_contributors_TypeDecl_childTypes = true;
    super.collect_contributors_TypeDecl_childTypes();
    collecting_contributors_TypeDecl_childTypes = false;
    collect_contributors_TypeDecl_childTypes = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:36
   */
    private boolean collect_contributors_TypeDecl_uses = false;
  protected void collect_contributors_TypeDecl_uses() {
    if(collect_contributors_TypeDecl_uses) return;
    super.collect_contributors_TypeDecl_uses();
    collect_contributors_TypeDecl_uses = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:87
   */
    private boolean collect_contributors_TypeDecl_instantiations = false;
  protected void collect_contributors_TypeDecl_instantiations() {
    if(collect_contributors_TypeDecl_instantiations) return;
    super.collect_contributors_TypeDecl_instantiations();
    collect_contributors_TypeDecl_instantiations = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:81
   */
    private boolean collect_contributors_ConstructorDecl_uses = false;
  protected void collect_contributors_ConstructorDecl_uses() {
    if(collect_contributors_ConstructorDecl_uses) return;
    super.collect_contributors_ConstructorDecl_uses();
    collect_contributors_ConstructorDecl_uses = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:108
   */
    private boolean collect_contributors_FieldDeclaration_staticImports = false;
  protected void collect_contributors_FieldDeclaration_staticImports() {
    if(collect_contributors_FieldDeclaration_staticImports) return;
    super.collect_contributors_FieldDeclaration_staticImports();
    collect_contributors_FieldDeclaration_staticImports = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:53
   */
    private boolean collect_contributors_MethodDecl_coll_overridingMethods = false;
  protected void collect_contributors_MethodDecl_coll_overridingMethods() {
    if(collect_contributors_MethodDecl_coll_overridingMethods) return;
    super.collect_contributors_MethodDecl_coll_overridingMethods();
    collect_contributors_MethodDecl_coll_overridingMethods = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:42
   */
    private boolean collect_contributors_MethodDecl_polyUses_ = false;
  protected void collect_contributors_MethodDecl_polyUses_() {
    if(collect_contributors_MethodDecl_polyUses_) return;
    super.collect_contributors_MethodDecl_polyUses_();
    collect_contributors_MethodDecl_polyUses_ = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:127
   */
    private boolean collect_contributors_GenericMethodDecl_parUses = false;
  protected void collect_contributors_GenericMethodDecl_parUses() {
    if(collect_contributors_GenericMethodDecl_parUses) return;
    super.collect_contributors_GenericMethodDecl_parUses();
    collect_contributors_GenericMethodDecl_parUses = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:81
   */
    private boolean collect_contributors_GenericConstructorDecl_parUses = false;
  protected void collect_contributors_GenericConstructorDecl_parUses() {
    if(collect_contributors_GenericConstructorDecl_parUses) return;
    super.collect_contributors_GenericConstructorDecl_parUses();
    collect_contributors_GenericConstructorDecl_parUses = true;
  }


  /**
   * @apilevel internal
   */
  protected boolean typeObject_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeObject_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeObject() {
    if(typeObject_computed) {
      return typeObject_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeObject_value = typeObject_compute();
      if(isFinal && num == state().boundariesCrossed) typeObject_computed = true;
    return typeObject_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeObject_compute() {  return lookupType("java.lang", "Object");  }
  /**
   * @apilevel internal
   */
  protected boolean typeCloneable_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeCloneable_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:16
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeCloneable() {
    if(typeCloneable_computed) {
      return typeCloneable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeCloneable_value = typeCloneable_compute();
      if(isFinal && num == state().boundariesCrossed) typeCloneable_computed = true;
    return typeCloneable_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeCloneable_compute() {  return lookupType("java.lang", "Cloneable");  }
  /**
   * @apilevel internal
   */
  protected boolean typeSerializable_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeSerializable_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:17
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeSerializable() {
    if(typeSerializable_computed) {
      return typeSerializable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeSerializable_value = typeSerializable_compute();
      if(isFinal && num == state().boundariesCrossed) typeSerializable_computed = true;
    return typeSerializable_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeSerializable_compute() {  return lookupType("java.io", "Serializable");  }
  /**
   * @apilevel internal
   */
  protected boolean typeBoolean_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeBoolean_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:22
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeBoolean() {
    if(typeBoolean_computed) {
      return typeBoolean_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeBoolean_value = typeBoolean_compute();
      if(isFinal && num == state().boundariesCrossed) typeBoolean_computed = true;
    return typeBoolean_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeBoolean_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME, "boolean");  }
  /**
   * @apilevel internal
   */
  protected boolean typeByte_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeByte_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:23
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeByte() {
    if(typeByte_computed) {
      return typeByte_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeByte_value = typeByte_compute();
      if(isFinal && num == state().boundariesCrossed) typeByte_computed = true;
    return typeByte_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeByte_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "byte");  }
  /**
   * @apilevel internal
   */
  protected boolean typeShort_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeShort_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:24
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeShort() {
    if(typeShort_computed) {
      return typeShort_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeShort_value = typeShort_compute();
      if(isFinal && num == state().boundariesCrossed) typeShort_computed = true;
    return typeShort_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeShort_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "short");  }
  /**
   * @apilevel internal
   */
  protected boolean typeChar_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeChar_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeChar() {
    if(typeChar_computed) {
      return typeChar_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeChar_value = typeChar_compute();
      if(isFinal && num == state().boundariesCrossed) typeChar_computed = true;
    return typeChar_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeChar_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "char");  }
  /**
   * @apilevel internal
   */
  protected boolean typeInt_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeInt_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:26
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeInt() {
    if(typeInt_computed) {
      return typeInt_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeInt_value = typeInt_compute();
      if(isFinal && num == state().boundariesCrossed) typeInt_computed = true;
    return typeInt_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeInt_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "int");  }
  /**
   * @apilevel internal
   */
  protected boolean typeLong_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeLong_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:27
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeLong() {
    if(typeLong_computed) {
      return typeLong_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeLong_value = typeLong_compute();
      if(isFinal && num == state().boundariesCrossed) typeLong_computed = true;
    return typeLong_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeLong_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "long");  }
  /**
   * @apilevel internal
   */
  protected boolean typeFloat_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeFloat_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeFloat() {
    if(typeFloat_computed) {
      return typeFloat_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeFloat_value = typeFloat_compute();
      if(isFinal && num == state().boundariesCrossed) typeFloat_computed = true;
    return typeFloat_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeFloat_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "float");  }
  /**
   * @apilevel internal
   */
  protected boolean typeDouble_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeDouble_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeDouble() {
    if(typeDouble_computed) {
      return typeDouble_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeDouble_value = typeDouble_compute();
      if(isFinal && num == state().boundariesCrossed) typeDouble_computed = true;
    return typeDouble_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeDouble_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME , "double");  }
  /**
   * @apilevel internal
   */
  protected boolean typeString_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeString_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeString() {
    if(typeString_computed) {
      return typeString_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeString_value = typeString_compute();
      if(isFinal && num == state().boundariesCrossed) typeString_computed = true;
    return typeString_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeString_compute() {  return lookupType("java.lang", "String");  }
  /**
   * @apilevel internal
   */
  protected boolean typeVoid_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeVoid_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:41
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeVoid() {
    if(typeVoid_computed) {
      return typeVoid_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeVoid_value = typeVoid_compute();
      if(isFinal && num == state().boundariesCrossed) typeVoid_computed = true;
    return typeVoid_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeVoid_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME, "void");  }
  /**
   * @apilevel internal
   */
  protected boolean typeNull_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeNull_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:43
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeNull() {
    if(typeNull_computed) {
      return typeNull_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeNull_value = typeNull_compute();
      if(isFinal && num == state().boundariesCrossed) typeNull_computed = true;
    return typeNull_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeNull_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME, "null");  }
  /**
   * @apilevel internal
   */
  protected boolean unknownType_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl unknownType_value;
  /**
   * @attribute syn
   * @aspect SpecialClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:46
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl unknownType() {
    if(unknownType_computed) {
      return unknownType_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    unknownType_value = unknownType_compute();
      if(isFinal && num == state().boundariesCrossed) unknownType_computed = true;
    return unknownType_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl unknownType_compute() {  return lookupType(PRIMITIVE_PACKAGE_NAME, "Unknown");  }
  protected java.util.Map hasPackage_String_values;
  /**
   * @attribute syn
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:77
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasPackage(String packageName) {
    Object _parameters = packageName;
    if(hasPackage_String_values == null) hasPackage_String_values = new java.util.HashMap(4);
    if(hasPackage_String_values.containsKey(_parameters)) {
      return ((Boolean)hasPackage_String_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean hasPackage_String_value = hasPackage_compute(packageName);
      if(isFinal && num == state().boundariesCrossed) hasPackage_String_values.put(_parameters, Boolean.valueOf(hasPackage_String_value));
    return hasPackage_String_value;
  }
  /**
   * @apilevel internal
   */
  private boolean hasPackage_compute(String packageName) {
    return isPackage(packageName);
  }
  protected java.util.Map lookupType_String_String_values;
  /**
   * Checks from-source compilation units for the given type.
   * If no matching compilation unit is found the library compliation units
   * will be searched.
   * @attribute syn
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:158
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupType(String packageName, String typeName) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(packageName);
    _parameters.add(typeName);
    if(lookupType_String_String_values == null) lookupType_String_String_values = new java.util.HashMap(4);
    if(lookupType_String_String_values.containsKey(_parameters)) {
      return (TypeDecl)lookupType_String_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    TypeDecl lookupType_String_String_value = lookupType_compute(packageName, typeName);
      if(isFinal && num == state().boundariesCrossed) lookupType_String_String_values.put(_parameters, lookupType_String_String_value);
    return lookupType_String_String_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl lookupType_compute(String packageName, String typeName) {
    String fullName = packageName.equals("") ? typeName : packageName + "." + typeName;
    // Check for type in source
    for(int i = 0; i < getNumCompilationUnit(); i++) {
      for(int j = 0; j < getCompilationUnit(i).getNumTypeDecl(); j++) {
        TypeDecl type = getCompilationUnit(i).getTypeDecl(j);
        if(type.fullName().equals(fullName)) {
          return type;
        }
      }
    }
    // Check for type in library
    return lookupLibType(packageName, typeName);
  }
  protected java.util.Map lookupLibType_String_String_values;
  /**
   * Lookup types in the library
   * @attribute syn
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:175
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupLibType(String packageName, String typeName) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(packageName);
    _parameters.add(typeName);
    if(lookupLibType_String_String_values == null) lookupLibType_String_String_values = new java.util.HashMap(4);
    if(lookupLibType_String_String_values.containsKey(_parameters)) {
      return (TypeDecl)lookupLibType_String_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    TypeDecl lookupLibType_String_String_value = lookupLibType_compute(packageName, typeName);
      if(isFinal && num == state().boundariesCrossed) lookupLibType_String_String_values.put(_parameters, lookupLibType_String_String_value);
    return lookupLibType_String_String_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl lookupLibType_compute(String packageName, String typeName) {
    String fullName = packageName.equals("") ? typeName : packageName + "." + typeName;
    // Check the primitive types
    if (packageName.equals(PRIMITIVE_PACKAGE_NAME)) {
      PrimitiveCompilationUnit unit = getPrimitiveCompilationUnit();
      if (typeName.equals("boolean")) return unit.typeBoolean();
      if (typeName.equals("byte")) return unit.typeByte();
      if (typeName.equals("short")) return unit.typeShort();
      if (typeName.equals("char")) return unit.typeChar();
      if (typeName.equals("int")) return unit.typeInt();
      if (typeName.equals("long")) return unit.typeLong();
      if (typeName.equals("float")) return unit.typeFloat();
      if (typeName.equals("double")) return unit.typeDouble();
      if (typeName.equals("null")) return unit.typeNull();
      if (typeName.equals("void")) return unit.typeVoid();
      if (typeName.equals("Unknown")) return unit.unknownType(); // Is this needed?
    } 
    // Check the library:
    //  A type may not be in the library but an NTA cannot map to null.
    //  We need to do some double work to step around this.
    //  We check the classpath directly (the same thing the library NTA does)
    //  to prevent that we call the nta for a name that gives null back
    //else if (getCompilationUnit(fullName) != null) { 
    
    // Found a library unit, check it for type
    CompilationUnit libUnit = getLibCompilationUnit(fullName);
    if (libUnit != null) {
      for(int j = 0; j < libUnit.getNumTypeDecl(); j++) {
        TypeDecl type = libUnit.getTypeDecl(j);
        if(type.fullName().equals(fullName)) {
          return type;
        }
      }
    }
    // No type found in the library
    return null;
  }
  /**
   * @apilevel internal
   */
  protected java.util.Map getLibCompilationUnit_String_values;
  /**
   * @apilevel internal
   */
  protected List getLibCompilationUnit_String_list;
  /**
   * @attribute syn
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:213
   */
  @SuppressWarnings({"unchecked", "cast"})
  public CompilationUnit getLibCompilationUnit(String fullName) {
    Object _parameters = fullName;
    if(getLibCompilationUnit_String_values == null) getLibCompilationUnit_String_values = new java.util.HashMap(4);
    if(getLibCompilationUnit_String_values.containsKey(_parameters)) {
      return (CompilationUnit)getLibCompilationUnit_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    CompilationUnit getLibCompilationUnit_String_value = getLibCompilationUnit_compute(fullName);
    if(getLibCompilationUnit_String_list == null) {
      getLibCompilationUnit_String_list = new List();
      getLibCompilationUnit_String_list.is$Final = true;
      getLibCompilationUnit_String_list.setParent(this);
    }
    getLibCompilationUnit_String_list.add(getLibCompilationUnit_String_value);
    if(getLibCompilationUnit_String_value != null) {
      getLibCompilationUnit_String_value.is$Final = true;
    }
      if(true) getLibCompilationUnit_String_values.put(_parameters, getLibCompilationUnit_String_value);
    return getLibCompilationUnit_String_value;
  }
  /**
   * @apilevel internal
   */
  private CompilationUnit getLibCompilationUnit_compute(String fullName) {
    return getCompilationUnit(fullName);
  }
  /**
   * @apilevel internal
   */
  protected boolean getPrimitiveCompilationUnit_computed = false;
  /**
   * @apilevel internal
   */
  protected PrimitiveCompilationUnit getPrimitiveCompilationUnit_value;
  /**
   * @attribute syn
   * @aspect PrimitiveTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrimitiveTypes.jrag:219
   */
  @SuppressWarnings({"unchecked", "cast"})
  public PrimitiveCompilationUnit getPrimitiveCompilationUnit() {
    if(getPrimitiveCompilationUnit_computed) {
      return getPrimitiveCompilationUnit_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getPrimitiveCompilationUnit_value = getPrimitiveCompilationUnit_compute();
    getPrimitiveCompilationUnit_value.setParent(this);
    getPrimitiveCompilationUnit_value.is$Final = true;
      if(true) getPrimitiveCompilationUnit_computed = true;
    return getPrimitiveCompilationUnit_value;
  }
  /**
   * @apilevel internal
   */
  private PrimitiveCompilationUnit getPrimitiveCompilationUnit_compute() {    
    PrimitiveCompilationUnit u = new PrimitiveCompilationUnit();
    u.setPackageDecl(PRIMITIVE_PACKAGE_NAME);
    return u;
  }
  /**
   * @apilevel internal
   */
  protected boolean unknownConstructor_computed = false;
  /**
   * @apilevel internal
   */
  protected ConstructorDecl unknownConstructor_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:245
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorDecl unknownConstructor() {
    if(unknownConstructor_computed) {
      return unknownConstructor_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    unknownConstructor_value = unknownConstructor_compute();
      if(isFinal && num == state().boundariesCrossed) unknownConstructor_computed = true;
    return unknownConstructor_value;
  }
  /**
   * @apilevel internal
   */
  private ConstructorDecl unknownConstructor_compute() {
    return (ConstructorDecl)unknownType().constructors().iterator().next();
  }
  /**
   * @apilevel internal
   */
  protected boolean wildcards_computed = false;
  /**
   * @apilevel internal
   */
  protected WildcardsCompilationUnit wildcards_value;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1358
   */
  @SuppressWarnings({"unchecked", "cast"})
  public WildcardsCompilationUnit wildcards() {
    if(wildcards_computed) {
      return wildcards_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    wildcards_value = wildcards_compute();
    wildcards_value.setParent(this);
    wildcards_value.is$Final = true;
      if(true) wildcards_computed = true;
    return wildcards_value;
  }
  /**
   * @apilevel internal
   */
  private WildcardsCompilationUnit wildcards_compute() {
    return new WildcardsCompilationUnit(
      "wildcards",
      new List(),
      new List()
    );
  }
  /**
   * @apilevel internal
   */
  protected boolean sourceMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> sourceMethods_value;
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:169
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> sourceMethods() {
    if(sourceMethods_computed) {
      return sourceMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceMethods_value = sourceMethods_compute();
      if(isFinal && num == state().boundariesCrossed) sourceMethods_computed = true;
    return sourceMethods_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> sourceMethods_compute() {
		Collection<MethodDecl> res = new LinkedList<MethodDecl>();
		collectSourceMethods(res);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean sourceClassDecls_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<ClassDecl> sourceClassDecls_value;
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:191
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<ClassDecl> sourceClassDecls() {
    if(sourceClassDecls_computed) {
      return sourceClassDecls_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceClassDecls_value = sourceClassDecls_compute();
      if(isFinal && num == state().boundariesCrossed) sourceClassDecls_computed = true;
    return sourceClassDecls_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<ClassDecl> sourceClassDecls_compute() {
		Collection<ClassDecl> res = new LinkedList<ClassDecl>();
		collectSourceClassDecls(res);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean sourcePackageDecls_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<String> sourcePackageDecls_value;
  /**
   * @attribute syn
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:213
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<String> sourcePackageDecls() {
    if(sourcePackageDecls_computed) {
      return sourcePackageDecls_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourcePackageDecls_value = sourcePackageDecls_compute();
      if(isFinal && num == state().boundariesCrossed) sourcePackageDecls_computed = true;
    return sourcePackageDecls_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<String> sourcePackageDecls_compute() {
		Collection<String> res = new HashSet<String>();
		collectPackageDecls(res);
		return res;
	}
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:4
   */
  public boolean hasPackageDecl(String name) {
    ASTNode$State state = state();
    try {
		for(PackageDecl pd : packageDecls)
			if(pd.getName().equals(name))
				return true;
		return false;
	}
    finally {
    }
  }
  protected java.util.Map getPackageDecl_String_values;
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:11
   */
  @SuppressWarnings({"unchecked", "cast"})
  public PackageDecl getPackageDecl(String name) {
    Object _parameters = name;
    if(getPackageDecl_String_values == null) getPackageDecl_String_values = new java.util.HashMap(4);
    if(getPackageDecl_String_values.containsKey(_parameters)) {
      return (PackageDecl)getPackageDecl_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    PackageDecl getPackageDecl_String_value = getPackageDecl_compute(name);
      if(isFinal && num == state().boundariesCrossed) getPackageDecl_String_values.put(_parameters, getPackageDecl_String_value);
    return getPackageDecl_String_value;
  }
  /**
   * @apilevel internal
   */
  private PackageDecl getPackageDecl_compute(String name) {
		for(PackageDecl pd : packageDecls)
			if(pd.getName().equals(name))
				return pd;
		PackageDecl pd = new PackageDecl(name);
		addPackageDecl(pd);
		pd.setParent(this);
		return pd;
	}
  protected java.util.Map getSubPackageDecls_String_values;
  /**
   * @attribute syn
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:24
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<PackageDecl> getSubPackageDecls(String name) {
    Object _parameters = name;
    if(getSubPackageDecls_String_values == null) getSubPackageDecls_String_values = new java.util.HashMap(4);
    if(getSubPackageDecls_String_values.containsKey(_parameters)) {
      return (Collection<PackageDecl>)getSubPackageDecls_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    Collection<PackageDecl> getSubPackageDecls_String_value = getSubPackageDecls_compute(name);
      if(isFinal && num == state().boundariesCrossed) getSubPackageDecls_String_values.put(_parameters, getSubPackageDecls_String_value);
    return getSubPackageDecls_String_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<PackageDecl> getSubPackageDecls_compute(String name) {
		Collection<PackageDecl> res = new LinkedList<PackageDecl>();
		for(PackageDecl pd : packageDecls)
			if(pd.getName().startsWith(name+"."))
				res.add(pd);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean typeReentrantLock_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeReentrantLock_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:3
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeReentrantLock() {
    if(typeReentrantLock_computed) {
      return typeReentrantLock_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeReentrantLock_value = typeReentrantLock_compute();
      if(isFinal && num == state().boundariesCrossed) typeReentrantLock_computed = true;
    return typeReentrantLock_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeReentrantLock_compute() {  return lookupType("java.util.concurrent.locks", "ReentrantLock");  }
  /**
   * @apilevel internal
   */
  protected boolean typeCondition_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeCondition_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:4
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeCondition() {
    if(typeCondition_computed) {
      return typeCondition_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeCondition_value = typeCondition_compute();
      if(isFinal && num == state().boundariesCrossed) typeCondition_computed = true;
    return typeCondition_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl typeCondition_compute() {  return lookupType("java.util.concurrent.locks", "Condition");  }
  /**
   * @apilevel internal
   */
  protected boolean methodNotify_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl methodNotify_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:5
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodNotify() {
    if(methodNotify_computed) {
      return methodNotify_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    methodNotify_value = methodNotify_compute();
      if(isFinal && num == state().boundariesCrossed) methodNotify_computed = true;
    return methodNotify_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl methodNotify_compute() {  return (MethodDecl)typeObject().localMethodsSignature("notify()").iterator().next();  }
  /**
   * @apilevel internal
   */
  protected boolean methodNotifyAll_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl methodNotifyAll_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:6
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodNotifyAll() {
    if(methodNotifyAll_computed) {
      return methodNotifyAll_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    methodNotifyAll_value = methodNotifyAll_compute();
      if(isFinal && num == state().boundariesCrossed) methodNotifyAll_computed = true;
    return methodNotifyAll_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl methodNotifyAll_compute() {  return (MethodDecl)typeObject().localMethodsSignature("notifyAll()").iterator().next();  }
  /**
   * @apilevel internal
   */
  protected boolean methodWait_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl methodWait_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:7
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodWait() {
    if(methodWait_computed) {
      return methodWait_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    methodWait_value = methodWait_compute();
      if(isFinal && num == state().boundariesCrossed) methodWait_computed = true;
    return methodWait_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl methodWait_compute() {  return (MethodDecl)typeObject().localMethodsSignature("wait()").iterator().next();  }
  /**
   * @apilevel internal
   */
  protected boolean methodWaitLong_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl methodWaitLong_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:8
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodWaitLong() {
    if(methodWaitLong_computed) {
      return methodWaitLong_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    methodWaitLong_value = methodWaitLong_compute();
      if(isFinal && num == state().boundariesCrossed) methodWaitLong_computed = true;
    return methodWaitLong_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl methodWaitLong_compute() {  return (MethodDecl)typeObject().localMethodsSignature("wait(long)").iterator().next();  }
  /**
   * @apilevel internal
   */
  protected boolean methodWaitLongInt_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl methodWaitLongInt_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:9
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodWaitLongInt() {
    if(methodWaitLongInt_computed) {
      return methodWaitLongInt_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    methodWaitLongInt_value = methodWaitLongInt_compute();
      if(isFinal && num == state().boundariesCrossed) methodWaitLongInt_computed = true;
    return methodWaitLongInt_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl methodWaitLongInt_compute() {  return (MethodDecl)typeObject().localMethodsSignature("wait(long, int)").iterator().next();  }
  /**
   * @apilevel internal
   */
  protected boolean waitNotifyMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> waitNotifyMethods_value;
  /**
   * @attribute syn
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:10
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> waitNotifyMethods() {
    if(waitNotifyMethods_computed) {
      return waitNotifyMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    waitNotifyMethods_value = waitNotifyMethods_compute();
      if(isFinal && num == state().boundariesCrossed) waitNotifyMethods_computed = true;
    return waitNotifyMethods_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> waitNotifyMethods_compute() {  return Arrays.asList(methodNotify(), methodNotifyAll(), methodWait(), methodWaitLong(), methodWaitLongInt());  }
  /**
   * @apilevel internal
   */
  protected boolean monitorActions_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MonitorAction> monitorActions_value;
  /**
   * @attribute syn
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:34
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MonitorAction> monitorActions() {
    if(monitorActions_computed) {
      return monitorActions_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    monitorActions_value = monitorActions_compute();
      if(isFinal && num == state().boundariesCrossed) monitorActions_computed = true;
    return monitorActions_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MonitorAction> monitorActions_compute() {
		Collection<MonitorAction> res = new HashSet<MonitorAction>();
		collectMonitorActions(res);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean unknownVarAccess_computed = false;
  /**
   * @apilevel internal
   */
  protected UnknownVarAccess unknownVarAccess_value;
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:116
   */
  @SuppressWarnings({"unchecked", "cast"})
  public UnknownVarAccess unknownVarAccess() {
    if(unknownVarAccess_computed) {
      return unknownVarAccess_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    unknownVarAccess_value = unknownVarAccess_compute();
      if(isFinal && num == state().boundariesCrossed) unknownVarAccess_computed = true;
    return unknownVarAccess_value;
  }
  /**
   * @apilevel internal
   */
  private UnknownVarAccess unknownVarAccess_compute() {  return new UnknownVarAccess(unknownType().findSingleVariable("unknown"));  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AnonymousClasses.jrag:16
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_superType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AnonymousClasses.jrag:26
   * @apilevel internal
   */
  public ConstructorDecl Define_ConstructorDecl_constructorDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Arrays.jrag:19
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_componentType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:172
   * @apilevel internal
   */
  public LabeledStmt Define_LabeledStmt_lookupLabel(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:16
   * @apilevel internal
   */
  public boolean Define_boolean_isDest(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:26
   * @apilevel internal
   */
  public boolean Define_boolean_isSource(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return true;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:50
   * @apilevel internal
   */
  public boolean Define_boolean_isIncOrDec(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:324
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return true;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:710
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return true;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:13
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeException(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return lookupType("java.lang", "Exception");
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:15
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeRuntimeException(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return lookupType("java.lang", "RuntimeException");
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:17
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeError(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return lookupType("java.lang", "Error");
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:19
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeNullPointerException(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return lookupType("java.lang", "NullPointerException");
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:21
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeThrowable(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return lookupType("java.lang", "Throwable");
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:137
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{
    throw new Error("Operation handlesException not supported");
  }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:15
   * @apilevel internal
   */
  public Collection Define_Collection_lookupConstructor(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return Collections.EMPTY_LIST;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:24
   * @apilevel internal
   */
  public Collection Define_Collection_lookupSuperConstructor(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return Collections.EMPTY_LIST;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:21
   * @apilevel internal
   */
  public Expr Define_Expr_nestedScope(ASTNode caller, ASTNode child) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{ throw new UnsupportedOperationException(); }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:33
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return Collections.EMPTY_LIST;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:18
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeObject(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeObject();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:19
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeCloneable(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeCloneable();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:20
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeSerializable(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeSerializable();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:31
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeBoolean(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeBoolean();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:32
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeByte(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeByte();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:33
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeShort(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeShort();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:34
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeChar(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeChar();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:35
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeInt(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeInt();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:36
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeLong(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeLong();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:37
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeFloat(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeFloat();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:38
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeDouble(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeDouble();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:39
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeString(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeString();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:42
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeVoid(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeVoid();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:44
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeNull(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeNull();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:47
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_unknownType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:81
   * @apilevel internal
   */
  public boolean Define_boolean_hasPackage(ASTNode caller, ASTNode child, String packageName) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return hasPackage(packageName);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:151
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_lookupType(ASTNode caller, ASTNode child, String packageName, String typeName) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return lookupType(packageName, typeName);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:266
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SimpleSet.emptySet;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:24
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SimpleSet.emptySet;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:290
   * @apilevel internal
   */
  public boolean Define_boolean_mayBePublic(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:291
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeProtected(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:292
   * @apilevel internal
   */
  public boolean Define_boolean_mayBePrivate(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:293
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeStatic(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:294
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeFinal(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:295
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeAbstract(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:296
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeVolatile(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:297
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeTransient(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:298
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeStrictfp(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:299
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeSynchronized(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:300
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeNative(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:249
   * @apilevel internal
   */
  public ASTNode Define_ASTNode_enclosingBlock(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:300
   * @apilevel internal
   */
  public VariableScope Define_VariableScope_outerScope(ASTNode caller, ASTNode child) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{
    throw new UnsupportedOperationException("outerScope() not defined");
  }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:368
   * @apilevel internal
   */
  public boolean Define_boolean_insideLoop(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:375
   * @apilevel internal
   */
  public boolean Define_boolean_insideSwitch(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:425
   * @apilevel internal
   */
  public Case Define_Case_bind(ASTNode caller, ASTNode child, Case c) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:354
   * @apilevel internal
   */
  public String Define_String_typeDeclIndent(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return "";
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:64
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return NameType.NO_NAME;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:219
   * @apilevel internal
   */
  public boolean Define_boolean_isAnonymous(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:233
   * @apilevel internal
   */
  public Variable Define_Variable_unknownField(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType().findSingleVariable("unknown");
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:237
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_unknownMethod(ASTNode caller, ASTNode child) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{
    for(Iterator iter = unknownType().memberMethods("unknown").iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      return m;
    }
    throw new Error("Could not find method unknown in type Unknown");
  }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:244
   * @apilevel internal
   */
  public ConstructorDecl Define_ConstructorDecl_unknownConstructor(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownConstructor();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:256
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_declType(ASTNode caller, ASTNode child) {
     {
      int i = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:513
   * @apilevel internal
   */
  public BodyDecl Define_BodyDecl_enclosingBodyDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:531
   * @apilevel internal
   */
  public boolean Define_boolean_isMemberType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:582
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_hostType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:360
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_switchType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:406
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_returnType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeVoid();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:506
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingInstance(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:14
   * @apilevel internal
   */
  public String Define_String_methodHost(ASTNode caller, ASTNode child) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{
    throw new Error("Needs extra equation for methodHost()");
  }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:128
   * @apilevel internal
   */
  public boolean Define_boolean_inExplicitConstructorInvocation(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:137
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:162
   * @apilevel internal
   */
  public boolean Define_boolean_reportUnreachable(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return true;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:68
   * @apilevel internal
   */
  public boolean Define_boolean_isMethodParameter(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:69
   * @apilevel internal
   */
  public boolean Define_boolean_isConstructorParameter(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:70
   * @apilevel internal
   */
  public boolean Define_boolean_isExceptionHandlerParameter(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:94
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:180
   * @apilevel internal
   */
  public ElementValue Define_ElementValue_lookupElementTypeValue(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:269
   * @apilevel internal
   */
  public boolean Define_boolean_withinSuppressWarnings(ASTNode caller, ASTNode child, String s) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:371
   * @apilevel internal
   */
  public boolean Define_boolean_withinDeprecatedAnnotation(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:430
   * @apilevel internal
   */
  public Annotation Define_Annotation_lookupAnnotation(ASTNode caller, ASTNode child, TypeDecl typeDecl) {
     {
      int i = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:463
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingAnnotationDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownType();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:39
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_assignConvertedType(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return typeNull();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:267
   * @apilevel internal
   */
  public boolean Define_boolean_inExtendsOrImplements(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1385
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeWildcard(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return wildcards().typeWildcard();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1396
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_lookupWildcardExtends(ASTNode caller, ASTNode child, TypeDecl typeDecl) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return wildcards().lookupWildcardExtends(typeDecl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1409
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_lookupWildcardSuper(ASTNode caller, ASTNode child, TypeDecl typeDecl) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return wildcards().lookupWildcardSuper(typeDecl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1431
   * @apilevel internal
   */
  public LUBType Define_LUBType_lookupLUBType(ASTNode caller, ASTNode child, Collection bounds) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return wildcards().lookupLUBType(bounds);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1469
   * @apilevel internal
   */
  public GLBType Define_GLBType_lookupGLBType(ASTNode caller, ASTNode child, ArrayList bounds) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return wildcards().lookupGLBType(bounds);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsParTypeDecl.jrag:46
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_genericDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:24
   * @apilevel internal
   */
  public boolean Define_boolean_variableArityValid(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:53
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:183
   * @apilevel internal
   */
  public AssignExpr Define_AssignExpr_modifyingAssignExpr(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:331
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:332
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:670
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__breakTarget(ASTNode caller, ASTNode child, BreakStmt stmt) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:671
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__continueTarget(ASTNode caller, ASTNode child, ContinueStmt stmt) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:672
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__returnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:673
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__throwTarget(ASTNode caller, ASTNode child, TypeDecl exn) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:674
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:29
   * @apilevel internal
   */
  public boolean Define_boolean_inInextractiblePosition(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:4
   * @apilevel internal
   */
  public Variable Define_Variable_getModifiedVariable(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:33
   * @apilevel internal
   */
  public PackageDecl Define_PackageDecl_lookupPackage(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return getPackageDecl(name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:36
   * @apilevel internal
   */
  public Parameterisable Define_Parameterisable_parameterOwner(ASTNode caller, ASTNode child) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{ throw new IllegalStateException("parameterOwner() invoked on ParameterDeclaration not in tree"); }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeAccessExt.jrag:3
   * @apilevel internal
   */
  public boolean Define_boolean_inImportDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:19
   * @apilevel internal
   */
  public GenericElement Define_GenericElement_owner(ASTNode caller, ASTNode child) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{ throw new IllegalStateException("owner() on type variable that is not in tree"); }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:12
   * @apilevel internal
   */
  public Collection<MethodDecl> Define_Collection_MethodDecl__waitNotifyMethods(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return waitNotifyMethods();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:15
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodNotify(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return methodNotify();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:16
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodNotifyAll(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return methodNotifyAll();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:17
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodWait(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return methodWait();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:18
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodWaitLong(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return methodWaitLong();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:19
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodWaitLongInt(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return methodWaitLongInt();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:61
   * @apilevel internal
   */
  public boolean Define_boolean_escapes(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:86
   * @apilevel internal
   */
  public MethodAccessInfo Define_MethodAccessInfo_accessMethod(ASTNode caller, ASTNode child, MethodDecl md) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return null;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:117
   * @apilevel internal
   */
  public UnknownVarAccess Define_UnknownVarAccess_unknownVarAccess(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownVarAccess();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:140
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unknownVarAccess();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:27
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return true;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:16
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{ throw new RefactoringException("cannot insert statement here"); }
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:62
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{ throw new RefactoringException("cannot insert statement here"); }
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /**
   * @apilevel internal
   */
  protected boolean Program_accessibilityConstraints_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<AccessibilityConstraint> Program_accessibilityConstraints_value;
  /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:8
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<AccessibilityConstraint> accessibilityConstraints() {
    if(Program_accessibilityConstraints_computed) {
      return Program_accessibilityConstraints_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    Program_accessibilityConstraints_value = accessibilityConstraints_compute();
      if(isFinal && num == state().boundariesCrossed) Program_accessibilityConstraints_computed = true;
    return Program_accessibilityConstraints_value;
  }
  java.util.Set Program_accessibilityConstraints_contributors;
  public java.util.Set Program_accessibilityConstraints_contributors() {
    if(Program_accessibilityConstraints_contributors == null) Program_accessibilityConstraints_contributors  = new ASTNode$State.IdentityHashSet(4);
    return Program_accessibilityConstraints_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<AccessibilityConstraint> accessibilityConstraints_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_Program_accessibilityConstraints();
    Program_accessibilityConstraints_value = new LinkedHashSet<AccessibilityConstraint>();
    if(Program_accessibilityConstraints_contributors != null)
    for(java.util.Iterator iter = Program_accessibilityConstraints_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_Program_Program_accessibilityConstraints(Program_accessibilityConstraints_value);
    }
    return Program_accessibilityConstraints_value;
  }

  /**
   * @apilevel internal
   */
  protected boolean Program_typeWithSameNameAsPackage_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeDecl> Program_typeWithSameNameAsPackage_value;
  /**
   * @attribute coll
   * @aspect RenamePackage
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenamePackage.jrag:39
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeDecl> typeWithSameNameAsPackage() {
    if(Program_typeWithSameNameAsPackage_computed) {
      return Program_typeWithSameNameAsPackage_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    Program_typeWithSameNameAsPackage_value = typeWithSameNameAsPackage_compute();
      if(isFinal && num == state().boundariesCrossed) Program_typeWithSameNameAsPackage_computed = true;
    return Program_typeWithSameNameAsPackage_value;
  }
  java.util.Set Program_typeWithSameNameAsPackage_contributors;
  public java.util.Set Program_typeWithSameNameAsPackage_contributors() {
    if(Program_typeWithSameNameAsPackage_contributors == null) Program_typeWithSameNameAsPackage_contributors  = new ASTNode$State.IdentityHashSet(4);
    return Program_typeWithSameNameAsPackage_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeDecl> typeWithSameNameAsPackage_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_Program_typeWithSameNameAsPackage();
    Program_typeWithSameNameAsPackage_value = new HashSet<TypeDecl>();
    if(Program_typeWithSameNameAsPackage_contributors != null)
    for(java.util.Iterator iter = Program_typeWithSameNameAsPackage_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_Program_Program_typeWithSameNameAsPackage(Program_typeWithSameNameAsPackage_value);
    }
    return Program_typeWithSameNameAsPackage_value;
  }

}
