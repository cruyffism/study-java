package schoolSys_prac;

public class Controller {
	public Controller() { // 생성자는 객체가 생성될 때 호출되며, 보통 초기화 작업을 수행 여기선 init() 메서드를 호출!
		init();
	}

	private void init() {
		while (true) {
			int selectmenu = View.menu();

			switch (selectmenu) {
			case 1: // 회원가입
				Member m = View.signUp(); // View 클래스의 signUp() 메서드를 호출하여 회원 객체를 생성
				if (m == null) {
					View.userError(); // 회원가입이 실패한 경우 에러 메시지 출력
				} else {
					for (int i = 0; i < Main.members.length; i++) {
						if (Main.members[i] == null) {
							Main.members[i] = m; // 회원 객체를 배열에 추가
							break;
						}
					}
				}
				break;
			case 2: // 로그인
				String login[] = View.signIn(); // View 클래스의 signIn() 메서드를 호출하여 로그인 정보를 입력받음

				int idx = -1; // 배열에서 로그인에 성공한 회원의 인덱스를 저장하는 변수

				for (int i = 0; i < Main.members.length; i++) {
					if (Main.members[i] == null) {
						continue; // 배열이 null인경우 즉 빈 공간일때(회원가입 정보가 없으니) else if로 가지 않고 바로 다음 i번으로 for문 실행
					} else if (Main.members[i].getId().equals(login[0])
							&& Main.members[i].getPassword().equals(login[1])) {
						// 로그인 성공
						task(Main.members[i]); // 성공한 회원의 작업 수행
						idx = i; // 로그인에 성공한 회원의 인덱스를 저장! 즉 i값을 idx에 넣어서 -1을 변경시킴
					}

				}
				if (idx == -1) {
					View.signFail(); // 로그인에 실패한 경우 에러 메시지 출력
				}
				break;
			case 3: // 프로그램 종료
				if (View.exit()) {
					System.exit(0);
				}
				break;
			default:
				View.userError();
			}

		}

	}

	private void task(Member member) {
		member.work();
		member.test();
	}
}
