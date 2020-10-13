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
 * @production BodyDecl : {@link ASTNode};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:72
 */
public abstract class BodyDecl extends ASTNode<ASTNode> implements Cloneable, TypeConstraintVariable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    isDAafter_Variable_values = null;
    isDUafter_Variable_values = null;
    entry_computed = false;
    entry_value = null;
    exit_computed = false;
    exit_value = null;
    minAccess_String_TypeDecl_values = null;
    isDAbefore_Variable_values = null;
    isDUbefore_Variable_values = null;
    typeThrowable_computed = false;
    typeThrowable_value = null;
    lookupVariable_String_values = null;
    collect_contributors_VariableDeclaration_uses = false;
    collect_contributors_ParameterDeclaration_uses = false;
    collect_contributors_LabeledStmt_uses = false;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    collect_contributors_VariableDeclaration_uses = false;
    collect_contributors_ParameterDeclaration_uses = false;
    collect_contributors_LabeledStmt_uses = false;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public BodyDecl clone() throws CloneNotSupportedException {
    BodyDecl node = (BodyDecl)super.clone();
    node.isDAafter_Variable_values = null;
    node.isDUafter_Variable_values = null;
    node.entry_computed = false;
    node.entry_value = null;
    node.exit_computed = false;
    node.exit_value = null;
    node.minAccess_String_TypeDecl_values = null;
    node.isDAbefore_Variable_values = null;
    node.isDUbefore_Variable_values = null;
    node.typeThrowable_computed = false;
    node.typeThrowable_value = null;
    node.lookupVariable_String_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect BranchTarget
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BranchTarget.jrag:210
   */
  public void collectFinally(Stmt branchStmt, ArrayList list) {
    // terminate search if body declaration is reached
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1238
   */
  public BodyDecl substitutedBodyDecl(Parameterization parTypeDecl) {
    throw new Error("Operation substitutedBodyDecl not supported for " + getClass().getName());
  }
  /** Every body declaration has an entry and an exit node. We implement these as
	 *  NTAs for clarity, but this complicates the definition of pred() below.
	 *  These nodes are only placeholders that do not need to be recomputed after
	 *  a cache flush, so we cache them explicitly. * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:14
   */
  
	
	/** Every body declaration has an entry and an exit node. We implement these as
	 *  NTAs for clarity, but this complicates the definition of pred() below.
	 *  These nodes are only placeholders that do not need to be recomputed after
	 *  a cache flush, so we cache them explicitly. */
	private EntryStmt entry = new EntryStmt();
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:16
   */
  
	private ExitStmt exit = new ExitStmt();
  /**
   * @ast method 
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:44
   */
  protected void collect_contributors_CFGNode_collPred() {
    	entry().collect_contributors_CFGNode_collPred();
    	exit().collect_contributors_CFGNode_collPred();
    	super.collect_contributors_CFGNode_collPred();
    }
  /**
   * @ast method 
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:60
   */
  public void dot() {
		entry().dot();
		exit().dot();
		super.dot();
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:78
   */
  public void flushCaches() {
		entry.flushCaches();
		exit.flushCaches();
		super.flushCaches();
	}
  /**
   * @ast method 
   * @aspect Alpha
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/Alpha.jrag:37
   */
  public int minAccess(Access acc) { return minAccess(acc.hostPackage(), acc.hostType()); }
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:268
   */
  public String rtxfId() {
		return hostType().rtxfId();
	}
  /**
   * @ast method 
   * 
   */
  public BodyDecl() {
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
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:23
   */
    private boolean collect_contributors_VariableDeclaration_uses = false;
  protected void collect_contributors_VariableDeclaration_uses() {
    if(collect_contributors_VariableDeclaration_uses) return;
    super.collect_contributors_VariableDeclaration_uses();
    collect_contributors_VariableDeclaration_uses = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:29
   */
    private boolean collect_contributors_ParameterDeclaration_uses = false;
  protected void collect_contributors_ParameterDeclaration_uses() {
    if(collect_contributors_ParameterDeclaration_uses) return;
    super.collect_contributors_ParameterDeclaration_uses();
    collect_contributors_ParameterDeclaration_uses = true;
  }


  /**
   * @ast method 
   * @aspect <NoAspect>
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Uses.jrag:93
   */
    private boolean collect_contributors_LabeledStmt_uses = false;
  protected void collect_contributors_LabeledStmt_uses() {
    if(collect_contributors_LabeledStmt_uses) return;
    super.collect_contributors_LabeledStmt_uses();
    collect_contributors_LabeledStmt_uses = true;
  }


  protected java.util.Map isDAafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:243
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
  private boolean isDAafter_compute(Variable v) {  return true;  }
  protected java.util.Map isDUafter_Variable_values;
  /**
   * @attribute syn
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:708
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
  private boolean isDUafter_compute(Variable v) {  return true;  }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:479
   */
  public boolean declaresType(String name) {
    ASTNode$State state = state();
    try {  return false;  }
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
    try {  return null;  }
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
    try {  return true;  }
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
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:326
   */
  public boolean isDeprecated() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Enums
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Enums.jrag:26
   */
  public boolean isEnumConstant() {
    ASTNode$State state = state();
    try {  return false;  }
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
    try {  return true;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean entry_computed = false;
  /**
   * @apilevel internal
   */
  protected Stmt entry_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt entry() {
    if(entry_computed) {
      return entry_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    entry_value = entry_compute();
    entry_value.setParent(this);
    entry_value.is$Final = true;
      if(true) entry_computed = true;
    return entry_value;
  }
  /**
   * @apilevel internal
   */
  private Stmt entry_compute() {  return entry;  }
  /**
   * @apilevel internal
   */
  protected boolean exit_computed = false;
  /**
   * @apilevel internal
   */
  protected Stmt exit_value;
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:17
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Stmt exit() {
    if(exit_computed) {
      return exit_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    exit_value = exit_compute();
    exit_value.setParent(this);
    exit_value.is$Final = true;
      if(true) exit_computed = true;
    return exit_value;
  }
  /**
   * @apilevel internal
   */
  private Stmt exit_compute() {  return exit;  }
  /**
   * @attribute syn
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:100
   */
  public SmallSet<CFGNode> getFollowingFieldOrInitializer(boolean statik) {
    ASTNode$State state = state();
    try {
		BodyDecl bd = hostType().getFieldOrInitializerAfter(getParent().getIndexOfChild(this)+1, statik);
		if(bd != null)
			return SmallSet.<CFGNode>singleton(bd.entry());
		SmallSet<CFGNode> res = SmallSet.empty();
		if(!statik)
			for(ConstructorDecl cd : (Collection<ConstructorDecl>)hostType().constructors())
				if(cd.invokesSuperConstructor())
					res = res.union(cd.getBlock().first());
		return res;
	}
    finally {
    }
  }
  protected java.util.Map minAccess_String_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect Alpha
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/Alpha.jrag:24
   */
  @SuppressWarnings({"unchecked", "cast"})
  public int minAccess(String pkg, TypeDecl type) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(pkg);
    _parameters.add(type);
    if(minAccess_String_TypeDecl_values == null) minAccess_String_TypeDecl_values = new java.util.HashMap(4);
    if(minAccess_String_TypeDecl_values.containsKey(_parameters)) {
      return ((Integer)minAccess_String_TypeDecl_values.get(_parameters)).intValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    int minAccess_String_TypeDecl_value = minAccess_compute(pkg, type);
      if(isFinal && num == state().boundariesCrossed) minAccess_String_TypeDecl_values.put(_parameters, Integer.valueOf(minAccess_String_TypeDecl_value));
    return minAccess_String_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private int minAccess_compute(String pkg, TypeDecl type) {
		if(type != null && this.hostType().topLevelType() == type.topLevelType())
			return ASTNode.VIS_PRIVATE;
		if(pkg.equals(this.hostType().hostPackage()))
			return ASTNode.VIS_PACKAGE;
		if(type != null && type.withinBodyThatSubclasses(hostType()) != null)
			return ASTNode.VIS_PROTECTED;
		return ASTNode.VIS_PUBLIC;
	}
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:184
   */
  public TypeDecl getConstrainedType() {
    ASTNode$State state = state();
    try {  return hostType();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:185
   */
  public String describeConstraintVariable() {
    ASTNode$State state = state();
    try {  return "Decl(" + toString() + ")";  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/TypeConstraints.jrag:186
   */
  public boolean isFixed() {
    ASTNode$State state = state();
    try {  return true;  }
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
    try {  return "";  }
    finally {
    }
  }
  protected java.util.Map isDAbefore_Variable_values;
  /**
   * @attribute inh
   * @aspect DA
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:242
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDAbefore(Variable v) {
    Object _parameters = v;
    if(isDAbefore_Variable_values == null) isDAbefore_Variable_values = new java.util.HashMap(4);
    if(isDAbefore_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDAbefore_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDAbefore_Variable_value = getParent().Define_boolean_isDAbefore(this, null, v);
      if(isFinal && num == state().boundariesCrossed) isDAbefore_Variable_values.put(_parameters, Boolean.valueOf(isDAbefore_Variable_value));
    return isDAbefore_Variable_value;
  }
  protected java.util.Map isDUbefore_Variable_values;
  /**
   * @attribute inh
   * @aspect DU
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/DefiniteAssignment.jrag:707
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isDUbefore(Variable v) {
    Object _parameters = v;
    if(isDUbefore_Variable_values == null) isDUbefore_Variable_values = new java.util.HashMap(4);
    if(isDUbefore_Variable_values.containsKey(_parameters)) {
      return ((Boolean)isDUbefore_Variable_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean isDUbefore_Variable_value = getParent().Define_boolean_isDUbefore(this, null, v);
      if(isFinal && num == state().boundariesCrossed) isDUbefore_Variable_values.put(_parameters, Boolean.valueOf(isDUbefore_Variable_value));
    return isDUbefore_Variable_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean typeThrowable_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl typeThrowable_value;
  /**
   * @attribute inh
   * @aspect ExceptionHandling
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ExceptionHandling.jrag:22
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeThrowable() {
    if(typeThrowable_computed) {
      return typeThrowable_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    typeThrowable_value = getParent().Define_TypeDecl_typeThrowable(this, null);
      if(isFinal && num == state().boundariesCrossed) typeThrowable_computed = true;
    return typeThrowable_value;
  }
  /**
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:25
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection lookupMethod(String name) {
    ASTNode$State state = state();
    Collection lookupMethod_String_value = getParent().Define_Collection_lookupMethod(this, null, name);
    return lookupMethod_String_value;
  }
  /**
   * @attribute inh
   * @aspect LookupFullyQualifiedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:97
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupType(String packageName, String typeName) {
    ASTNode$State state = state();
    TypeDecl lookupType_String_String_value = getParent().Define_TypeDecl_lookupType(this, null, packageName, typeName);
    return lookupType_String_String_value;
  }
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:261
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupType(String name) {
    ASTNode$State state = state();
    SimpleSet lookupType_String_value = getParent().Define_SimpleSet_lookupType(this, null, name);
    return lookupType_String_value;
  }
  protected java.util.Map lookupVariable_String_values;
  /**
   * @attribute inh
   * @aspect VariableScope
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:15
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupVariable(String name) {
    Object _parameters = name;
    if(lookupVariable_String_values == null) lookupVariable_String_values = new java.util.HashMap(4);
    if(lookupVariable_String_values.containsKey(_parameters)) {
      return (SimpleSet)lookupVariable_String_values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    SimpleSet lookupVariable_String_value = getParent().Define_SimpleSet_lookupVariable(this, null, name);
      if(isFinal && num == state().boundariesCrossed) lookupVariable_String_values.put(_parameters, lookupVariable_String_value);
    return lookupVariable_String_value;
  }
  /**
   * @attribute inh
   * @aspect SyntacticClassification
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:21
   */
  @SuppressWarnings({"unchecked", "cast"})
  public NameType nameType() {
    ASTNode$State state = state();
    NameType nameType_value = getParent().Define_NameType_nameType(this, null);
    return nameType_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:566
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String hostPackage() {
    ASTNode$State state = state();
    String hostPackage_value = getParent().Define_String_hostPackage(this, null);
    return hostPackage_value;
  }
  /**
   * @attribute inh
   * @aspect NestedTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:585
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl hostType() {
    ASTNode$State state = state();
    TypeDecl hostType_value = getParent().Define_TypeDecl_hostType(this, null);
    return hostType_value;
  }
  /**
   * @attribute inh
   * @aspect AccessMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessMethod.jrag:79
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodAccessInfo accessMethod(MethodDecl md) {
    ASTNode$State state = state();
    MethodAccessInfo accessMethod_MethodDecl_value = getParent().Define_MethodAccessInfo_accessMethod(this, null, md);
    return accessMethod_MethodDecl_value;
  }
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:131
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SymbolicVarAccess accessVariable(Variable decl) {
    ASTNode$State state = state();
    SymbolicVarAccess accessVariable_Variable_value = getParent().Define_SymbolicVarAccess_accessVariable(this, null, decl);
    return accessVariable_Variable_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:353
   * @apilevel internal
   */
  public String Define_String_typeDeclIndent(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return indent();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:514
   * @apilevel internal
   */
  public BodyDecl Define_BodyDecl_enclosingBodyDecl(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return this;
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:690
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__breakTarget(ASTNode caller, ASTNode child, BreakStmt stmt) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:691
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__continueTarget(ASTNode caller, ASTNode child, ContinueStmt stmt) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.empty();
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:692
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__returnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(exit());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:693
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__throwTarget(ASTNode caller, ASTNode child, TypeDecl exn) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(exit());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:694
   * @apilevel internal
   */
  public SmallSet<CFGNode> Define_SmallSet_CFGNode__uncheckedExnTarget(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return SmallSet.<CFGNode>singleton(exit());
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:46
   * @apilevel internal
   */
  public boolean Define_boolean_escapes(ASTNode caller, ASTNode child) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return false;
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
