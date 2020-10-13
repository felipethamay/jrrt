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
 * @production MethodAccess : {@link Access} ::= <span class="component">&lt;ID:String&gt;</span> <span class="component">Arg:{@link Expr}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:20
 */
public class MethodAccess extends Access implements Cloneable, Call, LockableName {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    computeDAbefore_int_Variable_values = null;
    exceptionCollection_computed = false;
    exceptionCollection_value = null;
    decls_computed = false;
    decls_value = null;
    decl_computed = false;
    decl_value = null;
    type_computed = false;
    type_value = null;
    typeArguments_MethodDecl_values = null;
    getLocation_computed = false;
    getLocation_value = null;
    exceptionalSucc_computed = false;
    exceptionalSucc_value = null;
    uncaughtExceptions_computed = false;
    uncaughtExceptions_value = null;
    possibleTargets_computed = false;
    possibleTargets_value = null;
    getUniqueTarget_computed = false;
    getUniqueTarget_value = null;
    shouldMakeConversionExplicit_TypeDecl_values = null;
    thisEscapes_Expr_values = null;
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
  public MethodAccess clone() throws CloneNotSupportedException {
    MethodAccess node = (MethodAccess)super.clone();
    node.computeDAbefore_int_Variable_values = null;
    node.exceptionCollection_computed = false;
    node.exceptionCollection_value = null;
    node.decls_computed = false;
    node.decls_value = null;
    node.decl_computed = false;
    node.decl_value = null;
    node.type_computed = false;
    node.type_value = null;
    node.typeArguments_MethodDecl_values = null;
    node.getLocation_computed = false;
    node.getLocation_value = null;
    node.exceptionalSucc_computed = false;
    node.exceptionalSucc_value = null;
    node.uncaughtExceptions_computed = false;
    node.uncaughtExceptions_value = null;
    node.possibleTargets_computed = false;
    node.possibleTargets_value = null;
    node.getUniqueTarget_computed = false;
    node.getUniqueTarget_value = null;
    node.shouldMakeConversionExplicit_TypeDecl_values = null;
    node.thisEscapes_Expr_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodAccess copy() {
    try {
      MethodAccess node = (MethodAccess) clone();
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
  public MethodAccess fullCopy() {
    MethodAccess tree = (MethodAccess) copy();
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
   * @aspect AnonymousClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AnonymousClasses.jrag:215
   */
  protected void collectExceptions(Collection c, ASTNode target) {
    super.collectExceptions(c, target);
    for(int i = 0; i < decl().getNumException(); i++)
      c.add(decl().getException(i).type());
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:57
   */
  public void exceptionHandling() {
    for(Iterator iter = exceptionCollection().iterator(); iter.hasNext(); ) {
      TypeDecl exceptionType = (TypeDecl)iter.next();
      if(!handlesException(exceptionType))
        error("" + decl().hostType().fullName() + "." + this + " invoked in " + hostType().fullName() + " may throw uncaught exception " + exceptionType.fullName());
    }
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:253
   */
  protected boolean reachedException(TypeDecl catchType) {
    for(Iterator iter = exceptionCollection().iterator(); iter.hasNext(); ) {
      TypeDecl exceptionType = (TypeDecl)iter.next();
      if(catchType.mayCatch(exceptionType))
        return true;
    }
    return super.reachedException(catchType);
  }
  /**
   * @ast method 
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:119
   */
  private static SimpleSet removeInstanceMethods(SimpleSet c) {
    SimpleSet set = SimpleSet.emptySet;
    for(Iterator iter = c.iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(m.isStatic())
        set = set.add(m);
    }
    return set;
  }
  /**
   * @ast method 
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:158
   */
  public boolean applicable(MethodDecl decl) {
    if(getNumArg() != decl.getNumParameter())
      return false;
    if(!name().equals(decl.name()))
      return false;
    for(int i = 0; i < getNumArg(); i++) {
      if(!getArg(i).type().instanceOf(decl.getParameter(i).type()))
        return false;
    }
    return true;
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:56
   */
  public MethodAccess(String name, List args, int start, int end) {
    this(name, args);
    setStart(start);
    setEnd(end);
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:457
   */
  public void refined_PrettyPrint_MethodAccess_toString(StringBuffer s) {
    s.append(name());
    s.append("(");
    if(getNumArg() > 0) {
      getArg(0).toString(s);
      for(int i = 1; i < getNumArg(); i++) {
        s.append(", ");
        getArg(i).toString(s);
      }
    }
    s.append(")");
  }
  /**
   * @ast method 
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:23
   */
  public void nameCheck() {
    if(isQualified() && qualifier().isPackageAccess() && !qualifier().isUnknown())
      error("The method " + decl().signature() + 
          " can not be qualified by a package name.");
    if(isQualified() && decl().isAbstract() && qualifier().isSuperAccess())
      error("may not access abstract methods in superclass");
    if(decls().isEmpty() && (!isQualified() || !qualifier().isUnknown())) {
      StringBuffer s = new StringBuffer();
      s.append("no method named " + name());
      s.append("(");
      for(int i = 0; i < getNumArg(); i++) {
        if(i != 0)
          s.append(", ");
        s.append(getArg(i).type().typeName());
      }
      s.append(")" + " in " + methodHost() + " matches.");
      if(singleCandidateDecl() != null)
        s.append(" However, there is a method " + singleCandidateDecl().signature());
      error(s.toString());
    }
    if(decls().size() > 1) {
      boolean allAbstract = true;
      for(Iterator iter = decls().iterator(); iter.hasNext() && allAbstract; ) {
         MethodDecl m = (MethodDecl)iter.next();
        if(!m.isAbstract() && !m.hostType().isObject())
          allAbstract = false;
      }
      if(!allAbstract && validArgs()) {
        StringBuffer s = new StringBuffer();
        s.append("several most specific methods for " + this + "\n");
        for(Iterator iter = decls().iterator(); iter.hasNext(); ) {
          MethodDecl m = (MethodDecl)iter.next();
          s.append("    " + m.signature() + " in " + m.hostType().typeName() + "\n");
        }
        error(s.toString());
      }
       
    }
  }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:336
   */
  public void checkModifiers() {
    if(decl().isDeprecated() &&
      !withinDeprecatedAnnotation() &&
      hostType().topLevelType() != decl().hostType().topLevelType() &&
      !withinSuppressWarnings("deprecation"))
        warning(decl().signature() + " in " + decl().hostType().typeName() + " has been deprecated");
  }
  /**
   * @ast method 
   * @aspect GenericMethodsInference
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:46
   */
  public Collection computeConstraints(GenericMethodDecl decl) {
    Constraints c = new Constraints();
    // store type parameters
    for(int i = 0; i < decl.original().getNumTypeParameter(); i++)
      c.addTypeVariable(decl.original().getTypeParameter(i));
    
    // add initial constraints
    for(int i = 0; i < getNumArg(); i++) {
      TypeDecl A = getArg(i).type();
      int index = i >= decl.getNumParameter() ? decl.getNumParameter() - 1 : i;
      TypeDecl F = decl.getParameter(index).type();
      if(decl.getParameter(index) instanceof VariableArityParameterDeclaration 
         && (getNumArg() != decl.getNumParameter() || !A.isArrayDecl())) {
        F = F.componentType();
      }
      c.convertibleTo(A, F);
    }
    if(c.rawAccess)
      return new ArrayList();
    
    //c.printConstraints();
    //System.err.println("Resolving equality constraints");
    c.resolveEqualityConstraints();
    //c.printConstraints();

    //System.err.println("Resolving supertype constraints");
    c.resolveSupertypeConstraints();
    //c.printConstraints();

    //System.err.println("Resolving unresolved type arguments");
    //c.resolveBounds();
    //c.printConstraints();

    if(c.unresolvedTypeArguments()) {
      TypeDecl S = assignConvertedType();
      if(S.isUnboxedPrimitive())
        S = S.boxed();
      TypeDecl R = decl.type();
      // TODO: replace all uses of type variables in R with their inferred types
      TypeDecl Rprime = R;
      if(R.isVoid())
        R = typeObject();
      c.convertibleFrom(S, R);
      // TODO: additional constraints

      c.resolveEqualityConstraints();
      c.resolveSupertypeConstraints();
      //c.resolveBounds();

      c.resolveSubtypeConstraints();
    }

    return c.typeArguments();
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:23
   */
  protected SimpleSet potentiallyApplicable(Collection candidates) {
    SimpleSet potentiallyApplicable = SimpleSet.emptySet;
    // select potentially applicable methods
    for(Iterator iter = candidates.iterator(); iter.hasNext(); ) {
      MethodDecl decl = (MethodDecl)iter.next();
      if(potentiallyApplicable(decl) && accessible(decl)) {
        if(decl instanceof GenericMethodDecl) {
          decl = ((GenericMethodDecl)decl).lookupParMethodDecl(typeArguments(decl));
        }
        potentiallyApplicable = potentiallyApplicable.add(decl);
      }
    }
    return potentiallyApplicable;
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:38
   */
  protected SimpleSet applicableBySubtyping(SimpleSet potentiallyApplicable) {
    SimpleSet maxSpecific = SimpleSet.emptySet;
    for(Iterator iter = potentiallyApplicable.iterator(); iter.hasNext(); ) {
      MethodDecl decl = (MethodDecl)iter.next();
      if(applicableBySubtyping(decl))
        maxSpecific = mostSpecific(maxSpecific, decl);
    }
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:48
   */
  protected SimpleSet applicableByMethodInvocationConversion(SimpleSet potentiallyApplicable, SimpleSet maxSpecific) {
    if(maxSpecific.isEmpty()) {
      for(Iterator iter = potentiallyApplicable.iterator(); iter.hasNext(); ) {
        MethodDecl decl = (MethodDecl)iter.next();
        if(applicableByMethodInvocationConversion(decl))
          maxSpecific = mostSpecific(maxSpecific, decl);
      }
    }
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:59
   */
  protected SimpleSet applicableVariableArity(SimpleSet potentiallyApplicable, SimpleSet maxSpecific) {
    if(maxSpecific.isEmpty()) {
      for(Iterator iter = potentiallyApplicable.iterator(); iter.hasNext(); ) {
        MethodDecl decl = (MethodDecl)iter.next();
        if(decl.isVariableArity() && applicableVariableArity(decl))
          maxSpecific = mostSpecific(maxSpecific, decl);
      }
    }
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:140
   */
  private static SimpleSet mostSpecific(SimpleSet maxSpecific, MethodDecl decl) {
    if(maxSpecific.isEmpty())
      maxSpecific = maxSpecific.add(decl);
    else {
      if(decl.moreSpecificThan((MethodDecl)maxSpecific.iterator().next()))
        maxSpecific = SimpleSet.emptySet.add(decl);
      else if(!((MethodDecl)maxSpecific.iterator().next()).moreSpecificThan(decl))
        maxSpecific = maxSpecific.add(decl);
    }
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:51
   */
  protected void collectAccessibilityConstraints(Collection<AccessibilityConstraint> res) {
		// (Acc-1)
		res.add(new AccessibilityConstraint(this, decl().minAccess(this), decl()));
		// (Acc-1) variant: when calling a method, the receiver type has to be accessible
		if(isQualified()) {
			res.add(new AccessibilityConstraint(this, qualifier().type().minAccess(this), qualifier().type()));
			// (Acc-2), see JLS 6.6.2.1
			if(!decl().isStatic() && !qualifier().isSuperAccess()) {
				TypeDecl C = decl().hostType();
				TypeDecl S = hostType().withinBodyThatSubclasses(C);
				if(decl().minAccess(hostPackage(), hostType()) == ASTNode.VIS_PROTECTED &&
				   S != null && !qualifier().type().instanceOf(S))
					res.add(new AccessibilityConstraint(this, decl(), Operator.EQ, AccessModifierConstant.PUBLIC));
			}
			// (Inh-1)
			res.add(new AccessibilityConstraint(this, decl().minAccess(qualifier().hostPackage(), qualifier().hostType()),
                    							Operator.LE, decl()));
		}
	}
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:29
   */
  public void lockDataFlow() {
		lockReachingDefs();
		super.lockDataFlow();
	}
  /**
   * @ast method 
   * @aspect InlineMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethod.jrag:3
   */
  public void inline() {
		ASTNode n = inlineToAnonymousMethod().introduceOutParameter().open().inline();
		if(n instanceof Block)
			((Block)n).inline();
	}
  /**
   * @ast method 
   * @aspect InlineMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethod.jrag:20
   */
  public void doInline() {
    	BodyDecl root = hostBodyDecl();
    	
    	if (ConditionsMoveMethod.cond1)
    		inline();
		
    	root.eliminate(WITH_STMT, FRESH_VARIABLES, LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:3
   */
  public AnonymousMethod inlineToAnonymousMethod() {
		expatiateQualifiers();
		MethodDecl target = getUniqueTarget();
		if(target == null)
			throw new RefactoringException("cannot inline ambiguous method call");
		if(!target.hasBlock() || !target.fromSource())
			throw new RefactoringException("cannot inline call to method without body");
		MethodDecl target_cp = (MethodDecl) target.fullCopyAndDetach();
		target.unfoldSynchronized();
		target.expatiateQualifiers();
		target.lockAllNames();
		AnonymousMethod anon;
		bundleQualifier();
		if(isRightChildOfDot()) {
			Expr qual = qualifier();
			if(qual.isSuperAccess()) {
				TypeDecl sup = qual.type();
				// construct typeUpdate map
				Map<Expr, TypeDecl> typeUpdate = new HashMap<Expr, TypeDecl>();
				for(ThisAccess acc : target.collectThisAccesses()) {
					if(acc.isQualified()) {
						if(acc.type() == sup)
							acc.unqualify();
						else
							throw new RefactoringException("cannot preserve enclosing instances");
					}
					typeUpdate.put(acc, hostType());
				}
				Program.adjustVirtualCalls(typeUpdate);
				anon = target.asAnonymousMethod();
			} else if(decl().hostType() != this.hostType()) {
				qual.lockAllNames();
				anon = target.asAnonymousMethod();
				anon.setBlock(new Block(new List<Stmt>().add(new WithStmt((Access)qual, anon.getBlock()))));
			} else {
				anon = target.asAnonymousMethod();
			}
			parentDot().replaceWith(anon);
		} else {
			anon = target.asAnonymousMethod();
			replaceWith(anon);
		}
		target.replaceWith(target_cp);
		anon.setArgList(getArgList());
		anon.removeSyntheticThis();
		target_cp.hostType().flushCaches();
		return anon;
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:69
   */
  public void expatiateQualifiers() {
		if(!isQualified()) {
			MethodAccessInfo acc = accessMethod(decl());
			assert(acc != null);
			Expr qual = acc.getBend().createLockedAccess().qualifiesAccess(new ThisAccess(true));
			replace(this).with(qual.qualifiesAccess(this));
			flushCaches();
		}
		super.expatiateQualifiers();
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:165
   */
  public void collectAllDecls(Collection<Declaration> res) {
		res.add(decl());
		super.collectAllDecls(res);
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:188
   */
  public void eliminateWith(List<Access> qualifiers, TypeDecl hostType) {
		if(isQualified()) {
			super.eliminateWith(qualifiers, hostType);
		} else {
			for(int i=qualifiers.getNumChild()-1;i>=0;i--) {
				Access qual = qualifiers.getChild(i);
				Collection<MethodDecl> meths = qual.type().memberMethods(name());
				if(meths.contains(decl())) {
					lock();
					qualifyWith((Expr)qual.fullCopyAndDetach());
					flushCaches();
					super.eliminateWith(qualifiers, hostType);
					return;
				}
			}
			throw new RefactoringException("cannot eliminate with");
		}
	}
  /**
   * @ast method 
   * @aspect MonitorAction
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/MonitorAction.jrag:55
   */
  protected void collectMonitorActions(Collection<MonitorAction> res) {
		if(waitNotifyMethods().contains(decl()))
			res.add(new WaitNotifyMethodCall(this));
		super.collectMonitorActions(res);
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:6
   */
  
	/* A locked method access is a method access that does not obey the normal method lookup
	 * rules, but instead immediately binds to its target. For every locked method access,
	 * we also cache whether or not it is a monomorphic call. */
	private SavedMethodDecl targetMethod = null;
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:7
   */
  
	private boolean isMonoCall = false;
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:8
   */
  private SavedMethodDecl refined_LockedMethodAccess_MethodAccess_setTargetMethod(SavedMethodDecl smd, boolean isMonoCall) { 
		this.targetMethod = smd;
		this.isMonoCall = isMonoCall;
		return smd;
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:14
   */
  public MethodAccess(MethodDecl target, List<Expr> args, boolean isMonoCall) {
		this(target.name(), args);
		setTargetMethod(target.save(), isMonoCall);
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:101
   */
  public ASTNode lockMethodNames(Collection<String> endangered) {
		if(endangered.contains(name()))
			lock();
		return super.lockMethodNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:107
   */
  public ASTNode lock() {
		return targetMethod == null ? lock(decl()) : this;
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:111
   */
  public ASTNode lock(MethodDecl md) {
		assert md != null && !md.isUnknown();
		setTargetMethod(md.save(), isMonoCall());
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:117
   */
  public boolean isLocked() { return targetMethod != null; }
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:121
   */
  public void eliminateLockedNames() {
		if(targetMethod != null)
			unlock();
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:127
   */
  public Access unlock() {
		Expr qual = getQualifier();
		MethodDecl target = targetMethod.getDecl();
		boolean isMonoCall = this.isMonoCall;
		setTargetMethod(null, false);
		flushCache();
		if(fromSource())
			setID(target.name());
		if(decl().equals(target)) {
			return this;
		} else if(!fromSource()) {
			throw new RefactoringException("cannot adjust method access in compiled code");
		} else {
			return unlock(qual, target, isMonoCall);
		}
	}
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:144
   */
  public Access unlock(Expr qual, MethodDecl target, boolean isMonoCall) {
		if((qual == null ? inStaticContext() : qual.staticContextQualifier()) && !target.isStatic())
			throw new RefactoringException("cannot access instance method in static context");
		MethodAccessInfo acc = accessMethod(target);
		if(acc == null) {
			if((qual == null || qual.isPure()) && target.isStatic()) {
				TypeDecl host = target.hostType();
				// since the target is static, we can access it through the raw type
				if(host.isGenericType())
					host = ((GenericTypeDecl)host).rawType();
				if(host.accessibleFrom(hostType()) && target.accessibleFrom(hostType()))
					if (qual == null || (qual!=null && qual.type() != host)) {
						this.flushCaches();
						Access hostAccess = host.createLockedAccess();
						affectedByUnlock(hostAccess, this);
						return (Access) replace(qual!=null ? parentDot() : this).with(hostAccess.qualifiesAccess(this));
					} else
						return qual!=null ? parentDot() : this;
			} else if(qual != null && (qual.isThisAccess() || qual.isSuperAccess())) {
				// throw away the qualifier and try again
				AbstractDot parent = parentDot();
				acc = parent.accessMethod(target);
				if(acc != null) {
					this.flushCaches();
					Access newAcc = acc.eliminate(this, null, enclosingType(), isMonoCall, inStaticContext(), (List<Expr>) getArgs().fullCopyAndDetach());
					return (Access) replace(parent).with(newAcc);
				}
			}
			ConditionsManagement.cond1.disable();
			if (ConditionsManagement.cond1.isEnabled())
//			  if (false)
				throw new RefactoringException("cannot access method "+target.name());
		}
		this.flushCaches();
		ConditionsManagement.cond1.disable();
		if (ConditionsMoveMethod.cond2  && ConditionsPullUpMethod.cond4 && ConditionsRenameMethod.cond1 && ConditionsAddParameter.cond2) {
		  Access res = acc.eliminate(this, qual, enclosingType(), isMonoCall, inStaticContext(), 
					(List<Expr>) getArgs().fullCopyAndDetach());
		  if(res == null)
			  throw new RefactoringException("cannot access method "+target.name());
		  return res;
		} else {
		  return null;
		}
//		if (ConditionsMoveMethod.cond2  && ConditionsPullUpMethod.cond4 && ConditionsRenameMethod.cond1 && ConditionsAddParameter.cond2)
	}
  /**
   * @ast method 
   * @aspect AddRequiredMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/AddRequiredMembers.jrag:24
   */
  public void addRequiredMembers(TypeDecl host, java.util.Set<MethodDecl> meths, java.util.Set<FieldDeclaration> fds, java.util.Set<MemberTypeDecl> mtds) {
		if(/*!decl().isStatic() &&*/ decl().hostType() == host)
			meths.add(decl().sourceMethodDecl());
		super.addRequiredMembers(host, meths, fds, mtds);
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:155
   */
  public MethodAccess lockedCopy() {
		MethodAccess res = (MethodAccess)super.lockedCopy();
		res.lock(decl());
		return res;
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:161
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		// conservatively approximate special typing rules for getClass()
		if(name().equals("getClass"))
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "getClass()", this, Operator.EQ, type()));
		else
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "method invocation", this, Operator.EQ, decl().getTypeAccess()));
		collectArgumentTypeConstraints(pred, constraints);
		if(isQualified())
			if(qualifier().type().isSubtypeConstrainable())
				addConstraint(constraints, pred, new DisjunctiveTypeConstraint(this, "method invocation", qualifier(), Operator.LE, decl().rootDefs()));
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:190
   */
  public void collectArgumentTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		Callable c = decl();
		for(int i=0;i<c.getNumParameter();++i) {
			ParameterDeclaration parm = c.getParameter(i);
			if(parm.isVariableArity() && !invokesVariableArityAsArray()) {
				while(i < getNumArg())
					collectArgPassingConstraints(pred, constraints, c, parm, getArg(i++));
			} else {
				collectArgPassingConstraints(pred, constraints, c, parm, getArg(i));
			}
		}
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:203
   */
  public void collectArgPassingConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints, 
												   Callable c, ParameterDeclaration parm, Expr arg) {
		if(!parm.isVariableArity() && parm.type().isSubtypeConstrainable() && arg.type().isSubtypeConstrainable()) {
			addConstraint(constraints, pred, new SimpleTypeConstraint(arg, "argument passing to callable " + c.fullName(), arg, Operator.LE, parm.getTypeAccess()));						
		} else {
			// require both argument and parameter to keep its type 
			addConstraint(constraints, pred, new SimpleTypeConstraint(arg, "argument passing to callable " + c.fullName(), arg, Operator.EQ, arg.type()));
			addConstraint(constraints, pred, new SimpleTypeConstraint(arg, "argument passing to callable " + c.fullName(), parm.getTypeAccess(), Operator.EQ, parm.getTypeAccess().type()));
		}
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
  public MethodAccess() {
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
  public MethodAccess(String p0, List<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
  }
  /**
   * @ast method 
   * 
   */
  public MethodAccess(beaver.Symbol p0, List<Expr> p1) {
    setID(p0);
    setChild(p1, 0);
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__MethodAccess_setID(String value) {
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
   * Replaces the Arg list.
   * @param list The new list node to be used as the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setArgList(List<Expr> list) {
    setChild(list, 0);
  }
  /**
   * Retrieves the number of children in the Arg list.
   * @return Number of children in the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumArg() {
    return getArgList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Arg list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Arg list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumArgNoTransform() {
    return getArgListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Arg list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr getArg(int i) {
    return (Expr)getArgList().getChild(i);
  }
  /**
   * Append an element to the Arg list.
   * @param node The element to append to the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addArg(Expr node) {
    List<Expr> list = (parent == null || state == null) ? getArgListNoTransform() : getArgList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addArgNoTransform(Expr node) {
    List<Expr> list = getArgListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Arg list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setArg(Expr node, int i) {
    List<Expr> list = getArgList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Arg list.
   * @return The node representing the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Expr> getArgs() {
    return getArgList();
  }
  /**
   * Retrieves the Arg list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Arg list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Expr> getArgsNoTransform() {
    return getArgListNoTransform();
  }
  /**
   * Retrieves the Arg list.
   * @return The node representing the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Expr> getArgList() {
    List<Expr> list = (List<Expr>)getChild(0);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Arg list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Arg list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Expr> getArgListNoTransform() {
    return (List<Expr>)getChildNoTransform(0);
  }
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:11
   */
    protected SimpleSet maxSpecific(Collection candidates) {
    SimpleSet potentiallyApplicable = potentiallyApplicable(candidates);
    // first phase
    SimpleSet maxSpecific = applicableBySubtyping(potentiallyApplicable);
    // second phase
    maxSpecific = applicableByMethodInvocationConversion(potentiallyApplicable,
        maxSpecific);
    // third phase
    maxSpecific = applicableVariableArity(potentiallyApplicable, maxSpecific);
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:90
   */
    public void toString(StringBuffer s) {
		if(targetMethod == null) {
			refined_PrettyPrint_MethodAccess_toString(s);
		} else {
			s.append("[[");
			refined_PrettyPrint_MethodAccess_toString(s);
			s.append("]]");
		}
	}
  /**
   * @ast method 
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:331
   */
    public void typeCheck() {
    if(isQualified() && decl().isAbstract() && qualifier().isSuperAccess())
      error("may not access abstract methods in superclass");
    if(!decl().isVariableArity() || invokesVariableArityAsArray()) {
      for(int i = 0; i < decl().getNumParameter(); i++) {
        TypeDecl exprType = getArg(i).type();
        TypeDecl parmType = decl().getParameter(i).type();
        if(!exprType.methodInvocationConversionTo(parmType) && !exprType.isUnknown() && !parmType.isUnknown()) {
          error("#The type " + exprType.typeName() + " of expr " +
            getArg(i) + " is not compatible with the method parameter " +
            decl().getParameter(i));
        }
      }
    }
  }
  /**
   * @ast method 
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:337
   */
    protected void collect__MethodDecl_Uses(MethodDecl decl, String name, Collection<MethodAccess> col) {
		super.collect__MethodDecl_Uses(decl, name, col);
		if ((targetMethod != null && targetMethod.getDecl() == decl) || 
				(name.equals(name()) && decl() == decl))
			col.add(this);
	}
  /**
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:81
   */
    private SavedMethodDecl setTargetMethod(final SavedMethodDecl smd, final boolean isMonoCall) {
		final SavedMethodDecl saved = targetMethod;
		final boolean saved_isMonoCall = this.isMonoCall;
		SavedMethodDecl res = refined_LockedMethodAccess_MethodAccess_setTargetMethod(smd, isMonoCall);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				
				@Override
				public void undo() {
					targetMethod = saved;
					MethodAccess.this.isMonoCall = saved_isMonoCall;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedMethodAccess_MethodAccess_setTargetMethod(smd, isMonoCall);
				}
				
				@Override
				public String toString() {
					return "MethodAccess.setTargetMethod";
				}
			});
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:47
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__MethodAccess_setID(oldValue);
				}
				@Override
				public String toString() {
					return "MethodAccess.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__MethodAccess_setID(value);
				}
			});
		}
		refined__MethodAccess_setID(value);
	}
  /**
   * @ast method 
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:96
   */
  private SimpleSet refined_LookupMethod_MethodAccess_decls()
{
    SimpleSet maxSpecific = maxSpecific(lookupMethod(name()));
    if(isQualified() ? qualifier().staticContextQualifier() : inStaticContext())
      maxSpecific = removeInstanceMethods(maxSpecific);
    return maxSpecific;
  }
  /**
   * @ast method 
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:284
   */
  private TypeDecl refined_TypeAnalysis_MethodAccess_type()
{ return decl().type(); }
  protected java.util.Map computeDAbefore_int_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:410
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean computeDAbefore(int i, Variable v) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(Integer.valueOf(i));
    _parameters.add(v);
    if(computeDAbefore_int_Variable_values == null) computeDAbefore_int_Variable_values = new java.util.HashMap(4);
    if(computeDAbefore_int_Variable_values.containsKey(_parameters)) {
      return ((Boolean)computeDAbefore_int_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean computeDAbefore_int_Variable_value = computeDAbefore_compute(i, v);
      if(isFinal && num == state().boundariesCrossed) computeDAbefore_int_Variable_values.put(_parameters, Boolean.valueOf(computeDAbefore_int_Variable_value));
    return computeDAbefore_int_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean computeDAbefore_compute(int i, Variable v) {  return i == 0 ? isDAbefore(v) : getArg(i-1).isDAafter(v);  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:235
   */
  public boolean isDAafter(Variable v) {
    ASTNode$State state = state();
    try {  return getNumArg() == 0 ? isDAbefore(v) : getArg(getNumArg()-1).isDAafter(v);  }
    finally {
    }
  }
  /*eq Stmt.isDAafter(Variable v) {
    //System.out.println("### isDAafter reached in " + getClass().getName());
    //throw new NullPointerException();
    throw new Error("Can not compute isDAafter for " + getClass().getName() + " at " + errorPrefix());
  }* @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:332
   */
  public boolean isDAafterTrue(Variable v) {
    ASTNode$State state = state();
    try {  return (getNumArg() == 0 ? isDAbefore(v) : getArg(getNumArg()-1).isDAafter(v)) || isFalse();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:333
   */
  public boolean isDAafterFalse(Variable v) {
    ASTNode$State state = state();
    try {  return (getNumArg() == 0 ? isDAbefore(v) : getArg(getNumArg()-1).isDAafter(v)) || isTrue();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean exceptionCollection_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection exceptionCollection_value;
  /**
   * @attribute syn
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:65
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection exceptionCollection() {
    if(exceptionCollection_computed) {
      return exceptionCollection_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    exceptionCollection_value = exceptionCollection_compute();
      if(isFinal && num == state().boundariesCrossed) exceptionCollection_computed = true;
    return exceptionCollection_value;
  }
  /**
   * @apilevel internal
   */
  private Collection exceptionCollection_compute() {
    //System.out.println("Computing exceptionCollection for " + name());
    HashSet set = new HashSet();
    Iterator iter = decls().iterator();
    if(!iter.hasNext())
      return set;

    MethodDecl m = (MethodDecl)iter.next();
    //System.out.println("Processing first found method " + m.signature() + " in " + m.hostType().fullName());

    for(int i = 0; i < m.getNumException(); i++) {
      TypeDecl exceptionType = m.getException(i).type();
      set.add(exceptionType);
    }
    while(iter.hasNext()) {
      HashSet first = new HashSet();
      first.addAll(set);
      HashSet second = new HashSet();
      m = (MethodDecl)iter.next();
      //System.out.println("Processing the next method " + m.signature() + " in " + m.hostType().fullName());
      for(int i = 0; i < m.getNumException(); i++) {
        TypeDecl exceptionType = m.getException(i).type();
        second.add(exceptionType);
      }
      set = new HashSet();
      for(Iterator i1 = first.iterator(); i1.hasNext(); ) {
        TypeDecl firstType = (TypeDecl)i1.next(); 
        for(Iterator i2 = second.iterator(); i2.hasNext(); ) {
          TypeDecl secondType = (TypeDecl)i2.next();
          if(firstType.instanceOf(secondType)) {
            set.add(firstType);
          }
          else if(secondType.instanceOf(firstType)) {
            set.add(secondType);
          }
        }
      }
    }
    return set;
  }
  /**
   * @attribute syn
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:66
   */
  public MethodDecl singleCandidateDecl() {
    ASTNode$State state = state();
    try {
    MethodDecl result = null;
    for(Iterator iter = lookupMethod(name()).iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(result == null)
        result = m;
      else if(m.getNumParameter() == getNumArg() && result.getNumParameter() != getNumArg())
        result = m;
    }
    return result;
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
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:88
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
  private SimpleSet decls_compute() {  return targetMethod == null ? refined_LookupMethod_MethodAccess_decls() : targetMethod.getDecl();  }
  /**
   * @apilevel internal
   */
  protected boolean decl_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl decl_value;
  /**
   * @attribute syn
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:103
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl decl() {
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
  private MethodDecl decl_compute() {
    SimpleSet decls = decls();
    if(decls.size() == 1)
      return (MethodDecl)decls.iterator().next();

    // 8.4.6.4 - only return the first method in case of multply inherited abstract methods
    boolean allAbstract = true;
    for(Iterator iter = decls.iterator(); iter.hasNext() && allAbstract; ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(!m.isAbstract() && !m.hostType().isObject())
        allAbstract = false;
    }
    if(decls.size() > 1 && allAbstract)
      return (MethodDecl)decls.iterator().next();
    return unknownMethod();
  }
  /**
   * @attribute syn
   * @aspect MethodDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:170
   */
  public boolean accessible(MethodDecl m) {
    ASTNode$State state = state();
    try {
    if(!isQualified())
      return true;
    if(!m.accessibleFrom(hostType()))
      return false;
    // the method is not accessible if the type is not accessible
    if(!qualifier().type().accessibleFrom(hostType()))
      return false;
    // 6.6.2.1 -  include qualifier type for protected access
    if(m.isProtected() && !m.hostPackage().equals(hostPackage())
        && !m.isStatic() && !qualifier().isSuperAccess()) {
      return hostType().mayAccess(this, m);
    }
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:65
   */
  public boolean validArgs() {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < getNumArg(); i++)
      if(getArg(i).type().isUnknown())
        return false;
    return true;
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
    try {  return getClass().getName() + " [" + getID() + "]";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:18
   */
  public String name() {
    ASTNode$State state = state();
    try {  return getID();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:17
   */
  public boolean isMethodAccess() {
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
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:32
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
  private TypeDecl type_compute() {
    if(getNumArg() == 0 && name().equals("getClass") && decl().hostType().isObject()) {
      TypeDecl bound = isQualified() ? qualifier().type() : hostType();
      ArrayList args = new ArrayList();
      args.add(bound.erasure().asWildcardExtends());
      return ((GenericClassDecl)lookupType("java.lang", "Class")).lookupParTypeDecl(args);
    }
    else
      return refined_TypeAnalysis_MethodAccess_type();
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:181
   */
  public boolean applicableBySubtyping(MethodDecl m) {
    ASTNode$State state = state();
    try {
    if(m.getNumParameter() != getNumArg())
      return false;
    for(int i = 0; i < m.getNumParameter(); i++)
      if(!getArg(i).type().instanceOf(m.getParameter(i).type()))
        return false;
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:201
   */
  public boolean applicableByMethodInvocationConversion(MethodDecl m) {
    ASTNode$State state = state();
    try {
    if(m.getNumParameter() != getNumArg())
      return false;
    for(int i = 0; i < m.getNumParameter(); i++)
      if(!getArg(i).type().methodInvocationConversionTo(m.getParameter(i).type()))
        return false;
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:221
   */
  public boolean applicableVariableArity(MethodDecl m) {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < m.getNumParameter() - 1; i++)
      if(!getArg(i).type().methodInvocationConversionTo(m.getParameter(i).type()))
        return false;
    for(int i = m.getNumParameter() - 1; i < getNumArg(); i++)
      if(!getArg(i).type().methodInvocationConversionTo(m.lastParameter().type().componentType()))
        return false;
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:262
   */
  public boolean potentiallyApplicable(MethodDecl m) {
    ASTNode$State state = state();
    try {
    if(!m.name().equals(name()))
      return false;
    if(!m.accessibleFrom(hostType()))
      return false;
    if(m.isVariableArity() && !(arity() >= m.arity()-1))
      return false;
    if(!m.isVariableArity() && !(m.arity() == arity()))
      return false;
    if(m instanceof GenericMethodDecl) {
      GenericMethodDecl gm = (GenericMethodDecl)m;
      ArrayList list = typeArguments(m);
      if(list.size() != 0) {
        if(gm.getNumTypeParameter() != list.size())
          return false;
        for(int i = 0; i < gm.getNumTypeParameter(); i++)
          if(!((TypeDecl)list.get(i)).subtype(gm.original().getTypeParameter(i)))
            return false;
      }
    }
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:285
   */
  public int arity() {
    ASTNode$State state = state();
    try {  return getNumArg();  }
    finally {
    }
  }
  protected java.util.Map typeArguments_MethodDecl_values;
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:287
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ArrayList typeArguments(MethodDecl m) {
    Object _parameters = m;
    if(typeArguments_MethodDecl_values == null) typeArguments_MethodDecl_values = new java.util.HashMap(4);
    if(typeArguments_MethodDecl_values.containsKey(_parameters)) {
      return (ArrayList)typeArguments_MethodDecl_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    ArrayList typeArguments_MethodDecl_value = typeArguments_compute(m);
      if(isFinal && num == state().boundariesCrossed) typeArguments_MethodDecl_values.put(_parameters, typeArguments_MethodDecl_value);
    return typeArguments_MethodDecl_value;
  }
  /**
   * @apilevel internal
   */
  private ArrayList typeArguments_compute(MethodDecl m) {
    ArrayList typeArguments = new ArrayList();
    if(m instanceof GenericMethodDecl) {
      GenericMethodDecl g = (GenericMethodDecl)m;
      Collection arguments = computeConstraints(g);
      if(arguments.isEmpty())
        return typeArguments;
      int i = 0;
      for(Iterator iter = arguments.iterator(); iter.hasNext(); i++) {
        TypeDecl typeDecl = (TypeDecl)iter.next();
        if(typeDecl == null) {
          TypeVariable v = g.original().getTypeParameter(i);
          if(v.getNumTypeBound() == 0)
            typeDecl = typeObject();
          else if(v.getNumTypeBound() == 1)
            typeDecl = v.getTypeBound(0).type();
          else
            typeDecl = v.lubType();
        }
        typeArguments.add(typeDecl);
      }
    }
    return typeArguments;
  }
  /**
   * @attribute syn
   * @aspect VariableArityParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:40
   */
  public boolean invokesVariableArityAsArray() {
    ASTNode$State state = state();
    try {
    if(!decl().isVariableArity())
      return false;
    if(arity() != decl().arity())
      return false;
    return getArg(getNumArg()-1).type().methodInvocationConversionTo(decl().lastParameter().type());
  }
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
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:56
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
  private Location getLocation_compute() {  return decl().isPure() ? null : AnyHeapLocation.instance;  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return getNumArg() == 0 ? this : getArg(0).first();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:250
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
  private SmallSet<CFGNode> exceptionalSucc_compute() {
		SmallSet<CFGNode> res = uncheckedExnTarget();
		for(Access exn : decl().getExceptions())
			res = res.union(throwTarget(exn.type()));
		return res;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Exceptions.jrag:32
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
    SmallSet<TypeDecl> uncaughtExns = super.uncaughtExceptions();
    for(Access acc : decl().getExceptions())
      uncaughtExns = uncaughtExns.union(acc.type());
    return uncaughtExns;
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:2
   */
  public boolean isDef() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:90
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return l.mayAlias(getLocation());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:92
   */
  public boolean isReachedUseFor(Location l) {
    ASTNode$State state = state();
    try {  return l.mayAlias(getLocation());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:2
   */
  public boolean isStatementExpression() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:45
   */
  public boolean isFlowInvariant() {
    ASTNode$State state = state();
    try {  return decl().isPure() || super.isFlowInvariant();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodAccessExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodAccessExt.jrag:2
   */
  public boolean isSuperCall() {
    ASTNode$State state = state();
    try {  return this.isQualified() && this.qualifier().isSuperAccess();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodAccessExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodAccessExt.jrag:3
   */
  public boolean isMonoCall() {
    ASTNode$State state = state();
    try {  return decl().isStatic() || decl().isPrivate() || isSuperCall();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodAccessExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodAccessExt.jrag:4
   */
  public boolean isPolyCall() {
    ASTNode$State state = state();
    try {  return !isMonoCall();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean possibleTargets_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<MethodDecl> possibleTargets_value;
  /**
   * @attribute syn
   * @aspect MethodAccessExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodAccessExt.jrag:6
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> possibleTargets() {
    if(possibleTargets_computed) {
      return possibleTargets_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    possibleTargets_value = possibleTargets_compute();
      if(isFinal && num == state().boundariesCrossed) possibleTargets_computed = true;
    return possibleTargets_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> possibleTargets_compute() {
		HashSet<MethodDecl> res = new HashSet<MethodDecl>();
		res.add(decl());
		if(isMonoCall())
			return res;
		int sz;
		do {
			sz = res.size();
			HashSet<MethodDecl> next_layer = new HashSet<MethodDecl>();
			for(MethodDecl md : res)
				next_layer.addAll(md.overridingMethods());
			res.addAll(next_layer);
		} while(res.size() != sz);
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean getUniqueTarget_computed = false;
  /**
   * @apilevel internal
   */
  protected MethodDecl getUniqueTarget_value;
  /**
   * @attribute syn
   * @aspect MethodAccessExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodAccessExt.jrag:22
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl getUniqueTarget() {
    if(getUniqueTarget_computed) {
      return getUniqueTarget_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getUniqueTarget_value = getUniqueTarget_compute();
      if(isFinal && num == state().boundariesCrossed) getUniqueTarget_computed = true;
    return getUniqueTarget_value;
  }
  /**
   * @apilevel internal
   */
  private MethodDecl getUniqueTarget_compute() {
		MethodDecl md = decl();
		if(isPolyCall() && !md.overridingMethods().isEmpty())
			return null;
		return decl();
	}
  /**
   * @attribute syn
   * @aspect Purity
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Purity.jrag:2
   */
  public boolean isPure() {
    ASTNode$State state = state();
    try {  return decl().isPure();  }
    finally {
    }
  }
  protected java.util.Map shouldMakeConversionExplicit_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect MakeConversionExplicit
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/MakeConversionExplicit.jrag:17
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean shouldMakeConversionExplicit(TypeDecl destType) {
    Object _parameters = destType;
    if(shouldMakeConversionExplicit_TypeDecl_values == null) shouldMakeConversionExplicit_TypeDecl_values = new java.util.HashMap(4);
    if(shouldMakeConversionExplicit_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)shouldMakeConversionExplicit_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean shouldMakeConversionExplicit_TypeDecl_value = shouldMakeConversionExplicit_compute(destType);
      if(isFinal && num == state().boundariesCrossed) shouldMakeConversionExplicit_TypeDecl_values.put(_parameters, Boolean.valueOf(shouldMakeConversionExplicit_TypeDecl_value));
    return shouldMakeConversionExplicit_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean shouldMakeConversionExplicit_compute(TypeDecl destType) {
		// we need to handle the case where the result type of a method is inferred from a surrounding assignment conversion
		if(!(this instanceof ParMethodAccess) && decl() instanceof ParMethodDecl) {
			ParMethodDecl pmd = (ParMethodDecl)decl();
			// TODO: this will insert spurious conversions in cases where the result type can be inferred from the arguments
			return pmd.genericMethodDecl().type().isTypeVariable();
		}
		return super.shouldMakeConversionExplicit(destType);
	}
  protected java.util.Map thisEscapes_Expr_values;
  /**
   * @attribute syn
   * @aspect FieldAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:64
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean thisEscapes(Expr qual) {
    Object _parameters = qual;
    if(thisEscapes_Expr_values == null) thisEscapes_Expr_values = new java.util.HashMap(4);
    if(thisEscapes_Expr_values.containsKey(_parameters)) {
      return ((Boolean)thisEscapes_Expr_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean thisEscapes_Expr_value = thisEscapes_compute(qual);
      if(isFinal && num == state().boundariesCrossed) thisEscapes_Expr_values.put(_parameters, Boolean.valueOf(thisEscapes_Expr_value));
    return thisEscapes_Expr_value;
  }
  /**
   * @apilevel internal
   */
  private boolean thisEscapes_compute(Expr qual) {
		Collection<TypeDecl> possibleTypes = qual.possibleTypes();
		if(possibleTypes == null) {
			for(MethodDecl md : possibleTargets())
				if(md.sourceMethodDecl().thisEscapes())
					return true;			
		} else {
			for(TypeDecl td : possibleTypes) {
				Collection mds = td.memberMethods(name());
				SimpleSet maxSpecific = maxSpecific(mds);
				if(qual.staticContextQualifier())
					maxSpecific = removeInstanceMethods(maxSpecific);
				for(Iterator<MethodDecl> iter=maxSpecific.iterator();iter.hasNext();)
					if(iter.next().sourceMethodDecl().thisEscapes())
						return true;
			}
		}
		return false;
	}
  /**
   * @attribute syn
   * @aspect SynchronizationDependencies
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Concurrency/SynchronizationDependencies.jrag:13
   */
  public boolean isAcquire() {
    ASTNode$State state = state();
    try {  return true;  }
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
    try {  return true;  }
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
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:43
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean handlesException(TypeDecl exceptionType) {
    ASTNode$State state = state();
    boolean handlesException_TypeDecl_value = getParent().Define_boolean_handlesException(this, null, exceptionType);
    return handlesException_TypeDecl_value;
  }
  /**
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl unknownMethod() {
    ASTNode$State state = state();
    MethodDecl unknownMethod_value = getParent().Define_MethodDecl_unknownMethod(this, null);
    return unknownMethod_value;
  }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:123
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inExplicitConstructorInvocation() {
    ASTNode$State state = state();
    boolean inExplicitConstructorInvocation_value = getParent().Define_boolean_inExplicitConstructorInvocation(this, null);
    return inExplicitConstructorInvocation_value;
  }
  /**
   * @attribute inh
   * @aspect GenericMethodsInference
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:43
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeObject() {
    ASTNode$State state = state();
    TypeDecl typeObject_value = getParent().Define_TypeDecl_typeObject(this, null);
    return typeObject_value;
  }
  /**
   * @attribute inh
   * @aspect LockedMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedMethodAccess.jrag:120
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl enclosingType() {
    ASTNode$State state = state();
    TypeDecl enclosingType_value = getParent().Define_TypeDecl_enclosingType(this, null);
    return enclosingType_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:409
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getArgListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return computeDAbefore(i, v);
  }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:28
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().lookupMethod(name);
  }
    else {      return getParent().Define_Collection_lookupMethod(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:87
   * @apilevel internal
   */
  public boolean Define_boolean_hasPackage(ASTNode caller, ASTNode child, String packageName) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().hasPackage(packageName);
  }
    else {      return getParent().Define_boolean_hasPackage(this, caller, packageName);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:253
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().lookupType(name);
  }
    else {      return getParent().Define_SimpleSet_lookupType(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:132
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().lookupVariable(name);
  }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:120
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.EXPRESSION_NAME;
  }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:17
   * @apilevel internal
   */
  public String Define_String_methodHost(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return unqualifiedScope().methodHost();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethodsInference.jrag:41
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_assignConvertedType(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return typeObject();
  }
    else {      return getParent().Define_TypeDecl_assignConvertedType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:246
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return SmallSet.<CFGNode>singleton(i + 1 < getNumArg() ? getArg(i + 1).first() : this);
  }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:376
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenTrue(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return getArg(i).following();
  }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenTrue(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:377
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__followingWhenFalse(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return getArg(i).following();
  }
    else {      return getParent().Define_SmallSet_CFGNode__followingWhenFalse(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:36
   * @apilevel internal
   */
  public boolean Define_boolean_inInextractiblePosition(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_inInextractiblePosition(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:62
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return Integer.MAX_VALUE;
  }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:49
   * @apilevel internal
   */
  public boolean Define_boolean_escapes(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return true;
  }
    else {      return getParent().Define_boolean_escapes(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:81
   * @apilevel internal
   */
  public MethodAccessInfo Define_MethodAccessInfo_accessMethod(ASTNode caller, ASTNode child, MethodDecl md) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().accessMethod(md);
  }
    else {      return getParent().Define_MethodAccessInfo_accessMethod(this, caller, md);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:249
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().accessVariable(decl);
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
  protected void collect_contributors_GenericMethodDecl_parUses() {
    /**
   * @attribute coll
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:129
   */
    if(decl() instanceof ParMethodDecl) {
    {
      GenericMethodDecl ref = (GenericMethodDecl)(((ParMethodDecl)decl()).sourceMethodDecl());
      if(ref != null)
        ref.GenericMethodDecl_parUses_contributors().add(this);
      }    }
    super.collect_contributors_GenericMethodDecl_parUses();
  }
  protected void collect_contributors_MethodDecl_polyUses_() {
    /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:44
   */
    for(java.util.Iterator iter = (possibleTargets()).iterator(); iter.hasNext(); ) {
      MethodDecl ref = (MethodDecl)iter.next();
      if(ref != null)
      ref.MethodDecl_polyUses__contributors().add(this);
    }
    super.collect_contributors_MethodDecl_polyUses_();
  }
  protected void contributeTo_GenericMethodDecl_GenericMethodDecl_parUses(Collection<MethodAccess> collection) {
    super.contributeTo_GenericMethodDecl_GenericMethodDecl_parUses(collection);
    if(decl() instanceof ParMethodDecl)
      collection.add(this);
  }

  protected void contributeTo_MethodDecl_MethodDecl_polyUses_(Collection<MethodAccess> collection) {
    super.contributeTo_MethodDecl_MethodDecl_polyUses_(collection);
    collection.add(this);
  }

}
