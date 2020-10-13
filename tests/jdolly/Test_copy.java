package tests.jdolly;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;
import org.apache.tools.ant.XmlLogger;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import saferefactor.Constants;
import saferefactor.Report;
import saferefactor.ResultComparator;

import executor.SRImpact;

import AST.Program;
import AST.RawCU;
import AST.RefactoringException;
import br.edu.dsc.ufcg.jdolly.JDolly;

public abstract class Test_copy {

	private static final String WARNING_STATUS = "REFACTORING_INAPPLICABLE";
	private static final String NULL_POINTER = "NULL_POINTER";
	private static final String OK = "SUCCESSFUL_REFACTORING";
	private static final String OK_SAFIRA = "SUCCESSFUL_REFACTORING_SAFIRA";
	private static final String OK_SR2 = "SUCCESSFUL_REFACTORING_SR2";
	private static final String BEHAVIORAL_CHANGE = "BEHAVIORCHANGE_FAILURE";
	private static final String BEHAVIORAL_CHANGE_SAFIRA = "BEHAVIORCHANGE_FAILURE_SAFIRA";
	private static final String BEHAVIORAL_CHANGE_SR2 = "BEHAVIORCHANGE_FAILURE_SR2";
	private static final String COMPILATION_ERROR = "POST_REFACTOR_NOT_COMPILE";
	private static final String INPUT_COMPILATION_ERROR = "PRE_REFACTOR_NOT_COMPILE";
	private static final String ENGINE_CRASH = "ENGINE_CRASH";
	public static final String FILE_SEPARATOR = System
			.getProperty("file.separator");

	private Map<String, Integer> problems = new HashMap<String, Integer>();
	private int nmCompilationError = 0;
	private int nmInputCompilationError = 0;
	private int nmBehaviorChange = 0;
	private int nmBehaviorChange_safira = 0;
	private int nmBehaviorChange2 = 0;

	private int nmWarning = 0;
	private int engineCrash = 0;
	private String ce;
	public static final String TEMP_DIR = System.getProperty("java.io.tmpdir");

	// time metrics
	long totalInputCompileTime = 0;
	long outputCompileTime = 0;
	long refactoringTime = 0;
	long saferefactorTime = 0;
	long instrumentTime = 0;
	long closedWorldTime = 0;
	private long tempBefore;
	private long tempAfter;
	private long tempTotal;
	private SafeRefactorLogger srLogger = new SafeRefactorLogger();
	private long timeStrategy2 = 0;

	public static String getSystemTempDir() {
		String tempdir = System.getProperty("java.io.tmpdir");
		if (tempdir == null) {
			throw new IllegalArgumentException("Temp dir is not specified");
		}
		String separator = System.getProperty("file.separator");
		if (!tempdir.endsWith(separator)) {
			return tempdir + separator;
		}
		return tempdir;
	}

