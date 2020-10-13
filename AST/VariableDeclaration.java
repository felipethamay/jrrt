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
 * @production VariableDeclaration : {@link Stmt} ::= <span class="component">{@link Modifiers}</span> <span class="component">TypeAccess:{@link Access}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">[Init:{@link Expr}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:83
 */
public class VariableDeclaration extends Stmt implements Cloneable, SimpleSet, Iterator, Variable, LocalDeclaration {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    constant_computed = false;
    constant_value = null;
    sourceVariableDecl_computed = false;
    sourceVariableDecl_value = null;
    succ_computed = false;
    succ_value = null;
    VariableDeclaration_uses_computed = false;
    VariableDeclaration_uses_value = null;
    VariableDeclaration_uses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    VariableDeclaration_uses_computed = false;
    VariableDeclaration_uses_value = null;
    VariableDeclaration_uses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableDeclaration clone() throws CloneNotSupportedException {
    VariableDeclaration node = (VariableDeclaration)super.clone();
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.constant_computed = false;
    node.constant_value = null;
    node.sourceVariableDecl_computed = false;
    node.sourceVariableDecl_value = null;
    node.succ_computed = false;
    node.succ_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableDeclaration copy() {
    try {
      VariableDeclaration node = (VariableDeclaration) clone();
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
  public VariableDeclaration fullCopy() {
    VariableDeclaration tree = (VariableDeclaration) copy();
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
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:99
   */
  public SimpleSet add(Object o) {
    return new SimpleSetImpl().add(this).add(o);
  }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:103
   */
  public boolean isSingleton() { return true; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:104
   */
  public boolean isSingleton(Object o) { return contains(o); }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:107
   */
  
  private VariableDeclaration iterElem;
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:108
   */
  public Iterator iterator() { iterElem = this; return this; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:109
   */
  public boolean hasNext() { return iterElem != null; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:110
   */
  public Object next() { Object o = iterElem; iterElem = null; return o; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:111
   */
  public void remove() { throw new UnsupportedOperationException(); }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:304
   */
  public void nameCheck() {
    SimpleSet decls = outerScope().lookupVariable(name());
    for(Iterator iter = decls.iterator(); iter.hasNext(); ) {
      Variable var = (Variable)iter.next();
      if(var instanceof VariableDeclaration) {
        VariableDeclaration decl = (VariableDeclaration)var;
        if(decl != this && decl.enclosingBodyDecl() == enclosingBodyDecl())
          error("duplicate declaration of local variable " + name() + " in enclosing scope");
      }
      // 8.4.1
      else if(var instanceof ParameterDeclaration) {
        ParameterDeclaration decl = (ParameterDeclaration)var;
        if(decl.enclosingBodyDecl() == enclosingBodyDecl())
          error("duplicate declaration of local variable and parameter " + name());
      }
    }
    if(getParent().getParent() instanceof Block) {
      Block block = (Block)getParent().getParent();
      for(int i = 0; i < block.getNumStmt(); i++) {
        if(block.getStmt(i) instanceof Variable) {
          Variable v = (Variable)block.getStmt(i);
          if(v.name().equals(name()) && v != this) {
            error("duplicate declaration of local variable " + name());
          }
        }
      }
    }
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:74
   */
  public VariableDeclaration(Access type, String name, Expr init) {
    this(new Modifiers(new List()), type, name, new Opt(init));
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:78
   */
  public VariableDeclaration(Access type, String name) {
    this(new Modifiers(new List()), type, name, new Opt());
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:164
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    getModifiers().toString(s);
    getTypeAccess().toString(s);
    s.append(" " + name());
    if(hasInit()) {
      s.append(" = ");
      getInit().toString(s);
    }
    s.append(";");
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:22
   */
  public void typeCheck() {
    if(hasInit()) {
      TypeDecl source = getInit().type();
      TypeDecl dest = type();
      if(!source.assignConversionTo(dest, getInit()))
        error("can not assign variable " + name() + " of type " + dest.typeName() +
              " a value of type " + source.typeName());
    }
  }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:18
   */
  public boolean mustAlias(Location l) { return mayAlias(l); }
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:108
   */
  public VariableDeclaration findLocalVariable(String name) {
		if(name().equals(name))
			return this;
		return super.findLocalVariable(name);
	}
  /**
   * @ast method 
   * @aspect ExtractAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/ExtractAssignment.jrag:65
   */
  public VariableDeclaration extractAssignment(Expr expr) {
		return expr.extractAssignment(this, expr.enclosingStmt());
	}
  /**
   * @ast method 
   * @aspect MakeFinal
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/MakeFinal.jrag:3
   */
  public VariableDeclaration makeFinal() {
		if(this.isFinal())
			return this;
		for(VarAccess va : this.allUses())
			if(va.isDest())
				throw new RefactoringException("variable has writes; cannot make final");
		this.getModifiers().addModifier(new Modifier("final"));
		return this;
	}
  /**
   * @ast method 
   * @aspect MakeFinal
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/MakeFinal.jrag:13
   */
  public VariableDeclaration makeFinal(boolean makeFinal) {
		return makeFinal ? makeFinal() : this;
	}
  /**
   * @ast method 
   * @aspect MergeVarDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractTemp/MergeVarDecl.jrag:3
   */
  public VariableDeclaration merge()  {
		if(hasInit())
			return this;
		if(!isInBlock())
			throw new RefactoringException("cannot merge declarations outside blocks");
		Block block = (Block)getParent().getParent();
		int idx = block.getIndexOfStmt(this);
		assert(idx != -1);
		Stmt next = block.getStmt(idx+1);
		if(next instanceof ExprStmt) {
			Expr e = ((ExprStmt)next).getExpr();
			if(e instanceof AssignSimpleExpr) {
				Expr dest = ((AssignSimpleExpr)e).getDest();
				Expr src = ((AssignSimpleExpr)e).getSource();
				if(dest instanceof VarAccess && ((VarAccess)dest).decl() == this) {
					this.setInit(src);
					block.removeStmt(idx+1);
					programRoot().flushCaches();
					return this;
				} else {
					throw new RefactoringException("following assignment is not to this declaration");
				}
			} else {
				throw new RefactoringException("following statement is not a simple assignment");
			}
		} else {
			throw new RefactoringException("following statement is not an assignment");
		}
	}
  /**
   * @ast method 
   * @aspect InlineTemp
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineTemp.jrag:2
   */
  public void inline() {
		AssignSimpleExpr assgn = split();
		if(assgn != null)
			assgn.doInline();
		removeUnused();
	}
  /**
   * @ast method 
   * @aspect InlineTemp
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineTemp.jrag:10
   */
  public void doInline() {
    	inline();
    }
  /**
   * @ast method 
   * @aspect RemoveUnusedLocal
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/RemoveUnusedLocal.jrag:3
   */
  public void removeUnused() {
		if(uses().isEmpty() && !hasInit())
			delete();
	}
  /**
   * @ast method 
   * @aspect SplitVarDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/SplitVarDecl.jrag:20
   */
  public AssignSimpleExpr split() {
    if(!hasInit())
      return null;  // we could throw an exception here, but I think it's better this way
    AssignSimpleExpr assgn = new AssignSimpleExpr(new VarAccess(name()), getInit().wrapArrayInit());
    this.setInitOpt(new Opt());
    insertStmtAfter(new ExprStmt(assgn));
    return assgn;
  }
  /**
   * @ast method 
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:41
   */
  public void setDemandFinal() { getModifiers().addDemandFinalModifier(); }
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:189
   */
  public void freshenDeclaration() {
		Collection<VarAccess> uses = allUses();
		FreshLocalVariable fv = new FreshLocalVariable(getModifiers(), getTypeAccess(), getID(), getInitOpt());
		for(VarAccess va : uses)
			va.lock(fv);
		replaceWith(fv);
	}
  /**
   * @ast method 
   * @aspect PromoteTempToField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PromoteTempToField/PromoteTempToField.jrag:5
   */
  public void promoteToField(int vis) {
		split();
		Modifiers mods = new Modifiers(vis);
		if(inStaticContext())
			mods.addModifier("static");
		FieldDeclaration fd = new FieldDeclaration(mods, type().createLockedAccess(), name(), new Opt<Expr>());
		hostType().insertField(fd, hostBodyDecl());
		for(VarAccess va : uses()) {
			va.lock(fd);
			va.lockReachingDefs();
		}
		programRoot().flushCaches();
		removeUnused();
	}
  /**
   * @ast method 
   * @aspect PromoteTempToField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PromoteTempToField/PromoteTempToField.jrag:20
   */
  public void doPromoteToField(int vis) {
		BodyDecl bd = this.hostBodyDecl();
		promoteToField(vis);
		bd.programRoot().eliminate(LOCKED_NAMES, LOCKED_DATAFLOW);
	}
  /**
   * @ast method 
   * @aspect PromoteTempToField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PromoteTempToField/PromoteTempToField.jrag:26
   */
  public void doPromoteToField() {
		doPromoteToField(VIS_PRIVATE);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:51
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(hasInit()) {
			if(type().isSubtypeConstrainable() && getInit().type().isSubtypeConstrainable()) {
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "initialisation", getInit(), Operator.LE, getTypeAccess()));
			} else {
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "initialisation", getInit(), Operator.EQ, getInit().type()));
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "initialisation", getTypeAccess(), Operator.EQ, type()));
			}
		}
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:10
   */
  public boolean isHeapLocation() { return false; }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:13
   */
  public boolean mayAlias(Location l) { return this == l; }
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:61
   */
  public boolean isField() {
		return isClassVariable() || isInstanceVariable();
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:90
   */
  public Variable findVariable(String name) {
		if(name().equals(name))
			return this;
		return super.findVariable(name);
	}
  /**
   * @ast method 
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:2
   */
  public Variable refresh() { return refreshVariable(); }
  /**
   * @ast method 
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:4
   */
  public Collection<VarAccess> allUses() { return uses(); }
  /**
   * @ast method 
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:6
   */
  public boolean isUsed() { return !allUses().isEmpty(); }
  /**
   * @ast method 
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:2
   */
  public VariableDeclaration asVariableDeclaration(Expr init) {
		Modifiers mods = (Modifiers)getModifiers().fullCopyAndDetach();
		mods.removeModifiers("public", "protected", "private", "static");
		return new VariableDeclaration(mods, type().createLockedAccess(), name(), new Opt(init));
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:143
   */
  public void collectAllDecls(Collection<Declaration> res) {
		res.add(this);
		super.collectAllDecls(res);
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:9
   */
  public VarAccess createLockedAccess() {
		VarAccess va = new VarAccess(this.name());
		va.lock(this);
		return va;
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:58
   */
  public boolean isSubstituted() { return false; }
  /**
   * @ast method 
   * @aspect RenameVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameVariable.jrag:6
   */
  public void rename(String new_name) {
		if(name().equals(new_name))
			return;
		if(!isValidName(new_name))
			throw new RefactoringException("not a valid name: "+new_name);
		checkRenamingPreconds(new_name);
		programRoot().lockNames(name(), new_name);
		setID(new_name);
		programRoot().eliminate(LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:88
   */
  public SymbolicVarAccess moveInto(Scope s) {
		if(s.hasVariable(name()))
			return unknownVarAccess();
		return this;
	}
  /**
   * @ast method 
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:93
   */
  public boolean isUnknownVarAccess() {
		return false;
	}
  /**
   * @ast method 
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:96
   */
  public SymbolicVarAccess ensureStatic() {
		return unknownVarAccess();
	}
  /**
   * @ast method 
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:99
   */
  public SymbolicVarAccess ensureFinal() {
		return isFinal() ? this : unknownVarAccess();
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:199
   */
  public Access accessByModifyingAccess(VarAccess originalAccess) {
		if(originalAccess.getQualifier() != null)
			throw new RefactoringException("cannot qualify access to local variable");
		return originalAccess;
	}
  /**
   * @ast method 
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:56
   */
  public boolean hasNestedLocal(String name) {
		if(name.equals(name()))
			return true;
		return super.hasNestedLocal(name);
	}
  /**
   * @ast method 
   * @aspect RenameVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameVariable.jrag:22
   */
  public void checkRenamingPreconds(String new_name) {
		if(!canIntroduceLocal(new_name))
			throw new RefactoringException("renamed variable's scope would intersect with other variable of same name");
	}
  /**
   * @ast method 
   * 
   */
  public VariableDeclaration() {
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
    children = new ASTNode[3];
    setChild(new Opt(), 2);
  }
  /**
   * @ast method 
   * 
   */
  public VariableDeclaration(Modifiers p0, Access p1, String p2, Opt<Expr> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
  }
  /**
   * @ast method 
   * 
   */
  public VariableDeclaration(Modifiers p0, Access p1, beaver.Symbol p2, Opt<Expr> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 3;
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
   * Replaces the Modifiers child.
   * @param node The new node to replace the Modifiers child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setModifiers(Modifiers node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Modifiers child.
   * @return The current node used as the Modifiers child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Modifiers getModifiers() {
    return (Modifiers)getChild(0);
  }
  /**
   * Retrieves the Modifiers child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Modifiers child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Modifiers getModifiersNoTransform() {
    return (Modifiers)getChildNoTransform(0);
  }
  /**
   * Replaces the TypeAccess child.
   * @param node The new node to replace the TypeAccess child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeAccess(Access node) {
    setChild(node, 1);
  }
  /**
   * Retrieves the TypeAccess child.
   * @return The current node used as the TypeAccess child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Access getTypeAccess() {
    return (Access)getChild(1);
  }
  /**
   * Retrieves the TypeAccess child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the TypeAccess child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Access getTypeAccessNoTransform() {
    return (Access)getChildNoTransform(1);
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__VariableDeclaration_setID(String value) {
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
   * Replaces the optional node for the Init child. This is the {@code Opt} node containing the child Init, not the actual child!
   * @param opt The new node to be used as the optional node for the Init child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setInitOpt(Opt<Expr> opt) {
    setChild(opt, 2);
  }
  /**
   * Check whether the optional Init child exists.
   * @return {@code true} if the optional Init child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasInit() {
    return getInitOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Init child.
   * @return The Init child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr getInit() {
    return (Expr)getInitOpt().getChild(0);
  }
  /**
   * Replaces the (optional) Init child.
   * @param node The new node to be used as the Init child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setInit(Expr node) {
    getInitOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Expr> getInitOpt() {
    return (Opt<Expr>)getChild(2);
  }
  /**
   * Retrieves the optional node for child Init. This is the {@code Opt} node containing the child Init, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Init.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Expr> getInitOptNoTransform() {
    return (Opt<Expr>)getChildNoTransform(2);
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1037
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__VariableDeclaration_setID(oldValue);
				}
				@Override
				public String toString() {
					return "VariableDeclaration.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__VariableDeclaration_setID(value);
				}
			});
		}
		refined__VariableDeclaration_setID(value);
	}
  /**
   * @attribute syn
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:97
   */
  public int size() {
    ASTNode$State state = state();
    try {  return 1;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:98
   */
  public boolean isEmpty() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:102
   */
  public boolean contains(Object o) {
    ASTNode$State state = state();
    try {  return this == o;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:91
   */
  public boolean isBlankFinal() {
    ASTNode$State state = state();
    try {  return isFinal() && (!hasInit() || !getInit().isConstant());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:92
   */
  public boolean isValue() {
    ASTNode$State state = state();
    try {  return isFinal() && hasInit() && getInit().isConstant();  }
    finally {
    }
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:492
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
  private boolean isDAafter_compute(Variable v) {
    if(v == this)
      return hasInit();
    return hasInit() ? getInit().isDAafter(v) : isDAbefore(v);
  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:875
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
  private boolean isDUafter_compute(Variable v) {
    if(v == this)
      return !hasInit();
    return hasInit() ? getInit().isDUafter(v) : isDUbefore(v);
  }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:129
   */
  public boolean declaresVariable(String name) {
    ASTNode$State state = state();
    try {  return name().equals(name);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:219
   */
  public boolean isSynthetic() {
    ASTNode$State state = state();
    try {  return getModifiers().isSynthetic();  }
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
    try {  return getClass().getName() + " [" + getID() + "]";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:252
   */
  public TypeDecl type() {
    ASTNode$State state = state();
    try {  return getTypeAccess().type();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:13
   */
  public boolean isParameter() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:15
   */
  public boolean isClassVariable() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:16
   */
  public boolean isInstanceVariable() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:17
   */
  public boolean isMethodParameter() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:18
   */
  public boolean isConstructorParameter() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:19
   */
  public boolean isExceptionHandlerParameter() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:20
   */
  public boolean isLocalVariable() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:22
   */
  public boolean isFinal() {
    ASTNode$State state = state();
    try {  return getModifiers().isFinal();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:23
   */
  public boolean isVolatile() {
    ASTNode$State state = state();
    try {  return getModifiers().isVolatile();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:24
   */
  public boolean isBlank() {
    ASTNode$State state = state();
    try {  return !hasInit();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:25
   */
  public boolean isStatic() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:27
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
  protected boolean constant_computed = false;
  /**
   * @apilevel internal
   */
  protected Constant constant_value;
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Constant constant() {
    if(constant_computed) {
      return constant_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    constant_value = constant_compute();
      if(isFinal && num == state().boundariesCrossed) constant_computed = true;
    return constant_value;
  }
  /**
   * @apilevel internal
   */
  private Constant constant_compute() {  return type().cast(getInit().constant());  }
  /**
   * @apilevel internal
   */
  protected boolean sourceVariableDecl_computed = false;
  /**
   * @apilevel internal
   */
  protected Variable sourceVariableDecl_value;
  /**
   * @attribute syn
   * @aspect SourceDeclarations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1520
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Variable sourceVariableDecl() {
    if(sourceVariableDecl_computed) {
      return sourceVariableDecl_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceVariableDecl_value = sourceVariableDecl_compute();
      if(isFinal && num == state().boundariesCrossed) sourceVariableDecl_computed = true;
    return sourceVariableDecl_value;
  }
  /**
   * @apilevel internal
   */
  private Variable sourceVariableDecl_compute() {  return this;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:522
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
  private SmallSet<CFGNode> succ_compute() {  return hasInit() ? SmallSet.<CFGNode>singleton(getInit().first()) : following();  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:86
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return mayAlias(l) && isInitialised();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:87
   */
  public boolean isBlockingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return mustAlias(l);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:88
   */
  public boolean isReachedUseFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:143
   */
  public boolean isInitialised() {
    ASTNode$State state = state();
    try {  return hasInit() || getParent() instanceof EnhancedForStmt;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:4
   */
  public Variable refreshVariable() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:16
   */
  public boolean mayBeFinal() {
    ASTNode$State state = state();
    try {
		for(VarAccess va : uses())
			if(va.isDest() && (this.hasInit() || !va.isDUbefore(this)))
				return false;
		return true;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:6
   */
  public boolean shouldBeFinal() {
    ASTNode$State state = state();
    try {
		if(isClassVariable() || isInstanceVariable())
			return false;
		for(VarAccess va : uses())
			if(va.hostType() != this.hostType())
				return true;
		return false;
	}
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:21
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    ASTNode$State state = state();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:294
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableScope outerScope() {
    ASTNode$State state = state();
    VariableScope outerScope_value = getParent().Define_VariableScope_outerScope(this, null);
    return outerScope_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:588
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl hostType() {
    ASTNode$State state = state();
    TypeDecl hostType_value = getParent().Define_TypeDecl_hostType(this, null);
    return hostType_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:137
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @attribute inh
   * @aspect PromoteTempToField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PromoteTempToField/PromoteTempToField.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inStaticContext() {
    ASTNode$State state = state();
    boolean inStaticContext_value = getParent().Define_boolean_inStaticContext(this, null);
    return inStaticContext_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:122
   */
  @SuppressWarnings({"unchecked", "cast"})
  public UnknownVarAccess unknownVarAccess() {
    ASTNode$State state = state();
    UnknownVarAccess unknownVarAccess_value = getParent().Define_UnknownVarAccess_unknownVarAccess(this, null);
    return unknownVarAccess_value;
  }
  /**
   * @attribute inh
   * @aspect VarNesting
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:12
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean canIntroduceLocal(String name) {
    ASTNode$State state = state();
    boolean canIntroduceLocal_String_value = getParent().Define_boolean_canIntroduceLocal(this, null, name);
    return canIntroduceLocal_String_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:40
   * @apilevel internal
   */
  public boolean Define_boolean_isSource(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_isSource(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:497
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getInitOptNoTransform()) {
      return isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:880
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getInitOptNoTransform()) {
      return isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:286
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeFinal(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeFinal(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:85
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getTypeAccessNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:261
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_declType(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return type();
    }
    else {      return getParent().Define_TypeDecl_declType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:92
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    if(caller == getModifiersNoTransform()) {
      return name.equals("LOCAL_VARIABLE");
    }
    else {      return getParent().Define_boolean_mayUseAnnotationTarget(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:34
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_assignConvertedType(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return type();
    }
    else {      return getParent().Define_TypeDecl_assignConvertedType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:529
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getTypeAccessNoTransform()) {
      return SmallSet.empty();
    }
    else if(caller == getInitOptNoTransform()) {
      return following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:526
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:527
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return following();
    }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:42
   * @apilevel internal
   */
  public boolean Define_boolean_inInextractiblePosition(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_inInextractiblePosition(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:9
   * @apilevel internal
   */
  public Variable Define_Variable_getModifiedVariable(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return this;
    }
    else {      return getParent().Define_Variable_getModifiedVariable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:53
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return Integer.MAX_VALUE;
    }
    else if(caller == getTypeAccessNoTransform()) {
      return 0;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
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
  protected boolean VariableDeclaration_uses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<VarAccess> VariableDeclaration_uses_value;
  /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:23
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<VarAccess> uses() {
    if(VariableDeclaration_uses_computed) {
      return VariableDeclaration_uses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    VariableDeclaration_uses_value = uses_compute();
      if(isFinal && num == state().boundariesCrossed) VariableDeclaration_uses_computed = true;
    return VariableDeclaration_uses_value;
  }
  java.util.Set VariableDeclaration_uses_contributors;
  public java.util.Set VariableDeclaration_uses_contributors() {
    if(VariableDeclaration_uses_contributors == null) VariableDeclaration_uses_contributors  = new ASTNode$State.IdentityHashSet(4);
    return VariableDeclaration_uses_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<VarAccess> uses_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof BodyDecl))
      node = node.getParent();
    BodyDecl root = (BodyDecl)node;
    root.collect_contributors_VariableDeclaration_uses();
    VariableDeclaration_uses_value = new HashSet<VarAccess>();
    if(VariableDeclaration_uses_contributors != null)
    for(java.util.Iterator iter = VariableDeclaration_uses_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_VariableDeclaration_VariableDeclaration_uses(VariableDeclaration_uses_value);
    }
    return VariableDeclaration_uses_value;
  }

}
