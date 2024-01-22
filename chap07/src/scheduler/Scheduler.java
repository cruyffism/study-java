package scheduler;

public class Scheduler {
	public static void main(String[] args) {
		Event[] evt = new Event[3];
		MyDate date1 = new MyDate(2021,6,17);
		MyDate date2 = new MyDate(2021,6,04);
		MyDate date3 = new MyDate(2021,8,30);
		evt[0] = new OneDay("오늘, ",date1);
		evt[1] = new Duration("java",date2,date3);
		evt[2] = new Deadlined("마감날짜",date3);
		for(int i=0; i<evt.length; i++) {
			System.out.println("일 정: " + evt[i].toString());
		}
	}
}
