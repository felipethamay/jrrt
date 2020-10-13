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
public class RTXF extends java.lang.Object {

		public static String sanitise(String s) {
			return s.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll("\"", "&quot;");
		}


		
		public static String fieldref(FieldDeclaration fd) {
			return "<fieldref host=\"" + sanitise(fd.hostType().rtxfId()) + "\" name=\"" + sanitise(fd.name()) + "\"/>";
		}


		
		public static String tempref(Variable v) {
			BodyDecl bd = null;
			if(v instanceof VariableDeclaration)
				bd = ((VariableDeclaration)v).hostBodyDecl();
			else if(v instanceof ParameterDeclaration)
				bd = ((ParameterDeclaration)v).hostBodyDecl();
			else
				throw new Error("cannot create tempref for " + v);
			return "<tempref host=\"" + sanitise(bd.rtxfId()) + "\" name=\"" + sanitise(v.name()) + "\"/>";
		}


		
		public static String program(int indent, Program prog) {
			StringBuffer res = new StringBuffer();
			res.append(indent(indent) + "<program>\n");
			for(Iterator<CompilationUnit> iter = prog.compilationUnitIterator(); iter.hasNext();) {
				CompilationUnit cu = iter.next();
				if(cu.fromSource()) {
					String path = cu.getPackageDecl();
					if(!path.equals(""))
						path = path + ".";
					res.append(indent(indent+2) + "<cu name=\"" + path.replace('.', '/') + sanitise(cu.getID()) + ".java\">\n");
					res.append(sanitise(cu.toString()) + "\n");
					res.append(indent(indent+2) + "</cu>\n");
				}
			}
			res.append(indent(indent) + "</program>\n");
			return res.toString();
		}


		
		public static String indent(int indent) {
			StringBuffer res = new StringBuffer();
			for(int i=0;i<indent;++i)
				res.append(' ');
			return res.toString();
		}


		
		public static String result(int indent, boolean mayfail, Program... progs) {
			StringBuffer res = new StringBuffer();
			res.append(indent(indent) + "<result" + (mayfail ? " mayfail=\"yes\"" : "")+ ">\n");
			for(Program prog : progs)
				res.append(program(indent+2, prog));
			res.append(indent(indent) + "</result>\n");
			return res.toString();
		}


		
		public static void compare(rtxf.Result expected, Object actual) {
			if(actual instanceof String) {
				if(expected.getMayfail().equals("yes"))
					return;
				String expected_prog = Program.fromRTXF(expected.getProgram().get(0)).toString();
				throw new junit.framework.ComparisonFailure(null, expected_prog, (String)actual);
			} else {
				String actual_prog = actual.toString();
				String expected_prog = null;
				for(rtxf.Program prog : expected.getProgram()) {
					expected_prog = Program.fromRTXF(prog).toString();
					if(expected_prog.equals(actual_prog))
						return;
				}
				throw new junit.framework.ComparisonFailure(null, expected_prog == null ? "<failure>" : expected_prog, actual_prog);
			}
		}


		
		public static TestSuite makeSuite(String path) {
			TestSuite suite = new TestSuite();
			
			try {
				JAXBContext jc = JAXBContext.newInstance("rtxf");
				Unmarshaller unmarshaller = jc.createUnmarshaller();
				Object res = unmarshaller.unmarshal(new File(path));
				
				assert(res instanceof rtxf.Testsuite);
				java.util.List<rtxf.Testcase> tcs = ((rtxf.Testsuite)res).getTestcase();
				for(int i=0; i<tcs.size(); ++i) {
					final rtxf.Testcase tc = tcs.get(i);
					rtxf.Refactoring refactoring = tc.getRefactoring();
					if(refactoring.getRename() != null)
						suite.addTest(makeTestCase(tc, refactoring.getRename()));
					else if(refactoring.getExtractBlock() != null)
						suite.addTest(makeTestCase(tc, refactoring.getExtractBlock()));
					else if(refactoring.getExtractClass() != null)
						suite.addTest(makeTestCase(tc, refactoring.getExtractClass()));
					else if(refactoring.getExtractConstant() != null)
						suite.addTest(makeTestCase(tc, refactoring.getExtractConstant()));
					else
						throw new Error("cannot handle test");
				}
			} catch (JAXBException e) {
				throw new Error(e);
			}
			
			return suite;
		}



