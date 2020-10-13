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
 * @production ConstructorDecl : {@link BodyDecl} ::= <span class="component">{@link Modifiers}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">Parameter:{@link ParameterDeclaration}*</span> <span class="component">Exception:{@link Access}*</span> <span class="component">[ConstructorInvocation:{@link Stmt}]</span> <span class="component">{@link Block}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:75
 */
public class ConstructorDecl extends BodyDecl implements Cloneable, Callable, Visible {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    accessibleFrom_TypeDecl_values = null;
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    throwsException_TypeDecl_values = null;
    name_computed = false;
    name_value = null;
    signature_computed = false;
    signature_value = null;
    sameSignature_ConstructorDecl_values = null;
    moreSpecificThan_ConstructorDecl_values = null;
    parameterDeclaration_String_values = null;
    circularThisInvocation_ConstructorDecl_values = null;
    sourceConstructorDecl_computed = false;
    sourceConstructorDecl_value = null;
    uncheckedExceptionExit_computed = false;
    uncheckedExceptionExit_value = null;
    getConstructorAccess_computed = false;
    getConstructorAccess_value = null;
    isImplicitConstructor_computed = false;
    getIndexOfParameter_String_values = null;
    throwsExactException_TypeDecl_values = null;
    accessParameter_Variable_values = null;
    creamVariable_Network_values = null;
    handlesException_TypeDecl_values = null;
    ConstructorDecl_uses_computed = false;
    ConstructorDecl_uses_value = null;
    ConstructorDecl_uses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    ConstructorDecl_uses_computed = false;
    ConstructorDecl_uses_value = null;
    ConstructorDecl_uses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorDecl clone() throws CloneNotSupportedException {
    ConstructorDecl node = (ConstructorDecl)super.clone();
    node.accessibleFrom_TypeDecl_values = null;
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.throwsException_TypeDecl_values = null;
    node.name_computed = false;
    node.name_value = null;
    node.signature_computed = false;
    node.signature_value = null;
    node.sameSignature_ConstructorDecl_values = null;
    node.moreSpecificThan_ConstructorDecl_values = null;
    node.parameterDeclaration_String_values = null;
    node.circularThisInvocation_ConstructorDecl_values = null;
    node.sourceConstructorDecl_computed = false;
    node.sourceConstructorDecl_value = null;
    node.uncheckedExceptionExit_computed = false;
    node.uncheckedExceptionExit_value = null;
    node.getConstructorAccess_computed = false;
    node.getConstructorAccess_value = null;
    node.isImplicitConstructor_computed = false;
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
  public ConstructorDecl copy() {
    try {
      ConstructorDecl node = (ConstructorDecl) clone();
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
  public ConstructorDecl fullCopy() {
    ConstructorDecl tree = (ConstructorDecl) copy();
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
   * @aspect ConstructorDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:144
   */
  public boolean applicable(List argList) {
    if(getNumParameter() != argList.getNumChild())
      return false;
    for(int i = 0; i < getNumParameter(); i++) {
      TypeDecl arg = ((Expr)argList.getChild(i)).type();
      TypeDecl parameter = getParameter(i).type();
      if(!arg.instanceOf(parameter)) {
        return false;
      }  
    }
    return true;
  }
  /**
   * Flag to indicate if this constructor is an auto-generated
   * default constructor. Default constructors are not pretty
   * printed.
   * @ast method 
   * @aspect ImplicitConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:171
   */
  

  /**
   * Flag to indicate if this constructor is an auto-generated
   * default constructor. Default constructors are not pretty
   * printed.
   */
  private boolean isDefaultConstructor = false;
  /**
   * Set the default constructor flag. Causes this constructor
   * to not be pretty printed.
   * @ast method 
   * @aspect ImplicitConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:176
   */
  public void setDefaultConstructor() {
    isDefaultConstructor = true;
  }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:110
   */
  public void checkModifiers() {
    super.checkModifiers();
  }
  /**
   * @ast method 
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:73
   */
  public void nameCheck() {
    super.nameCheck();
    // 8.8
    if(!hostType().name().equals(name()))
      error("constructor " + name() +" does not have the same name as the simple name of the host class " + hostType().name());
    
    // 8.8.2
    if(hostType().lookupConstructor(this) != this)
      error("constructor with signature " + signature() + " is multiply declared in type " + hostType().typeName());

    if(circularThisInvocation(this))
      error("The constructor " + signature() + " may not directly or indirectly invoke itself");
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:119
   */
  public void toString(StringBuffer s) {
    if(isDefaultConstructor()) return;
    s.append(indent());
    getModifiers().toString(s);
    s.append(name() + "(");
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
    
    s.append(" {");
    if(hasConstructorInvocation()) {
      getConstructorInvocation().toString(s);
    }
    for(int i = 0; i < getBlock().getNumStmt(); i++) {
      getBlock().getStmt(i).toString(s);
    }
    s.append(indent());
    s.append("}");
  }
  /**
   * @ast method 
   * @aspect TypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:424
   */
  public void typeCheck() {
    // 8.8.4 (8.4.4)
    TypeDecl exceptionType = typeThrowable();
    for(int i = 0; i < getNumException(); i++) {
      TypeDecl typeDecl = getException(i).type();
      if(!typeDecl.instanceOf(exceptionType))
        error(signature() + " throws non throwable type " + typeDecl.fullName());
    }
  }
  /**
   * @ast method 
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:138
   */
  protected void transformEnumConstructors() {
    // make sure constructor is private
    Modifiers newModifiers = new Modifiers(new List());
    for (int i = 0; i < getModifiers().getNumModifier(); ++i) {
      String modifier = getModifiers().getModifier(i).getID();
      if (modifier.equals("public") || modifier.equals("private") ||
        modifier.equals("protected"))
          continue;
      newModifiers.addModifier(new Modifier(modifier));
    }
    newModifiers.addModifier(new Modifier("private"));
    setModifiers(newModifiers);

    // add implicit super constructor access since we are traversing
    // without doing rewrites
    if(!hasConstructorInvocation()) {
      setConstructorInvocation(
        new ExprStmt(
          new SuperConstructorAccess("super", new List())
        )
      );
    }
    super.transformEnumConstructors();
    getParameterList().insertChild(
      new ParameterDeclaration(new TypeAccess("java.lang", "String"), "@p0"),
      0
    );
    getParameterList().insertChild(
      new ParameterDeclaration(new TypeAccess("int"), "@p1"),
      1
    );
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1283
   */
  public BodyDecl substitutedBodyDecl(Parameterization parTypeDecl) {
    ConstructorDecl c = new ConstructorDeclSubstituted(
      (Modifiers)getModifiers().fullCopy(),
      getID(),
      getParameterList().substitute(parTypeDecl),
      getExceptionList().substitute(parTypeDecl),
      new Opt(),
      new Block(),
      this
    );
    return c;
  }
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:720
   */
  
	private final ExitStmt uncheckedExceptionExit = new ExitStmt();
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:69
   */
  public boolean isStatic() { return false; }
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:70
   */
  public boolean hasBlock() { return true; }
  /**
   * @ast method 
   * @aspect Call
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Call.jadd:71
   */
  public boolean isNative() { return false; }
  /**
   * @ast method 
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:45
   */
  public boolean equals(Object o) {
		if(!(o instanceof ConstructorDecl))
			return false;
		ConstructorDecl that = (ConstructorDecl)o;
		return this.hostType().equals(that.hostType()) && this.signature().equals(that.signature());
	}
  /**
   * @ast method 
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:53
   */
  public Collection<Access> usesOfAllCopies() {
		Collection<Access> res = new HashSet<Access>(uses());
		for(ConstructorDecl cd : substitutedCopies())
			res.addAll(cd.uses());
		return res;
	}
  /**
   * @ast method 
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:66
   */
  public Collection<ConstructorDeclSubstituted> substitutedCopies() {
		Collection<ConstructorDeclSubstituted> res = new LinkedList<ConstructorDeclSubstituted>();
		if(!hostType().isGenericType())
			return res;
		GenericTypeDecl host = (GenericTypeDecl)hostType();
		for(int i=0;i<host.getNumTypeParameter();++i) {
			ParClassDecl pcd = (ParClassDecl)((ParTypeDecl)host.getTypeParameter(i));
			for(Object o : pcd.constructors())
				if(o instanceof ConstructorDeclSubstituted && ((ConstructorDeclSubstituted)o).sourceConstructorDecl() == this)
					res.add((ConstructorDeclSubstituted)o);
		}
		return res;
	}
  /**
   * @ast method 
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:91
   */
  public MethodDecl createFactoryMethod() {
		if(hostType().isEnumDecl())
			throw new RefactoringException("cannot introduce factory method for enum constructor");
		String name = "create" + hostType().name();
		List<ParameterDeclaration> parms = new List<ParameterDeclaration>();
		List<Expr> args = new List<Expr>();
		for(ParameterDeclaration pd : getParameters()) {
			parms.add((ParameterDeclaration)pd.lockedCopy());
			args.add(new VarAccess(pd.name()));
		}
		List<Access> exns = new List<Access>();
		for(Access acc : getExceptions())
			exns.add(acc.type().createLockedAccess());
		Block body = new Block(new List<Stmt>().add(new ReturnStmt(new ClassInstanceExpr(hostType().createLockedAccess(), args))));
		MethodDecl factoryMethod = new MethodDecl(new Modifiers("public", "static"), hostType().createLockedAccess(), name, parms, exns, new Opt<Block>(body));
		hostType().insertUnusedMethod(factoryMethod, 0);
		factoryMethod = factoryMethod.closeOverTypeVariables(factoryMethod);
		return factoryMethod;
	}
  /**
   * @ast method 
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:40
   */
  public ConstructorDecl refresh() { return refreshConstructor(); }
  /**
   * @ast method 
   * @aspect AccessibilityConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/AccessibilityConstraints.jrag:210
   */
  
	
	private Collection<AccessibilityConstraint> referencingAccessibilityConstraints = new HashSet<AccessibilityConstraint>();
  /**
   * @ast method 
   * @aspect ChangeAccessibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/ChangeAccessibility.jrag:36
   */
  public boolean isAnonymousType(){return false;}
  /**
   * @ast method 
   * @aspect IntroduceFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceFactory/IntroduceFactory.jrag:2
   */
  public MethodDecl introduceFactory(boolean protectConstructor) {
		int vis = protectConstructor ? VIS_PRIVATE : getVisibility();
		MethodDecl factory = createFactoryMethod();
		for(Access acc : usesOfAllCopies()) {
			if(acc instanceof ClassInstanceExpr) {
				ClassInstanceExpr cie = (ClassInstanceExpr)acc;
				if(cie.hasTypeDecl()) {
					vis = Math.max(vis, VIS_PROTECTED);
					continue;
				} else if(cie.hostBodyDecl() == factory) {
					continue;
				}
				cie.replaceWith(factory.createLockedAccess(cie.getArgs()));
			} else if(acc instanceof SuperConstructorAccess) {
				vis = Math.max(vis, VIS_PROTECTED);
			}
		}
		getModifiers().setVisibility(vis);
		return factory;
	}
  /**
   * @ast method 
   * @aspect IntroduceFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceFactory/IntroduceFactory.jrag:31
   */
  public MethodDecl doIntroduceFactory() {
		return doIntroduceFactory(true);
	}
  /**
   * @ast method 
   * @aspect IntroduceFactory
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/IntroduceFactory/IntroduceFactory.jrag:35
   */
  public MethodDecl doIntroduceFactory(boolean protectConstructor) {
		MethodDecl factory = introduceFactory(protectConstructor);
		programRoot().eliminate(LOCKED_NAMES);
		return factory;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:2
   */
  
	private boolean locked = false;
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:3
   */
  private void refined_LockedConstructor_ConstructorDecl_setLocked(boolean value) {
		locked = value;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:7
   */
  public ASTNode lockNames(Collection<String> endangered) {
		if(!locked && endangered.contains(name()))
			setLocked(true);
		return super.lockNames(endangered);
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:13
   */
  public void eliminateLockedNames() {
		unlock();
		super.eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:18
   */
  public ConstructorDecl unlock() {
		if(locked) {
			if(fromSource())
				setID(hostType().name());
			else
				throw new RefactoringException("cannot adjust constructor in bytecode");
		}
		setLocked(false);
		return this;
	}
  /**
   * @ast method 
   * @aspect LockedConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedConstructor.jrag:29
   */
  public boolean isLocked() { return locked; }
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:276
   */
  public String rtxfId() {
		return hostType().rtxfId() + "." + signature();
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
   * 
   */
  public ConstructorDecl() {
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
    setChild(new List(), 1);
    setChild(new List(), 2);
    setChild(new Opt(), 3);
  }
  /**
   * @ast method 
   * 
   */
  public ConstructorDecl(Modifiers p0, String p1, List<ParameterDeclaration> p2, List<Access> p3, Opt<Stmt> p4, Block p5) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
  }
  /**
   * @ast method 
   * 
   */
  public ConstructorDecl(Modifiers p0, beaver.Symbol p1, List<ParameterDeclaration> p2, List<Access> p3, Opt<Stmt> p4, Block p5) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
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
    return true;
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__ConstructorDecl_setID(String value) {
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
    setChild(list, 1);
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
    List<ParameterDeclaration> list = (List<ParameterDeclaration>)getChild(1);
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
    return (List<ParameterDeclaration>)getChildNoTransform(1);
  }
  /**
   * Replaces the Exception list.
   * @param list The new list node to be used as the Exception list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setExceptionList(List<Access> list) {
    setChild(list, 2);
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
    List<Access> list = (List<Access>)getChild(2);
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
    return (List<Access>)getChildNoTransform(2);
  }
  /**
   * Replaces the optional node for the ConstructorInvocation child. This is the {@code Opt} node containing the child ConstructorInvocation, not the actual child!
   * @param opt The new node to be used as the optional node for the ConstructorInvocation child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setConstructorInvocationOpt(Opt<Stmt> opt) {
    setChild(opt, 3);
  }
  /**
   * Check whether the optional ConstructorInvocation child exists.
   * @return {@code true} if the optional ConstructorInvocation child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasConstructorInvocation() {
    return getConstructorInvocationOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) ConstructorInvocation child.
   * @return The ConstructorInvocation child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt getConstructorInvocation() {
    return (Stmt)getConstructorInvocationOpt().getChild(0);
  }
  /**
   * Replaces the (optional) ConstructorInvocation child.
   * @param node The new node to be used as the ConstructorInvocation child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setConstructorInvocation(Stmt node) {
    getConstructorInvocationOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Stmt> getConstructorInvocationOpt() {
    return (Opt<Stmt>)getChild(3);
  }
  /**
   * Retrieves the optional node for child ConstructorInvocation. This is the {@code Opt} node containing the child ConstructorInvocation, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child ConstructorInvocation.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Stmt> getConstructorInvocationOptNoTransform() {
    return (Opt<Stmt>)getChildNoTransform(3);
  }
  /**
   * Replaces the Block child.
   * @param node The new node to replace the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBlock(Block node) {
    setChild(node, 4);
  }
  /**
   * Retrieves the Block child.
   * @return The current node used as the Block child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public Block getBlock() {
    return (Block)getChild(4);
  }
  /**
   * Retrieves the Block child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the Block child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public Block getBlockNoTransform() {
    return (Block)getChildNoTransform(4);
  }
  /**
   * @ast method 
   * @aspect UndoLocking
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoLocking.jrag:218
   */
    private void setLocked(final boolean value) {
		final boolean saved = locked;
		refined_LockedConstructor_ConstructorDecl_setLocked(value);
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, getID(), getID()) {
				
				@Override
				public void undo() {
					locked = saved;
				}

				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined_LockedConstructor_ConstructorDecl_setLocked(value);
				}
				
				@Override
				public String toString() {
					return "ConstructorDecl.setLocked";
				}
			});
		}
	}
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:861
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__ConstructorDecl_setID(oldValue);
				}
				@Override
				public String toString() {
					return "ConstructorDecl.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ConstructorDecl_setID(value);
				}
			});
		}
		refined__ConstructorDecl_setID(value);
	}
  /**
   * @ast method 
   * @aspect ConstructorDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:136
   */
  private boolean refined_ConstructorDecl_ConstructorDecl_moreSpecificThan_ConstructorDecl(ConstructorDecl m)
{
    for(int i = 0; i < getNumParameter(); i++) {
      if(!getParameter(i).type().instanceOf(m.getParameter(i).type()))
        return false;
    }
    return true;
  }
  protected java.util.Map accessibleFrom_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect AccessControl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:94
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
    if(!hostType().accessibleFrom(type))
      return false;
    else if(isPublic())
      return true;
    else if(isProtected()) {
      return true;
    }
    else if(isPrivate()) {
      return hostType().topLevelType() == type.topLevelType();
    }
    else
      return hostPackage().equals(type.hostPackage());
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:295
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
  private boolean isDAafter_compute(Variable v) {  return getBlock().isDAafter(v) && getBlock().checkReturnDA(v);  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:752
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
  private boolean isDUafter_compute(Variable v) {  return getBlock().isDUafter(v) && getBlock().checkReturnDU(v);  }
  protected java.util.Map throwsException_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:159
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
   * @apilevel internal
   */
  protected boolean name_computed = false;
  /**
   * @apilevel internal
   */
  protected String name_value;
  /**
   * @attribute syn
   * @aspect ConstructorDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:110
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String name() {
    if(name_computed) {
      return name_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    name_value = name_compute();
      if(isFinal && num == state().boundariesCrossed) name_computed = true;
    return name_value;
  }
  /**
   * @apilevel internal
   */
  private String name_compute() {  return getID();  }
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
   * @aspect ConstructorDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:112
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
      s.append(getParameter(i));
      if(i != getNumParameter() - 1)
        s.append(", ");
    }
    s.append(")");
    return s.toString();
  }
  protected java.util.Map sameSignature_ConstructorDecl_values;
  /**
   * @attribute syn
   * @aspect ConstructorDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:125
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameSignature(ConstructorDecl c) {
    Object _parameters = c;
    if(sameSignature_ConstructorDecl_values == null) sameSignature_ConstructorDecl_values = new java.util.HashMap(4);
    if(sameSignature_ConstructorDecl_values.containsKey(_parameters)) {
      return ((Boolean)sameSignature_ConstructorDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean sameSignature_ConstructorDecl_value = sameSignature_compute(c);
      if(isFinal && num == state().boundariesCrossed) sameSignature_ConstructorDecl_values.put(_parameters, Boolean.valueOf(sameSignature_ConstructorDecl_value));
    return sameSignature_ConstructorDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean sameSignature_compute(ConstructorDecl c) {
    if(!name().equals(c.name()))
      return false;
    if(c.getNumParameter() != getNumParameter())
      return false;
    for(int i = 0; i < getNumParameter(); i++)
      if(!c.getParameter(i).type().equals(getParameter(i).type()))
        return false;
    return true;
  }
  protected java.util.Map moreSpecificThan_ConstructorDecl_values;
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:168
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean moreSpecificThan(ConstructorDecl m) {
    Object _parameters = m;
    if(moreSpecificThan_ConstructorDecl_values == null) moreSpecificThan_ConstructorDecl_values = new java.util.HashMap(4);
    if(moreSpecificThan_ConstructorDecl_values.containsKey(_parameters)) {
      return ((Boolean)moreSpecificThan_ConstructorDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean moreSpecificThan_ConstructorDecl_value = moreSpecificThan_compute(m);
      if(isFinal && num == state().boundariesCrossed) moreSpecificThan_ConstructorDecl_values.put(_parameters, Boolean.valueOf(moreSpecificThan_ConstructorDecl_value));
    return moreSpecificThan_ConstructorDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean moreSpecificThan_compute(ConstructorDecl m) {
    if(!isVariableArity() && !m.isVariableArity())
      return refined_ConstructorDecl_ConstructorDecl_moreSpecificThan_ConstructorDecl(m);
    int num = Math.max(getNumParameter(), m.getNumParameter());
    for(int i = 0; i < num; i++) {
      TypeDecl t1 = i < getNumParameter() - 1 ? getParameter(i).type() : getParameter(getNumParameter()-1).type().componentType();
      TypeDecl t2 = i < m.getNumParameter() - 1 ? m.getParameter(i).type() : m.getParameter(m.getNumParameter()-1).type().componentType();
      if(!t1.instanceOf(t2))
        return false;
    }
    return true;
  }
  /**
   * @return true if this is an auto-generated default constructor
   * @attribute syn
   * @aspect ImplicitConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:182
   */
  public boolean isDefaultConstructor() {
    ASTNode$State state = state();
    try {  return isDefaultConstructor;  }
    finally {
    }
  }
  protected java.util.Map parameterDeclaration_String_values;
  /**
   * @attribute syn
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:105
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:217
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:235
   */
  public boolean isPublic() {
    ASTNode$State state = state();
    try {  return getModifiers().isPublic();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:236
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:237
   */
  public boolean isProtected() {
    ASTNode$State state = state();
    try {  return getModifiers().isProtected();  }
    finally {
    }
  }
  protected java.util.Map circularThisInvocation_ConstructorDecl_values;
  /**
   * @attribute syn
   * @aspect NameCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:88
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean circularThisInvocation(ConstructorDecl decl) {
    Object _parameters = decl;
    if(circularThisInvocation_ConstructorDecl_values == null) circularThisInvocation_ConstructorDecl_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(circularThisInvocation_ConstructorDecl_values.containsKey(_parameters)) {
      Object _o = circularThisInvocation_ConstructorDecl_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      circularThisInvocation_ConstructorDecl_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_circularThisInvocation_ConstructorDecl_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_circularThisInvocation_ConstructorDecl_value = circularThisInvocation_compute(decl);
        if (new_circularThisInvocation_ConstructorDecl_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_circularThisInvocation_ConstructorDecl_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        circularThisInvocation_ConstructorDecl_values.put(_parameters, new_circularThisInvocation_ConstructorDecl_value);
      }
      else {
        circularThisInvocation_ConstructorDecl_values.remove(_parameters);
      state.RESET_CYCLE = true;
      circularThisInvocation_compute(decl);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_circularThisInvocation_ConstructorDecl_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_circularThisInvocation_ConstructorDecl_value = circularThisInvocation_compute(decl);
      if (state.RESET_CYCLE) {
        circularThisInvocation_ConstructorDecl_values.remove(_parameters);
      }
      else if (new_circularThisInvocation_ConstructorDecl_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_circularThisInvocation_ConstructorDecl_value;
      }
      return new_circularThisInvocation_ConstructorDecl_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean circularThisInvocation_compute(ConstructorDecl decl) {
    if(hasConstructorInvocation()) {
      Expr e = ((ExprStmt)getConstructorInvocation()).getExpr();
      if(e instanceof ConstructorAccess) {
        ConstructorDecl constructorDecl = ((ConstructorAccess)e).decl();
        if(constructorDecl == decl)
          return true;
        return constructorDecl.circularThisInvocation(decl);
      }
    }
    return false;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:268
   */
  public TypeDecl type() {
    ASTNode$State state = state();
    try {  return unknownType();  }
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
    try {  return true;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:324
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
  protected boolean sourceConstructorDecl_computed = false;
  /**
   * @apilevel internal
   */
  protected ConstructorDecl sourceConstructorDecl_value;
  /**
   * @attribute syn
   * @aspect SourceDeclarations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1515
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorDecl sourceConstructorDecl() {
    if(sourceConstructorDecl_computed) {
      return sourceConstructorDecl_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    sourceConstructorDecl_value = sourceConstructorDecl_compute();
      if(isFinal && num == state().boundariesCrossed) sourceConstructorDecl_computed = true;
    return sourceConstructorDecl_value;
  }
  /**
   * @apilevel internal
   */
  private ConstructorDecl sourceConstructorDecl_compute() {  return this;  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:190
   */
  public boolean applicableBySubtyping(List argList) {
    ASTNode$State state = state();
    try {
    if(getNumParameter() != argList.getNumChild())
      return false;
    for(int i = 0; i < getNumParameter(); i++) {
      TypeDecl arg = ((Expr)argList.getChild(i)).type();
      if(!arg.instanceOf(getParameter(i).type()))
        return false;
    }
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:210
   */
  public boolean applicableByMethodInvocationConversion(List argList) {
    ASTNode$State state = state();
    try {
    if(getNumParameter() != argList.getNumChild())
      return false;
    for(int i = 0; i < getNumParameter(); i++) {
      TypeDecl arg = ((Expr)argList.getChild(i)).type();
      if(!arg.methodInvocationConversionTo(getParameter(i).type()))
        return false;
    }
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:231
   */
  public boolean applicableVariableArity(List argList) {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < getNumParameter() - 1; i++) {
      TypeDecl arg = ((Expr)argList.getChild(i)).type();
      if(!arg.methodInvocationConversionTo(getParameter(i).type()))
        return false;
    }
    for(int i = getNumParameter() - 1; i < argList.getNumChild(); i++) {
      TypeDecl arg = ((Expr)argList.getChild(i)).type();
      if(!arg.methodInvocationConversionTo(lastParameter().type().componentType()))
        return false;
    }
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:318
   */
  public boolean potentiallyApplicable(List argList) {
    ASTNode$State state = state();
    try {
    if(isVariableArity() && !(argList.getNumChild() >= arity()-1))
      return false;
    if(!isVariableArity() && !(arity() == argList.getNumChild()))
      return false;
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:325
   */
  public int arity() {
    ASTNode$State state = state();
    try {  return getNumParameter();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect VariableArityParameters
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:34
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:63
   */
  public ParameterDeclaration lastParameter() {
    ASTNode$State state = state();
    try {  return getParameter(getNumParameter() - 1);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:78
   */
  public boolean isPure() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:86
   */
  public boolean invokesSuperConstructor() {
    ASTNode$State state = state();
    try {  return ((ExprStmt)getConstructorInvocation()).getExpr() instanceof SuperConstructorAccess;  }
    finally {
    }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:722
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
   * @apilevel internal
   */
  protected boolean getConstructorAccess_computed = false;
  /**
   * @apilevel internal
   */
  protected ConstructorAccess getConstructorAccess_value;
  /**
   * @attribute syn
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:2
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorAccess getConstructorAccess() {
    if(getConstructorAccess_computed) {
      return getConstructorAccess_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    getConstructorAccess_value = getConstructorAccess_compute();
      if(isFinal && num == state().boundariesCrossed) getConstructorAccess_computed = true;
    return getConstructorAccess_value;
  }
  /**
   * @apilevel internal
   */
  private ConstructorAccess getConstructorAccess_compute() {  return (ConstructorAccess)((ExprStmt)getConstructorInvocation()).getExpr();  }
  /**
   * @attribute syn
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:5
   */
  public boolean isChained() {
    ASTNode$State state = state();
    try {  return getConstructorAccess() != null && !(getConstructorAccess() instanceof SuperConstructorAccess);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:28
   */
  public boolean isRawConstructor() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:24
   */
  public ConstructorDecl refreshConstructor() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isImplicitConstructor_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isImplicitConstructor_value;
  /**
   * @attribute syn
   * @aspect TypeExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeExt.jrag:57
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isImplicitConstructor() {
    if(isImplicitConstructor_computed) {
      return isImplicitConstructor_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isImplicitConstructor_value = isImplicitConstructor_compute();
      if(isFinal && num == state().boundariesCrossed) isImplicitConstructor_computed = true;
    return isImplicitConstructor_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isImplicitConstructor_compute() {  return getStart() == 0 && invokesSuperConstructor() && getBlock().getNumStmt() == 0;  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:185
   */
  public String describeConstraintVariable() {
    ASTNode$State state = state();
    try {  return "Decl(" + signature() + ")";  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:50
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
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:267
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl unknownType() {
    ASTNode$State state = state();
    TypeDecl unknownType_value = getParent().Define_TypeDecl_unknownType(this, null);
    return unknownType_value;
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:298
   * @apilevel internal
   */
  public boolean Define_boolean_isDAbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getBlockNoTransform()) {
      return hasConstructorInvocation() ? getConstructorInvocation().isDAafter(v) : isDAbefore(v);
    }
    else {      return getParent().Define_boolean_isDAbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:755
   * @apilevel internal
   */
  public boolean Define_boolean_isDUbefore(ASTNode caller, ASTNode child, Variable v) {
    if(caller == getBlockNoTransform()) {
      return hasConstructorInvocation() ? getConstructorInvocation().isDUafter(v) : isDUbefore(v);
    }
    else {      return getParent().Define_boolean_isDUbefore(this, caller, v);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:156
   * @apilevel internal
   */
  public boolean Define_boolean_handlesException(ASTNode caller, ASTNode child, TypeDecl exceptionType) {
    if(caller == getConstructorInvocationOptNoTransform()) {
      return throwsException(exceptionType) || handlesException(exceptionType);
    }
    else if(caller == getBlockNoTransform()) {
      return throwsException(exceptionType) || handlesException(exceptionType);
    }
    else {      return getParent().Define_boolean_handlesException(this, caller, exceptionType);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:45
   * @apilevel internal
   */
  public Collection Define_Collection_lookupMethod(ASTNode caller, ASTNode child, String name) {
    if(caller == getConstructorInvocationOptNoTransform()){
    Collection c = new ArrayList();
    for(Iterator iter = lookupMethod(name).iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(!hostType().memberMethods(name).contains(m) || m.isStatic())
        c.add(m);
    }
    return c;
  }
    else {      return getParent().Define_Collection_lookupMethod(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:64
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupVariable(ASTNode caller, ASTNode child, String name) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return parameterDeclaration(name);
  }
    else if(caller == getConstructorInvocationOptNoTransform()){
    SimpleSet set = parameterDeclaration(name);
    if(!set.isEmpty()) return set;
    for(Iterator iter = lookupVariable(name).iterator(); iter.hasNext(); ) {
      Variable v = (Variable)iter.next();
      if(!hostType().memberFields(name).contains(v) || v.isStatic())
        set = set.add(v);
    }
    return set;
  }
    else if(caller == getBlockNoTransform()){
    SimpleSet set = parameterDeclaration(name);
    if(!set.isEmpty()) return set;
    return lookupVariable(name);
  }
    else {      return getParent().Define_SimpleSet_lookupVariable(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:282
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:283
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:284
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/NameCheck.jrag:247
   * @apilevel internal
   */
  public ASTNode Define_ASTNode_enclosingBlock(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return this;
    }
    else {      return getParent().Define_ASTNode_enclosingBlock(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:117
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getConstructorInvocationOptNoTransform()) {
      return NameType.EXPRESSION_NAME;
    }
    else if(caller == getExceptionListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else {      return getParent().Define_NameType_nameType(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeCheck.jrag:517
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_enclosingInstance(ASTNode caller, ASTNode child) {
    if(caller == getConstructorInvocationOptNoTransform()) {
      return unknownType();
    }
    else {      return getParent().Define_TypeDecl_enclosingInstance(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:132
   * @apilevel internal
   */
  public boolean Define_boolean_inExplicitConstructorInvocation(ASTNode caller, ASTNode child) {
    if(caller == getConstructorInvocationOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_inExplicitConstructorInvocation(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:144
   * @apilevel internal
   */
  public boolean Define_boolean_inStaticContext(ASTNode caller, ASTNode child) {
    if(caller == getConstructorInvocationOptNoTransform()) {
      return false;
    }
    else if(caller == getBlockNoTransform()) {
      return false;
    }
    else {      return getParent().Define_boolean_inStaticContext(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:32
   * @apilevel internal
   */
  public boolean Define_boolean_reachable(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return !hasConstructorInvocation() ? true : getConstructorInvocation().canCompleteNormally();
    }
    else if(caller == getConstructorInvocationOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_reachable(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:58
   * @apilevel internal
   */
  public boolean Define_boolean_isMethodParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return false;
  }
    else {      return getParent().Define_boolean_isMethodParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:59
   * @apilevel internal
   */
  public boolean Define_boolean_isConstructorParameter(ASTNode caller, ASTNode child) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return true;
  }
    else {      return getParent().Define_boolean_isConstructorParameter(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/VariableDeclaration.jrag:60
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:89
   * @apilevel internal
   */
  public boolean Define_boolean_mayUseAnnotationTarget(ASTNode caller, ASTNode child, String name) {
    if(caller == getModifiersNoTransform()) {
      return name.equals("CONSTRUCTOR");
    }
    else {      return getParent().Define_boolean_mayUseAnnotationTarget(this, caller, name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/VariableArityParameters.jrag:21
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:84
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__following(ASTNode caller, ASTNode child) {
    if(caller == getBlockNoTransform()) {
      return SmallSet.<CFGNode>singleton(exit());
    }
    else if(caller == getConstructorInvocationOptNoTransform()){
		if(invokesSuperConstructor()) {
			BodyDecl bd = hostType().getFieldOrInitializerAfter(0, false);
			if(bd != null)
				return SmallSet.<CFGNode>singleton(bd.entry());
		}
		return SmallSet.<CFGNode>singleton(getBlock().first());
	}
    else if(caller == getParameterListNoTransform())  { 
    int i = caller.getIndexOfChild(child);
    {
		if(i + 1 < getNumParameter())
			return SmallSet.<CFGNode>singleton(getParameter(i + 1).first());
		return SmallSet.<CFGNode>singleton(getConstructorInvocation().first());
	}
  }
    else if(caller == entry_value){
{
		if(getNumParameter() > 0)
			return SmallSet.<CFGNode>singleton(getParameter(0).first());
		return SmallSet.<CFGNode>singleton(getConstructorInvocation().first());
	}
    }
    else {      return getParent().Define_SmallSet_CFGNode__following(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:709
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
		return SmallSet.empty();
	}
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:716
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(uncheckedExceptionExit());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:30
   * @apilevel internal
   */
  public boolean Define_boolean_inInextractiblePosition(ASTNode caller, ASTNode child) {
    if(caller == getConstructorInvocationOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_inInextractiblePosition(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:6
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ParameterExt.jrag:37
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:102
   * @apilevel internal
   */
  public MethodAccessInfo Define_MethodAccessInfo_accessMethod(ASTNode caller, ASTNode child, MethodDecl md) {
    if(caller == getConstructorInvocationOptNoTransform()){
		MethodAccessInfo acc = hostType().accessMemberMethod(md);
		if(acc != null && md.isStatic()) return acc;
		if(hostType().isNestedType()) {
			acc = hostType().accessMethod(md);
			if(acc != null)
				return acc.moveInto(hostType());
		}
		return null;
	}
    else {      return getParent().Define_MethodAccessInfo_accessMethod(this, caller, md);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:176
   * @apilevel internal
   */
  public SymbolicVarAccess Define_SymbolicVarAccess_accessVariable(ASTNode caller, ASTNode child, Variable decl) {
    if(caller == getParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return accessParameter(decl);
  }
    else if(caller == getConstructorInvocationOptNoTransform()){
		SymbolicVarAccess acc = accessParameter(decl);
		if(!acc.isUnknownVarAccess()) return acc;
		if(hostType().memberFields(decl.name()).contains(decl) && !decl.isStatic())
			return unknownVarAccess();
		return accessVariable(decl).moveInto(this);
	}
    else if(caller == getBlockNoTransform()){
		SymbolicVarAccess acc = accessParameter(decl);
		if(!acc.isUnknownVarAccess()) return acc;
		return accessVariable(decl).moveInto(this);
	}
    else {      return getParent().Define_SymbolicVarAccess_accessVariable(this, caller, decl);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/VarNesting.jrag:25
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/DeleteStmt.jrag:6
   * @apilevel internal
   */
  public boolean Define_boolean_delete(ASTNode caller, ASTNode child) {
    if(caller == getConstructorInvocationOptNoTransform()){ setConstructorInvocationOpt(new Opt()); return true; }
    else {      return getParent().Define_boolean_delete(this, caller);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:53
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtBefore(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getBlockNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else if(caller == getConstructorInvocationOptNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else {      return getParent().Define_Stmt_insertStmtBefore(this, caller, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/StmtManipulation/InsertEmptyStmt.jrag:114
   * @apilevel internal
   */
  public Stmt Define_Stmt_insertStmtAfter(ASTNode caller, ASTNode child, Stmt s) {
    if(caller == getBlockNoTransform()){ throw new RefactoringException("cannot insert statement here"); }
    else if(caller == getConstructorInvocationOptNoTransform()){
		getBlock().insertChild(s, 0);
		return s;
	}
    else {      return getParent().Define_Stmt_insertStmtAfter(this, caller, s);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    // Declared in /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag at line 218
    if(!hasConstructorInvocation() && !hostType().isObject()) {
      state().duringImplicitConstructor++;
      ASTNode result = rewriteRule0();
      state().duringImplicitConstructor--;
      return result;
    }

    return super.rewriteTo();
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:218
   * @apilevel internal
   */  private ConstructorDecl rewriteRule0() {
{
      setConstructorInvocation(
        new ExprStmt(
          new SuperConstructorAccess("super", new List())
          )
        );
      return this;
    }  }
  /**
   * @apilevel internal
   */
  protected boolean ConstructorDecl_uses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<Access> ConstructorDecl_uses_value;
  /**
   * @attribute coll
   * @aspect Uses
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<Access> uses() {
    if(ConstructorDecl_uses_computed) {
      return ConstructorDecl_uses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    ConstructorDecl_uses_value = uses_compute();
      if(isFinal && num == state().boundariesCrossed) ConstructorDecl_uses_computed = true;
    return ConstructorDecl_uses_value;
  }
  java.util.Set ConstructorDecl_uses_contributors;
  public java.util.Set ConstructorDecl_uses_contributors() {
    if(ConstructorDecl_uses_contributors == null) ConstructorDecl_uses_contributors  = new ASTNode$State.IdentityHashSet(4);
    return ConstructorDecl_uses_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<Access> uses_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_ConstructorDecl_uses();
    ConstructorDecl_uses_value = new HashSet<Access>();
    if(ConstructorDecl_uses_contributors != null)
    for(java.util.Iterator iter = ConstructorDecl_uses_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_ConstructorDecl_ConstructorDecl_uses(ConstructorDecl_uses_value);
    }
    return ConstructorDecl_uses_value;
  }

  protected void collect_contributors_Program_accessibilityConstraints() {
    /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:165
   */
    if(hostType().isEnumDecl()) {
    {
      Program ref = (Program)(programRoot());
      if(ref != null)
        ref.Program_accessibilityConstraints_contributors().add(this);
      }    }
    super.collect_contributors_Program_accessibilityConstraints();
  }
  protected void contributeTo_Program_Program_accessibilityConstraints(Collection<AccessibilityConstraint> collection) {
    super.contributeTo_Program_Program_accessibilityConstraints(collection);
    if(hostType().isEnumDecl())
      collection.addAll(Collections.singleton(new AccessibilityConstraint(this, this, Operator.EQ, AccessModifierConstant.PRIVATE)));
  }

}
