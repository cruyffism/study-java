package practice;

import java.util.Scanner;

public class MoneyArray {

	public static void main(String[] args) {
		// 키보드에서 정수로 된 돈의 액수를 입력 받아 오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이
		// 각 몇 개로 변환되는지 출력하세요.
		//81000원 
		// -1 입력 시 종료되고 그 외에는 계속 진행하는 프로그램 
		
		Scanner scan = new Scanner(System.in);
		int money[] = {50000, 10000, 1000, 500, 100, 50, 10, 1}; 
		
		System.out.print("금액을 입력하시오:");
		int num = scan.nextInt();
		
		for(int i=0; i<money.length; i++) {
			System.out.println(money[i] + "원:" + num/money[i]);
			num = num%money[i];
		}
		
		scan.close();
	}
}
