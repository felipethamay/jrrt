package tests.jdolly;

import java.io.File;

import org.apache.tools.ant.DefaultLogger;
import org.apache.tools.ant.Project;
import org.apache.tools.ant.ProjectHelper;

import saferefactor.core.analysis.safira.Constants;

//import br.edu.ufcg.saferefactor.refactoring.Constants;

public class RunTests {
	public static void main(String[] args) {

		int skip = 2;

		try {
			new PullUpMethodTest().run(skip);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// clean();
		// new moveMethodTest().run();
		// clean();
		// new PushDownMethodTest().run();
		// new PullUpFieldTest().run();
		// clean();
		// new PullUpMethodTest().run();
		// clean();
		// new RenameTypeTest().run();
		// clean();
		// new RenameMethodTest().run();

	}

	public static void clean() {
		File buildFile = new File("ant" + Constants.FILE_SEPARATOR
				+ "build_clean.xml");
		Project p = new Project();

		// propriedades
		p.setProperty("tests.folder", System.getProperty("java.io.tmpdir"));

		DefaultLogger consoleLogger = new DefaultLogger();
		consoleLogger.setErrorPrintStream(System.err);
		consoleLogger.setOutputPrintStream(System.out);
		consoleLogger.setMessageOutputLevel(Project.MSG_INFO);
		p.addBuildListener(consoleLogger);

		p.init();
		ProjectHelper helper = ProjectHelper.getProjectHelper();
		p.addReference("ant.projectHelper", helper);
		helper.parse(p, buildFile);
		p.executeTarget(p.getDefaultTarget());
	}
}
