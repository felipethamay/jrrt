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
public class Pair<F,S> extends java.lang.Object {

		private F fst;


		private S snd;


		
		public Pair(F fst, S snd) {
			this.fst = fst;
			this.snd = snd;
		}


		
		public F fst() {
			return fst;
		}


		
		public S snd() {
			return snd;
		}


		
		public boolean equals(Object o) {
			if(!(o instanceof Pair))
				return false;
			Pair that = (Pair)o;
			if(this.fst == null) {
				if(that.fst != null)
					return false;
			} else {
				if(!this.fst.equals(that.fst))
					return false;
			}
			return this.snd == null ? that.snd == null : this.snd.equals(that.snd);
		}


}
