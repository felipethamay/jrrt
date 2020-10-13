package tests.jdolly;

import java.util.Collection;
import java.util.List;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyNoField;

import tests.CompileHelper;
import AST.CompilationUnit;
import AST.MethodDecl;
import AST.Program;
import AST.RawCU;
import AST.RefactoringException;
import AST.TypeDecl;

public class PushDownMethodTest extends Test {

	private static final String methodTarget = "m_0";

	public static void main(String[] args) {
		// new PushDownMethodTest().refactoring(null);
		// Tools.deleteTempDir();
		new PushDownMethodTest().run(1);
		// Tools.deleteTempDir();
		// new PushDownMethodTest().run(10);
		Tools.deleteTempDir();
		// new PushDownMethodTest().run(1);
		// Tools.deleteTempDir();

	}

	@Override
	protected Program refactoring(Program program) throws RefactoringException {

		if (program != null) {
			MethodDecl md = program.findMethod(methodTarget);
			if (md != null)
				md.doPushDown(false);
		}
		// System.out.println(program.);
		return program;
	}

	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyNoField(
				"../program_counter/alloyTheory/pushdownmethod_final.als",
				// JDolly jdolly = new
				// JDollyNoField("../program_counter/alloyTheory/movemethod_final.als",
				2, 3, 4);
		return jdolly;
	}

}