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
import tests.jdolly.ConditionsPullUpMethod;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * @production MemberTypeDecl : {@link MemberDecl};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:98
 */
public abstract class MemberTypeDecl extends MemberDecl implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
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
  public MemberTypeDecl clone() throws CloneNotSupportedException {
    MemberTypeDecl node = (MemberTypeDecl)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:64
   */
  public void moveTo(TypeDecl target) {
		if(!target.fromSource())
			throw new RefactoringException("cannot insert type into library class");
		for(ThisAccess acc : collectThisAccesses())
			if (ConditionsPullUpMethod.cond2) {
				if(acc.isQualified())
					throw new RefactoringException("Pull Up cannot preserve enclosing instances");
			}
		Program root = programRoot();
		typeDecl().lockAllNames();
		Collection<String> endangeredNames = new HashSet<String>();
		endangeredNames.add(typeDecl().name());
		collectAllFieldAndTypeNames(endangeredNames);
		root.lockNames(endangeredNames);
		endangeredNames.clear();
		collectAllMethodNames(endangeredNames);
		root.lockMethodNames(endangeredNames);
		root.lockOverridingDependencies(endangeredNames);
		
		Collection<TypeDecl> endangeredTypeDecls = new LinkedList<TypeDecl>();
		collectAllMemberTypeDecls(endangeredTypeDecls);
		root.lockConstructorCalls(endangeredTypeDecls);

		hostType().removeBodyDecl(this);
		target.insertUnusedType(typeDecl());
		
		// check that everything went OK wrt types
		Collection<TypeConstraint> typeConstraints =
			root.typeConstraints(new Predicate<TypeConstraint>() {
				public boolean holds(TypeConstraint constr) {
					return constr.relevantForSubtree(MemberTypeDecl.this);
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:107
   */
  protected void collectAllMemberTypeDecls(Collection<TypeDecl> res) {
		res.add(typeDecl());
		super.collectAllMemberTypeDecls(res);
	}
  /**
   * @ast method 
   * @aspect MoveMemberTypeToToplevel
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/MoveMemberTypeToToplevel.jrag:3
   */
  public void moveToToplevel(boolean ownCU, String instanceName, boolean makeInstanceFieldFinal) {
		Program root = programRoot();
		CompilationUnit cu = compilationUnit();
		TypeDecl td = typeDecl();
		root.lockNames(td.name());
		td.lockAllNames();
		if(!td.isStatic()) {
			LinkedList<FieldDeclaration> encls = td.addEnclosingInstanceFields(hostType(), instanceName, makeInstanceFieldFinal);
			ArrayList<TypeDecl> encl_types = new ArrayList<TypeDecl>();
			encl_types.add(td);
			td.adjustMemberMethods(encls, encl_types);
		}
		td.removeNonToplevelModifiers();
		if(ownCU) {
			String path = cu.pathName();
			root.insertUnusedType(path.substring(0, path.lastIndexOf(File.separatorChar)+1),
								  cu.getPackageDecl(), (List<ImportDecl>)cu.getImportDecls().fullCopyAndDetach(), td);
		} else {
			cu.insertUnusedType(td);
		}
		if (td instanceof ClassDecl)
			((ClassDecl) td).inheritVisibilityToDefaultConstructor();
		getParent().removeChild(getChildIndex());
		root.eliminate(WITH_STMT, FRESH_VARIABLES, LOCKED_NAMES);
	}
  /**
   * @ast method 
   * @aspect MoveMemberTypeToToplevel
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/MoveMemberTypeToToplevel.jrag:29
   */
  public void moveToToplevel() {
		moveToToplevel(false, null, true);
	}
  /**
   * @ast method 
   * 
   */
  public MemberTypeDecl() {
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
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:484
   */
  @SuppressWarnings({"unchecked", "cast"})
  public abstract TypeDecl typeDecl();
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:479
   */
  public boolean declaresType(String name) {
    ASTNode$State state = state();
    try {  return typeDecl().name().equals(name);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:481
   */
  public TypeDecl type(String name) {
    ASTNode$State state = state();
    try {  return declaresType(name) ? typeDecl() : null;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:222
   */
  public boolean isStatic() {
    ASTNode$State state = state();
    try {  return typeDecl().isStatic();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:758
   */
  public boolean addsIndentationLevel() {
    ASTNode$State state = state();
    try {  return false;  }
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
    try {  return typeDecl().hasAnnotationSuppressWarnings(s);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:322
   */
  public boolean isDeprecated() {
    ASTNode$State state = state();
    try {  return typeDecl().isDeprecated();  }
    finally {
    }
  }
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
   * @aspect Testing
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/Testing.jrag:30
   */
  public String ppID() {
    ASTNode$State state = state();
    try {  return typeDecl().name();  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
