package quiz;

import java.util.Scanner;

public class Grade {
	
	private int math;
	private int sci;
	private int eng;
	
	private Grade(int math, int sci, int eng) {
        this.math = math;
        this.sci = sci;
        this.eng = eng;
    }

	private static int average(int[] point) {
		int sum = 0;
		int avg = 0;
		for(int i=0;i<point.length;i++) {
			sum += point[i];
			avg = sum/point.length;
		}
		return avg;
	}
	
	public static void main(String[] args) {
		
		System.out.println("수학, 과학 ,영어 순으로 3개의 정수 입력 >>");
		
		Scanner scan = new Scanner(System.in);
		
		int math = scan.nextInt();
        int sci = scan.nextInt();
        int eng = scan.nextInt();

		Grade grade = new Grade(math, sci, eng);
		
		 int[] point = { grade.math, grade.sci, grade.eng };
		
		 int avg = average(point);
		System.out.println("평균은 " + avg + "입니다.");
	}
	



}
