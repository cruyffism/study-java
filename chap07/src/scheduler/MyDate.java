package scheduler;

public class MyDate {
	//필드
	int year;
	int month;
	int day;
	
	//생성자
	 MyDate(int year, int month, int day ) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	 
	 // 메서드
	 public String toString() {
		 return String.format("%04d/%02d/%02d", year, month, day);  
	 }
}


