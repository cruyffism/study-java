package answer;

import java.util.Scanner;

public class GradeCounterIF {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int score = 0;

	    while(score != -1){    // -1 경우에는 while문을 종료한다.
	        System.out.println("점수를 입력해 주세요: ");
	        score = scan.nextInt();
	        // if or switch
	        if(score >= 90) {
	            System.out.println("수");
	        } else if(score >= 80) {
	            System.out.println("우");
	        } else if(score >= 70) {
	            System.out.println("미");
	        } else if(score >= 60) {
	            System.out.println("양");
	        } else if(score >= 0) {
	            System.out.println("가");    
	        }
	        
	    }            
	    scan.close();
	}

}
