package quiz;

import java.util.Scanner;

public class monthCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해 주세요 : ");
		int month = scanner.nextInt();
		
		switch (month) {
		
		case 1, 3, 5, 7, 8, 10, 12:
	
			System.out.println("31일 까지 입니다.");
			break;
			
		case 4, 6, 9, 11:
			System.out.println("30일 까지 입니다.");
			break;
			
		default:
			System.out.println("28일 까지 입니다.");
			break;
		}

	}

}
