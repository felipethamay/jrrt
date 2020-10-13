package tests_oldTech;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyWithField;
import AST.FieldDeclaration;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;
import tests.jdolly.Tools;
public class PushDownFieldTest extends Test_oldTech {
	private static final String fieldTarget = "fieldid_0";
	private static final String classTarget = "A_0";



	public static void main(String[] args) {

		Tools.deleteTempDir();
		new PushDownFieldTest().run(25);
		
		
		Tools.deleteTempDir();
		new PushDownFieldTest().run(10);
		Tools.deleteTempDir();
		new PushDownFieldTest().run(1);
		Tools.deleteTempDir();
		
//		Tools.deleteTempDir();
		new RenameMethodTest().run(25);
		Tools.deleteTempDir();
		new RenameMethodTest().run(10);
		Tools.deleteTempDir();
		new RenameMethodTest().run(1);
		Tools.deleteTempDir();
	}

	@Override
	public Program refactoring(Program program) throws RefactoringException {
		TypeDecl td = program.findType(classTarget);
		if (td == null) {
			td = program.findType("ClassId_1");
			if (td == null) {
				td = program.findType("ClassId_0");
			}
		}
		FieldDeclaration md = td.findField(fieldTarget);
		if (md == null) {
			td = program.findType("A_0");
			md = td.findField(fieldTarget);
			if (md == null) {
				td = program.findType("ClassId_0");
				md = td.findField(fieldTarget);
			}
		}
		if (md != null) {
			md.doPushDown();
		}

		return program;
	}

	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyWithField("../program_counter/alloyTheory/pushdownfield_final.als", 2, 3, 1,2);
		return jdolly;
	}
}
