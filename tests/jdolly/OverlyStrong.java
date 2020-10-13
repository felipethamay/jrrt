package tests.jdolly;

import io.InputManager;
import io.InputManagerASCII;
import io.OutputManager;
import io.OutputManagerASCII;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class OverlyStrong {

	String[] jrrt;
	String[] eclipse;
	String[] warning;

	List<Integer> compilation_errors = new ArrayList<Integer>();
	List<Integer> input_compilation_errors = new ArrayList<Integer>();
	List<Integer> engine_crash = new ArrayList<Integer>();
	List<Integer> warning_status = new ArrayList<Integer>();
	List<Integer> null_pointer = new ArrayList<Integer>();
	List<Integer> behavioral_changes = new ArrayList<Integer>();
	List<Integer> test_compilation_error = new ArrayList<Integer>();
	List<Integer> overly_strong_conditions_eclipse = new ArrayList<Integer>();
	List<Integer> overly_strong_conditions_jrrt = new ArrayList<Integer>();

	public void count(String path) throws IOException {
		InputManager im = new InputManagerASCII(path);
		im.openFile();
		while (!im.isEndOfFile()) {
			String line = im.readLine();
			if (line.equals("warning_status")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					warning = line.split(", ");
					break;
				}
			}
		}
	}

	public List<Integer> count2(String path) throws IOException {
		List<Integer> list = new ArrayList<Integer>();
		InputManager im = new InputManagerASCII(path);
		im.openFile();
		while (!im.isEndOfFile()) {
			String line = im.readLine();
			if (line.contains("programs")) {
				while (!im.isEndOfFile()) {
					line = im.readLine();
					list.add(Integer.parseInt(line));

				}
			}
		}
		return list;
	}

	public void readFile(String path) throws IOException {

		InputManager im = new InputManagerASCII(path);
		im.openFile();
		while (!im.isEndOfFile()) {
			String line = im.readLine();
			if (line.equals("overly_strong_conditions_jrrt")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					jrrt = line.split(", ");
					continue;
				}
			}

			if (line.equals("overly_strong_conditions_eclipse")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					eclipse = line.split(", ");
					continue;
				}
			}
		}
		im.closeFile();
	}

	public void readFileWS(String path) throws IOException {

		InputManager im = new InputManagerASCII(path);
		im.openFile();
		while (!im.isEndOfFile()) {
			String line = im.readLine();
			if (line.equals("warning_status")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					jrrt = line.split(", ");
					continue;
				}
			}
		}
		im.closeFile();
	}

	public void fixFile(String path) throws IOException {

		InputManager im = new InputManagerASCII(path);
		im.openFile();
		while (!im.isEndOfFile()) {
			String line = im.readLine();

			if (line.equals("compilation_errors")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									compilation_errors.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}

			if (line.equals("input_compilation_errors")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									input_compilation_errors.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}
			if (line.equals("engine_crash")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									engine_crash.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}
			if (line.equals("warning_status")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									warning_status.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}
			if (line.equals("null_pointer")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									null_pointer.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}
			if (line.equals("behavioral_changes")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									behavioral_changes.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}
			if (line.equals("test_compilation_error")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									test_compilation_error.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}
		}
		im.closeFile();

		OutputManagerASCII out = new OutputManagerASCII(path);
		out.createFile();
		writeMessages(out);
		out.closeFile();
	}

	public void fixFileOS(String path) throws IOException {

		InputManager im = new InputManagerASCII(path);
		im.openFile();
		while (!im.isEndOfFile()) {
			String line = im.readLine();

			if (line.equals("overly_strong_conditions_jrrt")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									overly_strong_conditions_jrrt.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}

			if (line.equals("overly_strong_conditions_eclipse")) {
				if (!im.isEndOfFile()) {
					line = im.readLine();
					line = line.substring(1);
					line = line.substring(0, line.length() - 1);
					String[] split = line.split(", ");
					if (split.length > 0) {
						int ultimo = 40000;
						int i = split.length - 1;
						while (true) {
							if (i < 0)
								break;
							if (split[i].equals("")) {
								i--;
							} else {
								int n = Integer.parseInt(split[i]);
								if (n < ultimo) {
									ultimo = n;
									overly_strong_conditions_eclipse.add(n);
									i--;
								} else {
									break;
								}
							}
						}
					}
					continue;
				}
			}

		}
		im.closeFile();

		OutputManagerASCII out = new OutputManagerASCII(path);
		out.createFile();
		writeMessagesOS(out);
		out.closeFile();
	}

	public void writeMessages(OutputManager file) throws IOException {
		file.writeLine("compilation_errors");
		file.writeLine(compilation_errors.toString());

		file.writeLine("input_compilation_errors");
		file.writeLine(input_compilation_errors.toString());

		file.writeLine("engine_crash");
		file.writeLine(engine_crash.toString());

		file.writeLine("warning_status");
		file.writeLine(warning_status.toString());

		file.writeLine("null_pointer");
		file.writeLine(null_pointer.toString());

		file.writeLine("behavioral_changes");
		file.writeLine(behavioral_changes.toString());

		file.writeLine("test_compilation_error");
		file.writeLine(test_compilation_error.toString());
	}

	public void writeMessagesOS(OutputManager file) throws IOException {
		file.writeLine("overly_strong_conditions_eclipse");
		file.writeLine(overly_strong_conditions_eclipse.toString());

		file.writeLine("overly_strong_conditions_jrrt");
		file.writeLine(overly_strong_conditions_jrrt.toString());
	}

	public void categorize(String engine, String path) {

		// if (engine.equals("eclipse")) {
		// OracleOS.categorize(engine,path,
		// "REFACTORING_INAPPLICABLE", eclipse);
		// } else if (engine.equals("jrrt")) {
		// OracleOS.categorize(engine,path,
		// "REFACTORING_INAPPLICABLE", jrrt);
		// }
	}

	public static void main(String[] args) throws IOException {

		String engine = "jrrt";
		// engine = "eclipse";
		int skip = 1;
		String path = "/home/spg-experiment-3/Documents/";
		String refactoring = "movemethod";
		OverlyStrong os = new OverlyStrong();
		// os.fixFileOS(path
		// +"/overly_strong_conditions_"+refactoring+skip+".txt");
		os.readFile(path + "/overly_strong_conditions_" + refactoring + skip
				+ ".txt");
		// os.readFileWS(path+engine+"/"+refactoring+"/skip"+skip+"/"+engine+"_sri_message_"+refactoring+"_"+skip+".txt");
		System.out.println("eclipse: " + os.eclipse.length + " jrrt: "
				+ os.jrrt.length);
		// ////
		os.categorize(engine, path + engine + "/" + refactoring + "/skip"
				+ skip + "/");

		// os.fixFile(path+engine+"/"+refactoring+"/skip"+skip+"/"+engine+"_sri_message_"+refactoring+"_"+skip+".txt");

		// os.count("/Users/melmongiovi/Documents/resultados/SCP/SRI/jrrt/pushdownmethod/skip20/jrrt_sri_message_pushdownmethod_0.3.txt");
		// os.count("/Users/melmongiovi/Documents/resultados/SCP/SRI/eclipse/pushdownmethod/skip20/0.3s/eclipse_sri_message_pushdownmethod_0.3.txt");
		// System.out.println(os.warning.length);

	}

}
