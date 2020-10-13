package tests_oldTech;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyWithField;
import AST.FieldDeclaration;
import AST.Program;
import AST.RefactoringException;
import tests.jdolly.Tools;
public class RenameFieldTest extends Test_oldTech {

	private static final String fieldTarget = "fieldid_0";
	private static final String newName = "fieldid_1";
	
	

	public static void main(String[] args) {
		new RenameMethodTest().run(1);
	}
	
	@Override
	public Program refactoring(Program program) throws RefactoringException {
//	TypeDecl td = program.findType(classTarget);
			
		FieldDeclaration md = program.findField(fieldTarget);

		md.rename(newName);

		return program;
	}



	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyWithField("../program_counter/alloyTheory/renamefield_final.als", 2, 3, 1,2);
		return jdolly;
	}

}

