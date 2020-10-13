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
 * @production ClassInstanceExpr : {@link Access} ::= <span class="component">{@link Access}</span> <span class="component">Arg:{@link Expr}*</span> <span class="component">[{@link TypeDecl}]</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:37
 */
public class ClassInstanceExpr extends Access implements Cloneable, Call, LockableName {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafterInstance_Variable_values = null;
    computeDAbefore_int_Variable_values = null;
    computeDUbefore_int_Variable_values = null;
    decls_computed = false;
    decls_value = null;
    decl_computed = false;
    decl_value = null;
    localLookupType_String_values = null;
    type_computed = false;
    type_value = null;
    getLocation_computed = false;
    getLocation_value = null;
    exceptionalSucc_computed = false;
    exceptionalSucc_value = null;
    uncaughtExceptions_computed = false;
    uncaughtExceptions_value = null;
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
  public ClassInstanceExpr clone() throws CloneNotSupportedException {
    ClassInstanceExpr node = (ClassInstanceExpr)super.clone();
    node.isDAafterInstance_Variable_values = null;
    node.computeDAbefore_int_Variable_values = null;
    node.computeDUbefore_int_Variable_values = null;
    node.decls_computed = false;
    node.decls_value = null;
    node.decl_computed = false;
    node.decl_value = null;
    node.localLookupType_String_values = null;
    node.type_computed = false;
    node.type_value = null;
    node.getLocation_computed = false;
    node.getLocation_value = null;
    node.exceptionalSucc_computed = false;
    node.exceptionalSucc_value = null;
    node.uncaughtExceptions_computed = false;
    node.uncaughtExceptions_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ClassInstanceExpr copy() {
    try {
      ClassInstanceExpr node = (ClassInstanceExpr) clone();
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
  public ClassInstanceExpr fullCopy() {
    ClassInstanceExpr tree = (ClassInstanceExpr) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:139
   */
  public void accessControl() {
    super.accessControl();
    if(type().isAbstract())
      error("Can not instantiate abstract class " + type().fullName());
    if(!decl().accessibleFrom(hostType()))
      error("constructor " + decl().signature() + " is not accessible");
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:119
   */
  public void exceptionHandling() {
    for (Access exception : decl().getExceptionList()) {
      TypeDecl exceptionType = exception.type();
      if (!handlesException(exceptionType))
        error("" + this + " may throw uncaught exception " +
            exceptionType.fullName() + "; it must be caught or declared as being thrown");
    }
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:281
   */
  protected boolean reachedException(TypeDecl catchType) {
    ConstructorDecl decl = decl();
    for(int i = 0; i < decl.getNumException(); i++) {
      TypeDecl exceptionType = decl.getException(i).type();
      if(catchType.mayCatch(exceptionType))
        return true;
    }
    for(int i = 0; i < getNumArg(); i++) {
      if(getArg(i).reachedException(catchType))
        return true;
    }
    return false;
  }
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:414
   */
  public SimpleSet keepInnerClasses(SimpleSet c) {
    SimpleSet newSet = SimpleSet.emptySet;
    for(Iterator iter = c.iterator(); iter.hasNext(); ) {
      TypeDecl t = (TypeDecl)iter.next();
      if(t.isInnerType() && t.isClassDecl()) {
        newSet = newSet.add(c);
      }
    }
    return newSet;
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:142
   */
  public void refined_NameCheck_ClassInstanceExpr_nameCheck() {
    super.nameCheck();
    if(decls().isEmpty())
      error("can not instantiate " + type().typeName() + " no matching constructor found in " + type().typeName());
    else if(decls().size() > 1 && validArgs()) {
      error("several most specific constructors found");
      for(Iterator iter = decls().iterator(); iter.hasNext(); ) {
        error("         " + ((ConstructorDecl)iter.next()).signature());
      }
    }
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:82
   */
  public ClassInstanceExpr(Access type, List args) {
    this(type, args, new Opt());
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:327
   */
  public void refined_PrettyPrint_ClassInstanceExpr_toString(StringBuffer s) {
    s.append("new ");
    getAccess().toString(s);
    s.append("(");
    if(getNumArg() > 0) {
      getArg(0).toString(s);
      for(int i = 1; i < getNumArg(); i++) {
        s.append(", ");
        getArg(i).toString(s);
      }
    }
    s.append(")");

    if(hasTypeDecl()) {
      TypeDecl decl = getTypeDecl();
      s.append(" {");
      for(int i = 0; i < decl.getNumBodyDecl(); i++) {
        if(!(decl.getBodyDecl(i) instanceof ConstructorDecl))
          decl.getBodyDecl(i).toString(s);
      }
      s.append(typeDeclIndent());
      s.append("}");
    }
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:434
   */
  public void typeCheck() {
    if(isQualified() && qualifier().isTypeAccess() && !qualifier().type().isUnknown())
      error("*** The expression in a qualified class instance expr must not be a type name");
    // 15.9
    if(isQualified() && !type().isInnerClass() && !((ClassDecl)type()).superclass().isInnerClass() && !type().isUnknown()) {
      error("*** Qualified class instance creation can only instantiate inner classes and their anonymous subclasses");
    }
    if(!type().isClassDecl()) {
      error("*** Can only instantiate classes, which " + type().typeName() + " is not"); 
    }
    typeCheckEnclosingInstance();
    typeCheckAnonymousSuperclassEnclosingInstance();
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:448
   */
  public void typeCheckEnclosingInstance() {
    TypeDecl C = type();
    if(!C.isInnerClass())
      return;

    TypeDecl enclosing = null;
    if(C.isAnonymous()) {
      if(noEnclosingInstance()) {
        enclosing = null;
      }
      else {
        enclosing = hostType();
      }
    }
    else if(C.isLocalClass()) {
      if(C.inStaticContext()) {
        enclosing = null;
      }
      else if(noEnclosingInstance()) {
        enclosing = unknownType();
      }
      else {
        TypeDecl nest = hostType();
        while(nest != null && !nest.instanceOf(C.enclosingType()))
          nest = nest.enclosingType();
        enclosing = nest;
      }
    }
    else if(C.isMemberType()) {
      if(!isQualified()) {
        if(noEnclosingInstance()) {
          error("No enclosing instance to initialize " + C.typeName() + " with");
          //System.err.println("ClassInstanceExpr: Non qualified MemberType " + C.typeName() + " is in a static context when instantiated in " + this);
          enclosing = unknownType();
        }
        else {
          TypeDecl nest = hostType();
          while(nest != null && !nest.instanceOf(C.enclosingType()))
            nest = nest.enclosingType();
          enclosing = nest == null ? unknownType() : nest;
        }
      }
      else {
        enclosing = enclosingInstance();
      }
    }
    if(enclosing != null && !enclosing.instanceOf(type().enclosingType())) {
      String msg = enclosing == null ? "None" : enclosing.typeName();
      error("*** Can not instantiate " + type().typeName() + " with the enclosing instance " + msg + " due to incorrect enclosing instance");
    }
    else if(!isQualified() && C.isMemberType() && inExplicitConstructorInvocation() && enclosing == hostType()) {
      error("*** The innermost enclosing instance of type " + enclosing.typeName() + " is this which is not yet initialized here.");
    }
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:521
   */
  public void typeCheckAnonymousSuperclassEnclosingInstance() {
    if(type().isAnonymous() && ((ClassDecl)type()).superclass().isInnerType()) {
      TypeDecl S = ((ClassDecl)type()).superclass();
      if(S.isLocalClass()) {
        if(S.inStaticContext()) {
        }
        else if(noEnclosingInstance()) {
          error("*** No enclosing instance to class " + type().typeName() + " due to static context");
        }
        else if(inExplicitConstructorInvocation())
          error("*** No enclosing instance to superclass " + S.typeName() + " of " + type().typeName() + " since this is not initialized yet");
      }
      else if(S.isMemberType()) {
        if(!isQualified()) {
          // 15.9.2 2nd paragraph
          if(noEnclosingInstance()) {
            error("*** No enclosing instance to class " + type().typeName() + " due to static context");
          }
          else {
            TypeDecl nest = hostType();
            while(nest != null && !nest.instanceOf(S.enclosingType()))
              nest = nest.enclosingType();
            if(nest == null) {
              error("*** No enclosing instance to superclass " + S.typeName() + " of " + type().typeName());
            }
            else if(inExplicitConstructorInvocation()) {
              error("*** No enclosing instance to superclass " + S.typeName() + " of " + type().typeName() + " since this is not initialized yet");
            }
          }
        }
      }
    }
  }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:363
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
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:77
   */
  public void insertArg(Expr arg, int i) {
		getArgList().insertChild(arg, i);
	}
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:78
   */
  protected void collectAccessibilityConstraints(Collection<AccessibilityConstraint> res) {
		// (Acc-1)
		res.add(new AccessibilityConstraint(this, decl().minAccess(this), decl()));
		// (Acc-1) variant: when calling a constructor, the host type has to be accessible
		res.add(new AccessibilityConstraint(this, decl().hostType().minAccess(this), decl().hostType()));
		// (Acc-2)
		if(!hasTypeDecl() && !hostType().hostPackage().equals(decl().hostType().hostPackage()))
			res.add(new AccessibilityConstraint(this, decl(), Operator.EQ, AccessModifierConstant.PUBLIC));
	}
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:19
   */
  public void lockDataFlow() {
		lockReachingDefs();
		super.lockDataFlow();
	}
  /**
   * @ast method 
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:208
   */
  public void eliminateWith(List<Access> qualifiers, TypeDecl hostType) {
		TypeDecl td = getAccess().type();
		if(!isQualified() && td.isMemberType() && !td.isStatic()) {
			for(int i=qualifiers.getNumChild()-1;i>=0;i--) {
				Access qual = qualifiers.getChild(i);
				TypeDecl qual_type = qual.type().isParameterizedType() ? ((ParTypeDecl)qual.type()).genericDecl() : qual.type();
				if(qual_type.subtype(td.enclosingType())) {
					if(!getAccess().type().accessibleFrom(hostType))
						throw new RefactoringException("type not accessible");
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
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:33
   */
  
	private ConstructorDecl targetConstructor = null;
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:37
   */
  private void refined_LockedConstructor_ClassInstanceExpr_setTarget(ConstructorDecl targetConstructor) {
		this.targetConstructor = targetConstructor;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:69
   */
  public void lockConstructorCalls(Collection<TypeDecl> endangered) {
		if(endangered.contains(decl().hostType()))
			lock();
		super.lockConstructorCalls(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:80
   */
  public ClassInstanceExpr lock() {
		if(targetConstructor == null)
			lock(decl());
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:91
   */
  public ClassInstanceExpr lock(ConstructorDecl ctor) {
		assert ctor != null && ctor != unknownConstructor();
		setTarget(ctor);
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:100
   */
  public boolean isLocked() {
		return targetConstructor != null;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:123
   */
  public void eliminateLockedNames() {
		if(targetConstructor != null)
			unlock();
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:128
   */
  public ClassInstanceExpr unlock() {
		ConstructorDecl targetConstructor = this.targetConstructor.refresh();
		setTarget(null);
		if(fromSource() && getAccess().type() != targetConstructor.hostType())
			setAccess(targetConstructor.hostType().createLockedAccess());
		flushCache();
		if(!decl().equals(targetConstructor)) {
			if(!fromSource())
				throw new RefactoringException("cannot adjust constructor access in library code");
			setArgList(MethodAccessInfo.insertCasts(targetConstructor, getArgList()));
			flushCache();
			if(!decl().equals(targetConstructor))
				throw new RefactoringException("cannot disambiguate constructor access");
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:13
   */
  public ASTNode lockNames(Collection<String> endangered) {
		if(isLocked()) {
			// skip over type access
			for(int i=1;i<getNumChild();++i)
				getChild(i).lockNames(endangered);
			return this;
		} else {
			return super.lockNames(endangered);
		}
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:64
   */
  public ASTNode lockAllNames() {
		// if this instance expression creates an anonymous class, we don't need
		// to lock the constructor invocation: the constructor is auto-generated anyway
		if(hasTypeDecl()) {
			getAccess().lockAllNames();
		} else {
			lock();
		}
		// skip over type access
		for(int i=1;i<getNumChild();++i)
			getChild(i).lockAllNames();
		return this;
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:181
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		addConstraint(constraints, pred, new SimpleTypeConstraint(this, "constructor invocation", this, Operator.EQ, type()));
		//addConstraint(constraints, pred, new SimpleTypeConstraint(this, "constructor invocation", this, Operator.EQ, getAccess()));
		collectArgumentTypeConstraints(pred, constraints);
		if(isQualified())
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "constructor invocation", qualifier(), Operator.EQ, qualifier().type()));
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
   * 
   */
  public ClassInstanceExpr() {
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
    setChild(new List(), 1);
    setChild(new Opt(), 2);
  }
  /**
   * @ast method 
   * 
   */
  public ClassInstanceExpr(Access p0, List<Expr> p1, Opt<TypeDecl> p2) {
    setChild(p0, 0);
    setChild(p1, 1);
    setChild(p2, 2);
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
   * Replaces the Access child.
   * @param node The new node to replace the Access child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setAccess(Access node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the Access child.
   * @return The current node used as the Access child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Access getAccess() {
    return (Access)getChild(0);
  }
  /**
   * Retrieves the Access child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Access child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Access getAccessNoTransform() {
    return (Access)getChildNoTransform(0);
  }
  /**
   * Replaces the Arg list.
   * @param list The new list node to be used as the Arg list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setArgList(List<Expr> list) {
    setChild(list, 1);
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
    List<Expr> list = (List<Expr>)getChild(1);
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
    return (List<Expr>)getChildNoTransform(1);
  }
  /**
   * Replaces the optional node for the TypeDecl child. This is the {@code Opt} node containing the child TypeDecl, not the actual child!
   * @param opt The new node to be used as the optional node for the TypeDecl child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setTypeDeclOpt(Opt<TypeDecl> opt) {
    setChild(opt, 2);
  }
  /**
   * Check whether the optional TypeDecl child exists.
   * @return {@code true} if the optional TypeDecl child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasTypeDecl() {
    return getTypeDeclOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) TypeDecl child.
   * @return The TypeDecl child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl getTypeDecl() {
    return (TypeDecl)getTypeDeclOpt().getChild(0);
  }
  /**
   * Replaces the (optional) TypeDecl child.
   * @param node The new node to be used as the TypeDecl child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeDecl(TypeDecl node) {
    getTypeDeclOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<TypeDecl> getTypeDeclOpt() {
    return (Opt<TypeDecl>)getChild(2);
  }
  /**
   * Retrieves the optional node for child TypeDecl. This is the {@code Opt} node containing the child TypeDecl, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child TypeDecl.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<TypeDecl> getTypeDeclOptNoTransform() {
    return (Opt<TypeDecl>)getChildNoTransform(2);
  }
  /**
   * @ast method 
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:19
   */
    public void nameCheck() {
    if(getAccess().type().isEnumDecl() && !enclosingBodyDecl().isEnumConstant())
      error("enum types may not be instantiated explicitly");
    else
      refined_NameCheck_ClassInstanceExpr_nameCheck();
  }
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:54
   */
    public void toString(StringBuffer s) {
		if(targetConstructor == null) {
			refined_PrettyPrint_ClassInstanceExpr_toString(s);
		} else {
			s.append("[[");
			refined_PrettyPrint_ClassInstanceExpr_toString(s);
			s.append("]]");
		}
	}
  /**
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:55
   */
    private void setTarget(final ConstructorDecl targetConstructor) {
		final ConstructorDecl saved = this.targetConstructor;
		refined_LockedConstructor_ClassInstanceExpr_setTarget(targetConstructor);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModification() {
				@Override
				public void undo() {
					ClassInstanceExpr.this.targetConstructor = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedConstructor_ClassInstanceExpr_setTarget(targetConstructor);
				}
				
				@Override
				public String toString() {
					return "ClassInstanceExpr.setTarget";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:78
   */
  private ConstructorDecl refined_ConstructScope_ClassInstanceExpr_decl()
{
    SimpleSet decls = decls();
    if(decls.size() == 1)
      return (ConstructorDecl)decls.iterator().next();
    return unknownConstructor();
  }
  /**
   * @ast method 
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:311
   */
  private TypeDecl refined_TypeAnalysis_ClassInstanceExpr_type()
{ return hasTypeDecl() ? getTypeDecl() : getAccess().type(); }
  protected java.util.Map isDAafterInstance_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:421
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAafterInstance(Variable v) {
    Object _parameters = v;
    if(isDAafterInstance_Variable_values == null) isDAafterInstance_Variable_values = new java.util.HashMap(4);
    if(isDAafterInstance_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDAafterInstance_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDAafterInstance_Variable_value = isDAafterInstance_compute(v);
      if(isFinal && num == state().boundariesCrossed) isDAafterInstance_Variable_values.put(_parameters, Boolean.valueOf(isDAafterInstance_Variable_value));
    return isDAafterInstance_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isDAafterInstance_compute(Variable v) {
    if(getNumArg() == 0)
      return isDAbefore(v);
    return getArg(getNumArg()-1).isDAafter(v);
  }
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:235
   */
  public boolean isDAafter(Variable v) {
    ASTNode$State state = state();
    try {  return isDAafterInstance(v);  }
    finally {
    }
  }
  protected java.util.Map computeDAbefore_int_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:428
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
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:850
   */
  public boolean isDUafterInstance(Variable v) {
    ASTNode$State state = state();
    try {
    if(getNumArg() == 0)
      return isDUbefore(v);
    return getArg(getNumArg()-1).isDUafter(v);
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:694
   */
  public boolean isDUafter(Variable v) {
    ASTNode$State state = state();
    try {  return isDUafterInstance(v);  }
    finally {
    }
  }
  protected java.util.Map computeDUbefore_int_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:857
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean computeDUbefore(int i, Variable v) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(Integer.valueOf(i));
    _parameters.add(v);
    if(computeDUbefore_int_Variable_values == null) computeDUbefore_int_Variable_values = new java.util.HashMap(4);
    if(computeDUbefore_int_Variable_values.containsKey(_parameters)) {
      return ((Boolean)computeDUbefore_int_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean computeDUbefore_int_Variable_value = computeDUbefore_compute(i, v);
      if(isFinal && num == state().boundariesCrossed) computeDUbefore_int_Variable_values.put(_parameters, Boolean.valueOf(computeDUbefore_int_Variable_value));
    return computeDUbefore_int_Variable_value;
  }
  /**
   * @apilevel internal
   */
  private boolean computeDUbefore_compute(int i, Variable v) {  return i == 0 ? isDUbefore(v) : getArg(i-1).isDUafter(v);  }
  /**
   * @attribute syn
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:50
   */
  public boolean applicableAndAccessible(ConstructorDecl decl) {
    ASTNode$State state = state();
    try {  return decl.applicable(getArgList()) && decl.accessibleFrom(hostType()) && 
    (!decl.isProtected() || hasTypeDecl() || decl.hostPackage().equals(hostPackage()));  }
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
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:70
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
  private SimpleSet decls_compute() {
    TypeDecl typeDecl = hasTypeDecl() ? getTypeDecl() : getAccess().type();
    return chooseConstructor(typeDecl.constructors(), getArgList());
  }
  /**
   * @apilevel internal
   */
  protected boolean decl_computed = false;
  /**
   * @apilevel internal
   */
  protected ConstructorDecl decl_value;
  /**
   * @attribute syn
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:42
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorDecl decl() {
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
  private ConstructorDecl decl_compute() {  return targetConstructor == null ? refined_ConstructScope_ClassInstanceExpr_decl() : targetConstructor;  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:430
   */
  public SimpleSet qualifiedLookupType(String name) {
    ASTNode$State state = state();
    try {
    SimpleSet c = keepAccessibleTypes(type().memberTypes(name));
    if(!c.isEmpty())
      return c;
    if(type().name().equals(name))
      return SimpleSet.emptySet.add(type());
    return SimpleSet.emptySet;
  }
    finally {
    }
  }
  protected java.util.Map localLookupType_String_values;
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:472
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet localLookupType(String name) {
    Object _parameters = name;
    if(localLookupType_String_values == null) localLookupType_String_values = new java.util.HashMap(4);
    if(localLookupType_String_values.containsKey(_parameters)) {
      return (SimpleSet)localLookupType_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet localLookupType_String_value = localLookupType_compute(name);
      if(isFinal && num == state().boundariesCrossed) localLookupType_String_values.put(_parameters, localLookupType_String_value);
    return localLookupType_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet localLookupType_compute(String name) {
    if(hasTypeDecl() && getTypeDecl().name().equals(name))
      return SimpleSet.emptySet.add(getTypeDecl());
    return SimpleSet.emptySet;
  }
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:135
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
   * @aspect SyntacticClassification
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:56
   */
  public NameType predNameType() {
    ASTNode$State state = state();
    try {  return NameType.EXPRESSION_NAME;  }
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
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:43
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
  private TypeDecl type_compute() {  return targetConstructor == null ? refined_TypeAnalysis_ClassInstanceExpr_type() : targetConstructor.hostType();  }
  /**
   * @attribute syn
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:519
   */
  public boolean noEnclosingInstance() {
    ASTNode$State state = state();
    try {  return isQualified() ? qualifier().staticContextQualifier() : inStaticContext();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:327
   */
  public int arity() {
    ASTNode$State state = state();
    try {  return getNumArg();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableArityParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:54
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:58
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
  private Location getLocation_compute() {  return isPure() ? null : AnyHeapLocation.instance;  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:34
   */
  public CFGNode first() {
    ASTNode$State state = state();
    try {  return getAccess().first();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:280
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Exceptions.jrag:46
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
    try {  return decl().signature().equals("<init>(java.lang.String p0)") || super.isFlowInvariant();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:58
   */
  public Expr enclosingInstanceQualifier(TypeDecl td) {
    ASTNode$State state = state();
    try {
		if(isQualified())
			return qualifier().type().instanceOf(td) ? parentDot().getLeft() : null;
		return super.enclosingInstanceQualifier(td);
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Purity
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Purity.jrag:2
   */
  public boolean isPure() {
    ASTNode$State state = state();
    try {
		/* whitelist some constructors from the standard library we know are impervious to dataflow */
		TypeDecl host = decl().hostType();
		if(hasTypeDecl() || host.unboxed().isUnknown() && !host.isString())
			return false;
		for(Expr arg : getArgs())
			if(!arg.isPure())
				return false;
		return true;
	}
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:52
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean handlesException(TypeDecl exceptionType) {
    ASTNode$State state = state();
    boolean handlesException_TypeDecl_value = getParent().Define_boolean_handlesException(this, null, exceptionType);
    return handlesException_TypeDecl_value;
  }
  /**
   * @attribute inh
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:27
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeObject() {
    ASTNode$State state = state();
    TypeDecl typeObject_value = getParent().Define_TypeDecl_typeObject(this, null);
    return typeObject_value;
  }
  /**
   * @attribute inh
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:84
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorDecl unknownConstructor() {
    ASTNode$State state = state();
    ConstructorDecl unknownConstructor_value = getParent().Define_ConstructorDecl_unknownConstructor(this, null);
    return unknownConstructor_value;
  }
  /**
   * @attribute inh
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:351
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String typeDeclIndent() {
    ASTNode$State state = state();
    String typeDeclIndent_value = getParent().Define_String_typeDeclIndent(this, null);
    return typeDeclIndent_value;
  }
  /**
   * @attribute inh
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:504
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl enclosingInstance() {
    ASTNode$State state = state();
    TypeDecl enclosingInstance_value = getParent().Define_TypeDecl_enclosingInstance(this, null);
    return enclosingInstance_value;
  }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:126
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inExplicitConstructorInvocation() {
    ASTNode$State state = state();
    boolean inExplicitConstructorInvocation_value = getParent().Define_boolean_inExplicitConstructorInvocation(this, null);
    return inExplicitConstructorInvocation_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AnonymousClasses.jrag:15
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_superType(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclOptNoTransform()) {
      return getAccess().type();
    }
    else {      return getParent().Define_TypeDecl_superType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:83
   * @apilevel internal
   */
  public ConstructorDecl Define_ConstructorDecl_constructorDecl(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclOptNoTransform()){
    Collection c = getAccess().type().constructors();
    SimpleSet maxSpecific = chooseConstructor(c, getArgList());
    if(maxSpecific.size() == 1)
      return (ConstructorDecl)maxSpecific.iterator().next();
    return unknownConstructor();
  }
    else {      return getParent().Define_ConstructorDecl_constructorDecl(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:430
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getTypeDeclOptNoTransform()) {
      return isDAafterInstance(v);
    }
    else if(caller == getArgListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return computeDAbefore(i, v);
  }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:856
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getArgListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return computeDUbefore(i, v);
  }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:92
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:404
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
    if(caller == getTypeDeclOptNoTransform()){
    SimpleSet c = localLookupType(name);
    if(!c.isEmpty())
      return c;
    c = lookupType(name);
    if(!c.isEmpty())
      return c;
    return unqualifiedScope().lookupType(name);
  }
    else if(caller == getAccessNoTransform()){
    SimpleSet c = lookupType(name);
    if(c.size() == 1) {
      if(isQualified())
        c = keepInnerClasses(c);
    }
    return c;
  }
    else if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return unqualifiedScope().lookupType(name);
  }
    else {      return getParent().Define_SimpleSet_lookupType(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:137
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:127
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.EXPRESSION_NAME;
  }
    else if(caller == getTypeDeclOptNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else if(caller == getAccessNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:217
   * @apilevel internal
   */
  public boolean Define_boolean_isAnonymous(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_isAnonymous(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:530
   * @apilevel internal
   */
  public boolean Define_boolean_isMemberType(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclOptNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_isMemberType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:576
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_hostType(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclOptNoTransform()) {
      return hostType();
    }
    else {      return getParent().Define_TypeDecl_hostType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:147
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
    if(caller == getTypeDeclOptNoTransform()) {
      return isQualified() ?
    qualifier().staticContextQualifier() : inStaticContext();
    }
    else {      return getParent().Define_boolean_inStaticContext(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:275
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		if(i + 1 < getNumArg())
			return SmallSet.<CFGNode>singleton(getArg(i + 1).first());
		return SmallSet.<CFGNode>singleton(this);
	}
  }
    else if(caller == getAccessNoTransform()){
		if(getNumArg() > 0)
			return SmallSet.<CFGNode>singleton(getArg(0).first());
		return SmallSet.<CFGNode>singleton(this);
	}
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:384
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:385
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:40
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:60
   * @apilevel internal
   */
  public int Define_int_maxPrecedence(ASTNode caller, ASTNode child) {
    if(caller == getArgListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return Integer.MAX_VALUE;
  }
    else if(caller == getAccessNoTransform()) {
      return 0;
    }
    else {      return getParent().Define_int_maxPrecedence(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:51
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:254
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
  protected void collect_contributors_GenericConstructorDecl_parUses() {
    /**
   * @attribute coll
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:83
   */
    if(decl() instanceof ParConstructorDecl) {
    {
      GenericConstructorDecl ref = (GenericConstructorDecl)(((ParConstructorDecl)decl()).sourceConstructorDecl());
      if(ref != null)
        ref.GenericConstructorDecl_parUses_contributors().add(this);
      }    }
    super.collect_contributors_GenericConstructorDecl_parUses();
  }
  protected void collect_contributors_ConstructorDecl_uses() {
    /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:83
   */
    {
      ConstructorDecl ref = (ConstructorDecl)(decl());
      if(ref != null)
        ref.ConstructorDecl_uses_contributors().add(this);
      }    super.collect_contributors_ConstructorDecl_uses();
  }
  protected void collect_contributors_TypeDecl_instantiations() {
    /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:89
   */
    {
      TypeDecl ref = (TypeDecl)(getAccess().type());
      if(ref != null)
        ref.TypeDecl_instantiations_contributors().add(this);
      }    super.collect_contributors_TypeDecl_instantiations();
  }
  protected void contributeTo_GenericConstructorDecl_GenericConstructorDecl_parUses(Collection<Access> collection) {
    super.contributeTo_GenericConstructorDecl_GenericConstructorDecl_parUses(collection);
    if(decl() instanceof ParConstructorDecl)
      collection.add(this);
  }

  protected void contributeTo_ConstructorDecl_ConstructorDecl_uses(Collection<Access> collection) {
    super.contributeTo_ConstructorDecl_ConstructorDecl_uses(collection);
    collection.add(this);
  }

  protected void contributeTo_TypeDecl_TypeDecl_instantiations(Collection<Access> collection) {
    super.contributeTo_TypeDecl_TypeDecl_instantiations(collection);
    collection.add(this);
  }

}
