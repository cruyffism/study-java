package sec02.exam;

import java.util.Scanner;

public class WhilePrintFrom1To100 {

	public static void main(String[] args) {
		
		//입력받은 수까지 scanner로 받아서 합계를 구하는 코드!
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하세요: ");
		
		int sum = 0;
		int i = 1;
		int number =sc.nextInt();
		while(i<=number) {
			sum += i;
			i++;
		}
		System.out.println("1~" + (i-1) + " 합 : " + sum);
		sc.close();

	}

}
//		int sum = 0;
//		int i = 1;
//		
//		while (i<=100) {
//		  sum += i;
//		  i++;
//		}
//		System.out.println("1~" + (i-1) + " 합 : " + sum);
		


//true로 30까지 더한 값 구하기
//		int sum = 0;
//		int i = 1;
//		
//		while (true) {
//			sum += i;
//			i++;
//			if(i==31) {break;}
//				
//		}
//		System.out.println("1~" + (i-1) + " 합 : " + sum);

		
	
