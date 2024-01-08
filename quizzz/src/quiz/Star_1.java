package quiz;

import java.util.Scanner;

public class Star_1 {

	public static void main(String[] args) {
		//숫자를 입력받아 별을 출력해라
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자를 입력해 주세요 : ");

		int m = scanner.nextInt();
		for(int i=1; i<=m; i++ ) {
			for(int j=1; j<=i; j++) {
				System.out.print("*");
				if( j==i ) {
					System.out.println();
				}
			}	
			
		}
		scanner.close();
	}

}
