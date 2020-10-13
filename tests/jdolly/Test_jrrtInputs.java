package tests.jdolly;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
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


import ConditionsJRRTInputs.ConditionsManagement;
import ConditionsJRRTInputs.ConditionsPullUpMethod;

import AST.Program;
import AST.RawCU;
import AST.RefactoringException;
import io.InputManager;
import io.InputManagerASCII;
import jdolly.JDolly;
import saferefactor.util.SRImpact;

public abstract class Test_jrrtInputs {

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
	private boolean rejectedTransf = false;
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
//	private String currentSource;
//	private String currentTarget;
	private String currentMsg = "";
	Map<String, Integer> warnings = new HashMap<String, Integer>();

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

	
		TestLogger logger = new TestLogger(refactoringName, "/Users/melmongiovi/Documents/doutorado/experiments/MT/jrrt/"+refactoringName+"/");
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
		StringBuffer bugs = new StringBuffer();
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
		//for (List<org.eclipse.jdt.core.dom.CompilationUnit> classes : getCUGen()) {
		ConditionsManagement conds = new ConditionsPullUpMethod();
//		ConditionsJRRTInputs.ConditionsPullUpMethod2 c = new ConditionsJRRTInputs.ConditionsPullUpMethod2();
		conds.resetosc();
		conds.intializeConditions();
		for (int j = 4; j <= 30; j++) {
			conds.enableAllConditions();	
//		c.reset();
			i++;
			 if (j == 11 || j == 12) {
				 logger.increaseCount();
				 continue;
			 }

			if ((i % skip) != 0)
				continue;
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
					.getCompilationUnits("/Users/melmongiovi/Documents/doutorado/experiments/MT/jrrt/pullupmethodInputs/test"+j+"/");
			if (cus != null) {
				List<RawCU> compilationUnits = getCompilationUnits(cus);
				rawCUs = new RawCU[compilationUnits.size()];
				compilationUnits.toArray(rawCUs);
				logger.logGenerated(cus);
			} else
				continue;

			File inDir = new File(testDirectory, "");
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
//				break;
			} 
			int dir = 0;
			
			conds.enableAllConditions();
			rejectedTransf = false;
			boolean stop = false;
			while (!stop) {
				
				
				try{
				if (dir == 0) {
					conds.enableAllConditions();
					outDir = new File(logger.getTestDirectory(), "out/jrrt");
				} else {
					outDir = new File(logger.getTestDirectory(), "out/jrrt"+dir);
				}
				outDir.mkdirs();

				program = Program.fromCompilationUnits(rawCUs);
				
				
				// aqui aplica o refatoramento
				tempBefore = System.currentTimeMillis();
				System.out.println("================== refactoring =====================");
				target = refactoring(program);
				System.out.println("================== refactored =====================");
				tempAfter = System.currentTimeMillis();
				tempTotal = tempAfter - tempBefore;
				refactoringTime = refactoringTime + tempTotal;
				
				logger.logPostRefactoring(target, dir);				 
				
				if (!rejectedTransf) {
					break;
				}
				
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
					System.out.println("COMPILATION ERROR");
					stop = true;
//					break;
				}
				else {
					try {
					SRImpact sri;
					sri = new SRImpact("",logger.getTestDirectory().getAbsolutePath().toString() , outDir.toString(), "","0.5", "", true);
					
					System.out.println("================is refactoring "+sri.isRefactoring());
					System.out.println("OK============");
////					num += i+" ";
					if (sri.isRefactoring()) {
						if (dir != 0) {
							System.out.println("OverlyStrongConditions");
							String bug = conds.getlog()+" subjetc OS"+i+" skip"+(i/skip)+" dir"+dir+" "+currentMsg+"\n";
							sb.append(bug);
							bugs.append(bug);
//							bugs.append(logger.currentSource+"\n");
//							bugs.append(logger.currentTarget+"\n");
							System.out.println(">>>>>>>>>>>>>>>>>"+bug+" "+currentMsg);
//							System.out.println(logger.currentSource);
//							System.out.println(logger.currentTarget);
//							this.warnings.put(currentMsg, generatedPrograms);
//							firstFailure = true;
							String fileLog = outDir + FILE_SEPARATOR + "BUG";
							FileUtil.gravaArquivo(fileLog, "");
						
						}
						
					
						
						////MELINA descomentar isso depois
						rejectedTransf = false;
//						break;
					} else {
						String fileLog = outDir + FILE_SEPARATOR + "NON-BP";
						FileUtil.gravaArquivo(fileLog, "");
					}
					} catch (Exception e) {
						
					}
					stop = true;
				}
				program.end();
				target.end();
				target = null;
				

				//se nao rejeitou a transformacao com todas as condicoes (dir == 0), sai do loop, pq nao precisa analisar as combinacoes de condicoes
				if (!rejectedTransf) {
					break;
				}
				
				dir++;
				
//				}
			} catch (NullPointerException e) {
				String fileLog = outDir + FILE_SEPARATOR + NULL_POINTER;
				FileUtil.gravaArquivo(fileLog, e.getMessage());
				break;
//				num += i+" ";
			
			} catch (RefactoringException e) {
				String fileLog = outDir + FILE_SEPARATOR + WARNING_STATUS;
				FileUtil.gravaArquivo(fileLog, e.getMessage());
				System.out.println("program "+i+" msg "+e.getMessage());
				nmWarning++;
				List<Integer> conditions = conds.getConditions( e.getMessage());
				if (conditions.size() > 0) {
					boolean changed = conds.disableConditions(conditions);
					if (changed) {
						rejectedTransf = true;
						dir++;
//						dir++;
						continue;
					}
				} 
				
					stop = true;
	
				
				//se ele rejeitou a transformacao com todas as condicoes (dir == 0), entao seta a variavel para true
				//para analisar as combinacoes das condicoes
//				if (dir == 0 ) {
//					//MELINA comentar isso depois
//					//currentMsg = e.getMessage();
//					//se a msg for nova
//					//MELINA descomentar isso depois
//					//if (e.getMessage().contains("cannot adjust") ||e.getMessage().contains("is used")) {
//					if (oracleAM(e.getMessage())) {
//					//sb.append(e.getMessage()+" "+i+" "+generatedPrograms+"\n");
//					rejectedTransf = true;
//					}
//				}
//				dir++;
				
			}catch (Error e) {
				String fileLog = outDir + FILE_SEPARATOR + ENGINE_CRASH;
				FileUtil.gravaArquivo(fileLog, e.getMessage());
				engineCrash++;
				break;
			}
			}
	}
	long after = System.currentTimeMillis();
	long tempo = (after - before) / 1000;
	System.out.println("Tempo total: "+tempo);
	double somaCoberturas = 0;
	for (Double cobertura : logger.getCoberturas()) {
		somaCoberturas = somaCoberturas + cobertura;
	}
	double porcentagemCobertura = somaCoberturas
			/ logger.getCoberturas().size();
	
	
	sb.append("===================================\n");
	sb.append("TIME RESULTS\n");
	sb.append("===================================");
	sb.append("\nTempo para compilar source: " + totalInputCompileTime/1000);	
	sb.append("\nTempo para compilar target " + outputCompileTime/1000);
	sb.append("\nTempo para aplicar o refactoring: " + refactoringTime/1000);
	sb.append(srLogger.getResults());
	sb.append("\nTempo para aplicar a abordagem 2: " + timeStrategy2/1000);
	long tempoTotal = tempo - timeStrategy2/1000;
	sb.append("\nTempo total sem segunda abordagem: " + tempoTotal);
	
