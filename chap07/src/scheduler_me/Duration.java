package scheduler_me;

public class Duration extends Event {
	
	//필드
	String myDatebegin;
	String myDateend;
	
	//생성자
	public Duration(String title, MyDate myDateBegin, MyDate myDateEnd) {
		super(title); 
		this.myDatebegin = myDateBegin.toString();
		this.myDateend = myDateEnd.toString();
	}
	

    public String toString() {
        return title + ", 시작 날짜: " + myDatebegin + ", 마감 날짜: " + myDateend;

    }
    
}
