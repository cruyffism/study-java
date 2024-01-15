package quiz;

import java.util.Scanner;

public class Gugudan_1Ex {
	//숫자를 입력(스캐너) 받으면 해당 숫자의 구구단을 출력!
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Gugudan_1 ggdan = new Gugudan_1();
		
		System.out.println("몇 단을 출력하나요");
		int dan = scan.nextInt();
		
		ggdan.gugudan(dan);
		scan.close();
	}
}
