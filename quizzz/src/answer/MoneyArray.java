package answer;

import java.util.Scanner;

public class MoneyArray {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int [] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 1}; 
		// 환산할 돈의 종류
		
		System.out.print("금액을 입력하시오 : "); 
		
		int money = scan.nextInt();
		
		for(int i=0; i<unit.length; i++){
			System.out.println(unit[i] + "원 : " + (money/unit[i]));
			money %= unit[i];
		}
		scan.close();
	}
}


