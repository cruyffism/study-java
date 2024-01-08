package quiz;

import java.util.Scanner;

public class Gugudan_2 {

	public static void main(String[] args) {
		
       //1. do while문 사용하여 구구단 2단을 출력
		
		Scanner scanner = new Scanner(System.in);
		int i = 2;
		int j = 1;
		do {
			System.out.println(i + "x" + j + " = " + i * j);
			j++;
		} while (j <= 9);
		
		

		// 2. while문 사용 Scanner로 입력 받은 숫자의 단만 출력
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = 1;

		while (b < 10) {
			int result = a * b;
			System.out.println(a + " * " + b + " = " + result);
			b++;
		}
		scan.close();
		
	}

}
