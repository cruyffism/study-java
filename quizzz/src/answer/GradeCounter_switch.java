package answer;

import java.util.Scanner;

public class GradeCounter_switch {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
        int N = 0;

        while(true) {
            System.out.print("점수를 입력하세요: ");
            N = scan.nextInt();
            switch(N/10) {  // switch에서 범위 사용 자제
	            case 10:
	            case 9:
	                System.out.println("수");
	                break;
	            case 8:
	                System.out.println("우");
	                break;
	            case 7: 
	                System.out.println("미");
	                break;
	            case 6:
	                System.out.println("양");
	                break;
	            case 5: case 4: case 3: case 2: case 1:
	                System.out.println("가");
	                break;
            }
            if(N == -1) {break;            }
        }
        scan.close();
    }

}