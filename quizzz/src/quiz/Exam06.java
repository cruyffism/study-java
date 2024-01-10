package quiz;

import java.util.Scanner;

public class Exam06 {

	public static void main(String[] args) {
		//2차원 배열에 학년별(4년)로 1,2학기 성적을 저장하고, 4년 전체 평점 평균을 출력!
		// {88, 89} {78, 90} {95, 90} {99, 100}
		
		Scanner scan = new Scanner(System.in);
	
		int[][]scores = { {88, 89}, {78, 90}, {95, 90}, {99, 100} }; // 4행 2열
		int totalSum = scores[0][0] + scores[0][1] + scores[1][0] +scores[1][1] + scores[2][0] + scores[2][1] + scores[3][0] + scores[3][1];
		int avg = totalSum/8;
		System.out.println("총점: " + totalSum);
		System.out.println("평균: " + avg);
		
		scan.close();
		
	}

}
