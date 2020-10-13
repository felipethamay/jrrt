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
public class SavedMethodDeclSubstituted extends SavedMethodDecl {

		private TypeDecl host;



		public SavedMethodDeclSubstituted(MethodDeclSubstituted mds) {
			super(mds.getOriginal());
			host = mds.hostType();
		}


		
		public MethodDecl getDecl() {
			TypeDecl host = this.host.refresh();
			MethodDecl md = super.getDecl();
			host.localMethodsSignatureMap();
			for(BodyDecl bd : host.getBodyDecls())
				if(bd instanceof MethodDeclSubstituted && ((MethodDeclSubstituted)bd).getOriginal() == md)
					return (MethodDecl)bd;
			throw new Error("no such method");
		}


}
