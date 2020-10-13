package tests.jdolly;

import java.io.File;

public class Tools {
	public static boolean deleteDir(File dir) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			if (children != null) {
				for (int i = 0; i < children.length; i++) {
					boolean success = deleteDir(new File(dir, children[i]));
					if (!success) {
						return false;
					}
				}
			}
		}

		// Agora o diretório está vazio, restando apenas deletá-lo.
		return dir.delete();
	}

	public static void deleteTempDir() {
		File f = new File("/tmp/");
		String[] dir = f.list();
		for (String string : dir) {
			if (string.contains("temp") || string.contains("SafeRefactor")) {
				File tmpDir = new File("/tmp/" + string + "/");
				if (tmpDir.isDirectory()) {
					deleteDir(tmpDir);
				}
			}
		}
	}
}
