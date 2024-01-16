package practice;

import java.util.Scanner;

public class Gugudan_1Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요");
		int num = scan.nextInt();
		Gugudan_1 ggdan = new Gugudan_1();
		ggdan.gugudan(num);
	}
}
