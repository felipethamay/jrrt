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
 * @production GenericConstructorDecl : {@link ConstructorDecl} ::= <span class="component">TypeParameter:{@link TypeVariable}*</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethods.ast:4
 */
public class GenericConstructorDecl extends ConstructorDecl implements Cloneable, GenericElement {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    lookupParConstructorDecl_ArrayList_TypeDecl__values = null;
    GenericConstructorDecl_parUses_computed = false;
    GenericConstructorDecl_parUses_value = null;
    GenericConstructorDecl_parUses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  public void flushCollectionCache() {
    super.flushCollectionCache();
    GenericConstructorDecl_parUses_computed = false;
    GenericConstructorDecl_parUses_value = null;
    GenericConstructorDecl_parUses_contributors = null;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public GenericConstructorDecl clone() throws CloneNotSupportedException {
    GenericConstructorDecl node = (GenericConstructorDecl)super.clone();
    node.lookupParConstructorDecl_ArrayList_TypeDecl__values = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @apilevel internal
   */
  @SuppressWarnings({"unchecked", "cast"})
  public GenericConstructorDecl copy() {
    try {
      GenericConstructorDecl node = (GenericConstructorDecl) clone();
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
  public GenericConstructorDecl fullCopy() {
    GenericConstructorDecl tree = (GenericConstructorDecl) copy();
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
   * @aspect GenericMethodsPrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethods.jrag:258
   */
  public void toString(StringBuffer s) {
    s.append(indent());
    getModifiers().toString(s);

    s.append(" <");
    for(int i = 0; i < getNumTypeParameter(); i++) {
      if(i != 0) s.append(", ");
      original().getTypeParameter(i).toString(s);
    }
    s.append("> ");

    s.append(getID() + "(");
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
      s.append(indent());
      getConstructorInvocation().toString(s);
    }
    for(int i = 0; i < getBlock().getNumStmt(); i++) {
      s.append(indent());
      getBlock().getStmt(i).toString(s);
    }
    s.append(indent());
    s.append("}");
  }
  /**
   * @ast method 
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1280
   */
  
  public GenericConstructorDecl original;
  /**
   * @ast method 
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:60
   */
  public Collection<Access> usesOfAllCopies() {
		Collection<Access> res = super.usesOfAllCopies();
		res.addAll(parUses());
		return res;
	}
  /**
   * @ast method 
   * @aspect RTXF
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/tests/RTXF.jrag:260
   */
  public String rtxfId() {
		return super.rtxfId();
	}
  /**
   * @ast method 
   * 
   */
  public GenericConstructorDecl() {
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
    children = new ASTNode[6];
    setChild(new List(), 1);
    setChild(new List(), 2);
    setChild(new Opt(), 3);
    setChild(new List(), 5);
  }
  /**
   * @ast method 
   * 
   */
  public GenericConstructorDecl(Modifiers p0, String p1, List<ParameterDeclaration> p2, List<Access> p3, Opt<Stmt> p4, Block p5, List<TypeVariable> p6) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
    setChild(p6, 5);
  }
  /**
   * @ast method 
   * 
   */
  public GenericConstructorDecl(Modifiers p0, beaver.Symbol p1, List<ParameterDeclaration> p2, List<Access> p3, Opt<Stmt> p4, Block p5, List<TypeVariable> p6) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
    setChild(p3, 2);
    setChild(p4, 3);
    setChild(p5, 4);
    setChild(p6, 5);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 6;
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
  public void refined__GenericConstructorDecl_setID(String value) {
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
   * Replaces the TypeParameter list.
   * @param list The new list node to be used as the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeParameterList(List<TypeVariable> list) {
    setChild(list, 5);
  }
  /**
   * Retrieves the number of children in the TypeParameter list.
   * @return Number of children in the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public int getNumTypeParameter() {
    return getTypeParameterList().getNumChild();
  }
  /**
   * Retrieves the number of children in the TypeParameter list.
   * Calling this method will not trigger rewrites..
   * @return Number of children in the TypeParameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public int getNumTypeParameterNoTransform() {
    return getTypeParameterListNoTransform().getNumChildNoTransform();
  }
  /**
   * Retrieves the element at index {@code i} in the TypeParameter list..
   * @param i Index of the element to return.
   * @return The element at position {@code i} in the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeVariable getTypeParameter(int i) {
    return (TypeVariable)getTypeParameterList().getChild(i);
  }
  /**
   * Append an element to the TypeParameter list.
   * @param node The element to append to the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void addTypeParameter(TypeVariable node) {
    List<TypeVariable> list = (parent == null || state == null) ? getTypeParameterListNoTransform() : getTypeParameterList();
    list.addChild(node);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  public void addTypeParameterNoTransform(TypeVariable node) {
    List<TypeVariable> list = getTypeParameterListNoTransform();
    list.addChild(node);
  }
  /**
   * Replaces the TypeParameter list element at index {@code i} with the new node {@code node}.
   * @param node The new node to replace the old list element.
   * @param i The list index of the node to be replaced.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setTypeParameter(TypeVariable node, int i) {
    List<TypeVariable> list = getTypeParameterList();
    list.setChild(node, i);
  }
  /**
   * Retrieves the TypeParameter list.
   * @return The node representing the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public List<TypeVariable> getTypeParameters() {
    return getTypeParameterList();
  }
  /**
   * Retrieves the TypeParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypeParameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  public List<TypeVariable> getTypeParametersNoTransform() {
    return getTypeParameterListNoTransform();
  }
  /**
   * Retrieves the TypeParameter list.
   * @return The node representing the TypeParameter list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeVariable> getTypeParameterList() {
    List<TypeVariable> list = (List<TypeVariable>)getChild(5);
    list.getNumChild();
    return list;
  }
  /**
   * Retrieves the TypeParameter list.
   * <p><em>This method does not invoke AST transformations.</em></p>
   * @return The node representing the TypeParameter list.
   * @apilevel low-level
   * @ast method 
   * 
   */
  @SuppressWarnings({"unchecked", "cast"})
  public List<TypeVariable> getTypeParameterListNoTransform() {
    return (List<TypeVariable>)getChildNoTransform(5);
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:883
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__GenericConstructorDecl_setID(oldValue);
				}
				@Override
				public String toString() {
					return "GenericConstructorDecl.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__GenericConstructorDecl_setID(value);
				}
			});
		}
		refined__GenericConstructorDecl_setID(value);
	}
  /**
   * @attribute syn
   * @aspect GenericMethodsNameAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethods.jrag:163
   */
  public SimpleSet localLookupType(String name) {
    ASTNode$State state = state();
    try {
    for(int i = 0; i < getNumTypeParameter(); i++) {
      if(original().getTypeParameter(i).name().equals(name))
        return SimpleSet.emptySet.add(original().getTypeParameter(i));
    }
    return SimpleSet.emptySet;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1279
   */
  public GenericConstructorDecl original() {
    ASTNode$State state = state();
    try {  return original != null ? original : this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:8
   */
  public ConstructorDecl rawConstructor() {
    ASTNode$State state = state();
    try {  return lookupParConstructorDecl(new ArrayList());  }
    finally {
    }
  }
  protected java.util.Map lookupParConstructorDecl_ArrayList_TypeDecl__values;
  /**
   * @attribute syn
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:10
   */
  @SuppressWarnings({"unchecked", "cast"})
  public ConstructorDecl lookupParConstructorDecl(ArrayList<TypeDecl> list) {
    Object _parameters = list;
    if(lookupParConstructorDecl_ArrayList_TypeDecl__values == null) lookupParConstructorDecl_ArrayList_TypeDecl__values = new java.util.HashMap(4);
    if(lookupParConstructorDecl_ArrayList_TypeDecl__values.containsKey(_parameters)) {
      return (ConstructorDecl)lookupParConstructorDecl_ArrayList_TypeDecl__values.get(_parameters);
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    ConstructorDecl lookupParConstructorDecl_ArrayList_TypeDecl__value = lookupParConstructorDecl_compute(list);
      if(isFinal && num == state().boundariesCrossed) lookupParConstructorDecl_ArrayList_TypeDecl__values.put(_parameters, lookupParConstructorDecl_ArrayList_TypeDecl__value);
    return lookupParConstructorDecl_ArrayList_TypeDecl__value;
  }
  /**
   * @apilevel internal
   */
  private ConstructorDecl lookupParConstructorDecl_compute(ArrayList<TypeDecl> list) {
        for(int i = 0; i < getNumTypeParameter(); i++) {
	        ParConstructorDecl decl = (ParConstructorDecl)((ParTypeDecl)getTypeParameter(i));
	        if(decl.isRawConstructor() ? list.isEmpty() : (!list.isEmpty() && decl.sameSignature(list)))
	            return decl;
	    }
        throw new Error("not implemented yet");
	}
  /**
   * @attribute inh
   * @aspect GenericMethodsNameAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethods.jrag:162
   */
  @SuppressWarnings({"unchecked", "cast"})
  public SimpleSet lookupType(String name) {
    ASTNode$State state = state();
    SimpleSet lookupType_String_value = getParent().Define_SimpleSet_lookupType(this, null, name);
    return lookupType_String_value;
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethods.jrag:160
   * @apilevel internal
   */
  public NameType Define_NameType_nameType(ASTNode caller, ASTNode child) {
    if(caller == getTypeParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return NameType.TYPE_NAME;
  }
    else {      return super.Define_NameType_nameType(caller, child);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericMethods.jrag:170
   * @apilevel internal
   */
  public SimpleSet Define_SimpleSet_lookupType(ASTNode caller, ASTNode child, String name) {
     {
      int childIndex = this.getIndexOfChild(caller);
      return localLookupType(name).isEmpty() ? lookupType(name) : localLookupType(name);
    }
  }
  /**
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/TypeVariableExt.jrag:20
   * @apilevel internal
   */
  public GenericElement Define_GenericElement_owner(ASTNode caller, ASTNode child) {
    if(caller == getTypeParameterListNoTransform())  {
    int childIndex = caller.getIndexOfChild(child);
    return this;
  }
    else {      return getParent().Define_GenericElement_owner(this, caller);
    }
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
  /**
   * @apilevel internal
   */
  protected boolean GenericConstructorDecl_parUses_computed = false;
  /**
   * @apilevel internal
   */
  protected Collection<Access> GenericConstructorDecl_parUses_value;
  /**
   * @attribute coll
   * @aspect ConstructorExt
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ConstructorExt.jrag:81
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Collection<Access> parUses() {
    if(GenericConstructorDecl_parUses_computed) {
      return GenericConstructorDecl_parUses_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    GenericConstructorDecl_parUses_value = parUses_compute();
      if(isFinal && num == state().boundariesCrossed) GenericConstructorDecl_parUses_computed = true;
    return GenericConstructorDecl_parUses_value;
  }
  java.util.Set GenericConstructorDecl_parUses_contributors;
  public java.util.Set GenericConstructorDecl_parUses_contributors() {
    if(GenericConstructorDecl_parUses_contributors == null) GenericConstructorDecl_parUses_contributors  = new ASTNode$State.IdentityHashSet(4);
    return GenericConstructorDecl_parUses_contributors;
  }
  /**
   * @apilevel internal
   */
  private Collection<Access> parUses_compute() {
    ASTNode node = this;
    while(node.getParent() != null && !(node instanceof Program))
      node = node.getParent();
    Program root = (Program)node;
    root.collect_contributors_GenericConstructorDecl_parUses();
    GenericConstructorDecl_parUses_value = new HashSet<Access>();
    if(GenericConstructorDecl_parUses_contributors != null)
    for(java.util.Iterator iter = GenericConstructorDecl_parUses_contributors.iterator(); iter.hasNext(); ) {
      ASTNode contributor = (ASTNode)iter.next();
      contributor.contributeTo_GenericConstructorDecl_GenericConstructorDecl_parUses(GenericConstructorDecl_parUses_value);
    }
    return GenericConstructorDecl_parUses_value;
  }

}
