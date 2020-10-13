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
public interface Variable extends Location, TypedDeclaration {

     
    public String name();

     
    public TypeDecl type();

     
    public boolean isParameter();

    // 4.5.3
     
    // 4.5.3
    public boolean isClassVariable();

     
    public boolean isInstanceVariable();

     
    public boolean isMethodParameter();

     
    public boolean isConstructorParameter();

     
    public boolean isExceptionHandlerParameter();

     
    public boolean isLocalVariable();

    // 4.5.4
     
    // 4.5.4
    public boolean isFinal();

     
    public boolean isVolatile();


     

    public boolean isBlank();

     
    public boolean isStatic();

     
    public boolean isSynthetic();


     

    public TypeDecl hostType();


     

    public Expr getInit();

     
    public boolean hasInit();


     

    public Constant constant();


     

    public Modifiers getModifiers();
public boolean isHeapLocation();

public boolean mayAlias(Location l);

public boolean isField();

public Variable findVariable(String name);

public Variable refresh();

public Collection<VarAccess> allUses();

public boolean isUsed();

public VariableDeclaration asVariableDeclaration(Expr init);

public void collectAllDecls(Collection<Declaration> res);

public VarAccess createLockedAccess();

public boolean isSubstituted();

public void rename(String new_name);

  /**
   * @attribute syn
   * @aspect SourceDeclarations
   * @declaredat /Users/melmongiovi/Documents/workspace6/Java1.5Frontend/Generics.jrag:1519
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Variable sourceVariableDecl();
  /**
   * @attribute syn
   * @aspect Refresh
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/util/Refresh.jrag:4
   */
  @SuppressWarnings({"unchecked", "cast"})
  public Variable refreshVariable();
  /**
   * @attribute syn
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:6
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean shouldBeFinal();
  /**
   * @attribute syn
   * @aspect DemandFinalQualifier
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/LanguageExtensions/DemandFinalQualifier.jrag:16
   */
  @SuppressWarnings({"unchecked", "cast"})
  public boolean mayBeFinal();
  /**
   * @attribute inh
   * @aspect AccessVariable
   * @declaredat /Users/melmongiovi/Documents/workspace6/jrrt_newversion/Naming/AccessVariable.jrag:122
   */
  public UnknownVarAccess unknownVarAccess();
}
