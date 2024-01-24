package Academic;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		boolean run = true; // 무한반복
		int num = 0; // 메뉴 번호
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("학사 정보 관리 시스템");
			System.out.println("메뉴를 선택하세요.");
			System.out.println("1. 회원 가입");
			System.out.println("2. 로그인");
			System.out.println("3. 프로그램 종료");

			num = scan.nextInt();

			switch (num) {
			case 1: // 회원가입
				signUp();
				break;
			case 2: // 로그인

				break;
			case 3:
				System.out.println("프로그램을 종료하시겠습니까?");
				String answer = scan.nextLine();
				if( answer.equals("Y") || answer.equals("y")) {
					System.out.println("프로그램을 종료합니다.");
				} 
				break;
			}
		}

		scan.close();
	}

	static Member signUp() {
		Scanner scan = new Scanner(System.in);
		Member member = null;

		System.out.println("회원가입을 진행합니다.");
		System.out.println("ID를 입력하세요.");
		String id = scan.nextLine();
		System.out.println("암호를 입력하세요.");
		String password = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = scan.nextLine();
		
		System.out.println("1. 선생님 | 2. 학생");
		int position = Integer.parseInt(scan.nextLine());

		if (position == 1) {
			System.out.println("담당 과목을 입력하세요.");
			String subject = scan.nextLine();
			member = new Teacher(name, id, password, position, subject);
		} else if (position == 2) {
			System.out.println("전공을 입력하세요.");
			String major = scan.nextLine();
			member = new Student (name, id, password, position, major);
		}
		scan.close();
		return member;
		
	}
	
	static void login() {
		Scanner scan = new Scanner(System.in);
		int menuNum = 0; // 메뉴 속 번호
		String id, password = null;

		System.out.println("로그인 절차를 진행합니다.");
		System.out.println("ID를 입력하세요.");
		id = scan.nextLine();
		System.out.println("암호를 입력하세요.");
		password = scan.nextLine();
		
		scan.close();
	}
}
