package scheduler;

public class OneDay extends Event {
	
	public MyDate date;

	public OneDay(String title, MyDate date) {
		// Event Class (부모 클래스)의 생성자 호출
		super(title);
		this.date = date;
	}

	public String toString() {
		return title + ", " + date.toString();
	}
}
