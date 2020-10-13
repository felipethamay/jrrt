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
 * @production ReferenceType : {@link TypeDecl};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:44
 */
public abstract class ReferenceType extends TypeDecl implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    narrowingConversionTo_TypeDecl_values = null;
    unboxed_computed = false;
    unboxed_value = null;
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
  public ReferenceType clone() throws CloneNotSupportedException {
    ReferenceType node = (ReferenceType)super.clone();
    node.narrowingConversionTo_TypeDecl_values = null;
    node.unboxed_computed = false;
    node.unboxed_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * 
   */
  public ReferenceType() {
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
    children = new ASTNode[2];
    setChild(new List(), 1);
  }
  /**
   * @ast method 
   * 
   */
  public ReferenceType(Modifiers p0, String p1, List<BodyDecl> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
  }
  /**
   * @ast method 
   * 
   */
  public ReferenceType(Modifiers p0, beaver.Symbol p1, List<BodyDecl> p2) {
    setChild(p0, 0);
    setID(p1);
    setChild(p2, 1);
  }
  /**
   * @apilevel low-level
   * @ast method 
   * 
   */
  protected int numChildren() {
    return 2;
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
  public void refined__ReferenceType_setID(String value) {
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
   * Replaces the BodyDecl list.
   * @param list The new list node to be used as the BodyDecl list.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setBodyDeclList(List<BodyDecl> list) {
    setChild(list, 1);
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
    List<BodyDecl> list = (List<BodyDecl>)getChild(1);
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
    return (List<BodyDecl>)getChildNoTransform(1);
  }
  /**
   * @ast method 
   * @aspect UndoSettersAutogenerated
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/undo/UndoSettersAutogenerated.jrag:465
   */
   public void setID(final String value) {
		if (Program.isRecordingASTChanges()) {
			Program.addUndoAction(new ASTModificationReplaceEdit(this.isInTree(), this, IDstart, IDend, tokenString_ID, value) {
				@Override
				public void undo() {
					refined__ReferenceType_setID(oldValue);
				}
				@Override
				public String toString() {
					return "ReferenceType.setID (ReplaceEdit)";
				}
				@Override
				public void redo() {
					if (Program.isRecordingASTChanges()) Program.addUndoAction(this);
					refined__ReferenceType_setID(value);
				}
			});
		}
		refined__ReferenceType_setID(value);
	}
  /**
   * @attribute syn
   * @aspect TypeConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:17
   */
  public boolean wideningConversionTo(TypeDecl type) {
    ASTNode$State state = state();
    try {  return instanceOf(type);  }
    finally {
    }
  }
  protected java.util.Map narrowingConversionTo_TypeDecl_values;
  /**
   * @attribute syn
   * @aspect TypeConversion
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:36
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean narrowingConversionTo(TypeDecl type) {
    Object _parameters = type;
    if(narrowingConversionTo_TypeDecl_values == null) narrowingConversionTo_TypeDecl_values = new java.util.HashMap(4);
    if(narrowingConversionTo_TypeDecl_values.containsKey(_parameters)) {
      return ((Boolean)narrowingConversionTo_TypeDecl_values.get(_parameters)).booleanValue();
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    boolean narrowingConversionTo_TypeDecl_value = narrowingConversionTo_compute(type);
      if(isFinal && num == state().boundariesCrossed) narrowingConversionTo_TypeDecl_values.put(_parameters, Boolean.valueOf(narrowingConversionTo_TypeDecl_value));
    return narrowingConversionTo_TypeDecl_value;
  }
  /**
   * @apilevel internal
   */
  private boolean narrowingConversionTo_compute(TypeDecl type) {
    if(type.instanceOf(this))
      return true;
    if(isClassDecl() && !getModifiers().isFinal() && type.isInterfaceDecl())
      return true;
    if(isInterfaceDecl() && type.isClassDecl() && !type.getModifiers().isFinal())
      return true;
    if(isInterfaceDecl() && type.instanceOf(this))
      return true;
    if(fullName().equals("java.lang.Object") && type.isInterfaceDecl())
      return true;
    // Dragons
    // TODO: Check if both are interfaces with compatible methods
    if(isArrayDecl() && type.isArrayDecl() && elementType().instanceOf(type.elementType()))
      return true;
    return false;
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:165
   */
  public boolean isReferenceType() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeWideningAndIdentity
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:482
   */
  public boolean isSupertypeOfNullType(NullType type) {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /* It is a compile-time error if the return type of a method declared in an
  annotation type is any type other than one of the following: one of the
  primitive types, String, Class and any invocation of Class, an enum type
  (\ufffd8.9), an annotation type, or an array (\ufffd10) of one of the preceding types.* @attribute syn
   * @aspect Annotations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Annotations.jrag:121
   */
  public boolean isValidAnnotationMethodReturnType() {
    ASTNode$State state = state();
    try {
    if(isString()) return true;
    if(fullName().equals("java.lang.Class"))
      return true;
    // include generic versions of Class
    if(erasure().fullName().equals("java.lang.Class"))
      return true;
    return false;
  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:47
   */
  public boolean unboxingConversionTo(TypeDecl typeDecl) {
    ASTNode$State state = state();
    try {  return unboxed() == typeDecl;  }
    finally {
    }
  }
  /**
   * @apilevel internal
   */
  protected boolean unboxed_computed = false;
  /**
   * @apilevel internal
   */
  protected TypeDecl unboxed_value;
  /**
   * @attribute syn
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:52
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl unboxed() {
    if(unboxed_computed) {
      return unboxed_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    unboxed_value = unboxed_compute();
      if(isFinal && num == state().boundariesCrossed) unboxed_computed = true;
    return unboxed_value;
  }
  /**
   * @apilevel internal
   */
  private TypeDecl unboxed_compute() {
    if(packageName().equals("java.lang") && isTopLevelType()) {
      String n = name();
      if(n.equals("Boolean")) return typeBoolean();
      if(n.equals("Byte")) return typeByte();
      if(n.equals("Character")) return typeChar();
      if(n.equals("Short")) return typeShort();
      if(n.equals("Integer")) return typeInt();
      if(n.equals("Long")) return typeLong();
      if(n.equals("Float")) return typeFloat();
      if(n.equals("Double")) return typeDouble();
    }
    return unknownType();
  }
  /**
   * @attribute syn
   * @aspect NumericPromotion
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:146
   */
  public TypeDecl unaryNumericPromotion() {
    ASTNode$State state = state();
    try {  return isNumericType() && !isUnknown() ? unboxed().unaryNumericPromotion() : this;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect NumericPromotion
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:154
   */
  public TypeDecl binaryNumericPromotion(TypeDecl type) {
    ASTNode$State state = state();
    try {  return unboxed().binaryNumericPromotion(type);  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:173
   */
  public boolean isNumericType() {
    ASTNode$State state = state();
    try {  return !unboxed().isUnknown() && unboxed().isNumericType();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:177
   */
  public boolean isIntegralType() {
    ASTNode$State state = state();
    try {  return !unboxed().isUnknown() && unboxed().isIntegralType();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:221
   */
  public boolean isPrimitive() {
    ASTNode$State state = state();
    try {  return !unboxed().isUnknown() && unboxed().isPrimitive();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect TypeAnalysis
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/TypeAnalysis.jrag:181
   */
  public boolean isBoolean() {
    ASTNode$State state = state();
    try {  return fullName().equals("java.lang.Boolean") && unboxed().isBoolean();  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect GenericsSubtype
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsSubtype.jrag:479
   */
  public boolean supertypeNullType(NullType type) {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:66
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeBoolean() {
    ASTNode$State state = state();
    TypeDecl typeBoolean_value = getParent().Define_TypeDecl_typeBoolean(this, null);
    return typeBoolean_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:67
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeByte() {
    ASTNode$State state = state();
    TypeDecl typeByte_value = getParent().Define_TypeDecl_typeByte(this, null);
    return typeByte_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:68
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeChar() {
    ASTNode$State state = state();
    TypeDecl typeChar_value = getParent().Define_TypeDecl_typeChar(this, null);
    return typeChar_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:69
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeShort() {
    ASTNode$State state = state();
    TypeDecl typeShort_value = getParent().Define_TypeDecl_typeShort(this, null);
    return typeShort_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:70
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeInt() {
    ASTNode$State state = state();
    TypeDecl typeInt_value = getParent().Define_TypeDecl_typeInt(this, null);
    return typeInt_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:71
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeLong() {
    ASTNode$State state = state();
    TypeDecl typeLong_value = getParent().Define_TypeDecl_typeLong(this, null);
    return typeLong_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:72
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeFloat() {
    ASTNode$State state = state();
    TypeDecl typeFloat_value = getParent().Define_TypeDecl_typeFloat(this, null);
    return typeFloat_value;
  }
  /**
   * @attribute inh
   * @aspect AutoBoxing
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/AutoBoxing.jrag:73
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl typeDouble() {
    ASTNode$State state = state();
    TypeDecl typeDouble_value = getParent().Define_TypeDecl_typeDouble(this, null);
    return typeDouble_value;
  }
  /**
   * @apilevel internal
   */
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
