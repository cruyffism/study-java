package quiz;

import java.util.Scanner;

public class Bank_Ex {

	public static void main(String[] args) {
		Bank bank = new Bank();
		boolean run = true;
		int cash = 0; // 잔액 
		Scanner scan = new Scanner(System.in);

		while (run) {
			
			bank.menu();

			int menuNum = Integer.parseInt(scan.nextLine());

			
			switch (menuNum) {
			case 1:
				bank.deposit(cash);
				break;
				
			case 2:
				bank.withdraw(cash);
				break;
				
			case 3:
				bank.checkBalance(cash);
				break;
				
			case 4:
				bank.end();
				run = false;
				break;
				
			default:
				bank.error();
			}
		}
		scan.close();
	}
}
