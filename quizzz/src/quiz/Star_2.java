package quiz;

import java.util.Scanner;

public class Star_2 {

	public static void main(String[] args) {
		//숫자를 입력받아 별을 출력해라
		// 모양은 반대로!
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");

		int m = scanner.nextInt();
		for(int i=0; i<m; i++ ) {
			for(int j= m-1; j>=0; j--) {
			if(i>=j) {
					System.out.print("*");
				}
			else if(i<j) {
				System.out.print(" ");
				}
			}	
			System.out.println();
		}
		System.out.println();
		scanner.close();
	}

}