package scheduler;

public class Deadlined extends Event {
	public myDate deadline;
	
	public Deadlined(String title, myDate deadline) {
		super(title);
		this.deadline = deadline;
	}
	
	public String toString() {
		return title + ", " + "~" + deadline;
	}
}
