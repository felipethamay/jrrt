package tests.jdolly;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyNoField;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;

public class RenameTypeTest extends Test {

	private static final String newName = "ClassId_2";
	private static final String classTarget = "ClassId_1";

	public static void main(String[] args) {
		// new RenameTypeTest().run(400);
		// Tools.deleteTempDir();
		// new RenameTypeTest().run(25);
		// Tools.deleteTempDir();
		// new RenameTypeTest().run(10);
		Tools.deleteTempDir();
		new RenameTypeTest().run(1);
		Tools.deleteTempDir();
	}

	@Override
	protected Program refactoring(Program program) throws RefactoringException {

		TypeDecl tp = program.findType(classTarget);
		tp.rename(newName);

		return program;
	}

	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyNoField(
				"../program_counter/alloyTheory/renameclass_final.als", 2, 3, 3);
		return jdolly;
	}

}