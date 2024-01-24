package schoolSys_me;

import java.util.Scanner;

public class Controller {
	
	public static void init() {
		
	}

	public static void main(String[] args) {
		boolean run = true; // 무한반복
		int num = 0; // 메뉴 번호
		View view = new View();
		Scanner scan = new Scanner(System.in);

		while (run) {
			
					view.menu();
					num = scan.nextInt();
					
			switch (num) {
			case 1: // 회원가입
				view.sign_Up();
				
				break;
			case 2: // 로그인
				view.sign_in();
				break;
			case 3:
				System.out.println("프로그램을 종료하시겠습니까?");
				String answer = scan.nextLine();
				if (answer.equals("Y") || answer.equals("y")) {
					System.out.println("프로그램을 종료합니다.");
				} else {
					run = false;
					break;
				}
			}
		}

		scan.close();
	}

}
