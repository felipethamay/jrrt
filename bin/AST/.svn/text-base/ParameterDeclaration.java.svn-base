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
 * A parameter declaration as used in either method parameter lists
 * or as a catch clause parameter.
 * @production ParameterDeclaration : {@link ASTNode} ::= <span class="component">{@link Modifiers}</span> <span class="component">TypeAccess:{@link Access}</span> <span class="component">&lt;ID:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:91
 */
public class ParameterDeclaration extends ASTNode<ASTNode> implements Cloneable, SimpleSet, Iterator, Variable, CFGNode, LocalDeclaration {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    type_computed = false;
    type_value = null;
    sourceVariableDecl_computed = false;
    sourceVariableDecl_value = null;
    getParameterisedCallable_computed = false;
    getParameterisedCallable_value = null;
    isIn_computed = false;
    isOut_computed = false;
    isRef_computed = false;
    isWrite_computed = false;
    isRead_computed = false;
    exceptionalSucc_computed = false;
    exceptionalSucc_value = null;
    succ_computed = false;
    succ_value = null;
    dotLabel_computed = false;
    dotLabel_value = null;
    dotNode_computed = false;
    dotNode_value = null;
    reachingDefinitionsFor_Location_values = null;
    reachedUsesFor_Location_values = null;
    hasReachingDefinitionBefore_Location_CFGNode_values = null;
    hasReachedUseAfter_Location_CFGNode_values = null;
    weakSucc_computed = false;
    weakSucc_value = null;
    collect_BackwardEdge_CFGNode_values = null;
    collect_ForwardEdge_CFGNode_values = null;
    precedingDefsUpTo_CFGNode_values = null;
    isAnticipated_VariableDeclaration_values = null;
    makesAnticipated_VariableDeclaration_values = null;
    killsAnticipated_VariableDeclaration_values = null;
    isAvailable_ASTNode_values = null;
    following_computed = false;
    following_value = null;
    ParameterDeclaration_uses_computed = false;
    ParameterDeclaration_uses_value = null;
    ParameterDeclaration_uses_contributors = null;
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    ParameterDeclaration_uses_computed = false;
    ParameterDeclaration_uses_value = null;
    ParameterDeclaration_uses_contributors = null;
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParameterDeclaration clone() throws CloneNotSupportedException {
    ParameterDeclaration node = (ParameterDeclaration)super.clone();
    node.type_computed = false;
    node.type_value = null;
    node.sourceVariableDecl_computed = false;
    node.sourceVariableDecl_value = null;
    node.getParameterisedCallable_computed = false;
    node.getParameterisedCallable_value = null;
    node.isIn_computed = false;
    node.isOut_computed = false;
    node.isRef_computed = false;
    node.isWrite_computed = false;
    node.isRead_computed = false;
    node.exceptionalSucc_computed = false;
    node.exceptionalSucc_value = null;
    node.succ_computed = false;
    node.succ_value = null;
    node.dotLabel_computed = false;
    node.dotLabel_value = null;
    node.dotNode_computed = false;
    node.dotNode_value = null;
    node.reachingDefinitionsFor_Location_values = null;
    node.reachedUsesFor_Location_values = null;
    node.hasReachingDefinitionBefore_Location_CFGNode_values = null;
    node.hasReachedUseAfter_Location_CFGNode_values = null;
    node.weakSucc_computed = false;
    node.weakSucc_value = null;
    node.collect_BackwardEdge_CFGNode_values = null;
    node.collect_ForwardEdge_CFGNode_values = null;
    node.precedingDefsUpTo_CFGNode_values = null;
    node.isAnticipated_VariableDeclaration_values = null;
    node.makesAnticipated_VariableDeclaration_values = null;
    node.killsAnticipated_VariableDeclaration_values = null;
    node.isAvailable_ASTNode_values = null;
    node.following_computed = false;
    node.following_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParameterDeclaration copy() {
    try {
      ParameterDeclaration node = (ParameterDeclaration) clone();
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
  public ParameterDeclaration fullCopy() {
    ParameterDeclaration tree = (ParameterDeclaration) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:117
   */
  public SimpleSet add(Object o) {
    return new SimpleSetImpl().add(this).add(o);
  }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:121
   */
  public boolean isSingleton() { return true; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:122
   */
  public boolean isSingleton(Object o) { return contains(o); }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:125
   */
  
  private ParameterDeclaration iterElem;
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:126
   */
  public Iterator iterator() { iterElem = this; return this; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:127
   */
  public boolean hasNext() { return iterElem != null; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:128
   */
  public Object next() { Object o = iterElem; iterElem = null; return o; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:129
   */
  public void remove() { throw new UnsupportedOperationException(); }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:333
   */
  public void nameCheck() {
    SimpleSet decls = outerScope().lookupVariable(name());
    for(Iterator iter = decls.iterator(); iter.hasNext(); ) {
      Variable var = (Variable)iter.next();
      if(var instanceof VariableDeclaration) {
        VariableDeclaration decl = (VariableDeclaration)var;
        if(decl.enclosingBodyDecl() == enclosingBodyDecl())
          error("duplicate declaration of local variable " + name());
      }
      else if(var instanceof ParameterDeclaration) {
        ParameterDeclaration decl = (ParameterDeclaration)var;
        if(decl.enclosingBodyDecl() == enclosingBodyDecl())
          error("duplicate declaration of local variable " + name());
      }
    }

    // 8.4.1  
    if(!lookupVariable(name()).contains(this)) {
      error("duplicate declaration of parameter " + name());
    }
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:11
   */
  public ParameterDeclaration(Access type, String name) {
    this(new Modifiers(new List()), type, name);
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:14
   */
  public ParameterDeclaration(TypeDecl type, String name) {
    this(new Modifiers(new List()), type.createQualifiedAccess(), name);
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:233
   */
  public void toString(StringBuffer s) {
    getModifiers().toString(s);
    getTypeAccess().toString(s);
    s.append(" " + name());
  }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:17
   */
  public boolean mustAlias(Location l) { return mayAlias(l); }
  /**
   * @ast method 
   * @aspect ParameterExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:8
   */
  public ParameterDeclaration lockedCopy() {
		return new ParameterDeclaration((Modifiers)getModifiers().fullCopyAndDetach(), type().createLockedAccess(), name());
	}
  /**
   * @ast method 
   * @aspect ChangeParameterType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/ChangeParameterType.jrag:4
   */
  public void changeType(TypeDecl newType) {
		if(getParameterisedCallable() != null && 
				(!getParameterisedCallable().fromSource() || getParameterisedCallable().isNative()))
			throw new RefactoringException("cannot change this parameter declaration");
		if(!type().subtype(newType))
			throw new RefactoringException("unsupported type change");
		if(type().subtype(typeThrowable())) 
			throw new RefactoringException("cannot change throwable types");
		Program root = programRoot();
		
		// construct typeUpdate map
		Map<Expr, TypeDecl> typeUpdate = new HashMap<Expr, TypeDecl>();
		for(TypeConstraintVariable tcv : propagateGeneralisation(root.typeConstraints(type()), getTypeAccess(), newType))
			if(tcv instanceof Expr)
				typeUpdate.put((Expr)tcv, newType);
		
		// construct movement map (trivial)
		Map<MemberDecl, TypeDecl> memberMove = new HashMap<MemberDecl, TypeDecl>();
		
		// construct overriding map (trivial)
		Map<MethodDecl, Collection<MethodDecl>> methodOverriding = new HashMap<MethodDecl, Collection<MethodDecl>>();
		
		root.lockOverridingAndNames(typeUpdate, memberMove, methodOverriding);

		// perform actual refactoring
		for(Expr e : typeUpdate.keySet())
			if(e.isTypeAccess())
				e.replaceWith(newType.createLockedAccess());
		
		root.adjustVirtualCalls(typeUpdate);
		root.eliminate(LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:83
   */
  public void makeIn() {
		List<Modifier> newmods = new List<Modifier>();
		for(Modifier mod : getModifiers().getModifierList())
			if(!mod.getID().equals("ref") && !mod.getID().equals("out"))
				newmods.add(mod);
		getModifiers().setModifierList(newmods);
	}
  /**
   * @ast method 
   * @aspect EliminateOutParams
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractMethod/EliminateOutParams.jrag:91
   */
  public void makeRef() {
		assert(!isRef());
		for(Modifier mod : getModifiers().getModifierList()) {
			if(mod.getID().equals("out")) {
				mod.setID("ref");
				return;
			}
		}
		getModifiers().addModifier(new Modifier("ref"));
	}
  /**
   * @ast method 
   * @aspect IntroduceOutParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/IntroduceOutParameter.jrag:42
   */
  public void makeOut() {
		if(isWrite())
			return;
		getModifiers().addModifier(new Modifier("out"));
	}
  /**
   * @ast method 
   * @aspect OpenVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/OpenVariables.jrag:12
   */
  public void inline() {
		AnonymousMethod anon = (AnonymousMethod)getParent().getParent();
		int i = anon.getParameterList().getIndexOfChild(this);
		Expr arg = anon.lookupArg(name());
		if(isIn()) {
			arg = (Expr)arg.lockAllNames();
			VariableDeclaration newdecl = asFreshVariableDeclaration();
			anon.removeParameter(i);
			anon.removeArg(i);
			newdecl.setInit(arg);
			anon.getBlock().insertStmt(0, newdecl);
		} else {
			if(!(arg instanceof VarAccess))
				throw new RefactoringException("cannot inline argument");
			Variable decl = ((VarAccess)arg).decl();
			Collection<VarAccess> uses = uses();
			anon.removeParameter(i);
			anon.removeArg(i);
			for(VarAccess v : uses) {
				v.flushCaches();
				v.lock(decl);
			}
		}
	}
  /**
   * @ast method 
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:40
   */
  public void setDemandFinal() { getModifiers().addDemandFinalModifier(); }
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:182
   */
  public void freshenDeclaration() {
		Collection<VarAccess> uses = allUses();
		FreshParameter fp = new FreshParameter(getModifiers(), getTypeAccess(), getID());
		for(VarAccess va : uses)
			va.lock(fp);
		replaceWith(fp);
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:197
   */
  public FreshLocalVariable asFreshVariableDeclaration() {
		Collection<VarAccess> uses = allUses();
		FreshLocalVariable fv = new FreshLocalVariable(getModifiers(), getTypeAccess(), getID(), new Opt());
		for(VarAccess va : uses)
			va.lock(fv);
		return fv;
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
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:50
   */
  public SmallSet<CFGNode> pred() { return collPred(); }
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:66
   */
  public void dot() {
		String thisName = String.valueOf(hashCode());
		for(CFGNode that : succ())
			System.out.println("\t" + this.dotNode() + " -> " + that.dotNode() + ";");
		super.dot();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:14
   */
  public void lockControlFlow() {
		if(lockedSucc == null)
			lockedSucc = weakSucc();
		super.lockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:20
   */
  public void unlockControlFlow() {
		if(lockedSucc != null) {
			if(!lockedSucc.equals(weakSucc()))
				throw new RefactoringException("control flow successors not preserved");
			lockedSucc = null;
		}
		super.unlockControlFlow();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:69
   */
  public void lockThrowEdges() {
		if(lockedThrowEdges == null) {
			SmallSet<CFGNode> throwEdges = exceptionalSucc();
			if(!throwEdges.isEmpty())
				lockedThrowEdges = throwEdges;
		}
		super.lockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:78
   */
  public void unlockThrowEdges() {
		if(lockedThrowEdges != null) {
			if(!exceptionalSucc().equals(lockedThrowEdges))
				throw new RefactoringException("throw edges have changed");
			lockedThrowEdges = null;
		}
		super.unlockThrowEdges();
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:86
   */
  public IdentityHashMap<DependencyEdge, SmallSet<CFGNode>> getDependencies() {
		if(dependencies == null)
			dependencies = new IdentityHashMap<DependencyEdge, SmallSet<CFGNode>>();
		return dependencies;
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:100
   */
  public void lockDependencies(DependencyEdge... edges) {
		for(DependencyEdge e : edges)
			if(e.isStart(this))
				getDependencies().put(e, e.collect(this));
		super.lockDependencies(edges);
	}
  /**
   * @ast method 
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:115
   */
  public void unlockDependencies(PreservationStrategy r) {
		DependencyEdge e = r.getEdge();
		if(e.isStart(this)) {
			SmallSet<CFGNode> old_edges = getDependencies().get(e);
			if(old_edges != null) {
				SmallSet<CFGNode> new_edges = e.collect(this);
				if(r.preserve(this) && !old_edges.subsetOf(new_edges))
					throw new RefactoringException("couldn't preserve edge: "+e);
				if(r.reflect(this) && !new_edges.subsetOf(old_edges))
					throw new RefactoringException("couldn't reflect edge: "+e);
			}
		}
		super.unlockDependencies(r);
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:54
   */
  public SmallSet<CFGNode> collectExceptionalSucc() {
		return exceptionalSucc().union(super.collectExceptionalSucc());
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:99
   */
  public boolean makesAvailable(ASTNode e) {
		return this == e;
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:103
   */
  public boolean makesUnavailable(ASTNode e) {
		for(Location l : (Collection<Location>)e.locationsRead())
			if(isReachingDefinitionFor(l))
				return true;
		return false;
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
  public ParameterDeclaration() {
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
  }
  /**
   * @ast method 
   * 
   */
  public ParameterDeclaration(Modifiers p0, Access p1, String p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
  }
  /**
   * @ast method 
   * 
   */
  public ParameterDeclaration(Modifiers p0, Access p1, beaver.Symbol p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
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
  public void refined__ParameterDeclaration_setID(String value) {
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
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1081
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__ParameterDeclaration_setID(oldValue);
				}
				@Override
				public String toString() {
					return "ParameterDeclaration.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ParameterDeclaration_setID(value);
				}
			});
		}
		refined__ParameterDeclaration_setID(value);
	}
  /**
   * @attribute syn
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:115
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:116
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:120
   */
  public boolean contains(Object o) {
    ASTNode$State state = state();
    try {  return this == o;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:220
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:253
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
  private TypeDecl type_compute() {  return getTypeAccess().type();  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:47
   */
  public boolean isParameter() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:50
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:51
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:55
   */
  public boolean isLocalVariable() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:73
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:74
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:75
   */
  public boolean isBlank() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:76
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:78
   */
  public String name() {
    ASTNode$State state = state();
    try {  return getID();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:80
   */
  public boolean hasInit() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:81
   */
  public Expr getInit() {
    ASTNode$State state = state();
    try { throw new UnsupportedOperationException(); }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:82
   */
  public Constant constant() {
    ASTNode$State state = state();
    try { throw new UnsupportedOperationException(); }
    finally {
    }
  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1523
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
   * @attribute syn
   * @aspect VariableArityParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:35
   */
  public boolean isVariableArity() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:94
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return mayAlias(l);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:95
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:96
   */
  public boolean isReachedUseFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean getParameterisedCallable_computed = false;
  /**
   * @apilevel internal
   */
  protected Callable getParameterisedCallable_value;
  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:82
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Callable getParameterisedCallable() {
    if(getParameterisedCallable_computed) {
      return getParameterisedCallable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getParameterisedCallable_value = getParameterisedCallable_compute();
      if(isFinal && num == state().boundariesCrossed) getParameterisedCallable_computed = true;
    return getParameterisedCallable_value;
  }
  /**
   * @apilevel internal
   */
  private Callable getParameterisedCallable_compute() {
		if(getParent() == null)
			return null;
		ASTNode gp = getParent().getParent();
		if(gp instanceof Callable && ((Callable)gp).getParameterList() == getParent())
			return (Callable)gp;
		return null;
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
   * @apilevel internal
   */
  protected boolean isIn_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isIn_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:177
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isIn() {
    if(isIn_computed) {
      return isIn_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isIn_value = isIn_compute();
      if(isFinal && num == state().boundariesCrossed) isIn_computed = true;
    return isIn_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isIn_compute() {  return !isOut() && !isRef();  }
  /**
   * @apilevel internal
   */
  protected boolean isOut_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isOut_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:178
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isOut() {
    if(isOut_computed) {
      return isOut_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isOut_value = isOut_compute();
      if(isFinal && num == state().boundariesCrossed) isOut_computed = true;
    return isOut_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isOut_compute() {  return getModifiers().numModifier("out") != 0;  }
  /**
   * @apilevel internal
   */
  protected boolean isRef_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isRef_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:179
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isRef() {
    if(isRef_computed) {
      return isRef_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isRef_value = isRef_compute();
      if(isFinal && num == state().boundariesCrossed) isRef_computed = true;
    return isRef_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isRef_compute() {  return getModifiers().numModifier("ref") != 0;  }
  /**
   * @apilevel internal
   */
  protected boolean isWrite_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isWrite_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:180
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isWrite() {
    if(isWrite_computed) {
      return isWrite_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isWrite_value = isWrite_compute();
      if(isFinal && num == state().boundariesCrossed) isWrite_computed = true;
    return isWrite_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isWrite_compute() {  return !isIn();  }
  /**
   * @apilevel internal
   */
  protected boolean isRead_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isRead_value;
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:181
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isRead() {
    if(isRead_computed) {
      return isRead_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isRead_value = isRead_compute();
      if(isFinal && num == state().boundariesCrossed) isRead_computed = true;
    return isRead_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isRead_compute() {  return !isOut();  }
  /**
   * @attribute syn
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:16
   */
  public boolean mayBeFinal() {
    ASTNode$State state = state();
    try {
		for(VarAccess va : uses())
			if(va.isDest())
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
   * @apilevel internal
   */
  protected boolean exceptionalSucc_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> exceptionalSucc_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> exceptionalSucc() {
    if(exceptionalSucc_computed) {
      return exceptionalSucc_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    exceptionalSucc_value = exceptionalSucc_compute();
      if(isFinal && num == state().boundariesCrossed) exceptionalSucc_computed = true;
    return exceptionalSucc_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> exceptionalSucc_compute() {  return SmallSet.<CFGNode>empty();  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return this;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:57
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
  private SmallSet<CFGNode> succ_compute() {  return following().union(exceptionalSucc());  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:777
   */
  public SmallSet<Stmt> succStmt() {
    ASTNode$State state = state();
    try {
		SmallSet<Stmt> res = new SmallSet<Stmt>();
		for(CFGNode n : succ()) {
			if(n instanceof Stmt)
				res = res.union((Stmt)n);
			else
				res = res.union(n.succStmt());
		}
		return res;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:788
   */
  public SmallSet<Stmt> predStmt() {
    ASTNode$State state = state();
    try {
		SmallSet<Stmt> res = new SmallSet<Stmt>();
		for(CFGNode n : pred()) {
			if(n instanceof Stmt)
				res = res.union((Stmt)n);
			else
				res = res.union(n.predStmt());
		}
		return res;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean dotLabel_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotLabel_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotLabel() {
    if(dotLabel_computed) {
      return dotLabel_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotLabel_value = dotLabel_compute();
      if(isFinal && num == state().boundariesCrossed) dotLabel_computed = true;
    return dotLabel_value;
  }
  /**
   * @apilevel internal
   */
  private String dotLabel_compute() {
		String label = toString();
		label = label.replace('"', '\'').replace('\n', ' ');
		if(label.length() > 20)
			label = label.substring(0, 10) + label.substring(label.length()-10, label.length());
		return label;
	}
  /**
   * @apilevel internal
   */
  protected boolean dotNode_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotNode_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotNode() {
    if(dotNode_computed) {
      return dotNode_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotNode_value = dotNode_compute();
      if(isFinal && num == state().boundariesCrossed) dotNode_computed = true;
    return dotNode_value;
  }
  /**
   * @apilevel internal
   */
  private String dotNode_compute() {
		String n = String.valueOf(hashCode());
		String label = dotLabel();
		System.out.println("\t" + n + "[label=\"" + label + "\"];");
		return n;
	}
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:2
   */
  public boolean isDef() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  protected java.util.Map reachingDefinitionsFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> reachingDefinitionsFor(Location l) {
    Object _parameters = l;
    if(reachingDefinitionsFor_Location_values == null) reachingDefinitionsFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachingDefinitionsFor_Location_values.containsKey(_parameters)) {
      Object _o = reachingDefinitionsFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachingDefinitionsFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
        if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachingDefinitionsFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachingDefinitionsFor_Location_values.put(_parameters, new_reachingDefinitionsFor_Location_value);
      }
      else {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachingDefinitionsFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachingDefinitionsFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
      if (state.RESET_CYCLE) {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      }
      else if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachingDefinitionsFor_Location_value;
      }
      return new_reachingDefinitionsFor_Location_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> reachingDefinitionsFor_compute(Location l) {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		if(isReachingDefinitionFor(l)) {
			res = SmallSet.singleton((CFGNode)this);
			if(isBlockingDefinitionFor(l))
				return res;
		}
		for(CFGNode p : pred())
			res = res.union(p.reachingDefinitionsFor(l));
		return res;
	}
  protected java.util.Map reachedUsesFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<Access> reachedUsesFor(Location l) {
    Object _parameters = l;
    if(reachedUsesFor_Location_values == null) reachedUsesFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachedUsesFor_Location_values.containsKey(_parameters)) {
      Object _o = reachedUsesFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<Access>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachedUsesFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<Access> new_reachedUsesFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachedUsesFor_Location_value = reachedUsesFor_compute(l);
        if ((new_reachedUsesFor_Location_value==null && (SmallSet<Access>)_value.value!=null) || (new_reachedUsesFor_Location_value!=null && !new_reachedUsesFor_Location_value.equals((SmallSet<Access>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachedUsesFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachedUsesFor_Location_values.put(_parameters, new_reachedUsesFor_Location_value);
      }
      else {
        reachedUsesFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachedUsesFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachedUsesFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<Access> new_reachedUsesFor_Location_value = reachedUsesFor_compute(l);
      if (state.RESET_CYCLE) {
        reachedUsesFor_Location_values.remove(_parameters);
      }
      else if ((new_reachedUsesFor_Location_value==null && (SmallSet<Access>)_value.value!=null) || (new_reachedUsesFor_Location_value!=null && !new_reachedUsesFor_Location_value.equals((SmallSet<Access>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachedUsesFor_Location_value;
      }
      return new_reachedUsesFor_Location_value;
    }
    return (SmallSet<Access>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<Access> reachedUsesFor_compute(Location l) {
		SmallSet<Access> res = SmallSet.<Access>empty();
		if(isBlockingDefinitionFor(l))
			return res;
		for(CFGNode s : succ())
			res = res.union(s.reachedUsesFor(l));
		return res;
	}
  protected java.util.Map hasReachingDefinitionBefore_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:159
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachingDefinitionBefore(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachingDefinitionBefore_Location_CFGNode_values == null) hasReachingDefinitionBefore_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachingDefinitionBefore_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachingDefinitionBefore_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
        if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachingDefinitionBefore_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, new_hasReachingDefinitionBefore_Location_CFGNode_value);
      }
      else {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachingDefinitionBefore_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachingDefinitionBefore_Location_CFGNode_value;
      }
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachingDefinitionBefore_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachingDefinitionsFor(l).isEmpty();
		if(isBlockingDefinitionFor(l))
			return false;
		for(CFGNode pred : pred())
			if(pred.hasReachingDefinitionBefore(l, n))
				return true;
		return false;
	}
  protected java.util.Map hasReachedUseAfter_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:199
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachedUseAfter(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachedUseAfter_Location_CFGNode_values == null) hasReachedUseAfter_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachedUseAfter_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachedUseAfter_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachedUseAfter_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachedUseAfter_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachedUseAfter_Location_CFGNode_value = hasReachedUseAfter_compute(l, n);
        if (new_hasReachedUseAfter_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachedUseAfter_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachedUseAfter_Location_CFGNode_values.put(_parameters, new_hasReachedUseAfter_Location_CFGNode_value);
      }
      else {
        hasReachedUseAfter_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachedUseAfter_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachedUseAfter_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachedUseAfter_Location_CFGNode_value = hasReachedUseAfter_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachedUseAfter_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachedUseAfter_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachedUseAfter_Location_CFGNode_value;
      }
      return new_hasReachedUseAfter_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachedUseAfter_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachedUsesFor(l).isEmpty();
		if(isBlockingDefinitionFor(l))
			return false;
		for(CFGNode succ : succ())
			if(succ.hasReachedUseAfter(l, n))
				return true;
		return false;
	}
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:13
   */
  public boolean isAcquire() {
    ASTNode$State state = state();
    try {  return false;  }
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
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:15
   */
  public boolean isThreadManagementAction() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:16
   */
  public boolean isSyncAction() {
    ASTNode$State state = state();
    try {  return isAcquire() || isRelease() || isThreadManagementAction();  }
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
    try {  return isSyncAction();  }
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
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean weakSucc_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> weakSucc_value;
  /**
   * @attribute syn
   * @aspect ControlFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/ControlFlow.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> weakSucc() {
    if(weakSucc_computed) {
      return weakSucc_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    weakSucc_value = weakSucc_compute();
      if(isFinal && num == state().boundariesCrossed) weakSucc_computed = true;
    return weakSucc_value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> weakSucc_compute() {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		for(CFGNode s : succ())
			if(s.isFlowThrough())
				res = res.union(s.weakSucc());
			else
				res = res.union(s);
		return res;
	}
  protected java.util.Map collect_BackwardEdge_CFGNode_values;
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:28
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(BackwardEdge be, CFGNode start) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(be);
    _parameters.add(start);
    if(collect_BackwardEdge_CFGNode_values == null) collect_BackwardEdge_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(collect_BackwardEdge_CFGNode_values.containsKey(_parameters)) {
      Object _o = collect_BackwardEdge_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      collect_BackwardEdge_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode> empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_collect_BackwardEdge_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_collect_BackwardEdge_CFGNode_value = collect_compute(be, start);
        if ((new_collect_BackwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_BackwardEdge_CFGNode_value!=null && !new_collect_BackwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_collect_BackwardEdge_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        collect_BackwardEdge_CFGNode_values.put(_parameters, new_collect_BackwardEdge_CFGNode_value);
      }
      else {
        collect_BackwardEdge_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      collect_compute(be, start);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_collect_BackwardEdge_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_collect_BackwardEdge_CFGNode_value = collect_compute(be, start);
      if (state.RESET_CYCLE) {
        collect_BackwardEdge_CFGNode_values.remove(_parameters);
      }
      else if ((new_collect_BackwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_BackwardEdge_CFGNode_value!=null && !new_collect_BackwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_collect_BackwardEdge_CFGNode_value;
      }
      return new_collect_BackwardEdge_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collect_compute(BackwardEdge be, CFGNode start) {
		SmallSet<CFGNode> res = be.isTarget(start, this) ? SmallSet.singleton((CFGNode)this)
													  : SmallSet.<CFGNode>empty();
		if(be.terminates(start, this))
			return res;
		for(CFGNode p : pred())
			res = res.union(p.collect(be, start));
		return res;
	}
  protected java.util.Map collect_ForwardEdge_CFGNode_values;
  /**
   * @attribute syn
   * @aspect DependencyEdges
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DependencyEdges.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collect(ForwardEdge fe, CFGNode start) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(fe);
    _parameters.add(start);
    if(collect_ForwardEdge_CFGNode_values == null) collect_ForwardEdge_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(collect_ForwardEdge_CFGNode_values.containsKey(_parameters)) {
      Object _o = collect_ForwardEdge_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      collect_ForwardEdge_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode> empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_collect_ForwardEdge_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_collect_ForwardEdge_CFGNode_value = collect_compute(fe, start);
        if ((new_collect_ForwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_ForwardEdge_CFGNode_value!=null && !new_collect_ForwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_collect_ForwardEdge_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        collect_ForwardEdge_CFGNode_values.put(_parameters, new_collect_ForwardEdge_CFGNode_value);
      }
      else {
        collect_ForwardEdge_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      collect_compute(fe, start);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_collect_ForwardEdge_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_collect_ForwardEdge_CFGNode_value = collect_compute(fe, start);
      if (state.RESET_CYCLE) {
        collect_ForwardEdge_CFGNode_values.remove(_parameters);
      }
      else if ((new_collect_ForwardEdge_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_collect_ForwardEdge_CFGNode_value!=null && !new_collect_ForwardEdge_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_collect_ForwardEdge_CFGNode_value;
      }
      return new_collect_ForwardEdge_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collect_compute(ForwardEdge fe, CFGNode start) {
		SmallSet<CFGNode> res = fe.isTarget(start, this) ? SmallSet.singleton((CFGNode)this)
												  	  : SmallSet.<CFGNode>empty();
		if(fe.terminates(start, this))
			return res;
		for(CFGNode p : succ())
			res = res.union(p.collect(fe, start));
		return res;
	}
  protected java.util.Map precedingDefsUpTo_CFGNode_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:59
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> precedingDefsUpTo(CFGNode n) {
    Object _parameters = n;
    if(precedingDefsUpTo_CFGNode_values == null) precedingDefsUpTo_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(precedingDefsUpTo_CFGNode_values.containsKey(_parameters)) {
      Object _o = precedingDefsUpTo_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      precedingDefsUpTo_CFGNode_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_precedingDefsUpTo_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_precedingDefsUpTo_CFGNode_value = precedingDefsUpTo_compute(n);
        if ((new_precedingDefsUpTo_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_precedingDefsUpTo_CFGNode_value!=null && !new_precedingDefsUpTo_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_precedingDefsUpTo_CFGNode_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        precedingDefsUpTo_CFGNode_values.put(_parameters, new_precedingDefsUpTo_CFGNode_value);
      }
      else {
        precedingDefsUpTo_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      precedingDefsUpTo_compute(n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_precedingDefsUpTo_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_precedingDefsUpTo_CFGNode_value = precedingDefsUpTo_compute(n);
      if (state.RESET_CYCLE) {
        precedingDefsUpTo_CFGNode_values.remove(_parameters);
      }
      else if ((new_precedingDefsUpTo_CFGNode_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_precedingDefsUpTo_CFGNode_value!=null && !new_precedingDefsUpTo_CFGNode_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_precedingDefsUpTo_CFGNode_value;
      }
      return new_precedingDefsUpTo_CFGNode_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> precedingDefsUpTo_compute(CFGNode n) {
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		if(this == n)
			return res;
		if(isDef())
			res = SmallSet.singleton((CFGNode)this);
		for(CFGNode p : pred())
			res = res.union(p.precedingDefsUpTo(n));
		return res;
	}
  protected java.util.Map isAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:71
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(isAnticipated_VariableDeclaration_values == null) isAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      Object _o = isAnticipated_VariableDeclaration_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isAnticipated_VariableDeclaration_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isAnticipated_VariableDeclaration_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isAnticipated_VariableDeclaration_value = isAnticipated_compute(v);
        if (new_isAnticipated_VariableDeclaration_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isAnticipated_VariableDeclaration_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isAnticipated_VariableDeclaration_values.put(_parameters, new_isAnticipated_VariableDeclaration_value);
      }
      else {
        isAnticipated_VariableDeclaration_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isAnticipated_compute(v);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isAnticipated_VariableDeclaration_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isAnticipated_VariableDeclaration_value = isAnticipated_compute(v);
      if (state.RESET_CYCLE) {
        isAnticipated_VariableDeclaration_values.remove(_parameters);
      }
      else if (new_isAnticipated_VariableDeclaration_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isAnticipated_VariableDeclaration_value;
      }
      return new_isAnticipated_VariableDeclaration_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isAnticipated_compute(VariableDeclaration v) {
		if(makesAnticipated(v))
			return true;
		for(CFGNode s : succ())
			if(!s.isAnticipated(v))
				return false;
		return !killsAnticipated(v);
	}
  protected java.util.Map makesAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean makesAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(makesAnticipated_VariableDeclaration_values == null) makesAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    if(makesAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)makesAnticipated_VariableDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean makesAnticipated_VariableDeclaration_value = makesAnticipated_compute(v);
      if(isFinal && num == state().boundariesCrossed) makesAnticipated_VariableDeclaration_values.put(_parameters, Boolean.valueOf(makesAnticipated_VariableDeclaration_value));
    return makesAnticipated_VariableDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean makesAnticipated_compute(VariableDeclaration v) {  return false;  }
  protected java.util.Map killsAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:84
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean killsAnticipated(VariableDeclaration v) {
    Object _parameters = v;
    if(killsAnticipated_VariableDeclaration_values == null) killsAnticipated_VariableDeclaration_values = new java.util.HashMap(4);
    if(killsAnticipated_VariableDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)killsAnticipated_VariableDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean killsAnticipated_VariableDeclaration_value = killsAnticipated_compute(v);
      if(isFinal && num == state().boundariesCrossed) killsAnticipated_VariableDeclaration_values.put(_parameters, Boolean.valueOf(killsAnticipated_VariableDeclaration_value));
    return killsAnticipated_VariableDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean killsAnticipated_compute(VariableDeclaration v) {  return false;  }
  protected java.util.Map isAvailable_ASTNode_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:88
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isAvailable(ASTNode e) {
    Object _parameters = e;
    if(isAvailable_ASTNode_values == null) isAvailable_ASTNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(isAvailable_ASTNode_values.containsKey(_parameters)) {
      Object _o = isAvailable_ASTNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      isAvailable_ASTNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_isAvailable_ASTNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_isAvailable_ASTNode_value = isAvailable_compute(e);
        if (new_isAvailable_ASTNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_isAvailable_ASTNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        isAvailable_ASTNode_values.put(_parameters, new_isAvailable_ASTNode_value);
      }
      else {
        isAvailable_ASTNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      isAvailable_compute(e);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_isAvailable_ASTNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_isAvailable_ASTNode_value = isAvailable_compute(e);
      if (state.RESET_CYCLE) {
        isAvailable_ASTNode_values.remove(_parameters);
      }
      else if (new_isAvailable_ASTNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_isAvailable_ASTNode_value;
      }
      return new_isAvailable_ASTNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean isAvailable_compute(ASTNode e) {
		if(makesAvailable(e))
			return true;
		if(makesUnavailable(e))
			return false;
		for(CFGNode p : pred())
			if(!p.isAvailable(e))
				return false;
		return true;
	}
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:22
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:293
   */
  @SuppressWarnings({"unchecked", "cast"})
  public VariableScope outerScope() {
    ASTNode$State state = state();
    VariableScope outerScope_value = getParent().Define_VariableScope_outerScope(this, null);
    return outerScope_value;
  }
  /**
   * @attribute inh
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:354
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl enclosingBodyDecl() {
    ASTNode$State state = state();
    BodyDecl enclosingBodyDecl_value = getParent().Define_BodyDecl_enclosingBodyDecl(this, null);
    return enclosingBodyDecl_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:589
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl hostType() {
    ASTNode$State state = state();
    TypeDecl hostType_value = getParent().Define_TypeDecl_hostType(this, null);
    return hostType_value;
  }
  /**
   * @attribute inh
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:52
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isMethodParameter() {
    ASTNode$State state = state();
    boolean isMethodParameter_value = getParent().Define_boolean_isMethodParameter(this, null);
    return isMethodParameter_value;
  }
  /**
   * @attribute inh
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isConstructorParameter() {
    ASTNode$State state = state();
    boolean isConstructorParameter_value = getParent().Define_boolean_isConstructorParameter(this, null);
    return isConstructorParameter_value;
  }
  /**
   * @attribute inh
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:54
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isExceptionHandlerParameter() {
    ASTNode$State state = state();
    boolean isExceptionHandlerParameter_value = getParent().Define_boolean_isExceptionHandlerParameter(this, null);
    return isExceptionHandlerParameter_value;
  }
  /**
   * @attribute inh
   * @aspect ParameterExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:35
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Parameterisable parameterOwner() {
    ASTNode$State state = state();
    Parameterisable parameterOwner_value = getParent().Define_Parameterisable_parameterOwner(this, null);
    return parameterOwner_value;
  }
  /**
   * @attribute inh
   * @aspect ChangeParameterType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/ChangeParameterType.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeThrowable() {
    ASTNode$State state = state();
    TypeDecl typeThrowable_value = getParent().Define_TypeDecl_typeThrowable(this, null);
    return typeThrowable_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:138
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
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
   * @apilevel internal
   */
  protected boolean following_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> following_value;
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> following() {
    if(following_computed) {
      return following_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    following_value = getParent().Define_SmallSet_CFGNode__following(this, null);
      if(isFinal && num == state().boundariesCrossed) following_computed = true;
    return following_value;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:288
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:83
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    if(caller == getModifiersNoTransform()) {
      return name.equals("PARAMETER");
    }
    else {      return getParent().Define_boolean_mayUseAnnotationTarget(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:79
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:556
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getTypeAccessNoTransform()) {
      return SmallSet.empty();
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:10
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
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /**
   * @apilevel internal
   */
  protected boolean ParameterDeclaration_uses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<VarAccess> ParameterDeclaration_uses_value;
  /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<VarAccess> uses() {
    if(ParameterDeclaration_uses_computed) {
      return ParameterDeclaration_uses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    ParameterDeclaration_uses_value = uses_compute();
      if(isFinal && num == state().boundariesCrossed) ParameterDeclaration_uses_computed = true;
    return ParameterDeclaration_uses_value;
  }
  java.util.Set ParameterDeclaration_uses_contributors;
  public java.util.Set ParameterDeclaration_uses_contributors() {
    if(ParameterDeclaration_uses_contributors == null) ParameterDeclaration_uses_contributors  = new ASTNode$State.IdentityHashSet(4);
    return ParameterDeclaration_uses_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<VarAccess> uses_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof BodyDecl))
      node = node.getParent();
    BodyDecl root = (BodyDecl)node;
    root.collect_contributors_ParameterDeclaration_uses();
    ParameterDeclaration_uses_value = new HashSet<VarAccess>();
    if(ParameterDeclaration_uses_contributors != null)
    for(java.util.Iterator iter = ParameterDeclaration_uses_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_ParameterDeclaration_ParameterDeclaration_uses(ParameterDeclaration_uses_value);
    }
    return ParameterDeclaration_uses_value;
  }

  /**
   * @apilevel internal
   */
  protected boolean CFGNode_collPred_computed = false;
  /**
   * @apilevel internal
   */
  protected SmallSet<CFGNode> CFGNode_collPred_value;
  /**
   * @attribute coll
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:37
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> collPred() {
    if(CFGNode_collPred_computed) {
      return CFGNode_collPred_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    CFGNode_collPred_value = collPred_compute();
      if(isFinal && num == state().boundariesCrossed) CFGNode_collPred_computed = true;
    return CFGNode_collPred_value;
  }
  java.util.Set CFGNode_collPred_contributors;
  public java.util.Set CFGNode_collPred_contributors() {
    if(CFGNode_collPred_contributors == null) CFGNode_collPred_contributors  = new ASTNode$State.IdentityHashSet(4);
    return CFGNode_collPred_contributors;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> collPred_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof TypeDecl))
      node = node.getParent();
    TypeDecl root = (TypeDecl)node;
    root.collect_contributors_CFGNode_collPred();
    CFGNode_collPred_value = SmallSet.mutable();
    if(CFGNode_collPred_contributors != null)
    for(java.util.Iterator iter = CFGNode_collPred_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_CFGNode_CFGNode_collPred(CFGNode_collPred_value);
    }
    return CFGNode_collPred_value;
  }

  protected void collect_contributors_CFGNode_collPred() {
    /**
   * @attribute coll
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:40
   */
    for(java.util.Iterator iter = (succ()).iterator(); iter.hasNext(); ) {
      CFGNode ref = (CFGNode)iter.next();
      if(ref != null)
      ref.CFGNode_collPred_contributors().add(this);
    }
    super.collect_contributors_CFGNode_collPred();
  }
  protected void contributeTo_CFGNode_CFGNode_collPred(SmallSet<CFGNode> collection) {
    super.contributeTo_CFGNode_CFGNode_collPred(collection);
    collection.add(this);
  }

}
