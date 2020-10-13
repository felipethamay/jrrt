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
 * @production ThisAccess : {@link Access} ::= <span class="component">&lt;ID:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:27
 */
public class ThisAccess extends Access implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
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
  public ThisAccess clone() throws CloneNotSupportedException {
    ThisAccess node = (ThisAccess)super.clone();
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
  public ThisAccess copy() {
    try {
      ThisAccess node = (ThisAccess) clone();
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
  public ThisAccess fullCopy() {
    ThisAccess tree = (ThisAccess) copy();
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:502
   */
  public void toString(StringBuffer s) {
    s.append("this");
  }
  /**
   * @ast method 
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:103
   */
  public void nameCheck() {
    // 8.8.5.1
    if(inExplicitConstructorInvocation() && hostType() == type())
      error("this may not be accessed in an explicit constructor invocation");
    else if(isQualified()) {
      // 15.8.4
      if(inStaticContext())
        error("qualified this may not occur in static context");
      else if(!hostType().isInnerTypeOf(decl()) && hostType() != decl())
        error("qualified this must name an enclosing type: " + getParent());
    }
    // 8.4.3.2
    else if(!isQualified() && inStaticContext())
      error("this may not be accessed in static context: " + enclosingStmt());
  }
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:81
   */
  
	
	// remove or simplify "this" or "super" qualifiers marked "synthetic"
	private boolean synthetic = false;
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:83
   */
  public ThisAccess(boolean synthetic) {
		this("this");
		this.synthetic = synthetic;
	}
  /**
   * @ast method 
   * @aspect InlineMethodAccess
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/InlineMethod/InlineMethodAccess.jrag:97
   */
  public void removeSyntheticThis() {
		if(synthetic && hasNextAccess()) {
			Access acc = nextAccess();
			boolean canRemove = false;
			if(acc instanceof VarAccess) {
				canRemove = true;
				((VarAccess)acc).lock();
			} else if(acc instanceof MethodAccess) {
				canRemove = true;
				((MethodAccess)acc).lock();
			} else if(acc instanceof ClassInstanceExpr) {
				canRemove = true;
				Access tacc = ((ClassInstanceExpr)acc).getAccess();
				((TypeAccess)tacc.lastAccess()).lock();
			} else if(acc instanceof ConstructorAccess) {
				canRemove = true;
			}
			this.bundleQualifier();
			if(canRemove) {
				if(isLeftChildOfDot()) {
					replace(getParent()).with(parentDot().getRight());
				} else if(isRightChildOfDot()) {
					AbstractDot parent = (AbstractDot)getParent();
					if(parent.isLeftChildOfDot())
						replace(parent.getParent()).with(parent.parentDot().getRight());
				}
			}
		}
	}
  /**
   * @ast method 
   * @aspect PullUpMethod
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/PullUp/PullUpMethod.jrag:104
   */
  protected void collectThisAccesses(Collection<ThisAccess> res) {
		res.add(this);
		super.collectThisAccesses(res);
	}
  /**
   * @ast method 
   * @aspect CollectTypeConstraints
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/TypeConstraints/CollectTypeConstraints.jrag:258
   */
  protected void collectTypeConstraints(Predicate<? super TypeConstraint> pred, Collection<TypeConstraint> constraints) {
		if(this.isQualified())
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "qualified this", this, Operator.EQ, this.type()));
		else
			addConstraint(constraints, pred, new SimpleTypeConstraint(this, "unqualified this", this, Operator.EQ, hostBodyDecl()));
		super.collectTypeConstraints(pred, constraints);
	}
  /**
   * @ast method 
   * 
   */
  public ThisAccess() {
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
  public ThisAccess(String p0) {
    setID(p0);
  }
  /**
   * @ast method 
   * 
   */
  public ThisAccess(beaver.Symbol p0) {
    setID(p0);
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
   * Replaces the lexeme ID.
   * @param value The new value for the lexeme ID.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void refined__ThisAccess_setID(String value) {
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
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:333
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__ThisAccess_setID(oldValue);
				}
				@Override
				public String toString() {
					return "ThisAccess.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ThisAccess_setID(value);
				}
			});
		}
		refined__ThisAccess_setID(value);
	}
  /**
   * @ast method 
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:250
   */
  private TypeDecl refined_TypeScopePropagation_ThisAccess_decl()
{ return isQualified() ? qualifier().type() : hostType(); }
  /**
   * @attribute syn
   * @aspect TypeScopePropagation
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/LookupType.jrag:248
   */
  public SimpleSet decls() {
    ASTNode$State state = state();
    try {  return SimpleSet.emptySet;  }
    finally {
    }
  }
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
   * @aspect GenericsTypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:320
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
  private TypeDecl decl_compute() {
    TypeDecl typeDecl = refined_TypeScopePropagation_ThisAccess_decl();
    if(typeDecl instanceof ParTypeDecl)
      typeDecl = ((ParTypeDecl)typeDecl).genericDecl();
    return typeDecl;
  }
  /**
   * @attribute syn
   * @aspect AccessTypes
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ResolveAmbiguousNames.jrag:31
   */
  public boolean isThisAccess() {
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
    try {  return NameType.TYPE_NAME;  }
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
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:287
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
   * @aspect ExprExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ExprExt.jrag:85
   */
  public Expr convertThisToSuper() {
    ASTNode$State state = state();
    try {  return new SuperAccess(true);  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect TypeHierarchyCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeHierarchyCheck.jrag:125
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean inExplicitConstructorInvocation() {
    ASTNode$State state = state();
    boolean inExplicitConstructorInvocation_value = getParent().Define_boolean_inExplicitConstructorInvocation(this, null);
    return inExplicitConstructorInvocation_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
