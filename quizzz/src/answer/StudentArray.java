package answer;

import java.util.Scanner;

public class StudentArray {

	public static void main(String[] args) {
		// 학생수(array)와 학생들의 점수를 입력 받아서, 최고 점수 및 평균 점수를 구하는 프로그램.
		boolean run = true; //무한 반복
		int studentNum = 0;
		int[] scores = null;
		Scanner scan = new Scanner(System.in);
		
		while(run) {
			System.out.println("-------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("-------------------------------------");
			System.out.print("선택> ");
			int selectNo = Integer.parseInt(scan.nextLine());
			if(selectNo == 1) {
				System.out.print("학생수> ");
				studentNum  = Integer.parseInt(scan.nextLine());
				scores = new int[studentNum];
			  } else if (selectNo == 2) {
				 for(int i =0; i < scores.length;i++) {
					 System.out.print("scores["+i+"]> ");
					 scores[i] =  Integer.parseInt(scan.nextLine());
				 }
			  }else if (selectNo == 3) {
				  for(int i =0; i < scores.length;i++) {
						 System.out.println("scores["+i+"]> " + scores[i]);
				  }
				 
			  } else if (selectNo == 4) {
				  int max = 0;
				  int sum = 0;
				  double avg = 0;
				  for(int i =0; i < scores.length;i++) {
						max = (max < scores[i]) ? scores[i] : max;
						sum += scores[i];
				  }
				  avg = (double) sum / studentNum;
				  System.out.println("최고 점수: " + max);
				  System.out.println("최고 점수: " + avg);
				  			  
	     } else if (selectNo == 5) {
	    	 run = false;
	     }
	   }
		System.out.println("프로그램 종료");
		scan.close();
	}

}