		private static TestCase makeTestCase(final rtxf.Testcase tc, final rtxf.Rename r) {
			return new TestCase(tc.getName()) {
				public void runTest() {
					rtxf.Program prog = tc.getProgram();
					Program in = Program.fromRTXF(prog);
					assertNotNull(in);
					if(r.getFieldref() != null) {
						FieldDeclaration fd = in.resolveFieldRef(r.getFieldref());
						assertNotNull(fd);
						try {
							fd.rename(r.getNewname());
							RTXF.compare(tc.getResult(), in);
						} catch(RefactoringException rfe) {
							RTXF.compare(tc.getResult(), rfe.getMessage());
						}
					} else if(r.getTempref() != null) {
						Variable v = in.resolveTempRef(r.getTempref());
						assertNotNull(v);
						try {
							v.rename(r.getNewname());
							RTXF.compare(tc.getResult(), in);
						} catch(RefactoringException rfe) {
							RTXF.compare(tc.getResult(), rfe.getMessage());
						}
					} else if(r.getTyperef() != null) {
						TypeDecl td = in.resolveTypeRef(r.getTyperef().getName());
						assertNotNull(td);
						try {
							td.rename(r.getNewname());
							RTXF.compare(tc.getResult(), in);
						} catch(RefactoringException rfe) {
							RTXF.compare(tc.getResult(), rfe.getMessage());
						}
					} else if(r.getMethodref() != null) {
						MethodDecl md = in.resolveMethodRef(r.getMethodref());
						assertNotNull(md);
						try {
							md.rename(r.getNewname());
							RTXF.compare(tc.getResult(), in);
						} catch(RefactoringException rfe) {
							RTXF.compare(tc.getResult(), rfe.getMessage());
						}
					} else if(r.getPkgref() != null) {
						try {
							in.getPackageDecl(r.getPkgref().getName()).rename(r.getNewname());
							RTXF.compare(tc.getResult(), in);
						} catch(RefactoringException rfe) {
							RTXF.compare(tc.getResult(), rfe.getMessage());
						}
					} else {
						fail("Cannot handle rename.");
					}
				}
			};
		}



		private static TestCase makeTestCase(final rtxf.Testcase tc, final rtxf.ExtractBlock r) {
			return new TestCase(tc.getName()) {
				public void runTest() {
					rtxf.Program prog = tc.getProgram();
					Program in = Program.fromRTXF(prog);
					assertNotNull(in);
					Stmt fromStmt = in.resolveStmtRef(r.getContent().get(0)), 
					       toStmt = in.resolveStmtRef(r.getContent().get(1));
					assertNotNull(fromStmt);
					assertNotNull(toStmt);
			        Block block = fromStmt.enclosingBlock();
			        assertEquals(block, toStmt.enclosingBlock());
			        int start = block.getStmtList().getIndexOfChild(fromStmt);
			        int end = block.getStmtList().getIndexOfChild(toStmt);
			        assertNotSame(start, -1);
			        assertNotSame(end, -1);
			        try {
						block.doExtractBlock(start, end);
						RTXF.compare(tc.getResult(), in);
					} catch (RefactoringException rfe) {
						RTXF.compare(tc.getResult(), rfe.getMessage());
					}
				}
			};
		}



		private static TestCase makeTestCase(final rtxf.Testcase tc, final rtxf.ExtractClass r) {
			return new TestCase(tc.getName()) {
				public void runTest() {
					rtxf.Program prog = tc.getProgram();
					Program in = Program.fromRTXF(prog);
					assertNotNull(in);
					TypeDecl td = in.resolveTypeRef(r.getTyperef().getName());
					assertTrue(td instanceof ClassDecl);
					ArrayList<FieldDeclaration> fds = new ArrayList<FieldDeclaration>();
					for(String fn : r.getFields()) {
						FieldDeclaration fd = td.findField(fn);
						assertNotNull(fd);
						fds.add(fd);
					}					
			        try {
						((ClassDecl)td).doExtractClass(fds, r.getClassname(), r.getFieldname(), 
													   r.getEncapsulate().equals("yes"), r.getToplevel().equals("yes"));
						RTXF.compare(tc.getResult(), in);
					} catch (RefactoringException rfe) {
						RTXF.compare(tc.getResult(), rfe.getMessage());
					}
				}
			};
		}



		private static TestCase makeTestCase(final rtxf.Testcase tc, final rtxf.ExtractConstant r) {
			return new TestCase(tc.getName()) {
				public void runTest() {
					rtxf.Program prog = tc.getProgram();
					Program in = Program.fromRTXF(prog);
					assertNotNull(in);
					Expr e = in.resolveExpref(r.getExpref());
					assertNotNull(e);
					try {
						e.doExtractConstant(r.getName());
						RTXF.compare(tc.getResult(), in);
					} catch (RefactoringException rfe) {
						RTXF.compare(tc.getResult(), rfe.getMessage());
					}
				}
			};
		}


}
