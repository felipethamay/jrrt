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
  * @ast class
 * 
 */
public class NameType extends java.lang.Object {

    private NameType() {
      super();
    }


    public static final NameType NO_NAME = new NameType();


    public static final NameType PACKAGE_NAME = new NameType() {
      public Access reclassify(String name, int start, int end) { return new PackageAccess(name, start, end); }
    };


    public static final NameType TYPE_NAME = new NameType() {
      public Access reclassify(String name, int start, int end) { return new TypeAccess(name, start, end); }
    };


    public static final NameType PACKAGE_OR_TYPE_NAME = new NameType() {
      public Access reclassify(String name, int start, int end) { return new PackageOrTypeAccess(name, start, end); }
    };


    public static final NameType AMBIGUOUS_NAME = new NameType() {
      public Access reclassify(String name, int start, int end) { return new AmbiguousAccess(name, start, end); }
    };


    public static final NameType METHOD_NAME = new NameType();


    public static final NameType ARRAY_TYPE_NAME = new NameType();


    public static final NameType ARRAY_READ_NAME = new NameType();


    public static final NameType EXPRESSION_NAME = new NameType() {
      public Access reclassify(String name, int start, int end) { return new VarAccess(name, start, end); }
    };



    public Access reclassify(String name, int start, int end) {
      throw new Error("Can not reclassify ParseName node " + name);
    }


}
