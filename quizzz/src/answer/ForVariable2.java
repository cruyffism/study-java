package answer;

import java.util.Scanner;

public class ForVariable2 {

	public static void main(String[] args) {

		// 2번 팩토리열 >> 5*4*3*2*1 
	
		Scanner scanner = new Scanner(System.in);
		int facto = 1;
		System.out.print("N을 입력해 주세요: ");
		int N = scanner.nextInt();

		for (int i = N; i >= 1; i--) {
			facto *= i;
		}
		System.out.println(facto);

		scanner.close();
		
	}

}
