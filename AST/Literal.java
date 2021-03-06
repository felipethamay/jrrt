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
 * The abstract base class for all literals.
 * @production Literal : {@link PrimaryExpr} ::= <span class="component">&lt;LITERAL:String&gt;</span>;
 * @ast node
 * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/Literals.ast:4
 */
public abstract class Literal extends PrimaryExpr implements Cloneable {
  /**
   * @apilevel low-level
   */
  public void flushCache() {
    super.flushCache();
    constant_computed = false;
    constant_value = null;
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
  public Literal clone() throws CloneNotSupportedException {
    Literal node = (Literal)super.clone();
    node.constant_computed = false;
    node.constant_value = null;
    node.in$Circle(false);
    node.is$Final(false);
    return node;
  }
  /**
   * @ast method 
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BytecodeCONSTANT.jrag:59
   */
  public static Literal buildDoubleLiteral(double value) {
    return new DoubleLiteral(Double.toString(value));
  }
  /**
   * @ast method 
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BytecodeCONSTANT.jrag:63
   */
  public static Literal buildFloatLiteral(float value) {
    return new FloatingPointLiteral(Double.toString(value));
  }
  /**
   * @ast method 
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BytecodeCONSTANT.jrag:67
   */
  public static Literal buildIntegerLiteral(int value) {
    return new IntegerLiteral("0x"+Integer.toHexString(value));
  }
  /**
   * @ast method 
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BytecodeCONSTANT.jrag:71
   */
  public static Literal buildLongLiteral(long value) {
    return new LongLiteral("0x"+Long.toHexString(value));
  }
  /**
   * @ast method 
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BytecodeCONSTANT.jrag:75
   */
  public static Literal buildBooleanLiteral(boolean value) {
    return new BooleanLiteral(value ? "true" : "false");
  }
  /**
   * @ast method 
   * @aspect BytecodeCONSTANT
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/BytecodeCONSTANT.jrag:79
   */
  public static Literal buildStringLiteral(String value) {
    return new StringLiteral(value);
  }
  /**
   * @ast method 
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:160
   */
  static long parseLong(String s) {
    long x = 0L;
    s = s.toLowerCase();
    boolean neg = false;
    if(s.startsWith("-")) {
      s = s.substring(1);
      neg = true;
    }
    if(s.startsWith("0x")) {
      s = s.substring(2);
      if(s.length() > 16) {
        for(int i = 0; i < s.length()-16; i++)
          if(s.charAt(i) != '0')
            throw new NumberFormatException("");
      }
      for (int i = 0; i < s.length(); i++) {
        int c = s.charAt(i);
        if (c >= 'a' && c <= 'f')
          c = c - 'a' + 10;
        else if(c >= '0' && c <= '9')
          c = c - '0';
        else
          throw new NumberFormatException("");
        x = x * 16 + c;
      }
    }
    else if(s.startsWith("0")) {
      s = s.substring(1);
      // Octals larger than 01777777777777777777777L are not valid
      if(s.length() > 21) {
        for(int i = 0; i < s.length() - 21; i++)
          if(i == s.length() - 21 - 1) {
            if(s.charAt(i) != '0' && s.charAt(i) != '1')
              throw new NumberFormatException("");
          }
          else {
            if(s.charAt(i) != '0')
              throw new NumberFormatException("");
          }
      }
      for (int i = 0; i < s.length(); i++) {
        int c = s.charAt(i);
        if(c >= '0' && c <= '7')
          c = c - '0';
        else
          throw new NumberFormatException("");
        x = x * 8 + c;
      }
    }
    else {
      long oldx = 0;
      for (int i = 0; i < s.length(); i++) {
        int c = s.charAt(i);
        if(c >= '0' && c <= '9')
          c = c - '0';
        else
          throw new NumberFormatException("");
        x = x * 10 + c;
        if(x < oldx) {
          boolean negMinValue = i == (s.length()-1) && neg && x == Long.MIN_VALUE;
          if(!negMinValue)
            throw new NumberFormatException("");
        }
        oldx = x;
      }
      if(x == Long.MIN_VALUE)
        return x;
      if(x < 0)
        throw new NumberFormatException("");
    }
    return neg ? -x : x;
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:263
   */
  public void toString(StringBuffer s) {
    s.append(getLITERAL());
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:290
   */
  protected static String escape(String s) {
    StringBuffer result = new StringBuffer();
    for (int i=0; i < s.length(); i++) {
      switch(s.charAt(i)) {
        case '\b' : result.append("\\b"); break;
        case '\t' : result.append("\\t"); break;
        case '\n' : result.append("\\n"); break;
        case '\f' : result.append("\\f"); break;
        case '\r' : result.append("\\r"); break;
        case '\"' : result.append("\\\""); break;
        case '\'' : result.append("\\\'"); break;
        case '\\' : result.append("\\\\"); break;
        default:
          int value = (int)s.charAt(i);
          if(value < 0x20 || (value > 0x7e))
            result.append(asEscape(value));
          else
            result.append(s.charAt(i));
      }
    }
    return result.toString();
  }
  /**
   * @ast method 
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:312
   */
  protected static String asEscape(int value) {
    StringBuffer s = new StringBuffer("\\u");
    String hex = Integer.toHexString(value);
    for(int i = 0; i < 4-hex.length(); i++)
      s.append("0");
    s.append(hex);
    return s.toString();
  }
  /**
   * @ast method 
   * 
   */
  public Literal() {
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
  public Literal(String p0) {
    setLITERAL(p0);
  }
  /**
   * @ast method 
   * 
   */
  public Literal(beaver.Symbol p0) {
    setLITERAL(p0);
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
   * Replaces the lexeme LITERAL.
   * @param value The new value for the lexeme LITERAL.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public void setLITERAL(String value) {
    tokenString_LITERAL = value;
  }
  /**
   * @apilevel internal
   * @ast method 
   * 
   */
  
  /**
   * @apilevel internal
   */
  protected String tokenString_LITERAL;
  /**
   * @ast method 
   * 
   */
  
  public int LITERALstart;
  /**
   * @ast method 
   * 
   */
  
  public int LITERALend;
  /**
   * JastAdd-internal setter for lexeme LITERAL using the Beaver parser.
   * @apilevel internal
   * @ast method 
   * 
   */
  public void setLITERAL(beaver.Symbol symbol) {
    if(symbol.value != null && !(symbol.value instanceof String))
      throw new UnsupportedOperationException("setLITERAL is only valid for String lexemes");
    tokenString_LITERAL = (String)symbol.value;
    LITERALstart = symbol.getStart();
    LITERALend = symbol.getEnd();
  }
  /**
   * Retrieves the value for the lexeme LITERAL.
   * @return The value for the lexeme LITERAL.
   * @apilevel high-level
   * @ast method 
   * 
   */
  public String getLITERAL() {
    return tokenString_LITERAL != null ? tokenString_LITERAL : "";
  }
  /**
   * @apilevel internal
   */
  protected boolean constant_computed = false;
  /**
   * @apilevel internal
   */
  protected Constant constant_value;
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:103
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Constant constant() {
    if(constant_computed) {
      return constant_value;
    }
    ASTNode$State state = state();
  int num = state.boundariesCrossed;
  boolean isFinal = this.is$Final();
    constant_value = constant_compute();
      if(isFinal && num == state().boundariesCrossed) constant_computed = true;
    return constant_value;
  }
  /**
   * @apilevel internal
   */
  private Constant constant_compute() {
    throw new UnsupportedOperationException("ConstantExpression operation constant" +
      " not supported for type " + getClass().getName()); 
  }
  /**
   * @attribute syn
   * @aspect ConstantExpression
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/ConstantExpression.jrag:482
   */
  public boolean isConstant() {
    ASTNode$State state = state();
    try {  return true;  }
    finally {
    }
  }
  /**
   * @attribute syn
   * @aspect PrettyPrint
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.4Frontend/PrettyPrint.jadd:800
   */
  public String dumpString() {
    ASTNode$State state = state();
    try {  return getClass().getName() + " [" + getLITERAL() + "]";  }
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
  public ASTNode rewriteTo() {
    return super.rewriteTo();
  }
}
