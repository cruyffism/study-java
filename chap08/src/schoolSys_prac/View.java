package schoolSys_prac;

public class View {
	public static int menu() {
		System.out.println("학사 정보 관리 시스템");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("1. 회원 가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		// 사용자로부터 입력받은 문자열을 정수로 변환하여 selectMenu 변수에 저장하는 역할을 함
		int selectMenu = Integer.parseInt(Main.scan.nextLine());
		
		return selectMenu;
	}
	
	public static void userError() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해 주세요.");
	}
	
	public static boolean exit() {
		System.out.println("프로그램을 종료하시겠습니까? (y/n)");
		String exitAnswer = Main.scan.nextLine();
		
		if(exitAnswer.equals("Y")||exitAnswer.equals("y")) {
			System.out.println("프로그램을 종료합니다.");
			return true;
		} else if(exitAnswer.equals("N")||exitAnswer.equals("n")) {
			System.out.println("프로그램을 종료하지 않습니다.");
			return false;
		} else {
			userError();
			return false;
		}
	}
	
	public static Member signUp() { 
		Member m = null; // 객체를 생성하기 전에 m 변수를 null로 초기화. 코드에서 m이 여전히 null이면, 이를 통해 메서드 호출자(호출한 쪽)는 회원 가입이 실패하거나 취소되었음을 파악할 수 있습니다.
		System.out.println("회원 가입을 진행합니다.");
		System.out.println("ID를 입력하세요.");
		String id = Main.scan.nextLine();
		System.out.println("암호를 입력하세요.");
		String password = Main.scan.nextLine();
		System.out.println("이름을 입력하세요.");
		String name = Main.scan.nextLine();
		
		System.out.println("1.선생님 | 2.학생");
		int selectPosition = Integer.parseInt(Main.scan.nextLine());
		
		if(selectPosition == 1) {
			System.out.println("담당 과목을 입력하세요.");
			String subject = Main.scan.nextLine();
			m = new Teacher(name, id, password, subject);
		} else if (selectPosition == 2) {
			System.out.println("전공을 입력하세요.");
			String major = Main.scan.nextLine();
			m = new Teacher(name, id, password, major);
		}
		return m; // 생성된 회원 객체를 반환 
	}
	
	public static String[] signIn() {
		String[] login = new String[2];
		System.out.println("로그인 절차를 진행합니다.");
		System.out.println("ID를 입력하세요.");
		login[0] = Main.scan.nextLine();
		System.out.println("암호를 입력하세요.");
		login[1] = Main.scan.nextLine();
		
		return login;
		
	}
	
	public static void signFail() {
		System.out.println("로그인에 실패하였습니다.");
		System.out.println("아이디 또는 암호를 다시 확인하세요.");
	}
	
}
