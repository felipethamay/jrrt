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
import tests.jdolly.ConditionsAddParameter;
import tests.jdolly.ConditionsManagement;
import tests.jdolly.ConditionsMoveMethod;
import tests.jdolly.ConditionsPullUpMethod;
import tests.jdolly.ConditionsRenameMethod;
import tests.jdolly.Conditions_;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import junit.framework.TestCase;
import junit.framework.TestSuite;
/**
 * @production MethodDecl : {@link MemberDecl} ::= <span class="component">{@link Modifiers}</span> <span class="component">TypeAccess:{@link Access}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">Parameter:{@link ParameterDeclaration}*</span> <span class="component">Exception:{@link Access}*</span> <span class="component">[{@link Block}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:95
 */
public class MethodDecl extends MemberDecl implements Cloneable, SimpleSet, Iterator, Callable, TypedDeclaration, Visible, MonitorAction {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    accessibleFrom_TypeDecl_values = null;
    throwsException_TypeDecl_values = null;
    signature_computed = false;
    signature_value = null;
    moreSpecificThan_MethodDecl_values = null;
    overrides_MethodDecl_values = null;
    hides_MethodDecl_values = null;
    parameterDeclaration_String_values = null;
    type_computed = false;
    type_value = null;
    usesTypeVariable_computed = false;
    sourceMethodDecl_computed = false;
    sourceMethodDecl_value = null;
    isPure_computed = false;
    uncheckedExceptionExit_computed = false;
    uncheckedExceptionExit_value = null;
    isCallable_computed = false;
    monoUses_computed = false;
    monoUses_value = null;
    isDynamicallyCallable_computed = false;
    inheritingTypes_computed = false;
    inheritingTypes_value = null;
    ancestorIn_TypeDecl_values = null;
    relatives_computed = false;
    relatives_value = null;
    isCallableFromOutside_computed = false;
    isReferencedFromOutside_computed = false;
    canOverrideOrHide_MethodDecl_values = null;
    overriddenMethods_computed = false;
    overriddenMethods_value = null;
    hiddenMethods_computed = false;
    hiddenMethods_value = null;
    rootDefs_computed = false;
    rootDefs_value = null;
    indirectlyOverriddenMethods_computed = false;
    indirectlyOverriddenMethods_value = null;
    possiblyHiddenMethods_computed = false;
    possiblyHiddenMethods_value = null;
    uses_computed = false;
    uses_value = null;
    isGetterFor_FieldDeclaration_values = null;
    accessibilityConstraintsFromOverridingAndHiding_computed = false;
    accessibilityConstraintsFromOverridingAndHiding_value = null;
    isMainMethod_computed = false;
    thisEscapes_computed = false;
    getAcquiredMonitor_computed = false;
    getAcquiredMonitor_value = null;
    getMonitorExpr_computed = false;
    getMonitorExpr_value = null;
    getIndexOfParameter_String_values = null;
    throwsExactException_TypeDecl_values = null;
    accessParameter_Variable_values = null;
    creamVariable_Network_values = null;
    handlesException_TypeDecl_values = null;
    MethodDecl_coll_overridingMethods_computed = false;
    MethodDecl_coll_overridingMethods_value = null;
    MethodDecl_coll_overridingMethods_contributors = null;
    MethodDecl_polyUses__computed = false;
    MethodDecl_polyUses__value = null;
    MethodDecl_polyUses__contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    MethodDecl_coll_overridingMethods_computed = false;
    MethodDecl_coll_overridingMethods_value = null;
    MethodDecl_coll_overridingMethods_contributors = null;
    MethodDecl_polyUses__computed = false;
    MethodDecl_polyUses__value = null;
    MethodDecl_polyUses__contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl clone() throws CloneNotSupportedException {
    MethodDecl node = (MethodDecl)super.clone();
    node.accessibleFrom_TypeDecl_values = null;
    node.throwsException_TypeDecl_values = null;
    node.signature_computed = false;
    node.signature_value = null;
    node.moreSpecificThan_MethodDecl_values = null;
    node.overrides_MethodDecl_values = null;
    node.hides_MethodDecl_values = null;
    node.parameterDeclaration_String_values = null;
    node.type_computed = false;
    node.type_value = null;
    node.usesTypeVariable_computed = false;
    node.sourceMethodDecl_computed = false;
    node.sourceMethodDecl_value = null;
    node.isPure_computed = false;
    node.uncheckedExceptionExit_computed = false;
    node.uncheckedExceptionExit_value = null;
    node.isCallable_computed = false;
    node.monoUses_computed = false;
    node.monoUses_value = null;
    node.isDynamicallyCallable_computed = false;
    node.inheritingTypes_computed = false;
    node.inheritingTypes_value = null;
    node.ancestorIn_TypeDecl_values = null;
    node.relatives_computed = false;
    node.relatives_value = null;
    node.isCallableFromOutside_computed = false;
    node.isReferencedFromOutside_computed = false;
    node.canOverrideOrHide_MethodDecl_values = null;
    node.overriddenMethods_computed = false;
    node.overriddenMethods_value = null;
    node.hiddenMethods_computed = false;
    node.hiddenMethods_value = null;
    node.rootDefs_computed = false;
    node.rootDefs_value = null;
    node.indirectlyOverriddenMethods_computed = false;
    node.indirectlyOverriddenMethods_value = null;
    node.possiblyHiddenMethods_computed = false;
    node.possiblyHiddenMethods_value = null;
    node.uses_computed = false;
    node.uses_value = null;
    node.isGetterFor_FieldDeclaration_values = null;
    node.accessibilityConstraintsFromOverridingAndHiding_computed = false;
    node.accessibilityConstraintsFromOverridingAndHiding_value = null;
    node.isMainMethod_computed = false;
    node.thisEscapes_computed = false;
    node.getAcquiredMonitor_computed = false;
    node.getAcquiredMonitor_value = null;
    node.getMonitorExpr_computed = false;
    node.getMonitorExpr_value = null;
    node.getIndexOfParameter_String_values = null;
    node.throwsExactException_TypeDecl_values = null;
    node.accessParameter_Variable_values = null;
    node.creamVariable_Network_values = null;
    node.handlesException_TypeDecl_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl copy() {
    try {
      MethodDecl node = (MethodDecl) clone();
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
  public MethodDecl fullCopy() {
    MethodDecl tree = (MethodDecl) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BoundNames.jrag:77
   */
  public Access createBoundAccess(List args) {
    if(isStatic()) {
      return hostType().createQualifiedAccess().qualifiesAccess(
        new BoundMethodAccess(name(), args, this)
      );
    }
    return new BoundMethodAccess(name(), args, this);
  }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:154
   */
  public SimpleSet add(Object o) {
    return new SimpleSetImpl().add(this).add(o);
  }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:158
   */
  public boolean isSingleton() { return true; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:159
   */
  public boolean isSingleton(Object o) { return contains(o); }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:162
   */
  
  private MethodDecl iterElem;
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:163
   */
  public Iterator iterator() { iterElem = this; return this; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:164
   */
  public boolean hasNext() { return iterElem != null; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:165
   */
  public Object next() { Object o = iterElem; iterElem = null; return o; }
  /**
   * @ast method 
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:166
   */
  public void remove() { throw new UnsupportedOperationException(); }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:101
   */
  public void nameCheck() {
    // 8.4
    // 8.4.2
    if(!hostType().methodsSignature(signature()).contains(this))
      error("method with signature " + signature() + " is multiply declared in type " + hostType().typeName());
    // 8.4.3.4
    if(isNative() && hasBlock())
      error("native methods must have an empty semicolon body");
    // 8.4.5
    if(isAbstract() && hasBlock())
      error("abstract methods must have an empty semicolon body");
    // 8.4.5
    if(!hasBlock() && !(isNative() || isAbstract()))
      error("only abstract and native methods may have an empty semicolon body");
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:176
   */
  public void refined_PrettyPrint_MethodDecl_toString(StringBuffer s) {
    s.append(indent());
    getModifiers().toString(s);
    getTypeAccess().toString(s);
    s.append(" " + name() + "(");
    if(getNumParameter() > 0) {
      getParameter(0).toString(s);
      for(int i = 1; i < getNumParameter(); i++) {
        s.append(", ");
        getParameter(i).toString(s);
      }
    }
    s.append(")");
    if(getNumException() > 0) {
      s.append(" throws ");
      getException(0).toString(s);
      for(int i = 1; i < getNumException(); i++) {
        s.append(", ");
        getException(i).toString(s);
      }
    }
    if(hasBlock()) {
      s.append(" ");
      getBlock().toString(s);
    }
    else {
      s.append(";");
    }
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:386
   */
  public void typeCheck() {
    // Thrown vs super class method see MethodDecl.nameCheck
    // 8.4.4
    TypeDecl exceptionType = typeThrowable();
    for(int i = 0; i < getNumException(); i++) {
      TypeDecl typeDecl = getException(i).type();
      if(!typeDecl.instanceOf(exceptionType))
        error(signature() + " throws non throwable type " + typeDecl.fullName());
    }

    // check returns
    if(!isVoid() && hasBlock() && getBlock().canCompleteNormally())
      error("the body of a non void method may not complete normally");

  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1242
   */
  public BodyDecl substitutedBodyDecl(Parameterization parTypeDecl) {
    //System.out.println("Begin substituting " + signature() + " in " + hostType().typeName() + " with " + parTypeDecl.typeSignature());
    MethodDecl m = new MethodDeclSubstituted(
      (Modifiers)getModifiers().fullCopy(),
      getTypeAccess().type().substituteReturnType(parTypeDecl),
      getID(),
      getParameterList().substitute(parTypeDecl),
      getExceptionList().substitute(parTypeDecl),
      substituteBody(parTypeDecl),
      this
    );
    //System.out.println("End substituting " + signature());
    return m;
  }
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:719
   */
  
	
	// artificial node to represent throws of uncaught exceptions
	private final ExitStmt uncheckedExceptionExit = new ExitStmt();
  /**
   * @ast method 
   * @aspect Declaration
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Declaration.jrag:23
   */
  public boolean isSubstituted() { return false; }
  /**
   * @ast method 
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:68
   */
  public MethodDecl copyIn(TypeDecl host) {
		SimpleSet res = host.memberMethods(this);
		if(res.size() == 1)
			return (MethodDecl)res.iterator().next();
		throw new RefactoringException("unable to find copy of " + fullName() + " in " + host.fullName());
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:4
   */
  public void makeAbstract() {
		if(!canBeAbstract())
			throw new RefactoringException("cannot make this method abstract");
		getModifiers().addModifier("abstract");
		setBlockOpt(new Opt());
		hostType().makeAbstract();
		for(TypeDecl td : inheritingTypes())
			td.makeAbstract();
		this.flushCaches();
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:18
   */
  public void removeMethod() {
		if(isCallableFromOutside() || isReferencedFromOutside())
			throw new RefactoringException("method is still used");
		if(!overriddenMethods().isEmpty() && allAbstract(overriddenMethods())) {
			for(TypeDecl td : inheritingTypes())
				td.makeAbstract();
		}
		hostType().removeBodyDecl(this);
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:99
   */
  public Collection<MethodAccess> usesOfAllCopies() {
		Collection<MethodAccess> res = new HashSet<MethodAccess>(uses());
		for(MethodDecl md : substitutedCopies())
			res.addAll(md.uses());
		return res;
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:112
   */
  public Collection<MethodDeclSubstituted> substitutedCopies() {
		Collection<MethodDeclSubstituted> res = new LinkedList<MethodDeclSubstituted>();
		if(!hostType().isGenericType())
			return res;
		GenericTypeDecl host = (GenericTypeDecl)hostType();
		for(int i=0;i<host.getNumTypeParameter();++i) {
			ParTypeDecl ptd = (ParTypeDecl) host.getTypeParameter(i);
			for(Object o : ptd.localMethodsSignatureMap().values())
				if(o instanceof MethodDeclSubstituted && ((MethodDeclSubstituted)o).sourceMethodDecl() == this)
					res.add((MethodDeclSubstituted)o);
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:255
   */
  private static String subTypeSignature(String sig, TypeDecl sup, TypeDecl sub) {
		if (sup instanceof GenericTypeDecl) {
			GenericTypeDecl gtd = (GenericTypeDecl) sup;
			ParTypeDecl ptd = linkSupSub(gtd, sub);
			if (ptd == null)
				throw new RefactoringException("unexpected state");
			for (Iterator i = ptd.localMethodsSignatureMap().values().iterator(); i.hasNext();) {
				MethodDecl mds = (MethodDecl) i.next();
				if (mds.sourceMethodDecl().signature().equals(sig))
					return mds.signature();
			}
		}
		return sig;
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:270
   */
  private static String superTypeSignature(String sig, TypeDecl sup, TypeDecl sub) {
		if (sup instanceof GenericTypeDecl) {
			GenericTypeDecl gtd = (GenericTypeDecl) sup;
			ParTypeDecl ptd = linkSupSub(gtd, sub);
			if (ptd == null)
				throw new RefactoringException("unexpected state");
			for (Iterator i = ptd.localMethodsSignatureMap().values().iterator(); i.hasNext();) {
				MethodDecl mds = (MethodDecl) i.next();
				if (mds.signature().equals(sig))
					return mds.sourceMethodDecl().signature();
			}
		}
		return sig;
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:285
   */
  private static ParTypeDecl linkSupSub(GenericTypeDecl gtd, TypeDecl sub) {
		for(TypeDecl sup : sub.supertypes())
			if(sup instanceof ParTypeDecl && ((ParTypeDecl)sup).genericDecl().sourceTypeDecl() == gtd)
				return (ParTypeDecl)sup;
		return null;
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:293
   */
  public MethodDecl lockedCopyWithEmptyBody() {
		Modifiers mods = (Modifiers)getModifiers().lockedCopy();
		Access rettype = type().createLockedAccess();
		String name = name();
		List<ParameterDeclaration> parms = new List<ParameterDeclaration>();
		for(ParameterDeclaration pd : getParameters())
			parms.add(pd.lockedCopy());
		List<Access> exns = new List<Access>();
		for(Access exn : getExceptions())
			exns.add(exn.type().createLockedAccess());
		return new MethodDecl(mods, rettype, name, parms, exns, new Opt<Block>());
	}
  /**
   * @ast method 
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:360
   */
  public void rerouteUsesTo(MethodDecl that) {
		for(MethodAccess ma : uses())
			ma.lock(that);
	}
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:51
   */
  public void makeModifiersExplicit() {
		if(hostType().isInterfaceDecl())
			getModifiers().addModifiers("public", "static", "abstract");
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:126
   */
  public MethodDecl findMethod(String name) {
		if(name().equals(name))
			return this;
		return super.findMethod(name);
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:144
   */
  public MethodDecl findMethodBySig(String sig) {
		if(signature().equals(sig))
			return this;
		return super.findMethod(sig);
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:185
   */
  protected void collectSourceMethods(Collection<MethodDecl> res) {
		res.add(this);
		super.collectSourceMethods(res);
	}
  /**
   * @ast method 
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:62
   */
  public Collection<MethodDecl> overridingMethods() {
		if(this.isFinal() || this.isPrivate() || this.isStatic())
			return Collections.EMPTY_SET;
		return coll_overridingMethods();
	}
  /**
   * @ast method 
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:96
   */
  public HashSet<MethodDecl> possiblyOverriddenAncestors() {
		return hostType().possiblyOverriddenAncestors(signature());
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:102
   */
  public void translateTypeVars(TypeDecl sub, TypeDecl sup) {
		if(!sub.isGenericType() || !sup.isParameterizedType())
			return;
		GenericTypeDecl gsub = (GenericTypeDecl)sub;
		ParTypeDecl psup = (ParTypeDecl)sup;
		GenericTypeDecl gsup = (GenericTypeDecl)psup.genericDecl();
		Map<TypeVariable, TypeVariable> dict = new HashMap<TypeVariable, TypeVariable>();
		for(TypeVariable tv : (List<TypeVariable>)gsub.getTypeParameterList()) {
			for(int i=0;i<psup.getNumArgument();++i) {
				if(psup.getArgument(i).type() == tv)
					dict.put(tv, gsup.getTypeParameter(i));
			}
		}
		translateTypeVars(dict);
	}
  /**
   * @ast method 
   * @aspect AccessibilityConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityConstraints.jrag:212
   */
  
	private Collection<AccessibilityConstraint> referencingAccessibilityConstraints = new HashSet<AccessibilityConstraint>();
  /**
   * @ast method 
   * @aspect ChangeAccessibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/ChangeAccessibility.jrag:38
   */
  public boolean isAnonymousType(){return false;}
  /**
   * @ast method 
   * @aspect AddParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/AddParameter.jrag:2
   */
  public void addParameter(ParameterDeclaration pd, int idx, Literal value, boolean createDelegate) {
		if(idx < 0 || idx > getNumParameter())
			throw new RefactoringException("invalid index for new parameter");
		programRoot().lockMethodNames(name());
		programRoot().lockOverridingDependencies(name());
		Collection<MethodDecl> relatives = relatives();
		for(MethodDecl md : relatives()) {
			if(!md.parameterDeclaration(pd.name()).isEmpty())
				throw new RefactoringException("parameter of same name exists");
			if(idx == md.getNumParameter() && md.isVariableArity())
				throw new RefactoringException("cannot insert parameter after vararg");
			if(idx != md.getNumParameter() && pd.isVariableArity())
				throw new RefactoringException("cannot insert vararg parameter anywhere except in last position");
			// TODO: use locked copy
			Collection<MethodAccess> uses = md.uses();
			if(createDelegate) {
				MethodDecl delegate = (MethodDecl)md.fullCopyAndDetach();
				if(!md.hostType().isInterfaceDecl()) {
					delegate.getModifiers().removeModifiers("abstract", "native");
					List<Expr> args = new List<Expr>();
					for(ParameterDeclaration mdpd : md.getParameters())
						args.add(new VarAccess(mdpd.name()));
					args.insertChild((Expr)value.fullCopyAndDetach(), idx);
					delegate.setBlock(new Block(new List<Stmt>().add(new ReturnStmt(md.createLockedAccess(args)))));
				}
				md.hostType().getBodyDeclList().insertChild(delegate, md.getChildIndex());
			}
			ParameterDeclaration pd_copy = (ParameterDeclaration) pd.fullCopyAndDetach();
			md.getParameterList().insertChild(pd_copy, idx);
			for(MethodAccess ma : uses) {
				if(relatives.contains(ma.hostBodyDecl())) {
					ma.getArgList().insertChild(new VarAccess(pd.name()), idx);
				} else {
					Expr arg = (Expr)value.fullCopyAndDetach();
					ma.getArgList().insertChild(arg, idx);
					if(!arg.type().methodInvocationConversionTo(pd_copy.type()))
						throw new RefactoringException("Default value does not have right type.");
				}
			}
		}
	}
  /**
   * @ast method 
   * @aspect AddParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/AddParameter.jrag:44
   */
  public void doAddParameter(ParameterDeclaration pd, int idx, Literal value, boolean createDelegate) {
		addParameter(pd, idx, value, createDelegate);
		programRoot().eliminate(RETURN_VOID, LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect PermuteParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/PermuteParameters.jrag:2
   */
  public void permuteParameters(int[] perm, boolean createDelegate) {
		int n = getNumParameter();
		if(!isPerm(perm, n))
			throw new RefactoringException("not a permutation");
		if(isIdentityPerm(perm))
			return;
		programRoot().lockMethodNames(name());
		programRoot().lockOverridingDependencies(name());
		for(MethodDecl md : relatives()) {
			Collection<MethodAccess> uses = md.uses();
			if(md.isNative() || !md.fromSource())
				throw new RefactoringException("cannot permute parameters");
			if(md.isVariableArity() && perm[n-1] != n-1)
				throw new RefactoringException("variable arity parameter has to come last");
			if(createDelegate) {
				MethodDecl delegate = (MethodDecl)md.fullCopyAndDetach();
				delegate.clearOverridingDependencies();
				if(!md.hostType().isInterfaceDecl()) {
					delegate.getModifiers().removeModifiers("abstract", "native");
					List<Expr> args = new List<Expr>();
					for(ParameterDeclaration pd : md.getParameters())
						args.add(new VarAccess(pd.name()));
					args.permute(perm);
					delegate.setBlock(new Block(new List<Stmt>().add(new ReturnStmt(md.createLockedAccess(args)))));
				}
				md.hostType().getBodyDeclList().insertChild(delegate, md.getChildIndex());
			}
			md.getParameterList().permute(perm);
			md.flushCaches();
			for(MethodAccess ma : uses) {
				ma.getArgList().lockDataFlow();
				ma.getArgList().permute(perm);
			}
		}
	}
  /**
   * @ast method 
   * @aspect PermuteParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/PermuteParameters.jrag:38
   */
  public void doPermuteParameters(int[] perm, boolean createDelegate) {
		permuteParameters(perm, createDelegate);
		programRoot().eliminate(RETURN_VOID, LOCKED_DATAFLOW, LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect RemoveParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/RemoveParameter.jrag:2
   */
  public void removeUnusedParameter(int i) {
		// lock all calls
		programRoot().lockMethodNames(name());
		programRoot().lockOverridingDependencies(name());
		// consider every relative in turn
		for(MethodDecl rel : relatives()) {
			if(!rel.getParameter(i).allUses().isEmpty())
				throw new RefactoringException("parameter is used");
			Collection<MethodAccess> uses = rel.uses();
			for(MethodAccess call : uses)
				if(!call.getArg(i).isPure())
					throw new RefactoringException("invocation has impure argument");
			// remove arguments and parameter
			rel.removeParameter(i);
			rel.flushCaches();
			if(!rel.hostType().canIntroduceMethod(rel))
				throw new RefactoringException("signature conflict");
			for(MethodAccess call : uses)
				call.getArgList().removeChild(i);
		}
	}
  /**
   * @ast method 
   * @aspect RemoveParameter
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ChangeMethodSignature/RemoveParameter.jrag:24
   */
  public void doRemoveUnusedParameter(int i) {
		removeUnusedParameter(i);
		programRoot().eliminate(LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect InlineMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethod.jrag:9
   */
  public void doInline(boolean delete) {
		TypeDecl host = hostType();
		int idx = host.getBodyDeclList().getIndexOfChild(this);
		for(MethodAccess ma : this.polyUses())
			ma.doInline();
		if(delete) {
			MethodDecl md = (MethodDecl)host.getBodyDecl(idx);
			try { md.removeUnused(false); } catch(RefactoringException rfe) { }			
		}
	}
  /**
   * @ast method 
   * @aspect IntroduceIndirection
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceIndirection/IntroduceIndirection.jrag:8
   */
  public void introduceIndirection(String indname, String parmname, TypeDecl targetType) {
		MethodDecl indirection = lockedCopyWithEmptyBody();
		indirection.setModifiers(new Modifiers("public", "static"));
		indirection.setID(indname);
		List<Expr> args = new List<Expr>();
		for(ParameterDeclaration pd : indirection.getParameters())
			args.addChild(pd.createLockedAccess());
		ParameterDeclaration parm = null;
		Block body = null;
		if(isStatic()) {
			body = new Block(new ReturnStmt(this.createLockedAccess(args)));
		} else {
			parm = new FreshParameter(hostType().createLockedAccess(), parmname);
			indirection.insertParameter(parm, 0);
			body = new Block(new ReturnStmt(parm.createLockedAccess().qualifiesAccess(this.createLockedAccess(args))));
		}
		indirection.setBlock(body);
		targetType.insertUnusedMethod(indirection, getChildIndex());
		indirection = closeOverTypeVariables(indirection);
		for(MethodAccess ma : usesOfAllCopies()) {
			if(ma.hostBodyDecl() == indirection)
				continue;
			if(ma.isMonoCall() && !this.overridingMethods().isEmpty())
				continue;
			if(!isStatic()) {
				ma.bundleQualifier();
				ASTNode p = ma;
				if(ma.isQualified())
					p = p.getParent();
				Expr qual = ma.isQualified() && !ma.qualifier().isSuperAccess() ? ma.qualifier() : null;
				if(qual == null) {
					for(TypeDecl enc=ma.hostType(); enc!=null; enc=enc.enclosingType()) {
						if(enc.memberMethod(this) == this) {
							if(enc == ma.hostType())
								qual = new ThisAccess("this");
							else
								qual = enc.createLockedAccess().qualifiesAccess(new ThisAccess("this"));
							break;
						}
					}
				}
				ma.getArgList().insertChild(qual == null ? new ThisAccess("this") : qual, 0);
				p.replaceWith(ma);
			}
			ma.lock(indirection);
		}
		programRoot().flushCaches();
	}
  /**
   * @ast method 
   * @aspect IntroduceIndirection
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceIndirection/IntroduceIndirection.jrag:57
   */
  public void doIntroduceIndirection(String indname, String parmname, TypeDecl targetType) {
		introduceIndirection(indname, parmname, targetType);
		programRoot().eliminate(RETURN_VOID, FRESH_VARIABLES, BARE_PARMETHODACCESS, LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect IntroduceIndirection
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceIndirection/IntroduceIndirection.jrag:62
   */
  public void doIntroduceIndirection(String indname, TypeDecl targetType) {
		String hostname = hostType().name();
		doIntroduceIndirection(indname, Character.toLowerCase(hostname.charAt(0))+hostname.substring(1), targetType);
	}
  /**
   * @ast method 
   * @aspect IntroduceParameterObject
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceParameterObject/IntroduceParameterObject.jrag:2
   */
  public MemberTypeDecl introduceParameterObject(Collection<String> parms_to_wrap, String className, String parmName) {
		ArrayList<ParameterDeclaration> parms = new ArrayList<ParameterDeclaration>();
		java.util.BitSet positions_to_wrap = new java.util.BitSet(this.getNumParameter());
		List<ParameterDeclaration> old_parms = (List<ParameterDeclaration>)getParameters().fullCopyAndDetach();
		for(int i=0;i<getNumParameter();++i) {
			if(parms_to_wrap == null || parms_to_wrap.contains(getParameter(i).name())) {
				parms.add(getParameter(i));
				positions_to_wrap.set(i);
			}
		}
		Pair<ClassDecl, Map<String, FieldDeclaration>> tmp = createStruct(className, parms);
		ClassDecl struct = tmp.fst();
		programRoot().lockMethodNames(name());
		
		// adjust this method and all its relatives
		for(MethodDecl md : relatives())
			md.uses();
		for(MethodDecl md : relatives()) {
			eliminateVarArgs();
			for(MethodAccess ma : md.uses()) {
				List<Expr> wrapped_args = new List<Expr>();
				List<Expr> newargs = new List<Expr>().add(new ClassInstanceExpr(struct.createLockedAccess(), wrapped_args));
				for(int i=0;i<md.getNumParameter();++i)
					if(positions_to_wrap.get(i))
						wrapped_args.add(ma.getArg(i));
					else
						newargs.add(ma.getArg(i));
				ma.setArgList(newargs);
			}
			ParameterDeclaration parm = new ParameterDeclaration(struct.createLockedAccess(), parmName);
			List<ParameterDeclaration> newparms = new List<ParameterDeclaration>().add(parm);
			for(int i=0;i<md.getNumParameter();++i) {
				ParameterDeclaration pd = md.getParameter(i);
				if(positions_to_wrap.get(i) && md.hasBlock())
					md.getBlock().insertStmt(i, pd.asVariableDeclaration(parm.createLockedAccess().qualifiesAccess(new VarAccess(old_parms.getChild(i).name()))));
				if(!positions_to_wrap.get(i))
					newparms.add(pd);
			}
			md.setParameterList(newparms);
		}
		
		return hostType().insertUnusedType(struct, getChildIndex());
	}
  /**
   * @ast method 
   * @aspect IntroduceParameterObject
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceParameterObject/IntroduceParameterObject.jrag:46
   */
  public void doIntroduceParameterObject(Collection<String> parms, String className, String parmName, boolean toplevel) {
		MemberTypeDecl mcd = introduceParameterObject(parms, className, parmName);
		if(toplevel)
			mcd.moveToToplevel(true, null, true);
		programRoot().eliminate(LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect EliminateVarargs
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/EliminateVarargs.jrag:2
   */
  public void eliminateVarArgs() {
		if(!isVariableArity())
			return;
		VariableArityParameterDeclaration last = (VariableArityParameterDeclaration)lastParameter();
		ParameterDeclaration new_last = last.asFixedArityParameter();
		for(VarAccess va : last.uses())
			if(va.isLocked())
				va.lock(new_last);
		for(MethodAccess ma : uses()) {
			if(!ma.invokesVariableArityAsArray()) {
				List<Expr> varargs = new List<Expr>();
				for(int i=ma.getNumArg()-1; i>=getNumParameter()-1;--i) {
					Expr arg = ma.getArg(i);
					ma.getArgList().removeChild(i);
					varargs.insertChild(arg, 0);
				}
				ma.getArgList().insertChild(new ArrayCreationExpr(last.type().createLockedAccess(), new Opt(new ArrayInit(varargs))), getNumParameter()-1);
			}
		}
		setParameter(new_last, getNumParameter()-1);
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:13
   */
  
	
	private HashSet<SavedMethodDecl> lockedOverridingDependencies = null;
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:14
   */
  public void lockOverridingDependencies(Collection<String> names) {
		if(names.contains(name()))
			lockOverriding();
		super.lockOverridingDependencies(names);
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:20
   */
  public void lockOverriding() {
		if(lockedOverridingDependencies != null)
			return;
		HashSet<SavedMethodDecl> deps = new HashSet<SavedMethodDecl>();
		for(MethodDecl md : overriddenMethods())
			deps.add(md.save());
		setOverridingDependencies(deps);
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:29
   */
  public void lockOverriding(Collection<MethodDecl> ovr) {
		HashSet<SavedMethodDecl> deps = new HashSet<SavedMethodDecl>();
		for(MethodDecl md : ovr)
			deps.add(md.save());
		setOverridingDependencies(deps);
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:55
   */
  private void refined_LockedOverriding_MethodDecl_setOverridingDependencies(HashSet<SavedMethodDecl> deps) {
		if(deps != null) {
			if(this.isStatic() && !deps.isEmpty())
				if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond7.isEnabled())
				throw new RefactoringException("static methods cannot override other methods");
			for(SavedMethodDecl smd : deps)
				if(smd.isFinal() || smd.isStatic())
					if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond2.isEnabled())
						throw new RefactoringException("cannot override static or final method");
		}
		this.lockedOverridingDependencies = deps;
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:66
   */
  public void clearOverridingDependencies() {
		setOverridingDependencies(null);
	}
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:84
   */
  public void unlockOverriding() {
		if(lockedOverridingDependencies != null) {
			HashSet<MethodDecl> old_overridden = overriddenMethods();
			clearOverridingDependencies();
			this.flushCaches();
			if (ConditionsMoveMethod.cond3  && ConditionsAddParameter.cond4) {
				if(!old_overridden.equals(overriddenMethods()))
//					if (false) //ConditionMT 36
					throw new RefactoringException("overriding has changed");
			}
		}
		super.unlockOverriding();
	}
  
  /**
   * @ast method 
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:50
   */
  protected void collectMonitorActions(Collection<MonitorAction> res) {
		if(isSynchronized() && !isInitAnnotationsIfNecessary())
			res.add(this);
		super.collectMonitorActions(res);
	}
  /**
   * @ast method 
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:63
   */
  public boolean isInitAnnotationsIfNecessary() {
		return hostType().sourceTypeDecl().fullName().equals("java.lang.Class") && name().equals("initAnnotationsIfNecessary");		
	}
  /**
   * @ast method 
   * @aspect MakeMethodStatic
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/MakeMethodStatic/MakeMethodStatic.jrag:2
   */
  public void makeStatic() {
		if(isStatic())
			return;
		if(!fromSource() || !hasBlock())
			throw new RefactoringException("cannot make static");
		programRoot().lockMethodNames(Collections.singleton(name()));
		MethodDecl delegator = this;
		MethodDecl newMethod = (MethodDecl)this.fullCopyAndDetach();
		TypeDecl hostType = hostType();
		// make new method static
		newMethod.getModifiers().addModifier(new Modifier("static"));
		// insert new method
		hostType.addBodyDecl(newMethod);
		// insert extra parameter
		String newParmName = hostType.name().toLowerCase();
		ParameterDeclaration newParm = new FreshParameter(hostType.createLockedAccess(), newParmName);
		newParm.setDemandFinal();
		newMethod.getParameterList().insertChild(newParm, 0);
		// fix type arguments
		newMethod = closeOverTypeVariables(newMethod);
		// fix body
		Access newParmAcc = newParm.createLockedAccess();
		WithStmt withStmt = new WithStmt(new List<Access>().add(newParmAcc), newMethod.getBlock());
		newMethod.setBlock(new Block(new List<Stmt>().add(withStmt)));
		newMethod.flushCaches();
		// prepare delegating method
		List<Expr> delegationArgs = new List<Expr>().add(new ThisAccess("this"));
		for(int i=1;i<newMethod.getNumParameter();++i)
			delegationArgs.add(new VarAccess(newMethod.getParameter(i).name()));
		Expr delegationCall = new MethodAccess(newMethod.name(), delegationArgs);
		delegator.setBlock(new Block(new List<Stmt>().add(new ReturnStmt(delegationCall))));
		// plug in delegating method
		delegator.programRoot().flushCaches();
		newMethod.programRoot().eliminate(RETURN_VOID, FRESH_VARIABLES, WITH_STMT, LOCKED_NAMES, DEMAND_FINAL_MODIFIER);
	}
  /**
   * @ast method 
   * @aspect MakeMethodStatic
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/MakeMethodStatic/MakeMethodStatic.jrag:38
   */
  MethodDecl closeOverTypeVariables(MethodDecl newMethod) {
		if(newMethod.usesForeignTypeVars()) {
			newMethod = newMethod.makeGeneric();
			for(TypeVariable tv : newMethod.usedTypeVars()) {
				if(!tv.isDescendantTo(newMethod)) {
					TypeVariable new_tv = (TypeVariable)tv.fullCopyAndDetach();
					((GenericMethodDecl)newMethod).addTypeParameter(new_tv);
					for(Access tvu : tv.uses())
						if(tvu.isDescendantTo(newMethod))
							((TypeAccess)tvu).lock(new_tv);				
				}
			}
		}
		return newMethod;
	}
  /**
   * @ast method 
   * @aspect MakeMethodStatic
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/MakeMethodStatic/MakeMethodStatic.jrag:54
   */
  GenericMethodDecl makeGeneric() {
		GenericMethodDecl g = new GenericMethodDecl(getModifiers(), getTypeAccess(), getID(), 
				                                    getParameterList(), getExceptionList(), 
				                                    getBlockOpt(), new List<TypeVariable>());
		replaceWith(g);
		return g;
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:49
   */
  public void moveTo(TypeDecl target) {
		if(!target.fromSource())
			throw new RefactoringException("cannot insert method into library class");
		if(!isStatic())
			throw new RefactoringException("cannot move instance methods");
		lockAllNames();
		programRoot().lockNames(name());
		TypeDecl host = hostType();
		MethodDecl dummy = (MethodDecl) this.fullCopyAndDetach();
		dummy.setBlockOpt(new Opt());
		target.insertUnusedMethod(dummy);
		host.removeBodyDecl(this);
		dummy.replaceWith(this);
	}
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:134
   */
  protected void collectAllMethodNames(Collection<String> res) {
		res.add(name());
		super.collectAllMethodNames(res);
	}
  /**
   * @ast method 
   * @aspect MoveMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMethod.jrag:2
   */
  public void doMoveToParameter(String name, boolean inlineDelegator, boolean removeDelegator, boolean removeSpuriousParameters) {
		doMoveTo(getParameter(name), inlineDelegator, removeDelegator, removeSpuriousParameters);
	}
  /**
   * @ast method 
   * @aspect MoveMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMethod.jrag:6
   */
  public void doMoveToField(String name, boolean inlineDelegator, boolean removeDelegator, boolean removeSpuriousParameters) {
		doMoveTo((FieldDeclaration)hostType().localFields(name), inlineDelegator, removeDelegator, removeSpuriousParameters);
	}
  /**
   * @ast method 
   * @aspect MoveMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMethod.jrag:10
   */
  public void moveToFirstParameter() {
		doMoveTo(getNumParameter() > 0 ? getParameter(0) : null, false, false, false);
	}
  /**
   * @ast method 
   * @aspect MoveMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMethod.jrag:14
   */
  public void doMoveTo(Variable target, boolean inlineDelegator, boolean removeDelegator, boolean removeSpuriousParameters) {
		MethodDecl delegator = moveTo(target, removeSpuriousParameters);
		programRoot().eliminate(RETURN_VOID, FRESH_VARIABLES, WITH_STMT, LOCKED_NAMES, LOCKED_OVERRIDING, DEMAND_FINAL_MODIFIER);
		if(inlineDelegator)
			delegator.doInline(removeDelegator);
	}
  /**
   * @ast method 
   * @aspect MoveMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMethod.jrag:21
   */
  public MethodDecl moveTo(Variable b, boolean removeSpuriousParameters) {
		MethodDecl m = this;
		checkMoveMethodPreconditions(m, b);
		MethodDecl m_copy = (MethodDecl)m.fullCopyAndDetach();
		for(MethodAccess ma : m.uses())
			ma.lock(m_copy);
		programRoot().lockOverridingDependencies(m.name());
		Variable b_copy = b.isMethodParameter() ? m_copy.getParameter(b.name()) : b;
		List<Expr> args = new List<Expr>();
		for(ParameterDeclaration pd : m_copy.getParameters())
			args.add(pd.createLockedAccess());
		// NB: synchronization is done by delegating method
		m.getModifiers().removeModifier("synchronized");
		m.lockAllNames();
		VariableDeclaration new_b = b.asVariableDeclaration(new ThisAccess("this"));
		for(VarAccess va : b.allUses()) {
			if(va.isDescendantTo(m))
				va.lock(new_b);
		}
		int i;
		if(b.isMethodParameter()) {
			i = m.getIndexOfParameter(b.name());
			m.removeParameter(i);
			args.removeChild(i);
		} else {
			i = 0;
		}
		List<Access> quals = new List<Access>();
		for(TypeDecl A=m.hostType(); A!=null; A=A.enclosingType()) {
			String a = A.name().toLowerCase();
			ParameterDeclaration a_decl = new FreshParameter(A.createLockedAccess(), a); 
			a_decl.setDemandFinal();
			m.insertParameter(a_decl, i);
			args.insertChild(A==m.hostType() ? new ThisAccess("this") : A.createLockedAccess().qualifiesAccess(new ThisAccess("this")), i);
			quals.insertChild(a_decl.createLockedAccess(), 0);
		}
		Block withBlock = m.getBlock();
		m.setBlock(new Block(new_b, new WithStmt(quals, withBlock)));
		m.replaceWith(m_copy);
		VarAccess b_acc = b_copy.createLockedAccess();
		m_copy.setBlock(new Block(new ReturnStmt(b_acc.qualifiesAccess(new MethodAccess(m, args, false)))));
		m_copy.programRoot().flushCaches(); m.flushCaches();
		b.type().insertUnusedMethod(m);
		m.eliminate(ASTNode.WITH_STMT, ASTNode.FRESH_VARIABLES, ASTNode.LOCKED_NAMES);
		new_b.inline();
		// remove spurious parameters
		if(removeSpuriousParameters) {
			for(int k=i+quals.getNumChild()-1;k>=i;--k) {
				final MethodDecl md_ = m;
				final int k_ = k;
				Or.or(new Or.Refactoring() {
					public void refactor() {
						md_.removeUnusedParameter(k_);
					}
				}, Or.ID);
			}
		}
		return m_copy;
	}
  /**
   * @ast method 
   * @aspect MoveMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMethod.jrag:81
   */
  private void checkMoveMethodPreconditions(MethodDecl m, Variable b) {
		if(m == null || b == null)
//			if (false) //ConditionMT 0
			throw new RefactoringException("method or target does not exist");
			if(!m.hostType().fromSource() || !b.type().fromSource())
//				if (false) //ConditionMT 1
				throw new RefactoringException("cannot move inside bytecode");
		if(m.isStatic())
//			if (false) //ConditionMT 3
			throw new RefactoringException("cannot move static method (yet)");
			if(!m.hasBlock())
//				if (false) //ConditionMT 4
				throw new RefactoringException("cannot move body-less method");
	}
  /**
   * @ast method 
   * @aspect RemoveUnusedMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/RemoveUnusedMethod.jrag:5
   */
  public void removeUnused(boolean leaveAbstract) {
		final MethodDecl md_ = this;
		if (leaveAbstract)
			Or.or(new Or.Refactoring() {
				public void refactor() throws RefactoringException {
					md_.makeAbstract();
				}
			}/*, Or.ID*/);
		else
			Or.or(new Or.Refactoring() {
				public void refactor() throws RefactoringException {
					md_.removeMethod();
				}
			}, new Or.Refactoring() {
				public void refactor() throws RefactoringException {
					md_.makeAbstract();
				}
			}/*, Or.ID*/);
	}
  /**
   * @ast method 
   * @aspect AccessMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:38
   */
  public boolean applicableTo(List<Expr> args) {
		if(getNumParameter() != args.getNumChild())
			return false;
		for(int i=0;i<getNumParameter();++i)
			if(!args.getChild(i).type().instanceOf(getParameter(i).type()))
				return false;
		return true;
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:19
   */
  public MethodAccess createLockedAccess(List<Expr> args, boolean isMonoCall) {
		return new MethodAccess(this, args, isMonoCall);
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:22
   */
  public MethodAccess createLockedAccess(List<Expr> args) {
		return createLockedAccess(args, false);
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:84
   */
  public SavedMethodDecl save() { return new SavedMethodDecl(this); }
  /**
   * @ast method 
   * @aspect PullUpMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMembers.jrag:20
   */
  public void doPullUpWithRequired() {
		java.util.Set<MethodDecl> requiredMethods = new HashSet<MethodDecl>();
		java.util.Set<FieldDeclaration> requiredFields = new HashSet<FieldDeclaration>();
		java.util.Set<MemberTypeDecl> requiredTypes = new HashSet<MemberTypeDecl>();
		requiredMethods.add(this);
		TypeDecl host = hostType();
		host.addRequiredMembers(requiredMethods, requiredFields, requiredTypes);
		host.doPullUpMembers(requiredMethods.toArray(new MethodDecl[]{}),
							 new boolean[requiredMethods.size()],
							 requiredFields.toArray(new FieldDeclaration[]{}),
							 requiredTypes.toArray(new MemberTypeDecl[]{}));
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:2
   */
  public void pullUp(boolean onlyAbstract) {
		if(onlyAbstract)
			throw new RefactoringException("onlyAbstract not supported");
		if(!hostType().isClassDecl() || !hostType().fromSource() || !((ClassDecl)hostType()).superclass().fromSource())
if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond3.isEnabled())
			throw new RefactoringException("no fitting super class");
		Program root = programRoot();
		ClassDecl host = (ClassDecl)hostType();
		ClassDecl sup = host.superclass();
		MethodDecl md = this;
		
		if(host.isGenericType() || sup.isParameterizedType() || sup.isSubstitutedType())
			throw new RefactoringException("cannot pull up in the presence of generics");
		
		Collection<TypeDecl> inheritors = sup.inheritingTypes(this);
		if(!inheritors.isEmpty())
			if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond6.isEnabled())
			throw new RefactoringException("method could be invoked dynamically");
		
		// construct typeUpdate map
		Map<Expr, TypeDecl> typeUpdate = new HashMap<Expr, TypeDecl>();
		for(ThisAccess acc : collectThisAccesses()) {
			if (ConditionsManagement.cond2.isEnabled()) {
				if(acc.isQualified())
					if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond4.isEnabled())
					throw new RefactoringException("Pull Up cannot preserve enclosing instances");
			}
			typeUpdate.put(acc, sup);
		}
//		if (ConditionsPullUpMethod.cond2) {
		// construct movement map
		Map<MemberDecl, TypeDecl> memberMove = new HashMap<MemberDecl, TypeDecl>();
		memberMove.put(this, sup);
		
		// construct overriding map
		Map<MethodDecl, Collection<MethodDecl>> methodOverriding = new HashMap<MethodDecl, Collection<MethodDecl>>();
		for(MethodDecl ovr : sup.overridingMethods(this)) {
			Collection<MethodDecl> mds = new HashSet<MethodDecl>();
			mds.addAll(ovr.overriddenMethods());
			mds.removeAll(this.overriddenMethods());
			mds.add(this);
			methodOverriding.put(ovr, mds);
		}
		
		root.lockOverridingAndNames(typeUpdate, memberMove, methodOverriding);
		
		// perform actual refactoring
		removeSuper();
		host.removeBodyDecl(this);
		sup.addBodyDecl(this);
		root.flushCaches();
		if(isAbstract())
			for(TypeDecl td : inheritingTypes())
				td.makeAbstract();
		root.flushCaches();
		
		// check that everything went OK wrt types
		Collection<TypeConstraint> typeConstraints =
			programRoot().typeConstraints(new Predicate<TypeConstraint>() {
				public boolean holds(TypeConstraint constr) {
					return constr.relevantForSubtree(MethodDecl.this);
				}
			});
		if (ConditionsPullUpMethod.cond3) {
			for(TypeConstraint typeConstraint : typeConstraints)
				if(!typeConstraint.solved())
					if (ConditionsJRRTInputs.ConditionsPullUpMethod.cond1.isEnabled())
					throw new RefactoringException("type constraint violated: " + typeConstraint.describe());
		}
		root.adjustVirtualCalls(typeUpdate);
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:67
   */
  public void doPullUp(boolean onlyAbstract) {
		pullUp(onlyAbstract);
		programRoot().eliminate(LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:72
   */
  public void doPullUp() {
		doPullUp(false);
	}
  /**
   * @ast method 
   * @aspect FoldSynchronized
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/FoldSynchronized.jrag:20
   */
  public void foldSynchronized() { 
		if(!this.hasBlock())
			return;
		Block body = getBlock();
		if(body.getNumStmt() != 1 ||
				!(body.getStmt(0) instanceof SynchronizedStmt))
			return;
		SynchronizedStmt s = (SynchronizedStmt)body.getStmt(0);
		if(this.isStatic()) {
			if(s.getExpr().isClassAccess() && s.getExpr().type().equals(hostType())) {
				if(!this.isSynchronized())
					getModifiers().addModifier(new Modifier("synchronized"));
				this.setBlock(s.getBlock());
			}
		} else {
			if(s.getExpr() instanceof ThisAccess) {
				if(!this.isSynchronized())
					getModifiers().addModifier(new Modifier("synchronized"));
				this.setBlock(s.getBlock());
			}
		}
	}
  /**
   * @ast method 
   * @aspect PushDownMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownMethod.jrag:2
   */
  public void pushDown(boolean leaveAbstract) {
		if(!fromSource())
			throw new RefactoringException("cannot push library method");
		if(isPrivate() || isStatic())
			pushDownMono(leaveAbstract);
		else
			pushDownVirtual(leaveAbstract);
	}
  /**
   * @ast method 
   * @aspect PushDownMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownMethod.jrag:11
   */
  public void pushDownMono(boolean leaveAbstract) {
		Program root = programRoot();
		MethodDecl md = this;
		unfoldSynchronized();
		root.lockMethodNames(md.name());
		for(TypeDecl child : hostType().childTypes()) {
			if(!child.localMethodsSignature(this.signature()).isEmpty() || this.isStatic() && child.isInnerClass())
				throw new RefactoringException("cannot insert method into child type "+child.name());
			MethodDecl new_md = (MethodDecl) md.fullCopyAndDetach();
			md.lockAllNames();
			md.replaceWith(new_md);
			child.addBodyDecl(md);
			md.foldSynchronized();
			md = new_md;
		}
		root.flushCaches();
		md.removeUnused(leaveAbstract);
	}
  /**
   * @ast method 
   * @aspect PushDownMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownMethod.jrag:30
   */
  public void pushDownVirtual(boolean leaveAbstract) {
		ASTNode parent = getParent();
		int idx = parent.getIndexOfChild(this);
		MethodDecl md = this;
		for(TypeDecl child : hostType().childTypes()) {
			MethodAccess ma = child.triviallyOverrideInheritedMethod(md);
			MethodDecl pushed_down = null;
			if(ma != null) {
				pushed_down = (MethodDecl)ma.hostBodyDecl();
				ma.inline();
			}
			md = (MethodDecl)parent.getChild(idx);
			child.eliminate(WITH_STMT, FRESH_VARIABLES);
			if(pushed_down != null) {
				pushed_down.removeSyntheticThis();
				pushed_down.foldSynchronized();
			}
		}
		final MethodDecl md_ = md;
		md.removeUnused(leaveAbstract);
	}
  /**
   * @ast method 
   * @aspect PushDownMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownMethod.jrag:52
   */
  public void doPushDown(boolean leaveAbstract) {
		Program root = programRoot();
		pushDown(leaveAbstract);
		root.eliminate(RETURN_VOID, LOCKED_NAMES, LOCKED_DATAFLOW);
	}
  /**
   * @ast method 
   * @aspect UnfoldSynchronized
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/UnfoldSynchronized.jrag:18
   */
  public void unfoldSynchronized() {
		if(!this.isSynchronized() || !this.hasBlock())
			return;
		getModifiers().removeModifier("synchronized");
		if(this.isStatic()) {
			Stmt stmt = new SynchronizedStmt(new AbstractDot(hostType().createLockedAccess(), new ClassAccess()), getBlock());
			setBlock(new Block(new List<Stmt>().add(stmt)));
		} else {
			Stmt stmt = new SynchronizedStmt(new ThisAccess("this"), getBlock());
			setBlock(new Block(new List<Stmt>().add(stmt)));
		}
	}
  /**
   * @ast method 
   * @aspect RenameMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameMethod.jrag:7
   */
  public void rename(String new_name) {
		if(name().equals(new_name))
			return;
		if(!isValidName(new_name))
			throw new RefactoringException("not a valid name: "+new_name);
		programRoot().lockMethodNames(name(), new_name);
		programRoot().lockOverridingDependencies(name(), new_name);
		for(MethodDecl md : relatives()) {
			md.checkRenamingPreconds(new_name);
			md.setID(new_name);
		}
		programRoot().eliminate(LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect RenameMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameMethod.jrag:21
   */
  private void checkRenamingPreconds(String new_name) {
		if(!fromSource() || isNative())
			throw new RefactoringException("cannot rename binary/native method");
		String sig = signature();
		int idx = sig.indexOf('(');
		String new_sig = new_name + sig.substring(idx);
		if (ConditionsRenameMethod.cond2) {
			if(!hostType().canIntroduceMethod(this, new_sig))
				throw new RefactoringException("cannot introduce new method");
		}
	}
  /**
   * @ast method 
   * @aspect RenameType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/RenameType.jrag:80
   */
  public boolean containsNativeMethod() {
    	return isNative() || super.containsNativeMethod();
    }
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:272
   */
  public String rtxfId() {
		return hostType().rtxfId() + "." + signature();
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:77
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		// if array types were constrainable, we would need a constraint saying that the parameter of main has to be of type String[] 
		for(MethodDecl that : overriddenMethods()) {
			for(int i=0;i<getNumParameter();++i) {
				ParameterDeclaration thisParm = this.getParameter(i),
									 thatParm = that.getParameter(i);
				addConstraint(constraints, pred, new SimpleTypeConstraint(thisParm, "overriding parameter type for method " + that.fullName(), 
																		  thisParm.getTypeAccess(), Operator.EQ, thatParm.getTypeAccess()));
			}
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "method overriding", this, Operator.LT, that));
			addConstraint(constraints, pred, new ExceptionCompatibilityConstraint(this, that));
		}
		for(MethodDecl that : possiblyOverriddenAncestors()) {
			if(this.type().isSubtypeConstrainable() && that.type().isSubtypeConstrainable()) {
				addConstraint(constraints, pred, new SimpleTypeConstraint(this.getTypeAccess(), "return type substitutability for method " + that.fullName(),
																	  	  this.getTypeAccess(), Operator.LE, that.getTypeAccess()));
			} else {
				collectReturnTypeSubstitutabilityConstraints(pred, constraints, that);
			}
		}
		for(MethodDecl that : indirectlyOverriddenMethods()) {
			for(int i=0;i<getNumParameter();++i) {
				ParameterDeclaration thisParm = this.getParameter(i),
									 thatParm = that.getParameter(i);
				addConstraint(constraints, pred, new SimpleTypeConstraint(thisParm, "overriding parameter type for method " + that.fullName(),
																		  thisParm.getTypeAccess(), Operator.EQ, thatParm.getTypeAccess()));
			}
			collectReturnTypeSubstitutabilityConstraints(pred, constraints,	that);
		}
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:109
   */
  protected void collectReturnTypeSubstitutabilityConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints, MethodDecl that) {
		if(this.type().isPrimitiveType() || this.type().isVoid() || that.type().isPrimitiveType() || that.type().isVoid()) {
			addConstraint(constraints, pred, new SimpleTypeConstraint(this.getTypeAccess(), "return type substitutability for method " + that.fullName(),
																	  this.getTypeAccess(), Operator.EQ, that.getTypeAccess()));
		} else if(this.type().isSubtypeConstrainable() && that.type().isSubtypeConstrainable()) {
			addConstraint(constraints, pred, new SimpleTypeConstraint(this.getTypeAccess(), "return type substitutability for method " + that.fullName(),
																  	  this.getTypeAccess(), Operator.LE, that.getTypeAccess()));
		} else {
			addConstraint(constraints, pred, new SimpleTypeConstraint(this.getTypeAccess(), "return type invariant", this.getTypeAccess(), Operator.EQ, this.type()));
			addConstraint(constraints, pred, new SimpleTypeConstraint(that.getTypeAccess(), "return type invariant", that.getTypeAccess(), Operator.EQ, that.type()));
			addConstraint(constraints, pred, new SimpleTypeConstraint(this.getTypeAccess(), "return type substitutability", this.type(), Operator.LE, that.type()));
		}
	}
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:33
   */
  public String fullName() {
		return hostType().fullName() + "." + signature(); 
	}
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:37
   */
  public void setParameter(String name, ParameterDeclaration pd) {
		setParameter(pd, getIndexOfParameter(name));
	}
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:41
   */
  public void insertParameter(ParameterDeclaration pd, int i) {
		getParameterList().insertChild(pd, i);
	}
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:45
   */
  public void removeParameter(int i) {
		getParameterList().removeChild(i);
	}
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:49
   */
  public int getIndexOfParameter(ParameterDeclaration pd) {
		for(int i=0;i<getNumParameter();++i)
			if(getParameter(i) == pd)
				return i;
		return -1;
	}
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:63
   */
  public ParameterDeclaration getParameter(String name) {
		if(getIndexOfParameter(name) == -1)
			return null;
		return getParameter(getIndexOfParameter(name));
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
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:80
   */
  public boolean mayEnter(Monitor m) { return getAcquiredMonitor().mayAlias(m); }
  /**
   * @ast method 
   * 
   */
  public MethodDecl() {
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
    children = new ASTNode[5];
    setChild(new List(), 2);
    setChild(new List(), 3);
    setChild(new Opt(), 4);
  }
  /**
   * @ast method 
   * 
   */
  public MethodDecl(Modifiers p0, Access p1, String p2, List<ParameterDeclaration> p3, List<Access> p4, Opt<Block> p5) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
  }
  /**
   * @ast method 
   * 
   */
  public MethodDecl(Modifiers p0, Access p1, beaver.Symbol p2, List<ParameterDeclaration> p3, List<Access> p4, Opt<Block> p5) {
    setChild(p0, 0);
    setChild(p1, 1);
    setID(p2);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 5;
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
  public void refined__MethodDecl_setID(String value) {
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
   * Replaces the Parameter list.
   * @param list The new list node to be used as the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setParameterList(List<ParameterDeclaration> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * @return Number of children in the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumParameter() {
    return getParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Parameter list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Parameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumParameterNoTransform() {
    return getParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Parameter list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ParameterDeclaration getParameter(int i) {
    return (ParameterDeclaration)getParameterList().getChild(i);
  }
  /**
   * Append an element to the Parameter list.
   * @param node The element to append to the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addParameter(ParameterDeclaration node) {
    List<ParameterDeclaration> list = (parent == null || state == null) ? getParameterListNoTransform() : getParameterList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addParameterNoTransform(ParameterDeclaration node) {
    List<ParameterDeclaration> list = getParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Parameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setParameter(ParameterDeclaration node, int i) {
    List<ParameterDeclaration> list = getParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<ParameterDeclaration> getParameters() {
    return getParameterList();
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<ParameterDeclaration> getParametersNoTransform() {
    return getParameterListNoTransform();
  }
  /**
   * Retrieves the Parameter list.
   * @return The node representing the Parameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<ParameterDeclaration> getParameterList() {
    List<ParameterDeclaration> list = (List<ParameterDeclaration>)getChild(2);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Parameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Parameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<ParameterDeclaration> getParameterListNoTransform() {
    return (List<ParameterDeclaration>)getChildNoTransform(2);
  }
  /**
   * Replaces the Exception list.
   * @param list The new list node to be used as the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setExceptionList(List<Access> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the Exception list.
   * @return Number of children in the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumException() {
    return getExceptionList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Exception list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Exception list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumExceptionNoTransform() {
    return getExceptionListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Exception list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getException(int i) {
    return (Access)getExceptionList().getChild(i);
  }
  /**
   * Append an element to the Exception list.
   * @param node The element to append to the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addException(Access node) {
    List<Access> list = (parent == null || state == null) ? getExceptionListNoTransform() : getExceptionList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addExceptionNoTransform(Access node) {
    List<Access> list = getExceptionListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Exception list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setException(Access node, int i) {
    List<Access> list = getExceptionList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Exception list.
   * @return The node representing the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Access> getExceptions() {
    return getExceptionList();
  }
  /**
   * Retrieves the Exception list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Exception list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Access> getExceptionsNoTransform() {
    return getExceptionListNoTransform();
  }
  /**
   * Retrieves the Exception list.
   * @return The node representing the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getExceptionList() {
    List<Access> list = (List<Access>)getChild(3);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Exception list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Exception list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getExceptionListNoTransform() {
    return (List<Access>)getChildNoTransform(3);
  }
  /**
   * Replaces the optional node for the Block child. This is the {@code Opt} node containing the child Block, not the actual child!
   * @param opt The new node to be used as the optional node for the Block child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setBlockOpt(Opt<Block> opt) {
    setChild(opt, 4);
  }
  /**
   * Check whether the optional Block child exists.
   * @return {@code true} if the optional Block child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasBlock() {
    return getBlockOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) Block child.
   * @return The Block child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Block getBlock() {
    return (Block)getBlockOpt().getChild(0);
  }
  /**
   * Replaces the (optional) Block child.
   * @param node The new node to be used as the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBlock(Block node) {
    getBlockOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Block> getBlockOpt() {
    return (Opt<Block>)getChild(4);
  }
  /**
   * Retrieves the optional node for child Block. This is the {@code Opt} node containing the child Block, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child Block.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Block> getBlockOptNoTransform() {
    return (Opt<Block>)getChildNoTransform(4);
  }
  /**
   * @ast method 
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:717
   */
   
  public void checkModifiers() {
    super.checkModifiers();
    if(hostType().isClassDecl()) {
      // 8.4.3.1
      if(!hostType().isEnumDecl() && isAbstract() && !hostType().isAbstract())
        error("class must be abstract to include abstract methods");
      // 8.4.3.1
      if(isAbstract() && isPrivate())
        error("method may not be abstract and private");
      // 8.4.3.1
      // 8.4.3.2
      if(isAbstract() && isStatic())
        error("method may not be abstract and static");
      if(isAbstract() && isSynchronized())
        error("method may not be abstract and synchronized");
      // 8.4.3.4
      if(isAbstract() && isNative())
        error("method may not be abstract and native");
      if(isAbstract() && isStrictfp())
        error("method may not be abstract and strictfp");
      if(isNative() && isStrictfp())
        error("method may not be native and strictfp");
    }
    if(hostType().isInterfaceDecl()) {
      // 9.4
      if(isStatic())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be static");
      if(isStrictfp())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be strictfp");
      if(isNative())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be native");
      if(isSynchronized())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be synchronized");
      if(isProtected())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be protected");
      if(isPrivate())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be private");
      else if(isFinal())
        error("interface method " + signature() + " in " +
            hostType().typeName() +  " may not be final");
    }
  }
  /**
   * @ast method 
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:95
   */
    public void toString(StringBuffer s) {
		if(lockedOverridingDependencies != null)
			s.append("@LockedOverriding\n");
		refined_PrettyPrint_MethodDecl_toString(s);
	}
  /**
   * @ast method 
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:2
   */
    Opt substituteBody(Parameterization parTypeDecl) {
		return (Opt)getBlockOpt().substituteAll(parTypeDecl);
	}
  /**
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:5
   */
    private void setOverridingDependencies(final HashSet<SavedMethodDecl> deps) {
		final HashSet<SavedMethodDecl> saved = this.lockedOverridingDependencies;
		refined_LockedOverriding_MethodDecl_setOverridingDependencies(deps);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				@Override
				public void undo() {
					lockedOverridingDependencies = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedOverriding_MethodDecl_setOverridingDependencies(deps);
				}
				
				@Override
				public String toString() {
					return "MethodDecl.setOverridingDependencies";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1169
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__MethodDecl_setID(oldValue);
				}
				@Override
				public String toString() {
					return "MethodDecl.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__MethodDecl_setID(value);
				}
			});
		}
		refined__MethodDecl_setID(value);
	}
  /**
   * @ast method 
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:148
   */
  private boolean refined_MethodDecl_MethodDecl_moreSpecificThan_MethodDecl(MethodDecl m)
{
    if(getNumParameter() == 0)
      return false;
    for(int i = 0; i < getNumParameter(); i++) {
      if(!getParameter(i).type().instanceOf(m.getParameter(i).type()))
        return false;
    }
    return true;
  }
  /**
   * @ast method 
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:200
   */
  private boolean refined_MethodDecl_MethodDecl_overrides_MethodDecl(MethodDecl m)
{ return !isStatic() && !m.isPrivate() && m.accessibleFrom(hostType()) && 
     hostType().instanceOf(m.hostType()) && m.signature().equals(signature()); }
  /**
   * @ast method 
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:69
   */
  private HashSet<MethodDecl> refined_Overriding_MethodDecl_overriddenMethods()
{
		HashSet<MethodDecl> ret = new HashSet<MethodDecl>();
		if(this.isPrivate() || this.isStatic())
			return ret;
		for(Iterator<MethodDecl> iter=possiblyOverriddenAncestors().iterator();
			iter.hasNext();) {
			MethodDecl md = iter.next();
			if(overrides(md))
				ret.add(md);
		}
		return ret;
	}
  protected java.util.Map accessibleFrom_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect AccessControl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:77
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
    if(isPublic()) {
      return true;
    }
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
   * @attribute syn
   * @aspect DataStructures
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:152
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:153
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DataStructures.jrag:157
   */
  public boolean contains(Object o) {
    ASTNode$State state = state();
    try {  return this == o;  }
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
    try {  return getLine(IDstart);  }
    finally {
    }
  }
  protected java.util.Map throwsException_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:146
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean throwsException(TypeDecl exceptionType) {
    Object _parameters = exceptionType;
    if(throwsException_TypeDecl_values == null) throwsException_TypeDecl_values = new java.util.HashMap(4);
    if(throwsException_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)throwsException_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean throwsException_TypeDecl_value = throwsException_compute(exceptionType);
      if(isFinal && num == state().boundariesCrossed) throwsException_TypeDecl_values.put(_parameters, Boolean.valueOf(throwsException_TypeDecl_value));
    return throwsException_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean throwsException_compute(TypeDecl exceptionType) {
    for(int i = 0; i < getNumException(); i++)
      if(exceptionType.instanceOf(getException(i).type()))
        return true;
    return false;
  }
  /**
   * @attribute syn
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:131
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
  protected boolean signature_computed = false;
  /**
   * @apilevel internal
   */
  protected String signature_value;
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:347
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String signature() {
    if(signature_computed) {
      return signature_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    signature_value = signature_compute();
      if(isFinal && num == state().boundariesCrossed) signature_computed = true;
    return signature_value;
  }
  /**
   * @apilevel internal
   */
  private String signature_compute() {
    StringBuffer s = new StringBuffer();
    s.append(name() + "(");
    for(int i = 0; i < getNumParameter(); i++) {
      if(i != 0) s.append(", ");
      s.append(getParameter(i).type().erasure().typeName());
    }
    s.append(")");
    return s.toString();

  }
  /**
   * @attribute syn
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:146
   */
  public boolean sameSignature(MethodDecl m) {
    ASTNode$State state = state();
    try {  return signature().equals(m.signature());  }
    finally {
    }
  }
  protected java.util.Map moreSpecificThan_MethodDecl_values;
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:155
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean moreSpecificThan(MethodDecl m) {
    Object _parameters = m;
    if(moreSpecificThan_MethodDecl_values == null) moreSpecificThan_MethodDecl_values = new java.util.HashMap(4);
    if(moreSpecificThan_MethodDecl_values.containsKey(_parameters)) {
      return ((Boolean)moreSpecificThan_MethodDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean moreSpecificThan_MethodDecl_value = moreSpecificThan_compute(m);
      if(isFinal && num == state().boundariesCrossed) moreSpecificThan_MethodDecl_values.put(_parameters, Boolean.valueOf(moreSpecificThan_MethodDecl_value));
    return moreSpecificThan_MethodDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean moreSpecificThan_compute(MethodDecl m) {
    if(!isVariableArity() && !m.isVariableArity())
      return refined_MethodDecl_MethodDecl_moreSpecificThan_MethodDecl(m);
    int num = Math.max(getNumParameter(), m.getNumParameter());
    for(int i = 0; i < num; i++) {
      TypeDecl t1 = i < getNumParameter() - 1 ? getParameter(i).type() : getParameter(getNumParameter()-1).type().componentType();
      TypeDecl t2 = i < m.getNumParameter() - 1 ? m.getParameter(i).type() : m.getParameter(m.getNumParameter()-1).type().componentType();
      if(!t1.instanceOf(t2))
        return false;
    }
    return true;
  }
  protected java.util.Map overrides_MethodDecl_values;
  /**
   * @attribute syn
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:47
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean overrides(MethodDecl m) {
    Object _parameters = m;
    if(overrides_MethodDecl_values == null) overrides_MethodDecl_values = new java.util.HashMap(4);
    if(overrides_MethodDecl_values.containsKey(_parameters)) {
      return ((Boolean)overrides_MethodDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean overrides_MethodDecl_value = overrides_compute(m);
      if(isFinal && num == state().boundariesCrossed) overrides_MethodDecl_values.put(_parameters, Boolean.valueOf(overrides_MethodDecl_value));
    return overrides_MethodDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean overrides_compute(MethodDecl m) {
		if(lockedOverridingDependencies == null) {
			return refined_MethodDecl_MethodDecl_overrides_MethodDecl(m);
		} else {
			return overriddenMethods().contains(m);
		}
	}
  protected java.util.Map hides_MethodDecl_values;
  /**
   * @attribute syn
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:204
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hides(MethodDecl m) {
    Object _parameters = m;
    if(hides_MethodDecl_values == null) hides_MethodDecl_values = new java.util.HashMap(4);
    if(hides_MethodDecl_values.containsKey(_parameters)) {
      return ((Boolean)hides_MethodDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean hides_MethodDecl_value = hides_compute(m);
      if(isFinal && num == state().boundariesCrossed) hides_MethodDecl_values.put(_parameters, Boolean.valueOf(hides_MethodDecl_value));
    return hides_MethodDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean hides_compute(MethodDecl m) {  return isStatic() && !m.isPrivate() && m.accessibleFrom(hostType()) && 
     hostType().instanceOf(m.hostType()) && m.signature().equals(signature());  }
  protected java.util.Map parameterDeclaration_String_values;
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:99
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet parameterDeclaration(String name) {
    Object _parameters = name;
    if(parameterDeclaration_String_values == null) parameterDeclaration_String_values = new java.util.HashMap(4);
    if(parameterDeclaration_String_values.containsKey(_parameters)) {
      return (SimpleSet)parameterDeclaration_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet parameterDeclaration_String_value = parameterDeclaration_compute(name);
      if(isFinal && num == state().boundariesCrossed) parameterDeclaration_String_values.put(_parameters, parameterDeclaration_String_value);
    return parameterDeclaration_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet parameterDeclaration_compute(String name) {
    for(int i = 0; i < getNumParameter(); i++)
      if(getParameter(i).name().equals(name))
        return (ParameterDeclaration)getParameter(i);
    return SimpleSet.emptySet;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:224
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:225
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:226
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:227
   */
  public boolean isAbstract() {
    ASTNode$State state = state();
    try {  return getModifiers().isAbstract() || hostType().isInterfaceDecl();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:228
   */
  public boolean isStatic() {
    ASTNode$State state = state();
    try {  return getModifiers().isStatic();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:230
   */
  public boolean isFinal() {
    ASTNode$State state = state();
    try {  return getModifiers().isFinal() || hostType().isFinal() || isPrivate();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:231
   */
  public boolean isSynchronized() {
    ASTNode$State state = state();
    try {  return getModifiers().isSynchronized();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:232
   */
  public boolean isNative() {
    ASTNode$State state = state();
    try {  return getModifiers().isNative();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:233
   */
  public boolean isStrictfp() {
    ASTNode$State state = state();
    try {  return getModifiers().isStrictfp();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:269
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
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:237
   */
  public boolean mayOverrideReturn(MethodDecl m) {
    ASTNode$State state = state();
    try {
    return type().instanceOf(m.type());
  }
    finally {
    }
  }
  /* It is also a compile-time error if any method declared in an annotation type has a
  signature that is override-equivalent to that of any public or protected method
  declared in class Object or in the interface annotation.Annotation* @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:139
   */
  public boolean annotationMethodOverride() {
    ASTNode$State state = state();
    try {  return !hostType().ancestorMethods(signature()).isEmpty();  }
    finally {
    }
  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:323
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1062
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
  private boolean usesTypeVariable_compute() {  return getModifiers().usesTypeVariable() || getTypeAccess().usesTypeVariable() ||
    getParameterList().usesTypeVariable() || getExceptionList().usesTypeVariable();  }
  /**
   * @apilevel internal
   */
  protected boolean sourceMethodDecl_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl sourceMethodDecl_value;
  /**
   * @attribute syn
   * @aspect SourceDeclarations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1511
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl sourceMethodDecl() {
    if(sourceMethodDecl_computed) {
      return sourceMethodDecl_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceMethodDecl_value = sourceMethodDecl_compute();
      if(isFinal && num == state().boundariesCrossed) sourceMethodDecl_computed = true;
    return sourceMethodDecl_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl sourceMethodDecl_compute() {  return this;  }
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
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:284
   */
  public int arity() {
    ASTNode$State state = state();
    try {  return getNumParameter();  }
    finally {
    }
  }
  /* The method is then a variable arity method. Otherwise, it is a fixed arity method.* @attribute syn
   * @aspect VariableArityParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:33
   */
  public boolean isVariableArity() {
    ASTNode$State state = state();
    try {  return getNumParameter() == 0 ? false : getParameter(getNumParameter()-1).isVariableArity();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableArityParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:38
   */
  public ParameterDeclaration lastParameter() {
    ASTNode$State state = state();
    try {  return getParameter(getNumParameter() - 1);  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isPure_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isPure_value;
  /* crude approximation of when a method is pure * @attribute syn
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:61
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isPure() {
    if(isPure_computed) {
      return isPure_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isPure_value = isPure_compute();
      if(isFinal && num == state().boundariesCrossed) isPure_computed = true;
    return isPure_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isPure_compute() {
		// Object.getClass() is pure
		if(name().equals("getClass") && getNumParameter() == 0)
			return true;
		// if the method could be overridden or we don't have access to its body, assume the worst
		if(!isStatic() && !isPrivate() || !hasBlock())
			return false;
		// if the body is 'return c;' for a constant c, the method is pure
		Block body = getBlock();
		if(body.getNumStmt() != 1)
			return false;
		if(!(body.getStmt(0) instanceof ReturnStmt))
			return false;
		ReturnStmt ret = (ReturnStmt)body.getStmt(0);
		return !ret.hasResult() || ret.getResult().isConstant() || ret.getResult() instanceof NullLiteral;
	}
  /**
   * @apilevel internal
   */
  protected boolean uncheckedExceptionExit_computed = false;
  /**
   * @apilevel internal
   */
  protected Stmt uncheckedExceptionExit_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:721
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt uncheckedExceptionExit() {
    if(uncheckedExceptionExit_computed) {
      return uncheckedExceptionExit_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    uncheckedExceptionExit_value = uncheckedExceptionExit_compute();
    uncheckedExceptionExit_value.setParent(this);
    uncheckedExceptionExit_value.is$Final = true;
      if(true) uncheckedExceptionExit_computed = true;
    return uncheckedExceptionExit_value;
  }
  /**
   * @apilevel internal
   */
  private Stmt uncheckedExceptionExit_compute() {  return uncheckedExceptionExit;  }
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:2
   */
  public boolean isUnknown() {
    ASTNode$State state = state();
    try {  return hostType().isUnknown();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:15
   */
  public boolean canBeAbstract() {
    ASTNode$State state = state();
    try {  return !(isNative() || isFinal() || isStatic() || !monoUses().isEmpty() || isPrivate());  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isCallable_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isCallable_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:29
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isCallable() {
    if(isCallable_computed) {
      return isCallable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isCallable_value = isCallable_compute();
      if(isFinal && num == state().boundariesCrossed) isCallable_computed = true;
    return isCallable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isCallable_compute() {  return !monoUses().isEmpty() || isDynamicallyCallable();  }
  /**
   * @apilevel internal
   */
  protected boolean monoUses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodAccess> monoUses_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:32
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodAccess> monoUses() {
    if(monoUses_computed) {
      return monoUses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    monoUses_value = monoUses_compute();
      if(isFinal && num == state().boundariesCrossed) monoUses_computed = true;
    return monoUses_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodAccess> monoUses_compute() {
		Collection<MethodAccess> res = new HashSet<MethodAccess>();
		for(MethodAccess ma : uses())
			if(ma.isMonoCall())
				res.add(ma);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean isDynamicallyCallable_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isDynamicallyCallable_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:42
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDynamicallyCallable() {
    if(isDynamicallyCallable_computed) {
      return isDynamicallyCallable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isDynamicallyCallable_value = isDynamicallyCallable_compute();
      if(isFinal && num == state().boundariesCrossed) isDynamicallyCallable_computed = true;
    return isDynamicallyCallable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDynamicallyCallable_compute() {
		if(isStatic() || isPrivate())
			return false;
		// not if neither this method nor a method it overrides is ever called
		boolean found_non_locked = false;
		for(MethodAccess ma : polyUses()) {
			if(!ma.isLocked() || ma.decl() != this) {
				found_non_locked = true;
				break;
			}
		}
		if(!found_non_locked)
			return false;
		// not if no object of a type that inherits this method is ever constructed
		for(TypeDecl td : inheritingTypes())
			if(td.instancesAreConstructed())
				return true;
		return false;
	}
  /**
   * @apilevel internal
   */
  protected boolean inheritingTypes_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeDecl> inheritingTypes_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:64
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeDecl> inheritingTypes() {
    if(inheritingTypes_computed) {
      return inheritingTypes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    inheritingTypes_value = inheritingTypes_compute();
      if(isFinal && num == state().boundariesCrossed) inheritingTypes_computed = true;
    return inheritingTypes_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeDecl> inheritingTypes_compute() {
		if(isStatic() || isPrivate())
			return Collections.singleton(hostType());
		Collection<TypeDecl> result = new HashSet<TypeDecl>();
		LinkedList<TypeDecl> worklist = new LinkedList<TypeDecl>();
		worklist.add(hostType());
		while(!worklist.isEmpty()) {
			TypeDecl td = worklist.removeFirst();
			result.add(td);
			for(TypeDecl child : td.childTypes())
				if(!child.overrides(this))
					worklist.addFirst(child);
		}
		return result;
	}
  protected java.util.Map ancestorIn_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:89
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl ancestorIn(TypeDecl td) {
    Object _parameters = td;
    if(ancestorIn_TypeDecl_values == null) ancestorIn_TypeDecl_values = new java.util.HashMap(4);
    if(ancestorIn_TypeDecl_values.containsKey(_parameters)) {
      return (MethodDecl)ancestorIn_TypeDecl_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    MethodDecl ancestorIn_TypeDecl_value = ancestorIn_compute(td);
      if(isFinal && num == state().boundariesCrossed) ancestorIn_TypeDecl_values.put(_parameters, ancestorIn_TypeDecl_value);
    return ancestorIn_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl ancestorIn_compute(TypeDecl td) {
		if(td.subtype(hostType()))
			return this;
		for(MethodDecl md : overriddenMethods())
			if(md.ancestorIn(td) != null)
				return md.ancestorIn(td);
		return null;
	}
  /**
   * @apilevel internal
   */
  protected boolean relatives_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> relatives_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:156
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> relatives() {
    if(relatives_computed) {
      return relatives_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    relatives_value = relatives_compute();
      if(isFinal && num == state().boundariesCrossed) relatives_computed = true;
    return relatives_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> relatives_compute() {
		if(isPrivate() || isStatic())
			return Collections.singleton(this);
    	
		java.util.Set<ReferenceType> seen = new HashSet<ReferenceType>();
		java.util.Stack<ReferenceType> to_process = new Stack<ReferenceType>();
		java.util.Stack<String> sigs = new Stack<String>();
		Collection<MethodDecl> res = new LinkedHashSet<MethodDecl>();
		
		to_process.push((ReferenceType) this.hostType().sourceTypeDecl());
		sigs.push(signature());
		
		while (!to_process.isEmpty()) {
			ReferenceType rt = to_process.pop();
			String sig = sigs.pop();
			if (seen.contains(rt))
				continue;
			else
				seen.add(rt);
			
			if (rt instanceof ClassDecl) {
				ClassDecl cd = (ClassDecl) rt;
				
				SimpleSet m = cd.localMethodsSignature(sig);
				assert(m.size() <= 1);
				for (Iterator i = m.iterator(); i.hasNext();) {
					MethodDecl md = (MethodDecl) i.next();
					if (md instanceof MethodDeclSubstituted)
						md = ((MethodDeclSubstituted) md).getOriginal();
					
					res.add(md);
				}

				// superclass
				if(!cd.isObject()) {
					TypeDecl superclass = cd.superclass().sourceTypeDecl();
					String sup_sig = superTypeSignature(sig, superclass, cd);
					SimpleSet mds = superclass.methodsSignature(sup_sig);
					if (!mds.isEmpty() && ((MethodDecl) mds.iterator().next()).accessibleFrom(cd)) {
						to_process.push((ReferenceType)superclass);
						sigs.push(sup_sig);
					}
				}
				
				// interfaces
				for (Iterator i = cd.interfacesSourceDecls().iterator(); i.hasNext();) {
					InterfaceDecl id = (InterfaceDecl) i.next();
					String sup_sigg = superTypeSignature(sig, id, cd);
					if (!id.methodsSignature(sup_sigg).isEmpty()) {
						to_process.push(id);
						sigs.push(sup_sigg);
					}
				}
				
			} else if (rt instanceof InterfaceDecl) {
				InterfaceDecl id = (InterfaceDecl) rt;
				
				SimpleSet m = id.localMethodsSignature(sig);
				assert(m.size() <= 1);
				for (Iterator i = m.iterator(); i.hasNext();) {
					MethodDecl md = (MethodDecl) i.next();
					if (md instanceof MethodDeclSubstituted)
						md = ((MethodDeclSubstituted) md).getOriginal();
					
					res.add(md);
				}
				
				// super interfaces
				for (Iterator<InterfaceDecl> i = id.superInterfacesSourceDecls().iterator(); i.hasNext();) {
					InterfaceDecl idecl = i.next();
					String sup_sig = superTypeSignature(sig, idecl, rt);
					if (!idecl.methodsSignature(sup_sig).isEmpty()) {
						to_process.push(idecl);
						sigs.push(sup_sig);
					}
				}
				
			} else
				throw new RefactoringException("unexpected state");
			

			// child types
			for (Iterator i = rt.childTypes().iterator(); i.hasNext();) {
				ReferenceType rtp = (ReferenceType) ((ReferenceType) i.next()).sourceTypeDecl();
				String sub_sig = subTypeSignature(sig, rt, rtp);
				SimpleSet mds = rtp.methodsSignature(sub_sig);
				if (!mds.isEmpty() && ((MethodDecl)mds.iterator().next())
								// these should be OK even if there are more such methods
							.accessibleFrom(rt)
						) {
					to_process.push(rtp);
					sigs.push(sub_sig);
				}
			}
			
		}
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean isCallableFromOutside_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isCallableFromOutside_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:331
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isCallableFromOutside() {
    if(isCallableFromOutside_computed) {
      return isCallableFromOutside_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isCallableFromOutside_value = isCallableFromOutside_compute();
      if(isFinal && num == state().boundariesCrossed) isCallableFromOutside_computed = true;
    return isCallableFromOutside_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isCallableFromOutside_compute() {
		if(isDynamicallyCallable()) {
			for(MethodAccess ma : polyUses())
				if(!ma.isDescendantTo(getBlock()))
					return true;
		} else {
			for(MethodAccess ma : monoUses())
				if(!ma.isDescendantTo(getBlock()))
					return true;
		}
		return false;
	}
  /**
   * @apilevel internal
   */
  protected boolean isReferencedFromOutside_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isReferencedFromOutside_value;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:345
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isReferencedFromOutside() {
    if(isReferencedFromOutside_computed) {
      return isReferencedFromOutside_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isReferencedFromOutside_value = isReferencedFromOutside_compute();
      if(isFinal && num == state().boundariesCrossed) isReferencedFromOutside_computed = true;
    return isReferencedFromOutside_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isReferencedFromOutside_compute() {
		for(MethodAccess ma : uses())
			if(!ma.isDescendantTo(getBlock()))
				return true;
		return false;
	}
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:12
   */
  public boolean isPackageProtected() {
    ASTNode$State state = state();
    try {  return !isPublic() && !isPrivate() && !isProtected();  }
    finally {
    }
  }
  protected java.util.Map canOverrideOrHide_MethodDecl_values;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean canOverrideOrHide(MethodDecl md) {
    Object _parameters = md;
    if(canOverrideOrHide_MethodDecl_values == null) canOverrideOrHide_MethodDecl_values = new java.util.HashMap(4);
    if(canOverrideOrHide_MethodDecl_values.containsKey(_parameters)) {
      return ((Boolean)canOverrideOrHide_MethodDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean canOverrideOrHide_MethodDecl_value = canOverrideOrHide_compute(md);
      if(isFinal && num == state().boundariesCrossed) canOverrideOrHide_MethodDecl_values.put(_parameters, Boolean.valueOf(canOverrideOrHide_MethodDecl_value));
    return canOverrideOrHide_MethodDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean canOverrideOrHide_compute(MethodDecl md) {
		// this code is copy-n-pasted from TypeHierarchyCheck.jrag sans error messages
		if(!isStatic() && !md.isPrivate() && 
				md.accessibleFrom(hostType()) && hostType().instanceOf(md.hostType())) {
			if(md.isStatic())
				return false;
			if(!mayOverrideReturn(md))
				return false;
			for(int i = 0; i < getNumException(); i++) {
				Access e = getException(i);
				boolean found = false;
				for(int j = 0; !found && j < md.getNumException(); j++) {
					if(e.type().instanceOf(md.getException(j).type()))
						found = true;
				}
				if(!found && e.type().isUncheckedException())
					return false;
			}
			if(md.isPublic() && !isPublic() ||
		       md.isProtected() && !(isPublic() || isProtected()) ||
		       !md.isPrivate() && !md.isProtected() && !md.isPublic() && isPrivate())
				return false;
			if(md.isFinal())
				return false;
		} else if(isStatic() && !md.isPrivate() && 
				md.accessibleFrom(hostType()) && hostType().instanceOf(md.hostType())) {
			if(!md.isStatic())
				return false;
			if(type() != md.type())
				return false;
			for(int i = 0; i < getNumException(); i++) {
				Access e = getException(i);
				boolean found = false;
				for(int j = 0; !found && j < md.getNumException(); j++) {
					if(e.type().instanceOf(md.getException(j).type()))
						found = true;
				}
				if(!found)
					return false;
			}
			if(md.isPublic() && !isPublic() ||
			   md.isProtected() && !(isPublic() || isProtected()) ||
			   !md.isPrivate() && !md.isProtected() && !md.isPublic() && isPrivate())
				return false;
			if(md.isFinal())
				return false;
		}
		return true;
	}
  /**
   * @apilevel internal
   */
  protected boolean overriddenMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected HashSet<MethodDecl> overriddenMethods_value;
  /**
   * @attribute syn
   * @aspect LockedOverriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/LockedOverriding.jrag:36
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashSet<MethodDecl> overriddenMethods() {
    if(overriddenMethods_computed) {
      return overriddenMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    overriddenMethods_value = overriddenMethods_compute();
      if(isFinal && num == state().boundariesCrossed) overriddenMethods_computed = true;
    return overriddenMethods_value;
  }
  /**
   * @apilevel internal
   */
  private HashSet<MethodDecl> overriddenMethods_compute() {
		if(lockedOverridingDependencies == null) {
			return refined_Overriding_MethodDecl_overriddenMethods();
		} else {
			HashSet<MethodDecl> res = new HashSet<MethodDecl>();
			for(SavedMethodDecl md : lockedOverridingDependencies)
				res.add(md.getDecl());
			return res;
		}
	}
  /**
   * @apilevel internal
   */
  protected boolean hiddenMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected HashSet<MethodDecl> hiddenMethods_value;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:83
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashSet<MethodDecl> hiddenMethods() {
    if(hiddenMethods_computed) {
      return hiddenMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    hiddenMethods_value = hiddenMethods_compute();
      if(isFinal && num == state().boundariesCrossed) hiddenMethods_computed = true;
    return hiddenMethods_value;
  }
  /**
   * @apilevel internal
   */
  private HashSet<MethodDecl> hiddenMethods_compute() {
		HashSet<MethodDecl> ret = new HashSet<MethodDecl>();
		if(!this.isStatic())
			return ret;
		for(Iterator<MethodDecl> iter=possiblyOverriddenAncestors().iterator();
			iter.hasNext();) {
			MethodDecl md = iter.next();
			if(hides(md))
				ret.add(md);
		}
		return ret;		
	}
  /**
   * @apilevel internal
   */
  protected boolean rootDefs_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> rootDefs_value;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:127
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> rootDefs() {
    if(rootDefs_computed) {
      return rootDefs_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    rootDefs_value = rootDefs_compute();
      if(isFinal && num == state().boundariesCrossed) rootDefs_computed = true;
    return rootDefs_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> rootDefs_compute() {
		if(isPrivate() || isStatic())
			return Collections.singleton(this);
		Collection<MethodDecl> res = new LinkedHashSet<MethodDecl>();
		LinkedList<MethodDecl> worklist = new LinkedList<MethodDecl>();
		worklist.addFirst(this);
		while(!worklist.isEmpty()) {
			MethodDecl md = worklist.removeFirst();
			if(res.contains(md))
				continue;
			if(md.overriddenMethods().isEmpty())
				res.add(md);
			worklist.addAll(md.overriddenMethods());
		}
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean indirectlyOverriddenMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> indirectlyOverriddenMethods_value;
  /* Indirect overriding: We say that a method m in a class A indirectly overrides a method m' in an interface
	 * 						I if there is some class C inheriting both m from A and m' from I under the same
	 *                      signature, yet A itself does not inherit m' under the signature of m.
	 * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:210
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> indirectlyOverriddenMethods() {
    if(indirectlyOverriddenMethods_computed) {
      return indirectlyOverriddenMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    indirectlyOverriddenMethods_value = indirectlyOverriddenMethods_compute();
      if(isFinal && num == state().boundariesCrossed) indirectlyOverriddenMethods_computed = true;
    return indirectlyOverriddenMethods_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> indirectlyOverriddenMethods_compute() {
		Collection<TypeDecl> inheritors = inheritingTypes();
		Collection<MethodDecl> res = new HashSet<MethodDecl>();
		for(TypeDecl inheritor : inheritors) {
			if(inheritor == hostType())
				continue;
			for(InterfaceDecl sup : inheritor.superinterfaces())
				for(Iterator<MethodDecl> iter = sup.methodsSignature(signature()).iterator();iter.hasNext();)
					res.add(iter.next());
		}
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean possiblyHiddenMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> possiblyHiddenMethods_value;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:223
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> possiblyHiddenMethods() {
    if(possiblyHiddenMethods_computed) {
      return possiblyHiddenMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    possiblyHiddenMethods_value = possiblyHiddenMethods_compute();
      if(isFinal && num == state().boundariesCrossed) possiblyHiddenMethods_computed = true;
    return possiblyHiddenMethods_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> possiblyHiddenMethods_compute() {
		HashSet<MethodDecl> ret = new HashSet<MethodDecl>();
		if(!this.isStatic())
			return ret;
		return possiblyOverriddenAncestors();
	}
  /**
   * @attribute syn
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:46
   */
  public Collection<MethodAccess> polyUses() {
    ASTNode$State state = state();
    try {
		if (((hostType() instanceof ClassDecl &&
				!((ClassDecl)hostType()).hasSuperClassAccess() &&
				!((ClassDecl)hostType()).interfacesIterator().hasNext())
			  ||
				(hostType() instanceof InterfaceDecl &&
				!((InterfaceDecl)hostType()).superinterfacesIterator().hasNext()))
			&&
				programRoot().typeObject().methodsSignature(signature()).isEmpty())
				return uses();
		return polyUses_();
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
  protected Collection<MethodAccess> uses_value;
  /**
   * @attribute syn
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:63
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodAccess> uses() {
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
  private Collection<MethodAccess> uses_compute() {
		Collection<MethodAccess> col = new LinkedList<MethodAccess>();
		programRoot().collect__MethodDecl_Uses(this, name(), col);
		return col;
	}
  protected java.util.Map isGetterFor_FieldDeclaration_values;
  /**
   * @attribute syn
   * @aspect VariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/VariableExt.jrag:34
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isGetterFor(FieldDeclaration fd) {
    Object _parameters = fd;
    if(isGetterFor_FieldDeclaration_values == null) isGetterFor_FieldDeclaration_values = new java.util.HashMap(4);
    if(isGetterFor_FieldDeclaration_values.containsKey(_parameters)) {
      return ((Boolean)isGetterFor_FieldDeclaration_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isGetterFor_FieldDeclaration_value = isGetterFor_compute(fd);
      if(isFinal && num == state().boundariesCrossed) isGetterFor_FieldDeclaration_values.put(_parameters, Boolean.valueOf(isGetterFor_FieldDeclaration_value));
    return isGetterFor_FieldDeclaration_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isGetterFor_compute(FieldDeclaration fd) {
		if(getNumParameter() != 0 || type() != fd.type() || !hasBlock())
			return false;
		Block body = getBlock();
		if(body.getNumStmt() != 1 || !(body.getStmt(0) instanceof ReturnStmt))
			return false;
		ReturnStmt ret = (ReturnStmt)body.getStmt(0);
		return ret.hasResult() && ret.getResult().isFieldAccessInThis(fd);
	}
  /**
   * @apilevel internal
   */
  protected boolean accessibilityConstraintsFromOverridingAndHiding_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<AccessibilityConstraint> accessibilityConstraintsFromOverridingAndHiding_value;
  /**
   * @attribute syn
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:93
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<AccessibilityConstraint> accessibilityConstraintsFromOverridingAndHiding() {
    if(accessibilityConstraintsFromOverridingAndHiding_computed) {
      return accessibilityConstraintsFromOverridingAndHiding_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    accessibilityConstraintsFromOverridingAndHiding_value = accessibilityConstraintsFromOverridingAndHiding_compute();
      if(isFinal && num == state().boundariesCrossed) accessibilityConstraintsFromOverridingAndHiding_computed = true;
    return accessibilityConstraintsFromOverridingAndHiding_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<AccessibilityConstraint> accessibilityConstraintsFromOverridingAndHiding_compute() {
		Collection<AccessibilityConstraint> constrs = new HashSet<AccessibilityConstraint>();
		// (Sub-1), (Sub-2), (Dyn-1)
		for(MethodDecl that : overriddenMethods()) {
			constrs.add(new AccessibilityConstraint(this, that, Operator.LE, this));
			constrs.add(new AccessibilityConstraint(this, that.minAccess(hostType().hostPackage(), hostType()), Operator.LE, that));
		}
		for(MethodDecl that : indirectlyOverriddenMethods()) {
			constrs.add(new AccessibilityConstraint(this, that, Operator.LE, this));
			// we don't need to generate a second constraint as above: "that" is an interface method, which must be public
		}
		// (Sub-1)
		for(MethodDecl that : possiblyHiddenMethods()) {
			/* We want to encode the conditional constraint
			 *
			 *   this.hides(that) -> accessibility(that) <= accessibility(this)
			 *
			 * Note that whether or not this.hides(that) is itself determined by the result of the constraint solving process.
			 * Fortunately, we can encode this conditional constraint as the unconditional constraint
			 * 
			 *   accessibility(that) <= max(a-1, accessibility(this))
			 *   
			 * where a is the minimum accessibility of "that" from within the host type of "this". 
			 */
			int alpha = Math.max(VIS_PACKAGE, that.minAccess(hostType().hostPackage(), hostType()));
			constrs.add(new AccessibilityConstraint(this, that, Operator.LE, new MaxAccessibility(alpha-1, this)));
		}
		// (Dyn-2)
		for(MethodDecl that : possiblyOverriddenAncestors()) {
			if(this.isStatic() ? !that.isStatic() : !this.overrides(that)) {
				// we want to avoid "this" overriding "that"
				// note that we never need to require for the visibility of "that" to be less than private, hence the Math.max
				int alpha = Math.max(VIS_PACKAGE, that.minAccess(hostType().hostPackage(), hostType()));
				constrs.add(new AccessibilityConstraint(this, that, Operator.LT, alpha));
			}
		}
		return constrs;
	}
  /**
   * @apilevel internal
   */
  protected boolean isMainMethod_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isMainMethod_value;
  /**
   * @attribute syn
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:170
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isMainMethod() {
    if(isMainMethod_computed) {
      return isMainMethod_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isMainMethod_value = isMainMethod_compute();
      if(isFinal && num == state().boundariesCrossed) isMainMethod_computed = true;
    return isMainMethod_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isMainMethod_compute() {  return name().equals("main") && isStatic() && isPublic() && getNumParameter() == 1 && getParameter(0).type().isArrayDecl() &&
		    ((ArrayDecl)getParameter(0).type()).elementType().isString();  }
  /**
   * @attribute syn
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:211
   */
  public AnonymousMethod asAnonymousMethod() {
    ASTNode$State state = state();
    try {
		return new AnonymousMethod(getParameterList(),
								   new List<TypeVariable>(),
								   getTypeAccess(),
								   getExceptions(),
								   getBlock(),
								   new List<Expr>());
	}
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean thisEscapes_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean thisEscapes_value;
  /**
   * @attribute syn
   * @aspect FieldAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:83
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean thisEscapes() {
    if(thisEscapes_computed) {
      return thisEscapes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    thisEscapes_value = thisEscapes_compute();
      if(isFinal && num == state().boundariesCrossed) thisEscapes_computed = true;
    return thisEscapes_value;
  }
  /**
   * @apilevel internal
   */
  private boolean thisEscapes_compute() {
		if(isStatic())
			return false;
		String fullName = hostType().fullName() + "." + signature();
		String[] nonLeakyMethods = {
			"java.lang.Object.wait(long)", "java.lang.Object.wait(long, int)", "java.lang.Object.wait()",
			"java.lang.Object.notify()", "java.lang.Object.notifyAll()",
			
			"java.util.ArrayList.size()", "java.util.ArrayList.get(int)", "java.util.ArrayList.set(int, java.lang.Object)", "java.util.ArrayList.subList(int, int)", "java.util.ArrayList.add(java.lang.Object)",
			"java.util.AbstractList.subList(int, int)",
			
			"java.util.HashSet.size()", "java.util.HashSet.isEmpty()", "java.util.HashSet.contains(java.lang.Object)", "java.util.HashSet.add(java.lang.Object)", 
			"java.util.HashSet.remove(java.lang.Object)", "java.util.HashSet.containsAll(java.util.Collection)", "java.util.HashSet.iterator()",
			
			"java.util.AbstractCollection.addAll(java.util.Collection)",
			
			"java.util.HashMap.get(java.lang.Object)", "java.util.HashMap.put(java.lang.Object, java.lang.Object)", "java.util.HashMap.keySet()", "java.util.HashMap.containsKey(java.lang.Object)",
			"java.util.HashMap.size()", "java.util.HashMap.remove(java.lang.Object)", "java.util.HashMap.entrySet()", "java.util.HashMap.values()",
			"java.util.HashMap.isEmpty()", "java.util.HashMap.clear()",
			
			"java.util.IdentityHashMap.get(java.lang.Object)", "java.util.IdentityHashMap.put(java.lang.Object, java.lang.Object)", "java.util.IdentityHashMap.keySet()", "java.util.IdentityHashMap.containsKey(java.lang.Object)",
			"java.util.IdentityHashMap.size()", "java.util.IdentityHashMap.remove(java.lang.Object)", "java.util.IdentityHashMap.entrySet()", "java.util.IdentityHashMap.values()",
			"java.util.IdentityHashMap.isEmpty()", "java.util.IdentityHashMap.clear()",
			
			"java.util.WeakHashMap.get(java.lang.Object)", "java.util.WeakHashMap.put(java.lang.Object, java.lang.Object)", "java.util.WeakHashMap.keySet()", "java.util.WeakHashMap.containsKey(java.lang.Object)",
			"java.util.WeakHashMap.size()", "java.util.WeakHashMap.remove(java.lang.Object)", "java.util.WeakHashMap.entrySet()", "java.util.WeakHashMap.values()",
			"java.util.WeakHashMap.isEmpty()", "java.util.WeakHashMap.clear()",
			
			"java.util.TreeMap.get(java.lang.Object)", "java.util.TreeMap.put(java.lang.Object, java.lang.Object)", "java.util.TreeMap.keySet()", "java.util.TreeMap.containsKey(java.lang.Object)",
			"java.util.TreeMap.size()", "java.util.TreeMap.remove(java.lang.Object)", "java.util.TreeMap.entrySet()", "java.util.TreeMap.values()",
			"java.util.TreeMap.isEmpty()", "java.util.TreeMap.clear()",
			
			"java.util.TreeSet.add(java.lang.Object)", "java.util.TreeSet.iterator()"

//			"java.text.SimpleDateFormat.parse(java.lang.String, java.text.ParsePosition)", "java.text.SimpleDateFormat.format(java.util.Date, java.lang.StringBuffer, java.text.FieldPosition)"
		};
		boolean contains = Arrays.asList(nonLeakyMethods).contains(fullName);
		if(contains)
			return false;
		return true;
	}
  /**
   * @apilevel internal
   */
  protected boolean getAcquiredMonitor_computed = false;
  /**
   * @apilevel internal
   */
  protected Monitor getAcquiredMonitor_value;
  /**
   * @attribute syn
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:68
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Monitor getAcquiredMonitor() {
    if(getAcquiredMonitor_computed) {
      return getAcquiredMonitor_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getAcquiredMonitor_value = getAcquiredMonitor_compute();
      if(isFinal && num == state().boundariesCrossed) getAcquiredMonitor_computed = true;
    return getAcquiredMonitor_value;
  }
  /**
   * @apilevel internal
   */
  private Monitor getAcquiredMonitor_compute() {  return isSynchronized() ? (isStatic() ? new ClassMonitor(hostType()) : new Monitor(hostType())) : null;  }
  /**
   * @apilevel internal
   */
  protected boolean getMonitorExpr_computed = false;
  /**
   * @apilevel internal
   */
  protected Expr getMonitorExpr_value;
  /**
   * @attribute syn
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:74
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr getMonitorExpr() {
    if(getMonitorExpr_computed) {
      return getMonitorExpr_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getMonitorExpr_value = getMonitorExpr_compute();
      if(isFinal && num == state().boundariesCrossed) getMonitorExpr_computed = true;
    return getMonitorExpr_value;
  }
  /**
   * @apilevel internal
   */
  private Expr getMonitorExpr_compute() {  return isSynchronized() ? (isStatic() ? new AbstractDot(hostType().createLockedAccess(), new ClassAccess()) : new ThisAccess("this")) : null;  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:185
   */
  public String describeConstraintVariable() {
    ASTNode$State state = state();
    try {  return "Decl(" + hostType().fullName() + "." + signature() + ")";  }
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
  protected java.util.Map getIndexOfParameter_String_values;
  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:56
   */
  @SuppressWarnings({"unchecked", "cast"})
  public int getIndexOfParameter(String name) {
    Object _parameters = name;
    if(getIndexOfParameter_String_values == null) getIndexOfParameter_String_values = new java.util.HashMap(4);
    if(getIndexOfParameter_String_values.containsKey(_parameters)) {
      return ((Integer)getIndexOfParameter_String_values.get(_parameters)).intValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    int getIndexOfParameter_String_value = getIndexOfParameter_compute(name);
      if(isFinal && num == state().boundariesCrossed) getIndexOfParameter_String_values.put(_parameters, Integer.valueOf(getIndexOfParameter_String_value));
    return getIndexOfParameter_String_value;
  }
  /**
   * @apilevel internal
   */
  private int getIndexOfParameter_compute(String name) {
		for(int i=0; i<getNumParameter(); ++i)
			if(getParameter(i).name().equals(name))
				return i;
		return -1;
	}
  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:91
   */
  public boolean throwsSameExceptionsAs(Callable that) {
    ASTNode$State state = state();
    try {
		if(this.getExceptionList().getNumChild() != that.getExceptionList().getNumChild())
			return false;
		for(Access exn : this.getExceptionList())
			if(!that.throwsExactException(exn.type()))
				return false;
		return true;
	}
    finally {
    }
  }
  protected java.util.Map throwsExactException_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:100
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean throwsExactException(TypeDecl exnType) {
    Object _parameters = exnType;
    if(throwsExactException_TypeDecl_values == null) throwsExactException_TypeDecl_values = new java.util.HashMap(4);
    if(throwsExactException_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)throwsExactException_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean throwsExactException_TypeDecl_value = throwsExactException_compute(exnType);
      if(isFinal && num == state().boundariesCrossed) throwsExactException_TypeDecl_values.put(_parameters, Boolean.valueOf(throwsExactException_TypeDecl_value));
    return throwsExactException_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean throwsExactException_compute(TypeDecl exnType) {
		for(Access exn : this.getExceptionList())
			if(exn.type().equals(exnType))
				return true;
		return false;
	}
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:24
   */
  public boolean hasVariable(String name) {
    ASTNode$State state = state();
    try {  return !parameterDeclaration(name).isEmpty();  }
    finally {
    }
  }
  protected java.util.Map accessParameter_Variable_values;
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:224
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessParameter(Variable decl) {
    Object _parameters = decl;
    if(accessParameter_Variable_values == null) accessParameter_Variable_values = new java.util.HashMap(4);
    if(accessParameter_Variable_values.containsKey(_parameters)) {
      return (SymbolicVarAccess)accessParameter_Variable_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SymbolicVarAccess accessParameter_Variable_value = accessParameter_compute(decl);
      if(isFinal && num == state().boundariesCrossed) accessParameter_Variable_values.put(_parameters, accessParameter_Variable_value);
    return accessParameter_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private SymbolicVarAccess accessParameter_compute(Variable decl) {
		for(ParameterDeclaration pd : getParameterList())
			if(pd == decl)
				return pd;
		return unknownVarAccess();
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
  protected java.util.Map handlesException_TypeDecl_values;
  /**
   * @attribute inh
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:51
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean handlesException(TypeDecl exceptionType) {
    Object _parameters = exceptionType;
    if(handlesException_TypeDecl_values == null) handlesException_TypeDecl_values = new java.util.HashMap(4);
    if(handlesException_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)handlesException_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean handlesException_TypeDecl_value = getParent().Define_boolean_handlesException(this, null, exceptionType);
      if(isFinal && num == state().boundariesCrossed) handlesException_TypeDecl_values.put(_parameters, Boolean.valueOf(handlesException_TypeDecl_value));
    return handlesException_TypeDecl_value;
  }
  /**
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:14
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl unknownMethod() {
    ASTNode$State state = state();
    MethodDecl unknownMethod_value = getParent().Define_MethodDecl_unknownMethod(this, null);
    return unknownMethod_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:121
   */
  @SuppressWarnings({"unchecked", "cast"})
  public UnknownVarAccess unknownVarAccess() {
    ASTNode$State state = state();
    UnknownVarAccess unknownVarAccess_value = getParent().Define_UnknownVarAccess_unknownVarAccess(this, null);
    return unknownVarAccess_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:437
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getBlockOptNoTransform()) {
      return v.isFinal() && (v.isClassVariable() || v.isInstanceVariable()) ? true : isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:868
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getBlockOptNoTransform()) {
      return v.isFinal() && (v.isClassVariable() || v.isInstanceVariable()) ? false : true;
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:143
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    if(caller == getBlockOptNoTransform()) {
      return throwsException(exceptionType) || handlesException(exceptionType);
    }
    else {      return getParent().Define_boolean_handlesException(this, caller, exceptionType);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:46
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return parameterDeclaration(name);
  }
    else if(caller == getBlockOptNoTransform()){
    SimpleSet set = parameterDeclaration(name);
    // A declaration of a method parameter name shadows any other variable declarations
    if(!set.isEmpty()) return set;
    // Delegate to other declarations in scope
    return lookupVariable(name);
  }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:271
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:272
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:273
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:274
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeAbstract(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeAbstract(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:275
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:276
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:277
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeSynchronized(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeSynchronized(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:278
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeNative(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeNative(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:279
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeStrictfp(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_mayBeStrictfp(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:246
   * @apilevel internal
   */
  public ASTNode Define_ASTNode_enclosingBlock(ASTNode caller, ASTNode child) {
    if(caller == getBlockOptNoTransform()) {
      return this;
    }
    else {      return getParent().Define_ASTNode_enclosingBlock(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:82
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getExceptionListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getTypeAccessNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:405
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_returnType(ASTNode caller, ASTNode child) {
    if(caller == getBlockOptNoTransform()) {
      return type();
    }
    else {      return getParent().Define_TypeDecl_returnType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:142
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
    if(caller == getBlockOptNoTransform()) {
      return isStatic();
    }
    else {      return getParent().Define_boolean_inStaticContext(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:33
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getBlockOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:61
   * @apilevel internal
   */
  public boolean Define_boolean_isMethodParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return true;
  }
    else {      return getParent().Define_boolean_isMethodParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:62
   * @apilevel internal
   */
  public boolean Define_boolean_isConstructorParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_isConstructorParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:63
   * @apilevel internal
   */
  public boolean Define_boolean_isExceptionHandlerParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_isExceptionHandlerParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:86
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    if(caller == getModifiersNoTransform()) {
      return name.equals("METHOD");
    }
    else {      return getParent().Define_boolean_mayUseAnnotationTarget(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:22
   * @apilevel internal
   */
  public boolean Define_boolean_variableArityValid(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return i == getNumParameter() - 1;
  }
    else {      return getParent().Define_boolean_variableArityValid(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:146
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getBlockOptNoTransform()) {
      return SmallSet.<CFGNode>singleton(exit());
    }
    else if(caller == getParameterListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		if(i + 1 < getNumParameter())
			return SmallSet.<CFGNode>singleton(getParameter(i + 1).first());
		return hasBlock() ? SmallSet.<CFGNode>singleton(getBlock().first()) : SmallSet.<CFGNode>singleton(exit());
	}
  }
    else if(caller == entry_value){
{
		if(getNumParameter() > 0)
			return SmallSet.<CFGNode>singleton(getParameter(0).first());
		return hasBlock() ? SmallSet.<CFGNode>singleton(getBlock().first()) : SmallSet.<CFGNode>singleton(exit());
	}
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:697
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__throwTarget(ASTNode caller, ASTNode child, TypeDecl exn) {
     { 
   int childIndex = this.getIndexOfChild(caller);
{
		// this selects (somewhat arbitrarily) the left-most matching exception type
		for(Access acc : getExceptions())
			if(exn.instanceOf(acc.type()))
				return SmallSet.<CFGNode>singleton(acc);
		if(exn.isCheckedException())	// JastAddJ's definition of checked/unchecked is confused...
			return SmallSet.<CFGNode>singleton(uncheckedExceptionExit());
		return SmallSet.empty();
	}
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:706
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(uncheckedExceptionExit());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:7
   * @apilevel internal
   */
  public Variable Define_Variable_getModifiedVariable(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return null;
    }
    else {      return getParent().Define_Variable_getModifiedVariable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:38
   * @apilevel internal
   */
  public Parameterisable Define_Parameterisable_parameterOwner(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return this;
  }
    else {      return getParent().Define_Parameterisable_parameterOwner(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:160
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return accessParameter(decl);
  }
    else if(caller == getBlockOptNoTransform()){
		SymbolicVarAccess acc = accessParameter(decl);
		if(!acc.isUnknownVarAccess()) return acc;
		return accessVariable(decl).moveInto(this);
	}
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:24
   * @apilevel internal
   */
  public boolean Define_boolean_canIntroduceLocal(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return !hasNestedLocal(name);
  }
    else {      return getParent().Define_boolean_canIntroduceLocal(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:54
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getBlockOptNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:115
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getBlockOptNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else {      return getParent().Define_Stmt_insertStmtAfter(this, caller, s);
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
  protected boolean MethodDecl_coll_overridingMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected HashSet<MethodDecl> MethodDecl_coll_overridingMethods_value;
  /**
   * @attribute coll
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:53
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashSet<MethodDecl> coll_overridingMethods() {
    if(MethodDecl_coll_overridingMethods_computed) {
      return MethodDecl_coll_overridingMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    MethodDecl_coll_overridingMethods_value = coll_overridingMethods_compute();
      if(isFinal && num == state().boundariesCrossed) MethodDecl_coll_overridingMethods_computed = true;
    return MethodDecl_coll_overridingMethods_value;
  }
  java.util.Set MethodDecl_coll_overridingMethods_contributors;
  public java.util.Set MethodDecl_coll_overridingMethods_contributors() {
    if(MethodDecl_coll_overridingMethods_contributors == null) MethodDecl_coll_overridingMethods_contributors  = new ASTNode$State.IdentityHashSet(4);
    return MethodDecl_coll_overridingMethods_contributors;
  }
  /**
   * @apilevel internal
   */
  private HashSet<MethodDecl> coll_overridingMethods_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_MethodDecl_coll_overridingMethods();
    MethodDecl_coll_overridingMethods_value = new HashSet<MethodDecl>();
    if(MethodDecl_coll_overridingMethods_contributors != null)
    for(java.util.Iterator iter = MethodDecl_coll_overridingMethods_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_MethodDecl_MethodDecl_coll_overridingMethods(MethodDecl_coll_overridingMethods_value);
    }
    return MethodDecl_coll_overridingMethods_value;
  }

  /**
   * @apilevel internal
   */
  protected boolean MethodDecl_polyUses__computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodAccess> MethodDecl_polyUses__value;
  /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:42
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodAccess> polyUses_() {
    if(MethodDecl_polyUses__computed) {
      return MethodDecl_polyUses__value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    MethodDecl_polyUses__value = polyUses__compute();
      if(isFinal && num == state().boundariesCrossed) MethodDecl_polyUses__computed = true;
    return MethodDecl_polyUses__value;
  }
  java.util.Set MethodDecl_polyUses__contributors;
  public java.util.Set MethodDecl_polyUses__contributors() {
    if(MethodDecl_polyUses__contributors == null) MethodDecl_polyUses__contributors  = new ASTNode$State.IdentityHashSet(4);
    return MethodDecl_polyUses__contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodAccess> polyUses__compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_MethodDecl_polyUses_();
    MethodDecl_polyUses__value = new HashSet<MethodAccess>();
    if(MethodDecl_polyUses__contributors != null)
    for(java.util.Iterator iter = MethodDecl_polyUses__contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_MethodDecl_MethodDecl_polyUses_(MethodDecl_polyUses__value);
    }
    return MethodDecl_polyUses__value;
  }

  protected void collect_contributors_MethodDecl_coll_overridingMethods() {
    /**
   * @attribute coll
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:54
   */
    for(java.util.Iterator iter = (overriddenMethods()).iterator(); iter.hasNext(); ) {
      MethodDecl ref = (MethodDecl)iter.next();
      if(ref != null)
      ref.MethodDecl_coll_overridingMethods_contributors().add(this);
    }
    super.collect_contributors_MethodDecl_coll_overridingMethods();
  }
  protected void collect_contributors_Program_accessibilityConstraints() {
    /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:89
   */
    {
      Program ref = (Program)(programRoot());
      if(ref != null)
        ref.Program_accessibilityConstraints_contributors().add(this);
      }    /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:160
   */
    if(hostType().isInterfaceDecl()) {
    {
      Program ref = (Program)(programRoot());
      if(ref != null)
        ref.Program_accessibilityConstraints_contributors().add(this);
      }    }
    /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:174
   */
    if(isMainMethod()) {
    {
      Program ref = (Program)(programRoot());
      if(ref != null)
        ref.Program_accessibilityConstraints_contributors().add(this);
      }    }
    super.collect_contributors_Program_accessibilityConstraints();
  }
  protected void contributeTo_MethodDecl_MethodDecl_coll_overridingMethods(HashSet<MethodDecl> collection) {
    super.contributeTo_MethodDecl_MethodDecl_coll_overridingMethods(collection);
    collection.add(this);
  }

  protected void contributeTo_Program_Program_accessibilityConstraints(Collection<AccessibilityConstraint> collection) {
    super.contributeTo_Program_Program_accessibilityConstraints(collection);
    collection.addAll(accessibilityConstraintsFromOverridingAndHiding());
    if(hostType().isInterfaceDecl())
      collection.addAll(Collections.singleton(new AccessibilityConstraint(this, this, Operator.EQ, AccessModifierConstant.PUBLIC)));
    if(isMainMethod())
      collection.addAll(Collections.singleton(new AccessibilityConstraint(this, this, Operator.EQ, AccessModifierConstant.PUBLIC)));
  }

}