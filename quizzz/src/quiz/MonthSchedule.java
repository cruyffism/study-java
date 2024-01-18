package quiz;

import java.util.Scanner;


public class MonthSchedule {
	Scanner scan = new Scanner(System.in);
	   //필드
	   private Day days[];
	   //생성자
	   MonthSchedule(int day) {
		  this.days = new Day[day];  
	      for(int i=0; i<days.length; i++) {
	         days[i] = new Day();
	      }
	      scan = new Scanner(System.in);
	   }
	
	public void input() { // 입력 메서드
		System.out.print("날짜(1~30)?");
		int num = Integer.parseInt(scan.nextLine());
		System.out.print("할일(빈칸없이입력)?");
		days[num].setWork( scan.nextLine()); // 15번 배열에 15일에 할 일 을 넣었음
	}

	public void view() { // 보기 메서드
		System.out.println("날짜(1~30)? ");		
		int num = Integer.parseInt(scan.nextLine()); // 15를 넣으면 15번째 값을 불러준다. 
        System.out.print(num + "일의 할 일은 ");
        Day day = new Day();
        day.show();
	}
	
	public void finish() { // 종료 메서드
			System.out.println("프로그램을 종료합니다.");
	}

	public void run() { // 메뉴 출력 및 처리 메서드
		while (true) {
			System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
			int menuNum = Integer.parseInt(scan.nextLine());
			System.out.println("이번달 스케쥴 관리 프로그램");
		switch (menuNum) {
		case 1:
			input();
			break;
			
		case 2:
			view();
			break;
			
		case 3:
			finish();
			break;	
		}
		
		}
	}

}
