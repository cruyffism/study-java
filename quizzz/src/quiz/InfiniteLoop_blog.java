package quiz;

import java.util.Scanner;

public class InfiniteLoop_blog {

	public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int month = 0;
        int day = 0;

        while (true) {
            // 생월 예외처리
            while (true) {
                System.out.print("월을 입력해주세요(0은 종료): ");
                month = scan.nextInt();

                if (month >= 0 && month <= 12) {
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다. 다시입력 ");
                }
            }
            if (month == 0) {
                break;
            }

            // 생일 예외처리
            while (true) {
                System.out.print("생일을 입력하세요(0은 종료): ");
                day = scan.nextInt();

                if (day >= 0 && day <= 31) {
                       // 별자리 switch문 생략 
                    break;
                } else {
                    System.out.println("잘못입력하셨습니다. 다시입력 ");
                }
            }
            if (day == 0) {
                break;
            }
        }
    }
}

