package quiz;

import java.util.Scanner;

public class AccountEx {
	static Scanner scan = new Scanner(System.in);
	static Account[] accounts = new Account[100]; //100명분 계좌를 저장할 수 있는 배열 
	
 	public static void main(String[] args) {
		boolean run = true;

		while (run) {
			System.out.println("MIT 뱅크에 오신것을 환영합니다.");
			System.out.println("메뉴를 선택해 주세요.");
			System.out.println("1.계좌 생성");
			System.out.println("2.계좌 업무");
			System.out.println("3.종료");
			System.out.print("선택> ");
			
			int menuNum =  Integer.parseInt(scan.nextLine());

			switch (menuNum) {
			case 1: //계좌 생성 기능 
				System.out.println("계좌를 생성합니다.");
				System.out.println("예금주 이름을 입력하세요.");
				System.out.print(">");
				String name = scan.nextLine();
				System.out.println("계좌번호를 입력하세요.");
				System.out.print(">");
				int accountNumber = Integer.parseInt(scan.nextLine());
				System.out.println("초기 입금액을 입력하세요.");
				System.out.print(">");
				int balance = Integer.parseInt(scan.nextLine());
				
				Account newAccount = new Account(name, accountNumber,balance);
				
				for(int i=0;i<accounts.length;i++) {
					if(accounts[i] == null) {
						accounts[i] = newAccount;
						break;
					}
				}
				System.out.println("계좌 생성");
				break;

			case 2: //계좌 업무 : 입금, 출금, 조회
				System.out.println("사용하고자 하는 계좌 번호를 입력하세요.");
				System.out.print("> ");
				
				System.out.println("님 환영합니다.");
				System.out.println("업무를 선택하세요.");
				break;
				
				
			 case 3:

			}
		}
		scan.close();
	}
}
