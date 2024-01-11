package quiz;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// 학생수(array)와 학생들의 점수를 입력 받아서, 최고 점수 및 평균 점수를 구하는 프로그램.
		
		boolean run = true; //무한 반복
		int num = 0; // num을 0으로 초기화
		int[] scores = new int[0]; 
		Scanner scan = new Scanner(System.in);

		while (run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int menuNum = Integer.parseInt(scan.nextLine());

			
			switch (menuNum) {
			
			case 1:
			System.out.print("학생수> ");
			num = Integer.parseInt(scan.nextLine());
			break;

			case 2:
				scores = new int[num];
				for(int i=0; i < num; i++) {
					System.out.print("scores["+i+"]> ");
					scores[i] =  Integer.parseInt(scan.nextLine());
				}
				break;
				
			case 3:
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores["+i+"]> " + scores[i]);
				}
				break;
				
			case 4:
				int max = 0;
				int sum = 0;
				double avg = 0;
				for(int i = 0; i < scores.length;i++) {
					max = (max < scores[i]) ? scores[i] : max;
				    sum += scores[i];
				}
				avg = (double)sum / scores.length;
				System.out.println("최고 점수:" + max);
				System.out.println("평균 점수:" + avg);
				break;
				
			case 5:
				run = false;
				break;
			
			}
			
		}
		System.out.println("프로그램 종료");
		scan.close();
	}

}
