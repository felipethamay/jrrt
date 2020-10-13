	package tests_oldTech;

import java.util.Collection;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyNoField;
import tests.CompileHelper;
import AST.MethodDecl;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;
import tests.jdolly.Tools;
public class PullUpMethodTest extends Test_oldTech {

	private static final String methodTarget = "m_0";
	private static final String classTarget = "ClassId_0";

	public static void main(String[] args) {

			Tools.deleteTempDir();
		
		new PullUpMethodTest().run(25);
		Tools.deleteTempDir();
		new PullUpMethodTest().run(10);
		new PullUpMethodTest().run(1);
//		
//		new PushDownMethodTest().run(25);
//		new PushDownMethodTest().run(10);
//		new PushDownMethodTest().run(1);
//		
//		new RenameFieldTest().run(25);
//		new RenameFieldTest().run(10);
//		new RenameFieldTest().run(1);
//		
//		new RenameTypeTest().run(25);
//		new RenameTypeTest().run(10);
//		new RenameTypeTest().run(1);
//		
//		new AddParameterTest().run(25);
//		new AddParameterTest().run(10);
//		new AddParameterTest().run(1);
	}

	@Override
	public Program refactoring(Program program) throws RefactoringException {

		TypeDecl td = program.findType(classTarget);

		MethodDecl md = td.findMethod(methodTarget);

		md.doPullUp();

		return program;
	}

	
	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyNoField("../program_counter/alloyTheory/pullupmethod_final.als",
				2, 3, 4);
		return jdolly; 
	}
}
