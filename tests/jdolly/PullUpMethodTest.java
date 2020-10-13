package tests.jdolly;

import java.util.Collection;
import java.util.List;

import org.eclipse.jdt.core.dom.CompilationUnit;

import jdolly.JDolly;
import jdolly.JDollyImp;
//import saferefactor.core.SRImpact;
import tests.CompileHelper;
import AST.MethodDecl;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;

public class PullUpMethodTest extends Test_jrrtInputs {

	private static final String methodTarget = "m";
	private static final String classTarget = "A";
//	private static final String methodTarget = "m_0";
//	private static final String classTarget = "ClassId_0";

	public static void main(String[] args) {

//		String path = "/Users/melmongiovi/Documents/doutorado/bug_transf/results_exp/PullUpMethod4/Alloy/";
//		int i = 3943;
//		String in = path + "test" + i + "/in/";
//		String out = path + "test" + i + "/out/eclipse/";
//
//		// in = "/Users/melmongiovi/Documents/workspace/source/";
//		// out = "/Users/melmongiovi/Documents/workspace/target/";
//		SRImpact sri = new SRImpact("", in, out, "", "0.5", "", true);
//		// System.out.println("is refactoring "+sri.isRefactoring());
//		if (!sri.isRefactoring()) {
//
//			System.out.println("BEHAVIORAL CHANGE");
//		}

		// Tools.deleteTempDir();
		// new PullUpMethodTest().run(25);
		// Tools.deleteTempDir();
		// new PullUpMethodTest().run(10);

		 Tools.deleteTempDir();
		 new PullUpMethodTest().run(1);
		 Tools.deleteTempDir();

		// new PushDownMethodTest().run(25);
		// new PushDownMethodTest().run(10);
		// new PushDownMethodTest().run(1);
		//
		// new RenameFieldTest().run(25);
		// new RenameFieldTest().run(10);
		// new RenameFieldTest().run(1);

		//
		// new RenameTypeTest().run(25);
		// new RenameTypeTest().run(10);
		// new RenameTypeTest().run(1);
		//
		// new AddParameterTest().run(25);
		// new AddParameterTest().run(10);
		// new AddParameterTest().run(1);
	}

	@Override
	protected Program refactoring(Program program) throws RefactoringException {

		TypeDecl td = program.findType(classTarget);

		MethodDecl md = td.findMethod(methodTarget);

		md.doPullUp();

		return program;
	}

	@Override
	protected JDolly getCUGen() {
		// JDollyImp jDollyImp = new
		// JDollyImp("/Users/melmongiovi/Documents/workspace3/program_counter/alloyTheoryNew/pullupmethod_final.als",
		// 2, 3,
		// 4, 0);
		// // List<CompilationUnit> next = jDollyImp.next();
		// jDollyImp.hasNext();
		// List<CompilationUnit> current = jDollyImp.next();
		return new JDollyImp(
				"/Users/melmongiovi/Documents/workspace3/program_counter/alloyTheoryNew/pullupmethod_final.als",
				2, 4, 5, 0);
	}
}
