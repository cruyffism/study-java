package sec01.exam;

import java.util.Scanner;

public class IfEx {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 ");
		int score = Integer.parseInt(scanner.nextLine());
		

		
		if(score>=90) {
			System.out.println("점수가 90보다 큽니다.");
			System.out.println("등급은 A 입니다.");
		} else{
			System.out.println("점수가 90보다 작습니다.");
			System.out.println("등급은 B입니다.");
		}
		
		scanner.close();
		
	}

}

		
//		int score = 93;
		
//		if(score>=90) {
//			System.out.println("점수가 90보다 큽니다.");
//			System.out.println("등급은 A 입니다.");
//		}
//		
//		if(score< 90) {
//			System.out.println("점수가 90보다 작습니다.");
//		}
//		System.out.println("등급은 B입니다.");

