package tests_oldTech;



import br.edu.dsc.ufcg.jdolly.JDolly;
import br.edu.dsc.ufcg.jdolly.JDollyWithField;
import AST.FieldDecl;
import AST.FieldDeclaration;
import AST.MemberTypeDecl;
import AST.MethodDecl;
import AST.Program;
import AST.RefactoringException;
import AST.TypeDecl;
import tests.jdolly.Tools;
public class PullUpFieldTest extends Test_oldTech{

	private static final String fieldTarget = "fieldid_0";
	private static final String classTarget = "ID1_0";


	public static void main(String[] args) {
//		new PushDownFieldTest().run(2000);//	
		Tools.deleteTempDir();
		new PullUpFieldTest().run(25);
		Tools.deleteTempDir();
		new PullUpFieldTest().run(10);
		Tools.deleteTempDir();
////		new PullUpFieldTest().run(3);
		new PullUpFieldTest().run(1);
		Tools.deleteTempDir();
//		
//		new RenameMethodTest().run(25);
//		new RenameMethodTest().run(10);
////		new RenameFieldTest().run(3);
//		new RenameMethodTest().run(1);
////		
//		new EncapsulateFieldTest().run(25);
//		new EncapsulateFieldTest().run(10);
////		new EncapsulateFieldTest().run(3);
//		new EncapsulateFieldTest().run(1);
//		 
//		new PushDownFieldTest(). run(25);
//		new PushDownFieldTest().run(10);
//		new PushDownFieldTest().run(1);
//		
//		new MoveMethodTest().run(25);
//		new MoveMethodTest().run(10);
//		new MoveMethodTest().run(1);
	}
	
	@Override
	public Program refactoring(Program program) throws RefactoringException {
		TypeDecl td = program.findType(classTarget);
		
		FieldDeclaration[] fields = new FieldDeclaration[1];
		MethodDecl[] methods = new MethodDecl[0];
		MemberTypeDecl[] types = new MemberTypeDecl[0];
		FieldDeclaration fd = td.findField(fieldTarget);
		fields[0] = fd;
		
		td.doPullUpMembers(methods, null, fields, types);
		
		return program;
	}

	@Override
	protected JDolly getCUGen() {
		JDolly jdolly = new JDollyWithField("../program_counter/alloyTheory/pullupfield_final.als", 2, 3, 1,2);
		return jdolly;
	}

}
