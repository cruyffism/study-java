package answer;

import java.util.Scanner;

public class BankBookEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		BankBook BK = new BankBook();
		
		// 처음 잔액
		BK.showMoney();
		
		for (int i=0; i<2; i++) {
			// 돈을 넣는다
			System.out.print("입금액: ");
			int in = scan.nextInt();
			System.out.print(BK.deposit(in) + "원 입금\t");
			// 현재 잔액
			BK.showMoney();
			// 돈을 인출한다.
			System.out.print("출금액: ");
			int out = scan.nextInt();
			System.out.print(BK.withdraw(out)+"원 출금\t");
			// 현재 잔액
			BK.showMoney();
		}
		// 필드를 가져와 잔액 출력
		System.out.println("\n최종 잔액은 : " + BK.money + "원 입니다.");
		scan.close();
	}

}
