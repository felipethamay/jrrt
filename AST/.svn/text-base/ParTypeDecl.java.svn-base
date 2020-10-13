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
  * @ast interface
 * 
 */
public interface ParTypeDecl extends Parameterization {

    //syn String name();
     
    //syn String name();
    int getNumArgument();

     
    Access getArgument(int index);

     
    public String typeName();

     
    SimpleSet localFields(String name);

     
    HashMap localMethodsSignatureMap();
public TypeDecl substitute(TypeVariable typeVariable);

public int numTypeParameter();

public TypeVariable typeParameter(int index);

public Access substitute(Parameterization parTypeDecl);

public Access createQualifiedAccess();

public TypeDecl refresh();

public MemberTypeDecl insertUnusedType(TypeDecl td, int idx);

public void insertUnusedMethod(MethodDecl m, int idx);

public Access createLockedAccess();

  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:244
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isParameterizedType();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:245
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isRawType();
  /**
   * @attribute syn
   * @aspect GenericsTypeCheck
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:380
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameArgument(ParTypeDecl decl);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:577
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameSignature(Access a);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:612
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean sameSignature(ArrayList list);
  /**
   * @attribute syn
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsParTypeDecl.jrag:30
   */
  @SuppressWarnings({"unchecked", "cast"})
  public String nameWithArgs();
  /**
   * @attribute inh
   * @aspect GenericsParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/GenericsParTypeDecl.jrag:45
   */
  public TypeDecl genericDecl();
}
