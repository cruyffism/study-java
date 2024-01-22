package scheduler;

public class Deadlined extends Event {
	
	public MyDate deadline;
	
	public Deadlined(String title, MyDate deadline) {
		super(title);
		this.deadline = deadline;
	}
	
	public String toString() {
		return title + ", " + "~" + deadline;
	}
}
