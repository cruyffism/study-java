package quiz;

import java.util.Scanner;

public class Exam07 {
	
	public static void main(String[] args) {
		//
		Scanner scan = new Scanner(System.in);
		System.out.println("숫자를 두개 입력하세요");
		System.out.print(">");
		int ai = scan.nextInt();
		
		System.out.print(">");
		int bi = scan.nextInt();
		
		maxNumber(ai, bi);
		scan.close();
	}
	
	public static void maxNumber(int a, int b) {
		if (a == b) {
			System.out.println("두 수가 같습니다.");
		} else if (a > b) {
			System.out.println(a + " 와 " + b + " 중에 ==> " + a + "가 더 큽니다");
		} else {
			System.out.println(a +" 와 " + b + " 중에 ==> " + b + "  가 더 큽니다 ");
		}
	}
}
