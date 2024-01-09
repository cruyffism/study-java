package sec01.exam;

import java.util.Scanner;

public class ArrayLengthEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int[] scores = new int[3];
		
		System.out.println("국어 점수를 입력하세요");
		scores[0] = scan.nextInt();
		System.out.println("영어 점수를 입력하세요");
		scores[1] = scan.nextInt();
		System.out.println("수학 점수를 입력하세요");
		scores[2] = scan.nextInt();
		
		int sum = 0;
		for(int i=0; i<scores.length; i++) {
			sum += scores[i];
		}

		System.out.println("총합 : " + sum);
		double avg = (double) sum / scores.length;
		System.out.println("평균 : " + avg);
	}

}
