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
public class MethodDescriptor extends java.lang.Object {

    private BytecodeParser p;


    private String parameterDescriptors;


    private String typeDescriptor;



    public MethodDescriptor(BytecodeParser parser, String name) {
      p = parser;
      int descriptor_index = p.u2();
      String descriptor = ((CONSTANT_Utf8_Info) p.constantPool[descriptor_index]).string();
      if(BytecodeParser.VERBOSE)
        p.println("  Method: " + name + ", " + descriptor);
      //String[] strings = descriptor.substring(1).split("\\)");
      //parameterDescriptors = strings[0];
      //typeDescriptor = strings[1];
      int pos = descriptor.indexOf(')');
      parameterDescriptors = descriptor.substring(1, pos);
      typeDescriptor = descriptor.substring(pos+1, descriptor.length());
    }



    public List parameterList() {
      TypeDescriptor d = new TypeDescriptor(p, parameterDescriptors);
      return d.parameterList();
    }


    public List parameterListSkipFirst() {
      TypeDescriptor d = new TypeDescriptor(p, parameterDescriptors);
      return d.parameterListSkipFirst();
    }



    public Access type() {
      TypeDescriptor d = new TypeDescriptor(p, typeDescriptor);
      return d.type();
    }


}
