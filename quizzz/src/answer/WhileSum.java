package answer;

import java.util.Scanner;

public class WhileSum {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		System.out.println("숫자를 입력하세요: ");

			int m =scan.nextInt();
			int sum = 0;
			int i = 1;
			
			while(true) {
				sum += i;
				i++;
				if(i == m+1) {break;}
			}
			
			System.out.println("1~" + (i-1) + " 합 : " + sum);
			scan.close();
	}

}
