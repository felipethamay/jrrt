package tests.jdolly;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.jdt.core.ICompilationUnit;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IPackageFragment;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.IProblemRequestor;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.core.compiler.IProblem;
import org.eclipse.jdt.core.dom.CompilationUnit;
import org.eclipse.jdt.core.dom.Modifier;
import org.eclipse.jdt.core.dom.TypeDeclaration;

import saferefactor.core.SRImpact;

import AST.Program;
import AST.RawCU;
import AST.RefactoringException;
import jdolly.JDolly;

public abstract class Test {

	private static final String WARNING_STATUS = "REFACTORING_INAPPLICABLE";
	private static final String NULL_POINTER = "NULL_POINTER";
	private static final String OK = "SUCCESSFUL_REFACTORING";
	private static final String OK_SAFIRA = "SUCCESSFUL_REFACTORING_SAFIRA";
	private static final String OK_SR2 = "SUCCESSFUL_REFACTORING_SR2";
	private static final String BEHAVIORAL_CHANGE = "BEHAVIORAL CHANGE";
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
	private boolean warningg = false;

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

		// String path =
		// "/home/spg-experiment-3/Documents/bug_transf/eclipse/"+refactoringName+skip+"oldtech.txt";
		//
		// List<Integer> list = new ArrayList<Integer>();
		// try{
		// InputManager in = new InputManagerASCII(path);
		// in.openFile();
		// while (!in.isEndOfFile()) {
		// String line = in.readLine();
		// try {
		// int num = Integer.parseInt(line);
		// list.add(num);
		// }catch(Exception e) {
		// continue;
		// }
		// }
		// }catch(IOException e) {
		//
		// }
		TestLogger logger = new TestLogger(refactoringName, getSystemTempDir());
		logger.setSkip(skip);

		StringBuffer safiraResults = new StringBuffer();
		StringBuffer srResults = new StringBuffer();
		StringBuffer srResults2 = new StringBuffer();

		logger.start();
		int i = 0;
		// for (File testFolder : tests) {
		Program program = null;
		Program target = null;
		String num = "";
		int generatedPrograms = 0;

		OverlyStrong os = new OverlyStrong();
		// String refactoring = "pushdownfield";
		// List<Integer> list = null;
		// try {
		// list =
		// os.count2("/home/spg-experiment-3/Documents/OS/eclipse/"+refactoringName+skip+"oldTechExha.txt");
		// } catch (IOException e1) {
		// // TODO Auto-generated catch block
		// e1.printStackTrace();
		// }
		// System.out.println(list.toString());

		StringBuffer sb = new StringBuffer();
		// String[] warning = os.warning;
		// ArrayList<Integer> warnings = new ArrayList<Integer>();
		// for (String string : warning) {
		// warnings.add(Integer.parseInt(string));
		//
		// }
		boolean passou = false;

