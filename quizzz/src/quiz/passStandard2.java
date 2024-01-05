package quiz;

import java.util.Scanner;

public class passStandard2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("국어 점수를 입력하세요: ");
		int korean = Integer.parseInt(scanner.nextLine());
		System.out.print("영어 점수를 입력하세요: ");
		int english = Integer.parseInt(scanner.nextLine());
		System.out.print("수학 점수를 입력하세요: ");
		int math = Integer.parseInt(scanner.nextLine());
		
		int totalScore = korean + english + math;
		
		if(totalScore < 210 || (korean <60 || english <60 || math <60)) {
			System.out.println("탈락");
		} else {
			System.out.println("합격");
		}

	}

}
