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
public class ReleaseDependency extends IrreflexiveForwardEdge {

		public static final ReleaseDependency edge = new ReleaseDependency();


		protected boolean isStart(CFGNode node) { return node.isMemoryAction(); }


		public boolean isTarget(CFGNode start, CFGNode end) { return end.isRelease(); }


		public boolean terminates(CFGNode start, CFGNode end) { return end.isRelease(); }


		public SmallSet<CFGNode> collect(CFGNode start) {
			SmallSet<CFGNode> res = super.collect(start);
			// additionally, any sync block we are nested inside is also a release-after
			for(ASTNode n=((ASTNode)start).getParent();n!=null&&!(n instanceof TypeDecl);n=n.getParent())
				if(n instanceof SynchronizedStmt)
					res = res.union((SynchronizedStmt)n);
			return res;
		}


}
