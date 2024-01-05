package quiz;

import java.util.Scanner;

public class GradeCounterEng {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("점수를 입력해 주세요: ");
		int score = Integer.parseInt(scanner.nextLine());
		
		if(score >= 90) {
	        if(score % 10 >= 7 || score == 100) {
	            System.out.println("A+");
	        } else if(score % 10 >= 4) {
	            System.out.println("A0");
	        } else {
	            System.out.println("A-");
	        }
	    } else if(score >= 80) {
	        if(score % 10 >= 7) {
	            System.out.println("B+");
	        } else if(score % 10 >= 4) {
	            System.out.println("B0");
	        } else {
	            System.out.println("B-");
	        }
	    } else if(score >= 70) {
	        if(score % 10 >= 7) {
	            System.out.println("C+");
	        } else if(score % 10 >= 4) {
	            System.out.println("C0");
	        } else {
	            System.out.println("C-");
	        }
	    } else if(score >= 60) {
	        if(score % 10 >= 7) {
	            System.out.println("D+");
	        } else if(score % 10 >= 4) {
	            System.out.println("D0");
	        } else {
	            System.out.println("D-");
	        }
	    } else {
	        System.out.println("F");
	    }

		// 개선 코드
	    String letterGrade = "";
	    if(score == 100) {
	        letterGrade = "A+";
	    } else if(score >= 60) {
	        if(score >= 90) {
	            letterGrade = "A";
	        } else if(score >= 80) {
	            letterGrade = "B";
	        } else if(score >= 70) {
	            letterGrade = "C";
	        } else if(score >= 60) {
	            letterGrade = "D";
	        } 
	        if(score % 10 >= 7) {
	            letterGrade = letterGrade + "+";
	        } else if(score % 10 >= 4) {
	            letterGrade += "0";
	        } else {
	            letterGrade += "-";
	        }
        } else {
	        letterGrade = "F";
    	}
	    System.out.println(letterGrade);
	    scanner.close();
	}
}