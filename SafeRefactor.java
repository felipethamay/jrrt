import saferefactor.util.SRImpact;


public class SafeRefactor {
	public static void main(String[] args) {
		SRImpact sri;
		String source = "/Users/melmongiovi/Documents/doutorado/experiments/MT/jrrt/PullUpMethod/test3";
		String target = "/Users/melmongiovi/Documents/doutorado/experiments/MT/jrrt/PullUpMethod/test3/out/jrrt1/";
		sri = new SRImpact("", source, target, "","1", "", true);
		System.out.println("================is refactoring "+sri.isRefactoring());

	}}
