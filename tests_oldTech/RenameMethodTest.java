package tests_oldTech;

import tests.jdolly.Tools;
import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyNoField;
import AST.MethodDecl;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;

public class RenameMethodTest extends Test_oldTech{

	private static final String methodTarget = "n_0";
	private static final String newName = "k_0";
	

	public static void main(String[] args) {
		Tools.deleteTempDir();
		new RenameMethodTest().run(25);
		Tools.deleteTempDir();
		new RenameMethodTest().run(10);
		Tools.deleteTempDir();
		new RenameMethodTest().run(1);
		Tools.deleteTempDir();
	}
	
	@Override
	public Program refactoring(Program program) throws RefactoringException {
//	TypeDecl td = program.findType(classTarget);
			
		MethodDecl md = program.findMethod(methodTarget);

		md.rename(newName);

		return program;
	}



	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyNoField("../program_counter/alloyTheory/renamemethod_final.als", 2, 3, 3);	
		return jdolly;
	}

}
