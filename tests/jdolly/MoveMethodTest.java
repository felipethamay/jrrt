package tests.jdolly;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyWithField;
import AST.FieldDeclaration;
import AST.MethodDecl;
import AST.Program;
import AST.RefactoringException;
import AST.SimpleSet;
import AST.TypeDecl;

public class MoveMethodTest extends TestOS_AM {

	private static final String methodTarget = "m_0(int)";
	private static final String classTarget = "A_0";
	private static final String classToMove = "fieldid_0";

	public static void main(String[] args) {
		Tools.deleteTempDir();
		new MoveMethodTest().run(10);
		Tools.deleteTempDir();
		// new MoveMethodTest().run(10);
		Tools.deleteTempDir();
		// new MoveMethodTest().run(25);
		Tools.deleteTempDir();
		// //
		// new PullUpMethodTest().run(1);
		// Tools.deleteTempDir();

		// new PullUpFieldTest().run(25);
		// Tools.deleteTempDir();
		// new PullUpFieldTest().run(10);
		// Tools.deleteTempDir();
		// new PullUpFieldTest().run(1);
		// Tools.deleteTempDir();
		// new PushDownFieldTest().run(25);
		// Tools.deleteTempDir();
		// new PushDownFieldTest().run(10);
		// Tools.deleteTempDir();
		// new PushDownFieldTest().run(1);
		// Tools.deleteTempDir();
		//
		//
		// new EncapsulateFieldTest().run(25);
		// Tools.deleteTempDir();
		// new EncapsulateFieldTest().run(10);
		// Tools.deleteTempDir();
		// new EncapsulateFieldTest().run(1);
		// Tools.deleteTempDir();
		// new RenameMethodTest().run(25);
		// Tools.deleteTempDir();
		// new RenameMethodTest().run(10);
		// Tools.deleteTempDir();
		// new RenameMethodTest().run(1);
		// Tools.deleteTempDir();
		//

	}

	@Override
	protected Program refactoring(Program program) throws RefactoringException {
		TypeDecl td = program.findType(classTarget);
		FieldDeclaration field = td.findField("fieldid_0");
		SimpleSet s = td.localMethodsSignature(methodTarget);
		MethodDecl md = (MethodDecl) s.iterator().next();
		// MethodDecl md = td.findMethod(methodTarget);
		md.doMoveToField(classToMove, true, true, true);
		return program;
	}

	@Override
	protected JDolly getCUGen() {
		return new JDollyWithField(
				"../program_counter/alloyTheory/movemethod_final.als", 2, 3, 3,
				1);
	}

}
