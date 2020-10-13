package tests.jdolly;

//
//import java.io.IOException;
//import java.util.ArrayList;
//import java.util.Iterator;
//import java.util.List;
//
//import manipulator.ClassManipulator;
//
//
//
//import entity.Method;

public class Coverage {

	// private ClassManipulator c;
	// private int changeCovered = 0;
	// private int coverageSourceNumber = 0;
	// private int coverageTargetNumber = 0;
	//
	//
	// public Coverage() {
	//
	// }
	//
	// private boolean isCalledByTheList(List<Method> list, Method m) {
	// String fullName = m.getFullName().trim();
	//
	// for (Method method : list) {
	// if (method.getFullName().equals(m.getFullName())) {
	// return true;
	// }
	// List<Method> miv = method.getMethodInvoc();
	// for (Method methodInvocation : miv) {
	//
	// if (methodInvocation.getFullName().trim().equals(fullName)) {
	// return true;
	// }
	// }
	// }
	// return false;
	// }
	//
	// public List<Method> union(List<Method> source, List<Method> target) {
	//
	// List<Method> returnList = new ArrayList<Method>();
	// for (Method m: source) {
	// returnList.add(m);
	// }
	//
	// for(Method method: target) {
	// if (containsMethod(source, method) == null) {
	// returnList.add(method);
	// }
	// }
	//
	// return returnList;
	// }
	//
	// //returnList ja vem com todos os metodos que exercitam diretamente a
	// mudanÁa
	// public List<Method> getMethodsExerciseTheChangeForCoverage(List<Method>
	// impactedMethods,
	// List<Method> returnList) {
	//
	// while (true) {
	// boolean ok = false;
	// for (Method method : impactedMethods) {
	// if (containsMethod(returnList, method) == null) {
	// //verifica se "method"é chamado por alguém de returnList, se sim,
	// adiciona a returnList
	// if (isCalledByTheList(returnList, method)) {
	// returnList.add(method);
	// ok = true;
	// }
	// }
	// }
	// if (!ok) break;
	// }
	//
	// return returnList;
	// }
	//
	// public List<Method> getMethodsExercisedByTheTests(List<Method>
	// impactedMethods,
	// List<Method> tests) {
	// List<Method> returnList = new ArrayList<Method>();
	// while (true) {
	// boolean ok = false;
	// for (Method method : impactedMethods) {
	// if (containsMethod(returnList, method) == null) {
	// //verifica se "method"é chamado por alguém de returnList, se sim,
	// adiciona a returnList
	// if (isCalledByTheList(tests, method) || isCalledByTheList(returnList,
	// method)) {
	// returnList.add(method);
	// ok = true;
	// }
	// }
	// }
	// if (!ok) break;
	// }
	//
	// return returnList;
	// }
	//
	// private List<Method> invokeMethodCoverage(List<Method> l, List<Method>
	// commonImpacted, String fullNameMethod) {
	//
	// List<Method> returnList = new ArrayList<Method>();
	//
	// for (Method method : l) {
	// if (method.getFullName().equals(fullNameMethod)) {
	// if (containsMethod(commonImpacted, method) == null)
	// returnList.add(method);
	// }
	// }
	//
	// return returnList;
	// }
	//
	// private Method containsMethod(List<Method> l, Method m) {
	//
	// for (Method method : l) {
	// if (method.equals(m)) {
	// return method;
	// }
	// }
	// return null;
	// }
	//
	// public String calculateCoverage() throws IOException {
	//
	// return calculateCoverage(c.getTestPath());
	//
	// }
	//
	// public String calculateCoverageToSR(String testPath) throws IOException {
	//
	// return calculateCoverage(testPath);
	//
	// }
	//
	// public String calculateCoverage(String testPath) throws IOException {
	//
	// // String testPath =
	// "/var/folders/uB/uBSypadvEUa5OUqqynr2Tk+++TI/-Tmp-/safeRefactorAJ/tests/";
	// List<Method> impactedMethodsSource = c.getImpactedMethodsSource();
	// List<Method> impactedMethodsTarget = c.getImpactedMethodsTarget();
	// ClassManipulator cTest = new ClassManipulator(testPath);
	// List<Method> testMethods = cTest.getSourceMethod();
	//
	// List<Method> union = this.union(impactedMethodsSource,
	// impactedMethodsTarget);
	//
	// System.out.println("union: ");
	// for (Method method : union) {
	// System.out.println(method.getFullName());
	// }
	//
	// String coverages;
	//
	// if (union != null) {
	// int impactedMethods = union.size();
	// List<Method> coverageSource =
	// this.getMethodsExercisedByTheTests(impactedMethodsSource, testMethods);
	// List<Method> coverageTarget =
	// this.getMethodsExercisedByTheTests(impactedMethodsTarget, testMethods);
	//
	//
	// List<Method> methodsExerciseTheChangeCoverage =
	// this.union(coverageSource, coverageTarget);
	// System.out.println("metodos que sao exercitados pelos testes");
	// for (Method method : methodsExerciseTheChangeCoverage) {
	// System.out.println(method.getFullName());
	// }
	//
	// int ims = impactedMethodsSource.size();
	// int imt = impactedMethodsTarget.size();
	//
	// if (impactedMethods > 0) {
	// changeCovered =
	// methodsExerciseTheChangeCoverage.size()*100/impactedMethods;
	// System.out.println("cobertura-------------------: "+changeCovered);
	// }
	//
	// if (ims >0) {
	// coverageSourceNumber =
	// coverageSource.size()*100/impactedMethodsSource.size();
	// System.out.println("coberturaSOurce-------------------: "+coverageSourceNumber);
	// }
	//
	// if (imt >0) {
	// coverageTargetNumber =
	// coverageTarget.size()*100/impactedMethodsTarget.size();
	// System.out.println("coberturaTarget-------------------: "+coverageTargetNumber);
	// }
	// }
	//
	// coverages = "c "+changeCovered +
	// " s "+coverageSourceNumber+" t "+coverageTargetNumber;
	//
	// return coverages;
	//
	// }
	//
	// public Coverage(ClassManipulator c) throws IOException {
	//
	// this.c = c;
	// this.calculateCoverage();
	//
	// }
	//
	// // public List<MethodCoverage> calculateCoverageUsingCoberturaTool(String
	// coverageFile) {
	// // Document doc = null;
	// //
	// // SAXBuilder builder = new SAXBuilder();
	// // try {
	// // doc = builder.build(coverageFile);
	// // } catch (Exception e) {
	// // e.printStackTrace();
	// // }
	// //
	// // Element root = doc.getRootElement();
	// //
	// // List<MethodCoverage> methods = new ArrayList<MethodCoverage>();
	// // Iterator classes = root.getDescendants(new ElementFilter("class"));
	// // while (classes.hasNext()) {
	// // Object next = classes.next();
	// // if (next instanceof Element) {
	// // String className = ((Element)next).getAttribute("name").getValue();
	// // Iterator methodNodes = ((Element)next).getDescendants(new
	// ElementFilter("method"));
	// // while (methodNodes.hasNext()) {
	// // Object nextMethod = methodNodes.next();
	// // if (nextMethod instanceof Element) {
	// // String methodName =
	// ((Element)nextMethod).getAttribute("name").getValue();
	// // String lineRate =
	// ((Element)nextMethod).getAttribute("line-rate").getValue();
	// // String branchRate =
	// ((Element)nextMethod).getAttribute("branch-rate").getValue();
	// // MethodCoverage mc = new MethodCoverage();
	// // mc.setName(className + "."+methodName);
	// // mc.setLine_rate(Double.parseDouble(lineRate));
	// // mc.setBranch_rate(Double.parseDouble(branchRate));
	// // System.out.println(mc.getName()+" "+
	// mc.getLine_rate()+" "+mc.getBranch_rate());
	// // }
	// // }
	// // }
	// // }
	// // return methods;
	// // }
	// //
	// public int getChangeCovered() {
	// return changeCovered;
	// }
	//
	// public void setChangeCovered(int changeCovered) {
	// this.changeCovered = changeCovered;
	// }
	//
	// public int getCoverageSourceNumber() {
	// return coverageSourceNumber;
	// }
	//
	// public void setCoverageSourceNumber(int coverageSourceNumber) {
	// this.coverageSourceNumber = coverageSourceNumber;
	// }
	//
	// public int getCoverageTargetNumber() {
	// return coverageTargetNumber;
	// }
	//
	// public void setCoverageTargetNumber(int coverageTargetNumber) {
	// this.coverageTargetNumber = coverageTargetNumber;
	// }
	//
	// public static void main(String[] args) throws IOException {
	//
	// String source =
	// "/Users/melmongiovi/Documents/workspace3/AnalisadorASM/subjects/subject1source/";
	// String target =
	// "/Users/melmongiovi/Documents/workspace3/AnalisadorASM/subjects/subject1target/";
	// // String source =
	// "/Users/melmongiovi/Documents/workspace3/AnalisadorASM/subjects/subsource/";
	// // String target =
	// "/Users/melmongiovi/Documents/workspace3/AnalisadorASM/subjects/subtarget/";
	// ClassManipulator c = new ClassManipulator(source, target, "lib", "60");
	//
	// Coverage coverage = new Coverage(c);
	//
	//
	//
	// }

}
