package quiz;

import java.util.Scanner;

public class Account {

	static Scanner scan = new Scanner(System.in);
	
	String name;
	int accountNumber; //계좌번호
	int balance; //잔고
	

	Account(String name, int accountNumber, int balance) {
	 	this.name = name;
        this.accountNumber = accountNumber;
        this.balance = balance;
	}
	
	public String getName() {
		return name;
	}
	
	public int getAccountNum() {
		return accountNumber;
	}

	public void deposit(int cash) { //입금 메서드
		System.out.println(cash + "원 입금합니다.");
		balance += cash;
		System.out.println("입금완료");
	}
	
	public void withdraw(int cash) { //출금 메서드
		System.out.println(cash + "원 출금합니다.");
		 if(cash > balance) {
			 System.out.println("잔액 부족");
		 }else {
			 this.balance -= cash;
			 System.out.println("출금 완료");
		 } 
		
	}
	
	public void checkBalance() { //잔액 조회
		System.out.println("잔액을 조회합니다.");
		System.out.println("잔액 : " + this.balance);
	}

}

