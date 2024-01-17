package quiz;

import java.util.Scanner;

public class AccountEx {
	public static void main(String[] args) {
		Account acc = new Account();
		boolean run = true;
		Scanner scan = new Scanner(System.in);

		while (run) {

			acc.menu();

			int selectNum = acc.menu();

			switch (selectNum) {

			case 1:

				System.out.println("계좌를 생성합니다.");
				System.out.println("예금주 이름을 입력하세요.");
				System.out.print(">");
				acc.name = scan.nextLine();
				System.out.println("계좌번호를 입력하세요.");
				System.out.print(">");
				acc.accountNumber = Integer.parseInt(scan.nextLine());
				System.out.println("초기 입금액을 입력하세요.");
				System.out.print(">");
				acc.balance = Integer.parseInt(scan.nextLine());
				System.out.println("계좌 생성");
				break;

			case 2:
				System.out.println("사용하고자 하는 계좌 번호를 입력하세요.");
				System.out.print("> ");

				System.out.println("님 환영합니다.");
				System.out.println("업무를 선택하세요.");
				break;
			}
		}
		scan.close();
	}
}
