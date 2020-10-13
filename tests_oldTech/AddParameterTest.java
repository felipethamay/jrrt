package tests_oldTech;

import tests.jdolly.Tools;
import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyNoField;
import AST.IntegerLiteral;
import AST.Literal;
import AST.MethodDecl;
import AST.ParameterDeclaration;
import AST.PrimitiveType;
import AST.Program;
import AST.RefactoringException;
import AST.SimpleSet;
import AST.TypeDecl;

public class AddParameterTest extends Test_oldTech {

	@Override

	public Program refactoring(Program program) throws RefactoringException {

		TypeDecl td = program.findSimpleType("ClassId_0");
	
	//		 program.findMethodBySig("methodid_1()");
	
		SimpleSet s = td.localMethodsSignature("methodid_0()");
	
		if (s == null || s.isEmpty()) {
	
			td = program.findSimpleType("ClassId_1");
		
			s = td.localMethodsSignature("methodid_0()");
	
		if (s== null || s.isEmpty()) {
	
			td = program.findSimpleType("ClassId_2");
		
			s = td.localMethodsSignature("methodid_0()");
	
		}
		if (s== null || s.isEmpty()) {
			
			td = program.findSimpleType("ClassId_0");
		
			s = td.localMethodsSignature("methodid_1()");
	
		}
		if (s== null || s.isEmpty()) {
			
			td = program.findSimpleType("ClassId_1");
		
			s = td.localMethodsSignature("methodid_1()");
	
		}
		if (s== null || s.isEmpty()) {
			
			td = program.findSimpleType("ClassId_2");
		
			s = td.localMethodsSignature("methodid_1()");
	
		}
	
		}
	
		if (s!= null && !s.isEmpty()) {
		MethodDecl md = (MethodDecl) s.iterator().next();
	
	//		 MethodDecl md = program.findMethodBySig("methodid_1()");
	
		PrimitiveType param = new PrimitiveType();
	
		param.setID("int");
	
		Literal l = new IntegerLiteral("0");
	
		md.doAddParameter(new ParameterDeclaration(param, "i"), 0, l, false);
		}
		return program;

	}
	public static void main(String[] args) {
		Tools.deleteTempDir();
		new AddParameterTest().run(25);
		Tools.deleteTempDir();
		new AddParameterTest().run(10);
		Tools.deleteTempDir();
		new AddParameterTest().run(1);
		Tools.deleteTempDir();
	}


	@Override

	protected JDolly getCUGen() {

		return new JDollyNoField(
	
		"../program_counter/alloyTheory/addparameter_final.als",
	
		2, 3, 3);
	}

}
