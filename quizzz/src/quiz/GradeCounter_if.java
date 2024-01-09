package quiz;

import java.util.Scanner;

public class GradeCounter_if {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int score = 0;

        while (true) {    // -1 경우에는 while문을 종료한다. 조건 실행하기
            System.out.println("점수를 입력해 주세요: ");
            score = scan.nextInt();

            if (score >= 90) {
                System.out.println("수");
            } else if (score >= 80) {
                System.out.println("우");
            } else if (score >= 70) {
                System.out.println("미");
            } else if (score >= 60) {
                System.out.println("양");
            } else if (score >= 0) {
                System.out.println("가");
            } else {
            	System.out.println("프로그램 종료");
                break;
            }

        }
        scan.close();
    }

}

