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
 * @production Access : {@link Expr};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:14
 */
public abstract class Access extends Expr implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    prevExpr_computed = false;
    prevExpr_value = null;
    hasPrevExpr_computed = false;
    type_computed = false;
    type_value = null;
    getLocation_computed = false;
    getLocation_value = null;
    reachedUsesFor_Location_values = null;
    accessibilityConstraints_computed = false;
    accessibilityConstraints_value = null;
    makesAnticipated_VariableDeclaration_values = null;
    killsAnticipated_VariableDeclaration_values = null;
    qualifiesMethodAccess_computed = false;
    modifyingAssignExpr_computed = false;
    modifyingAssignExpr_value = null;
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
  public Access clone() throws CloneNotSupportedException {
    Access node = (Access)super.clone();
    node.prevExpr_computed = false;
    node.prevExpr_value = null;
    node.hasPrevExpr_computed = false;
    node.type_computed = false;
    node.type_value = null;
    node.getLocation_computed = false;
    node.getLocation_value = null;
    node.reachedUsesFor_Location_values = null;
    node.accessibilityConstraints_computed = false;
    node.accessibilityConstraints_value = null;
    node.makesAnticipated_VariableDeclaration_values = null;
    node.killsAnticipated_VariableDeclaration_values = null;
    node.qualifiesMethodAccess_computed = false;
    node.modifyingAssignExpr_computed = false;
    node.modifyingAssignExpr_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:148
   */
  public Access addArrayDims(List list) {
    Access a = this;
    for(int i = 0; i < list.getNumChildNoTransform(); i++) {
      Dims dims = (Dims)list.getChildNoTransform(i);
      Opt opt = dims.getExprOpt();
      if(opt.getNumChildNoTransform() == 1)
        a = new ArrayTypeWithSizeAccess(a, (Expr)opt.getChildNoTransform(0));
      else
        a = new ArrayTypeAccess(a);
      a.setStart(dims.start());
      a.setEnd(dims.end());
    }
    return a;
  }
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:87
   */
  public Collection<Location> locationsRead(Collection<Location> res) {
		if(isSource() && getLocation() != null)
			res.add(getLocation());
		return super.locationsRead(res);
	}
  /**
   * @ast method 
   * @aspect Alias
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:100
   */
  public Collection<Location> locationsWritten(Collection<Location> res) {
		if(isDef() && getLocation() != null)
			res.add(getLocation());
		return super.locationsWritten(res);
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:9
   */
  public SmallSet<CFGNode> reachingDefinitions() {
		Location l = getLocation();
		if(!isSource() || l == null)
			return SmallSet.<CFGNode>empty();
		// we don't want the node to be its own reaching definition
		SmallSet<CFGNode> res = SmallSet.<CFGNode>empty();
		for(CFGNode p : pred())
			res = res.union(p.reachingDefinitionsFor(l));
		return res;
	}
  /**
   * @ast method 
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:30
   */
  public SmallSet<Access> reachedUses() {
		Location l = getLocation();
		if(!isDest() || l == null)
			return SmallSet.<Access>empty();
		// we don't want the node to be its own reached use
		SmallSet<Access> res = SmallSet.<Access>empty();
		for(CFGNode p : succ())
			res = res.union(p.reachedUsesFor(l));
		return res;
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:88
   */
  protected void qualifyWith(Expr qual) {
		ASTNode parent = getParent();
		int idx = parent.getIndexOfChild(this);
		parent.setChild(qual.qualifiesAccess(this), idx);
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:167
   */
  public void bundleQualifier() {
		if(isLeftChildOfDot()) {
			AbstractDot parent = parentDot();
			if(!parent.isRightChildOfDot())
				return;
			AbstractDot g = new AbstractDot(null, parent.getRight());
			AbstractDot p = parent.parentDot();
			p.setRight(this);
			while(p.isRightChildOfDot())
				p = p.parentDot();
			p.rotateLeft();
			p.replaceWith(g);
			g.setLeft(p);
		} else if(isRightChildOfDot()) {
			AbstractDot p = parentDot();
			while(p.isRightChildOfDot())
				p = p.parentDot();
			p.rotateLeft();
		}
	}
  /**
   * @ast method 
   * @aspect AST
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/AST.jrag:188
   */
  public Expr getQualifier() {
		assert !hasParentDot() || 
			(isLeftChildOfDot() && (!parentDot().hasParentDot() || parentDot().isLeftChildOfDot())) ||
			isRightChildOfDot(); // i.e., is rotated to left
		return isRightChildOfDot() ? parentDot().getLeft() : null;
	}
  /**
   * @ast method 
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:19
   */
  protected void collectAccessibilityConstraints(Collection<AccessibilityConstraint> res) { }
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:7
   */
  
	
	protected SmallSet<CFGNode> lockedReachingDefs = null;
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:9
   */
  public void lockReachingDefs() {
		if(lockedReachingDefs == null)
			lockedReachingDefs = reachingDefinitions();
	}
  /**
   * @ast method 
   * @aspect DataFlow
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Flow/DataFlow.jrag:47
   */
  public void unlockDataFlow() {
		if(lockedReachingDefs != null) {
			if(hostType() != null)
				hostType().flushCollectionCache();
			if(!reachingDefinitions().equals(lockedReachingDefs))
				throw new RefactoringException("couldn't preserve data flow");
			lockedReachingDefs = null;
		}
		super.unlockDataFlow();
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:150
   */
  public void unqualify() {
		bundleQualifier();
		if(isRightChildOfDot())
			replace(getParent()).with(this);
	}
  /**
   * @ast method 
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:110
   */
  public boolean makesUnavailable(ASTNode e) {
		if(getLocation() != null)
			for(Location l : (Collection<Location>)e.locationsWritten())
				if(getLocation().mayAlias(l))
					return true;
		return super.makesUnavailable(e);
	}
  /**
   * @ast method 
   * @aspect AnonymousMethods
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/AnonymousMethods.jrag:44
   */
  public boolean isDeclaredClosureException() {
		if(!(getParent().getParent() instanceof AnonymousMethod))
			return false;
		return ((AnonymousMethod)getParent().getParent()).getExceptions() == getParent();
	}
  /**
   * @ast method 
   * @aspect LockedTypeAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/LockedTypeAccess.jrag:131
   */
  public ASTNode lock() { return this; }
  /**
   * @ast method 
   * 
   */
  public Access() {
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
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:17
   */
  public Expr unqualifiedScope() {
    ASTNode$State state = state();
    try {  return isQualified() ? nestedScope() : this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:58
   */
  public boolean isQualified() {
    ASTNode$State state = state();
    try {  return hasPrevExpr();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:61
   */
  public Expr qualifier() {
    ASTNode$State state = state();
    try {  return prevExpr();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:66
   */
  public Access lastAccess() {
    ASTNode$State state = state();
    try {  return this;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean prevExpr_computed = false;
  /**
   * @apilevel internal
   */
  protected Expr prevExpr_value;
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:78
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr prevExpr() {
    if(prevExpr_computed) {
      return prevExpr_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    prevExpr_value = prevExpr_compute();
      if(isFinal && num == state().boundariesCrossed) prevExpr_computed = true;
    return prevExpr_value;
  }
  /**
   * @apilevel internal
   */
  private Expr prevExpr_compute() {
    if(isLeftChildOfDot()) {
      if(parentDot().isRightChildOfDot())
        return parentDot().parentDot().leftSide();
    }
    else if(isRightChildOfDot())
      return parentDot().leftSide();
    throw new Error(this + " does not have a previous expression");
  }
  /**
   * @apilevel internal
   */
  protected boolean hasPrevExpr_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean hasPrevExpr_value;
  /**
   * @attribute syn
   * @aspect QualifiedNames
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:89
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasPrevExpr() {
    if(hasPrevExpr_computed) {
      return hasPrevExpr_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    hasPrevExpr_value = hasPrevExpr_compute();
      if(isFinal && num == state().boundariesCrossed) hasPrevExpr_computed = true;
    return hasPrevExpr_value;
  }
  /**
   * @apilevel internal
   */
  private boolean hasPrevExpr_compute() {
    if(isLeftChildOfDot()) {
      if(parentDot().isRightChildOfDot())
        return true;
    }
    else if(isRightChildOfDot())
      return true;
    return false;
  }
  /**
   * @attribute syn
   * @aspect SyntacticClassification
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/SyntacticClassification.jrag:56
   */
  public NameType predNameType() {
    ASTNode$State state = state();
    try {  return NameType.NO_NAME;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:278
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
  private TypeDecl type_compute() {  return unknownType();  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Alias.jrag:52
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
  private Location getLocation_compute() {  return null;  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:2
   */
  public boolean isDef() {
    ASTNode$State state = state();
    try {  return isDest();  }
    finally {
    }
  }
  protected java.util.Map reachedUsesFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:75
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
		if(isReachedUseFor(l))
			res = SmallSet.singleton((Access)this);
		if(isBlockingDefinitionFor(l))
			return res;
		for(CFGNode s : succ())
			res = res.union(s.reachedUsesFor(l));
		return res;		
	}
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:90
   */
  public boolean isReachingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return isDest() && l.mayAlias(getLocation());  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:91
   */
  public boolean isBlockingDefinitionFor(Location l) {
    ASTNode$State state = state();
    try {  return isDest() && l.mustAlias(getLocation());  }
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
    try {  return isSource() && l.mayAlias(getLocation());  }
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
    try {  return hostType().enclosingInstanceQualifier(td, true);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:94
   */
  public boolean isParameterType() {
    ASTNode$State state = state();
    try {  return isTypeAccess() && getParent() instanceof ParameterDeclaration;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Precedence
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Precedence.jrag:2
   */
  public int precedence() {
    ASTNode$State state = state();
    try {  return 0;  }
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
    try {  return true;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean accessibilityConstraints_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<AccessibilityConstraint> accessibilityConstraints_value;
  /**
   * @attribute syn
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<AccessibilityConstraint> accessibilityConstraints() {
    if(accessibilityConstraints_computed) {
      return accessibilityConstraints_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    accessibilityConstraints_value = accessibilityConstraints_compute();
      if(isFinal && num == state().boundariesCrossed) accessibilityConstraints_computed = true;
    return accessibilityConstraints_value;
  }
  /**
   * @apilevel internal
   */
  private Collection<AccessibilityConstraint> accessibilityConstraints_compute() {
		Collection<AccessibilityConstraint> res = new LinkedList<AccessibilityConstraint>();
		collectAccessibilityConstraints(res);
		return res;
	}
  protected java.util.Map makesAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:82
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
  private boolean makesAnticipated_compute(VariableDeclaration v) {  return isSource() && v == getLocation();  }
  protected java.util.Map killsAnticipated_VariableDeclaration_values;
  /**
   * @attribute syn
   * @aspect InlineAssignment
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineTemp/InlineAssignment.jrag:85
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
  private boolean killsAnticipated_compute(VariableDeclaration v) {  return isDest() && v == getLocation();  }
  /**
   * @apilevel internal
   */
  protected boolean qualifiesMethodAccess_computed = false;
  /**
   * @apilevel internal
   */
  protected boolean qualifiesMethodAccess_value;
  /**
   * @attribute syn
   * @aspect With
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/With.jrag:248
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean qualifiesMethodAccess() {
    if(qualifiesMethodAccess_computed) {
      return qualifiesMethodAccess_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    qualifiesMethodAccess_value = qualifiesMethodAccess_compute();
      if(isFinal && num == state().boundariesCrossed) qualifiesMethodAccess_computed = true;
    return qualifiesMethodAccess_value;
  }
  /**
   * @apilevel internal
   */
  private boolean qualifiesMethodAccess_compute() {  return hasParentDot() && parentDot().isMethodAccess();  }
  /**
   * @attribute inh
   * @aspect LookupMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupMethod.jrag:18
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Expr nestedScope() {
    ASTNode$State state = state();
    Expr nestedScope_value = getParent().Define_Expr_nestedScope(this, null);
    return nestedScope_value;
  }
  /**
   * @attribute inh
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:221
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl unknownType() {
    ASTNode$State state = state();
    TypeDecl unknownType_value = getParent().Define_TypeDecl_unknownType(this, null);
    return unknownType_value;
  }
  /**
   * @attribute inh
   * @aspect VariableScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupVariable.jrag:239
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Variable unknownField() {
    ASTNode$State state = state();
    Variable unknownField_value = getParent().Define_Variable_unknownField(this, null);
    return unknownField_value;
  }
  /**
   * @attribute inh
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:268
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean withinSuppressWarnings(String s) {
    ASTNode$State state = state();
    boolean withinSuppressWarnings_String_value = getParent().Define_boolean_withinSuppressWarnings(this, null, s);
    return withinSuppressWarnings_String_value;
  }
  /**
   * @attribute inh
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:372
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean withinDeprecatedAnnotation() {
    ASTNode$State state = state();
    boolean withinDeprecatedAnnotation_value = getParent().Define_boolean_withinDeprecatedAnnotation(this, null);
    return withinDeprecatedAnnotation_value;
  }
  /**
   * @apilevel internal
   */
  protected boolean modifyingAssignExpr_computed = false;
  /**
   * @apilevel internal
   */
  protected AssignExpr modifyingAssignExpr_value;
  /**
   * @attribute inh
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:182
   */
  @SuppressWarnings({"unchecked", "cast"})
  public AssignExpr modifyingAssignExpr() {
    if(modifyingAssignExpr_computed) {
      return modifyingAssignExpr_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    modifyingAssignExpr_value = getParent().Define_AssignExpr_modifyingAssignExpr(this, null);
      if(isFinal && num == state().boundariesCrossed) modifyingAssignExpr_computed = true;
    return modifyingAssignExpr_value;
  }
  /**
   * @attribute inh
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:13
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<MethodDecl> waitNotifyMethods() {
    ASTNode$State state = state();
    Collection<MethodDecl> waitNotifyMethods_value = getParent().Define_Collection_MethodDecl__waitNotifyMethods(this, null);
    return waitNotifyMethods_value;
  }
  /**
   * @attribute inh
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:20
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodNotify() {
    ASTNode$State state = state();
    MethodDecl methodNotify_value = getParent().Define_MethodDecl_methodNotify(this, null);
    return methodNotify_value;
  }
  /**
   * @attribute inh
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:21
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodNotifyAll() {
    ASTNode$State state = state();
    MethodDecl methodNotifyAll_value = getParent().Define_MethodDecl_methodNotifyAll(this, null);
    return methodNotifyAll_value;
  }
  /**
   * @attribute inh
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:22
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodWait() {
    ASTNode$State state = state();
    MethodDecl methodWait_value = getParent().Define_MethodDecl_methodWait(this, null);
    return methodWait_value;
  }
  /**
   * @attribute inh
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:23
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodWaitLong() {
    ASTNode$State state = state();
    MethodDecl methodWaitLong_value = getParent().Define_MethodDecl_methodWaitLong(this, null);
    return methodWaitLong_value;
  }
  /**
   * @attribute inh
   * @aspect ConcurrencyAPI
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/ConcurrencyAPI.jrag:24
   */
  @SuppressWarnings({"unchecked", "cast"})
  public MethodDecl methodWaitLongInt() {
    ASTNode$State state = state();
    MethodDecl methodWaitLongInt_value = getParent().Define_MethodDecl_methodWaitLongInt(this, null);
    return methodWaitLongInt_value;
  }
  /**
   * @attribute inh
   * @aspect FieldAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Locks/FieldAnalysis.jrag:45
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean escapes() {
    ASTNode$State state = state();
    boolean escapes_value = getParent().Define_boolean_escapes(this, null);
    return escapes_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  protected void collect_contributors_Program_accessibilityConstraints() {
    /**
   * @attribute coll
   * @aspect CollectConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/AccessibilityConstraints/CollectAccessibilityConstraints.jrag:11
   */
    {
      Program ref = (Program)(programRoot());
      if(ref != null)
        ref.Program_accessibilityConstraints_contributors().add(this);
      }    super.collect_contributors_Program_accessibilityConstraints();
  }
  protected void contributeTo_Program_Program_accessibilityConstraints(Collection<AccessibilityConstraint> collection) {
    super.contributeTo_Program_Program_accessibilityConstraints(collection);
    collection.addAll(accessibilityConstraints());
  }

}
