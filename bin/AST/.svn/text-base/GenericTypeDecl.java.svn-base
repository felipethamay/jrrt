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
public interface GenericTypeDecl extends GenericElement {

     
    TypeDecl original();

     
    int getNumTypeParameter();

     
    TypeVariable getTypeParameter(int index);

     
    List getTypeParameterList();

     
    public String fullName();

     
    public String typeName();
public TypeDecl makeGeneric(Signatures.ClassSignature s);

public SimpleSet addTypeVariables(SimpleSet c, String name);

public List createArgumentList(ArrayList params);

public Access createLockedAccess();

  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:158
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean isGenericType();
  /**
   * @attribute syn
   * @aspect Generics
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:163
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl rawType();
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:708
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupParTypeDecl(ParTypeAccess p);
  /**
   * @attribute syn
   * @aspect LookupParTypeDecl
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:714
   */
  @SuppressWarnings({"unchecked", "cast"})
  public TypeDecl lookupParTypeDecl(ArrayList list);
}
