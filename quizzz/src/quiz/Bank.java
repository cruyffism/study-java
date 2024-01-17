package quiz;

import java.util.Scanner;

public class Bank {
	// 예금, 출금, 조회, 종료, 메뉴 선택, 출력 메소드까지 총 6개 만들기
	Scanner scan = new Scanner(System.in);

	private int totalCash;

	public void deposit(int deposit) { // 입금 메서드
		System.out.println("예금할 금액을 입력해주세요.");
		int plusCash = scan.nextInt();
		totalCash += plusCash;
		if (plusCash > 1000000) {
			System.out.println("잔액이 초과되었습니다. ");
		} else {
		System.out.println(plusCash);
		System.out.println(plusCash + "원을 입금하였습니다.");
		System.out.println("총 금액은: " + totalCash + "입니다.");
		}
	}

	public void withdraw(int withdraw) { // 출금 메서드
		System.out.println("출금할 금액을 입력해주세요.");
		int minusCash = scan.nextInt();
		if (minusCash > totalCash) {
			System.out.println("잔액이 부족합니다. 출금이 불가능합니다.");
		} else {
			totalCash -= minusCash;
			System.out.println(minusCash);
			System.out.println(minusCash + "원을 출금하였습니다.");
			System.out.println("총 금액은: " + totalCash + "입니다.");
		}
	}

	public void checkBalance(int balance) { // 잔액 조회 메서드
		if (totalCash > 1000000) {
			System.out.println("잔액이 초과되었습니다. ");
		} else {
			System.out.println("잔액은: " + totalCash);
		}
	}

	public void end() { //종료 메서드
		System.out.println("프로그램을 종료합니다.");
	}

	public void menu() { // 메뉴 호출 메서드
		System.out.println("안녕하세요 G BANK입니다.");
		System.out.println("******************");
		System.out.println("그린 뱅크에 오신것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1.예금");
		System.out.println("2.출금");
		System.out.println("3.잔액조회");
		System.out.println("4.종료");
		System.out.print("> ");
	}
	
	public void error() {//에러 메서드
		System.out.println("잘못 입력하였습니다.");
		System.out.println("1~4 값 중 선택해주세요.");
	}

}
