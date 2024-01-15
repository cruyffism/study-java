package answer;

import java.util.Scanner;

public class Gugudan_1Ex {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Gugudan_1 ggdan = new Gugudan_1();
		
		System.out.println("단을 입력하세요");
		int dan = scan.nextInt();
		ggdan.gugudan_1(dan);
		
		scan.close();
	}

}
