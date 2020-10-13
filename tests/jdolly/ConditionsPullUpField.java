package tests.jdolly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConditionsPullUpField extends Conditions {

	public static boolean cond1 = true;

	public ConditionsPullUpField() {
		this.numCond = 1;
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
			}

			i++;
		}
	}

	public void reset() {
		cond1 = true;
		combinations = new HashMap<Integer, ArrayList<String>>();
		l = 0;
		num = 1;
	}

	public String getlog() {

		return cond1 + "";
	}

	public static void main(String[] args) {

		ConditionsPullUpField conds = new ConditionsPullUpField();
		while (conds.nextChangeMin()) {
			System.out.println(conds.getlog());
		}
		conds.reset();
		while (conds.nextChangeMin()) {
			System.out.println(conds.getlog());
		}

	}
}
