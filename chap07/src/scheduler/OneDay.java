package scheduler;

public class OneDay extends Event {
	public myDate date;

	public OneDay(String title, myDate date) {
		// Event Class (부모 클래스)의 생성자 호출
		super(title);
		this.date = date;
	}

	public String toString() {
		return title + ", " + date.toString();
	}
}
