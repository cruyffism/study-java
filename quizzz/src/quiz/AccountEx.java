package quiz;

import java.util.Scanner;

public class AccountEx {

	public static void main(String[] args) {
		Account acc = new Account();
		Scanner scan = new Scanner(System.in);
		boolean run = true;
		int cash = 0; // 잔액

		while (run) {

			System.out.println("MIT 뱅크에 오신것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1. 계좌 생성");
			System.out.println("2. 계좌 업무");
			System.out.println("3. 종료");
			System.out.print("선택> ");

			int menuNum = Integer.parseInt(scan.nextLine());

			switch (menuNum) {
			case 1:
				System.out.println("예금주 이름을 입력하세요.");
				String name = scan.nextLine();
				acc.setName(name);
				System.out.println("계좌번호를 입력하세요.");
				int accNumber = Integer.parseInt(scan.nextLine());
				acc.setAccNumber(accNumber);
				System.out.println("초기 입금액을 입력하세요.");
				int balance = Integer.parseInt(scan.nextLine());
				break;

			case 2:
				System.out.println("사용하고자 하는 계좌 번호를 입력하세요.");
				int accNumber2 = Integer.parseInt(scan.nextLine());

				if (accNumber2 == acc.getAccNumber()) {
					System.out.println(acc.name + "님 환영합니다.");
					
					acc.menu2();
					
					int subNumber = Integer.parseInt(scan.nextLine());
					
					switch (subNumber) {
					
					case 0:
						System.out.println("메인메뉴로 돌아갑니다.");
						break;
					
					case 1:
						System.out.println("입금 금액을 입력하세요.");
						cash = Integer.parseInt(scan.nextLine());
						acc.deposit(cash);
						System.out.println(cash + "원 입금 완료입니다.");
						System.out.println(" 입금 완료");
						break;
					case 2:	
						System.out.println("출금 금액을 입력하세요.");
						cash = Integer.parseInt(scan.nextLine());
						acc.withdraw(cash);
						System.out.println(cash + "원 출금 합니다.");
						System.out.println(" 출금 완료");
						break;
					case 3:	
						System.out.println("잔액을 조회합니다.");
						cash = Integer.parseInt(scan.nextLine());
						acc.checkBalance(cash);
						System.out.println(cash + "원 출금 합니다.");
						System.out.println(" 출금 완료");
						break;
					}
				} else {
					System.out.println("해당 계좌번호를 찾을 수 없습니다.");
				}

				break;

			case 3:
				System.out.println("프로그램 종료합니다.");
				run = false;
				break;
			default:
				System.out.println("잘못 입력했습니다.");
				System.out.println("다시 확인해 주세요.");
			}
		}
		scan.close();
	}

}
