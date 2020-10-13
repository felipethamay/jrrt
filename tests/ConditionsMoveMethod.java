package tests;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConditionsMoveMethod extends Conditions {

	public static boolean cond1 = true;
	public static boolean cond2 = true;
	public static boolean cond3 = true;
	public static boolean cond4 = true;
	public static boolean cond5 = true;

	public ConditionsMoveMethod() {
		this.numCond = 5;
	}

	public void change(String bin) {
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
			} else if (i == 5) {
				if (num.equals("1"))
					cond5 = false;
				else
					cond5 = true;
			}
			i++;
		}
	}

	public void reset() {
		cond1 = true;
		cond2 = true;
		cond3 = true;
		cond4 = true;
		cond5 = true;
		combinations = new HashMap<Integer, ArrayList<String>>();
		l = 0;
		num = 1;
	}

	public String getlog() {

		return cond1 + " " + cond2 + " " + cond3 + " " + cond4 + " " + cond5;
	}

	public static void main(String[] args) {

		ConditionsMoveMethod conds = new ConditionsMoveMethod();
		while (conds.nextChangeMin()) {
			System.out.println(conds.getlog());
		}
		conds.reset();
		while (conds.nextChangeMin()) {
			System.out.println(conds.getlog());
		}

	}
}
