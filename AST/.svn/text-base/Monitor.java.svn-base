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
public class Monitor extends java.lang.Object {

		private TypeDecl type;



		public Monitor(TypeDecl type) {
			if(type instanceof ClassDecl) {
				ClassDecl cd = (ClassDecl)type;
				while(cd.fromSource()) {
					type = cd;
					cd = cd.superclass();
				}
			}
			this.type = type;
		}



		public TypeDecl type() {
			return type;
		}



		public boolean mayAlias(Monitor that) {
			if(that instanceof FieldMonitor)
				return false;
			return this.type().hasCommonSubtypeWith(that.type());
		}


		
		public boolean equals(Object that) {
			return that.getClass().equals(this.getClass()) && ((Monitor)that).type == this.type;
		}


}