	public void run(int skip) {

		long before = System.currentTimeMillis();

		String refactoringName = this.getClass().getSimpleName()
				.replace("Test", "");
		;
		String path = "/home/spg-experiment-3/Documents/OS/eclipse/"
				+ refactoringName + skip + "oldtech.txt";

		TestLogger logger = new TestLogger(refactoringName, getSystemTempDir());

		StringBuffer safiraResults = new StringBuffer();
		StringBuffer srResults = new StringBuffer();
		StringBuffer srResults2 = new StringBuffer();

		logger.start();
		int i = 0;
		// for (File testFolder : tests) {
		Program program = null;
		Program target = null;
		String num = "";

		File outDir = new File(logger.getTestDirectory(), "out/jrrt");
		outDir.mkdirs();

		// check whether input compiles
		tempBefore = System.currentTimeMillis();
		String compileMessage = null;
		tempAfter = System.currentTimeMillis();
		tempTotal = tempAfter - tempBefore;
		totalInputCompileTime = totalInputCompileTime + tempTotal;

		// if (i > 2)
		// break;
		// if ((i % 1000) == 0) {
		// FileUtil.gravaArquivo(logger.getLogDir().toString() +
		// "/SAFIRA_RESULTS"+i,
		// safiraResults.toString());
		// FileUtil.gravaArquivo(logger.getLogDir().toString() +
		// "/SR_RESULTS"+i,
		// srResults.toString());
		// // FileUtil.gravaArquivo(logger.getLogDir().toString() +
		// "/SR_RESULTS2"+i,
		// // srResults2.toString());
		// }
		// continue;

		try {

			// System.out.println(program);
			program = bugPushDown2_1_1();
			// program = bugPushDown2_2_1v1();
			// aqui aplica o refatoramento
			tempBefore = System.currentTimeMillis();
			target = refactoring(program);

			tempAfter = System.currentTimeMillis();
			tempTotal = tempAfter - tempBefore;
			refactoringTime = refactoringTime + tempTotal;

			logger.logPostRefactoring(target);

			// checa se compila
			tempBefore = System.currentTimeMillis();
			compileMessage = compile(outDir.toString());
			tempAfter = System.currentTimeMillis();
			tempTotal = tempAfter - tempBefore;
			outputCompileTime = refactoringTime + tempTotal;

			if (compileMessage.contains("ERROR")) {
				String fileLog = outDir + FILE_SEPARATOR + COMPILATION_ERROR;
				FileUtil.gravaArquivo(fileLog, compileMessage.toString());
				nmCompilationError++;

				ce = compileMessage;
				jrrtOracle(ce);
				logger.logProgramCE(ce);
			} else {
				System.out.println("OK============");
				// num += i+" ";
				// break;
			}
			program.end();
			target.end();
			target = null;
			// }
			// } catch (NullPointerException e) {
			// System.out.println(e.getMessage());
			// String fileLog = outDir + FILE_SEPARATOR + NULL_POINTER;
			//
			// FileUtil.gravaArquivo(fileLog, e.getMessage());
			// // num += i+" ";

		} catch (RefactoringException e) {
			String fileLog = outDir + FILE_SEPARATOR + WARNING_STATUS;
			FileUtil.gravaArquivo(fileLog, e.getMessage());
			nmWarning++;
		} catch (Error e) {
			String fileLog = outDir + FILE_SEPARATOR + ENGINE_CRASH;
			FileUtil.gravaArquivo(fileLog, e.getMessage());
			engineCrash++;
		}

		// }
		long after = System.currentTimeMillis();
		long tempo = (after - before) / 1000;
		System.out.println("Tempo total: " + tempo);
		double somaCoberturas = 0;
		for (Double cobertura : logger.getCoberturas()) {
			somaCoberturas = somaCoberturas + cobertura;
		}
		double porcentagemCobertura = somaCoberturas
				/ logger.getCoberturas().size();

		StringBuffer sb = new StringBuffer();
		sb.append("===================================\n");
		sb.append("TIME RESULTS\n");
		sb.append("===================================");
		sb.append("\nTempo para compilar source: " + totalInputCompileTime
				/ 1000);
		sb.append("\nTempo para compilar target " + outputCompileTime / 1000);
		sb.append("\nTempo para aplicar o refactoring: " + refactoringTime
				/ 1000);
		sb.append(srLogger.getResults());
		sb.append("\nTempo para aplicar a abordagem 2: " + timeStrategy2 / 1000);
		long tempoTotal = tempo - timeStrategy2 / 1000;
		sb.append("\nTempo total sem segunda abordagem: " + tempoTotal);
		long totalMinutes = tempoTotal / 60;
		// System.out.println("Total minutos:" + totalMinutes);
		double totalHours = (double) tempoTotal / 60 / 60;
		long hours = totalMinutes / 60;
		// System.out.println("Total horas:" + hours);
		long fraction = totalMinutes % 60;
		// System.out.println("Fracao:" + fraction);
		long minutes = fraction * 60 / 100;
	}

	//

