package answer;

import java.util.Scanner;

public class ForVariable {

	public static void main(String[] args) {

		// 2번 팩토리열

		Scanner scanner = new Scanner(System.in);
		int facto = 1;
		System.out.print("N을 입력해 주세요: ");
		int N = scanner.nextInt();

		for (int i = N; i >= 1; i--) {
			System.out.println(facto + " * " + i);
			facto *= i;
		}
		System.out.println(facto);

		scanner.close();

	}

}
