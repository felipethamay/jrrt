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
public class ParameterizedTypeFlushing extends java.lang.Object {

		public static String parameterizedFlush(String s) { return s; }


		  
		  public static TypeDecl parameterizedFlush(TypeDecl s) {
			  if (null != s && s.isParameterizedType())
				  return null;
			  return s;
		  }


		  
		  public static SmallSet parameterizedFlush(SmallSet s) {
			    if(s != null) 
			      for(java.util.Iterator i = s.iterator(); i.hasNext(); ) {
			        Object o = i.next();
			        if(null != o && o instanceof TypeDecl && ((TypeDecl)o).isParameterizedType()) 
			          try {
			            i.remove();
			          }
			          catch (UnsupportedOperationException e) {
			            return null;
			          }
			      }
			    return s;
			  }


		  
		public static ASTNode parameterizedFlush(ASTNode n) { return n; }


		  
		public static Map parameterizedFlush(Map m) {
			if (m != null) {
				for (Iterator i = m.entrySet().iterator(); i.hasNext();) {
					java.util.Map.Entry e = (java.util.Map.Entry) i.next();
					if (null != e.getValue() && e.getValue() instanceof TypeDecl &&
							((TypeDecl) e.getValue()).isParameterizedType())
						i.remove();
				}
			}
			return m;
		}


		
		public static SimpleSet parameterizedFlush(SimpleSet s) {
			if (s != null)
				for (Iterator i = s.iterator(); i.hasNext();) {
					Object o = i.next();
					if (null != o && o instanceof TypeDecl &&
							((TypeDecl) o).isParameterizedType())
						return null;
				}
			return s;
		}


		
		public static Collection parameterizedFlush(Collection c) {
			if (c != null)
				for (Iterator i = c.iterator(); i.hasNext();) {
					Object o = i.next();
					if (null != o && o instanceof TypeDecl &&
							((TypeDecl) o).isParameterizedType())
						try {
							i.remove();
						} catch (UnsupportedOperationException e) {
							return null;
						}
				}
			return c;
		}


		
		public static List parameterizedFlush(List l) {
			if (l != null)
				for (Iterator i = l.iterator(); i.hasNext();) {
					Object o = i.next();
					if (null != o && o instanceof TypeDecl &&
							((TypeDecl) o).isParameterizedType())
						try {
							i.remove();
						} catch (UnsupportedOperationException e) {
							return null;
						}
				}
			return l;
		}


}