	private List<RawCU> getCompilationUnits(
			List<org.eclipse.jdt.core.dom.CompilationUnit> classes) {

		List<RawCU> results = new ArrayList<RawCU>();
		for (org.eclipse.jdt.core.dom.CompilationUnit cu : classes) {

			String cuName = getPrimaryTypeName(cu);
			System.out.println(cuName);
			// String cuSource = cu.toString();
			// String packageName = cu.getPackage().getName()
			// .getFullyQualifiedName();

			results.add(new RawCU(cuName + ".java", cu.toString()));
		}
		return results;
	}

	protected String getPrimaryTypeName(
			org.eclipse.jdt.core.dom.CompilationUnit cu) {
		String first = null;
		for (Object type : cu.types()) {
			if (type instanceof TypeDeclaration) {
				String typeName = ((TypeDeclaration) type).getName().toString();
				if (first == null) {
					first = typeName;
				}
				for (Object modifier : ((TypeDeclaration) type).modifiers()) {
					if (((Modifier) modifier).getKeyword() == Modifier.ModifierKeyword.PUBLIC_KEYWORD) {
						return typeName;
					}
				}
			}
		}
		return first;
	}

	protected abstract JDolly getCUGen();

	protected abstract Program refactoring(Program program)
			throws RefactoringException;

	private String compile(String path) {

		ByteArrayOutputStream out = new ByteArrayOutputStream();
		ByteArrayOutputStream outError = new ByteArrayOutputStream();

		PrintWriter pw = new PrintWriter(out);
		PrintWriter pwerror = new PrintWriter(outError);

		org.eclipse.jdt.internal.compiler.batch.Main.compile(
				"-classpath rt.jar \"" + path + "\"", pw, pwerror);

		// System.out.println(out.toString());

		// System.out.println(outError.toString());
		// result = !outError.toString().contains("ERROR");

		return outError.toString();
	}

	private void jrrtOracle(String error) {

		String[] lines = error.split("\n");

		String x = "";
		boolean inclueAproxima = true;
		boolean limit = false;

		for (String s : lines) {
			if (s.contains("^"))
				continue;
			// so conta o 1o. erro
			if (s.contains("----------") /* && achouErro */) {
				if (limit)
					break;
				limit = true;
			}
			if (s.contains("ERROR")) {
				inclueAproxima = true;
				// achouErro = true;
			}

			if (inclueAproxima) {
				if (s.contains("WARNING"))
					inclueAproxima = false;
				else {
					if (!s.contains("ERROR") && !s.contains("problem")) {
						// para remover nome de classes e metodos
						// s = s
						// .replaceAll(
						// "[(]?[(]?[a-zA-Z0-9]+_[0-9][(]?[(]?[\\w]*[)]?[\\w]*[)]?",
						// " ");
						// para remover o codigo que ocorre o problmea, deixar
						// so a mensagem
						if (s.contains(";"))
							s = "";
						else
							s = s.replaceAll(
									"[(]?[(]?[a-zA-Z0-9]+_[0-9][(]?[(]?[\\w]*[)]?[\\w]*[)]?",
									" ");

					} else
						s = "ERROR";
					x = x + "\n" + s;

				}

			}
		}
		if (problems.containsKey(x)) {
			Integer integer = problems.get(x);
			integer = integer + 1;
			problems.put(x, integer);
		} else {
			problems.put(x, 1);

		}

	}

	public void setNmCompilationError(int nmCompilationError) {
		this.nmCompilationError = nmCompilationError;
	}

	public int getNmCompilationError() {
		return nmCompilationError;
	}

	// public boolean checkBehaviorConditions(String in, String out) {
	//
	//
	//
	// Boolean result = false;
	//
	// AnalyzerRunner.execute(in, out);
	//
	// File file = new File("/tmp/result/source/TEST-RandoopTest.xml");
	// if (file.exists()) {
	// result = !Mediator.hasSameBehavior("/tmp/result/source",
	// "/tmp/result/target");
	// }
	//
	// return result;
	// }

