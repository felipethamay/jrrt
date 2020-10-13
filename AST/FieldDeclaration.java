/* This file was generated with JastAdd2 (http://jastadd.org) version R20130212 (r1031) */
package AST;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Map;

import jp.ac.kobe_u.cs.cream.IntVariable;
import jp.ac.kobe_u.cs.cream.Network;
import tests.jdolly.ConditionsPushDownField;
/**
 * @production FieldDeclaration : {@link MemberDecl} ::= <span class="component">{@link Modifiers}</span> <span class="component">TypeAccess:{@link Access}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">[Init:{@link Expr}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:80
 */
public class FieldDeclaration extends MemberDecl implements Cloneable, SimpleSet, Iterator, Variable, CFGNode, Visible {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    accessibleFrom_TypeDecl_values = null;
    exceptions_computed = false;
    exceptions_value = null;
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    constant_computed = false;
    constant_value = null;
    usesTypeVariable_computed = false;
    sourceVariableDecl_computed = false;
    sourceVariableDecl_value = null;
    usesOfAllCopies_computed = false;
    usesOfAllCopies_value = null;
    hiddenFields_computed = false;
    hiddenFields_value = null;
    uses_computed = false;
    uses_value = null;
    effectivelyFinal_computed = false;
    refEscapes_computed = false;
    isDedicatedLock_computed = false;
    assignedExprs_computed = false;
    assignedExprs_value = null;
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
    creamVariable_Network_values = null;
    following_computed = false;
    following_value = null;
    FieldDeclaration_staticImports_computed = false;
    FieldDeclaration_staticImports_value = null;
    FieldDeclaration_staticImports_contributors = null;
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    FieldDeclaration_staticImports_computed = false;
    FieldDeclaration_staticImports_value = null;
    FieldDeclaration_staticImports_contributors = null;
    CFGNode_collPred_computed = false;
    CFGNode_collPred_value = null;
    CFGNode_collPred_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public FieldDeclaration clone() throws CloneNotSupportedException {
    FieldDeclaration node = (FieldDeclaration)super.clone();
    node.accessibleFrom_TypeDecl_values = null;
    node.exceptions_computed = false;
    node.exceptions_value = null;
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.constant_computed = false;
    node.constant_value = null;
    node.usesTypeVariable_computed = false;
    node.sourceVariableDecl_computed = false;
    node.sourceVariableDecl_value = null;
    node.usesOfAllCopies_computed = false;
    node.usesOfAllCopies_value = null;
    node.hiddenFields_computed = false;
    node.hiddenFields_value = null;
    node.uses_computed = false;
    node.uses_value = null;
    node.effectivelyFinal_computed = false;
    node.refEscapes_computed = false;
    node.isDedicatedLock_computed = false;
    node.assignedExprs_computed = false;
    node.assignedExprs_value = null;
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
    node.creamVariable_Network_values = null;
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
  public FieldDeclaration copy() {
    try {
      FieldDeclaration node = (FieldDeclaration) clone();
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
  public FieldDeclaration fullCopy() {
    FieldDeclaration tree = (FieldDeclaration) copy();
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
   * @aspect BoundNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.jrag:11
   */
  public Access createQualifiedBoundAccess() {
    if(isStatic())
      return hostType().createQualifiedAccess().qualifiesAccess(new BoundFieldAccess(this));
    else
      return new ThisAccess("this").qualifiesAccess(
        new BoundFieldAccess(this));
  }
  /**
   * @ast method 
   * @aspect BoundNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.jrag:86
   */
  public Access createBoundFieldAccess() {
    return createQualifiedBoundAccess();
  }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:81
   */
  public SimpleSet add(Object o) {
    return new SimpleSetImpl().add(this).add(o);
  }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:85
   */
  public boolean isSingleton() { return true; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:86
   */
  public boolean isSingleton(Object o) { return contains(o); }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:89
   */
  
  private FieldDeclaration iterElem;
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:90
   */
  public Iterator iterator() { iterElem = this; return this; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:91
   */
  public boolean hasNext() { return iterElem != null; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:92
   */
  public Object next() { Object o = iterElem; iterElem = null; return o; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:93
   */
  public void remove() { throw new UnsupportedOperationException(); }
  /**
   * @ast method 
   * @aspect DefiniteAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:177
   */
  public void definiteAssignment() {
    super.definiteAssignment();
    if(isBlank() && isFinal() && isClassVariable()) {
      boolean found = false;
      TypeDecl typeDecl = hostType();
      for(int i = 0; i < typeDecl.getNumBodyDecl(); i++) {
        if(typeDecl.getBodyDecl(i) instanceof StaticInitializer) {
          StaticInitializer s = (StaticInitializer)typeDecl.getBodyDecl(i);
          if(s.isDAafter(this))
            found = true;
        }
        
        else if(typeDecl.getBodyDecl(i) instanceof FieldDeclaration) {
          FieldDeclaration f = (FieldDeclaration)typeDecl.getBodyDecl(i);
          if(f.isStatic() && f.isDAafter(this))
            found = true;
        }
        
      }
      if(!found)
        error("blank final class variable " + name() + " in " + hostType().typeName() + " is not definitely assigned in static initializer");

    }
    if(isBlank() && isFinal() && isInstanceVariable()) {
      TypeDecl typeDecl = hostType();
      boolean found = false;
      for(int i = 0; !found && i < typeDecl.getNumBodyDecl(); i++) {
        if(typeDecl.getBodyDecl(i) instanceof FieldDeclaration) {
          FieldDeclaration f = (FieldDeclaration)typeDecl.getBodyDecl(i);
          if(!f.isStatic() && f.isDAafter(this))
            found = true;
        }
        else if(typeDecl.getBodyDecl(i) instanceof InstanceInitializer) {
          InstanceInitializer ii = (InstanceInitializer)typeDecl.getBodyDecl(i);
          if(ii.getBlock().isDAafter(this))
            found = true;
        }
      }
      for(Iterator iter = typeDecl.constructors().iterator(); !found && iter.hasNext(); ) {
        ConstructorDecl c = (ConstructorDecl)iter.next();
        if(!c.isDAafter(this)) {
          error("blank final instance variable " + name() + " in " + hostType().typeName() + " is not definitely assigned after " + c.signature());
          }
      }
    }
    if(isBlank() && hostType().isInterfaceDecl()) {
            error("variable  " + name() + " in " + hostType().typeName() + " which is an interface must have an initializer");
    }

  }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:114
   */
  public void checkModifiers() {
    super.checkModifiers();
    if(hostType().isInterfaceDecl()) {
      if(isProtected())
        error("an interface field may not be protected");
      if(isPrivate())
        error("an interface field may not be private");
      if(isTransient())
        error("an interface field may not be transient");
      if(isVolatile())
        error("an interface field may not be volatile");
    }
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:282
   */
  public void nameCheck() {
    super.nameCheck();
    // 8.3
    for(Iterator iter = hostType().memberFields(name()).iterator(); iter.hasNext(); ) {
      Variable v = (Variable)iter.next();
      if(v != this && v.hostType() == hostType())
        error("field named " + name() + " is multiply declared in type " + hostType().typeName());
    }

  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:86
   */
  public FieldDeclaration(Modifiers m, Access type, String name) {
    this(m, type, name, new Opt());
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:90
   */
  public FieldDeclaration(Modifiers m, Access type, String name, Expr init) {
    this(m, type, name, new Opt(init));
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:152
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:33
   */
  public void typeCheck() {
    if(hasInit()) {
      TypeDecl source = getInit().type();
      TypeDecl dest = type();
      if(!source.assignConversionTo(dest, getInit()))
        error("can not assign field " + name() + " of type " + dest.typeName() +
              " a value of type " + source.typeName());
    }
  }
  /**
   * @ast method 
   * @aspect VariableDeclarationTransformation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:91
   */
  
  // when splitting a FieldDecl into multiple FieldDeclarations, provide every FieldDeclaration with a reference
  // to the original FieldDecl; if only a single FieldDeclaration results, no reference is stored
  private FieldDecl fieldDecl = null;
  /**
   * @ast method 
   * @aspect VariableDeclarationTransformation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:92
   */
  public FieldDecl getFieldDecl() {
	  return fieldDecl;
  }
  /**
   * @ast method 
   * @aspect VariableDeclarationTransformation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:95
   */
  public void setFieldDecl(FieldDecl fieldDecl) {
	  this.fieldDecl = fieldDecl;
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1295
   */
  public BodyDecl substitutedBodyDecl(Parameterization parTypeDecl) {
    FieldDeclaration f = new FieldDeclarationSubstituted(
      (Modifiers)getModifiers().fullCopy(),
      getTypeAccess().type().substituteReturnType(parTypeDecl),
      getID(),
      new Opt(),
      this
    );
    return f;
  }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:11
   */
  public boolean isHeapLocation() { return !isConstant(); }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:14
   */
  public boolean refined_Alias_FieldDeclaration_mayAlias(Location l) { return this == l || l instanceof AnyHeapLocation; }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:16
   */
  public boolean mustAlias(Location l) { return isStatic() && this == l;	}
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:47
   */
  public void makeModifiersExplicit() {
		if(hostType().isInterfaceDecl())
			getModifiers().addModifiers("public", "static", "final");
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:162
   */
  public FieldDeclaration findField(String name) {
		if(name().equals(name))
			return this;
		return super.findField(name);
	}
  /**
   * @ast method 
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:104
   */
  public boolean isUsed() {
		return !uses().isEmpty() || isStatic() && !staticImports().isEmpty();
	}
  /**
   * @ast method 
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:8
   */
  public MethodDecl createGetter() {
		String getter_name = type().isBoolean() ? "is"+capitalisedName() : "get"+capitalisedName();
		Modifiers old_mods = (Modifiers)getModifiers().fullCopyAndDetach();
		old_mods.removeModifier("final");
		MethodDecl getter = new MethodDecl(old_mods, type().createLockedAccess(), getter_name, new List<ParameterDeclaration>(),
										   new List<Access>(), new Opt<Block>(new Block(new ReturnStmt(new VarAccess(name())))));
		hostType().insertUnusedMethod(getter);
		hostType().flushCaches();
		return getter;
	}
  /**
   * @ast method 
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:19
   */
  public MethodDecl createSetter() {
		String setter_name = "set"+capitalisedName();
		Modifiers old_mods = (Modifiers)getModifiers().fullCopyAndDetach();
		old_mods.removeModifier("final");
		ParameterDeclaration parm = new ParameterDeclaration(type().createLockedAccess(), name());
		MethodDecl setter = new MethodDecl(old_mods, type().createLockedAccess(), setter_name, 
				  					      new List<ParameterDeclaration>().add(parm), new List<Access>(),
				  					      new Opt<Block>(new Block(new ReturnStmt(new AssignSimpleExpr(this.createLockedAccess(), 
				  					    		  													   parm.createLockedAccess())))));
		hostType().insertUnusedMethod(setter);
		hostType().flushCaches();
		return setter;
	}
  /**
   * @ast method 
   * @aspect AccessibilityConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityConstraints.jrag:211
   */
  
	private Collection<AccessibilityConstraint> referencingAccessibilityConstraints = new HashSet<AccessibilityConstraint>();
  /**
   * @ast method 
   * @aspect ChangeAccessibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/ChangeAccessibility.jrag:37
   */
  public boolean isAnonymousType(){return false;}
  /**
   * @ast method 
   * @aspect InlineConstant
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineConstant.jrag:2
   */
  public void inlineConstant(boolean remove) {
		if(hasInit())
			setInit(getInit().makeConversionExplicit(type()));
		for(VarAccess va : uses())
			va.inlineConstant();
		programRoot().flushCaches();
		if(remove)
			removeUnused();
	}
  /**
   * @ast method 
   * @aspect InlineConstant
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineConstant.jrag:33
   */
  public void doInlineConstant(boolean remove) {
		Program root = programRoot();
		inlineConstant(remove);
		root.eliminate(LOCKED_NAMES, LOCKED_DATAFLOW);
	}
  /**
   * @ast method 
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:49
   */
  
	
	private Collection<TypeDecl> possibleTypes = new HashSet<TypeDecl>();
  /**
   * @ast method 
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:50
   */
  public Collection<TypeDecl> possibleTypes() {
		return possibleTypes;
	}
  /**
   * @ast method 
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:53
   */
  public void computePossibleTypes() {
		possibleTypes.clear();
		Collection<Expr> exprs = assignedExprs();
		if(exprs == null)
			return;
		for(Expr e : exprs) {
			if(e instanceof NullLiteral)
				continue;
			if(e instanceof ClassInstanceExpr || e instanceof ArrayCreationExpr) {
				possibleTypes.add(e.type());
			} else {
				possibleTypes.clear();
				return;
			}
		}
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:21
   */
  public void moveTo(TypeDecl target) {
		if(!target.fromSource())
			throw new RefactoringException("cannot insert field into library class");
		if(hasInit())
			getInit().lockDataFlow();
		else if(isFinal())
			throw new RefactoringException("cannot move uninitialised final field");
		for(ThisAccess acc : collectThisAccesses())
				if(acc.isQualified())
					throw new RefactoringException("Pull Up cannot preserve enclosing instances");
		
		lockAllNames();
		programRoot().lockNames(name());
		hostType().removeBodyDecl(this);
		target.insertField(this);
		
		// check that everything went OK wrt types
		Collection<TypeConstraint> typeConstraints =
			programRoot().typeConstraints(new Predicate<TypeConstraint>() {
				public boolean holds(TypeConstraint constr) {
					return constr.relevantForSubtree(FieldDeclaration.this);
				}
			});
		for(TypeConstraint typeConstraint : typeConstraints)
			if(!typeConstraint.solved())
				if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond1.isEnabled())
					throw new RefactoringException("type constraint violated: " + typeConstraint.describe());
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:118
   */
  protected void collectAllFieldAndTypeNames(Collection<String> res) {
		res.add(name());
		super.collectAllFieldAndTypeNames(res);
	}
  /**
   * @ast method 
   * @aspect RemoveField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PromoteTempToField/RemoveField.jrag:2
   */
  public void removeUnused() {
		if(!isUsed() && (!hasInit() || getInit().isPure()))
			getParent().removeChild(getChildIndex());
	}
  /**
	 * The Push Down Field Refactoring.
	 * 
	 * Preconditions:
	 *  - if field to be pushed has initialiser, that initialiser has to be constant
	 *  - host type cannot have more than one child type
	 *  - that child type cannot already contain a field with the same name
	 *  
	 * The preconditions ensure that it is enough to adjust all accesses to
	 * the field being pushed and all accesses within its initialiser.
	 * 
	 * If pushing from an interface to a class, we need to make the pushed
	 * field public and static.
	 * @ast method 
   * @aspect PushDownField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownField.jrag:16
   */
  public void pushDown() {
		if(hasInit() && !getInit().isConstant())
			throw new RefactoringException("cannot push fields with non-constant initialiser");
		Collection<TypeDecl> children = hostType().childTypes();
		if (ConditionsPushDownField.cond2) {
			if(children.size() != 1)
				throw new RefactoringException("can only push down to exactly one subclass");
		}
		TypeDecl child = children.iterator().next();
		if(!child.localFields(name()).isEmpty())
			throw new RefactoringException("field with that name already exists");
		if(hostType().isInterfaceDecl() && !child.isInterfaceDecl())
			getModifiers().addModifiers("public", "static");
		lockAllNames();
		programRoot().lockNames(name());
		hostType().removeBodyDecl(this);
		child.addBodyDecl(this);
		programRoot().flushCaches();
	}
  /**
   * @ast method 
   * @aspect PushDownField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownField.jrag:34
   */
  public void doPushDown() {
    	pushDown();
    	programRoot().eliminate(LOCKED_NAMES);
    }
  /**
   * @ast method 
   * @aspect RenameVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameVariable.jrag:17
   */
  public void checkRenamingPreconds(String new_name) {
		if(!hostType().localFields(new_name).isEmpty())
			throw new RefactoringException("field named "+new_name+" exists");
	}
  /**
   * @ast method 
   * @aspect SelfEncapsulateField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/SelfEncapsulateField/SelfEncapsulateField.jrag:2
   */
  public void selfEncapsulate() {
		MethodDecl getter = createGetter();
		MethodDecl setter = null;
		if(!isFinal())
			setter = createSetter();
		
		programRoot().lockNames(name());
		ArrayList<VarAccess> uses = usesOfAllCopies();
		for(int i=0;i<uses.size();++i) {
			VarAccess va = uses.get(i);
			if(va.hostBodyDecl() == getter || va.hostBodyDecl() == setter)
				continue;
			TypeDecl receiver_type = va.decl().hostType();
			if(va.isDest()) {
				// constructors can write final fields
				if(setter == null)
					continue;
				va.unfoldAbbrevAssign(uses);
				ASTNode p = va;
				if(va.isRightChildOfDot())
					p = va.getParent();
				if(p.getParent() instanceof AssignSimpleExpr && p.getChildIndex() == 0) {
					AssignSimpleExpr assgn = (AssignSimpleExpr)p.getParent();
					Access setter_invocation = setter.copyIn(receiver_type).createLockedAccess(new List<Expr>().add(assgn.getSource()));
					if(va.isQualified())
						setter_invocation = va.qualifier().qualifiesAccess(setter_invocation);
					assgn.replaceWith(setter_invocation);
				} else {
					throw new RefactoringException("cannot encapsulate this access");
				}
			} else {
				va.replaceWith(getter.copyIn(receiver_type).createLockedAccess(new List<Expr>()));
			}
		}
		
		getModifiers().setVisibility(VIS_PRIVATE);
		programRoot().flushCaches();
	}
  /**
   * @ast method 
   * @aspect SelfEncapsulateField
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/SelfEncapsulateField/SelfEncapsulateField.jrag:41
   */
  public void doSelfEncapsulate() {
		selfEncapsulate();
		programRoot().eliminate(LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:63
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
		for(FieldDeclaration that : hiddenFields())
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "field hiding", this, Operator.LT, that));
		super.collectTypeConstraints(pred, constraints);
	}
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
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:32
   */
  public int getVisibility() {
		if(isPrivate()) return VIS_PRIVATE;
		if(isProtected()) return VIS_PROTECTED;
		if(isPublic()) return VIS_PUBLIC;
		return VIS_PACKAGE;
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:39
   */
  public void setVisibility(int vis) {
		getModifiers().setVisibility(vis);
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:100
   */
  public void collectSourceVisibles(Collection<Visible> visibles) {
		visibles.add(this);
		super.collectSourceVisibles(visibles);
	}
  /**
   * @ast method 
   * @aspect AccessibilityConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityConstraints.jrag:214
   */
  public Collection<AccessibilityConstraint> referencingAccessibilityConstraints(){
		return referencingAccessibilityConstraints;
	}
  /**
   * @ast method 
   * @aspect AccessibilityConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityConstraints.jrag:217
   */
  public void refined_AccessibilityConstraints_Visible_referencedBy(AccessibilityConstraint c){
		referencingAccessibilityConstraints.add(c);
	}
  /**
   * @ast method 
   * @aspect ChangeAccessibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/ChangeAccessibility.jrag:4
   */
  public void changeAccessibility(int v) {
		// TODO: array decls are fromSource(); maybe that should be changed in general?
		if(!fromSource())
			throw new RefactoringException("cannot change accessibility of non-source type");
		if(isAnonymousType())
			throw new RefactoringException("cannot change accessibility of anonymous type");
		Collection<AccessibilityConstraint> constraints = programRoot().accessibilityConstraints();
		constraints.add(new AccessibilityConstraint(this, this, Operator.EQ, v));
		Map<Visible, Integer> acc_map = programRoot().solve(constraints);
		if(acc_map == null) {
			throw new RefactoringException("no solution found");
		} else {
			for(Map.Entry<Visible, Integer> e : acc_map.entrySet()) {
				Visible vis = e.getKey();
				// TODO: hide this behind an interface
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
			programRoot().eliminate(LOCKED_NAMES);
		}
	}
  /**
   * @ast method 
   * @aspect AccessibilityGlue
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityGlue.jrag:71
   */
    public void referencedBy(final AccessibilityConstraint c) {
		refined_AccessibilityConstraints_Visible_referencedBy(c);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				@Override
				public void undo() {
					referencingAccessibilityConstraints.remove(c);
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_AccessibilityConstraints_Visible_referencedBy(c);
				}
			
				@Override
				public String toString() {
					return "Visible.referencedBy";
				}
			});
		}
	}
  /**
   * @ast method 
   * 
   */
  public FieldDeclaration() {
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
  public FieldDeclaration(Modifiers p0, Access p1, String p2, Opt<Expr> p3) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
  }
  /**
   * @ast method 
   * 
   */
  public FieldDeclaration(Modifiers p0, Access p1, beaver.Symbol p2, Opt<Expr> p3) {
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
  public void refined__FieldDeclaration_setID(String value) {
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
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:114
   */
    public boolean mayAlias(Location l) {
		return l instanceof FieldInReceiver && this == ((FieldInReceiver)l).getField()
			|| refined_Alias_FieldDeclaration_mayAlias(l);
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:971
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__FieldDeclaration_setID(oldValue);
				}
				@Override
				public String toString() {
					return "FieldDeclaration.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__FieldDeclaration_setID(value);
				}
			});
		}
		refined__FieldDeclaration_setID(value);
	}
  protected java.util.Map accessibleFrom_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect AccessControl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:109
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean accessibleFrom(TypeDecl type) {
    Object _parameters = type;
    if(accessibleFrom_TypeDecl_values == null) accessibleFrom_TypeDecl_values = new java.util.HashMap(4);
    if(accessibleFrom_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)accessibleFrom_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean accessibleFrom_TypeDecl_value = accessibleFrom_compute(type);
      if(isFinal && num == state().boundariesCrossed) accessibleFrom_TypeDecl_values.put(_parameters, Boolean.valueOf(accessibleFrom_TypeDecl_value));
    return accessibleFrom_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean accessibleFrom_compute(TypeDecl type) {
    if(isPublic())
      return true;
    else if(isProtected()) {
      if(hostPackage().equals(type.hostPackage()))
        return true;
      if(type.withinBodyThatSubclasses(hostType()) != null)
        return true;
      return false;
    }
    else if(isPrivate())
      return hostType().topLevelType() == type.topLevelType();
    else
      return hostPackage().equals(type.hostPackage());
  }
  /**
   * @apilevel internal
   */
  protected boolean exceptions_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection exceptions_value;
  /**
   * @attribute syn
   * @aspect AnonymousClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AnonymousClasses.jrag:178
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection exceptions() {
    if(exceptions_computed) {
      return exceptions_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    exceptions_value = exceptions_compute();
      if(isFinal && num == state().boundariesCrossed) exceptions_computed = true;
    return exceptions_value;
  }
  /**
   * @apilevel internal
   */
  private Collection exceptions_compute() {
    HashSet set = new HashSet();
    if(isInstanceVariable() && hasInit()) {
      collectExceptions(set, this);
      for(Iterator iter = set.iterator(); iter.hasNext(); ) {
        TypeDecl typeDecl = (TypeDecl)iter.next();
        if(!getInit().reachedException(typeDecl))
          iter.remove();
      }
    }
    return set;
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:478
   */
  public boolean isConstant() {
    ASTNode$State state = state();
    try {  return isFinal() && hasInit() && getInit().isConstant() && (type() instanceof PrimitiveType || type().isString());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:79
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:80
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:84
   */
  public boolean contains(Object o) {
    ASTNode$State state = state();
    try {  return this == o;  }
    finally {
    }
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:314
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:771
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
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:214
   */
  public boolean isSynthetic() {
    ASTNode$State state = state();
    try {  return getModifiers().isSynthetic();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:239
   */
  public boolean isPublic() {
    ASTNode$State state = state();
    try {  return getModifiers().isPublic() || hostType().isInterfaceDecl();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:240
   */
  public boolean isPrivate() {
    ASTNode$State state = state();
    try {  return getModifiers().isPrivate();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:241
   */
  public boolean isProtected() {
    ASTNode$State state = state();
    try {  return getModifiers().isProtected();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:242
   */
  public boolean isStatic() {
    ASTNode$State state = state();
    try {  return getModifiers().isStatic() || hostType().isInterfaceDecl();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:244
   */
  public boolean isFinal() {
    ASTNode$State state = state();
    try {  return getModifiers().isFinal() || hostType().isInterfaceDecl();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:245
   */
  public boolean isTransient() {
    ASTNode$State state = state();
    try {  return getModifiers().isTransient();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:246
   */
  public boolean isVolatile() {
    ASTNode$State state = state();
    try {  return getModifiers().isVolatile();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:251
   */
  public TypeDecl type() {
    ASTNode$State state = state();
    try {  return getTypeAccess().type();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:271
   */
  public boolean isVoid() {
    ASTNode$State state = state();
    try {  return type().isVoid();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:32
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:34
   */
  public boolean isClassVariable() {
    ASTNode$State state = state();
    try {  return isStatic() || hostType().isInterfaceDecl();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:35
   */
  public boolean isInstanceVariable() {
    ASTNode$State state = state();
    try {  return (hostType().isClassDecl() || hostType().isAnonymous() )&& !isStatic();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Variables
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:36
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:37
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:38
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:39
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:41
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:43
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:44
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
   * @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:283
   */
  public boolean hasAnnotationSuppressWarnings(String s) {
    ASTNode$State state = state();
    try {  return getModifiers().hasAnnotationSuppressWarnings(s);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:325
   */
  public boolean isDeprecated() {
    ASTNode$State state = state();
    try {  return getModifiers().hasDeprecatedAnnotation();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean usesTypeVariable_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean usesTypeVariable_value;
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1065
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean usesTypeVariable() {
    if(usesTypeVariable_computed) {
      return usesTypeVariable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    usesTypeVariable_value = usesTypeVariable_compute();
      if(isFinal && num == state().boundariesCrossed) usesTypeVariable_computed = true;
    return usesTypeVariable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean usesTypeVariable_compute() {  return getTypeAccess().usesTypeVariable();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1521
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
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsParTypeDecl.jrag:67
   */
  public boolean visibleTypeParameters() {
    ASTNode$State state = state();
    try {  return !isStatic();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:139
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return this == l;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:140
   */
  public boolean isBlockingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:141
   */
  public boolean isReachedUseFor(Location l) {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:6
   */
  public String capitalisedName() {
    ASTNode$State state = state();
    try {  return Character.toUpperCase(name().charAt(0))+name().substring(1);  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean usesOfAllCopies_computed = false;
  /**
   * @apilevel internal
   */
  protected ArrayList<VarAccess> usesOfAllCopies_value;
  /**
   * @attribute syn
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:35
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ArrayList<VarAccess> usesOfAllCopies() {
    if(usesOfAllCopies_computed) {
      return usesOfAllCopies_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    usesOfAllCopies_value = usesOfAllCopies_compute();
      if(isFinal && num == state().boundariesCrossed) usesOfAllCopies_computed = true;
    return usesOfAllCopies_value;
  }
  /**
   * @apilevel internal
   */
  private ArrayList<VarAccess> usesOfAllCopies_compute() {
		ArrayList<VarAccess> col = new ArrayList<VarAccess>();
		programRoot().collectFieldUsesWithCopies(this, name(), col);
		return col;
	}
  /**
   * @apilevel internal
   */
  protected boolean hiddenFields_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<FieldDeclaration> hiddenFields_value;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:194
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<FieldDeclaration> hiddenFields() {
    if(hiddenFields_computed) {
      return hiddenFields_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    hiddenFields_value = hiddenFields_compute();
      if(isFinal && num == state().boundariesCrossed) hiddenFields_computed = true;
    return hiddenFields_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<FieldDeclaration> hiddenFields_compute() {
		Collection<FieldDeclaration> res = new LinkedHashSet<FieldDeclaration>();
		for(TypeDecl std : hostType().supertypes()) {
			for(Iterator<FieldDeclaration> iter=std.memberFields(name()).iterator();iter.hasNext();) {
				FieldDeclaration that = iter.next();
				if(that.accessibleFrom(hostType()))
					res.add(that);
			}
		}
		return res;
	}
  /**
   * @attribute syn
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:4
   */
  public Variable refreshVariable() {
    ASTNode$State state = state();
    try {
		// the "length" field of array types is synthesised anew for every new array type
		if(name().equals("length") && hostType().isArrayDecl())
			return (FieldDeclaration)hostType().refresh().localFields("length").iterator().next();
		return this;
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean uses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<VarAccess> uses_value;
  /**
   * @attribute syn
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:8
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<VarAccess> uses() {
    if(uses_computed) {
      return uses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uses_value = uses_compute();
      if(isFinal && num == state().boundariesCrossed) uses_computed = true;
    return uses_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<VarAccess> uses_compute() {
		Collection<VarAccess> col = new LinkedList<VarAccess>();
		programRoot().collectFieldUses(this, name(), col);
		return col;
	}
  /**
   * @attribute syn
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:16
   */
  public boolean mayBeFinal() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean effectivelyFinal_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean effectivelyFinal_value;
  /**
   * @attribute syn
   * @aspect FieldAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean effectivelyFinal() {
    if(effectivelyFinal_computed) {
      return effectivelyFinal_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    effectivelyFinal_value = effectivelyFinal_compute();
      if(isFinal && num == state().boundariesCrossed) effectivelyFinal_computed = true;
    return effectivelyFinal_value;
  }
  /**
   * @apilevel internal
   */
  private boolean effectivelyFinal_compute() {
		if(isFinal())
			return true;
		if(!hasInit())
			return false;
		for(VarAccess va : allUses())
			if(va.isDest())
				return false;
		return true;
	}
  /**
   * @apilevel internal
   */
  protected boolean refEscapes_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean refEscapes_value;
  /**
   * @attribute syn
   * @aspect FieldAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean refEscapes() {
    if(refEscapes_computed) {
      return refEscapes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    refEscapes_value = refEscapes_compute();
      if(isFinal && num == state().boundariesCrossed) refEscapes_computed = true;
    return refEscapes_value;
  }
  /**
   * @apilevel internal
   */
  private boolean refEscapes_compute() {
		if(isDedicatedLock())
			return false;
		if(hasInit() && !(getInit() instanceof NullLiteral || getInit() instanceof ClassInstanceExpr || getInit() instanceof ArrayCreationExpr))
			return true;
		computePossibleTypes();
		for(VarAccess va : allUses()) {
			if(va.isSource() && va.escapes())
				return true;
			if(va.isDest()) {
				// assignments are OK, as long as we either assign null or a fresh object
				AssignExpr assgn = va.modifyingAssignExpr();
				if(assgn == null)
					return true;
				Expr rhs = assgn.getSource();
				if(!(rhs instanceof NullLiteral || rhs instanceof ClassInstanceExpr || rhs instanceof ArrayCreationExpr))
					return true;
			}
		}
		return false;
	}
  /**
   * @apilevel internal
   */
  protected boolean isDedicatedLock_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isDedicatedLock_value;
  /**
   * @attribute syn
   * @aspect FieldAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:35
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDedicatedLock() {
    if(isDedicatedLock_computed) {
      return isDedicatedLock_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isDedicatedLock_value = isDedicatedLock_compute();
      if(isFinal && num == state().boundariesCrossed) isDedicatedLock_computed = true;
    return isDedicatedLock_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDedicatedLock_compute() {
		for(VarAccess va : allUses()) {
			Expr e = va.unqualifiedScope();
			ASTNode p = e.getParent();
			if(!(p instanceof SynchronizedStmt) || e != ((SynchronizedStmt)p).getExpr())
				return false;
		}
		return true;
	}
  /**
   * @apilevel internal
   */
  protected boolean assignedExprs_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<Expr> assignedExprs_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/TypeAnalysis.jrag:70
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<Expr> assignedExprs() {
    if(assignedExprs_computed) {
      return assignedExprs_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    assignedExprs_value = assignedExprs_compute();
      if(isFinal && num == state().boundariesCrossed) assignedExprs_computed = true;
    return assignedExprs_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<Expr> assignedExprs_compute() {
		LinkedList<Expr> res = new LinkedList<Expr>();
		if(hasInit())
			res.add(getInit());
		for(VarAccess va : allUses()) {
			if(va.isDest()) {
				AssignExpr assgn = va.modifyingAssignExpr();
				if(assgn == null)
					return null;
				else
					res.add(assgn.getSource());
			}
		}
		return res;
	}
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:185
   */
  public String describeConstraintVariable() {
    ASTNode$State state = state();
    try {  return "Decl(" + name() + ")";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:30
   */
  public String ppID() {
    ASTNode$State state = state();
    try {  return name();  }
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
  protected java.util.Map creamVariable_Network_values;
  /**
   * @attribute syn
   * @aspect Cream
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/SolverCream.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public IntVariable creamVariable(Network network) {
    Object _parameters = network;
    if(creamVariable_Network_values == null) creamVariable_Network_values = new java.util.HashMap(4);
    if(creamVariable_Network_values.containsKey(_parameters)) {
      return (IntVariable)creamVariable_Network_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    IntVariable creamVariable_Network_value = creamVariable_compute(network);
      if(isFinal && num == state().boundariesCrossed) creamVariable_Network_values.put(_parameters, creamVariable_Network_value);
    return creamVariable_Network_value;
  }
  /**
   * @apilevel internal
   */
  private IntVariable creamVariable_compute(Network network) {  return new IntVariable(network, VIS_PRIVATE, VIS_PUBLIC, name());  }
  /**
   * @attribute inh
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:48
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean handlesException(TypeDecl exceptionType) {
    ASTNode$State state = state();
    boolean handlesException_TypeDecl_value = getParent().Define_boolean_handlesException(this, null, exceptionType);
    return handlesException_TypeDecl_value;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:39
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:320
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getInitOptNoTransform()){
    return isDAbefore(v);
  }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:166
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    if(caller == getInitOptNoTransform()){
    if(hostType().isAnonymous())
      return true;
    if(!exceptionType.isUncheckedException())
      return true;
    for(Iterator iter = hostType().constructors().iterator(); iter.hasNext(); ) {
      ConstructorDecl decl = (ConstructorDecl)iter.next();
      if(!decl.throwsException(exceptionType))
        return false;
    }
    return true;
  }
    else {      return getParent().Define_boolean_handlesException(this, caller, exceptionType);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:262
   * @apilevel internal
   */
  public boolean Define_boolean_mayBePublic(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBePublic(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:263
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeProtected(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeProtected(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:264
   * @apilevel internal
   */
  public boolean Define_boolean_mayBePrivate(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBePrivate(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:265
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeStatic(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeStatic(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:266
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:267
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeTransient(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeTransient(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:268
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeVolatile(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeVolatile(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:78
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:260
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:141
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
    if(caller == getInitOptNoTransform()) {
      return isStatic() || hostType().isInterfaceDecl();
    }
    else {      return getParent().Define_boolean_inStaticContext(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:80
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    if(caller == getModifiersNoTransform()) {
      return name.equals("FIELD");
    }
    else {      return getParent().Define_boolean_mayUseAnnotationTarget(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:35
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:120
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == exit_value){
      return getFollowingFieldOrInitializer(isStatic());
    }
    else if(caller == getInitOptNoTransform()) {
      return SmallSet.<CFGNode>singleton(exit());
    }
    else if(caller == entry_value){
      return SmallSet.<CFGNode>singleton(hasInit() ? getInit().first() : exit());
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:8
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:51
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
  protected boolean FieldDeclaration_staticImports_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<StaticImportDecl> FieldDeclaration_staticImports_value;
  /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:108
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<StaticImportDecl> staticImports() {
    if(FieldDeclaration_staticImports_computed) {
      return FieldDeclaration_staticImports_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    FieldDeclaration_staticImports_value = staticImports_compute();
      if(isFinal && num == state().boundariesCrossed) FieldDeclaration_staticImports_computed = true;
    return FieldDeclaration_staticImports_value;
  }
  java.util.Set FieldDeclaration_staticImports_contributors;
  public java.util.Set FieldDeclaration_staticImports_contributors() {
    if(FieldDeclaration_staticImports_contributors == null) FieldDeclaration_staticImports_contributors  = new ASTNode$State.IdentityHashSet(4);
    return FieldDeclaration_staticImports_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<StaticImportDecl> staticImports_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_FieldDeclaration_staticImports();
    FieldDeclaration_staticImports_value = new HashSet<StaticImportDecl>();
    if(FieldDeclaration_staticImports_contributors != null)
    for(java.util.Iterator iter = FieldDeclaration_staticImports_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_FieldDeclaration_FieldDeclaration_staticImports(FieldDeclaration_staticImports_value);
    }
    return FieldDeclaration_staticImports_value;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:41
   */
    for(java.util.Iterator iter = (succ()).iterator(); iter.hasNext(); ) {
      CFGNode ref = (CFGNode)iter.next();
      if(ref != null)
      ref.CFGNode_collPred_contributors().add(this);
    }
    super.collect_contributors_CFGNode_collPred();
  }
  protected void collect_contributors_Program_accessibilityConstraints() {
    /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:156
   */
    if(hostType().isInterfaceDecl()) {
    {
      Program ref = (Program)(programRoot());
      if(ref != null)
        ref.Program_accessibilityConstraints_contributors().add(this);
      }    }
    super.collect_contributors_Program_accessibilityConstraints();
  }
  protected void contributeTo_CFGNode_CFGNode_collPred(SmallSet<CFGNode> collection) {
    super.contributeTo_CFGNode_CFGNode_collPred(collection);
    collection.add(this);
  }

  protected void contributeTo_Program_Program_accessibilityConstraints(Collection<AccessibilityConstraint> collection) {
    super.contributeTo_Program_Program_accessibilityConstraints(collection);
    if(hostType().isInterfaceDecl())
      collection.addAll(Collections.singleton(new AccessibilityConstraint(this, this, Operator.EQ, AccessModifierConstant.PUBLIC)));
  }

}
