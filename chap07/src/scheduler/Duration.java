package scheduler;

public class Duration extends Event{
	public myDate begin;
	public myDate end;
	
	public Duration(String title, myDate begin, myDate end) {
		super(title);
		this.begin = begin;
		this.end = end;
	}
	
	public String toString() {
		return title + ", " + "시작 날짜: " + begin.toString() + ", 마감 날짜: " + end.toString();
	}
}