	public List<Object> checkBehaviorConditions(String in, String out,
			StringBuffer b, String timeLimit, int counter) throws Exception {

		long time = System.currentTimeMillis();
		FileUtil.createFolders();
		File buildFile = new File("ant" + Constants.FILE_SEPARATOR
				+ "build.xml");
		Project p = new Project();

		// propriedades
		p.setProperty("source", in);
		p.setProperty("target", out);
		// p.setProperty("methodlist", methodList.toString());
		p.setProperty("timeout", timeLimit);
		p.setProperty("bin", "");
		p.setProperty("lib", "");
		p.setProperty("src", "");
		p.setProperty("tests.folder", Constants.TEST);

		// log do ant no console
		// TODO logar tamb�m em arquivo
		// DefaultLogger consoleLogger = new DefaultLogger();
		// consoleLogger.setErrorPrintStream(System.err);
		// consoleLogger.setOutputPrintStream(System.out);
		// consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		// p.addBuildListener(consoleLogger);
		// logger = new SafeRefactorLogger();
		// logger.setErrorPrintStream(System.err);
		// logger.setOutputPrintStream(System.out);
		// logger.setMessageOutputLevel(Project.MSG_INFO);

		p.addBuildListener(srLogger);

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);
		p.executeTarget(p.getDefaultTarget());

		ResultComparator rc = new ResultComparator(Constants.TESTSRC,
				Constants.TESTTGT);
		Report report = rc.generateReport(in, out);
		time = System.currentTimeMillis() - time;

		b.append(counter + " " + report.getGenratedTests() + " " + time + " "
				+ report.isSameBehavior() + "\n");

		List<Object> result = new ArrayList<Object>();
		if (report.isSameBehavior()) {
			result.add("TRUE");
		} else {
			result.add("FALSE");
		}

		result.add(b);

		return result;

		// Saferefactor sr = new Saferefactor(in, out, "", "", "");
		// return !sr.isRefactoring("1",true);
	}

	public boolean checkBehaviorConditions2(String in, String out)
			throws Exception {

		FileUtil.createFolders();
		File buildFile = new File("ant" + Constants.FILE_SEPARATOR
				+ "build_run.xml");
		Project p = new Project();

		// propriedades
		p.setProperty("source", in + "/completo/");
		p.setProperty("target", out + "/completo/");
		// p.setProperty("methodlist", methodList.toString());
		p.setProperty("bin", "");
		p.setProperty("lib", "");
		p.setProperty("src", "");
		p.setProperty("tests.folder", Constants.TEST);

		// log do ant no console
		// TODO logar tamb�m em arquivo
		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger.setErrorPrintStream(System.err);
		consoleLogger.setOutputPrintStream(System.out);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);
		p.executeTarget(p.getDefaultTarget());

		ResultComparator rc = new ResultComparator(Constants.TESTSRC,
				Constants.TESTTGT);
		Report report = rc.generateReport(in, out);
		return !report.isSameBehavior();

		// Saferefactor sr = new Saferefactor(in, out, "", "", "");
		// return !sr.isRefactoring("1",true);
	}

	public Program bugPushDown2_1_1() {
		return Program.fromCompilationUnits(new RawCU("A.java", "package p2;"
				+ "public class A {" + "  public long m_0() {"
				+ "    return k(2);" + "  }" + "  long k(long a) {"
				+ "    return 1;" + "  }" + "}"), new RawCU("B.java",
				"package p2;" + "public class B extends A {" + "}"), new RawCU(
				"B.java", "package p1;" + "import p2.*;"
						+ "public class B extends A {"
						+ "  protected long k(int a) {" + "    return 0;"
						+ "  }" + "  public long n() {" + "    return m_0();"
						+ "  }" + "}"));
	}

	public Program bugPushDown2_2_1v1() {
		return Program.fromCompilationUnits(new RawCU("A.java",
				"public class A {" + "  public long m_0() {"
						+ "    return k();" + "  }" + "  protected long k() {"
						+ "    return 1;" + "  }" + "}"), new RawCU("B.java",
				"public class B extends A {" + "  public long k() {"
						+ "    return 2;" + "  }" + "  public long test() {"
						+ "    return m_0();" + "  }" + "}"));
	}
}
