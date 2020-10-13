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
public class AccessModifierConstant extends AccessibilityConstraintVariable {

		private int vis;


		
		private AccessModifierConstant(int vis) {
			this.vis = vis;
		}


		
		public int getAccessModifier() {
			return vis;
		}



		public Collection<Visible> referencedVisibles() {
			return Collections.EMPTY_LIST;
		}


		
		public void referencedBy(AccessibilityConstraint constraint) {}


		
		public static final AccessModifierConstant PRIVATE = new AccessModifierConstant(ASTNode.VIS_PRIVATE);


		public static final AccessModifierConstant PACKAGE = new AccessModifierConstant(ASTNode.VIS_PACKAGE);


		public static final AccessModifierConstant PROTECTED = new AccessModifierConstant(ASTNode.VIS_PROTECTED);


		public static final AccessModifierConstant PUBLIC = new AccessModifierConstant(ASTNode.VIS_PUBLIC);


		
		public static AccessModifierConstant fromVisibility(int vis) {
			switch(vis) {
			case ASTNode.VIS_PRIVATE: return PRIVATE;
			case ASTNode.VIS_PACKAGE: return PACKAGE;
			case ASTNode.VIS_PROTECTED: return PROTECTED;
			case ASTNode.VIS_PUBLIC: return PUBLIC;
			}
			return null;
		}


		
		public String toString() {
			return ASTNode.visibilityToString(vis);
		}


	
	// cache IntVariables for the visibilities
	private static Network network_cached = null;


	private static IntVariable[] constants_cached = null;

private static IntVariable getConstant(Network network, int val) {
		if(val < ASTNode.VIS_PRIVATE || val > ASTNode.VIS_PUBLIC)
			return null;
		if(network == network_cached && constants_cached != null)
			return constants_cached[val];
		network_cached = network;
		constants_cached = new IntVariable[ASTNode.VIS_PUBLIC-ASTNode.VIS_PRIVATE+1];
		for(int i=ASTNode.VIS_PRIVATE;i<=ASTNode.VIS_PUBLIC;++i)
			constants_cached[i] = new IntVariable(network, i);
		return constants_cached[val];
	}

public IntVariable creamVariable(Network network) {
		return getConstant(network, vis);
	}


}
