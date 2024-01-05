package sec01.exam;

import java.util.Scanner;

public class IfElseEx {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("점수를 입력하세요 ");
		int score = Integer.parseInt(scanner.nextLine());

		if (score >= 90) {
			System.out.println("점수가 100~99 입니다.");
			System.out.println("등급은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("점수가 80~89 입니다.");
			System.out.println("등급은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("점수가 70~79 입니다.");
			System.out.println("등급은 C 입니다.");
		} else {
			System.out.println("점수가 70미만 입니다.");
			System.out.println("등급은 D 입니다.");
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
