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
public class FieldInReceiver extends java.lang.Object implements Location {

		private MethodDecl method;


		private FieldDeclaration field;


		
		public FieldInReceiver(MethodDecl method, FieldDeclaration field) {
			this.method = method;
			this.field = field;
		}


		
		public MethodDecl getMethod() {
			return method;
		}


		
		public FieldDeclaration getField() {
			return field;
		}


		
		public boolean isHeapLocation() {
			return true;
		}


		
		public boolean mayAlias(Location l) {
			return this.equals(l)
				|| l == field
				|| l instanceof AnyHeapLocation;
		}


		
		public boolean mustAlias(Location l) {
			return this.equals(l);
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof FieldInReceiver))
				return false;
			FieldInReceiver that = (FieldInReceiver)o;
			return this.method.equals(that.method) && this.field.equals(that.field);
		}


}
