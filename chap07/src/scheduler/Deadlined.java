package scheduler;

public class Deadlined extends Event {
	
	//필드
	String myDateDeadline;

	
	//생성자
	public Deadlined(String title, MyDate myDateDeadline) {
		super(title); 
		this.myDateDeadline = myDateDeadline.toString();
	}
	

    public String toString() {
        return title + ", ~" + myDateDeadline;

    }
    
}
