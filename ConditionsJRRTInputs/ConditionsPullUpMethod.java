package ConditionsJRRTInputs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ConditionsPullUpMethod extends ConditionsManagement{
	
	public static Condition cond1 = new Condition(1,"type constraint violated:");
	public static Condition cond2 = new Condition(2,"cannot override static or final method");
	public static Condition cond3 = new Condition(3,"no fitting super class");
	public static Condition cond4 = new Condition(4,"Pull Up cannot preserve enclosing instances");
	public static Condition cond5 = new Condition(5,"cannot adjust accessibilities");
	public static Condition cond6 = new Condition(6,"method could be invoked dynamically");
	public static Condition cond7 = new Condition(7,"static methods cannot override other methods");
	public static Condition cond8 = new Condition(8,"cannot access variable");

	
	public void intializeConditions() {
		conditions = new ArrayList<Condition>();
		conditions.add(cond1);
		conditions.add(cond2);
		conditions.add(cond3);
		conditions.add(cond4);
		conditions.add(cond5);
		conditions.add(cond6);
		conditions.add(cond7);
		conditions.add(cond8);
	}

}
