package tests.jdolly;

public class Condition {

	private int id = 0;
	private boolean enabled = true;
	private boolean os = false;
	private String warning_msg = "";
	
	public Condition(int id, String warning_msg) {
		this.id = id;
		this.warning_msg = warning_msg;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void enable() {
		this.enabled = true;
	}
	public void disable() {
		this.enabled = false;
	}
	public boolean isOs() {
		return os;
	}
	public void setOs(boolean os) {
		this.os = os;
	}
	public String getWarning_msg() {
		return warning_msg;
	}
	public void setWarning_msg(String msg) {
		this.warning_msg = msg;
	}
	
	
}