//	Set<String> keySet = this.warnings.keySet();
//	for (String string : keySet) {
//		sb.append(string+" "+this.warnings.get(string)+"\n"); 
//	}
//	
	conds.enableAllConditions();
	System.out.println(sb.toString());
	
	long totalMinutes = tempoTotal/60;
//	System.out.println("Total minutos:" + totalMinutes);
	double totalHours = (double )tempoTotal/60/60;
	long hours = totalMinutes / 60;
//	System.out.println("Total horas:" + hours);
	long fraction = totalMinutes % 60;
//	System.out.println("Fracao:" + fraction);
	long minutes = fraction * 60 / 100;
	String fileLog = "/home/spg-03/Documents/cond/jrrt/"+refactoringName+"_skip"+skip+"ttff.txt";
	FileUtil.gravaArquivo(fileLog, " total time: "+( (double )tempo/60/60) + "h  = "+tempo+"s  Generated programs: "+generatedPrograms+ " "+ (bugs.toString()+"\n"+sb.toString()));
		// }
	}

	//
	private  boolean oracleAM( String msg) {
		
//		FileReader in = new FileReader(target);
//		BufferedReader br = new BufferedReader(in);
		String s = msg;
		String x = "";
		boolean inclueAproxima = true;
		boolean achouErro = false;
//			if (s.contains("^"))
//				continue;
//			// so conta o 1o. erro
//			if (s.contains("----------") && achouErro)
//				break;
			if (s.contains("ERROR")) {
				inclueAproxima = true;
				achouErro = true;
			}

			if (inclueAproxima) {
				if (s.contains("WARNING"))
					inclueAproxima = false;
				else {
					if (!s.contains("ERROR")
							&& !s.contains("problem")) {
						//para remover nome de classes e metodos
//						s = s
//								.replaceAll(
//										"[(]?[(]?[a-zA-Z0-9]+_[0-9][(]?[(]?[\\w]*[)]?[\\w]*[)]?",
//										" ");
						//para remover o codigo que ocorre o problmea, deixar so a mensagem
						if (s.contains(";"))
							s = "";
						else
							s = s
							.replaceAll(
									"[(]?[(]?[a-zA-Z0-9]+_[0-9][(]?[(]?[\\w]*[)]?[\\w]*[)]?",
									" ");
						String[] split = s.split(" ");
						s = "";
						for (String string : split) {
							if (!(string.startsWith("'") && (string.endsWith("'") || string.endsWith("',")))) {
								s+= string +" ";
							}
						}
							
					} else
						s = "ERROR";
					x = x + "\n" + s;

				}

			}
		
		if (warnings.containsKey(x)) {
//			Integer integer = warnings.get(x);
//			integer = integer + 1;
//			warnings.put(x, integer);
			return false;
		} else {
//			warnings.put(x, 1);
			currentMsg = x;
			return true;
//			System.out.println(target.getAbsolutePath() + " "+x);
		}

//		in.close();
	
}

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
				"-1.6 -classpath rt.jar \"" + path + "\"", pw, pwerror);

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