		// Conditions_.cond3 = false;
		// Conditions_.cond1 = false;
		for (List<org.eclipse.jdt.core.dom.CompilationUnit> classes : getCUGen()) {
			// System.out.println("null pointer ========="+num);
			i++;
			// if (true) continue;
			// if (i != 601 && i != 916 && i != 935 && i != 993 && i != 1322) {
			//
			// continue;
			// }
			// if (i > 20730) break;

			// if (passou) break;
			// if (i > 14497) break;
			// if (i < 20730) continue;
			// if (i != 1452 && i != 1454 && i != 1455 && i != 1456) continue;

			if ((i % skip) != 0)
				continue;
			// if (!list.contains(i)) continue;
			// if (!warnings.contains((i/skip))) continue;
			// passou = true;
			generatedPrograms++;
			AST.Program.stopRecordingASTChangesAndFlush();
			AST.Program.undoAll();

			// COMENTARIO MELINA
			logger.increaseCount();
			String testDirectory = logger.getTestDirectory().getAbsolutePath();
			String source = testDirectory.replace("jrrt", "eclipse");
			source = testDirectory;
			//
			RawCU[] rawCUs;
			List<CompilationUnit> cus = new ProgramInfo()
					.getCompilationUnits(source + "/in/");
			if (cus != null) {
				List<RawCU> compilationUnits = getCompilationUnits(cus);
				rawCUs = new RawCU[compilationUnits.size()];
				compilationUnits.toArray(rawCUs);
				logger.logGenerated(cus);
			} else
				continue;
			//
			// List<RawCU> compilationUnits = getCompilationUnits(classes);
			//
			// RawCU[] rawCUs = new RawCU[compilationUnits.size()];
			// compilationUnits.toArray(rawCUs);
			//
			// logger.logGenerated(classes);
			//

			File inDir = new File(testDirectory, "in");
			inDir.mkdir();
			File outDir = new File(testDirectory, "out/jrrt");
			outDir.mkdirs();

			// check whether input compiles
			tempBefore = System.currentTimeMillis();
			String compileMessage = compile(inDir.toString());
			tempAfter = System.currentTimeMillis();
			tempTotal = tempAfter - tempBefore;
			totalInputCompileTime = totalInputCompileTime + tempTotal;

			if (compileMessage.contains("ERROR")) {
				System.out.println("Input nao compila");
				String fileLog = outDir + FILE_SEPARATOR
						+ INPUT_COMPILATION_ERROR;
				FileUtil.gravaArquivo(fileLog, compileMessage.toString());
				nmInputCompilationError++;
//				continue;
				break;
			} 
			if (true) continue;

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

			// program = Program.fromCompilationUnits(rawCUs);

			// System.out.println(program);
			int dir = 0;

			try {

				outDir = new File(testDirectory, "out/jrrt");

				outDir.mkdirs();

				program = Program.fromCompilationUnits(rawCUs);

				// aqui aplica o refatoramento
				tempBefore = System.currentTimeMillis();
				target = refactoring(program);
				tempAfter = System.currentTimeMillis();
				tempTotal = tempAfter - tempBefore;
				refactoringTime = refactoringTime + tempTotal;

				logger.logPostRefactoring(target, dir);

				// checa se compila
				tempBefore = System.currentTimeMillis();
				compileMessage = compile(outDir.toString());
				tempAfter = System.currentTimeMillis();
				tempTotal = tempAfter - tempBefore;
				outputCompileTime = refactoringTime + tempTotal;

				if (compileMessage.contains("ERROR")) {
					String fileLog = outDir + FILE_SEPARATOR
							+ COMPILATION_ERROR;
					FileUtil.gravaArquivo(fileLog, compileMessage.toString());
					nmCompilationError++;

					ce = compileMessage;
					jrrtOracle(ce);
					logger.logProgramCE(ce);
					System.out.println("COMPILATION ERROR");
					// break;
					continue;
				} else {
					SRImpact sri;
					sri = new SRImpact("", testDirectory + "/in/",
							testDirectory + "/out/jrrt/", "", "0.5", "", true);
					System.out.println("================is refactoring "
							+ sri.isRefactoring());
					//
					System.out.println("OK============");
					// // num += i+" ";
					if (!sri.isRefactoring()) {
						// System.out.println("OverlyStrongConditions");
						String fileLog = outDir + FILE_SEPARATOR
								+ BEHAVIORAL_CHANGE;
						FileUtil.gravaArquivo(fileLog, "behavioral change");
						// sb.append(" subjetc OS"+generatedPrograms+" skip25"+(i/skip)+" dir"+dir+"\n");
						// break;
						continue;
					}
				}

				program.end();
				target.end();
				target = null;

				// if (warningg && dir == 0) {
				// Conditions.reset();
				// }

				// }
			} catch (NullPointerException e) {
				String fileLog = outDir + FILE_SEPARATOR + NULL_POINTER;
				FileUtil.gravaArquivo(fileLog, e.getMessage());
				// num += i+" ";

			} catch (RefactoringException e) {
				String fileLog = outDir + FILE_SEPARATOR + WARNING_STATUS;
				FileUtil.gravaArquivo(fileLog, e.getMessage());
				sb.append(i + "\n");
				nmWarning++;

			} catch (Error e) {
				String fileLog = outDir + FILE_SEPARATOR + ENGINE_CRASH;
				FileUtil.gravaArquivo(fileLog, e.getMessage());
				engineCrash++;
			}
		}

		long after = System.currentTimeMillis();
		long tempo = (after - before) / 1000;
		System.out.println("Tempo total: " + tempo);
		double somaCoberturas = 0;
		for (Double cobertura : logger.getCoberturas()) {
			somaCoberturas = somaCoberturas + cobertura;
		}
		double porcentagemCobertura = somaCoberturas
				/ logger.getCoberturas().size();

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
		System.out.println(sb.toString());

		long totalMinutes = tempoTotal / 60;
		// System.out.println("Total minutos:" + totalMinutes);
		double totalHours = (double) tempoTotal / 60 / 60;
		long hours = totalMinutes / 60;
		// System.out.println("Total horas:" + hours);
		long fraction = totalMinutes % 60;

		// System.out.println("Fracao:" + fraction);
		long minutes = fraction * 60 / 100;

