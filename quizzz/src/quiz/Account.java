package quiz;

import java.util.Scanner;

public class Account {

	static Scanner scan = new Scanner(System.in);
	
	String name;
	int accountNumber; //계좌번호
	int balance; //잔고
	
	Account() {
		
	}
	
	Account(String name, int accountNumber, int balance) {
	 	this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
	}
	
	public static int menu() { // 메뉴 호출 메서드
		System.out.println("MIT 뱅크에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.계좌 생성");
		System.out.println("2.계좌 업무");
		System.out.println("3.종료");
		System.out.print("선택> ");
		int selectNum = scan.nextInt();
		return selectNum;
	}
	
	public static int menu2() { // 서브 메뉴 호출 메서드
		System.out.println("MIT 뱅크에 오신것을 환영합니다.");
		System.out.println("업무를 선택하세요.");
		System.out.println("1.입금");
		System.out.println("2.출금");
		System.out.println("3.잔액 조회");
		System.out.println("0.메인 메뉴 돌아가기");
		System.out.print("> ");
		int selectNum2 = scan.nextInt();
		return selectNum2;
	}
	

	public void deposit(int deposit) { //입금 메서드
		System.out.println("입금 금액을 입력해주세요.");
		int input = scan.nextInt();
		System.out.println(input + "원 입금합니다.");
		balance += input;
		System.out.println("입금완료");
		System.out.println(name +"님 환영합니다.");
		System.out.println("업무를 선택하세요.");
		
	}
	
	public void withdraw(int withdraw) { //출금 메서드
		System.out.println("출금 금액을 입력해주세요.");
		int output = scan.nextInt();
		System.out.println(output + "원 출금합니다.");
		System.out.println("출금완료");
		System.out.println(name +"님 환영합니다.");
		System.out.println("업무를 선택하세요.");
	}
	

	
	
}

