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
 * @production MemberDecl : {@link BodyDecl};
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/java.ast:77
 */
public abstract class MemberDecl extends BodyDecl implements Cloneable {
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
  public MemberDecl clone() throws CloneNotSupportedException {
    MemberDecl node = (MemberDecl)super.clone();
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:192
   */
  public void checkModifiers() {
    if(!isSynthetic()) {
      super.checkModifiers();
      if(isStatic() && hostType().isInnerClass() && !isConstant())
        error("*** Inner classes may not declare static members, unless they are compile-time constant fields");
    }
  }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:46
   */
  public void makeModifiersExplicit() { }
  /**
   * @ast method 
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/ModifiersExt.jrag:56
   */
  public boolean isNative() { return false; }
  /**
   * @ast method 
   * @aspect MoveMembers
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Move/MoveMembers.jrag:17
   */
  public void moveTo(TypeDecl target) {
		throw new RefactoringException("cannot move this kind of member");
	}
  /**
   * @ast method 
   * 
   */
  public MemberDecl() {
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
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:222
   */
  @SuppressWarnings({"unchecked", "cast"})
  public abstract boolean isStatic();
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:478
   */
  public boolean isConstant() {
    ASTNode$State state = state();
    try {  return false;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect Modifiers
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Modifiers.jrag:214
   */
  public boolean isSynthetic() {
    ASTNode$State state = state();
    try {  return false;  }
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
