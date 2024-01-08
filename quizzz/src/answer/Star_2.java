package answer;

import java.util.Scanner;

public class Star_2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력해 주세요 : ");

		int n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = n; j > 0; j--) {
				if (i < j) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		scan.close();
	}

}
