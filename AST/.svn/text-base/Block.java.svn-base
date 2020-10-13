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
 * @production Block : {@link Stmt} ::= <span class="component">{@link Stmt}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:197
 */
public class Block extends Stmt implements Cloneable, VariableScope {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    checkReturnDA_Variable_values = null;
    isDAafter_Variable_values = null;
    checkReturnDU_Variable_values = null;
    isDUafter_Variable_values = null;
    localVariableDeclaration_String_values = null;
    canCompleteNormally_computed = false;
    succ_computed = false;
    succ_value = null;
    asScope_int_values = null;
    accessLocalVariable_Variable_int_values = null;
    lookupType_String_values = null;
    lookupVariable_String_values = null;
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
  public Block clone() throws CloneNotSupportedException {
    Block node = (Block)super.clone();
    node.checkReturnDA_Variable_values = null;
    node.isDAafter_Variable_values = null;
    node.checkReturnDU_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.localVariableDeclaration_String_values = null;
    node.canCompleteNormally_computed = false;
    node.succ_computed = false;
    node.succ_value = null;
    node.asScope_int_values = null;
    node.accessLocalVariable_Variable_int_values = null;
    node.lookupType_String_values = null;
    node.lookupVariable_String_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Block copy() {
    try {
      Block node = (Block) clone();
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
  public Block fullCopy() {
    Block tree = (Block) copy();
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
   * @aspect DeclareBeforeUse
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DeclareBeforeUse.jrag:21
   */
  public boolean declaredBeforeUse(Variable decl, ASTNode use) {
    int indexDecl = ((ASTNode)decl).varChildIndex(this);
    int indexUse = use.varChildIndex(this);
    return indexDecl <= indexUse;
  }
  /**
   * @ast method 
   * @aspect DeclareBeforeUse
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DeclareBeforeUse.jrag:26
   */
  public boolean declaredBeforeUse(Variable decl, int indexUse) {
    int indexDecl = ((ASTNode)decl).varChildIndex(this);
    return indexDecl <= indexUse;
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:526
   */
  public void toString(StringBuffer s) {
    String indent = indent();
    s.append(shouldHaveIndent() ? indent : "");
    s.append("{");
    for(int i = 0; i < getNumStmt(); i++) {
      getStmt(i).toString(s);
    }
    s.append(shouldHaveIndent() ? indent : indent.substring(0, indent.length()-2));
    s.append("}");
  }
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:2
   */
  public void removeStmt(Stmt s) {
    	getStmtList().removeChild(getStmtList().getIndexOfChild(s));
	}
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:6
   */
  public void removeStmt(int i) {
		getStmtList().removeChild(i);
	}
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:10
   */
  public int getIndexOfStmt(Stmt s) {
		return getStmtList().getIndexOfChild(s);
	}
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:14
   */
  public void insertStmt(int i, Stmt s) {
		getStmtList().insertChild(s, i);
	}
  /**
   * @ast method 
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:29
   */
  public Block(Stmt... stmts) {
		List<Stmt> l = new List<Stmt>();
		for(Stmt stmt : stmts)
			l.add(stmt);
		setStmtList(l);
	}
  /**
   * @ast method 
   * @aspect LabelExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LabelExt.jrag:41
   */
  public String pickFreshLabel(String base) {
		if(lookupLabel(base) == null && canIntroduceLabel(base))
			return base;
		for(int i=0;;++i) {
			String l = base + i;
			if(lookupLabel(l) == null && canIntroduceLabel(l))
				return l;
		}
	}
  /**
   * @ast method 
   * @aspect ExtractBlock
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractBlock.jrag:12
   */
  public Block extractBlock(int begin, int end) {
		if(begin < 0 || end >= getNumStmt() || end < begin)
			throw new RefactoringException("indices out of range");
		lockAllNames();
		Block new_block = new Block(new List());
		insertStmt(end+1, new_block);
		
		// push statements into block
		while(end >= begin) {
			Stmt stmt = getStmt(end);
			if(stmt instanceof Case)
				throw new RefactoringException("cannot push case into block");
			if(stmt instanceof VariableDeclaration) {
				VariableDeclaration decl = (VariableDeclaration)stmt;
				if(usesAfter(decl, end+1)) {
					AssignSimpleExpr assgn = decl.split();
					removeStmt(end);
					if(assgn != null)
						++end;
					insertStmt(begin++, stmt);
				} else {
					removeStmt(end--);
					new_block.insertStmt(0, stmt);
				}
			} else {
				removeStmt(end--);
				new_block.insertStmt(0, stmt);
			}
		}
		
		return new_block;
	}
  /**
   * @ast method 
   * @aspect ExtractBlock
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractBlock.jrag:45
   */
  public Block doExtractBlock(int begin, int end) {
		Program root = programRoot();
		Block blk = extractBlock(begin, end);
		programRoot().eliminate(LOCKED_NAMES);
		return blk;
	}
  /**
   * @ast method 
   * @aspect ExtractBlock
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractBlock.jrag:52
   */
  protected boolean usesAfter(Variable v, int i) {
		for(int j=i+1;j<getNumStmt();++j)
			if(getStmt(j).mayRef(v))
				return true;
		return false;
	}
  /**
   * @ast method 
   * @aspect ExtractMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractMethod.jrag:2
   */
  public MethodDecl extractMethod(int visibility, String name, int begin, int end) {
		Block blk = doExtractBlock(begin, end);
		AnonymousMethod am = blk.doWrapIntoClosure();
		am = am.convert();
		MethodDecl md = am.doExtractToMethod(visibility, name);
		return md;
	}
  /**
   * @ast method 
   * @aspect ExtractMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/ExtractMethod.jrag:10
   */
  public MethodDecl doExtractMethod(int visibility, String name, int begin, int end) {
		return extractMethod(visibility, name, begin, end);
	}
  /**
   * @ast method 
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:25
   */
  public AnonymousMethod wrapIntoClosure() {
		lockControlFlow();
		
		// create a closure without parameters returning and throwing all
		// uncaught checked exceptions of block
		// if the block cannot complete normally, we need to set the return type
		List<Access> exns = computeExceptionsToDeclare();
		Access rettype = canCompleteNormally() ? new PrimitiveTypeAccess("void")
			                                   : returnType().createLockedAccess();
		AnonymousMethod cl = new AnonymousMethod(new List(), new List(), rettype, exns, null, new List()); 
		Stmt stmt;
		if(canCompleteNormally()) {
			replaceWith(stmt = new ExprStmt(cl));
		} else {
			ReturnStmt ret = new ReturnStmt(cl);
			replaceWith(stmt = ret);
		}
		cl.setBlock(this);
		return cl;
	}
  /**
   * @ast method 
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:46
   */
  public AnonymousMethod doWrapIntoClosure() {
		TypeDecl td = hostType();
		AnonymousMethod am = wrapIntoClosure();
		td.eliminate(LOCKED_CONTROLFLOW, LOCKED_NAMES, RETURN_VOID);
		return am;
	}
  /**
   * @ast method 
   * @aspect InlineBlock
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineBlock.jrag:2
   */
  public void inline() {
		if(!(getParent().getParent() instanceof Block))
			return;
		Block parent_block = (Block)getParent().getParent();
		parent_block.lockAllNames();
		
		// pull statements from block
		for(int i = getNumStmt();i>0;--i)
			getStmt(0).pullFromBlock();
		
		parent_block.removeStmt(this);
		parent_block.hostType().flushCaches();
	}
  /**
   * @ast method 
   * @aspect ReturnVoid
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/ReturnVoid.jrag:19
   */
  public void eliminateReturnVoid() {
		for(int i=0;i<getNumStmt();++i) {
			Stmt s = getStmt(i);
			if(s instanceof ReturnStmt && ((ReturnStmt)s).returnsVoid()) {
				ReturnStmt ret = (ReturnStmt)s;
				Expr res = ret.getResult();
				if(ret.following().equals(ret.returnTarget())) {
					setStmt(new ExprStmt(res), i);
				} else {
					insertStmt(i, new ExprStmt(res));
					ret.setResultOpt(new Opt());
				}
			} else {
				s.eliminateReturnVoid();
			}
		}
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:92
   */
  public Block eliminateWith() {
		for(int i=0;i<getNumStmt();++i) {
			Stmt s = getStmt(i);
			if(s instanceof WithStmt) {
				Stmt s2 = ((WithStmt)s).eliminateWith();
				setStmt(s2, i);
				if(s2 instanceof Block)
					((Block)s2).inline();
			} else {
				s.eliminateWith();
			}
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:30
   */
  public boolean hasNestingLocal(String name) {
		for(Iterator<Variable> iter=lookupVariable(name).iterator(); iter.hasNext();) {
			Variable v = iter.next();
			if(v instanceof LocalDeclaration && ((LocalDeclaration)v).enclosingBodyDecl() == enclosingBodyDecl())
				return true;
		}
		return false;
	}
  /**
   * @ast method 
   * 
   */
  public Block() {
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
    setChild(new List(), 0);
  }
  /**
   * @ast method 
   * 
   */
  public Block(List<Stmt> p0) {
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
   * Replaces the Stmt list.
   * @param list The new list node to be used as the Stmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setStmtList(List<Stmt> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Stmt list.
   * @return Number of children in the Stmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumStmt() {
    return getStmtList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Stmt list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Stmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumStmtNoTransform() {
    return getStmtListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Stmt list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Stmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt getStmt(int i) {
    return (Stmt)getStmtList().getChild(i);
  }
  /**
   * Append an element to the Stmt list.
   * @param node The element to append to the Stmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addStmt(Stmt node) {
    List<Stmt> list = (parent == null || state == null) ? getStmtListNoTransform() : getStmtList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addStmtNoTransform(Stmt node) {
    List<Stmt> list = getStmtListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Stmt list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setStmt(Stmt node, int i) {
    List<Stmt> list = getStmtList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Stmt list.
   * @return The node representing the Stmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Stmt> getStmts() {
    return getStmtList();
  }
  /**
   * Retrieves the Stmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Stmt> getStmtsNoTransform() {
    return getStmtListNoTransform();
  }
  /**
   * Retrieves the Stmt list.
   * @return The node representing the Stmt list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Stmt> getStmtList() {
    List<Stmt> list = (List<Stmt>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Stmt list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Stmt list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Stmt> getStmtListNoTransform() {
    return (List<Stmt>)getChildNoTransform(0);
  }
  protected java.util.Map checkReturnDA_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:300
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean checkReturnDA(Variable v) {
    Object _parameters = v;
    if(checkReturnDA_Variable_values == null) checkReturnDA_Variable_values = new java.util.HashMap(4);
    if(checkReturnDA_Variable_values.containsKey(_parameters)) {
      return ((Boolean)checkReturnDA_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean checkReturnDA_Variable_value = checkReturnDA_compute(v);
      if(isFinal && num == state().boundariesCrossed) checkReturnDA_Variable_values.put(_parameters, Boolean.valueOf(checkReturnDA_Variable_value));
    return checkReturnDA_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean checkReturnDA_compute(Variable v) {
    HashSet set = new HashSet();
    collectBranches(set);
    for(Iterator iter = set.iterator(); iter.hasNext(); ) {
      Object o = iter.next();
      if(o instanceof ReturnStmt) {
        ReturnStmt stmt = (ReturnStmt)o;
        if(!stmt.isDAafterReachedFinallyBlocks(v))
          return false;
      }
    }
    return true;
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:441
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAafter(Variable v) {
    Object _parameters = v;
    if(isDAafter_Variable_values == null) isDAafter_Variable_values = new java.util.HashMap(4);
    if(isDAafter_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDAafter_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDAafter_Variable_value = isDAafter_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDAafter_Variable_values.put(_parameters, Boolean.valueOf(isDAafter_Variable_value));
    return isDAafter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDAafter_compute(Variable v) {  return getNumStmt() == 0 ? isDAbefore(v) : getStmt(getNumStmt()-1).isDAafter(v);  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:447
   */
  public boolean isDUeverywhere(Variable v) {
    ASTNode$State state = state();
    try {  return isDUbefore(v) && checkDUeverywhere(v);  }
    finally {
    }
  }
  protected java.util.Map checkReturnDU_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:757
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean checkReturnDU(Variable v) {
    Object _parameters = v;
    if(checkReturnDU_Variable_values == null) checkReturnDU_Variable_values = new java.util.HashMap(4);
    if(checkReturnDU_Variable_values.containsKey(_parameters)) {
      return ((Boolean)checkReturnDU_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean checkReturnDU_Variable_value = checkReturnDU_compute(v);
      if(isFinal && num == state().boundariesCrossed) checkReturnDU_Variable_values.put(_parameters, Boolean.valueOf(checkReturnDU_Variable_value));
    return checkReturnDU_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean checkReturnDU_compute(Variable v) {
    HashSet set = new HashSet();
    collectBranches(set);
    for(Iterator iter = set.iterator(); iter.hasNext(); ) {
      Object o = iter.next();
      if(o instanceof ReturnStmt) {
        ReturnStmt stmt = (ReturnStmt)o;
        if(!stmt.isDUafterReachedFinallyBlocks(v))
          return false;
      }
    }
    return true;
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:870
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUafter(Variable v) {
    Object _parameters = v;
    if(isDUafter_Variable_values == null) isDUafter_Variable_values = new java.util.HashMap(4);
    if(isDUafter_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDUafter_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDUafter_Variable_value = isDUafter_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDUafter_Variable_values.put(_parameters, Boolean.valueOf(isDUafter_Variable_value));
    return isDUafter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDUafter_compute(Variable v) {  return getNumStmt() == 0 ? isDUbefore(v) : getStmt(getNumStmt()-1).isDUafter(v);  }
  protected java.util.Map localVariableDeclaration_String_values;
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:116
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableDeclaration localVariableDeclaration(String name) {
    Object _parameters = name;
    if(localVariableDeclaration_String_values == null) localVariableDeclaration_String_values = new java.util.HashMap(4);
    if(localVariableDeclaration_String_values.containsKey(_parameters)) {
      return (VariableDeclaration)localVariableDeclaration_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    VariableDeclaration localVariableDeclaration_String_value = localVariableDeclaration_compute(name);
      if(isFinal && num == state().boundariesCrossed) localVariableDeclaration_String_values.put(_parameters, localVariableDeclaration_String_value);
    return localVariableDeclaration_String_value;
  }
  /**
   * @apilevel internal
   */
  private VariableDeclaration localVariableDeclaration_compute(String name) {
    for(int i = 0; i < getNumStmt(); i++)
      if(getStmt(i).declaresVariable(name))
        return (VariableDeclaration)getStmt(i);
    return null;
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:758
   */
  public boolean addsIndentationLevel() {
    ASTNode$State state = state();
    try {  return shouldHaveIndent();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:765
   */
  public boolean shouldHaveIndent() {
    ASTNode$State state = state();
    try {  return getParent() instanceof List && getParent().getParent() instanceof Block;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_value;
  /**
   * @attribute syn
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:37
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean canCompleteNormally() {
    if(canCompleteNormally_computed) {
      return canCompleteNormally_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    canCompleteNormally_value = canCompleteNormally_compute();
      if(isFinal && num == state().boundariesCrossed) canCompleteNormally_computed = true;
    return canCompleteNormally_value;
  }
  /**
   * @apilevel internal
   */
  private boolean canCompleteNormally_compute() {  return getNumStmt() == 0 ? reachable() : getStmt(getNumStmt() - 1).canCompleteNormally();  }
  /**
   * @apilevel internal
   */
  protected boolean succ_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> succ_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:409
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> succ() {
    if(succ_computed) {
      return succ_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    succ_value = succ_compute();
      if(isFinal && num == state().boundariesCrossed) succ_computed = true;
    return succ_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> succ_compute() {  return getNumStmt() == 0 ? following() : SmallSet.<CFGNode>singleton(getStmt(0));  }
  /**
   * @attribute syn
   * @aspect BlockExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/BlockExt.jrag:37
   */
  public boolean isBodyDeclBody() {
    ASTNode$State state = state();
    try {  return getParent() instanceof ConstructorDecl
		|| getParent() instanceof InstanceInitializer
		|| getParent() instanceof StaticInitializer
		|| getParent() instanceof Opt && getParent().getParent() instanceof MethodDecl;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:36
   */
  public boolean isFlowThrough() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  protected java.util.Map asScope_int_values;
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:187
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Scope asScope(int index) {
    Object _parameters = Integer.valueOf(index);
    if(asScope_int_values == null) asScope_int_values = new java.util.HashMap(4);
    if(asScope_int_values.containsKey(_parameters)) {
      return (Scope)asScope_int_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    Scope asScope_int_value = asScope_compute(index);
      if(isFinal && num == state().boundariesCrossed) asScope_int_values.put(_parameters, asScope_int_value);
    return asScope_int_value;
  }
  /**
   * @apilevel internal
   */
  private Scope asScope_compute(int index) {
		final int j = index;
		return new Scope() {
			public boolean hasVariable(String name) {
				for(int i=0;i<=j;++i)
					if(getStmt(i) instanceof VariableDeclaration &&
							((VariableDeclaration)getStmt(i)).name().equals(name))
						return true;
				return false;
			}
		};
	}
  protected java.util.Map accessLocalVariable_Variable_int_values;
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:235
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessLocalVariable(Variable decl, int index) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(decl);
    _parameters.add(Integer.valueOf(index));
    if(accessLocalVariable_Variable_int_values == null) accessLocalVariable_Variable_int_values = new java.util.HashMap(4);
    if(accessLocalVariable_Variable_int_values.containsKey(_parameters)) {
      return (SymbolicVarAccess)accessLocalVariable_Variable_int_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SymbolicVarAccess accessLocalVariable_Variable_int_value = accessLocalVariable_compute(decl, index);
      if(isFinal && num == state().boundariesCrossed) accessLocalVariable_Variable_int_values.put(_parameters, accessLocalVariable_Variable_int_value);
    return accessLocalVariable_Variable_int_value;
  }
  /**
   * @apilevel internal
   */
  private SymbolicVarAccess accessLocalVariable_compute(Variable decl, int index) {
		for(int i=0;i<index&&i<getNumStmt();++i)
			if(getStmt(i) == decl)
				return (LocalDeclaration)decl;
		return unknownVarAccess();
	}
  protected java.util.Map lookupType_String_values;
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:263
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
  protected java.util.Map lookupVariable_String_values;
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:17
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    Object _parameters = name;
    if(lookupVariable_String_values == null) lookupVariable_String_values = new java.util.HashMap(4);
    if(lookupVariable_String_values.containsKey(_parameters)) {
      return (SimpleSet)lookupVariable_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
      if(isFinal && num == state().boundariesCrossed) lookupVariable_String_values.put(_parameters, lookupVariable_String_value);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean reachable() {
    ASTNode$State state = state();
    boolean reachable_value = getParent().Define_boolean_reachable(this, null);
    return reachable_value;
  }
  /**
   * @attribute inh
   * @aspect LabelExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LabelExt.jrag:40
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LabeledStmt lookupLabel(String name) {
    ASTNode$State state = state();
    LabeledStmt lookupLabel_String_value = getParent().Define_LabeledStmt_lookupLabel(this, null, name);
    return lookupLabel_String_value;
  }
  /**
   * @attribute inh
   * @aspect WrapBlockIntoClosure
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/WrapBlockIntoClosure.jrag:69
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl returnType() {
    ASTNode$State state = state();
    TypeDecl returnType_value = getParent().Define_TypeDecl_returnType(this, null);
    return returnType_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:133
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:52
   * @apilevel internal
   */
  public boolean Define_boolean_isIncOrDec(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_isIncOrDec(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:444
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getStmtListNoTransform())  {
    int index = caller.getIndexOfChild(child);
    return index == 0 ? isDAbefore(v) : getStmt(index - 1).isDAafter(v);
  }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:871
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getStmtListNoTransform())  {
    int index = caller.getIndexOfChild(child);
    return index == 0 ? isDUbefore(v) : getStmt(index - 1).isDUafter(v);
  }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:380
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtListNoTransform())  { 
    int index = caller.getIndexOfChild(child);
    {
    SimpleSet c = SimpleSet.emptySet;
    for(int i = index; i >= 0 && !(getStmt(i) instanceof Case); i--) {
      if(getStmt(i) instanceof LocalClassDeclStmt) {
        TypeDecl t = ((LocalClassDeclStmt)getStmt(i)).getClassDecl();
        if(t.name().equals(name)) {
          c = c.add(t);
        }
      }
    }
    if(!c.isEmpty())
      return c;
    return lookupType(name);
  }
  }
    else {      return getParent().Define_SimpleSet_lookupType(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:68
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtListNoTransform())  { 
    int index = caller.getIndexOfChild(child);
    {
    VariableDeclaration v = localVariableDeclaration(name);
    // declare before use and shadowing
    if(v != null && declaredBeforeUse(v, index))
      return v;
    return lookupVariable(name);
  }
  }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:296
   * @apilevel internal
   */
  public VariableScope Define_VariableScope_outerScope(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return this;
  }
    else {      return getParent().Define_VariableScope_outerScope(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:116
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.EXPRESSION_NAME;
  }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:38
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return childIndex == 0 ? reachable() : getStmt(childIndex-1).canCompleteNormally();
  }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:148
   * @apilevel internal
   */
  public boolean Define_boolean_reportUnreachable(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return i == 0 ? reachable() : getStmt(i-1).reachable();
  }
    else {      return getParent().Define_boolean_reportUnreachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:410
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return i + 1 < getNumStmt() ? SmallSet.<CFGNode>singleton(getStmt(i + 1)) : following();
  }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:180
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getStmtListNoTransform())  { 
    int index = caller.getIndexOfChild(child);
    {
		SymbolicVarAccess acc = accessLocalVariable(decl, index);
		if(!acc.isUnknownVarAccess()) return acc;
		return accessVariable(decl).moveInto(asScope(index));
	}
  }
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:14
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    if(caller == getStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		if(getStmt(i).hasNestingLocal(name))
			return false;
		while(i < getNumStmt())
			if(getStmt(i++).hasNestedLocal(name))
				return false;
		return true;
	}
  }
    else {      return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:7
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    if(caller == getStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    { removeStmt(i); return true; }
  }
    else {      return getParent().Define_boolean_delete(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:20
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		getStmtList().insertChild(s, i);
		return s;
	}
  }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:69
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getStmtListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		getStmtList().insertChild(s, i+1);
		return s;
	}
  }
    else {      return getParent().Define_Stmt_insertStmtAfter(this, caller, s);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
