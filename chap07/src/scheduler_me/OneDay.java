package scheduler_me;

public class OneDay extends Event {
	
	//필드
	String myDatedate;
	
	//생성자
	public OneDay(String title, MyDate myDate) {
		super(title); 
		this.myDatedate = myDate.toString();
	}
	

    public String toString() {
        return title + myDatedate;
    }
	
}
