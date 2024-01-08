package quiz;

import java.util.Scanner;

public class WhileBank {

	public static void main(String[] args) {
		boolean run = true; //무한반복
		int No = 1; //번호
		int money = 0;   // 예-출금
		int balance = 0; // 잔고
		
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("-----------------------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("-----------------------------------------------------");
			System.out.println("선택> ");
			
			No = scanner.nextInt();
			
			if(No == 1) {
				System.out.println("예금액>");
				money = scanner.nextInt();
				balance += money;
				
			} else if (No == 2) {
				System.out.println("출금액>");	
				money = scanner.nextInt();
				balance -= money;
				
			}  else if (No == 3) {
				System.out.println("잔고> " + balance);
				balance = scanner.nextInt();
				
			} else if (No == 4) {
				break;
			} 
			
		}
			
			System.out.println("프로그램 종료");
	}

}
