package tests.jdolly;

import java.util.ArrayList;
import java.util.List;

//import org.eclipse.jdt.Condition;

public class ConditionsManagement  {

	List<Condition> conditions = new ArrayList<Condition>();
	
	public static Condition cond1 = new Condition(1,"The visibility of method");
	public static Condition cond2 = new Condition(2,"already exists in the target type");
	public static Condition cond3 = new Condition(3,"cannot be updated, since the original method is used polymorphically");

	
	public void intializeConditions() {
		conditions = new ArrayList<Condition>();
		conditions.add(cond1);
		conditions.add(cond2);
		conditions.add(cond3);
	}
	public void resetosc() {
		for (Condition cond : conditions) {
			cond.setOs(false);
		}
	}
	

	
	public String getlog() {
		
		String log = "";
		for (Condition cond : conditions) {
			if (!cond.isEnabled()) cond.setOs(true);
		}
		for (Condition cond : conditions) {
			log += cond.isOs()+" ";
		}
		return log;
		
	}
	
	public boolean isAllConditionsOS() {
		for (Condition cond : conditions) {
			if (!cond.isOs()) {
				return false;
			}
		}
		return true;
	}

	
//	public abstract void intializeConditions();
	
	public void enableAllConditions() {
		for (Condition cond : conditions) {
			cond.enable();
		}
	}

	public List<Integer> getConditions( String msgs) {
	List<Integer> conditions_id = new ArrayList<Integer>();
	for (Condition cond : conditions) {
		
		if (msgs.contains(cond.getWarning_msg())) {
			conditions_id.add(cond.getId());
		}
	}
	return conditions_id;
}
	
//	public static List<Integer> getConditions(Map<String,Integer> map, String msgs) {
//		List<Integer> conditions = new ArrayList<Integer>();
//		for (String msg : map.keySet()) {
//			if (msgs.contains(msg)) {
//				conditions.add(map.get(msg));
//			}
//		}
//		return conditions;
//	}
	public boolean disableConditions(List<Integer> conditions_to_disable) {
		boolean canDisable = false;
		for (Condition cond : conditions) {
			if (!cond.isEnabled() && !cond.isOs()) canDisable = true;
			int id = cond.getId();
			if (conditions_to_disable.contains(id)) {
				if (!cond.isOs())
					canDisable = true;
				cond.disable();
			}
		}
		return canDisable;
	}
}
