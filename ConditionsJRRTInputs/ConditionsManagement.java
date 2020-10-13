package ConditionsJRRTInputs;

import java.util.ArrayList;
import java.util.List;

public abstract class ConditionsManagement {
	

	List<Condition> conditions = new ArrayList<Condition>();

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

	
	public abstract void intializeConditions();
	
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

	
//	public static void main(String[] args) {
//		String msgs = "A method with name 'm_0' already exists in the target type 'ClassId_0'.The method invocations to 'Package_0.A_0.m_0()' cannot be updated, since the original method is used polymorphically. The visibility of method 'Package_0.A_0.m_0(int)' will be changed to public.";
//		
//		System.out.println(new ConditionsMoveMethod().getConditions(ConditionsMoveMethod.map, msgs).toString());
//	}
}
