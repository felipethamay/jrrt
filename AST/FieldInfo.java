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
public class FieldInfo extends java.lang.Object {

    private BytecodeParser p;


    String name;


    int flags;


    private FieldDescriptor fieldDescriptor;


    private Attributes.FieldAttributes attributes;



    public FieldInfo(BytecodeParser parser) {
      p = parser;
      flags = p.u2();
      if(BytecodeParser.VERBOSE)
        p.print("Flags: " + flags);
      int name_index = p.u2();
      name = ((CONSTANT_Utf8_Info) p.constantPool[name_index]).string();

      fieldDescriptor = new FieldDescriptor(p, name);
      attributes = new Attributes.FieldAttributes(p);
    }



    public BodyDecl bodyDecl() {
      FieldDeclaration f;
      if((flags & Flags.ACC_ENUM) != 0)
        //EnumConstant : FieldDeclaration ::= Modifiers <ID:String> Arg:Expr* BodyDecl* /TypeAccess:Access/ /[Init:Expr]/;
        f = new EnumConstant(
            BytecodeParser.modifiers(flags),
            name,
            new List(),
            new List()
            );
      else {
        Signatures.FieldSignature s = attributes.fieldSignature;
        Access type = s != null ? s.fieldTypeAccess() : fieldDescriptor.type();
        f = new FieldDeclaration(
            BytecodeParser.modifiers(flags),
            type,
            name,
            new Opt()
            );
      }
      if(attributes.constantValue() != null)
        if(fieldDescriptor.isBoolean()) {
          f.setInit(attributes.constantValue().exprAsBoolean());
        }
        else {
          f.setInit(attributes.constantValue().expr());
        }

      if(attributes.annotations != null)
        for(Iterator iter = attributes.annotations.iterator(); iter.hasNext(); )
          f.getModifiersNoTransform().addModifier((Modifier)iter.next());

      return f;
    }



    public boolean isSynthetic() {
      return attributes.isSynthetic();
    }


}