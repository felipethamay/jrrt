package tests.jdolly;

import io.InputManagerASCII;
import io.OutputManager;
import io.OutputManagerASCII;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Conditions_ {

	public static boolean cond1 = true;
	public static boolean cond2 = true;
	public static boolean cond3 = true;
	public static boolean cond4 = true;
	public static boolean cond5 = true;
	public static boolean cond6 = true;
	public static boolean cond7 = false;
	static int numCond = 5;

	static Map<Integer, ArrayList<String>> combinations = new HashMap<Integer, ArrayList<String>>();
	// static String [] combinationsOrdem;

	static int l = 0;
	static int num = 1;

	public static void changeCondtions(String bin) {

		int length = bin.length();
		int falta = numCond - length;
		String zeros = "";
		for (int i = 0; i < falta; i++) {
			zeros = zeros + "0";
		}
		bin = zeros + bin;
		change(bin);

	}

	static void change(String bin) {
		String[] numbers = bin.split("");
		int i = 0;
		for (String num : numbers) {
			if (i == 1) {
				if (num.equals("1"))
					cond1 = false;
				else
					cond1 = true;
			} else if (i == 2) {
				if (num.equals("1"))
					cond2 = false;
				else
					cond2 = true;
			} else if (i == 3) {
				if (num.equals("1"))
					cond3 = false;
				else
					cond3 = true;
			} else if (i == 4) {
				if (num.equals("1"))
					cond4 = false;
				else
					cond4 = true;
			}
			// else if (i == 5) {
			// if (num.equals("1")) cond5 = false; else cond5 = true;
			// }else if (i == 6) {
			// if (num.equals("1")) cond6 = false; else cond6 = true; }
			else if (i == 5) {
				if (num.equals("1"))
					cond7 = false;
				else
					cond7 = true;
			}
			i++;
		}
	}

	// pegando sempre o conjunto minimo de condicoes
	public static void create(String bin) {

		int length = bin.length();
		int falta = numCond - length;
		String zeros = "";
		for (int i = 0; i < falta; i++) {
			zeros = zeros + "0";
		}
		bin = zeros + bin;
		String[] numbers = bin.split("");
		int conditions = 0;
		for (String num : numbers) {
			if (num.equals("1"))
				conditions++;
		}

		ArrayList<String> list;
		if (combinations.containsKey(conditions)) {
			list = combinations.get(conditions);
		} else {
			list = new ArrayList<String>();
		}
		list.add(bin);
		combinations.put(conditions, list);
	}

	public static void createList() {
		int num = 1;
		int max = (int) Math.pow(2, numCond);
		while (num < max) {
			create(Integer.toBinaryString(num));
			num++;
		}

	}

	public static boolean nextChangeMin() {
		if (l == 0)
			createList();
		int max = (int) Math.pow(2, numCond);
		if (l < (max - 1)) {
			ArrayList<String> list = combinations.get(num);
			if (list.isEmpty()) {
				num++;
				list = combinations.get(num);
			}
			String element = list.remove(0);
			change(element);
			l++;
			return true;
		}
		return false;

	}

	public static boolean nextChange() {

		changeCondtions(Integer.toBinaryString(l));
		int max = (int) Math.pow(2, numCond);
		if (l == max) {
			return false;
		} else {
			l++;
			return true;
		}

	}

	public static void reset() {
		cond1 = true;
		cond2 = true;
		cond3 = true;
		cond4 = true;
		// cond5 = true;
		// cond6 = true;
		cond7 = true;
		combinations = new HashMap<Integer, ArrayList<String>>();
		l = 0;
		num = 1;
	}

	public static String getlog() {

		return cond1 + " " + cond2 + " " + cond3 + " " + cond4 + " " + cond7;
		// cond5+" "+cond6+" "+cond7;
	}

	public static void main(String[] args) throws IOException {

		String path = "/home/spg-experiment-3/Documents/OS/jrrt/MoveMethod_jrrt_skip1_time.txt";

		InputManagerASCII in = new InputManagerASCII(path);
		in.openFile();
		List<String> comb = new ArrayList<String>();
		while (!in.isEndOfFile()) {
			comb.add(in.readLine());
		}

		in.closeFile();

		while (Conditions_.nextChangeMin()) {
			boolean contains = false;
			for (String string : comb) {

				if (string.contains(Conditions_.getlog())) {
					contains = true;
					break;
				}
			}
			if (!contains)
				System.out.println(Conditions_.getlog());
		}
		// Conditions.reset();
		// while (Conditions.nextChangeMin()) {
		// System.out.println(Conditions.getlog());
		// }

	}
}
