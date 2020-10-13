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
 * @production TypeAccess : {@link Access} ::= <span class="component">&lt;Package:String&gt;</span> <span class="component">&lt;ID:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:23
 */
public class TypeAccess extends Access implements Cloneable, LockableName {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    decls_computed = false;
    decls_value = null;
    decl_computed = false;
    decl_value = null;
    type_computed = false;
    type_value = null;
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
  public TypeAccess clone() throws CloneNotSupportedException {
    TypeAccess node = (TypeAccess)super.clone();
    node.decls_computed = false;
    node.decls_value = null;
    node.decl_computed = false;
    node.decl_value = null;
    node.type_computed = false;
    node.type_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeAccess copy() {
    try {
      TypeAccess node = (TypeAccess) clone();
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
  public TypeAccess fullCopy() {
    TypeAccess tree = (TypeAccess) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:128
   */
  public void accessControl() {
    super.accessControl();
    TypeDecl hostType = hostType();
    if(hostType != null && !hostType.isUnknown() && !type().accessibleFrom(hostType)) {
      error("" + this + " in " + hostType().fullName() + " can not access type " + type().fullName());
    }
    else if((hostType == null || hostType.isUnknown())  && !type().accessibleFromPackage(hostPackage())) {
      error("" + this + " can not access type " + type().fullName());
    }
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:160
   */
  public void nameCheck() {
    if(isQualified() && !qualifier().isTypeAccess() && !qualifier().isPackageAccess())
      error("can not access the type named " + decl().typeName() + " in this context");
    if(decls().isEmpty())
      error("no visible type named " + typeName());
    if(decls().size() > 1) {
      StringBuffer s = new StringBuffer();
      s.append("several types named " + name() + ":");
      for(Iterator iter = decls().iterator(); iter.hasNext(); ) {
        TypeDecl t = (TypeDecl)iter.next();
        s.append(" " + t.typeName());
      }
      error(s.toString());
    }
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:23
   */
  public TypeAccess(String name, int start, int end) {
    this(name);
    this.start = this.IDstart = start;
    this.end = this.IDend = end;
  }
  /**
   * @ast method 
   * @aspect NodeConstructors
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NodeConstructors.jrag:44
   */
  public TypeAccess(String typeName) {
    this("", typeName);
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:483
   */
  public void refined_PrettyPrint_TypeAccess_toString(StringBuffer s) {
    if(decl().isReferenceType())
      s.append(nameWithPackage());
    else
      s.append(decl().name());
  }
  /**
   * @ast method 
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:328
   */
  public void checkModifiers() {
    if(decl().isDeprecated() &&
       !withinDeprecatedAnnotation() &&
       (hostType() == null || hostType().topLevelType() != decl().topLevelType()) &&
       !withinSuppressWarnings("deprecation"))
      warning(decl().typeName() + " has been deprecated");
  }
  /**
   * @ast method 
   * @aspect GenericsTypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:298
   */
  public boolean isRaw() {
    /*
    if(hasNextAccess())
      return false;
    */
    ASTNode parent = getParent();
    while(parent instanceof AbstractDot)
      parent = parent.getParent();
    if(parent instanceof ParTypeAccess)
      return false;
    if(parent instanceof ImportDecl)
      return false;
    /*
    Access a = this;
    while(a.isTypeAccess() && hasNextAccess())
      a = a.nextAccess();
    if(a.isThisAccess() || a.isSuperAccess())
      return false;
    */
    return true;
  }
  /**
   * @ast method 
   * @aspect GenericsTypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:438
   */
  public void typeCheck() {
    TypeDecl type = type();
    if(type.isRawType() && type.isNestedType() && type.enclosingType().isParameterizedType() && !type.enclosingType().isRawType())
      error("Can not access a member type of a paramterized type as a raw type");
  }
  /**
   * @ast method 
   * @aspect GenericsExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/GenericsExt.jrag:17
   */
  public ASTNode substituteAll(Parameterization parTypeDecl) {
		if(decl().isTypeVariable())
			return parTypeDecl.substitute((TypeVariable)decl()).createBoundAccess();
		else
			return super.substituteAll(parTypeDecl);
	}
  /**
   * @ast method 
   * @aspect PackageDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/PackageDecl.jrag:61
   */
  public String getTopLevelPackage() {
		String[] comp = packageName().split("\\.");
		if(comp.length == 0)
			return null;
		return comp[0];
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:38
   */
  public void typeVarAccesses(java.util.Set<TypeAccess> res) {
		if(decl().isTypeVariable())
			res.add(this);
		super.typeVarAccesses(res);
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:59
   */
  protected void collectUsedTypeVars(Collection<TypeVariable> tvars) {
		if(decl().isTypeVariable())
			tvars.add((TypeVariable)decl());
		super.collectUsedTypeVars(tvars);
	}
  /**
   * @ast method 
   * @aspect TypeVariableExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:91
   */
  public void translateTypeVars(Map<TypeVariable, TypeVariable> dict) {
		if(decl().isTypeVariable()) {
			TypeVariable tv = (TypeVariable)decl();
			TypeVariable tv2 = dict.get(tv);
			if(tv2 != null)
				lock(tv2);
		}
		super.translateTypeVars(dict);
	}
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:21
   */
  protected void collectAccessibilityConstraints(Collection<AccessibilityConstraint> res) {
		// (Acc-1)
		res.add(new AccessibilityConstraint(this, decl().minAccess(this), decl()));
	}
  /**
   * @ast method 
   * @aspect FreshVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/FreshVariables.jrag:153
   */
  public void collectAllDecls(Collection<Declaration> res) {
		if(!getPackage().equals(""))
			res.add(lookupPackage(getTopLevelPackage()));
		res.add(decl());
		super.collectAllDecls(res);
	}
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:3
   */
  
	private PackageDecl targetPackage = null;
  /**
   * @ast method 
   * @aspect LockedPackageAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedPackageAccess.jrag:30
   */
  public ASTNode lockAllPackageAccesses() {
		if(!(this instanceof ArrayTypeAccess) && !getPackage().equals("") && !getPackage().equals("@primitive"))
			lock();
		return super.lockAllPackageAccesses();
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:14
   */
  
	
	/* A locked type access is a type access that does not obey the normal type lookup
	 * rules, but instead immediately binds to its target. */
	private TypeDecl targetType = null;
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:15
   */
  private void refined_LockedTypeAccess_TypeAccess_setTargetType(TypeDecl td) {
		targetType = td;
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:19
   */
  public boolean isLocked() { return targetType != null; }
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:86
   */
  public ASTNode lockNames(Collection<String> endangered) {
		if(!isLocked() &&
				(endangered.contains(name()) || endangered.contains(getTopLevelPackage())))
			return lock();
		return super.lockNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:101
   */
  public void eliminateLockedNames() {
		if(isLocked())
			unlock();
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:132
   */
  public ASTNode lock() { return decl().isVoid() ? this : lock(decl()); }
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:134
   */
  public ASTNode lock(TypeDecl decl) {
		assert decl != null && !decl.isUnknown();
		setTargetType(decl);
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:149
   */
  public Access unlock() {
		Expr qual = getQualifier();
		assert qual == null || qual.isPure();
		TypeDecl target = targetType.refresh();
		setTargetType(null);
		flushCaches();
		if(!target.hasName())
			throw new RefactoringException("cannot unlock access to nameless type");
		try {
			if(!isObscured() && decl().equals(target))
				return this;
			return unlock(qual, target);
		} finally {
			setTargetType(null);
		}
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:166
   */
  public boolean isObscured() {
		if(!fromSource())
			return false;
		String tlpkg = getTopLevelPackage();
		if(tlpkg != null && !tlpkg.equals(""))
			return !(lookupName(tlpkg) instanceof PackageDecl);
		return !(lookupName(name()) instanceof TypeDecl);
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:182
   */
  public Access unlock(Expr qual, TypeDecl target) {
		if(!fromSource() || hostBodyDecl() instanceof MethodDecl && ((MethodDecl)hostBodyDecl()).isNative())
			throw new RefactoringException("cannot fix access in library");
		if(target.isRawType())
			target = target.erasure();
		if(target.isParameterizedType())
			return unlockParTypeAccess((ParTypeDecl)target, qual);
		if(target.isTypeVariable())
			return unlockTypeVariableAccess((TypeVariable)target, qual);
		if(target instanceof PrimitiveType || target instanceof VoidType)
			return unlockPrimitiveTypeAccess(target, qual);
		if(target.isArrayDecl())
			return unlockArrayTypeAccess((ArrayDecl)target, qual);
		if(target.isLocalClass())
			return unlockLocalClassAccess((ClassDecl)target, qual);
		if(target.isMemberType())
			return unlockMemberTypeAccess(target, qual);
		if(target.isTopLevelType())
			return unlockTopLevelTypeAccess(target, qual);
		throw new Error("cannot fix access to this kind of type");		
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:204
   */
  protected Access unlockPrimitiveTypeAccess(TypeDecl target, Expr qual) {
		assert qual == null;
		setID(target.name());
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:210
   */
  protected Access unlockTypeVariableAccess(TypeVariable target, Expr qual) {
		SimpleSet names = lookupName(target.name());
		if(names.isEmpty()) return this;
		if(!names.isSingleton(target))
			throw new RefactoringException("cannot access shadowed/obscured type variable");
		setPackage("");
		setID(target.name());
		if (qual!=null) {
			this.flushCache();
			replace(parentDot()).with(this);
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:224
   */
  protected Access unlockLocalClassAccess(ClassDecl target, Expr qual) {
		if(!lookupName(target.name()).isSingleton(target))
			throw new RefactoringException("cannot access shadowed/obscured local class");
		setPackage("");
		setID(target.name());
		if (qual!=null) {
			this.flushCache();
			replace(parentDot()).with(this);
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:236
   */
  protected Access unlockMemberTypeAccess(TypeDecl target, Expr qual) {
		assert qual == this.getQualifier();
		if(qual != null) {
			// try to build an access using the given qualifier
			if(qual.isTypeAccess()) {
				TypeDecl outer = qual.type().refresh();
				if(outer.memberTypes(target.name()).isSingleton(target)) {
					if(target.inaccessibleFrom(this))
						throw new RefactoringException("inaccessible type");
					setPackage("");
					setID(target.name());
					return parentDot();
				}
			}
			// we need to throw away the qualifier, but make sure it is pure
			if(!qual.isPure())
				throw new RefactoringException("cannot access member type");
		}
		if(lookupName(target.name()).isSingleton(target)) {
			setPackage("");
			setID(target.name());
			if (qual!=null) {
				this.flushCache();
				replace(parentDot()).with(this);
			}
			return this;
		} else {
			TypeDecl outer = target.enclosingType();
			if(!target.isStatic() && getParent() instanceof ClassInstanceExpr && hostType().withinBodyThatSubclasses(outer) == null)
				throw new RefactoringException("cannot access non-static member types without enclosing instance in instanceof");
			if(!outer.memberTypes(target.name()).isSingleton(target))
				throw new RefactoringException("cannot access shadowed member type");
			setPackage("");
			setID(target.name());
			// TODO: more thought on when precisely this is necessary
			// (rationale here is that if target is a generic type declaration, we are actually
			// trying to build an access to its raw type)
			if(target.isGenericType() && outer.isGenericType())
				outer = ((GenericTypeDecl)outer).rawType();
			if (qual!=null && qual.type()!=outer || qual==null) {
				this.flushCache();
				Access outerAccess = outer.createLockedAccess();
				target.affectedByUnlock(outerAccess, this);
				this.lock(target);
				return (Access) replace(qual!=null?parentDot():this).with(outerAccess.qualifiesAccess(this));
			}
			return parentDot();
		}
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:286
   */
  protected Access unlockTopLevelTypeAccess(TypeDecl target, Expr qual) {
		if(lookupName(target.name()).isSingleton(target)) {
			setPackage("");
			setID(target.name());
			if (qual!=null) {
				this.flushCache();
				replace(parentDot()).with(this);
			}
			return this;
		}
		setPackage(target.packageName());
		setID(target.name());
		String pkg = getTopLevelPackage();
		SimpleSet s = lookupName(pkg);
		if(!s.isEmpty() && !s.isSingleton(lookupPackage(pkg)) || 
				!lookupType(target.packageName(), target.name()).equals(target))
			throw new RefactoringException("cannot access toplevel type");
		if (qual!=null) {
			this.flushCache();
			return (Access) replace(parentDot()).with(this);
		}
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:310
   */
  protected Access unlockParTypeAccess(ParTypeDecl target, Expr qual) {
		List<Access> args = new List<Access>();
		for(int i=0;i<target.getNumArgument();++i) {
			Access targetAccess = target.getArgument(i).type().createLockedAccess();
			affectedByUnlock(targetAccess);
			args.add(targetAccess);
		}
		Access rawAccess = ((GenericTypeDecl)target.genericDecl()).rawType().createLockedAccess();
		affectedByUnlock(rawAccess);
		Access acc = new ParTypeAccess(rawAccess, args);
		if(qual != null) {
			affectedByUnlock(acc);
			acc = qual.qualifiesAccess(acc);
		}
		// do we always need to replace ?
		return (Access) replace(qual!=null?parentDot():this).with(acc);
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:328
   */
  protected Access unlockArrayTypeAccess(ArrayDecl target, Expr qual) {
		Access acc = target.componentType().createLockedAccess();
		affectedByUnlock(acc);
		if (acc.type() == this.type())
			return this;
		if(qual != null)
			acc = qual.qualifiesAccess(acc);
		return (Access) replace(qual!=null?parentDot():this).with(new ArrayTypeAccess(acc));
	}
  /**
   * @ast method 
   * @aspect AddRequiredMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/AddRequiredMembers.jrag:30
   */
  public void addRequiredMembers(TypeDecl host, java.util.Set<MethodDecl> meths, java.util.Set<FieldDeclaration> fds, java.util.Set<MemberTypeDecl> mtds) {
		if(!decl().isStatic() && decl().getParent() instanceof MemberTypeDecl && decl().enclosingType() == host)
			mtds.add((MemberTypeDecl)decl().getParent());
		super.addRequiredMembers(host, meths, fds, mtds);
	}
  /**
   * @ast method 
   * @aspect Locking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Renaming/Locking.jrag:143
   */
  public TypeAccess lockedCopy() {
		TypeAccess res = (TypeAccess)super.lockedCopy();
		res.lock(decl());
		return res;
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
  public TypeAccess() {
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
  public TypeAccess(String p0, String p1) {
    setPackage(p0);
    setID(p1);
  }
  /**
   * @ast method 
   * 
   */
  public TypeAccess(beaver.Symbol p0, beaver.Symbol p1) {
    setPackage(p0);
    setID(p1);
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
   * Replaces the lexeme Package.
   * @param value The new value for the lexeme Package.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__TypeAccess_setPackage(String value) {
    tokenString_Package = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_Package;
  /**
   * @ast method 
   * 
   */
  
  public int Packagestart;
  /**
   * @ast method 
   * 
   */
  
  public int Packageend;
  /**
   * JastAdd-internal setter for lexeme Package using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setPackage(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setPackage is only valid for String lexemes");
    tokenString_Package = (String)symbol.value;
    Packagestart = symbol.getStart();
    Packageend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme Package.
   * @return The value for the lexeme Package.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getPackage() {
    return tokenString_Package != null ? tokenString_Package : "";
  }
  /**
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__TypeAccess_setID(String value) {
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
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:24
   */
    public void toString(StringBuffer s) {
		if(!isLocked()) {
			refined_PrettyPrint_TypeAccess_toString(s);
		} else {
			s.append("[[");
			refined_PrettyPrint_TypeAccess_toString(s);
			s.append("]]");
		}
	}
  /**
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:192
   */
    private void setTargetType(final TypeDecl td) {
		final TypeDecl saved = targetType;
		refined_LockedTypeAccess_TypeAccess_setTargetType(td);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				
				@Override
				public void undo() {
					targetType = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedTypeAccess_TypeAccess_setTargetType(td);
				}
				
				@Override
				public String toString() {
					return "TypeAccess.setTargetType";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:1653
   */
   public void setPackage(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, Packagestart, Packageend, tokenString_Package, value) {
				@Override
				public void undo() {
					refined__TypeAccess_setPackage(oldValue);
				}
				@Override
				public String toString() {
					return "TypeAccess.setPackage (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__TypeAccess_setPackage(value);
				}
			});
		}
		refined__TypeAccess_setPackage(value);
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:201
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__TypeAccess_setID(oldValue);
				}
				@Override
				public String toString() {
					return "TypeAccess.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__TypeAccess_setID(value);
				}
			});
		}
		refined__TypeAccess_setID(value);
	}
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:223
   */
  private SimpleSet refined_TypeScopePropagation_TypeAccess_decls()
{
    if(packageName().equals(""))
      return lookupType(name());
    else {
      TypeDecl typeDecl = lookupType(packageName(), name());
      if(typeDecl != null)
        return SimpleSet.emptySet.add(typeDecl);
      return SimpleSet.emptySet;
    }
  }
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:238
   */
  private TypeDecl refined_TypeScopePropagation_TypeAccess_decl()
{
    SimpleSet decls = decls();
    if(decls.size() == 1) {
      return (TypeDecl)decls.iterator().next();
    }
    return unknownType();
  }
  /**
   * @ast method 
   * @aspect GenericsTypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:290
   */
  private TypeDecl refined_GenericsTypeAnalysis_TypeAccess_decl()
{
    TypeDecl decl = refined_TypeScopePropagation_TypeAccess_decl();
    if(decl instanceof GenericTypeDecl && isRaw())
      return ((GenericTypeDecl)decl).lookupParTypeDecl(new ArrayList());
    return decl;
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
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:21
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
  private SimpleSet decls_compute() {  return isLocked() ? targetType.refresh() : refined_TypeScopePropagation_TypeAccess_decls();  }
  /**
   * @apilevel internal
   */
  protected boolean decl_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl decl_value;
  /**
   * @attribute syn
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:22
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl decl() {
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
  private TypeDecl decl_compute() {  return isLocked() ? targetType.refresh() : refined_GenericsTypeAnalysis_TypeAccess_decl();  }
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:148
   */
  public SimpleSet qualifiedLookupVariable(String name) {
    ASTNode$State state = state();
    try {
    if(type().accessibleFrom(hostType())) {
      SimpleSet c = type().memberFields(name);
      c = keepAccessibleFields(c);
      if(type().isClassDecl() && c.size() == 1)
        c = removeInstanceVariables(c);
      return c;
    }
    return SimpleSet.emptySet;
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
    try {  return getClass().getName() + " [" + getPackage() + ", " + getID() + "]";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:21
   */
  public String name() {
    ASTNode$State state = state();
    try {  return getID();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:25
   */
  public String packageName() {
    ASTNode$State state = state();
    try {  return getPackage();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:49
   */
  public String nameWithPackage() {
    ASTNode$State state = state();
    try {  return getPackage().equals("") ? name() : (getPackage() + "." + name());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Names
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/QualifiedNames.jrag:62
   */
  public String typeName() {
    ASTNode$State state = state();
    try {  return isQualified() ? (qualifier().typeName() + "." + name()) : nameWithPackage();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:13
   */
  public boolean isTypeAccess() {
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
    try {  return NameType.PACKAGE_OR_TYPE_NAME;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:279
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
  private TypeDecl type_compute() {  return decl();  }
  /**
   * @attribute syn
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:150
   */
  public boolean staticContextQualifier() {
    ASTNode$State state = state();
    try {  return true;  }
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
    try {  return decl().usesTypeVariable() || super.usesTypeVariable();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:15
   */
  public boolean notAnObject() {
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
    try {  return true;  }
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
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:263
   */
  public SymbolicVarAccess qualifiedAccessVariable(Variable decl) {
    ASTNode$State state = state();
    try {
		if(type().accessibleFrom(hostType())) {
			SymbolicFieldAccess acc = type().accessMemberField(decl);
			acc = acc.ensureAccessible(this);
			if(type().isClassDecl())
				acc = acc.ensureStatic();
			return acc;
		}
		return unknownVarAccess();
	}
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect TypeAccessExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeAccessExt.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inImportDecl() {
    ASTNode$State state = state();
    boolean inImportDecl_value = getParent().Define_boolean_inImportDecl(this, null);
    return inImportDecl_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  protected void collect_contributors_TypeDecl_uses() {
    /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:38
   */
    {
      TypeDecl ref = (TypeDecl)(decl());
      if(ref != null)
        ref.TypeDecl_uses_contributors().add(this);
      }    super.collect_contributors_TypeDecl_uses();
  }
  protected void contributeTo_TypeDecl_TypeDecl_uses(Collection<Access> collection) {
    super.contributeTo_TypeDecl_TypeDecl_uses(collection);
    collection.add(this);
  }

}
