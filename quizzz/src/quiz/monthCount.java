package quiz;

import java.util.Scanner;

public class monthCount {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("월을 입력해 주세요 : ");
		int month = scanner.nextInt();
		
		switch (month) {
		
		case 1:  
		case 3:	
		case 5:	
		case 7:	
		case 8:	
		case 10:	
		case 12:	
			System.out.println("31일 까지 입니다.");
			break;
			
		case 4:
		case 6:	
		case 9:	
		case 11:	
			
			System.out.println("30일 까지 입니다.");
			break;
			
		default:
			System.out.println("28일 까지 입니다.");
			break;
		}

	}

}
