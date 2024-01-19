package boardSys;

import java.util.Scanner;

public class Controller {
	public Controller() {
		init();
	}

	public static void init() {
		View view = new View();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		boolean run2 = true;
		int menuNum2 = 0;

		while (run) {

			view.menu();

			int menuNum = Integer.parseInt(scan.nextLine());

			switch (menuNum) {

			case 1: // 게시판 보기 호출 메서드
				view.list();
				int selectNum = Integer.parseInt(scan.nextLine());
				for (int i = 0; i < BoardSys.boards.length; i++) {
					if (i == selectNum) {
						view.viewContent();
					}
				}
				view.menu2();
				menuNum2 = Integer.parseInt(scan.nextLine());
				switch (menuNum2) {
				case 3:
					break;

				}
				break;

			case 2:
				view.createBoard();
				break;

			case 3:
				System.out.println("프로그램을 종료합니다.");
				run = false;
				break;

			}
		}

		scan.close();
	}
}
