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
import tests.jdolly.ConditionsMoveMethod;
import tests.jdolly.Conditions_;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @production ClassDecl : {@link ReferenceType} ::= <span class="component">{@link Modifiers}</span> <span class="component">&lt;ID:String&gt;</span> <span class="component">[SuperClassAccess:{@link Access}]</span> <span class="component">Implements:{@link Access}*</span> <span class="component">{@link BodyDecl}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:66
 */
public class ClassDecl extends ReferenceType implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    interfacesMethodsSignatureMap_computed = false;
    interfacesMethodsSignatureMap_value = null;
    methodsSignatureMap_computed = false;
    methodsSignatureMap_value = null;
    ancestorMethods_String_values = null;
    memberTypes_String_values = null;
    memberFieldsMap_computed = false;
    memberFieldsMap_value = null;
    memberFields_String_values = null;
    unimplementedMethods_computed = false;
    unimplementedMethods_value = null;
    hasAbstract_computed = false;
    castingConversionTo_TypeDecl_values = null;
    isString_computed = false;
    isObject_computed = false;
    instanceOf_TypeDecl_values = null;
    isCircular_visited = -1;
    isCircular_computed = false;
    isCircular_initialized = false;
    implementedInterfaces_computed = false;
    implementedInterfaces_value = null;
    subtype_TypeDecl_values = null;
    descendantMethods_String_values = null;
    supertypes_computed = false;
    supertypes_value = null;
    superinterfaces_computed = false;
    superinterfaces_value = null;
    instancesAreConstructed_computed = false;
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
  public ClassDecl clone() throws CloneNotSupportedException {
    ClassDecl node = (ClassDecl)super.clone();
    node.interfacesMethodsSignatureMap_computed = false;
    node.interfacesMethodsSignatureMap_value = null;
    node.methodsSignatureMap_computed = false;
    node.methodsSignatureMap_value = null;
    node.ancestorMethods_String_values = null;
    node.memberTypes_String_values = null;
    node.memberFieldsMap_computed = false;
    node.memberFieldsMap_value = null;
    node.memberFields_String_values = null;
    node.unimplementedMethods_computed = false;
    node.unimplementedMethods_value = null;
    node.hasAbstract_computed = false;
    node.castingConversionTo_TypeDecl_values = null;
    node.isString_computed = false;
    node.isObject_computed = false;
    node.instanceOf_TypeDecl_values = null;
    node.isCircular_visited = -1;
    node.isCircular_computed = false;
    node.isCircular_initialized = false;
    node.implementedInterfaces_computed = false;
    node.implementedInterfaces_value = null;
    node.subtype_TypeDecl_values = null;
    node.descendantMethods_String_values = null;
    node.supertypes_computed = false;
    node.supertypes_value = null;
    node.superinterfaces_computed = false;
    node.superinterfaces_value = null;
    node.instancesAreConstructed_computed = false;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ClassDecl copy() {
    try {
      ClassDecl node = (ClassDecl) clone();
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
  public ClassDecl fullCopy() {
    ClassDecl tree = (ClassDecl) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/AccessControl.jrag:147
   */
  public void accessControl() {
    super.accessControl();
    
    // 8.1.1.2 final Classes
    TypeDecl typeDecl = hasSuperclass() ? superclass() : null;
    if(typeDecl != null && !typeDecl.accessibleFromExtend(this))
    //if(typeDecl != null && !isCircular() && !typeDecl.accessibleFrom(this))
      error("class " + fullName() + " may not extend non accessible type " + typeDecl.fullName());

    if(hasSuperclass() && !superclass().accessibleFrom(this))
      error("a superclass must be accessible which " + superclass().name() + " is not");

    // 8.1.4
    for(int i = 0; i < getNumImplements(); i++) {
      TypeDecl decl = getImplements(i).type();
      if(!decl.isCircular() && !decl.accessibleFrom(this))
        error("class " + fullName() + " can not implement non accessible type " + decl.fullName());
    }
  }
  /**
   * @ast method 
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:106
   */
  public void exceptionHandling() {
    constructors();
    super.exceptionHandling();
  }
  /**
   * @ast method 
   * @aspect MemberMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:265
   */
  public Iterator interfacesMethodsIterator() {
    return new Iterator() {
      private Iterator outer = interfacesMethodsSignatureMap().values().iterator();
      private Iterator inner = null;
      public boolean hasNext() {
        if((inner == null || !inner.hasNext()) && outer.hasNext())
          inner = ((SimpleSet)outer.next()).iterator();
        return inner == null ? false : inner.hasNext();
      }
      public Object next() {
        return inner.next();
      }
      public void remove() { throw new UnsupportedOperationException(); }
    };
  }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:96
   */
  public void checkModifiers() {
    super.checkModifiers();
    // 8.1.1.2 final Classes
    TypeDecl typeDecl = hasSuperclass() ? superclass() : null;
    if(typeDecl != null && typeDecl.isFinal()) {
      error("class " + fullName() + " may not extend final class " + typeDecl.fullName());
    }

  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:70
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    getModifiers().toString(s);
    s.append("class " + name());
    if(hasSuperClassAccess()) {
      s.append(" extends ");
      getSuperClassAccess().toString(s);
    }
    if(getNumImplements() > 0) {
      s.append(" implements ");
      getImplements(0).toString(s);
      for(int i = 1; i < getNumImplements(); i++) {
        s.append(", ");
        getImplements(i).toString(s);
      }
    }
    ppBodyDecls(s);
  }
  /**
   * @ast method 
   * @aspect SuperClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:596
   */
  public boolean hasSuperclass() {
    return !isObject();
  }
  /**
   * @ast method 
   * @aspect SuperClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:600
   */
  public ClassDecl superclass() {
    if(isObject())
      return null;
    if(hasSuperClassAccess() && !isCircular() && getSuperClassAccess().type().isClassDecl())
      return (ClassDecl)getSuperClassAccess().type();
    return (ClassDecl)typeObject();
  }
  /**
   * @ast method 
   * @aspect SuperClasses
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:615
   */
  public Iterator interfacesIterator() {
    return new Iterator() {
      public boolean hasNext() {
        computeNextCurrent();
        return current != null;
      }
      public Object next() {
        return current;
      }
      public void remove() {
        throw new UnsupportedOperationException();
      }
      private int index = 0;
      private TypeDecl current = null;
      private void computeNextCurrent() {
        current = null;
        if(isObject() || isCircular())
          return;
        while(index < getNumImplements()) {
          TypeDecl typeDecl = getImplements(index++).type();
          if(!typeDecl.isCircular() && typeDecl.isInterfaceDecl()) {
            current = typeDecl;
            return;
          }
        }
      }
    };
  }
  /**
   * @ast method 
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:239
   */
  public void nameCheck() {
    super.nameCheck();
    if(hasSuperClassAccess() && !getSuperClassAccess().type().isClassDecl())
      error("class may only inherit a class and not " + getSuperClassAccess().type().typeName());
    if(isObject() && hasSuperClassAccess())
      error("class Object may not have superclass");
    if(isObject() && getNumImplements() != 0)
      error("class Object may not implement interfaces");
    
    // 8.1.3
    if(isCircular())
      error("circular inheritance dependency in " + typeName()); 
      
    // 8.1.4
    HashSet set = new HashSet();
    for(int i = 0; i < getNumImplements(); i++) {
      TypeDecl decl = getImplements(i).type();
      if(!decl.isInterfaceDecl() && !decl.isUnknown())
        error("type " + fullName() + " tries to implement non interface type " + decl.fullName());
      if(set.contains(decl))
        error("type " + decl.fullName() + " mentionened multiple times in implements clause");
      set.add(decl);
    }

    for(Iterator iter = interfacesMethodsIterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(localMethodsSignature(m.signature()).isEmpty()) {
        SimpleSet s = superclass().methodsSignature(m.signature());
        for(Iterator i2 = s.iterator(); i2.hasNext(); ) {
          MethodDecl n = (MethodDecl)i2.next();
          if(n.accessibleFrom(this)) {
            interfaceMethodCompatibleWithInherited(m, n);
          }
        }
        if(s.isEmpty()) {
          for(Iterator i2 = interfacesMethodsSignature(m.signature()).iterator(); i2.hasNext(); ) {
            MethodDecl n = (MethodDecl)i2.next();
            if(!n.mayOverrideReturn(m) && !m.mayOverrideReturn(n))
              error("Xthe return type of method " + m.signature() + " in " + m.hostType().typeName() + 
                  " does not match the return type of method " + n.signature() + " in " + 
                  n.hostType().typeName() + " and may thus not be overriden");
          }
        }
      }
    }
  }
  /**
   * @ast method 
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:286
   */
  private void interfaceMethodCompatibleWithInherited(MethodDecl m, MethodDecl n) {
    if(n.isStatic())
      error("Xa static method may not hide an instance method");
    if(!n.isAbstract() && !n.isPublic())
      error("Xoverriding access modifier error for " + m.signature() + " in " + m.hostType().typeName() + " and " + n.hostType().typeName());
    if(!n.mayOverrideReturn(m) && !m.mayOverrideReturn(m))
      error("Xthe return type of method " + m.signature() + " in " + m.hostType().typeName() + 
            " does not match the return type of method " + n.signature() + " in " + 
            n.hostType().typeName() + " and may thus not be overriden");
    if(!n.isAbstract()) {
      // n implements and overrides method m in the interface
      // may not throw more checked exceptions
      for(int i = 0; i < n.getNumException(); i++) {
        Access e = n.getException(i);
        boolean found = false;
        for(int j = 0; !found && j < m.getNumException(); j++) {
          if(e.type().instanceOf(m.getException(j).type()))
            found = true;
        }
        if(!found && e.type().isUncheckedException())
          error("X" + n.signature() + " in " + n.hostType().typeName() + " may not throw more checked exceptions than overridden method " +
           m.signature() + " in " + m.hostType().typeName());
      }
    }
  }
  /**
   * @ast method 
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:187
   */
  public TypeDecl makeGeneric(Signatures.ClassSignature s) {
    if(s.hasFormalTypeParameters()) {
      ASTNode node = getParent();
      int index = node.getIndexOfChild(this);
      node.setChild(
          new GenericClassDecl(
            getModifiersNoTransform(),
            getID(),
            s.hasSuperclassSignature() ? new Opt(s.superclassSignature()) : getSuperClassAccessOptNoTransform(),
            s.hasSuperinterfaceSignature() ? s.superinterfaceSignature() : getImplementsListNoTransform(),
            getBodyDeclListNoTransform(),
            s.typeParameters()
          ),
          index
      );
      return (TypeDecl)node.getChildNoTransform(index);
    }
    else {
      if(s.hasSuperclassSignature())
        setSuperClassAccessOpt(new Opt(s.superclassSignature()));
      if(s.hasSuperinterfaceSignature())
        setImplementsList(s.superinterfaceSignature());
      return this;
    }
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1313
   */
  public ClassDecl substitutedClassDecl(Parameterization parTypeDecl) {
    ClassDecl c = new ClassDeclSubstituted(
      (Modifiers)getModifiers().fullCopy(),
      getID(),
      hasSuperClassAccess() ? new Opt(getSuperClassAccess().type().substitute(parTypeDecl)) : new Opt(),
      getImplementsList().substitute(parTypeDecl),
     // ES:  new List(), 
      this
    );
    return c;
  }
  /**
   * @ast method 
   * @aspect Inheritance
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Inheritance.jrag:14
   */
  public Iterable<InterfaceDecl> interfacesSourceDecls() {
		Collection<InterfaceDecl> res = new LinkedList<InterfaceDecl>();
		for(Iterator<InterfaceDecl> iter=interfacesIterator();iter.hasNext();)
			res.add((InterfaceDecl)iter.next().sourceTypeDecl());
		return res;
	}
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:207
   */
  protected void collectSourceClassDecls(Collection<ClassDecl> res) {
		res.add(this);
		super.collectSourceClassDecls(res);
	}
  /**
   * @ast method 
   * @aspect TypeExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeExt.jrag:9
   */
  public MemberClassDecl asMemberTypeDecl() { return new MemberClassDecl(this); }
  /**
   * @ast method 
   * @aspect TypeExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeExt.jrag:50
   */
  public void inheritVisibilityToDefaultConstructor() { setVisibilityOfImplicitConstructor(getVisibility()); }
  /**
   * @ast method 
   * @aspect TypeExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeExt.jrag:51
   */
  public void setVisibilityOfImplicitConstructor(int visibility) {
		for(ConstructorDecl cd : (Collection<ConstructorDecl>)constructors())
			if(cd.isImplicitConstructor())
				cd.setVisibility(visibility);
	}
  /**
   * @ast method 
   * @aspect Visibility
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Visibility.jrag:77
   */
  public void setVisibility(int v) {
		getModifiers().setVisibility(v);
		setVisibilityOfImplicitConstructor(v);
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:6
   */
  public void doExtractClass(Collection<FieldDeclaration> fds, String newClassName, String newFieldName, boolean encapsulate, boolean toplevel) {
		extractClass(fds, newClassName, newFieldName, encapsulate, toplevel);
		programRoot().eliminate(LOCKED_NAMES, LOCKED_DATAFLOW);
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:11
   */
  public void extractClass(Collection<FieldDeclaration> fds_coll, String newClassName, String newFieldName, boolean encapsulate, boolean toplevel) {
		// fds_coll Collection -> List, we need order
		java.util.List<FieldDeclaration> fds = new ArrayList<FieldDeclaration>(fds_coll);
		Collections.sort(fds, new Comparator<FieldDeclaration>() {
			//@Override
			public int compare(FieldDeclaration o1, FieldDeclaration o2) {
				return o1.getChildIndex() - o2.getChildIndex();
			}
		});
		if(!isFieldsInIncreasingIndexOrder(fds))
			throw new RefactoringException("fields are expected to be in increasing index order");
		
		// create struct
		int maxvis = maxVisibility(fds);
		Modifiers struct_mods = new Modifiers("static");
		struct_mods.setVisibility(toplevel ? VIS_PUBLIC : maxvis);
		ClassDecl struct = new ClassDecl(struct_mods, newClassName, new Opt<Access>(), new List<Access>(), new List<BodyDecl>());
		
		// insert field
		int first_index = fds.iterator().next().getChildIndex();
		FieldDeclaration wrapperField = createNewMemberField(maxvis, struct, newFieldName, first_index);
		MemberTypeDecl mtd = insertUnusedType(struct, wrapperField.getChildIndex());
		
		programRoot().flushCaches();
		
		// move fields into the struct and leave initializers
		int i = 0;
		java.util.Map<FieldDeclaration, InstanceInitializer> inits = new LinkedHashMap<FieldDeclaration, InstanceInitializer>();
		for (FieldDeclaration fd : fds) {
			if (fd.getModifiers().isStatic())
				throw new RefactoringException("cannot extract field "+fd.name());
			InstanceInitializer init = wrapField(fd, wrapperField, struct, i++); 
			if (init != null)
				inits.put(fd, init);
		}
		
		programRoot().flushCaches();
		programRoot().eliminate(LOCKED_NAMES);

		// try to move initializers one by one after wrapper field
		i = 0;
		for (InstanceInitializer init : inits.values()) {
			int old_idx = init.getChildIndex();
			ASTUndoCheckPoint cp = Program.createASTUndoCheckPoint();
			try {
				init.lockDataFlow();
				init.lockAllNames();
				this.removeBodyDecl(init);
				this.getBodyDeclList().insertChild(init, wrapperField.getChildIndex() + i + 1);
				flushCaches();
				init.unlockDataFlow();
				init.eliminateLockedNames();
			} catch (RefactoringException re) {
				// no luck
				// move init back and break
//				this.removeBodyDecl(init);
//				this.getBodyDeclList().insertChild(init, old_idx);
//				flushCaches();
//				init.unlockDataFlow();
//				init.eliminateLockedNames();
				programRoot().undoUntil(cp);
				break;
			}
			i++;
			hostType().flushCaches();
		}
		
		if (encapsulate) {
			struct.createInitContructor();
		}
		
		if (inits.size() > 0 &&
				allInitializersAreInOrderAfterWrapperField(inits, wrapperField) &&
				!initializerEvaluationOrderMatters(inits, wrapperField)) {
			
			// modify contructor and calls
			if (!encapsulate) {
				struct.createInitContructor();
			}

			for (InstanceInitializer init : inits.values()) {
				init.lockDataFlow();
				init.lockAllNames();
			}
			// pass init expr in constructor, and default values for others
			for (FieldDeclaration fd : fds) {

				// get init or pass default value
				Expr init_exp = null;
				if (inits.get(fd) != null) {
					init_exp = ((AssignSimpleExpr)((ExprStmt)inits.get(fd).getBlock().getStmt(0)).getExpr()).getSource();
					this.removeBodyDecl(inits.get(fd));
				} else if (fd.type() instanceof BooleanType)
					init_exp = new BooleanLiteral(false);
				else if (fd.type() instanceof CharType)
					init_exp = new CharacterLiteral(new Character((char)0).toString());
				else if (fd.type() instanceof NumericType)
					init_exp = new IntegerLiteral(0);
				else if (fd.type() instanceof ReferenceType)
					init_exp = new NullLiteral("null");
				else
					throw new RefactoringException("type default value not accounted for");

				((ClassInstanceExpr)wrapperField.getInit()).getArgList().add(init_exp);
				
			}
			flushCaches();
			unlockDataFlow();
			eliminateLockedNames();
		} else {
			
			// try to merge initializer blocks to minimize clutter
			
			InstanceInitializer last = null;
			for (InstanceInitializer init : inits.values()) {
				if (last == null) {
					last = init;
					continue;
				}
				if (last.getChildIndex() == init.getChildIndex() - 1) {
					// merge
					last.getBlock().addStmt(init.getBlock().getStmt(0));
					this.removeBodyDecl(init);
				} else {
					last = init;
				}
			}
		}
		

		// struct settings
		if(toplevel) {
			for(FieldDeclaration fd : fds)
				fd.getModifiers().setVisibility(VIS_PUBLIC);
			mtd.moveToToplevel(true, null, true);
		}
		if(encapsulate)
			for(FieldDeclaration fd : fds)
				fd.selfEncapsulate();
		
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:153
   */
  private void createInitContructor() {
		Modifiers m = new Modifiers();
		m.setVisibility(getVisibility());
		ConstructorDecl cd = new ConstructorDecl((Modifiers) m.fullCopyAndDetach(), name(), new List<ParameterDeclaration>(), new List<Access>(), new Opt<Stmt>(), new Block());
		this.addBodyDecl(cd);
//		ConstructorDecl cd_def = new ConstructorDecl(m.fullCopyAndDetach(), name(), new List<ParameterDeclaration>(), new List<Access>(), new Opt<Stmt>(), new Block());
//		this.addBodyDecl(cd_def);
		for (BodyDecl bd : this.getBodyDecls()) {
			if (bd instanceof FieldDeclaration && !((FieldDeclaration)bd).isStatic()) {
				FieldDeclaration fd = (FieldDeclaration)bd;
				ParameterDeclaration pd = new ParameterDeclaration(new Modifiers(), fd.type().createLockedAccess(), fd.name()); 
				cd.addParameter(pd);
				cd.getBlock().addStmt(AssignExpr.asStmt(fd.createLockedAccess(), pd.createLockedAccess()));
			}
		}
		eliminateLockedNames();
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:171
   */
  private boolean initializerEvaluationOrderMatters(java.util.Map<FieldDeclaration, InstanceInitializer> inits, FieldDeclaration wrapperField) {
		// if we can invert order of inits then the evaluation order does not matter
		assert(allInitializersAreInOrderAfterWrapperField(inits, wrapperField));
		boolean ret = false;
		try {
			for (InstanceInitializer init : inits.values()) {
				init.lockDataFlow();
			}
			
			// invert inits order
			for (InstanceInitializer init : inits.values()) {
				this.removeBodyDecl(init);
				this.getBodyDeclList().insertChild(init, wrapperField.getChildIndex() + 1);
			}
			
			flushCaches();
			/*for (Pair<FieldDeclaration, InstanceInitializer> fdii : inits) {
				InstanceInitializer init = fdii.snd();
				init.unlockDataFlow();;
				init.eliminateLockedNames();
			}*/
			// as unlocking of names, unfortunately, tends to replace nodes in AST we unlock _all_ the dataflow first
			unlockDataFlow();
			
		} catch (RefactoringException e) {
			ret = true;
		} finally {
			// restore inits order
			int i = 0;
			for (InstanceInitializer init : inits.values()) {
				this.removeBodyDecl(init);
				this.getBodyDeclList().insertChild(init, wrapperField.getChildIndex() + i + 1);
				i++;
			}
			
			flushCaches();
			/*for (Pair<FieldDeclaration, InstanceInitializer> fdii : inits) {
				InstanceInitializer init = fdii.snd();
				init.unlockDataFlow();
				init.eliminateLockedNames();
			}*/
			// as unlocking of names, unfortunately, tends to replace nodes in AST we unlock _all_ the dataflow first
			unlockDataFlow();
		}
		return ret;
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:218
   */
  private boolean allInitializersAreInOrderAfterWrapperField(java.util.Map<FieldDeclaration, InstanceInitializer> inits, FieldDeclaration wrapperField) {
		int prev = wrapperField.getChildIndex();
		for (InstanceInitializer init : inits.values()) {
			if (!(init.getChildIndex() == prev + 1)) {
				return false;
			}
			prev++;
		}
		return true;
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:229
   */
  private boolean isFieldsInIncreasingIndexOrder(java.util.List<FieldDeclaration> fds) {
		int last = 0;
		for(FieldDeclaration fd : fds) {
			if(!(fd.getChildIndex() >= last))
				return false;
			last = fd.getChildIndex();
		}
		return true;
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:239
   */
  private int maxVisibility(Collection<FieldDeclaration> fds) {
		int vis = VIS_PRIVATE;
		for(FieldDeclaration fd : fds)
			if(fd.getVisibility() > vis)
				vis = fd.getVisibility();
		return vis;
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:247
   */
  public FieldDeclaration createNewMemberField(int vis, TypeDecl type, String fieldName, int idx) {
		programRoot().lockNames(fieldName);
		Expr expr = new ClassInstanceExpr(type.createLockedAccess(), new List(), new Opt());
		FieldDeclaration fd = new FieldDeclaration(new Modifiers(vis), type.createLockedAccess(), fieldName, expr);
		this.getBodyDeclList().insertChild(fd, idx);
		return fd;
	}
  /**
   * @ast method 
   * @aspect ExtractClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/ExtractClass.jrag:256
   */
  public InstanceInitializer wrapField(FieldDeclaration toMove, FieldDeclaration wrapperField, ClassDecl struct, int idx) {

		// replace all uses to proxy uses
		for(VarAccess va : toMove.uses()) {
			VarAccess q = wrapperField.createLockedAccess();
			va.replaceWith(q.qualifiesAccess((VarAccess) va.fullCopyAndDetach()));
		}
		
		InstanceInitializer init = null;
		// move field to struct and leave the initializer
		if(toMove.hasInit()) {
			init = new InstanceInitializer(new Block(new ExprStmt(
					new AssignSimpleExpr(
							wrapperField.createLockedAccess().qualifiesAccess(toMove.createLockedAccess()), 
							toMove.getInit().wrapArrayInit()))));
			toMove.setInitOpt(new Opt<Expr>());
			toMove.hostType().getBodyDeclList().insertChild(init, toMove.getChildIndex());
		}
		toMove.hostType().removeBodyDecl(toMove);
		struct.getBodyDeclList().insertChild(toMove, idx);
		
		return init;
	}
  /**
   * @ast method 
   * @aspect InsertUnusedType
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/ExtractClass/InsertUnusedType.jrag:10
   */
  public MemberTypeDecl insertUnusedType(TypeDecl td, int idx) { 
		if(this instanceof ArrayDecl)
			throw new RefactoringException("cannot insert type into array declaration");
		return insertUnusedType(this, td.asMemberTypeDecl(), idx);
	}
  /**
   * @ast method 
   * @aspect InsertUnusedMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/InsertUnusedMethod.jrag:10
   */
  public void insertUnusedMethod(MethodDecl m, int idx) {
	programRoot().lockMethodNames(m.name());
	getBodyDeclList().insertChild(m, idx);
	programRoot().flushCaches();
	if(!canIntroduceMethod(m))
//		if (false) //ConditionMT 26
		throw new RefactoringException("cannot insert method here");
	if (ConditionsMoveMethod.cond5) {
		if(m.isDynamicallyCallable())
			throw new RefactoringException("method is used");
	}
	m.checkEnclosingTypeNames(this);
	if(m.isAbstract())
		for(TypeDecl td : m.inheritingTypes())
			td.makeAbstract();
	}
  /**
   * @ast method 
   * @aspect PullUpMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMembers.jrag:6
   */
  public void pullUpMembers(MethodDecl[] meths, boolean[] makeAbstract, FieldDeclaration[] fields, MemberTypeDecl[] membertypes) {
		for(int i=0;i<membertypes.length;++i)
			membertypes[i].moveTo(superclass());
		for(int i=0;i<fields.length;++i)
			fields[i].moveTo(superclass());
		for(int i=0;i<meths.length;++i)
			meths[i].pullUp(makeAbstract[i]);
	}
  /**
   * @ast method 
   * @aspect MakeTypeAbstract
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/MakeTypeAbstract.jrag:13
   */
  public void makeAbstract() {
		if(isAbstract())
			return;
		if(instancesAreConstructed())
			throw new RefactoringException("cannot make type abstract: it has instances constructed");
		getModifiers().addModifier("abstract");
	}
  /**
   * @ast method 
   * @aspect PushDownMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PushDown/PushDownMethod.jrag:62
   */
  public MethodAccess triviallyOverrideInheritedMethod(MethodDecl md) {
		md = memberMethod(md);
		if(md == null)
			return null;
		MethodDecl new_md = md.lockedCopyWithEmptyBody();
		if(md.hostType().isInterfaceDecl())
			new_md.getModifiers().addModifiers("public", "abstract");
		md.getModifiers().removeModifier("final");
		MethodAccess lockedAccess = null;
		if(md.isAbstract()) {
			makeAbstract();
		} else {
			List<Expr> args = new List<Expr>();
			for(ParameterDeclaration pd : new_md.getParameters())
				args.add(new VarAccess(pd.name()));
			lockedAccess = new MethodAccess(md, args, true);
			ReturnStmt ret = new ReturnStmt(new AbstractDot(new SuperAccess("super"), lockedAccess));
			new_md.setBlock(new Block(new List<Stmt>().add(ret)));
		}
		addBodyDecl(new_md);
		programRoot().flushCaches();
		return lockedAccess; 
	}
  /**
   * @ast method 
   * @aspect ExtractInterface
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/ExtractInterface.jrag:5
   */
  public void extractInterface(String pkg, String name, Collection<MethodDecl> methods) {
		if(!fromSource())
			throw new RefactoringException("cannot extract from non-source type");
		if(isEnumDecl())
			throw new RefactoringException("cannot extract from enum");
		if(subtype(typeThrowable())) 
			throw new RefactoringException("cannot extract from throwable type");
		for(MethodDecl md : methods) {
			if(md.hostType() != this)
				throw new RefactoringException("selected method is not a member of this type");
			if(md.isStatic())
				throw new RefactoringException("selected method is static");
		}
		
		Program root = programRoot();
		
		// create new interface
		List<BodyDecl> body = new List<BodyDecl>();
		InterfaceDecl newInterface = new InterfaceDecl(new Modifiers(), name, new List<Access>(), body);
		for(MethodDecl md : methods) {
			Collection<MethodDecl> ovr = md.overriddenMethods();
			MethodDecl new_md = md.lockedCopyWithEmptyBody();
			new_md.setModifiers(new Modifiers("public", "abstract"));
			body.add(new_md);
			ovr.add(new_md);
			md.lockOverriding(ovr);
		}
		
		// insert it into the program
		// TODO: determine path to put new compilation unit at
		String pathName = compilationUnit().pathName();
		String path = pathName.substring(0, pathName.lastIndexOf(File.separatorChar)+1);
		root.insertUnusedType(path, pkg == null ? packageName() : pkg, new List<ImportDecl>(), newInterface);
		
		// make class implement it
		addImplements(newInterface.createLockedAccess());
		
		// compute updatable expressions
		Collection<TypeConstraintVariable> updatable = computeUpdatableExprs(root.typeConstraints(this), this, newInterface);
		Collection<String> affectedMethods = new HashSet<String>();
		Collection<TypeDecl> affectedConstructors = new HashSet<TypeDecl>();
		
		findAffectedCallables(updatable, newInterface, affectedMethods, affectedConstructors);
		
		root.lockMethodNames(affectedMethods);
		root.lockConstructorCalls(affectedConstructors);
		root.lockOverridingDependencies(affectedMethods);
		
		for(TypeConstraintVariable tcv : updatable) {
			if(tcv instanceof Expr) {
				Expr e = (Expr)tcv;
				if(e.isTypeAccess())
					e.replaceWith(newInterface.createLockedAccess());
			}			
		}
	}
  /**
   * @ast method 
   * @aspect ExtractInterface
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/ExtractInterface.jrag:62
   */
  public void doExtractInterface(String pkg, String name, Collection<MethodDecl> methods) {
		Program root = programRoot();
		extractInterface(pkg, name, methods);
		root.eliminate(LOCKED_NAMES, LOCKED_OVERRIDING);
	}
  /**
   * @ast method 
   * @aspect CloseOverVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/CloseOverVariables.jrag:9
   */
  public void closeOver(VarAccess va, Map<LocalDeclaration, FieldDeclaration> fmap) {
		// only need to close over local variables declared in the enclosing body declaration;
		// variables further out or further in will still be visible to the new member class
		ASTNode decl = (ASTNode)va.decl();
		if(decl.isDescendantTo(this) || !decl.isDescendantTo(enclosingBodyDecl()))
			return;
		FieldDeclaration fd = fmap.get(va.decl());
		if(fd == null) {
			fd = new FreshField(new Modifiers("private", "final"), va.type().createLockedAccess(), va.name(), new Opt<Expr>());
			addBodyDecl(fd);
			fmap.put((LocalDeclaration)va.decl(), fd);
			for(ConstructorDecl cd : (Collection<ConstructorDecl>)constructors()) {
				ParameterDeclaration pd = new FreshParameter(va.type().createLockedAccess(), va.name()); 
				cd.insertParameter(pd, 0);
				ConstructorAccess cacc = cd.getConstructorAccess();
				if(cacc instanceof SuperConstructorAccess) {
					cd.getBlock().insertStmt(0, AssignExpr.asStmt(fd.createLockedAccess(), pd.createLockedAccess()));
				} else {
					cacc.insertArg(pd.createLockedAccess(), 0);
				}
			}
			for(Access acc : instantiations()) {
				if(acc instanceof SuperConstructorAccess) {
					((SuperConstructorAccess)acc).insertArg(va.decl().createLockedAccess(), 0);
				} else if(acc instanceof ClassInstanceExpr) {
					((ClassInstanceExpr)acc).insertArg(va.decl().createLockedAccess(), 0);
				}
			}
		}
		va.lock(fd);
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:242
   */
  public String rtxfId() {
		if(isTopLevelType())
			return fullName();
		if(getParent() instanceof MemberClassDecl)
			return enclosingType().rtxfId() + "." + name(); 
		if(getParent() instanceof LocalClassDeclStmt)
			return hostBodyDecl().rtxfId() + "#" + name();
		return super.rtxfId();
	}
  /**
   * @ast method 
   * 
   */
  public ClassDecl() {
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
    children = new ASTNode[4];
    setChild(new Opt(), 1);
    setChild(new List(), 2);
    setChild(new List(), 3);
  }
  /**
   * @ast method 
   * 
   */
  public ClassDecl(Modifiers p0, String p1, Opt<Access> p2, List<Access> p3, List<BodyDecl> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @ast method 
   * 
   */
  public ClassDecl(Modifiers p0, beaver.Symbol p1, Opt<Access> p2, List<Access> p3, List<BodyDecl> p4) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 4;
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__ClassDecl_setID(String value) {
    tokenString_ID = value;
  }
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
   * Replaces the optional node for the SuperClassAccess child. This is the {@code Opt} node containing the child SuperClassAccess, not the actual child!
   * @param opt The new node to be used as the optional node for the SuperClassAccess child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void setSuperClassAccessOpt(Opt<Access> opt) {
    setChild(opt, 1);
  }
  /**
   * Check whether the optional SuperClassAccess child exists.
   * @return {@code true} if the optional SuperClassAccess child exists, {@code false} if it does not.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public boolean hasSuperClassAccess() {
    return getSuperClassAccessOpt().getNumChild() != 0;
  }
  /**
   * Retrieves the (optional) SuperClassAccess child.
   * @return The SuperClassAccess child, if it exists. Returns {@code null} otherwise.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getSuperClassAccess() {
    return (Access)getSuperClassAccessOpt().getChild(0);
  }
  /**
   * Replaces the (optional) SuperClassAccess child.
   * @param node The new node to be used as the SuperClassAccess child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setSuperClassAccess(Access node) {
    getSuperClassAccessOpt().setChild(node, 0);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Access> getSuperClassAccessOpt() {
    return (Opt<Access>)getChild(1);
  }
  /**
   * Retrieves the optional node for child SuperClassAccess. This is the {@code Opt} node containing the child SuperClassAccess, not the actual child!
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The optional node for child SuperClassAccess.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Opt<Access> getSuperClassAccessOptNoTransform() {
    return (Opt<Access>)getChildNoTransform(1);
  }
  /**
   * Replaces the Implements list.
   * @param list The new list node to be used as the Implements list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setImplementsList(List<Access> list) {
    setChild(list, 2);
  }
  /**
   * Retrieves the number of children in the Implements list.
   * @return Number of children in the Implements list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumImplements() {
    return getImplementsList().getNumChild();
  }
  /**
   * Retrieves the number of children in the Implements list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the Implements list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumImplementsNoTransform() {
    return getImplementsListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the Implements list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the Implements list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Access getImplements(int i) {
    return (Access)getImplementsList().getChild(i);
  }
  /**
   * Append an element to the Implements list.
   * @param node The element to append to the Implements list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addImplements(Access node) {
    List<Access> list = (parent == null || state == null) ? getImplementsListNoTransform() : getImplementsList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addImplementsNoTransform(Access node) {
    List<Access> list = getImplementsListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the Implements list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setImplements(Access node, int i) {
    List<Access> list = getImplementsList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the Implements list.
   * @return The node representing the Implements list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<Access> getImplementss() {
    return getImplementsList();
  }
  /**
   * Retrieves the Implements list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implements list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<Access> getImplementssNoTransform() {
    return getImplementsListNoTransform();
  }
  /**
   * Retrieves the Implements list.
   * @return The node representing the Implements list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getImplementsList() {
    List<Access> list = (List<Access>)getChild(2);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the Implements list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the Implements list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<Access> getImplementsListNoTransform() {
    return (List<Access>)getChildNoTransform(2);
  }
  /**
   * Replaces the BodyDecl list.
   * @param list The new list node to be used as the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 3);
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * @return Number of children in the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumBodyDecl() {
    return getBodyDeclList().getNumChild();
  }
  /**
   * Retrieves the number of children in the BodyDecl list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the BodyDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumBodyDeclNoTransform() {
    return getBodyDeclListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the BodyDecl list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl getBodyDecl(int i) {
    return (BodyDecl)getBodyDeclList().getChild(i);
  }
  /**
   * Append an element to the BodyDecl list.
   * @param node The element to append to the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addBodyDecl(BodyDecl node) {
    List<BodyDecl> list = (parent == null || state == null) ? getBodyDeclListNoTransform() : getBodyDeclList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addBodyDeclNoTransform(BodyDecl node) {
    List<BodyDecl> list = getBodyDeclListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the BodyDecl list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBodyDecl(BodyDecl node, int i) {
    List<BodyDecl> list = getBodyDeclList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<BodyDecl> getBodyDecls() {
    return getBodyDeclList();
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<BodyDecl> getBodyDeclsNoTransform() {
    return getBodyDeclListNoTransform();
  }
  /**
   * Retrieves the BodyDecl list.
   * @return The node representing the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<BodyDecl> getBodyDeclList() {
    List<BodyDecl> list = (List<BodyDecl>)getChild(3);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the BodyDecl list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the BodyDecl list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<BodyDecl> getBodyDeclListNoTransform() {
    return (List<BodyDecl>)getChildNoTransform(3);
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:597
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__ClassDecl_setID(oldValue);
				}
				@Override
				public String toString() {
					return "ClassDecl.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ClassDecl_setID(value);
				}
			});
		}
		refined__ClassDecl_setID(value);
	}
  /**
   * @ast method 
   * @aspect TypeConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:84
   */
  private boolean refined_TypeConversion_ClassDecl_castingConversionTo_TypeDecl(TypeDecl type)
{
    if(type.isArrayDecl()) {
      return isObject();
    }
    else if(type.isClassDecl()) {
      return this == type || instanceOf(type) || type.instanceOf(this);
    }
    else if(type.isInterfaceDecl()) {
      return !isFinal() || instanceOf(type);
    }
    else return super.castingConversionTo(type);
  }
  /**
   * @ast method 
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:57
   */
  private boolean refined_Generics_ClassDecl_castingConversionTo_TypeDecl(TypeDecl type)
{
    TypeDecl S = this;
    TypeDecl T = type;
    if(T instanceof TypeVariable) {
      TypeVariable t = (TypeVariable)T;
      if(t.getNumTypeBound() == 0) return true;
      for(int i = 0; i < t.getNumTypeBound(); i++)
        if(castingConversionTo(t.getTypeBound(i).type()))
          return true;
      return false;
    }
    if(T.isClassDecl() && (S.erasure() != S || T.erasure() != T))
        return S.erasure().castingConversionTo(T.erasure());
    return refined_TypeConversion_ClassDecl_castingConversionTo_TypeDecl(type);
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:306
   */
  public Constant cast(Constant c) {
    ASTNode$State state = state();
    try {  return Constant.create(c.stringValue());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:372
   */
  public Constant add(Constant c1, Constant c2) {
    ASTNode$State state = state();
    try {  return Constant.create(c1.stringValue() + c2.stringValue());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:436
   */
  public Constant questionColon(Constant cond, Constant c1, Constant c2) {
    ASTNode$State state = state();
    try {  return Constant.create(cond.booleanValue() ? c1.stringValue() : c2.stringValue());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:540
   */
  public boolean eqIsTrue(Expr left, Expr right) {
    ASTNode$State state = state();
    try {  return isString() && left.constant().stringValue().equals(right.constant().stringValue());  }
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
  /**
   * @attribute syn
   * @aspect ConstructScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:21
   */
  public Collection lookupSuperConstructor() {
    ASTNode$State state = state();
    try {  return hasSuperclass() ? superclass().constructors() : Collections.EMPTY_LIST;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ImplicitConstructor
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupConstructor.jrag:207
   */
  public boolean noConstructor() {
    ASTNode$State state = state();
    try {
    if(!compilationUnit().fromSource())
      return false;
    for(int i = 0; i < getNumBodyDecl(); i++)
      if(getBodyDecl(i) instanceof ConstructorDecl)
        return false;
    return true;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect MemberMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:280
   */
  public SimpleSet interfacesMethodsSignature(String signature) {
    ASTNode$State state = state();
    try {
    SimpleSet set = (SimpleSet)interfacesMethodsSignatureMap().get(signature);
    if(set != null) return set;
    return SimpleSet.emptySet;
  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean interfacesMethodsSignatureMap_computed = false;
  /**
   * @apilevel internal
   */
  protected HashMap interfacesMethodsSignatureMap_value;
  /**
   * @attribute syn
   * @aspect MemberMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:286
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashMap interfacesMethodsSignatureMap() {
    if(interfacesMethodsSignatureMap_computed) {
      return interfacesMethodsSignatureMap_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    interfacesMethodsSignatureMap_value = interfacesMethodsSignatureMap_compute();
      if(isFinal && num == state().boundariesCrossed) interfacesMethodsSignatureMap_computed = true;
    return interfacesMethodsSignatureMap_value;
  }
  /**
   * @apilevel internal
   */
  private HashMap interfacesMethodsSignatureMap_compute() {
    HashMap map = new HashMap();
    for(Iterator iter = interfacesIterator(); iter.hasNext(); ) {
      TypeDecl typeDecl = (InterfaceDecl)iter.next();
      for(Iterator i2 = typeDecl.methodsIterator(); i2.hasNext(); ) {
        MethodDecl m = (MethodDecl)i2.next();
        putSimpleSetElement(map, m.signature(), m);
      }
    }
    return map;
  }
  /**
   * @apilevel internal
   */
  protected boolean methodsSignatureMap_computed = false;
  /**
   * @apilevel internal
   */
  protected HashMap methodsSignatureMap_value;
  /**
   * @attribute syn
   * @aspect MethodSignature15
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/MethodSignature.jrag:359
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashMap methodsSignatureMap() {
    if(methodsSignatureMap_computed) {
      return methodsSignatureMap_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    methodsSignatureMap_value = methodsSignatureMap_compute();
      if(isFinal && num == state().boundariesCrossed) methodsSignatureMap_computed = true;
    return methodsSignatureMap_value;
  }
  /**
   * @apilevel internal
   */
  private HashMap methodsSignatureMap_compute() {
    HashMap map = new HashMap(localMethodsSignatureMap());
    if(hasSuperclass()) {
      for(Iterator iter = superclass().methodsIterator(); iter.hasNext(); ) {
        MethodDecl m = (MethodDecl)iter.next();
        if(!m.isPrivate() && m.accessibleFrom(this) && !localMethodsSignatureMap().containsKey(m.signature())) {
          if(!(m instanceof MethodDeclSubstituted) || !localMethodsSignatureMap().containsKey(m.sourceMethodDecl().signature()))
            putSimpleSetElement(map, m.signature(), m);
        }
      }
    }
    for(Iterator outerIter = interfacesIterator(); outerIter.hasNext(); ) {
      TypeDecl typeDecl = (TypeDecl)outerIter.next();
      for(Iterator iter = typeDecl.methodsIterator(); iter.hasNext(); ) {
        MethodDecl m = (MethodDecl)iter.next();
        if(!m.isPrivate() && m.accessibleFrom(this) && !localMethodsSignatureMap().containsKey(m.signature())) {
          if(!(m instanceof MethodDeclSubstituted) || !localMethodsSignatureMap().containsKey(m.sourceMethodDecl().signature())) {
            if(allMethodsAbstract((SimpleSet)map.get(m.signature())) &&
              (!(m instanceof MethodDeclSubstituted) ||
               allMethodsAbstract((SimpleSet)map.get(m.sourceMethodDecl().signature()))              )
            )
              putSimpleSetElement(map, m.signature(), m);
          }
        }
      }
    }
    return map;
  }
  protected java.util.Map ancestorMethods_String_values;
  /**
   * @attribute syn
   * @aspect AncestorMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:380
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet ancestorMethods(String signature) {
    Object _parameters = signature;
    if(ancestorMethods_String_values == null) ancestorMethods_String_values = new java.util.HashMap(4);
    if(ancestorMethods_String_values.containsKey(_parameters)) {
      return (SimpleSet)ancestorMethods_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet ancestorMethods_String_value = ancestorMethods_compute(signature);
      if(isFinal && num == state().boundariesCrossed) ancestorMethods_String_values.put(_parameters, ancestorMethods_String_value);
    return ancestorMethods_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet ancestorMethods_compute(String signature) {
    SimpleSet set = SimpleSet.emptySet;
    if(hasSuperclass()) {
      for(Iterator iter = superclass().localMethodsSignature(signature).iterator(); iter.hasNext(); ) {
        MethodDecl m = (MethodDecl)iter.next();
        if(!m.isPrivate())
          set = set.add(m);
      }
    }
    if(set.size() != 1 || ((MethodDecl)set.iterator().next()).isAbstract()) { 
      for(Iterator iter = interfacesMethodsSignature(signature).iterator(); iter.hasNext(); ) {
        MethodDecl m = (MethodDecl)iter.next();
        set = set.add(m);
      }
    }
    if(!hasSuperclass()) return set;
    if(set.size() == 1) {
      MethodDecl m = (MethodDecl)set.iterator().next();
      if(!m.isAbstract()) {
        boolean done = true;
        for(Iterator iter = superclass().ancestorMethods(signature).iterator(); iter.hasNext(); ) {
          MethodDecl n = (MethodDecl)iter.next();
          if(n.isPrivate() || !n.accessibleFrom(m.hostType()))
            done = false;
        }
        if(done) return set;
      }
    }
    for(Iterator iter = superclass().ancestorMethods(signature).iterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      set = set.add(m);
    }
    return set;
  }
  protected java.util.Map memberTypes_String_values;
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:498
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet memberTypes(String name) {
    Object _parameters = name;
    if(memberTypes_String_values == null) memberTypes_String_values = new java.util.HashMap(4);
    if(memberTypes_String_values.containsKey(_parameters)) {
      return (SimpleSet)memberTypes_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet memberTypes_String_value = memberTypes_compute(name);
      if(isFinal && num == state().boundariesCrossed) memberTypes_String_values.put(_parameters, memberTypes_String_value);
    return memberTypes_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet memberTypes_compute(String name) {
    SimpleSet set = localTypeDecls(name);
    if(!set.isEmpty()) return set;
    for(Iterator outerIter = interfacesIterator(); outerIter.hasNext(); ) {
      TypeDecl type = (TypeDecl)outerIter.next();
      for(Iterator iter = type.memberTypes(name).iterator(); iter.hasNext(); ) {
        TypeDecl decl = (TypeDecl)iter.next();
        if(!decl.isPrivate() && decl.accessibleFrom(this))
          set = set.add(decl);
      }
    }
    if(hasSuperclass()) {
      for(Iterator iter = superclass().memberTypes(name).iterator(); iter.hasNext(); ) {
        TypeDecl decl = (TypeDecl)iter.next();
        if(!decl.isPrivate() && decl.accessibleFrom(this)) {
          set = set.add(decl);
        }
      }
    }
    return set;
  }
  /**
   * @apilevel internal
   */
  protected boolean memberFieldsMap_computed = false;
  /**
   * @apilevel internal
   */
  protected HashMap memberFieldsMap_value;
  /**
   * @attribute syn
   * @aspect Fields
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:283
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashMap memberFieldsMap() {
    if(memberFieldsMap_computed) {
      return memberFieldsMap_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    memberFieldsMap_value = memberFieldsMap_compute();
      if(isFinal && num == state().boundariesCrossed) memberFieldsMap_computed = true;
    return memberFieldsMap_value;
  }
  /**
   * @apilevel internal
   */
  private HashMap memberFieldsMap_compute() {
    HashMap map = new HashMap(localFieldsMap());
    if(hasSuperclass()) {
      for(Iterator iter = superclass().fieldsIterator(); iter.hasNext(); ) {
        FieldDeclaration decl = (FieldDeclaration)iter.next();
        if(!decl.isPrivate() && decl.accessibleFrom(this) && !localFieldsMap().containsKey(decl.name()))
          putSimpleSetElement(map, decl.name(), decl);
      }
    }
    for(Iterator outerIter = interfacesIterator(); outerIter.hasNext(); ) {
      TypeDecl type = (TypeDecl)outerIter.next();
      for(Iterator iter = type.fieldsIterator(); iter.hasNext(); ) {
        FieldDeclaration decl = (FieldDeclaration)iter.next();
        if(!decl.isPrivate() && decl.accessibleFrom(this) && !localFieldsMap().containsKey(decl.name()))
          putSimpleSetElement(map, decl.name(), decl);
      }
    }
    return map;
  }
  protected java.util.Map memberFields_String_values;
  /**
   * @attribute syn
   * @aspect Fields
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:334
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet memberFields(String name) {
    Object _parameters = name;
    if(memberFields_String_values == null) memberFields_String_values = new java.util.HashMap(4);
    if(memberFields_String_values.containsKey(_parameters)) {
      return (SimpleSet)memberFields_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet memberFields_String_value = memberFields_compute(name);
      if(isFinal && num == state().boundariesCrossed) memberFields_String_values.put(_parameters, memberFields_String_value);
    return memberFields_String_value;
  }
  /**
   * @apilevel internal
   */
  private SimpleSet memberFields_compute(String name) {
    SimpleSet fields = localFields(name);
    if(!fields.isEmpty())
      return fields; // this causes hiding of fields in superclass and interfaces
    if(hasSuperclass()) {
      for(Iterator iter = superclass().memberFields(name).iterator(); iter.hasNext(); ) {
        FieldDeclaration decl = (FieldDeclaration)iter.next();
        if(!decl.isPrivate() && decl.accessibleFrom(this))
          fields = fields.add(decl);
      }
    }
    for(Iterator outerIter = interfacesIterator(); outerIter.hasNext(); ) {
      TypeDecl type = (TypeDecl)outerIter.next();
      for(Iterator iter = type.memberFields(name).iterator(); iter.hasNext(); ) {
        FieldDeclaration decl = (FieldDeclaration)iter.next();
        if(!decl.isPrivate() && decl.accessibleFrom(this))
          fields = fields.add(decl);
      }
    }
    return fields;
  }
  /**
   * @apilevel internal
   */
  protected boolean unimplementedMethods_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection unimplementedMethods_value;
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:17
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection unimplementedMethods() {
    if(unimplementedMethods_computed) {
      return unimplementedMethods_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    unimplementedMethods_value = unimplementedMethods_compute();
      if(isFinal && num == state().boundariesCrossed) unimplementedMethods_computed = true;
    return unimplementedMethods_value;
  }
  /**
   * @apilevel internal
   */
  private Collection unimplementedMethods_compute() {
    Collection c = new ArrayList();
    for(Iterator iter = interfacesMethodsIterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      boolean implemented = false;
      SimpleSet set = (SimpleSet)localMethodsSignature(m.signature());
      if(set.size() == 1) {
        MethodDecl n = (MethodDecl)set.iterator().next();
        if(!n.isAbstract())
          implemented = true;
      }
      if(!implemented) {
        set = (SimpleSet)ancestorMethods(m.signature());
        for(Iterator i2 = set.iterator(); i2.hasNext(); ) {
          MethodDecl n = (MethodDecl)i2.next();
          if(!n.isAbstract()) {
            implemented = true;
            break;
          }
        }
      }
      if(!implemented) {
        c.add(m);
      }
    }

    if(hasSuperclass()) {
      for(Iterator iter = superclass().unimplementedMethods().iterator(); iter.hasNext(); ) {
        MethodDecl m = (MethodDecl)iter.next();
        SimpleSet set = (SimpleSet)localMethodsSignature(m.signature());
        if(set.size() == 1) {
          MethodDecl n = (MethodDecl)set.iterator().next();
          if(n.isAbstract() || !n.overrides(m))
            c.add(m);
        }
        else
          c.add(m);
      }
    }

    for(Iterator iter = localMethodsIterator(); iter.hasNext(); ) {
      MethodDecl m = (MethodDecl)iter.next();
      if(m.isAbstract()) {
        c.add(m);
      }
    }
    return c;
  }
  /**
   * @apilevel internal
   */
  protected boolean hasAbstract_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean hasAbstract_value;
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasAbstract() {
    if(hasAbstract_computed) {
      return hasAbstract_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    hasAbstract_value = hasAbstract_compute();
      if(isFinal && num == state().boundariesCrossed) hasAbstract_computed = true;
    return hasAbstract_value;
  }
  /**
   * @apilevel internal
   */
  private boolean hasAbstract_compute() {  return !unimplementedMethods().isEmpty();  }
  protected java.util.Map castingConversionTo_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:134
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean castingConversionTo(TypeDecl type) {
    Object _parameters = type;
    if(castingConversionTo_TypeDecl_values == null) castingConversionTo_TypeDecl_values = new java.util.HashMap(4);
    if(castingConversionTo_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)castingConversionTo_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean castingConversionTo_TypeDecl_value = castingConversionTo_compute(type);
      if(isFinal && num == state().boundariesCrossed) castingConversionTo_TypeDecl_values.put(_parameters, Boolean.valueOf(castingConversionTo_TypeDecl_value));
    return castingConversionTo_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean castingConversionTo_compute(TypeDecl type) {
    if(refined_Generics_ClassDecl_castingConversionTo_TypeDecl(type))
      return true;
    boolean canUnboxThis = !unboxed().isUnknown();
    boolean canUnboxType = !type.unboxed().isUnknown();
    if(canUnboxThis && !canUnboxType)
      return unboxed().wideningConversionTo(type);
    return false;
    /*
    else if(unboxingConversionTo(type))
      return true;
    return false;
    */
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:209
   */
  public boolean isClassDecl() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean isString_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isString_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:225
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isString() {
    if(isString_computed) {
      return isString_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isString_value = isString_compute();
      if(isFinal && num == state().boundariesCrossed) isString_computed = true;
    return isString_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isString_compute() {  return fullName().equals("java.lang.String");  }
  /**
   * @apilevel internal
   */
  protected boolean isObject_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isObject_value;
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:228
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isObject() {
    if(isObject_computed) {
      return isObject_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    isObject_value = isObject_compute();
      if(isFinal && num == state().boundariesCrossed) isObject_computed = true;
    return isObject_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isObject_compute() {  return name().equals("Object") && packageName().equals("java.lang");  }
  protected java.util.Map instanceOf_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsSubtype.jrag:387
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean instanceOf(TypeDecl type) {
    Object _parameters = type;
    if(instanceOf_TypeDecl_values == null) instanceOf_TypeDecl_values = new java.util.HashMap(4);
    if(instanceOf_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)instanceOf_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean instanceOf_TypeDecl_value = instanceOf_compute(type);
      if(isFinal && num == state().boundariesCrossed) instanceOf_TypeDecl_values.put(_parameters, Boolean.valueOf(instanceOf_TypeDecl_value));
    return instanceOf_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean instanceOf_compute(TypeDecl type) { return subtype(type); }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:423
   */
  public boolean isSupertypeOfClassDecl(ClassDecl type) {
    ASTNode$State state = state();
    try {
    if(super.isSupertypeOfClassDecl(type))
      return true;
    return type.hasSuperclass() && type.superclass() != null && type.superclass().instanceOf(this);
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:440
   */
  public boolean isSupertypeOfInterfaceDecl(InterfaceDecl type) {
    ASTNode$State state = state();
    try {  return isObject();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:453
   */
  public boolean isSupertypeOfArrayDecl(ArrayDecl type) {
    ASTNode$State state = state();
    try {
    if(super.isSupertypeOfArrayDecl(type))
      return true;
    return type.hasSuperclass() && type.superclass() != null && type.superclass().instanceOf(this);
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:534
   */
  public boolean isInnerClass() {
    ASTNode$State state = state();
    try {  return isNestedType() && !isStatic() && enclosingType().isClassDecl();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected int isCircular_visited = -1;
  /**
   * @apilevel internal
   */
  protected boolean isCircular_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean isCircular_initialized = false;
  /**
   * @apilevel internal
   */
  protected boolean isCircular_value;
  /**
   * @attribute syn
   * @aspect Circularity
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:677
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isCircular() {
    if(isCircular_computed) {
      return isCircular_value;
    }
    ASTNode$State state = state();
    if (!isCircular_initialized) {
      isCircular_initialized = true;
      isCircular_value = true;
    }
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
    int num = state.boundariesCrossed;
    boolean isFinal = this.is$Final();
      do {
        isCircular_visited = state.CIRCLE_INDEX;
        state.CHANGE = false;
        boolean new_isCircular_value = isCircular_compute();
        if (new_isCircular_value!=isCircular_value)
          state.CHANGE = true;
        isCircular_value = new_isCircular_value; 
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
      isCircular_computed = true;
      }
      else {
      state.RESET_CYCLE = true;
      isCircular_compute();
      state.RESET_CYCLE = false;
        isCircular_computed = false;
        isCircular_initialized = false;
      }
      state.IN_CIRCLE = false; 
      return isCircular_value;
    }
    if(isCircular_visited != state.CIRCLE_INDEX) {
      isCircular_visited = state.CIRCLE_INDEX;
      if (state.RESET_CYCLE) {
        isCircular_computed = false;
        isCircular_initialized = false;
        isCircular_visited = -1;
        return isCircular_value;
      }
      boolean new_isCircular_value = isCircular_compute();
      if (new_isCircular_value!=isCircular_value)
        state.CHANGE = true;
      isCircular_value = new_isCircular_value; 
      return isCircular_value;
    }
    return isCircular_value;
  }
  /**
   * @apilevel internal
   */
  private boolean isCircular_compute() {
    if(hasSuperClassAccess()) {
      Access a = getSuperClassAccess().lastAccess();
      while(a != null) {
        if(a.type().isCircular())
          return true;
        a = (a.isQualified() && a.qualifier().isTypeAccess()) ? (Access)a.qualifier() : null;
      }
    }
    for(int i = 0; i < getNumImplements(); i++) {
      Access a = getImplements(i).lastAccess();
      while(a != null) {
        if(a.type().isCircular())
          return true;
        a = (a.isQualified() && a.qualifier().isTypeAccess()) ? (Access)a.qualifier() : null;
      }
    }
    return false;
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:225
   */
  public Annotation annotation(TypeDecl typeDecl) {
    ASTNode$State state = state();
    try {
    Annotation a = super.annotation(typeDecl);
    if(a != null) return a;
    if(hasSuperclass()) {
      // If the queried annotation is itself annotation with @Inherited then
      // delegate the query to the superclass
      if(typeDecl.annotation(lookupType("java.lang.annotation", "Inherited")) != null)
        return superclass().annotation(typeDecl);
    }
    return null;
  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean implementedInterfaces_computed = false;
  /**
   * @apilevel internal
   */
  protected HashSet implementedInterfaces_value;
  /**
   * @attribute syn
   * @aspect GenericsTypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:400
   */
  @SuppressWarnings({"unchecked", "cast"})
  public HashSet implementedInterfaces() {
    if(implementedInterfaces_computed) {
      return implementedInterfaces_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    implementedInterfaces_value = implementedInterfaces_compute();
      if(isFinal && num == state().boundariesCrossed) implementedInterfaces_computed = true;
    return implementedInterfaces_value;
  }
  /**
   * @apilevel internal
   */
  private HashSet implementedInterfaces_compute() {
    HashSet set = new HashSet();
    if(hasSuperclass())
      set.addAll(superclass().implementedInterfaces());
    for(Iterator iter = interfacesIterator(); iter.hasNext(); ) {
      InterfaceDecl decl = (InterfaceDecl)iter.next();
      set.add(decl);
      set.addAll(decl.implementedInterfaces());
    }
    return set;
  }
  protected java.util.Map subtype_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsSubtype.jrag:407
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean subtype(TypeDecl type) {
    Object _parameters = type;
    if(subtype_TypeDecl_values == null) subtype_TypeDecl_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(subtype_TypeDecl_values.containsKey(_parameters)) {
      Object _o = subtype_TypeDecl_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      subtype_TypeDecl_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(true);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_subtype_TypeDecl_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_subtype_TypeDecl_value = subtype_compute(type);
        if (new_subtype_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_subtype_TypeDecl_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        subtype_TypeDecl_values.put(_parameters, new_subtype_TypeDecl_value);
      }
      else {
        subtype_TypeDecl_values.remove(_parameters);
      state.RESET_CYCLE = true;
      subtype_compute(type);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_subtype_TypeDecl_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_subtype_TypeDecl_value = subtype_compute(type);
      if (state.RESET_CYCLE) {
        subtype_TypeDecl_values.remove(_parameters);
      }
      else if (new_subtype_TypeDecl_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_subtype_TypeDecl_value;
      }
      return new_subtype_TypeDecl_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean subtype_compute(TypeDecl type) {  return type.supertypeClassDecl(this);  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsSubtype.jrag:421
   */
  public boolean supertypeClassDecl(ClassDecl type) {
    ASTNode$State state = state();
    try {  return super.supertypeClassDecl(type) || 
    type.hasSuperclass() && type.superclass() != null && type.superclass().subtype(this);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsSubtype.jrag:437
   */
  public boolean supertypeInterfaceDecl(InterfaceDecl type) {
    ASTNode$State state = state();
    try {  return isObject();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsSubtype.jrag:450
   */
  public boolean supertypeArrayDecl(ArrayDecl type) {
    ASTNode$State state = state();
    try {
    if(super.supertypeArrayDecl(type))
      return true;
    return type.hasSuperclass() && type.superclass() != null && type.superclass().subtype(this);
  }
    finally {
    }
  }
  protected java.util.Map descendantMethods_String_values;
  /**
   * @attribute syn
   * @aspect MethodExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/MethodExt.jrag:137
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> descendantMethods(String sig) {
    Object _parameters = sig;
    if(descendantMethods_String_values == null) descendantMethods_String_values = new java.util.HashMap(4);
    if(descendantMethods_String_values.containsKey(_parameters)) {
      return (Collection<MethodDecl>)descendantMethods_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    Collection<MethodDecl> descendantMethods_String_value = descendantMethods_compute(sig);
      if(isFinal && num == state().boundariesCrossed) descendantMethods_String_values.put(_parameters, descendantMethods_String_value);
    return descendantMethods_String_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<MethodDecl> descendantMethods_compute(String sig) {
		Collection<MethodDecl> desc = new HashSet<MethodDecl>();
		for(TypeDecl td : childTypes()) {
			boolean found = false;
			for(Iterator<MethodDecl> iter = td.localMethodsSignature(sig).iterator(); iter.hasNext();) {
				MethodDecl md = iter.next();
				desc.add(md);
				found = true;
			}
			if(!found)
				desc.addAll(td.descendantMethods(sig));
		}
		return desc;
	}
  /**
   * @apilevel internal
   */
  protected boolean supertypes_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<TypeDecl> supertypes_value;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:165
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<TypeDecl> supertypes() {
    if(supertypes_computed) {
      return supertypes_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    supertypes_value = supertypes_compute();
      if(isFinal && num == state().boundariesCrossed) supertypes_computed = true;
    return supertypes_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<TypeDecl> supertypes_compute() {
		Collection<TypeDecl> res = new LinkedList<TypeDecl>();
		if(superclass() != null)
			res.add(superclass());
		for(Iterator<InterfaceDecl> iter = interfacesIterator(); iter.hasNext();)
			res.add(iter.next());
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean superinterfaces_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<InterfaceDecl> superinterfaces_value;
  /**
   * @attribute syn
   * @aspect Overriding
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Overriding.jrag:181
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<InterfaceDecl> superinterfaces() {
    if(superinterfaces_computed) {
      return superinterfaces_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    superinterfaces_value = superinterfaces_compute();
      if(isFinal && num == state().boundariesCrossed) superinterfaces_computed = true;
    return superinterfaces_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<InterfaceDecl> superinterfaces_compute() {
		Collection<InterfaceDecl> res = new LinkedList<InterfaceDecl>();
		for(Iterator<InterfaceDecl> iter = interfacesIterator(); iter.hasNext();)
			res.add(iter.next());
		return res;
	}
  /**
   * @apilevel internal
   */
  protected boolean instancesAreConstructed_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean instancesAreConstructed_value;
  /**
   * @attribute syn
   * @aspect TypeExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeExt.jrag:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean instancesAreConstructed() {
    if(instancesAreConstructed_computed) {
      return instancesAreConstructed_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    instancesAreConstructed_value = instancesAreConstructed_compute();
      if(isFinal && num == state().boundariesCrossed) instancesAreConstructed_computed = true;
    return instancesAreConstructed_value;
  }
  /**
   * @apilevel internal
   */
  private boolean instancesAreConstructed_compute() {
		for(ConstructorDecl cd : (Collection<ConstructorDecl>)constructors())
			for(Access acc : cd.uses())
				if(acc instanceof ClassInstanceExpr &&!((ClassInstanceExpr)acc).hasTypeDecl())
					return true;
		return false;
	}
  /**
   * @attribute syn
   * @aspect AccessMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:117
   */
  public MethodAccessInfo accessMemberMethod(MethodDecl md) {
    ASTNode$State state = state();
    try {
		MethodAccessInfo acc = accessLocalMethod(md);
		if(acc != null) return acc;
		if(hasSuperclass()) {
			acc = superclass().accessMemberMethod(md);
			if(acc != null && !md.isPrivate() && md.accessibleFrom(this))
				return acc.moveDownTo(this);
		}
		for(Iterator iter = interfacesIterator(); iter.hasNext(); ) {
			TypeDecl type = (TypeDecl)iter.next();
			acc = type.accessMemberMethod(md);
			if(acc != null && !md.isPrivate() && md.accessibleFrom(this))
				return acc.moveDownTo(this);
		}
		return null;
	}
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:297
   */
  public SymbolicFieldAccess accessField(Variable decl) {
    ASTNode$State state = state();
    try {
		SymbolicFieldAccess acc = accessLocalField(decl);
		if(!acc.isUnknownVarAccess()) return acc;
		if(hasSuperclass()) {
			acc = superclass().accessField(decl);
			if(!acc.isUnknownVarAccess() && canInherit(decl))
				return acc.moveDownTo(this);
		}
		for(Iterator iter = interfacesIterator(); iter.hasNext(); ) {
			TypeDecl type = (TypeDecl)iter.next();
			acc = type.accessField(decl);
			if(!acc.isUnknownVarAccess() && canInherit(decl))
				return acc.moveDownTo(this);
		}
		return unknownVarAccess();
	}
    finally {
    }
  }
  /*
	 * We only introduce subtype constraints for classes and interfaces (but not for parameterised or substituted ones).
	 * Only these are "subtype constrainable". In principle, we should introduce conservative equality constraints
	 * for non-subtype constrainable types to fix them to their old values; in practice, we rely on refactorings to never
	 * try and change declarations of non-subtype constrainable type. 
	 * @attribute syn
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:25
   */
  public boolean isSubtypeConstrainable() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:259
   * @apilevel internal
   */
  public boolean Define_boolean_mayBeFinal(ASTNode caller, ASTNode child) {
    if(caller == getModifiersNoTransform()) {
      return true;
    }
    else {      return super.Define_boolean_mayBeFinal(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:74
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getImplementsListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else if(caller == getSuperClassAccessOptNoTransform()) {
      return NameType.TYPE_NAME;
    }
    else {      return super.Define_NameType_nameType(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:579
   * @apilevel internal
   */
  public TypeDecl Define_TypeDecl_hostType(ASTNode caller, ASTNode child) {
    if(caller == getImplementsListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return hostType();
  }
    else if(caller == getSuperClassAccessOptNoTransform()) {
      return hostType();
    }
    else {      return super.Define_TypeDecl_hostType(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:276
   * @apilevel internal
   */
  public boolean Define_boolean_withinSuppressWarnings(ASTNode caller, ASTNode child, String s) {
    if(caller == getImplementsListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return hasAnnotationSuppressWarnings(s) || withinSuppressWarnings(s);
  }
    else if(caller == getSuperClassAccessOptNoTransform()) {
      return hasAnnotationSuppressWarnings(s) || withinSuppressWarnings(s);
    }
    else {      return super.Define_boolean_withinSuppressWarnings(caller, child, s);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:377
   * @apilevel internal
   */
  public boolean Define_boolean_withinDeprecatedAnnotation(ASTNode caller, ASTNode child) {
    if(caller == getImplementsListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return isDeprecated() || withinDeprecatedAnnotation();
  }
    else if(caller == getSuperClassAccessOptNoTransform()) {
      return isDeprecated() || withinDeprecatedAnnotation();
    }
    else {      return super.Define_boolean_withinDeprecatedAnnotation(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:269
   * @apilevel internal
   */
  public boolean Define_boolean_inExtendsOrImplements(ASTNode caller, ASTNode child) {
    if(caller == getImplementsListNoTransform())  {
    int i = caller.getIndexOfChild(child);
    return true;
  }
    else if(caller == getSuperClassAccessOptNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_inExtendsOrImplements(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  protected void collect_contributors_TypeDecl_childTypes() {
    /**
   * @attribute coll
   * @aspect Inheritance
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Inheritance.jrag:5
   */
    if(hasSuperclass()) {
    {
      TypeDecl ref = (TypeDecl)(superclass().sourceTypeDecl());
      if(ref != null)
        ref.TypeDecl_childTypes_contributors().add(this);
      }    }
    /**
   * @attribute coll
   * @aspect Inheritance
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Inheritance.jrag:8
   */
    for(java.util.Iterator iter = (interfacesSourceDecls()).iterator(); iter.hasNext(); ) {
      TypeDecl ref = (TypeDecl)iter.next();
      if(ref != null)
      ref.TypeDecl_childTypes_contributors().add(this);
    }
    super.collect_contributors_TypeDecl_childTypes();
  }
  protected void contributeTo_TypeDecl_TypeDecl_childTypes(Collection<TypeDecl> collection) {
    super.contributeTo_TypeDecl_TypeDecl_childTypes(collection);
    if(hasSuperclass())
      collection.add(this);
    collection.add(this);
  }

}
