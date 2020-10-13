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
public class FileRange extends java.lang.Object {


		public String filename;


		public int sl, sc, el, ec;



		public FileRange(String filename, int sl, int sc, int el, int ec) {
			this.filename = filename;
			this.sl = sl; this.sc = sc;
			this.el = el; this.ec = ec;
		}



		public FileRange(String filename, int start, int end) {
			this.filename = filename;
			this.sl = ASTNode.getLine(start); this.sc = ASTNode.getColumn(start);
			this.el = ASTNode.getLine(end); this.ec = ASTNode.getColumn(end);
		}



		public String toString() {
			return filename+":("+sl+", "+sc+")-("+el+", "+ec+")";
		}

public boolean startsBefore(FileRange that) {
		return this.sl < that.sl ||
		   this.sl == that.sl && this.sc < that.sc;
	}


}
