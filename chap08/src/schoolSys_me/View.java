package schoolSys_me;

import java.util.Scanner;

public class View {

	
	void menu() {		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("학사 정보 관리 시스템");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
	}
	

	 Member sign_Up() {
		Scanner scan = new Scanner(System.in);
		Member member = null;

		System.out.println("회원가입을 진행합니다.");
		System.out.println("ID를 입력하세요.");
		String m_id = scan.nextLine();
		System.out.println("암호를 입력하세요.");
		String m_password = scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String m_name = scan.nextLine();

		System.out.println("1. 선생님 | 2. 학생");
		int m_position = Integer.parseInt(scan.nextLine());

		if (m_position == 1) {
			System.out.println("담당 과목을 입력하세요.");
			String m_subject = scan.nextLine();
			member = new Teacher(m_name, m_id, m_password, m_subject);
		} else if (m_position == 2) {
			System.out.println("전공을 입력하세요.");
			String m_major = scan.nextLine();
			member = new Student(m_name, m_id, m_password, m_major);
		}
		scan.close();
		return member;

	}

	 Member sign_in() {
		Scanner scan = new Scanner(System.in);
		Member member = null;

		System.out.println("로그인 절차를 진행합니다.");
		System.out.println("ID를 입력하세요.");
		String id = scan.nextLine();
		System.out.println("암호를 입력하세요.");
		String password = scan.nextLine();

		scan.close();
		return member;
	}
}
