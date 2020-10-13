/* This file was generated with JastAdd2 (http://jastadd.org) version R20130212 (r1031) */
package AST;

import java.util.HashSet;
import java.io.File;
import java.util.*;

import beaver.*;

import java.util.ArrayList;
import java.util.zip.*;
import java.io.*;
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
import tests.jdolly.ConditionsPushDownField;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * @production VarAccess : {@link Access} ::= <span class="component">&lt;ID:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:19
 */
public class VarAccess extends Access implements Cloneable, LockableName {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isConstant_visited = -1;
    isConstant_computed = false;
    isConstant_initialized = false;
    isDAafter_Variable_values = null;
    decls_computed = false;
    decls_value = null;
    decl_computed = false;
    decl_value = null;
    isFieldAccess_computed = false;
    type_computed = false;
    type_value = null;
    getLocation_computed = false;
    getLocation_value = null;
    succ_computed = false;
    succ_value = null;
    getMonitor_computed = false;
    getMonitor_value = null;
    computeType_int_values = null;
    possibleTypes_computed = false;
    possibleTypes_value = null;
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
  public VarAccess clone() throws CloneNotSupportedException {
    VarAccess node = (VarAccess)super.clone();
    node.isConstant_visited = -1;
    node.isConstant_computed = false;
    node.isConstant_initialized = false;
    node.isDAafter_Variable_values = null;
    node.decls_computed = false;
    node.decls_value = null;
    node.decl_computed = false;
    node.decl_value = null;
    node.isFieldAccess_computed = false;
    node.type_computed = false;
    node.type_value = null;
    node.getLocation_computed = false;
    node.getLocation_value = null;
    node.succ_computed = false;
    node.succ_value = null;
    node.getMonitor_computed = false;
    node.getMonitor_value = null;
    node.computeType_int_values = null;
    node.possibleTypes_computed = false;
    node.possibleTypes_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VarAccess copy() {
    try {
      VarAccess node = (VarAccess) clone();
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
  public VarAccess fullCopy() {
    VarAccess tree = (VarAccess) copy();
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
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:94
   */
  public void definiteAssignment() {
    if(isSource()) {
      if(decl() instanceof VariableDeclaration) {
        VariableDeclaration v = (VariableDeclaration)decl();
        //System.err.println("Is " + v + " final? " + v.isFinal() + ", DAbefore: " + isDAbefore(v));
        if(v.isValue()) {
        }
        else if(v.isBlankFinal()) {
          //if(!isDAbefore(v) && !v.hasInit() && !v.getInit().isConstant())
          if(!isDAbefore(v))
            error("Final variable " + v.name() + " is not assigned before used");
        }
        else {
          //if(!v.hasInit() && !isDAbefore(v)) {
          if(!isDAbefore(v))
            error("Local variable " + v.name() + " is not assigned before used");
        }
      }
      
      else if(decl() instanceof FieldDeclaration && !isQualified()) {
        FieldDeclaration f = (FieldDeclaration)decl();
        //if(f.isFinal() && f.isInstanceVariable() && !isDAbefore(f)) {
        //if(f.isFinal() && !isDAbefore(f) && (!f.hasInit() || !f.getInit().isConstant())) {
        //if(f.isFinal() && (!f.hasInit() || !f.getInit().isConstant()) && !isDAbefore(f)) {
        if(f.isFinal() && !f.hasInit() && !isDAbefore(f)) {
          error("Final field " + f + " is not assigned before used");
        }
      }
      
    }
    if(isDest()) {
      Variable v = decl();
      // Blank final field
      if(v.isFinal() && v.isBlank() && !hostType().instanceOf(v.hostType()))
        error("The final variable is not a blank final in this context, so it may not be assigned.");
      else if(v.isFinal() && isQualified() && (!qualifier().isThisAccess() || ((Access)qualifier()).isQualified()))
        error("the blank final field " + v.name() + " may only be assigned by simple name");
      
      // local variable or parameter
      else if(v instanceof VariableDeclaration) {
        VariableDeclaration var = (VariableDeclaration)v;
        //System.out.println("### is variable");
        if(!var.isValue() && var.getParent().getParent().getParent() instanceof SwitchStmt && var.isFinal()) {
          if(!isDUbefore(var))
            error("Final variable " + var.name() + " may only be assigned once");
        }
        else if(var.isValue()) {
          if(var.hasInit() || !isDUbefore(var))
            error("Final variable " + var.name() + " may only be assigned once");
        }
        else if(var.isBlankFinal()) {
          if(var.hasInit() || !isDUbefore(var))
            error("Final variable " + var.name() + " may only be assigned once");
        }
        if(var.isFinal() && (var.hasInit() || !isDUbefore(var))) {
        //if(var.isFinal() && ((var.hasInit() && var.getInit().isConstant()) || !isDUbefore(var))) {
        }
      }
      // field
      else if(v instanceof FieldDeclaration) {
        FieldDeclaration f = (FieldDeclaration)v;
        if(f.isFinal()) {
          if(f.hasInit())
            error("initialized field " + f.name() + " can not be assigned");
          else {
            BodyDecl bodyDecl = enclosingBodyDecl();
            if(!(bodyDecl instanceof ConstructorDecl) && !(bodyDecl instanceof InstanceInitializer) && !(bodyDecl instanceof StaticInitializer) && !(bodyDecl instanceof FieldDeclaration))
              error("final field " + f.name() + " may only be assigned in constructors and initializers");
            else if(!isDUbefore(f))
              error("Final field " + f.name() + " may only be assigned once");
          }
        }
      }
      else if(v.isParameter()) {
        // 8.4.1
        if(v.isFinal()) {
          error("Final parameter " + v.name() + " may not be assigned");
        }
      }
      
    }
  }
  /**
   * @ast method 
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:457
   */
  protected boolean checkDUeverywhere(Variable v) {
    if(isDest() && decl() == v)
      return false;
    return super.checkDUeverywhere(v);
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:182
   */
  public void nameCheck() {
    if(decls().isEmpty() && (!isQualified() || !qualifier().type().isUnknown() || qualifier().isPackageAccess()))
      error("no field named " + name() + " is accessible");
    if(decls().size() > 1) {
      StringBuffer s = new StringBuffer();
      s.append("several fields named " + name());
      for(Iterator iter = decls().iterator(); iter.hasNext(); ) {
        Variable v = (Variable)iter.next();
        s.append("\n    " + v.type().typeName() + "." + v.name() + " declared in " + v.hostType().typeName());
      }
      error(s.toString());
    }
      
    // 8.8.5.1
    if(inExplicitConstructorInvocation() && !isQualified() && decl().isInstanceVariable() && hostType() == decl().hostType())
      error("instance variable " + name() + " may not be accessed in an explicit constructor invocation");

    Variable v = decl();
    if(!v.isFinal() && !v.isClassVariable() && !v.isInstanceVariable() && v.hostType() != hostType())
      error("A parameter/variable used but not declared in an inner class must be declared final");

    // 8.3.2.3
    if((decl().isInstanceVariable() || decl().isClassVariable()) && !isQualified()) {
      if(hostType() != null && !hostType().declaredBeforeUse(decl(), this)) {
        if(inSameInitializer() && !simpleAssignment() && inDeclaringClass()) {
          BodyDecl b = closestBodyDecl(hostType());
          error("variable " + decl().name() + " is used in " + b + " before it is declared");
        }
      }
    }

  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:216
   */
  public BodyDecl closestBodyDecl(TypeDecl t) {
    ASTNode node = this;
    while(!(node.getParent().getParent() instanceof Program) && node.getParent().getParent() != t) {
      node = node.getParent();
    }
    if(node instanceof BodyDecl)
      return (BodyDecl)node;
    return null;
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:38
   */
  public VarAccess(String name, int start, int end) {
    this(name);
    this.start = this.IDstart = start;
    this.end = this.IDend = end;
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:453
   */
  public void refined_PrettyPrint_VarAccess_toString(StringBuffer s) {
    s.append(name());
  }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:344
   */
  public void checkModifiers() {
    if(decl() instanceof FieldDeclaration) {
      FieldDeclaration f = (FieldDeclaration)decl();
      if(f.isDeprecated() &&
        !withinDeprecatedAnnotation() &&
        hostType().topLevelType() != f.hostType().topLevelType() &&
        !withinSuppressWarnings("deprecation"))
          warning(f.name() + " in " + f.hostType().typeName() + " has been deprecated");
    }
  }
  /**
   * @ast method 
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:461
   */
  protected void checkEnum(EnumDecl enumDecl) {
    super.checkEnum(enumDecl);
    if(decl().isStatic() && decl().hostType() == enumDecl && !isConstant())
      error("may not reference a static field of an enum type from here");
  }
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:222
   */
  public Access getDestLocation() {
		return this;
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:20
   */
  public SmallSet<CFGNode> reachingDefinitions() {
		if(decl().isField()) {
			FieldDeclaration fd = (FieldDeclaration)decl();
			if(fd.isConstant() && fd.hasInit())
				return SmallSet.<CFGNode>singleton(fd);
		}
		return super.reachingDefinitions();
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:41
   */
  public SmallSet<Access> reachedUses() {
		if(isDest() && decl().isLocalVariable() && decl().isFinal()) {
			SmallSet<Access> res = SmallSet.<Access>empty();
			for(VarAccess u : decl().allUses())
				if(u.isSource())
					res = res.union(u);
			return res;
		} else {
			return super.reachedUses();
		}
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:148
   */
  public boolean hasReachingDefinitionBefore(CFGNode n) {
		Location l = getLocation();
		if(!isSource() || l == null)
			return false;
		// we don't want the node to be its own reaching definition
		for(CFGNode pred : pred())
			if(pred.hasReachingDefinitionBefore(l, n))
				return true;
		return false;
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:188
   */
  public boolean hasReachedUseAfter(CFGNode n) {
		Location l = getLocation();
		if(!isDest() || l == null)
			return false;
		// we don't want the node to be its own reached use
		for(CFGNode succ : succ())
			if(succ.hasReachedUseAfter(l, n))
				return true;
		return false;
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:220
   */
  public boolean mayRef(Variable v) {
		return decl() == v;
	}
  /**
   * @ast method 
   * @aspect LocalVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/LocalVariable.jrag:25
   */
  public void varAccesses(java.util.Set<VarAccess> res) {
		res.add(this);
		super.varAccesses(res);
	}
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:26
   */
  protected void collectAccessibilityConstraints(Collection<AccessibilityConstraint> res) {
		// (Acc-1)
		if(decl().isField()) {
			FieldDeclaration fd = (FieldDeclaration)decl();
			res.add(new AccessibilityConstraint(this, fd.minAccess(this), fd));
			if(isQualified()) {
				// (Acc-2), see JLS 6.6.2.1
				if(!decl().isStatic() && !qualifier().isSuperAccess()) {
					TypeDecl C = fd.hostType();
					TypeDecl S = hostType().withinBodyThatSubclasses(C);
					if(fd.minAccess(hostPackage(), hostType()) == ASTNode.VIS_PROTECTED &&
					   S != null && !qualifier().type().instanceOf(S))
						res.add(new AccessibilityConstraint(this, fd, Operator.EQ, AccessModifierConstant.PUBLIC));
				}
				// (Inh-1)
				res.add(new AccessibilityConstraint(this, ((FieldDeclaration)decl()).minAccess(qualifier().type().hostPackage(), qualifier().type()),
													      Operator.LE, ((FieldDeclaration)decl())));
			}
		}
	}
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:34
   */
  public void lockDataFlow() {
		lockReachingDefs();
		super.lockDataFlow();
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:58
   */
  public void expatiateQualifiers() {
		if(decl().isInstanceVariable() && !isQualified()) {
			SymbolicVarAccess acc = accessVariable(decl());
			assert(acc != null && acc instanceof SymbolicFieldAccess);
			Expr qual = ((SymbolicFieldAccess)acc).getBend().createLockedAccess().qualifiesAccess(new ThisAccess(true));
			replace(this).with(qual.qualifiesAccess(this));
			flushCaches();
		}
		super.expatiateQualifiers();
	}
  /**
   * @ast method 
   * @aspect InlineConstant
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineConstant.jrag:12
   */
  public void inlineConstant() {
		if(!decl().isField() || !decl().isFinal() || !decl().isStatic())
			throw new RefactoringException("not a use of a constant");
		FieldDeclaration cnst = (FieldDeclaration)decl();
		if(!cnst.hasInit())
			throw new RefactoringException("no initialiser");
		if(cnst.isEnumConstant())
			throw new RefactoringException("cannot inline enum constant");
		bundleQualifier();
		if(isQualified() && !qualifier().isPure())
			throw new RefactoringException("cannot discard impure qualifier");
		Expr p = this;
		if(isQualified())
			p = (Expr)p.getParent();
		Expr init = cnst.getInit();
		init.lockAllNames();
		init.lockDataFlow();
		cnst.setInit((Expr)init.fullCopyAndDetach());
		p.replaceWith(init.precedence() > p.maxPrecedence() ? new ParExpr(init) : init);
	}
  /**
   * @ast method 
   * @aspect InlineConstant
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineConstant.jrag:39
   */
  public void doInlineConstant() {
		inlineConstant();
		programRoot().eliminate(LOCKED_NAMES, LOCKED_DATAFLOW);
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:160
   */
  public void collectAllDecls(Collection<Declaration> res) {
		res.add(decl());
		super.collectAllDecls(res);
	}
  /**
   * @ast method 
   * @aspect UnfoldAssign
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/UnfoldAssign.jrag:3
   */
  public void unfoldAbbrevAssign(ArrayList<VarAccess> uses) {
		bundleQualifier();
		flushCaches();
		if(isQualified() && !qualifier().isPure())
			return;
		Access unqual = isQualified() ? (Access)getParent() : this;
		ASTNode p = unqual.getParent();
		if(p instanceof PreIncExpr || p instanceof PostIncExpr && p.getParent() instanceof ExprStmt) {
			Access unqual_copy = (Access)unqual.fullCopyAndDetach();
			p.replaceWith(new AssignSimpleExpr(unqual, new AddExpr(unqual_copy, new IntegerLiteral("1"))));
			uses.add((VarAccess)unqual_copy.lastAccess());
		} else if(p instanceof PreDecExpr || p instanceof PostDecExpr && p.getParent() instanceof ExprStmt) {
			Access unqual_copy = (Access)unqual.fullCopyAndDetach();
			p.replaceWith(new AssignSimpleExpr(unqual, new SubExpr(unqual_copy, new IntegerLiteral("1"))));
			uses.add((VarAccess)unqual_copy.lastAccess());
		} else if(p instanceof AssignExpr && !(p instanceof AssignSimpleExpr)) {
			Access unqual_copy = ((AssignExpr)p).unfold();
			if(unqual_copy != null)
				uses.add((VarAccess)unqual_copy.lastAccess());
		}
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:229
   */
  public void eliminateWith(List<Access> qualifiers, TypeDecl hostType) {
		enclosingBodyDecl().flushCaches();
		if(!isQualified() && decl() instanceof FieldDeclaration && !decl().isStatic()) {
			for(int i=qualifiers.getNumChild()-1;i>=0;i--) {
				Access qual = qualifiers.getChild(i);
				if(qual.type().subtype(decl().hostType())) {
					if(!((FieldDeclaration)decl()).accessibleFrom(hostType))
						throw new RefactoringException("field not accessible");
					qualifyWith((Expr)qual.fullCopyAndDetach());
					flushCaches();
					super.eliminateWith(qualifiers, hostType);
					return;
				}
			}
			throw new RefactoringException("cannot eliminate with");
		}
		super.eliminateWith(qualifiers, hostType);
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:4
   */
  
	/* A locked variable access is a variable access that does not obey the normal variable lookup
	 * rules, but instead immediately binds to its target. */
	private Variable targetVariable = null;
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:5
   */
  private void refined_LockedVariableAccess_VarAccess_setTargetVariable(Variable var) {
		targetVariable = var;
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:41
   */
  public ASTNode lockNames(Collection<String> endangered) {
		if(endangered.contains(name()))
			return lock();
		else
			return super.lockNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:48
   */
  public ASTNode lock() {
		return targetVariable == null ? lock(decl()) : this;
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:52
   */
  public ASTNode lock(Variable target) {
		assert target != null;
		setTargetVariable(target);
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:63
   */
  public boolean isLocked() { return targetVariable != null; }
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:67
   */
  public void eliminateLockedNames() {
		if(targetVariable != null)
			unlock();
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:72
   */
  public Access unlock() {
		Expr qual = getQualifier();
		assert (qual==null || (parentDot() != null && qual == parentDot().getLeft()));
		Variable target = targetVariable.refresh();
		setTargetVariable(null);
		flushCache();
		if(fromSource())
			setID(target.name());
		if(decl().equals(target)) {
			return this;
		} else if(!fromSource()) {
			throw new RefactoringException("cannot fix variable access in compiled code");
		} else {
			return unlock(qual, target);
		}
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:89
   */
  public Access unlock(Expr qual, Variable target) {
		if((qual == null ? inStaticContext() : qual.staticContextQualifier()) && target.isField() && !target.isStatic())
			throw new RefactoringException("cannot access instance variable in static context");
		SymbolicVarAccess acc = accessVariable(target);
		if(acc.isUnknownVarAccess()) {
			if((qual == null || qual.isPure()) && target.isStatic()) {
				TypeDecl host = target.hostType();
				if(host.accessibleFrom(hostType()) && mayAccess((FieldDeclaration)target)) {
					this.flushCache();
					Access hostAccess = host.createLockedAccess();
					affectedByUnlock(hostAccess, this);
					return (Access) replace(qual!=null ? parentDot() : this).with(hostAccess.qualifiesAccess(this));
				}
			} else if(qual != null && (qual.isThisAccess() || qual.isSuperAccess())) {
				acc = parentDot().accessVariable(target);
				if(acc != null && !acc.isUnknownVarAccess())
					return acc.accessByModifyingAccess(this);
			}
			if (ConditionsPushDownField.cond3 && ConditionsJRRTInputs.ConditionsPullUpMethod.cond8.isEnabled()) {
				throw new RefactoringException("cannot access variable "+target.name());
			}
		}
		return acc.accessByModifyingAccess(this);
	}
  /**
   * @ast method 
   * @aspect AddRequiredMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/AddRequiredMembers.jrag:18
   */
  public void addRequiredMembers(TypeDecl host, java.util.Set<MethodDecl> meths, java.util.Set<FieldDeclaration> fds, java.util.Set<MemberTypeDecl> mtds) {
		if(decl().isInstanceVariable() && ((FieldDeclaration)decl()).hostType() == host)
			fds.add((FieldDeclaration)decl().sourceVariableDecl());
		super.addRequiredMembers(host, meths, fds, mtds);
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:149
   */
  public VarAccess lockedCopy() {
		VarAccess res = (VarAccess)super.lockedCopy();
		res.lock(decl());
		return res;
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:214
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(decl() instanceof VariableArityParameterDeclaration)
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "variable arity parameter access", this, Operator.EQ, type()));
		else
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "variable access", this, Operator.EQ, decl().getTypeAccess()));
		if(isQualified())
			if(qualifier().type().isSubtypeConstrainable())
				addConstraint(constraints, pred, new SimpleTypeConstraint(this, "field access", qualifier(), Operator.LE, (FieldDeclaration)decl()));
		super.collectTypeConstraints(pred, constraints);
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
  public VarAccess() {
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
  public VarAccess(String p0) {
    setID(p0);
  }
  /**
   * @ast method 
   * 
   */
  public VarAccess(beaver.Symbol p0) {
    setID(p0);
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
  public void refined__VarAccess_setID(String value) {
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
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:30
   */
    public void toString(StringBuffer s) {
		if(targetVariable == null) {
			refined_PrettyPrint_VarAccess_toString(s);
		} else {
			s.append("[[");
			refined_PrettyPrint_VarAccess_toString(s);
			s.append("]]");
		}
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:23
   */
    protected void collectFieldUsesWithCopies(FieldDeclaration decl, String name, ArrayList<VarAccess> col) {
		super.collectFieldUsesWithCopies(decl, name, col);
		if (targetVariable != null && targetVariable.sourceVariableDecl() == decl.sourceVariableDecl() 
				|| (name.equals(name()) && decl().sourceVariableDecl() == decl.sourceVariableDecl()))
			col.add(this);
	}
  /**
   * @ast method 
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:17
   */
    protected void collectFieldUses(FieldDeclaration decl, String name, Collection<VarAccess> col) {
		super.collectFieldUses(decl, name, col);
		if (targetVariable == decl || (name.equals(name()) && decl() == decl))
			col.add(this);
	}
  /**
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:165
   */
    private void setTargetVariable(final Variable var) {
		final Variable saved = targetVariable;
		refined_LockedVariableAccess_VarAccess_setTargetVariable(var);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				
				@Override
				public void undo() {
					targetVariable = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedVariableAccess_VarAccess_setTargetVariable(var);
				}
				
				@Override
				public String toString() {
					return "VarAccess.setTargetVariable";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:3
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__VarAccess_setID(oldValue);
				}
				@Override
				public String toString() {
					return "VarAccess.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__VarAccess_setID(value);
				}
			});
		}
		refined__VarAccess_setID(value);
	}
  /**
   * @ast method 
   * @aspect VariableScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:241
   */
  private SimpleSet refined_VariableScopePropagation_VarAccess_decls()
{
    SimpleSet set = lookupVariable(name());
    if(set.size() == 1) {
      Variable v = (Variable)set.iterator().next();
      if(!isQualified() && inStaticContext()) {
        if(v.isInstanceVariable() && !hostType().memberFields(v.name()).isEmpty())
          return SimpleSet.emptySet;
      }
      else if(isQualified() && qualifier().staticContextQualifier()) {
        if(v.isInstanceVariable())
          return SimpleSet.emptySet;
      }
    }
    return set;
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:98
   */
  public Constant constant() {
    ASTNode$State state = state();
    try {  return type().cast(decl().getInit().constant());  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected int isConstant_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean isConstant_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isConstant_initialized = false;
  /**
   * @apilevel internal
   */
  protected boolean isConstant_value;
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:500
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isConstant() {
    if(isConstant_computed) {
      return isConstant_value;
    }
    ASTNode$State state = state();
    if (!isConstant_initialized) {
      isConstant_initialized = true;
      isConstant_value = false;
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
    int num = state.boundariesCrossed;
    boolean isFinal = this.is$Final();
      do {
        isConstant_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        boolean new_isConstant_value = isConstant_compute();
        if (new_isConstant_value!=isConstant_value)
          state.CHANGE = true;
        isConstant_value = new_isConstant_value; 
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
      isConstant_computed = true;
      }
      else {
      state.RESET_CYCLE = true;
      isConstant_compute();
      state.RESET_CYCLE = false;
        isConstant_computed = false;
        isConstant_initialized = false;
      }
      state.IN_CIRCLE = false; 
      return isConstant_value;
    }
    if(isConstant_visited != state.CIRCLE_INDEX) {
      isConstant_visited = state.CIRCLE_INDEX;
      if (state.RESET_CYCLE) {
        isConstant_computed = false;
        isConstant_initialized = false;
        isConstant_visited = -1;
        return isConstant_value;
      }
      boolean new_isConstant_value = isConstant_compute();
      if (new_isConstant_value!=isConstant_value)
        state.CHANGE = true;
      isConstant_value = new_isConstant_value; 
      return isConstant_value;
    }
    return isConstant_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isConstant_compute() {
    Variable v = decl();
    if(v instanceof FieldDeclaration) {
      FieldDeclaration f = (FieldDeclaration)v;
      return f.isConstant() && (!isQualified() || (isQualified() && qualifier().isTypeAccess()));
    }
    boolean result = v.isFinal() && v.hasInit() && v.getInit().isConstant() && (v.type().isPrimitive() || v.type().isString());
    return result && (!isQualified() || (isQualified() && qualifier().isTypeAccess()));
  }
  /**
   * @attribute syn
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:58
   */
  public Variable varDecl() {
    ASTNode$State state = state();
    try {  return decl();  }
    finally {
    }
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:351
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
  private boolean isDAafter_compute(Variable v) {  return isDAbefore(v);  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:832
   */
  public boolean isDUafter(Variable v) {
    ASTNode$State state = state();
    try {  return isDUbefore(v);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:1196
   */
  public boolean unassignedEverywhere(Variable v, TryStmt stmt) {
    ASTNode$State state = state();
    try {
    if(isDest() && decl() == v && enclosingStmt().reachable()) {
      return false;
    }
    return super.unassignedEverywhere(v, stmt);
  }
    finally {
    }
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
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:15
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
  private SimpleSet decls_compute() {  return targetVariable == null ? refined_VariableScopePropagation_VarAccess_decls() : SimpleSet.emptySet.add(targetVariable);  }
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
   * @aspect VariableScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:256
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
  private Variable decl_compute() {
    SimpleSet decls = decls();
    if(decls.size() == 1)
      return (Variable)decls.iterator().next();
    return unknownField();
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:226
   */
  public boolean inSameInitializer() {
    ASTNode$State state = state();
    try {
    BodyDecl b = closestBodyDecl(decl().hostType());
    if(b == null) return false;
    if(b instanceof FieldDeclaration && ((FieldDeclaration)b).isStatic() == decl().isStatic())
      return true;
    if(b instanceof InstanceInitializer && !decl().isStatic())
      return true;
    if(b instanceof StaticInitializer && decl().isStatic())
      return true;
    return false;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:238
   */
  public boolean simpleAssignment() {
    ASTNode$State state = state();
    try {  return isDest() && getParent() instanceof AssignSimpleExpr;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:240
   */
  public boolean inDeclaringClass() {
    ASTNode$State state = state();
    try {  return hostType() == decl().hostType();  }
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
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:17
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
  protected boolean isFieldAccess_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isFieldAccess_value;
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:23
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isFieldAccess() {
    if(isFieldAccess_computed) {
      return isFieldAccess_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isFieldAccess_value = isFieldAccess_compute();
      if(isFinal && num == state().boundariesCrossed) isFieldAccess_computed = true;
    return isFieldAccess_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isFieldAccess_compute() {  return decl().isClassVariable() || decl().isInstanceVariable();  }
  /**
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:56
   */
  public NameType predNameType() {
    ASTNode$State state = state();
    try {  return NameType.AMBIGUOUS_NAME;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean type_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl type_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:283
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl type() {
    if(type_computed) {
      return type_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    type_value = type_compute();
      if(isFinal && num == state().boundariesCrossed) type_computed = true;
    return type_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl type_compute() {  return decl().type();  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:15
   */
  public boolean isVariable() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:500
   */
  public boolean isEnumConstant() {
    ASTNode$State state = state();
    try {  return varDecl() instanceof EnumConstant;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean getLocation_computed = false;
  /**
   * @apilevel internal
   */
  protected Location getLocation_value;
  /**
   * @attribute syn
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:105
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Location getLocation() {
    if(getLocation_computed) {
      return getLocation_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getLocation_value = getLocation_compute();
      if(isFinal && num == state().boundariesCrossed) getLocation_computed = true;
    return getLocation_value;
  }
  /**
   * @apilevel internal
   */
  private Location getLocation_compute() {
		Variable decl = decl();
		BodyDecl host = hostBodyDecl();
		if(decl.isInstanceVariable() && host instanceof MethodDecl && 
				(!isQualified() || qualifier().isThisAccess() || qualifier().isSuperAccess()))
			return new FieldInReceiver((MethodDecl)host, (FieldDeclaration)decl);
		return decl;
	}
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {
		if(!isDest())
			return this;
		AssignExpr assgn = modifyingAssignExpr();
		if(assgn == null)
			return this;
		return assgn.getSource().first();
	}
    finally {
    }
  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:172
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
  private SmallSet<CFGNode> succ_compute() {
		if(!isDest())
			return following();
		AssignExpr assgn = modifyingAssignExpr();
		if(assgn == null)
			return following();
		return SmallSet.<CFGNode>singleton(assgn);
	}
  /**
   * @attribute syn
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:45
   */
  public boolean isFieldAccessInThis(FieldDeclaration fd) {
    ASTNode$State state = state();
    try {  return decl() == fd;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:13
   */
  public boolean isAcquire() {
    ASTNode$State state = state();
    try {  return isSource() && decl().isVolatile();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:14
   */
  public boolean isRelease() {
    ASTNode$State state = state();
    try {  return isDest() && decl().isVolatile();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:17
   */
  public boolean isMemoryAction() {
    ASTNode$State state = state();
    try {  return decl().isField();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean getMonitor_computed = false;
  /**
   * @apilevel internal
   */
  protected Monitor getMonitor_value;
  /**
   * @attribute syn
   * @aspect Monitor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/Monitor.jrag:106
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Monitor getMonitor() {
    if(getMonitor_computed) {
      return getMonitor_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getMonitor_value = getMonitor_compute();
      if(isFinal && num == state().boundariesCrossed) getMonitor_computed = true;
    return getMonitor_value;
  }
  /**
   * @apilevel internal
   */
  private Monitor getMonitor_compute() {
		if(decl() instanceof FieldDeclaration) {
			FieldDeclaration fd = (FieldDeclaration)decl();
			if(/*for performance improvement: fd.type().isObject() &&*/ !fd.refEscapes())
				return new FieldMonitor(fd);
		}
		return super.getMonitor();
	}
  protected java.util.Map computeType_int_values;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:21
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl computeType(int i) {
    Object _parameters = Integer.valueOf(i);
    if(computeType_int_values == null) computeType_int_values = new java.util.HashMap(4);
    if(computeType_int_values.containsKey(_parameters)) {
      return (TypeDecl)computeType_int_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    TypeDecl computeType_int_value = computeType_compute(i);
      if(isFinal && num == state().boundariesCrossed) computeType_int_values.put(_parameters, computeType_int_value);
    return computeType_int_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl computeType_compute(int i) {
		if(i > 0 && decl() instanceof FieldDeclaration) {
			FieldDeclaration fd = (FieldDeclaration)decl();
			Collection<Expr> exprs = fd.assignedExprs();
			if(exprs == null) {
				return fd.type();
			} else {
				TypeDecl res = null;
				for(Expr e : exprs) {
					TypeDecl td = e.computeType(i-1);
					if(td.isAnonymous())
						continue;
					if(res == null) {
						res = td;
					} else if(res.subtype(td)) {
						res = td;
					} else {
						res = fd.type();
						break;
					}
				}
				return res == null ? fd.type() : res;
			}
		} else {
			return super.computeType(i);
		}
	}
  /**
   * @apilevel internal
   */
  protected boolean possibleTypes_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeDecl> possibleTypes_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:88
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeDecl> possibleTypes() {
    if(possibleTypes_computed) {
      return possibleTypes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    possibleTypes_value = possibleTypes_compute();
      if(isFinal && num == state().boundariesCrossed) possibleTypes_computed = true;
    return possibleTypes_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeDecl> possibleTypes_compute() {
		if(decl() instanceof FieldDeclaration) {
			Collection<TypeDecl> types = ((FieldDeclaration)decl()).possibleTypes();
			return types.isEmpty() ? super.possibleTypes() : types;
		} else {
			return super.possibleTypes();
		}
	}
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:122
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inExplicitConstructorInvocation() {
    ASTNode$State state = state();
    boolean inExplicitConstructorInvocation_value = getParent().Define_boolean_inExplicitConstructorInvocation(this, null);
    return inExplicitConstructorInvocation_value;
  }
  /**
   * @attribute inh
   * @aspect LockedVariableAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedVariableAccess.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl enclosingType() {
    ASTNode$State state = state();
    TypeDecl enclosingType_value = getParent().Define_TypeDecl_enclosingType(this, null);
    return enclosingType_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  protected void collect_contributors_VariableDeclaration_uses() {
    /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:25
   */
    if(decl() instanceof VariableDeclaration) {
    {
      VariableDeclaration ref = (VariableDeclaration)((VariableDeclaration)decl());
      if(ref != null)
        ref.VariableDeclaration_uses_contributors().add(this);
      }    }
    super.collect_contributors_VariableDeclaration_uses();
  }
  protected void collect_contributors_ParameterDeclaration_uses() {
    /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:31
   */
    if(decl() instanceof ParameterDeclaration) {
    {
      ParameterDeclaration ref = (ParameterDeclaration)((ParameterDeclaration)decl());
      if(ref != null)
        ref.ParameterDeclaration_uses_contributors().add(this);
      }    }
    super.collect_contributors_ParameterDeclaration_uses();
  }
  protected void contributeTo_VariableDeclaration_VariableDeclaration_uses(Collection<VarAccess> collection) {
    super.contributeTo_VariableDeclaration_VariableDeclaration_uses(collection);
    if(decl() instanceof VariableDeclaration)
      collection.add(this);
  }

  protected void contributeTo_ParameterDeclaration_ParameterDeclaration_uses(Collection<VarAccess> collection) {
    super.contributeTo_ParameterDeclaration_ParameterDeclaration_uses(collection);
    if(decl() instanceof ParameterDeclaration)
      collection.add(this);
  }

}
