package quiz;

import java.util.Scanner;

public class MonthScheduleEx {
	Scanner scan = new Scanner(System.in);
	MonthSchedule day = new MonthSchedule();
	int[] Month = new int[30]; // 날짜 배열 선언 
	int num = 0; // num을 입력 변수로 선언 
	String work;
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		MonthScheduleEx may = new MonthScheduleEx();
		
		while (run) {
				System.out.println("이번달 스케쥴 관리 프로그램");
				may.run();
				
				int menuNum = Integer.parseInt(scan.nextLine());

				switch (menuNum) {
				case 1:
					may.input();
					break;
					
				case 2:
					may.view();
					break;
					
				case 3:
					may.finish();
					run = false;
					break;	
				}
			
		}
		scan.close();
	}
	
	
	public void input() { // 입력 메서드
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
		num = Integer.parseInt(scan.nextLine());
		System.out.print("날짜(1~30)?");
		num = Integer.parseInt(scan.nextLine());
		System.out.print("할일(빈칸없이입력)?");
		work = scan.nextLine();
	}

	public void view() { // 보기 메서드
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
		num = Integer.parseInt(scan.nextLine());
        System.out.println("날짜(1~30)? " + this.num);		
        System.out.println(num + "일의 할 일은 " + day.getWork());
	}
	
	public void finish() { // 종료 메서드
			System.out.println("프로그램을 종료합니다.");
	}

	public void run() { // 메뉴 출력 및 처리 메서드
		System.out.print("할일(입력:1, 보기:2, 끝내기:3)>>");
		num = Integer.parseInt(scan.nextLine());
		System.out.print("날짜(1~30)?");
		num = Integer.parseInt(scan.nextLine());
		System.out.print("할일(빈칸없이입력)?");
		work = scan.nextLine();
	}

}
