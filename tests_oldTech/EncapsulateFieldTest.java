package tests_oldTech;

import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyWithField;
import AST.FieldDeclaration;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;
import tests.jdolly.Tools;
public class EncapsulateFieldTest extends Test_oldTech {

	private static final String fieldName = "fieldid_0";


	@Override
	public Program refactoring(Program program) throws RefactoringException {
//		System.out.println("Program before:");
//		System.out.println(program);
//		TypeDecl td = program.findType("Class1_0");
		FieldDeclaration fd = program.findField(fieldName);
		
		fd.doSelfEncapsulate();
		
//		System.out.println("Program after:");
//		System.out.println(program);
		return program;
	}

	@Override
	protected JDolly getCUGen() {
		return new JDollyWithField("../program_counter/alloyTheory/encapsulateField_final.als", 2,
				3, 2,1);
	}

}
