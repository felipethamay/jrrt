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
 * @production EntryStmt : {@link EmptyStmt};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/Nodes.ast:1
 */
public class EntryStmt extends EmptyStmt implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    dotLabel_computed = false;
    dotLabel_value = null;
    reachingDefinitionsFor_Location_values = null;
    hasReachingDefinitionBefore_Location_CFGNode_values = null;
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
  public EntryStmt clone() throws CloneNotSupportedException {
    EntryStmt node = (EntryStmt)super.clone();
    node.dotLabel_computed = false;
    node.dotLabel_value = null;
    node.reachingDefinitionsFor_Location_values = null;
    node.hasReachingDefinitionBefore_Location_CFGNode_values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public EntryStmt copy() {
    try {
      EntryStmt node = (EntryStmt) clone();
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
  public EntryStmt fullCopy() {
    EntryStmt tree = (EntryStmt) copy();
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
   * @aspect ControlFlowGraph
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ControlFlowGraph.jrag:19
   */
  public void toString(StringBuffer s) {
		s.append("<entry>");
	}
  /**
   * @ast method 
   * 
   */
  public EntryStmt() {
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
   * @apilevel internal
   */
  protected boolean dotLabel_computed = false;
  /**
   * @apilevel internal
   */
  protected String dotLabel_value;
  /**
   * @attribute syn
   * @aspect DotGeneration
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/DotGeneration.jrag:33
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String dotLabel() {
    if(dotLabel_computed) {
      return dotLabel_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    dotLabel_value = dotLabel_compute();
      if(isFinal && num == state().boundariesCrossed) dotLabel_computed = true;
    return dotLabel_value;
  }
  /**
   * @apilevel internal
   */
  private String dotLabel_compute() {
		if(getParent() instanceof ConstructorDecl) {
			return ((ConstructorDecl)getParent()).name() + ".<entry>";
		} else if(getParent() instanceof MethodDecl) {
			return ((MethodDecl)getParent()).name() + ".<entry>";
		} else {
			return "<entry>";
		}
	}
  protected java.util.Map reachingDefinitionsFor_Location_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:110
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SmallSet<CFGNode> reachingDefinitionsFor(Location l) {
    Object _parameters = l;
    if(reachingDefinitionsFor_Location_values == null) reachingDefinitionsFor_Location_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(reachingDefinitionsFor_Location_values.containsKey(_parameters)) {
      Object _o = reachingDefinitionsFor_Location_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return (SmallSet<CFGNode>)_o;
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      reachingDefinitionsFor_Location_values.put(_parameters, _value);
      _value.value = SmallSet.<CFGNode>empty();
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
        if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
          state.CHANGE = true;
          _value.value = new_reachingDefinitionsFor_Location_value;
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        reachingDefinitionsFor_Location_values.put(_parameters, new_reachingDefinitionsFor_Location_value);
      }
      else {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      state.RESET_CYCLE = true;
      reachingDefinitionsFor_compute(l);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_reachingDefinitionsFor_Location_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      SmallSet<CFGNode> new_reachingDefinitionsFor_Location_value = reachingDefinitionsFor_compute(l);
      if (state.RESET_CYCLE) {
        reachingDefinitionsFor_Location_values.remove(_parameters);
      }
      else if ((new_reachingDefinitionsFor_Location_value==null && (SmallSet<CFGNode>)_value.value!=null) || (new_reachingDefinitionsFor_Location_value!=null && !new_reachingDefinitionsFor_Location_value.equals((SmallSet<CFGNode>)_value.value))) {
        state.CHANGE = true;
        _value.value = new_reachingDefinitionsFor_Location_value;
      }
      return new_reachingDefinitionsFor_Location_value;
    }
    return (SmallSet<CFGNode>)_value.value;
  }
  /**
   * @apilevel internal
   */
  private SmallSet<CFGNode> reachingDefinitionsFor_compute(Location l) {
		SmallSet<CFGNode> res = getParent() instanceof Callable && l.isHeapLocation() ? SmallSet.<CFGNode>singleton(this) : SmallSet.<CFGNode>empty();
		if(hostType().isLocalClass()) {
			return res.union(((LocalClassDeclStmt)hostType().getParent()).reachingDefinitionsFor(l));
		} else if(hostType().isAnonymous()) {
			return res.union(((ClassInstanceExpr)hostType().getParent().getParent()).reachingDefinitionsFor(l));
		}
		//return super.reachingDefinitionsFor(l);
		for(CFGNode p : pred())
			res = res.union(p.reachingDefinitionsFor(l));
		return res;
	}
  protected java.util.Map hasReachingDefinitionBefore_Location_CFGNode_values;
  /**
   * @attribute syn
   * @aspect ReachingDefinitions
   * @declaredat /Users/melmongiovi/Documents/workspace6/ControlFlowGraph/ReachingDefinitions.jrag:170
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean hasReachingDefinitionBefore(Location l, CFGNode n) {
    java.util.List _parameters = new java.util.ArrayList(2);
    _parameters.add(l);
    _parameters.add(n);
    if(hasReachingDefinitionBefore_Location_CFGNode_values == null) hasReachingDefinitionBefore_Location_CFGNode_values = new java.util.HashMap(4);
    ASTNode$State.CircularValue _value;
    if(hasReachingDefinitionBefore_Location_CFGNode_values.containsKey(_parameters)) {
      Object _o = hasReachingDefinitionBefore_Location_CFGNode_values.get(_parameters);
      if(!(_o instanceof ASTNode$State.CircularValue)) {
        return ((Boolean)_o).booleanValue();
      }
      else
        _value = (ASTNode$State.CircularValue)_o;
    }
    else {
      _value = new ASTNode$State.CircularValue();
      hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, _value);
      _value.value = Boolean.valueOf(false);
    }
    ASTNode$State state = state();
    if (!state.IN_CIRCLE) {
      state.IN_CIRCLE = true;
      int num = state.boundariesCrossed;
      boolean isFinal = this.is$Final();
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value;
      do {
        _value.visited = new Integer(state.CIRCLE_INDEX);
        state.CHANGE = false;
        new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
        if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
          state.CHANGE = true;
          _value.value = Boolean.valueOf(new_hasReachingDefinitionBefore_Location_CFGNode_value);
        }
        state.CIRCLE_INDEX++;
      } while (state.CHANGE);
        if(isFinal && num == state().boundariesCrossed) {
        hasReachingDefinitionBefore_Location_CFGNode_values.put(_parameters, new_hasReachingDefinitionBefore_Location_CFGNode_value);
      }
      else {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      state.RESET_CYCLE = true;
      hasReachingDefinitionBefore_compute(l, n);
      state.RESET_CYCLE = false;
      }
      state.IN_CIRCLE = false; 
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    if(!new Integer(state.CIRCLE_INDEX).equals(_value.visited)) {
      _value.visited = new Integer(state.CIRCLE_INDEX);
      boolean new_hasReachingDefinitionBefore_Location_CFGNode_value = hasReachingDefinitionBefore_compute(l, n);
      if (state.RESET_CYCLE) {
        hasReachingDefinitionBefore_Location_CFGNode_values.remove(_parameters);
      }
      else if (new_hasReachingDefinitionBefore_Location_CFGNode_value!=((Boolean)_value.value).booleanValue()) {
        state.CHANGE = true;
        _value.value = new_hasReachingDefinitionBefore_Location_CFGNode_value;
      }
      return new_hasReachingDefinitionBefore_Location_CFGNode_value;
    }
    return ((Boolean)_value.value).booleanValue();
  }
  /**
   * @apilevel internal
   */
  private boolean hasReachingDefinitionBefore_compute(Location l, CFGNode n) {
		if(this == n)
			return !reachingDefinitionsFor(l).isEmpty();
		if(isBlockingDefinitionFor(l) || getParent() instanceof Callable && l.isHeapLocation())
			return false;
		if(hostType().isLocalClass()) {
			return ((LocalClassDeclStmt)hostType().getParent()).hasReachingDefinitionBefore(l, n);
		} else if(hostType().isAnonymous()) {
			return ((ClassInstanceExpr)hostType().getParent().getParent()).hasReachingDefinitionBefore(l, n);
		}
		for(CFGNode pred : pred())
			if(pred.hasReachingDefinitionBefore(l, n))
				return true;
		return false;
	}
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
