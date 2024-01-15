package quiz;

import java.util.Scanner;

public class BankBookEx {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankBook bank = new BankBook();
		System.out.println("현재 잔액은 : " + 0);
		

		System.out.print("입금액: ");
		int money_in = scan.nextInt();
		bank.deposit(money_in); 

		System.out.println(money_in + "원 입금 " + "현재 잔액은 " + money_in);
		
		System.out.print("출금액: ");
		int money_out  = scan.nextInt();
		bank.withdraw(money_out); 
		if(money_in<money_out) {
			System.out.println("금액이 부족합니다.");
			System.out.println("7000원 출금 현재 잔액은 : " + (money_out - money_in));
		} else {
			System.out.print(money_out + money_in);
		}
	
		scan.close();
	}
}
