package tests.jdolly;

import io.InputManager;
import io.InputManagerASCII;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import com.sun.xml.internal.ws.org.objectweb.asm.Type;

import AST.BodyDecl;
import AST.CompilationUnit;
import AST.Declaration;
import AST.MethodDecl;
import AST.ParameterDeclaration;
import AST.Program;
import AST.RawCU;
import AST.TypeDecl;

public class BCCategorizer {

	String transformations;
	private ArrayList<List<String>> listSources;
	private ArrayList<List<String>> listTargets;

	private List<String> listOverloadings = new ArrayList<String>();
	private List<String> listOverloadings_superthis = new ArrayList<String>();
	private List<String> listOverloadings_superthis_accessibility = new ArrayList<String>();
	private List<String> listOverloadings_accessibility = new ArrayList<String>();
	private List<String> listOverridings = new ArrayList<String>();
	private List<String> listOverridings_superthis = new ArrayList<String>();
	private List<String> listOverridings_superthis_accessibility = new ArrayList<String>();
	private List<String> listOverridings_accessibility = new ArrayList<String>();
	private List<String> uncategorizedBCs = new ArrayList<String>();

	public BCCategorizer(String transformations) {
		this.transformations = transformations;
		createSourceAndTargets();
	}

	private void createSourceAndTargets() {
		listSources = new ArrayList<List<String>>();
		listTargets = new ArrayList<List<String>>();

		InputManager im;
		try {
			im = new InputManagerASCII(this.transformations);
			im.openFile();

			boolean isSource = false;
			boolean isTarget = false;

			String tmpSource = "";
			String tmpTarget = "";
			boolean isNew = true;
			List<String> listClasses = new ArrayList<String>();
			while (!im.isEndOfFile()) {
				String line = im.readLine();
				if (line.equals(""))
					continue;

				if (isSource) {
					if (line.equals("<source>")) {
						String classCode = tmpSource;
						listClasses.add(classCode);
						isSource = false;
						listSources.add(listClasses);
						listClasses = new ArrayList<String>();
						isNew = true;
						tmpSource = "";
						continue;
					}

					if (line.startsWith("package")) {

						if (!isNew) {
							String classCode = tmpSource;
							listClasses.add(classCode);
						}
						tmpSource = "";
						isNew = false;
					}
					tmpSource = tmpSource + line + "\n";
					isNew = false;

					continue;

				} else if (isTarget) {
					if (line.equals("<target>")) {
						String classCode = tmpTarget;
						listClasses.add(classCode);
						isTarget = false;
						listTargets.add(listClasses);
						listClasses = new ArrayList<String>();
						isNew = true;
						tmpTarget = "";
						continue;
					}
					if (line.startsWith("package")) {

						if (!isNew) {
							String classCode = tmpTarget;
							listClasses.add(classCode);
						}
						tmpTarget = "";
						isNew = false;
					}
					tmpTarget = tmpTarget + line + "\n";
					isNew = false;
					continue;

				} else {

					if (line.equals("<source>")) {
						isSource = true;
						isNew = true;
						listClasses = new ArrayList<String>();
					}

					if (line.equals("<target>")) {
						isTarget = true;
						isNew = true;
						listClasses = new ArrayList<String>();
					}

				}
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void categorize() {

		for (int i = 0; i < listSources.size(); i++) {

			List<String> listSourceClasses = listSources.get(i);
			List<String> listTargetClasses = listTargets.get(i);

			List<RawCU> sourceCus = new ArrayList<RawCU>();
			List<RawCU> targetCus = new ArrayList<RawCU>();
			for (int j = 0; j < listSourceClasses.size(); j++) {
				String classSource = listSourceClasses.get(j);
				String classname = "";
				if (classSource.contains("public class ClassId_0"))
					classname = "ClassId_0";
				if (classSource.contains("public class ClassId_1"))
					classname = "ClassId_1";
				if (classSource.contains("public class ClassId_2"))
					classname = "ClassId_2";
				if (classSource.contains("public class A_0"))
					classname = "A_0";
				sourceCus.add(new RawCU(classname, classSource));
			}

			for (int j = 0; j < listTargetClasses.size(); j++) {
				String classTarget = listTargetClasses.get(j);
				// System.out.println(classTarget);
				String classname = "";
				if (classTarget.contains("public class ClassId_0"))
					classname = "ClassId_0";
				if (classTarget.contains("public class ClassId_1"))
					classname = "ClassId_1";
				if (classTarget.contains("public class ClassId_2"))
					classname = "ClassId_2";
				if (classTarget.contains("public class A_0"))
					classname = "A_0";
				// System.out.println("name: " + classname);
				targetCus.add(new RawCU(classname, classTarget));
			}

			RawCU[] targetCusToArray = new RawCU[targetCus.size()];
			targetCus.toArray(targetCusToArray);
			Program targetProgram = Program
					.fromCompilationUnits(targetCusToArray);

			RawCU[] sourceCusToArray = new RawCU[sourceCus.size()];
			sourceCus.toArray(sourceCusToArray);
			Program sourceProgram = Program
					.fromCompilationUnits(sourceCusToArray);

			analize(sourceProgram, targetProgram);

		}
	}

	public void analize(Program sourceProgram, Program targetProgram) {
		// TODO: testar com sourceClasses()
		TypeDecl type1 = sourceProgram.findType("ClassId_0");
		TypeDecl type2 = sourceProgram.findType("ClassId_1");
		TypeDecl type3 = sourceProgram.findType("ClassId_2");
		TypeDecl type4 = sourceProgram.findType("A_0");
		TypeDecl[] types = { type1, type2, type3, type4 };

		List<MethodDecl> listMethods = new ArrayList<MethodDecl>();

		for (TypeDecl type : types) {
			if (type == null)
				continue;

			int numChild = type.getNumBodyDecl();
			for (int i = 0; i < numChild; i++) {
				if (type.getBodyDecl(i) != null
						&& type.getBodyDecl(i) instanceof MethodDecl)
					listMethods.add((MethodDecl) type.getBodyDecl(i));
			}
		}

		boolean possibleOverride = false;
		boolean possibleOverloading = false;
		boolean sourceHasSuper = false;
		boolean targetHasSuper = false;

		for (int i = 0; i < listMethods.size(); i++) {
			MethodDecl methodDecl = listMethods.get(i);
			String methodName = methodDecl.name();
			AST.List<ParameterDeclaration> parameters = methodDecl
					.getParameters();

			// check if has super
			if (methodDecl.toString().contains("super"))
				sourceHasSuper = true;

			for (int j = 0; j < listMethods.size(); j++) {

				if (i == j)
					continue;
				MethodDecl methodDecl2 = listMethods.get(j);
				String methodName2 = methodDecl2.name();
				AST.List<ParameterDeclaration> parameters2 = methodDecl2
						.getParameters();

				if (methodName.equals(methodName2)) {

					// System.out.println(parameters);
					// System.out.println(parameters2);

					if (parameters.toString().equals(parameters2.toString()))
						possibleOverride = true;
					else
						possibleOverloading = true;
				}

			}
		}

		// TARGET
		Collection<MethodDecl> targetMethods = targetProgram.sourceMethods();
		for (MethodDecl methodDecl : targetMethods) {
			if (methodDecl.toString().contains("super"))
				targetHasSuper = true;
		}

		boolean superThis = false;
		if ((targetHasSuper && !sourceHasSuper)
				|| (!targetHasSuper && sourceHasSuper))
			superThis = true;

		// programSource
		StringBuffer sb = new StringBuffer();
		for (TypeDecl typeDecl : types) {
			if (typeDecl == null)
				continue;
			sb.append(typeDecl.toString());
			sb.append("\n");
		}

		if (possibleOverloading) {
			if (superThis)
				listOverloadings_superthis.add(sb.toString());
			else
				listOverloadings.add(sb.toString());

		} else if (possibleOverride) {
			if (superThis)
				listOverridings_superthis.add(sb.toString());
			else
				listOverridings.add(sb.toString());
		} else {
			try {
				throw new Exception("Behavioral change not categorized!");
			} catch (Exception e) {
				uncategorizedBCs.add(sb.toString());
				e.printStackTrace();
			}
		}
		// System.out.println(possibleOverloading);
		// System.out.println(possibleOverride);

	}

	public void summary() {
		System.out.println("Total of Behavioral Changes: "
				+ this.listSources.size());
		System.out.println("Possible Overloading: "
				+ this.listOverloadings.size());

		System.out.println("Possible Overloading + superThis: "
				+ this.listOverloadings_superthis.size());

		System.out.println("Possible Overriding: "
				+ this.listOverridings.size());

		System.out.println("Possible Overriding + superThis: "
				+ this.listOverridings_superthis.size());
	}

	public static void main(String[] args) {
		String path = "programsBC";
		BCCategorizer categorizer = new BCCategorizer(path);
		categorizer.categorize();
		categorizer.summary();
	}

}
