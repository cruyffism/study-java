package quiz;

import java.util.Scanner;

public class Season {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("월을 입력해 주세요 : ");
		
		int month = scanner.nextInt();

		switch (month) {
		case 3, 4, 5:
			System.out.print(month + "월은 봄입니다. ");
			break;

		case 6, 7, 8:
			System.out.print(month + "월은 여름입니다. ");
			break;
		case 9, 10, 11:
			System.out.print(month + "월은 가을입니다. ");
			break;

		case 12, 1, 2:
			System.out.print(month + "월은 겨울입니다. ");
			break;
			
		default:
			System.out.println("");
			break;
	
		}
		
		scanner.close();	
	}
	
}
