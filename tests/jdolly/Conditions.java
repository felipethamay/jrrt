package tests.jdolly;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import ConditionsJRRTInputs.ConditionsPullUpMethod;
import ConditionsJRRTInputs.ConditionsManagement;

public abstract class Conditions {

	static Map<String, ConditionsManagement> conditionsMap = new HashMap<String, ConditionsManagement>();

	static int numCond = 1;

	static Map<Integer, ArrayList<String>> combinations = new HashMap<Integer, ArrayList<String>>();

	static int l = 0;
	static int num = 1;

	public static ConditionsManagement getConditionClass(String refactoring) {
		conditionsMap.put("PullUpMethod", new ConditionsPullUpMethod());
//		conditionsMap.put("MoveMethod", new ConditionsMoveMethod());
//		conditionsMap.put("PushDownField", new ConditionsPushDownField());
//		conditionsMap.put("RenameMethod", new ConditionsRenameMethod());
//		conditionsMap.put("PushDownMethod", new ConditionsPushDownMethod());
//		conditionsMap.put("AddParameter", new ConditionsAddParameter());
//		conditionsMap.put("PullUpField", new ConditionsAddParameter());
		return conditionsMap.get(refactoring);
	}

	public abstract void reset();

	public void changeCondtions(String bin) {

		int length = bin.length();
		int falta = numCond - length;
		String zeros = "";
		for (int i = 0; i < falta; i++) {
			zeros = zeros + "0";
		}
		bin = zeros + bin;
		change(bin);

	}

	public abstract void change(String bin);

	public abstract String getlog();

	public boolean nextChange() {

		changeCondtions(Integer.toBinaryString(l));
		int max = (int) Math.pow(2, numCond);
		if (l == max) {
			return false;
		} else {
			l++;
			return true;
		}

	}

	public static void createList() {
		int num = 1;
		int max = (int) Math.pow(2, numCond);
		while (num < max) {
			create(Integer.toBinaryString(num));
			num++;
		}

	}

	public boolean nextChangeMin() {
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

}
