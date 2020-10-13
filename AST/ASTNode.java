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
 * @production ASTNode;
 * @ast node
 * 
 */
public class ASTNode<T extends ASTNode> extends beaver.Symbol  implements Cloneable, Iterable<T> {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    locationsRead_computed = false;
    locationsRead_value = null;
    locationsWritten_computed = false;
    locationsWritten_value = null;
    uncaughtExceptions_computed = false;
    uncaughtExceptions_value = null;
    fromSource_computed = false;
    usedTypeVars_computed = false;
    usedTypeVars_value = null;
    usedForeignTypeVars_computed = false;
    usedForeignTypeVars_value = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ASTNode<T> clone() throws CloneNotSupportedException {
    ASTNode node = (ASTNode)super.clone();
    node.locationsRead_computed = false;
    node.locationsRead_value = null;
    node.locationsWritten_computed = false;
    node.locationsWritten_value = null;
    node.uncaughtExceptions_computed = false;
    node.uncaughtExceptions_value = null;
    node.fromSource_computed = false;
    node.usedTypeVars_computed = false;
    node.usedTypeVars_value = null;
    node.usedForeignTypeVars_computed = false;
    node.usedForeignTypeVars_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ASTNode<T> copy() {
    try {
      ASTNode node = (ASTNode) clone();
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
  public ASTNode<T> fullCopy() {
    ASTNode tree = (ASTNode) copy();
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
   * @aspect AccessControl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:125
   */
  public void accessControl() {
  }
  /**
   * @ast method 
   * @aspect AnonymousClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AnonymousClasses.jrag:202
   */
  protected void collectExceptions(Collection c, ASTNode target) {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collectExceptions(c, target);
  }
  /**
   * @ast method 
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:44
   */
  public void collectBranches(Collection c) {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collectBranches(c);
  }
  /**
   * @ast method 
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:150
   */
  public Stmt branchTarget(Stmt branchStmt) {
    if(getParent() != null)
      return getParent().branchTarget(branchStmt);
    else
      return null;
  }
  /**
   * @ast method 
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:190
   */
  public void collectFinally(Stmt branchStmt, ArrayList list) {
    if(getParent() != null)
      getParent().collectFinally(branchStmt, list);
  }
  /**
   * @ast method 
   * @aspect DeclareBeforeUse
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DeclareBeforeUse.jrag:13
   */
  public int varChildIndex(Block b) {
    ASTNode node = this;
    while(node.getParent().getParent() != b) {
      node = node.getParent();
    }
    return b.getStmtListNoTransform().getIndexOfChild(node);
  }
  /**
   * @ast method 
   * @aspect DeclareBeforeUse
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DeclareBeforeUse.jrag:31
   */
  public int varChildIndex(TypeDecl t) {
    ASTNode node = this;
    while(node != null && node.getParent() != null && node.getParent().getParent() != t) {
      node = node.getParent();
    }
    if(node == null)
      return -1;
    return t.getBodyDeclListNoTransform().getIndexOfChild(node);
  }
  /**
   * @ast method 
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:12
   */
  public void definiteAssignment() {
  }
  /**
   * @ast method 
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:450
   */
  protected boolean checkDUeverywhere(Variable v) {
    for(int i = 0; i < getNumChild(); i++)
      if(!getChild(i).checkDUeverywhere(v))
        return false;
    return true;
  }
  /**
   * @ast method 
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:560
   */
  protected boolean isDescendantTo(ASTNode node) {
    if(this == node)
      return true;
    if(getParent() == null)
      return false;
    return getParent().isDescendantTo(node);
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:12
   */
  protected String sourceFile() {
    ASTNode node = this;
    while(node != null && !(node instanceof CompilationUnit))
      node = node.getParent();
    if(node == null)
      return "Unknown file";
    CompilationUnit u = (CompilationUnit)node;
    return u.relativeName();
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:34
   */
  public ASTNode setLocation(ASTNode node) {
    setStart(node.getStart());
    setEnd(node.getEnd());
    return this;
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:40
   */
  public ASTNode setStart(int i) {
    start = i;
    return this;
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:44
   */
  public int start() {
    return start;
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:47
   */
  public ASTNode setEnd(int i) {
    end = i;
    return this;
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:51
   */
  public int end() {
    return end;
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:55
   */
  public String location() {
    return "" + lineNumber();
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:58
   */
  public String errorPrefix() {
    return sourceFile() + ":" + location() + ":\n" + "  *** Semantic Error: ";
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:61
   */
  public String warningPrefix() {
    return sourceFile() + ":" + location() + ":\n" + "  *** WARNING: ";
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:171
   */
  public void error(String s) {
    ASTNode node = this;
    while(node != null && !(node instanceof CompilationUnit))
      node = node.getParent();
    CompilationUnit cu = (CompilationUnit)node;
    if(getNumChild() == 0 && getStart() != 0 && getEnd() != 0) {  
      int line = getLine(getStart());
      int column = getColumn(getStart());
      int endLine = getLine(getEnd());
      int endColumn = getColumn(getEnd());
      cu.errors.add(new Problem(sourceFile(), s, line, column, endLine, endColumn, Problem.Severity.ERROR, Problem.Kind.SEMANTIC));
    }
    else
      cu.errors.add(new Problem(sourceFile(), s, lineNumber(), Problem.Severity.ERROR, Problem.Kind.SEMANTIC));
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:187
   */
  public void warning(String s) {
    ASTNode node = this;
    while(node != null && !(node instanceof CompilationUnit))
      node = node.getParent();
    CompilationUnit cu = (CompilationUnit)node;
    cu.warnings.add(new Problem(sourceFile(), "WARNING: " + s, lineNumber(), Problem.Severity.WARNING));
  }
  /**
   * @ast method 
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:195
   */
  public void collectErrors() {
    nameCheck();
    typeCheck();
    accessControl();
    exceptionHandling();
    checkUnreachableStmt();
    definiteAssignment();
    checkModifiers();
    for(int i = 0; i < getNumChild(); i++) {
      getChild(i).collectErrors();
    }
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:54
   */
  public void exceptionHandling() {
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:224
   */
  protected boolean reachedException(TypeDecl type) {
    for(int i = 0; i < getNumChild(); i++)
      if(getChild(i).reachedException(type))
        return true;
    return false;
  }
  /**
   * @ast method 
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:54
   */
  public static Collection removeInstanceMethods(Collection c) {
    c = new LinkedList(c);
    for(Iterator iter = c.iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(!m.isStatic())
        iter.remove();
    }
    return c;
  }
  /**
   * @ast method 
   * @aspect MemberMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:359
   */
  protected static void putSimpleSetElement(HashMap map, Object key, Object value) {
    SimpleSet set = (SimpleSet)map.get(key);
    if(set == null) set = SimpleSet.emptySet;
    map.put(key, set.add(value));
  }
  /**
   * @ast method 
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:182
   */
  public SimpleSet removeInstanceVariables(SimpleSet oldSet) {
    SimpleSet newSet = SimpleSet.emptySet;
    for(Iterator iter = oldSet.iterator(); iter.hasNext(); ) {
      Variable v = (Variable)iter.next();
      if(!v.isInstanceVariable())
        newSet = newSet.add(v);
    }
    return newSet;
  }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:11
   */
  void checkModifiers() {
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:11
   */
  public void nameCheck() {
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:14
   */
  public TypeDecl extractSingleType(SimpleSet c) {
    if(c.size() != 1)
      return null;
    return (TypeDecl)c.iterator().next();
  }
  /**
   * @ast method 
   * @aspect AddOptionsToProgram
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Options.jadd:14
   */
  public Options options() {
    return state().options;
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:13
   */
  public String toString() {
    StringBuffer s = new StringBuffer();
    toString(s);
    return s.toString().trim();
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:19
   */
  public void toString(StringBuffer s) {
    throw new Error("Operation toString(StringBuffer s) not implemented for " + getClass().getName());
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:770
   */
  public String dumpTree() {
    StringBuffer s = new StringBuffer();
    dumpTree(s, 0);
    return s.toString();
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:776
   */
  public void dumpTree(StringBuffer s, int j) {
    for(int i = 0; i < j; i++) {
      s.append("  ");
    }
    s.append(dumpString() + "\n");
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).dumpTree(s, j + 1);
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:785
   */
  public String dumpTreeNoRewrite() {
    StringBuffer s = new StringBuffer();
    dumpTreeNoRewrite(s, 0);
    return s.toString();
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:790
   */
  protected void dumpTreeNoRewrite(StringBuffer s, int indent) {
    for(int i = 0; i < indent; i++)
      s.append("  ");
    s.append(dumpString());
    s.append("\n");
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      getChildNoTransform(i).dumpTreeNoRewrite(s, indent+1);
    }
  }
  /**
   * @ast method 
   * @aspect PrimitiveTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrimitiveTypes.jrag:11
   */
  
  protected static final String PRIMITIVE_PACKAGE_NAME = "@primitive";
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:12
   */
  public void typeCheck() {
  }
  /**
   * @ast method 
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:12
   */
  void checkUnreachableStmt() {
  }
  /**
   * @ast method 
   * @aspect VariableDeclarationTransformation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:134
   */
  public void clearLocations() {
    setStart(0);
    setEnd(0);
    for(int i = 0; i < getNumChildNoTransform(); i++)
      getChildNoTransform(i).clearLocations();
  }
  /**
   * @ast method 
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:131
   */
  protected void transformEnumConstructors() {
    for(int i = 0; i < getNumChildNoTransform(); i++) {
      ASTNode child = getChildNoTransform(i);
      if(child != null)
        child.transformEnumConstructors();
    }
  }
  /**
   * @ast method 
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:444
   */
  protected void checkEnum(EnumDecl enumDecl) {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).checkEnum(enumDecl);
  }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:82
   */
  public Collection<Location> locationsRead(Collection<Location> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).locationsRead(res);
		return res;
	}
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:95
   */
  public Collection<Location> locationsWritten(Collection<Location> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).locationsWritten(res);
		return res;
	}
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:213
   */
  public Access getDestLocation() {
		return null;
	}
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:8
   */
  public void dot() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).dot();
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:211
   */
  public boolean mayRef(Variable v) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null && child.mayRef(v))
				return true;
		}
		return false;
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:2
   */
  public static String unCapitalise(String s) {
		return Character.toLowerCase(s.charAt(0)) + s.substring(1);
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:8
   */
  public static Object epsilon(SimpleSet set, Object alt) {
		if(set.size() == 1)
			return set.iterator().next();
		return alt;
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:14
   */
  public ASTNode getParent(int i) {
		if(i <= 0)
			return this;
		if(getParent() == null)
			return null;
		return getParent().getParent(i-1);
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:22
   */
  public int getChildIndex() {
		return getParent().getIndexOfChild(this);
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:26
   */
  public void removeChild(ASTNode child) {
		removeChild(getIndexOfChild(child));
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:30
   */
  public ASTNode<T> fullCopyAndDetach() {
		ASTNode<T> node = fullCopy();
		//node.parent = null;
		return node;
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:38
   */
  public Program programRoot() {
		ASTNode n=this;
		while(n!=null && !(n instanceof Program))
			n=n.getParent();
		return (Program)n;
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:45
   */
  public BodyDecl hostBodyDecl() {
		ASTNode n=this;
		while(n!=null && !(n instanceof BodyDecl))
			n=n.getParent();
		return (BodyDecl)n;
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:69
   */
  public void flushCaches() {
		this.flushCache();
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.flushCaches();
		}
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:84
   */
  protected ASTNode replaceWith(ASTNode newnode) {
		return replace(this).with(newnode);
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:196
   */
  public boolean isInTree() {
		ASTNode node = this;
		while (node.getParent() != null && node.getChildIndex() != -1)
			node = node.getParent();
		return node instanceof Program;
	}
  /**
   * @ast method 
   * @aspect ASTReplace
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ASTReplace.jrag:7
   */
  protected ASTNode replace(ASTNode node) {
		int pos = node.getParent().getIndexOfChild(node);
		if(pos == -1)
			throw new Error("invalid replacement position");
		state().replacePos = pos;
		node.getParent().in$Circle(true);
		return node.getParent();
	}
  /**
   * @ast method 
   * @aspect ASTReplace
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ASTReplace.jrag:16
   */
  protected ASTNode with(ASTNode node) {
		int pos = state().replacePos;
		if(pos == -1)
			throw new Error("invalid replacement position");
		((ASTNode)this).setChild(node, pos);
		in$Circle(false);
		return node;
	}
  /**
   * @ast method 
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:6
   */
  public ASTNode substituteAll(Parameterization parTypeDecl) {
		ASTNode res = (ASTNode)copy();
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child = child.substituteAll(parTypeDecl);
			res.setChild(child, i);
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:40
   */
  protected void collectFieldUsesWithCopies(FieldDeclaration decl, String name, ArrayList<VarAccess> col) {
		for(int i = 0; i < getNumChild(); i++)
			getChild(i).collectFieldUsesWithCopies(decl, name, col);
	}
  /**
   * @ast method 
   * @aspect LocalVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LocalVariable.jrag:11
   */
  public java.util.Set<VarAccess> varAccesses() {
		java.util.Set<VarAccess> res = new LinkedHashSet<VarAccess>();
		varAccesses(res);
		return res;
	}
  /**
   * @ast method 
   * @aspect LocalVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LocalVariable.jrag:17
   */
  public void varAccesses(java.util.Set<VarAccess> res) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.varAccesses(res);
		}
	}
  /**
   * @ast method 
   * @aspect LocalVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LocalVariable.jrag:31
   */
  public java.util.Set<VarAccess> localVarAccesses() {
		java.util.Set<VarAccess> res = new LinkedHashSet<VarAccess>();
		for(VarAccess va : varAccesses()) {
			if(va.decl() instanceof LocalDeclaration)
				res.add(va);
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:352
   */
  protected static boolean allAbstract(Collection<MethodDecl> mds) {
		for(MethodDecl md : mds)
			if(!md.isAbstract())
				return false;
		return true;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:44
   */
  public TypeDecl findSimpleType(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				TypeDecl td = child.findSimpleType(name);
				if(td != null) return td;
			}
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:61
   */
  public LocalClassDeclStmt findLocalClass(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				LocalClassDeclStmt lcd = child.findLocalClass(name);
				if(lcd!=null) return lcd;
			}
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:79
   */
  public Variable findVariable(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				Variable v = child.findVariable(name);
				if(v != null) return v;
			}
		}
		return null;		
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:97
   */
  public VariableDeclaration findLocalVariable(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				VariableDeclaration v = child.findLocalVariable(name);
				if(v != null) return v;
			}
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:115
   */
  public MethodDecl findMethod(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				MethodDecl md = child.findMethod(name);
				if(md != null) return md;
			}
		}
		return null;		
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:133
   */
  public MethodDecl findMethodBySig(String sig) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				MethodDecl md = child.findMethodBySig(sig);
				if(md != null) return md;
			}
		}
		return null;		
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:151
   */
  public FieldDeclaration findField(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				FieldDeclaration md = child.findField(name);
				if(md != null) return md;
			}
		}
		return null;		
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:175
   */
  protected void collectSourceMethods(Collection<MethodDecl> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectSourceMethods(res);
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:197
   */
  protected void collectSourceClassDecls(Collection<ClassDecl> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectSourceClassDecls(res);
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:219
   */
  protected void collectPackageDecls(Collection<String> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectPackageDecls(res);
	}
  /**
   * @ast method 
   * @aspect Nesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Nesting.jrag:3
   */
  public void checkEnclosingTypeNames(TypeDecl td) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.checkEnclosingTypeNames(td);
		}
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:24
   */
  public java.util.Set<TypeAccess> typeVarAccesses() {
		java.util.Set<TypeAccess> res = new LinkedHashSet<TypeAccess>();
		typeVarAccesses(res);
		return res;
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:30
   */
  public void typeVarAccesses(java.util.Set<TypeAccess> res) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.typeVarAccesses(res);
		}
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:51
   */
  protected void collectUsedTypeVars(Collection<TypeVariable> tvars) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.collectUsedTypeVars(tvars);
		}
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:74
   */
  public boolean usesForeignTypeVars() {
		Collection<TypeVariable> tvars = usedTypeVars();
		for(TypeVariable tv : tvars)
			if(!tv.isDescendantTo(this))
				return true;
		return false;
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:83
   */
  public void translateTypeVars(Map<TypeVariable, TypeVariable> dict) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.translateTypeVars(dict);
		}
	}
  /**
   * @ast method 
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:13
   */
  protected void collectFieldUses(FieldDeclaration decl, String name, Collection<VarAccess> col) {
		for(int i = 0; i < getNumChild(); i++)
			getChild(i).collectFieldUses(decl, name, col);
	}
  /**
   * @ast method 
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:68
   */
  protected void collect__MethodDecl_Uses(MethodDecl decl, String name, Collection<MethodAccess> col) {
		for(int i = 0; i < getNumChild(); i++)
			getChild(i).collect__MethodDecl_Uses(decl, name, col);
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:3
   */
  
	// unfortunately, JastAdd doesn't support enums very well
	public static final int VIS_PRIVATE = 0;
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:4
   */
  
	public static final int VIS_PACKAGE = 1;
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:5
   */
  
	public static final int VIS_PROTECTED = 2;
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:6
   */
  
	public static final int VIS_PUBLIC = 3;
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:8
   */
  public static String visibilityToString(int vis) {
		switch(vis) {
		case VIS_PRIVATE: return "private";
		case VIS_PACKAGE: return "package";
		case VIS_PROTECTED: return "protected";
		case VIS_PUBLIC: return "public";
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:89
   */
  public void collectSourceVisibles(Collection<Visible> visibles) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectSourceVisibles(visibles);
	}
  /**
   * @ast method 
   * @aspect PermuteParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/PermuteParameters.jrag:44
   */
  public static boolean isPerm(int[] perm, int max) {
		if(perm.length != max)
			return false;
		boolean[] gotit = new boolean[max];
		for(int i=0;i<max;++i) {
			if(perm[i] < 0 || perm[i] >= max)
				return false;
			if(gotit[perm[i]])
				return false;
			gotit[perm[i]] = true;
		}
		return true;
	}
  /**
   * @ast method 
   * @aspect PermuteParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/PermuteParameters.jrag:58
   */
  public static boolean isIdentityPerm(int[] perm) {
		for(int i=0;i<perm.length;++i)
			if(perm[i] != i)
				return false;
		return true;
	}
  /**
   * @ast method 
   * @aspect PermuteParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/PermuteParameters.jrag:65
   */
  public void refined_PermuteParameters_ASTNode_permute(int[] perm) {
		ASTNode[] children_copy = new ASTNode[children.length];
		System.arraycopy(children, 0, children_copy, 0, children.length);
		for(int i=0;i<perm.length;++i)
			children[perm[i]] = children_copy[i];
	}
  /**
   * @ast method 
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:62
   */
  public void lockSyncDependencies() {
		lockDependencies(AcquireDependency.edge, ReleaseDependency.edge, ThreadManagementDependency.edge);
	}
  /**
   * @ast method 
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:66
   */
  public void unlockSyncDependencies() {
		unlockDependencies(new PreservationStrategy(AcquireDependency.edge) {
			public boolean reflect(CFGNode n) { return n.isSyncAction(); }
		});
		unlockDependencies(new PreservationStrategy(ReleaseDependency.edge) {
			public boolean reflect(CFGNode n) { return n.isSyncAction(); }
		});
		unlockDependencies(new PreservationStrategy(ThreadManagementDependency.edge));
	}
  /**
   * @ast method 
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:76
   */
  
	
	public static LanguageExtension LOCKED_SYNC = new LanguageExtension("locked synchronisation") {
		public void eliminateOn(ASTNode n) {
			n.unlockSyncDependencies();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:54
   */
  public List<Access> computeExceptionsToDeclare() {
		List<Access> res = new List<Access>();
		for(TypeDecl exn : uncaughtExceptions())
			if(exn.shouldDeclareAsThrown())
				res.add(exn.createLockedAccess());
		return res;
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:2
   */
  public void lockControlFlow() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:7
   */
  public void unlockControlFlow() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).unlockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:12
   */
  
	
	protected SmallSet<CFGNode> lockedSucc = null;
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:29
   */
  
	
	public static LanguageExtension LOCKED_CONTROLFLOW = new LanguageExtension("locked control flow") {
		public void eliminateOn(ASTNode n) {
			n.unlockControlFlow();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:57
   */
  public void lockThrowEdges() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:62
   */
  public void unlockThrowEdges() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).unlockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:67
   */
  
	
	protected SmallSet<CFGNode> lockedThrowEdges = null;
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:87
   */
  
	
	public static LanguageExtension LOCKED_THROW = new LanguageExtension("locked throw edges") {
		public void eliminateOn(ASTNode n) {
			n.unlockThrowEdges();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:2
   */
  public void lockDataFlow() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockDataFlow();
	}
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:39
   */
  public void unlockDataFlow() { 
		for(int i=0;i<getNumChild();++i) {
			ASTNode ch = getChild(i);
			if(ch != null)
				ch.unlockDataFlow();
		}
	}
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:58
   */
  
	
	public static LanguageExtension LOCKED_DATAFLOW = new LanguageExtension("locked data flow") {
		public void eliminateOn(ASTNode n) {
			n.unlockDataFlow();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:85
   */
  
	
	protected IdentityHashMap<DependencyEdge, SmallSet<CFGNode>> dependencies = null;
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:92
   */
  public void lockDependencies(DependencyEdge... edges) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.lockDependencies(edges);
		}
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:107
   */
  public void unlockDependencies(PreservationStrategy r) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.unlockDependencies(r);
		}		
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:53
   */
  public void expatiateQualifiers() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).expatiateQualifiers();
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:92
   */
  public void removeSyntheticThis() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).removeSyntheticThis();
	}
  /**
   * @ast method 
   * @aspect IntroduceOutParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/IntroduceOutParameter.jrag:21
   */
  public void addAssignToReturns(Variable v) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.addAssignToReturns(v);
		}
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:48
   */
  public SmallSet<CFGNode> collectExceptionalSucc() {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		for(int i=0;i<getNumChild();++i)
			res = res.union(getChild(i).collectExceptionalSucc());
		return res;
	}
  /**
   * @ast method 
   * @aspect CreateStruct
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceParameterObject/CreateStruct.jrag:3
   */
  public static Pair<ClassDecl, Map<String, FieldDeclaration>> createStruct(String name, Iterable<? extends Variable> vars) {
		return createStruct(name, VIS_PUBLIC, vars);
	}
  /**
   * @ast method 
   * @aspect CreateStruct
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceParameterObject/CreateStruct.jrag:7
   */
  public static Pair<ClassDecl, Map<String, FieldDeclaration>> createStruct(String name, int vis, Iterable<? extends Variable> vars) {
		Map<String, FieldDeclaration> map = new HashMap<String, FieldDeclaration>();
		List<BodyDecl> bds = new List<BodyDecl>();
		List<ParameterDeclaration> ctor_parms = new List<ParameterDeclaration>();
		Block ctor_body = new Block();
		Modifiers ctor_mods = new Modifiers();
		ctor_mods.setVisibility(vis);
		ConstructorDecl ctor = new ConstructorDecl(ctor_mods, name, ctor_parms, new List<Access>(), new Opt<Stmt>(), ctor_body);
		for(Variable v : vars) {
			if(map.containsKey(v.name()))
				throw new RefactoringException("duplicate field name");
			Modifiers field_mods = (Modifiers) v.getModifiers().fullCopyAndDetach();
			field_mods.setVisibility(v.isField() ? ((FieldDeclaration)v).getVisibility() : VIS_PUBLIC);
			FieldDeclaration fd = new FieldDeclaration(field_mods, v.type().createLockedAccess(), v.name(), new Opt<Expr>());
			bds.add(fd);
			map.put(v.name(), fd);
			if(!v.isField() || v.hasInit()) {
				ParameterDeclaration pd = new ParameterDeclaration(v.type().createLockedAccess(), v.name());
				ctor_parms.add(pd);
				ctor_body.addStmt(AssignExpr.asStmt(fd.createLockedAccess(), pd.createLockedAccess()));
			}
		}
		bds.add(ctor);
		Modifiers class_mods = (Modifiers)ctor_mods.fullCopyAndDetach();
		class_mods.addModifier("static");
		return new Pair(new ClassDecl(class_mods, name, new Opt<Access>(), new List<Access>(), bds), map);
	}
  /**
   * @ast method 
   * @aspect BareParMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/BareParMethodAccess.jrag:4
   */
  
	
	public static LanguageExtension BARE_PARMETHODACCESS = new LanguageExtension("bare ParMethodAccess") {
		public void eliminateOn(ASTNode n) {
			n.eliminateBareParMethodAccess();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect BareParMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/BareParMethodAccess.jrag:11
   */
  public void eliminateBareParMethodAccess() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child instanceof ParMethodAccess && ((ParMethodAccess)child).isBare()) {
				ParMethodAccess pma = (ParMethodAccess)child;
				MethodDecl md = pma.decl().sourceMethodDecl();
				if(md.isStatic()) {
					setChild((T)md.hostType().createLockedAccess().qualifiesAccess(pma), i);
				} else {
					Access qual = null;
					for(TypeDecl td=pma.enclosingType();td!=null;td=td.enclosingType()) {
						if(td.memberMethod(md) == md) {
							if(td == pma.enclosingType())
								qual = new ThisAccess("this");
							else
								qual = td.createLockedAccess().qualifiesAccess(new ThisAccess("this"));
							break;
						}
					}
					setChild((T)qual.qualifiesAccess(pma), i);
				}
				pma.flushCache();
				pma.eliminateBareParMethodAccess();
			} else {
				child.eliminateBareParMethodAccess();
			}
		}
	}
  /**
   * @ast method 
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:43
   */
  

	public static LanguageExtension DEMAND_FINAL_MODIFIER = new LanguageExtension("demand final modifier") {
		public void eliminateOn(ASTNode n) {
			n.eliminateDemandFinal();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:50
   */
  public void eliminateDemandFinal() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode ch = getChild(i);
			if(ch != null)
				ch.eliminateDemandFinal();
		}
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:29
   */
  
	
	public static LanguageExtension FRESH_VARIABLES = new LanguageExtension("fresh variables") {
		public void eliminateOn(ASTNode n) {
			n.eliminateFreshVariables();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:36
   */
  public void eliminateFreshVariables() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode ch = getChild(i);
			if(ch != null)
				ch.eliminateFreshVariables();
		}
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:125
   */
  public Collection<Declaration> allDecls() {
		HashSet<Declaration> res = new HashSet<Declaration>();
		collectAllDecls(res);
		return res;
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:131
   */
  public void collectAllDecls(Collection<Declaration> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectAllDecls(res);
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:171
   */
  public void freshenAllDeclarations() {
		freshenDeclaration();
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.freshenAllDeclarations();
		}
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:181
   */
  public void freshenDeclaration() { }
  /**
   * @ast method 
   * @aspect LanguageExtensions
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LanguageExtensions.jrag:16
   */
  public void eliminate(LanguageExtension... les) {
		flushCaches();
		for(LanguageExtension le : les) {
			le.eliminateOn(this);
		}
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:2
   */
  public void lockOverridingDependencies(String... names) {
		lockOverridingDependencies(Arrays.asList(names));
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:5
   */
  public void lockOverridingDependencies(Collection<String> names) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.lockOverridingDependencies(names);
		}
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:70
   */
  
	
	public static LanguageExtension LOCKED_OVERRIDING = new LanguageExtension("locked overriding") {
		public void eliminateOn(ASTNode n) {
			n.unlockOverriding();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:77
   */
  public void unlockOverriding() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode ch = getChild(i);
			if(ch != null)
				ch.unlockOverriding();
		}
	}
  /**
   * @ast method 
   * @aspect MakeConversionExplicit
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/MakeConversionExplicit.jrag:27
   */
  public static Expr createConversion(TypeDecl dest, Expr src) {
		// check whether src can be boxed into dest (we assume there is an assignment conversion)
		if(src.type() instanceof PrimitiveType && !dest.unboxed().isUnknown()) {
			if(!src.type().equals(dest.unboxed()))
				src = createConversion(dest.unboxed(), src);
			return new ClassInstanceExpr(dest.createLockedAccess(), new List<Expr>().add(src));
		} else {
			CastExpr ce = new CastExpr(dest.createLockedAccess(), src);
			if(src.precedence() > src.maxPrecedence())
				ce.setExpr(new ParExpr(src));
			return ce;
		}
	}
  /**
   * @ast method 
   * @aspect ReturnVoid
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/ReturnVoid.jrag:4
   */
  
	
	public static LanguageExtension RETURN_VOID = new LanguageExtension("return void") {
		public void eliminateOn(ASTNode n) {
			n.eliminateReturnVoid();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect ReturnVoid
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/ReturnVoid.jrag:11
   */
  public void eliminateReturnVoid() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode ch = getChild(i);
			if(ch != null)
				ch.eliminateReturnVoid();
		}
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:36
   */
  public SimpleSet removeFields(SimpleSet s) {
		SimpleSet res = SimpleSet.emptySet;
		for(Iterator iter=s.iterator();iter.hasNext();) {
			Variable v = (Variable)iter.next();
			if(!v.isInstanceVariable() && !v.isClassVariable())
				res = res.add(v);
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:76
   */
  
	
	// eliminating with statements
	public static LanguageExtension WITH_STMT = new LanguageExtension("with statement") {
		public void eliminateOn(ASTNode n) {
			n.eliminateWith();
			n.flushCaches();
		}
	};
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:83
   */
  public ASTNode eliminateWith() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode ch = getChild(i);
			if(ch != null)
				ch.eliminateWith();
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:114
   */
  public void eliminateWith(List<Access> qualifiers, TypeDecl hostType) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).eliminateWith(qualifiers, hostType);
	}
  /**
   * @ast method 
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:39
   */
  protected void collectMonitorActions(Collection<MonitorAction> res) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.collectMonitorActions(res);
		}
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:102
   */
  protected void collectAllMemberTypeDecls(Collection<TypeDecl> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectAllMemberTypeDecls(res);		
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:113
   */
  protected void collectAllFieldAndTypeNames(Collection<String> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectAllFieldAndTypeNames(res);
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:129
   */
  protected void collectAllMethodNames(Collection<String> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectAllMethodNames(res);
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:9
   */
  public ASTNode lockAllPackageAccesses() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				child.lockAllPackageAccesses();
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect Rename
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Rename.jrag:2
   */
  
	public static LanguageExtension LOCKED_NAMES = new LanguageExtension("locked names") {
		public void eliminateOn(ASTNode n) {
			n.eliminateLockedNamesInSubtree();
		}
	};
  /**
   * @ast method 
   * @aspect Rename
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Rename.jrag:8
   */
  public void eliminateLockedNamesInSubtree() {
		Program root = programRoot();
		eliminateLockedNames();
		while(root != null && !root.affectedByUnlock.isEmpty()) {
			if(root != null)
				root.affectedByUnlock.clear();
			flushCaches();
			eliminateLockedNames();
		}
		flushCaches();
	}
  /**
   * @ast method 
   * @aspect Rename
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Rename.jrag:20
   */
  public void eliminateLockedNames() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect Rename
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/Rename.jrag:34
   */
  protected void affectedByUnlock(Access... accs) {
		Program root = programRoot();
		if(root != null) {
			for(Access acc : accs)
				root.affectedByUnlock.add(acc);
		}
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:49
   */
  public boolean hasNestedLocal(String name) {
		for(int i=0;i<getNumChild();++i)
			if(getChild(i).hasNestedLocal(name))
				return true;
		return false;
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:68
   */
  public boolean canIntroduceLabel(String name) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null)
				if(!child.canIntroduceLabel(name))
					return false;
		}
		return true;
	}
  /**
   * @ast method 
   * @aspect AddRequiredMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/AddRequiredMembers.jrag:11
   */
  public void addRequiredMembers(TypeDecl host, java.util.Set<MethodDecl> meths, java.util.Set<FieldDeclaration> fds, java.util.Set<MemberTypeDecl> mtds) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			child.addRequiredMembers(host, meths, fds, mtds);
		}
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:77
   */
  public void removeSuper() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).removeSuper();
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:93
   */
  public Collection<ThisAccess> collectThisAccesses() {
		Collection<ThisAccess> res = new LinkedList<ThisAccess>();
		collectThisAccesses(res);
		return res;
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:99
   */
  protected void collectThisAccesses(Collection<ThisAccess> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectThisAccesses(res);
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:5
   */
  public ASTNode lockNames(String... endangered) {
		return lockNames(Arrays.asList(endangered));
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:8
   */
  public ASTNode lockNames(Collection<String> endangered) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockNames(endangered);
		return this;
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:24
   */
  public ASTNode lockMethodNames(String... endangered) {
		return lockMethodNames(Arrays.asList(endangered));
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:27
   */
  public ASTNode lockMethodNames(Collection<String> endangered) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockMethodNames(endangered);
		return this;
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:33
   */
  public void lockConstructorCalls(Collection<TypeDecl> endangered) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockConstructorCalls(endangered);
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:38
   */
  public ASTNode lockAllNames() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).lockAllNames();
		return this;
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:85
   */
  public void checkNamingConstraints() {
		for(int i=0;i<getNumChild();++i)
			getChild(i).checkNamingConstraints();
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:126
   */
  public ASTNode lockedCopy() {
		ASTNode res = (ASTNode)copy();
		for(int i=0;i<getNumChildNoTransform();++i) {
			ASTNode child = getChildNoTransform(i);
			if(child != null)
				child = child.lockedCopy();
			res.setChild(child, i);
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Names.jadd:3
   */
  
	// JLS 3.9
	private static final String[] reservedNames = new String[] {
		"abstract", "assert", "boolean", "break", "byte", "case", "catch", "char", "class", "const",
		"continue", "default", "do", "double", "else", "enum", "extends", "final", "finally", "float",
		"for", "if", "goto", "implements", "import", "instanceof", "int", "interface", "long", "native",
		"new", "package", "private", "protected", "public", "return", "short", "static", "strictfp", "super",
		"switch", "synchronized", "this", "throw", "throws", "transient", "try", "void", "volatile", "while",
		"true", "false", "null"
	};
  /**
   * @ast method 
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Names.jadd:13
   */
  public static boolean isValidName(String name) {
		if(name == null)
			return false;
		for(String res : reservedNames)
			if(res.equals(name))
				return false;
		if(name.length() == 0)
			return false;
		if(!Character.isJavaIdentifierStart(name.charAt(0)))
			return false;
		for(int i=1;i<name.length();++i)
			if(!Character.isJavaIdentifierPart(name.charAt(i)))
				return false;
		return true;
	}
  /**
   * @ast method 
   * @aspect RenamePackage
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenamePackage.jrag:29
   */
  protected static boolean isValidPackageName(String name) {
		if(name.equals(""))
			return false;
		String[] comp = name.split("\\.");
		for(int i=0;i<comp.length;++i)
			if(!isValidName(comp[i]))
				return false;
		return true;
	}
  /**
   * @ast method 
   * @aspect RenameType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameType.jrag:52
   */
  public boolean hasNestedType(String name) {
    	for(int i=0;i<getNumChild();++i) {
    		ASTNode child = getChild(i);
    		if(child != null && child.hasNestedType(name))
    			return true;
    	}
    	return false;
    }
  /**
   * @ast method 
   * @aspect RenameType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameType.jrag:71
   */
  public boolean containsNativeMethod() {
    	for(int i=0;i<getNumChild();++i) {
    		ASTNode child = getChild(i);
    		if(child != null && child.containsNativeMethod())
    			return true;
    	}
    	return false;
    }
  /**
   * @ast method 
   * @aspect ExtractInterface
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/ExtractInterface.jrag:68
   */
  public static void findAffectedCallables(Collection<TypeConstraintVariable> update, TypeDecl newType, Collection<String> affectedMethods, Collection<TypeDecl> affectedConstructors) {
		for(TypeConstraintVariable tcv : update) {
			if(tcv instanceof Expr) {
				Expr e = (Expr)tcv;
				if(e.isParameterType()) {
					Callable c = ((ParameterDeclaration)e.getParent()).getParameterisedCallable();
					if(c instanceof MethodDecl)
						affectedMethods.add(((MethodDecl)c).name());
					else if(c instanceof ConstructorDecl)
						affectedConstructors.add(((ConstructorDecl)c).hostType());
				}
				if(e.isLeftChildOfDot() && e.nextAccess() instanceof MethodAccess) {
					MethodAccess ma = (MethodAccess)e.nextAccess();
					MethodDecl oldTarget = ma.decl(),
							   newTarget = oldTarget.ancestorIn(newType);
					// TODO: this should be part of the type constraints
					if(!oldTarget.throwsSameExceptionsAs(newTarget))
						throw new RefactoringException("new target throws different exceptions");
					if(oldTarget.type() != newTarget.type())
						throw new RefactoringException("new target has different return type");
					ma.lock(newTarget);
				}
			}
		}		
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:187
   */
  public Expr findDoublyParenthesised() {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				Expr e = child.findDoublyParenthesised();
				if(e != null) return e;
			}
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:205
   */
  public LabeledStmt findStmtWithLabel(String l) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode child = getChild(i);
			if(child != null) {
				LabeledStmt s = child.findStmtWithLabel(l);
				if(s != null) return s;
			}
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:244
   */
  public ASTNode findNodeAfter(Class clazz, int line, int column) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode res = getChild(i).findNodeAfter(clazz, line, column);
			if(res != null)
				return res;
		}
		if(clazz.isAssignableFrom(this.getClass())) {
			int startLine = getLine(getStart()),
				startColumn = getColumn(getStart());
			if(line < startLine || line == startLine && column <= startColumn)
				return this;
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:268
   */
  public ASTNode findNodeBefore(Class clazz, int line, int column) {
		for(int i=getNumChild()-1;i>=0;--i) {
			ASTNode res = getChild(i).findNodeBefore(clazz, line, column);
			if(res != null)
				return res;
		}
		if(clazz.isAssignableFrom(this.getClass())) {
			int endLine = getLine(getEnd()),
				endColumn = getColumn(getEnd());
			if(endLine != 0 && endLine < line || endLine == line && endColumn <= column)
				return this;
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:293
   */
  public ASTNode findNodeBetween(Class clazz, int line1, int column1, int line2, int column2) {
		for(int i=0;i<getNumChild();++i) {
			ASTNode res = getChild(i).findNodeBetween(clazz, line1, column1, line2, column2);
			if(res != null)
				return res;
		}
		if(clazz.isAssignableFrom(this.getClass())) {
			int startLine = getLine(getStart()),
				startColumn = getColumn(getStart()),
			    endLine = getLine(getEnd()),
				endColumn = getColumn(getEnd());
			if((line1 < startLine || line1 == startLine && column1 <= startColumn)
					&&
			   (endLine != 0 && endLine < line2 || endLine == line2 && endColumn <= column2))
				return this;
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:326
   */
  public Stmt findStmtFollowing(int line) {
		for(int i=0;i<getNumChild();++i) {
			Stmt s = getChild(i).findStmtFollowing(line);
			if(s != null)
				return s;
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:342
   */
  public Stmt findStmtPreceding(int line) {
		for(int i=0;i<getNumChild();++i) {
			Stmt s = getChild(i).findStmtPreceding(line);
			if(s != null)
				return s;
		}
		return null;
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:494
   */
  public void parentChildCheckNoTransform() {
		for (int i = 0; i < getNumChildNoTransform(); i++) {
			if (children[i] == null) {
				System.err.println("Warning: child is null during parentChildCheck");
				continue;
			}
			if (this != getChildNoTransform(i).parent)
				throw new RuntimeException("inconsistent tree! (child's parent == null : " + (getChildNoTransform(i).parent == null) + ")");
			getChildNoTransform(i).parentChildCheck();
		}
	}
  /**
   * @ast method 
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:505
   */
  public void parentChildCheck() {
		for (int i = 0; i < getNumChild(); i++) {
			if (children[i] == null) {
				System.err.println("Warning: child is null during parentChildCheck");
				continue;
			}
			if (this != getChild(i).getParent())
				throw new RuntimeException("inconsistent tree! (child's parent == null : " + (getChild(i).getParent() == null) + ")");
			getChild(i).parentChildCheck();
		}
	}
  /**
   * @ast method 
   * @aspect UndoChangeRepresentation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoChangeRepresentation.jrag:2
   */
  public static Map<String, String> computeChanges(Collection<ASTModification> mods) {
		HashSet<CompilationUnit> changed = new HashSet<CompilationUnit>();
		Map<CompilationUnit, String> originalPaths = new HashMap<CompilationUnit, String>();
		
		Iterator<ASTModification> iter = mods.iterator();
		while(iter.hasNext()) {
			ASTModification m = iter.next();
			if (m instanceof ASTModificationCompilationUnitSetId) {
				ASTModificationCompilationUnitSetId mm = (ASTModificationCompilationUnitSetId) m;
				originalPaths.put((CompilationUnit)mm.node, mm.oldPathName);
			}
		}
		
		iter = mods.iterator();
		while(iter.hasNext()) {
			ASTModification m = iter.next();
			CompilationUnit cu = m.getCompilationUnit();
			if(cu == null || !cu.fromSource() || changed.contains(cu))
				continue;
			changed.add(cu);
		}
		
		Map<String, String> res = new HashMap<String, String>();
		for(CompilationUnit cu : changed) {
			String pathName = originalPaths.containsKey(cu) ? originalPaths.get(cu) : cu.pathName();
			res.put(pathName, cu.toString());
		}
		
		return res;
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:13
   */
  public Collection<TypeConstraint> typeConstraints(Predicate<? super TypeConstraint> pred) {
		Collection<TypeConstraint> constraints = new LinkedHashSet<TypeConstraint>();
		collectTypeConstraints(pred, constraints);
		return constraints;
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:40
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:356
   */
  protected static void addConstraint(Collection<TypeConstraint> constraints, Predicate<? super TypeConstraint> pred, TypeConstraint constr) {
		if(pred.holds(constr))
			constraints.add(constr);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:362
   */
  public Collection<TypeConstraint> typeConstraints(final TypeDecl C) {
		return typeConstraints(new Predicate<TypeConstraint>() {
			public boolean holds(TypeConstraint constr) {
				return constr.relevantForGeneralisation(C);
			}
		});
	}
  /**
   * @ast method 
   * @aspect TypeConstraintSolving
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraintSolving.jrag:8
   */
  public static Collection<TypeConstraintVariable> propagateGeneralisation(Collection<TypeConstraint> constraints, TypeConstraintVariable update, TypeDecl newType) {
		Collection<TypeConstraintVariable> res = new HashSet<TypeConstraintVariable>();
		if(update.isFixed())
			throw new RefactoringException("cannot generalise type of " + update.describeConstraintVariable());
		res.add(update);
		int size;
		do {
			size = res.size();
			for(TypeConstraint constraint : constraints)
				constraint.propagateGeneralisation(newType, res);
		} while(size != res.size());
		return res;
	}
  /**
   * @ast method 
   * @aspect TypeConstraintSolving
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraintSolving.jrag:79
   */
  public Collection<TypeConstraintVariable> computeUpdatableExprs(Collection<TypeConstraint> constraints, TypeDecl cd, InterfaceDecl id) {
		Collection<TypeConstraintVariable> res = programRoot().allUpdatableExprs(cd);
		int size;
		do {
			size = res.size();
			for(TypeConstraint constraint : constraints)
				constraint.propagateBackwards(id, res);
		} while(size != res.size());
		return res;		
	}
  /**
   * @ast method 
   * @aspect TypeConstraintSolving
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraintSolving.jrag:97
   */
  protected void collectAllUpdatableExprs(TypeDecl type, Collection<TypeConstraintVariable> res) {
		for(int i=0;i<getNumChild();++i)
			getChild(i).collectAllUpdatableExprs(type, res);
	}
  /**
   * @ast method 
   * 
   */
  public ASTNode() {
    super();

    init$Children();

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
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  public static final boolean generatedWithCircularEnabled = true;
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  public static final boolean generatedWithCacheCycle = false;
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  public static final boolean generatedWithComponentCheck = false;
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected static ASTNode$State state = new ASTNode$State();
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public final ASTNode$State state() { return state; }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  public boolean in$Circle = false;
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean in$Circle() { return in$Circle; }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public void in$Circle(boolean b) { in$Circle = b; }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  public boolean is$Final = false;
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public boolean is$Final() { return is$Final; }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  public void is$Final(boolean b) { is$Final = b; }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings("cast") public T getChild(int i) {
    ASTNode node = this.getChildNoTransform(i);
    if(node == null) return null;
    if(node.is$Final()) {
      return (T) node;
    }
    if(!node.mayHaveRewrite()) {
      node.is$Final(this.is$Final());
      return (T) node;
    }
    if(!node.in$Circle()) {
      int rewriteState;
      int num = this.state().boundariesCrossed;
      do {
        this.state().push(ASTNode$State.REWRITE_CHANGE);
        ASTNode oldNode = node;
        oldNode.in$Circle(true);
        node = node.rewriteTo();
        if(node != oldNode) {
          this.setChild(node, i);
        }
        oldNode.in$Circle(false);
        rewriteState = this.state().pop();
      } while(rewriteState == ASTNode$State.REWRITE_CHANGE);
      if(rewriteState == ASTNode$State.REWRITE_NOCHANGE && this.is$Final()) {
        node.is$Final(true);
        this.state().boundariesCrossed = num;
      }
    }
    else if(this.is$Final() != node.is$Final()) this.state().boundariesCrossed++;
    return (T) node;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  private int childIndex;
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getIndexOfChild(ASTNode node) {
    if(node != null && node.childIndex < getNumChildNoTransform() && node == getChildNoTransform(node.childIndex))
      return node.childIndex;
    for(int i = 0; i < getNumChildNoTransform(); i++)
      if(getChildNoTransform(i) == node) {
        node.childIndex = i;
        return i;
      }
    return -1;
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addChild(T node) {
    setChild(node, getNumChildNoTransform());
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings("cast")
  public final T getChildNoTransform(int i) {
    return (T) (children != null ? children[i] : null);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  
  /**
   * @apilevel low-level
   */
  protected int numChildren;
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return numChildren;
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumChild() {
    return numChildren();
  }
  /**
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @apilevel low-level
   * @ast method 
   * 
   */
  public final int getNumChildNoTransform() {
    return numChildren();
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void refined__ASTNode_setChild(ASTNode node, int i) {
    if(children == null) {
      children = new ASTNode[i+1>4?i+1:4];
    } else if (i >= children.length) {
      ASTNode c[] = new ASTNode[i << 1];
      System.arraycopy(children, 0, c, 0, children.length);
      children = c;
    }
    children[i] = node;
    if(i >= numChildren) numChildren = i+1;
    if(node != null) { node.setParent(this); node.childIndex = i; }
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void refined__ASTNode_insertChild(ASTNode node, int i) {
    if(children == null) {
      children = new ASTNode[i+1>4?i+1:4];
      children[i] = node;
    } else {
      ASTNode c[] = new ASTNode[children.length + 1];
      System.arraycopy(children, 0, c, 0, i);
      c[i] = node;
      if(i < children.length) {
        System.arraycopy(children, i, c, i+1, children.length-i);
        for(int j = i+1; j < c.length; ++j) {
          if(c[j] != null)
            c[j].childIndex = j;
        }
      }
      children = c;
    }
    numChildren++;
    if(node != null) { node.setParent(this); node.childIndex = i; }
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void refined__ASTNode_removeChild(int i) {
    if(children != null) {
      ASTNode child = (ASTNode)children[i];
      if(child != null) {
        child.parent = null;
        child.childIndex = -1;
      }
      if (this instanceof List || this instanceof Opt) {
        System.arraycopy(children, i+1, children, i, children.length-i-1);
        children[children.length-1] = null;
        numChildren--;
        for(int j = i; j < numChildren; ++j) {
          if(children[j] != null) {
            child = (ASTNode) children[j];
            child.childIndex = j;
          }
        }
      } else {
        children[i] = null;
      }
    }
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public ASTNode getParent() {
    if(parent != null && ((ASTNode)parent).is$Final() != is$Final()) {
      state().boundariesCrossed++;
    }
    return (ASTNode)parent;
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setParent(ASTNode node) {
    parent = node;
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  
  /**
   * @apilevel low-level
   */
  protected ASTNode parent;
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  
  /**
   * @apilevel low-level
   */
  protected ASTNode[] children;
  /**
   * @ast method 
   * 
   */
  protected boolean duringImplicitConstructor() {
    if(state().duringImplicitConstructor == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringBoundNames() {
    if(state().duringBoundNames == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringNameResolution() {
    if(state().duringNameResolution == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringSyntacticClassification() {
    if(state().duringSyntacticClassification == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringAnonymousClasses() {
    if(state().duringAnonymousClasses == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringVariableDeclarationTransformation() {
    if(state().duringVariableDeclarationTransformation == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringConstantExpression() {
    if(state().duringConstantExpression == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringDU() {
    if(state().duringDU == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringAnnotations() {
    if(state().duringAnnotations == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringEnums() {
    if(state().duringEnums == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @ast method 
   * 
   */
  protected boolean duringGenericTypeVariables() {
    if(state().duringGenericTypeVariables == 0) {
      return false;
    }
    else {
      state().pop();
      state().push(ASTNode$State.REWRITE_INTERRUPT);
      return true;
    }
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public java.util.Iterator<T> iterator() {
    return new java.util.Iterator<T>() {
      private int counter = 0;
      public boolean hasNext() {
        return counter < getNumChild();
      }
      @SuppressWarnings("unchecked") public T next() {
        if(hasNext())
          return (T)getChild(counter++);
        else
          return null;
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
    };
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
   * @aspect UndoASTNodeChildren
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoASTNodeChildren.jrag:190
   */
    public void permute(int[] perm) {
		if (Program.isRecordingASTChanges()) {
			// Recording of permute action for undo.
			throw new Error("not implemented");
		}
		refined_PermuteParameters_ASTNode_permute(perm);
	}
  /**
   * @ast method 
   * @aspect UndoASTNodeChildren
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoASTNodeChildren.jrag:3
   */
   public void setChild(final ASTNode node, final int i) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationSetChild() {
				{
					parent = ASTNode.this;
					isInTree = parent!=null && parent.isInTree();
					newChild = node;
					index = i;
					children_null = children == null;
					children_length = children == null ? -1 : children.length;
					oldNumChildren = numChildren;
					newChild_oldParent = node == null ? null : node.parent;
					newChild_oldChildIndex = node == null ? -1 : node.childIndex;
					
					oldChild = index < oldNumChildren ? children[index] : null;
//					ASTNode oldChild_parent = oldChild != null ? oldChild.parent : null;
//					int oldChild_childIndex = oldChild != null ? oldChild.childIndex : -1;
				}
				
				@Override
				public void undo() {
					if (children_null)
						children = null;
					else if (index >= children_length) {
						ASTNode[] c = new ASTNode[children_length];
						System.arraycopy(children, 0, c, 0, children_length);
						children = c;
					}
					if (!children_null && index < oldNumChildren)
						children[index] = oldChild;
					
					// restore parent and child index of old node on this place
					// this shouldn't be necessary, but...
//					if (oldChild != null) {
//						oldChild.parent = oldChild_parent;
//						oldChild.childIndex = oldChild_childIndex;
//					}
					if (newChild != null) {
						newChild.parent = newChild_oldParent;
						newChild.childIndex = newChild_oldChildIndex;
					}
					numChildren = oldNumChildren;
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ASTNode_setChild(node, i);
				}
				@Override
				public String toString() {
					return "ASTNode.setChild";
				}
			});
		}
		refined__ASTNode_setChild(node, i);
	}
  /**
   * @ast method 
   * @aspect UndoASTNodeChildren
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoASTNodeChildren.jrag:132
   */
   public void insertChild(final ASTNode node, final int i) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationInsertChild() {
				{
					parent = ASTNode.this;
					isInTree = parent!=null && parent.isInTree();
					newChild = node;
					index = i;
					children_null = children == null;
					children_length = children == null ? -1 : children.length;
					oldNumChildren = numChildren;
					newChild_oldParent = node == null ? null : node.parent;
					newChild_oldChildIndex = node == null ? -1 : node.childIndex;
				}
				
				@Override
				public void undo() {
					if (children_null)
						children = null;
					else {
						ASTNode[] c = new ASTNode[children_length];
						System.arraycopy(children, 0, c, 0, index);
						if (index < children_length)
							System.arraycopy(children, index+1, c, index, children_length - index);
						children = c;
					}
					if (newChild != null) {
						newChild.setParent(newChild_oldParent);
						newChild.childIndex = newChild_oldChildIndex;
					}
					numChildren = oldNumChildren;
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ASTNode_insertChild(node, i);
				}
				@Override
				public String toString() {
					return "ASTNode.insertChild";
				}
			});
		}
		refined__ASTNode_insertChild(node, i);
	}
  /**
   * @ast method 
   * @aspect UndoASTNodeChildren
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoASTNodeChildren.jrag:75
   */
   public void removeChild(final int i) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationRemoveChild() {
				{
					parent = ASTNode.this;
					isInTree = parent!=null && parent.isInTree();
					index = i;
					children_null = children == null;
					children_length = children == null ? -1 : children.length;
					child = children == null ? null : children[index];
					child_parent = child == null ? null : child.parent;
					child_childIndex = child == null ? -1 : child.childIndex;
					oldNumChildren = numChildren;
				}
				
				@Override
				public void undo() {
					if (!children_null) {
						if (children.length < children_length) {
							ASTNode[] c = new ASTNode[children_length];
							System.arraycopy(children, 0, c, 0, children.length);
							children = c;
						}
						System.arraycopy(children, index, children, index + 1, children_length - index - 1);
						children[index] = child;
						if (child != null) {
							child.childIndex = child_childIndex;
							child.parent = child_parent;
							numChildren = oldNumChildren;
						}
					}
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ASTNode_removeChild(i);
				}
				@Override
				public String toString() {
					return "ASTNode.removeChild";
				}
			});
		}
		refined__ASTNode_removeChild(i);
	}
  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:8
   */
    protected void collect_contributors_Program_accessibilityConstraints() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_Program_accessibilityConstraints();
  }

  protected void contributeTo_Program_Program_accessibilityConstraints(Collection<AccessibilityConstraint> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenamePackage.jrag:39
   */
    protected void collect_contributors_Program_typeWithSameNameAsPackage() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_Program_typeWithSameNameAsPackage();
  }

  protected void contributeTo_Program_Program_typeWithSameNameAsPackage(Collection<TypeDecl> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Inheritance.jrag:3
   */
    protected void collect_contributors_TypeDecl_childTypes() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_TypeDecl_childTypes();
  }

  protected void contributeTo_TypeDecl_TypeDecl_childTypes(Collection<TypeDecl> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:36
   */
    protected void collect_contributors_TypeDecl_uses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_TypeDecl_uses();
  }

  protected void contributeTo_TypeDecl_TypeDecl_uses(Collection<Access> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:87
   */
    protected void collect_contributors_TypeDecl_instantiations() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_TypeDecl_instantiations();
  }

  protected void contributeTo_TypeDecl_TypeDecl_instantiations(Collection<Access> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:81
   */
    protected void collect_contributors_ConstructorDecl_uses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_ConstructorDecl_uses();
  }

  protected void contributeTo_ConstructorDecl_ConstructorDecl_uses(Collection<Access> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:108
   */
    protected void collect_contributors_FieldDeclaration_staticImports() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_FieldDeclaration_staticImports();
  }

  protected void contributeTo_FieldDeclaration_FieldDeclaration_staticImports(Collection<StaticImportDecl> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:37
   */
    protected void collect_contributors_CFGNode_collPred() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_CFGNode_collPred();
  }

  protected void contributeTo_CFGNode_CFGNode_collPred(SmallSet<CFGNode> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:23
   */
    protected void collect_contributors_VariableDeclaration_uses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_VariableDeclaration_uses();
  }

  protected void contributeTo_VariableDeclaration_VariableDeclaration_uses(Collection<VarAccess> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:29
   */
    protected void collect_contributors_ParameterDeclaration_uses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_ParameterDeclaration_uses();
  }

  protected void contributeTo_ParameterDeclaration_ParameterDeclaration_uses(Collection<VarAccess> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:53
   */
    protected void collect_contributors_MethodDecl_coll_overridingMethods() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_MethodDecl_coll_overridingMethods();
  }

  protected void contributeTo_MethodDecl_MethodDecl_coll_overridingMethods(HashSet<MethodDecl> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:42
   */
    protected void collect_contributors_MethodDecl_polyUses_() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_MethodDecl_polyUses_();
  }

  protected void contributeTo_MethodDecl_MethodDecl_polyUses_(Collection<MethodAccess> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:93
   */
    protected void collect_contributors_LabeledStmt_uses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_LabeledStmt_uses();
  }

  protected void contributeTo_LabeledStmt_LabeledStmt_uses(Collection<Stmt> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:127
   */
    protected void collect_contributors_GenericMethodDecl_parUses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_GenericMethodDecl_parUses();
  }

  protected void contributeTo_GenericMethodDecl_GenericMethodDecl_parUses(Collection<MethodAccess> collection) {
  }

  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:81
   */
    protected void collect_contributors_GenericConstructorDecl_parUses() {
    for(int i = 0; i < getNumChild(); i++)
      getChild(i).collect_contributors_GenericConstructorDecl_parUses();
  }

  protected void contributeTo_GenericConstructorDecl_GenericConstructorDecl_parUses(Collection<Access> collection) {
  }

  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1196
   */
  public boolean unassignedEverywhere(Variable v, TryStmt stmt) {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < getNumChild(); i++) {
      if(!getChild(i).unassignedEverywhere(v, stmt))
        return false;
    }
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ErrorCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ErrorCheck.jrag:22
   */
  public int lineNumber() {
    ASTNode$State state = state();
    try {
    ASTNode n = this;
    while(n.getParent() != null && n.getStart() == 0) {
      n = n.getParent();
    }
    return getLine(n.getStart());
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:744
   */
  public String indent() {
    ASTNode$State state = state();
    try {
    String indent = extractIndent();
    return indent.startsWith("\n") ? indent : ("\n" + indent);
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:749
   */
  public String extractIndent() {
    ASTNode$State state = state();
    try {
    if(getParent() == null)
      return "";
    String indent = getParent().extractIndent();
    if(getParent().addsIndentationLevel())
      indent += "  ";
    return indent;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:758
   */
  public boolean addsIndentationLevel() {
    ASTNode$State state = state();
    try {  return false;  }
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
    try {  return getClass().getName();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1056
   */
  public boolean usesTypeVariable() {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < getNumChild(); i++)
      if(getChild(i).usesTypeVariable())
        return true;
    return false;
  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean locationsRead_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<Location> locationsRead_value;
  /**
   * @attribute syn
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<Location> locationsRead() {
    if(locationsRead_computed) {
      return locationsRead_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    locationsRead_value = locationsRead_compute();
      if(isFinal && num == state().boundariesCrossed) locationsRead_computed = true;
    return locationsRead_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<Location> locationsRead_compute() {  return locationsRead(new HashSet<Location>());  }
  /**
   * @apilevel internal
   */
  protected boolean locationsWritten_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<Location> locationsWritten_value;
  /**
   * @attribute syn
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:94
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<Location> locationsWritten() {
    if(locationsWritten_computed) {
      return locationsWritten_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    locationsWritten_value = locationsWritten_compute();
      if(isFinal && num == state().boundariesCrossed) locationsWritten_computed = true;
    return locationsWritten_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<Location> locationsWritten_compute() {  return locationsWritten(new HashSet<Location>());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:580
   */
  public SmallSet<CFGNode> collectBranches() {
    ASTNode$State state = state();
    try {
		SmallSet<CFGNode> collectBranches = SmallSet.empty();
		for(int i = 0; i < getNumChild(); i++)
			collectBranches = collectBranches.union(getChild(i).collectBranches());
		return collectBranches;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean uncaughtExceptions_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<TypeDecl> uncaughtExceptions_value;
  /**
   * @attribute syn
   * @aspect Exceptions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Exceptions.jrag:4
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<TypeDecl> uncaughtExceptions() {
    if(uncaughtExceptions_computed) {
      return uncaughtExceptions_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uncaughtExceptions_value = uncaughtExceptions_compute();
      if(isFinal && num == state().boundariesCrossed) uncaughtExceptions_computed = true;
    return uncaughtExceptions_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<TypeDecl> uncaughtExceptions_compute() {
    SmallSet<TypeDecl> uncaughtExns = SmallSet.empty();
    for(int i = 0; i < getNumChild(); i++)
      uncaughtExns = uncaughtExns.union(getChild(i).uncaughtExceptions());
    return uncaughtExns;
  }
  /**
   * @apilevel internal
   */
  protected boolean fromSource_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean fromSource_value;
  /**
   * @attribute syn
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:52
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean fromSource() {
    if(fromSource_computed) {
      return fromSource_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    fromSource_value = fromSource_compute();
      if(isFinal && num == state().boundariesCrossed) fromSource_computed = true;
    return fromSource_value;
  }
  /**
   * @apilevel internal
   */
  private boolean fromSource_compute() {
		CompilationUnit cu = compilationUnit();
		return cu == null ? false : cu.fromSource(); 
	}
  /**
   * @apilevel internal
   */
  protected boolean usedTypeVars_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeVariable> usedTypeVars_value;
  /**
   * @attribute syn
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeVariable> usedTypeVars() {
    if(usedTypeVars_computed) {
      return usedTypeVars_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    usedTypeVars_value = usedTypeVars_compute();
      if(isFinal && num == state().boundariesCrossed) usedTypeVars_computed = true;
    return usedTypeVars_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeVariable> usedTypeVars_compute() {
		Collection<TypeVariable> res = new LinkedHashSet<TypeVariable>();
		collectUsedTypeVars(res);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean usedForeignTypeVars_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeVariable> usedForeignTypeVars_value;
  /**
   * @attribute syn
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:65
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeVariable> usedForeignTypeVars() {
    if(usedForeignTypeVars_computed) {
      return usedForeignTypeVars_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    usedForeignTypeVars_value = usedForeignTypeVars_compute();
      if(isFinal && num == state().boundariesCrossed) usedForeignTypeVars_computed = true;
    return usedForeignTypeVars_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeVariable> usedForeignTypeVars_compute() {
		Collection<TypeVariable> res = new LinkedHashSet<TypeVariable>();
		for(TypeVariable tv : usedTypeVars())
			if (!tv.isDescendantTo(this))
				res.add(tv);
		return res;
	}
  /**
   * @attribute inh
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:36
   */
  @SuppressWarnings({"unchecked", "cast"})
  public CompilationUnit compilationUnit() {
    ASTNode$State state = state();
    CompilationUnit compilationUnit_value = getParent().Define_CompilationUnit_compilationUnit(this, null);
    return compilationUnit_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    if(state().peek() == ASTNode$State.REWRITE_CHANGE) {
      state().pop();
      state().push(ASTNode$State.REWRITE_NOCHANGE);
    }
    return this;
  }
  /**
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
  }
  /**
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
  }
  /**
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    return getParent().Define_Stmt_insertStmtAfter(this, caller, s);
  }
  /**
   * @apilevel internal
   */
  public VariableScope Define_VariableScope_outerScope(ASTNode caller, ASTNode child) {
    return getParent().Define_VariableScope_outerScope(this, caller);
  }
  /**
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    return getParent().Define_NameType_nameType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_reachable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isMethodParameter(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isMethodParameter(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isConstructorParameter(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isConstructorParameter(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isExceptionHandlerParameter(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isExceptionHandlerParameter(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_variableArityValid(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_variableArityValid(this, caller);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    return getParent().Define_SmallSet_CFGNode__following(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Parameterisable Define_Parameterisable_parameterOwner(ASTNode caller, ASTNode child) {
    return getParent().Define_Parameterisable_parameterOwner(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_superType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_superType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public ConstructorDecl Define_ConstructorDecl_constructorDecl(ASTNode caller, ASTNode child) {
    return getParent().Define_ConstructorDecl_constructorDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_componentType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_componentType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public LabeledStmt Define_LabeledStmt_lookupLabel(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_LabeledStmt_lookupLabel(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isDest(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isDest(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isSource(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isSource(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isIncOrDec(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isIncOrDec(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    return getParent().Define_boolean_isDAbefore(this, caller, v);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    return getParent().Define_boolean_isDUbefore(this, caller, v);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeException(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeException(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeRuntimeException(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeRuntimeException(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeError(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeError(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeNullPointerException(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeNullPointerException(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeThrowable(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeThrowable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    return getParent().Define_boolean_handlesException(this, caller, exceptionType);
  }
  /**
   * @apilevel internal
   */
  public Collection Define_Collection_lookupConstructor(ASTNode caller, ASTNode child) {
    return getParent().Define_Collection_lookupConstructor(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Collection Define_Collection_lookupSuperConstructor(ASTNode caller, ASTNode child) {
    return getParent().Define_Collection_lookupSuperConstructor(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Expr Define_Expr_nestedScope(ASTNode caller, ASTNode child) {
    return getParent().Define_Expr_nestedScope(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_Collection_lookupMethod(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeObject(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeObject(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeCloneable(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeCloneable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeSerializable(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeSerializable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeBoolean(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeBoolean(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeByte(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeByte(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeShort(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeShort(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeChar(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeChar(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeInt(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeInt(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeLong(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeLong(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeFloat(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeFloat(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeDouble(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeDouble(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeString(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeString(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeVoid(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeVoid(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeNull(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeNull(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_unknownType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_unknownType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_hasPackage(ASTNode caller, ASTNode child, String packageName) {
    return getParent().Define_boolean_hasPackage(this, caller, packageName);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_lookupType(ASTNode caller, ASTNode child, String packageName, String typeName) {
    return getParent().Define_TypeDecl_lookupType(this, caller, packageName, typeName);
  }
  /**
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_SimpleSet_lookupType(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBePublic(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBePublic(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeProtected(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeProtected(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBePrivate(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBePrivate(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeStatic(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeStatic(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeFinal(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeFinal(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeAbstract(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeAbstract(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeVolatile(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeVolatile(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeTransient(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeTransient(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeStrictfp(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeStrictfp(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeSynchronized(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeSynchronized(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeNative(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_mayBeNative(this, caller);
  }
  /**
   * @apilevel internal
   */
  public ASTNode Define_ASTNode_enclosingBlock(ASTNode caller, ASTNode child) {
    return getParent().Define_ASTNode_enclosingBlock(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_insideLoop(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_insideLoop(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_insideSwitch(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_insideSwitch(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Case Define_Case_bind(ASTNode caller, ASTNode child, Case c) {
    return getParent().Define_Case_bind(this, caller, c);
  }
  /**
   * @apilevel internal
   */
  public String Define_String_typeDeclIndent(ASTNode caller, ASTNode child) {
    return getParent().Define_String_typeDeclIndent(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isAnonymous(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isAnonymous(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Variable Define_Variable_unknownField(ASTNode caller, ASTNode child) {
    return getParent().Define_Variable_unknownField(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_unknownMethod(ASTNode caller, ASTNode child) {
    return getParent().Define_MethodDecl_unknownMethod(this, caller);
  }
  /**
   * @apilevel internal
   */
  public ConstructorDecl Define_ConstructorDecl_unknownConstructor(ASTNode caller, ASTNode child) {
    return getParent().Define_ConstructorDecl_unknownConstructor(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_declType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_declType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public BodyDecl Define_BodyDecl_enclosingBodyDecl(ASTNode caller, ASTNode child) {
    return getParent().Define_BodyDecl_enclosingBodyDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isMemberType(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isMemberType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_hostType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_hostType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_switchType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_switchType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_returnType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_returnType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingInstance(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_enclosingInstance(this, caller);
  }
  /**
   * @apilevel internal
   */
  public String Define_String_methodHost(ASTNode caller, ASTNode child) {
    return getParent().Define_String_methodHost(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_inExplicitConstructorInvocation(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_inExplicitConstructorInvocation(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_inStaticContext(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_reportUnreachable(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_reportUnreachable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_boolean_mayUseAnnotationTarget(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public ElementValue Define_ElementValue_lookupElementTypeValue(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_ElementValue_lookupElementTypeValue(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_withinSuppressWarnings(ASTNode caller, ASTNode child, String s) {
    return getParent().Define_boolean_withinSuppressWarnings(this, caller, s);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_withinDeprecatedAnnotation(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_withinDeprecatedAnnotation(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Annotation Define_Annotation_lookupAnnotation(ASTNode caller, ASTNode child, TypeDecl typeDecl) {
    return getParent().Define_Annotation_lookupAnnotation(this, caller, typeDecl);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingAnnotationDecl(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_enclosingAnnotationDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_assignConvertedType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_assignConvertedType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_inExtendsOrImplements(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_inExtendsOrImplements(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_typeWildcard(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_typeWildcard(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_lookupWildcardExtends(ASTNode caller, ASTNode child, TypeDecl typeDecl) {
    return getParent().Define_TypeDecl_lookupWildcardExtends(this, caller, typeDecl);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_lookupWildcardSuper(ASTNode caller, ASTNode child, TypeDecl typeDecl) {
    return getParent().Define_TypeDecl_lookupWildcardSuper(this, caller, typeDecl);
  }
  /**
   * @apilevel internal
   */
  public LUBType Define_LUBType_lookupLUBType(ASTNode caller, ASTNode child, Collection bounds) {
    return getParent().Define_LUBType_lookupLUBType(this, caller, bounds);
  }
  /**
   * @apilevel internal
   */
  public GLBType Define_GLBType_lookupGLBType(ASTNode caller, ASTNode child, ArrayList bounds) {
    return getParent().Define_GLBType_lookupGLBType(this, caller, bounds);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_genericDecl(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_genericDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public AssignExpr Define_AssignExpr_modifyingAssignExpr(ASTNode caller, ASTNode child) {
    return getParent().Define_AssignExpr_modifyingAssignExpr(this, caller);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__breakTarget(ASTNode caller, ASTNode child, BreakStmt stmt) {
    return getParent().Define_SmallSet_CFGNode__breakTarget(this, caller, stmt);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__continueTarget(ASTNode caller, ASTNode child, ContinueStmt stmt) {
    return getParent().Define_SmallSet_CFGNode__continueTarget(this, caller, stmt);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__returnTarget(ASTNode caller, ASTNode child) {
    return getParent().Define_SmallSet_CFGNode__returnTarget(this, caller);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__throwTarget(ASTNode caller, ASTNode child, TypeDecl exn) {
    return getParent().Define_SmallSet_CFGNode__throwTarget(this, caller, exn);
  }
  /**
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
    return getParent().Define_SmallSet_CFGNode__uncheckedExnTarget(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_inInextractiblePosition(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_inInextractiblePosition(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Variable Define_Variable_getModifiedVariable(ASTNode caller, ASTNode child) {
    return getParent().Define_Variable_getModifiedVariable(this, caller);
  }
  /**
   * @apilevel internal
   */
  public PackageDecl Define_PackageDecl_lookupPackage(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_PackageDecl_lookupPackage(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_inImportDecl(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_inImportDecl(this, caller);
  }
  /**
   * @apilevel internal
   */
  public GenericElement Define_GenericElement_owner(ASTNode caller, ASTNode child) {
    return getParent().Define_GenericElement_owner(this, caller);
  }
  /**
   * @apilevel internal
   */
  public Collection<MethodDecl> Define_Collection_MethodDecl__waitNotifyMethods(ASTNode caller, ASTNode child) {
    return getParent().Define_Collection_MethodDecl__waitNotifyMethods(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodNotify(ASTNode caller, ASTNode child) {
    return getParent().Define_MethodDecl_methodNotify(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodNotifyAll(ASTNode caller, ASTNode child) {
    return getParent().Define_MethodDecl_methodNotifyAll(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodWait(ASTNode caller, ASTNode child) {
    return getParent().Define_MethodDecl_methodWait(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodWaitLong(ASTNode caller, ASTNode child) {
    return getParent().Define_MethodDecl_methodWaitLong(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodDecl Define_MethodDecl_methodWaitLongInt(ASTNode caller, ASTNode child) {
    return getParent().Define_MethodDecl_methodWaitLongInt(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_escapes(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_escapes(this, caller);
  }
  /**
   * @apilevel internal
   */
  public MethodAccessInfo Define_MethodAccessInfo_accessMethod(ASTNode caller, ASTNode child, MethodDecl md) {
    return getParent().Define_MethodAccessInfo_accessMethod(this, caller, md);
  }
  /**
   * @apilevel internal
   */
  public UnknownVarAccess Define_UnknownVarAccess_unknownVarAccess(ASTNode caller, ASTNode child) {
    return getParent().Define_UnknownVarAccess_unknownVarAccess(this, caller);
  }
  /**
   * @apilevel internal
   */
  public CompilationUnit Define_CompilationUnit_compilationUnit(ASTNode caller, ASTNode child) {
    return getParent().Define_CompilationUnit_compilationUnit(this, caller);
  }
  /**
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_allImportedTypes(ASTNode caller, ASTNode child, String name) {
    return getParent().Define_SimpleSet_allImportedTypes(this, caller, name);
  }
  /**
   * @apilevel internal
   */
  public String Define_String_packageName(ASTNode caller, ASTNode child) {
    return getParent().Define_String_packageName(this, caller);
  }
  /**
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingType(ASTNode caller, ASTNode child) {
    return getParent().Define_TypeDecl_enclosingType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isNestedType(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isNestedType(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_isLocalClass(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_isLocalClass(this, caller);
  }
  /**
   * @apilevel internal
   */
  public String Define_String_hostPackage(ASTNode caller, ASTNode child) {
    return getParent().Define_String_hostPackage(this, caller);
  }
  /**
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    return getParent().Define_int_maxPrecedence(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    return getParent().Define_boolean_delete(this, caller);
  }
  /**
   * @apilevel internal
   */
  public boolean Define_boolean_reachableCatchClause(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    return getParent().Define_boolean_reachableCatchClause(this, caller, exceptionType);
  }
}
