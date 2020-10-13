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
 * @production LocalClassDeclStmt : {@link Stmt} ::= <span class="component">{@link ClassDecl}</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:223
 */
public class LocalClassDeclStmt extends Stmt implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    canCompleteNormally_computed = false;
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
  public LocalClassDeclStmt clone() throws CloneNotSupportedException {
    LocalClassDeclStmt node = (LocalClassDeclStmt)super.clone();
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.canCompleteNormally_computed = false;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public LocalClassDeclStmt copy() {
    try {
      LocalClassDeclStmt node = (LocalClassDeclStmt) clone();
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
  public LocalClassDeclStmt fullCopy() {
    LocalClassDeclStmt tree = (LocalClassDeclStmt) copy();
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
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:740
   */
  public void toString(StringBuffer s) {
    getClassDecl().toString(s);
  }
  /**
   * @ast method 
   * @aspect Navigation
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Navigation.jrag:72
   */
  public LocalClassDeclStmt findLocalClass(String name) {
		if(getClassDecl().name().equals(name))
			return this;
		return super.findLocalClass(name);
	}
  /**
   * @ast method 
   * @aspect CloseOverVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/CloseOverVariables.jrag:3
   */
  public void closeOverLocalVariables() {
		Map<LocalDeclaration, FieldDeclaration> fmap = new HashMap<LocalDeclaration, FieldDeclaration>();
		for(VarAccess va : localVarAccesses())
			getClassDecl().closeOver(va, fmap);		
	}
  /**
   * @ast method 
   * @aspect CloseOverVariables
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/CloseOverVariables.jrag:41
   */
  public ClassDecl closeOverTypeVariables() {
		Map<TypeVariable, TypeVariable> tvmap = new HashMap<TypeVariable, TypeVariable>();
		ArrayList<TypeVariable> tvs = new ArrayList<TypeVariable>();
		ClassDecl cd = getClassDecl();
		Collection<Access> cd_uses = cd.uses();
		for(TypeAccess ta : typeVarAccesses()) {
			TypeVariable tv = (TypeVariable)ta.decl();
			if(tv.owner() == enclosingBodyDecl()) {
				TypeVariable tv2 = tvmap.get(tv);
				if(tv2 == null) {
					if(!cd.isGenericType())
						setClassDecl(cd = new GenericClassDecl(cd.getModifiers(), cd.getID(), cd.getSuperClassAccessOpt(), cd.getImplementsList(), cd.getBodyDeclList(), new List<TypeVariable>()));
					GenericClassDecl gcd = (GenericClassDecl)cd;
					gcd.addTypeParameter(tv2 = (TypeVariable)tv.fullCopyAndDetach());
					tvmap.put(tv, tv2);
					tvs.add(tv);
				}
				ta.lock(tv2);
			}
		}
		if(tvs.size() > 0) {
			for(Access tacc : cd_uses) {
				if(tacc instanceof ParTypeAccess) {
					ParTypeAccess ptacc = (ParTypeAccess)tacc;
					for(TypeVariable tv : tvs)
						ptacc.addTypeArgument(tv.createLockedAccess());
				} else {
					List<Access> parms = new List<Access>();
					for(TypeVariable tv : tvs)
						parms.add(tv.createLockedAccess());
					int idx = tacc.getChildIndex();
					ASTNode parent = tacc.getParent();
					parent.setChild(new ParTypeAccess(tacc, parms), idx);
				}
			}
			enclosingBodyDecl().flushCaches();
		}
		return cd;
	}
  /**
   * @ast method 
   * @aspect LocalClassToMemberClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/LocalClassToMemberClass.jrag:2
   */
  public MemberTypeDecl promoteToMemberClass(boolean makePublic) {
		Program root = programRoot();
		// close over accesses to local variables
		closeOverTypeVariables();
		closeOverLocalVariables();
		ClassDecl cd = getClassDecl();
		if(!cd.enclosingType().isLocalClass() && !cd.enclosingType().isAnonymous()) {
			int vis = makePublic ? VIS_PUBLIC : VIS_PRIVATE;
			cd.setVisibility(vis);
			// for Eclipse compatibility
			for(ConstructorDecl ctor : (Collection<ConstructorDecl>)cd.constructors())
				ctor.setVisibility(vis);
		}
		if(cd.inStaticContext())
			cd.getModifiers().addModifier("static");
		// lock names
		root.lockNames(cd.name());
		cd.lockAllNames();
		// move
		TypeDecl encl = cd.enclosingType();
		enclosingBlock().removeStmt(this);
		return encl.insertUnusedType(cd, 0);
	}
  /**
   * @ast method 
   * @aspect LocalClassToMemberClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/LocalClassToMemberClass.jrag:26
   */
  public MemberTypeDecl doPromoteToMemberClass(boolean makePublic) {
		Program root = programRoot();
		MemberTypeDecl mtd = promoteToMemberClass(makePublic);
		root.eliminate(FRESH_VARIABLES, LOCKED_NAMES);
		return mtd;
	}
  /**
   * @ast method 
   * @aspect LocalClassToMemberClass
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypePromotion/LocalClassToMemberClass.jrag:33
   */
  public MemberTypeDecl doPromoteToMemberClass() {
		return doPromoteToMemberClass(false);
	}
  /**
   * @ast method 
   * 
   */
  public LocalClassDeclStmt() {
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
  }
  /**
   * @ast method 
   * 
   */
  public LocalClassDeclStmt(ClassDecl p0) {
    setChild(p0, 0);
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
   * Replaces the ClassDecl child.
   * @param node The new node to replace the ClassDecl child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setClassDecl(ClassDecl node) {
    setChild(node, 0);
  }
  /**
   * Retrieves the ClassDecl child.
   * @return The current node used as the ClassDecl child.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public ClassDecl getClassDecl() {
    return (ClassDecl)getChild(0);
  }
  /**
   * Retrieves the ClassDecl child.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The current node used as the ClassDecl child.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public ClassDecl getClassDeclNoTransform() {
    return (ClassDecl)getChildNoTransform(0);
  }
  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:490
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
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:873
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
  private boolean isDUafter_compute(Variable v) {  return isDUbefore(v);  }
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean canCompleteNormally_value;
  /**
   * @attribute syn
   * @aspect UnreachableStatements
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/UnreachableStatements.jrag:40
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean canCompleteNormally() {
    if(canCompleteNormally_computed) {
      return canCompleteNormally_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    canCompleteNormally_value = canCompleteNormally_compute();
      if(isFinal && num == state().boundariesCrossed) canCompleteNormally_computed = true;
    return canCompleteNormally_value;
  }
  /**
   * @apilevel internal
   */
  private boolean canCompleteNormally_compute() {  return reachable();  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:543
   * @apilevel internal
   */
  public boolean Define_boolean_isLocalClass(ASTNode caller, ASTNode child) {
    if(caller == getClassDeclNoTransform()) {
      return true;
    }
    else {      return getParent().Define_boolean_isLocalClass(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
