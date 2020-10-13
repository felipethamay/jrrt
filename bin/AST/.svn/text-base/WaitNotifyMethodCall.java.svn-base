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
public class WaitNotifyMethodCall extends java.lang.Object implements MonitorAction {

		private MethodAccess acc;


		
		public WaitNotifyMethodCall(MethodAccess acc) {
			this.acc = acc;
		}


		
		public boolean fromSource() {
			return acc.fromSource();
		}


		
		public String toString() {
			return acc.toString();
		}


		
		public ASTNode getParent(int i) {
			return acc.getParent(i);
		}


		
		public boolean equals(Object that) {
			return that instanceof WaitNotifyMethodCall && this.acc.equals(((WaitNotifyMethodCall)that).acc);
		}

public Monitor getAcquiredMonitor() {
		return acc.isQualified() ? acc.qualifier().getMonitor() : new Monitor(acc.hostType());
	}

public Expr getMonitorExpr() {
		acc.bundleQualifier();
		return acc.isQualified() ? acc.qualifier() : new ThisAccess("this");
	}

public boolean mayEnter(Monitor m) { return getAcquiredMonitor().mayAlias(m); }


}