		String fileLog = "/Users/melmongiovi/Documents/doutorado/bug_transf/results_exp/jrrt/"
				+ refactoringName + "/" + "jrrt_skip" + skip + ".txt";
		// String fileLog =
		// "/home/spg-experiment-3/Documents/OS/eclipse/"+refactoringName+skip+"TESTE_.txt";
		FileUtil.gravaArquivo(fileLog,
				" total time: " + ((double) tempo / 60 / 60) + "h  = " + tempo
						+ "s  Generated programs: " + generatedPrograms + " "
						+ sb.toString());
		// }
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
				"-1.7 -classpath rt.jar \"" + path + "\"", pw, pwerror);

		// System.out.println(out.toString());

		System.out.println(outError.toString());
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

	// public List<Object> checkBehaviorConditions(String in, String out,
	// StringBuffer b, String timeLimit, int counter) throws Exception {
	//
	// long time = System.currentTimeMillis();
	// FileUtil.createFolders();
	// File buildFile = new File("ant" + Constants.FILE_SEPARATOR
	// + "build.xml");
	// Project p = new Project();
	//
	// // propriedades
	// p.setProperty("source", in);
	// p.setProperty("target", out);
	// // p.setProperty("methodlist", methodList.toString());
	// p.setProperty("timeout", timeLimit);
	// p.setProperty("bin", "");
	// p.setProperty("lib", "");
	// p.setProperty("src", "");
	// p.setProperty("tests.folder", Constants.TEST);
	//
	// // log do ant no console
	// // TODO logar tamb�m em arquivo
	// // DefaultLogger consoleLogger = new DefaultLogger();
	// // consoleLogger.setErrorPrintStream(System.err);
	// // consoleLogger.setOutputPrintStream(System.out);
	// // consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
	// // p.addBuildListener(consoleLogger);
	// // logger = new SafeRefactorLogger();
	// // logger.setErrorPrintStream(System.err);
	// // logger.setOutputPrintStream(System.out);
	// // logger.setMessageOutputLevel(Project.MSG_INFO);
	//
	// p.addBuildListener(srLogger);
	//
	//
	// p.init();
	// ProjectHelper helper = ProjectHelper.getProjectHelper();
	// p.addReference("ant.projectHelper", helper);
	// helper.parse(p, buildFile);
	// p.executeTarget(p.getDefaultTarget());
	//
	// ResultComparator rc = new ResultComparator(Constants.TESTSRC,
	// Constants.TESTTGT);
	// Report report = rc.generateReport(in, out);
	// time = System.currentTimeMillis() -time;
	//
	// b.append(counter + " "+report.getGenratedTests() + " "+
	// time+" "+report.isSameBehavior() + "\n");
	//
	// List<Object> result = new ArrayList<Object>();
	// if (report.isSameBehavior()) {
	// result.add("TRUE");
	// } else {
	// result.add("FALSE");
	// }
	//
	//
	// result.add(b);
	//
	// return result;
	//
	// // Saferefactor sr = new Saferefactor(in, out, "", "", "");
	// // return !sr.isRefactoring("1",true);
	// }
	//
	// public boolean checkBehaviorConditions2(String in, String out) throws
	// Exception {
	//
	// FileUtil.createFolders();
	// File buildFile = new File("ant" + Constants.FILE_SEPARATOR
	// + "build_run.xml");
	// Project p = new Project();
	//
	// // propriedades
	// p.setProperty("source", in + "/completo/");
	// p.setProperty("target", out + "/completo/");
	// // p.setProperty("methodlist", methodList.toString());
	// p.setProperty("bin", "");
	// p.setProperty("lib", "");
	// p.setProperty("src", "");
	// p.setProperty("tests.folder", Constants.TEST);
	//
	// // log do ant no console
	// // TODO logar tamb�m em arquivo
	// DefaultLogger consoleLogger = new DefaultLogger();
	// consoleLogger.setErrorPrintStream(System.err);
	// consoleLogger.setOutputPrintStream(System.out);
	// consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
	// p.addBuildListener(consoleLogger);
	//
	// p.init();
	// ProjectHelper helper = ProjectHelper.getProjectHelper();
	// p.addReference("ant.projectHelper", helper);
	// helper.parse(p, buildFile);
	// p.executeTarget(p.getDefaultTarget());
	//
	// ResultComparator rc = new ResultComparator(Constants.TESTSRC,
	// Constants.TESTTGT);
	// Report report = rc.generateReport(in, out);
	// return !report.isSameBehavior();
	//
	// // Saferefactor sr = new Saferefactor(in, out, "", "", "");
	// // return !sr.isRefactoring("1",true);
	// }

}
