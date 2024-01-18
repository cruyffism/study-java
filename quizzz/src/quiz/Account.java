package quiz;

import java.util.Scanner;

public class Account {
	Scanner scan = new Scanner(System.in);

	String name;
	int accNumber;
	int balance;

	Account() { // 기본 생성자

	}

	Account(String name, int accNumber, int balance) { // 인스턴스 생성 시 초기 값 설정하는 생성자
		this.name = name;
		this.accNumber = accNumber;
		this.balance = balance;
	}

	// 겟&셋 메서드 만들기

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccNumber() {
		return accNumber;
	}

	public void setAccNumber(int accNumber) {
		this.accNumber = accNumber;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public void menu2() { // 상세 메뉴 호출 메서드
		System.out.println("업무를 선택하세요.");
		System.out.println("1. 입금");
		System.out.println("2. 출금");
		System.out.println("3. 잔액 조회");
		System.out.println("0. 메인메뉴 돌아가기");
		System.out.print("> ");
	}

	public void deposit(int cash) { // 입금 메서드
		int plusCash = 0;
		balance += plusCash;
	}

	public void withdraw(int cash) { // 출금 메서드
		int minusCash = 0;
		if (minusCash > balance) {
			System.out.println("잔액이 부족합니다. 출금이 불가능합니다.");
		} else {
			balance -= minusCash;
		}

	}

	public void checkBalance(int balance) { //잔액 조회 메서드 
		System.out.println("잔액은: " + balance);
	}

}
