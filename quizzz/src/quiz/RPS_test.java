package quiz;

import java.util.Scanner;

public class RPS_test {

	public static void main(String[] args) {
		// r: 바위 s: 가위 p: 보

		Scanner input = new Scanner(System.in);

		System.out.print("철수: ");
		String c = input.next();
		System.out.println("영희: ");
		String y = input.next();

		if (c.equals(y)) // c와 y의 출력값이 같으면 true 즉 무승부
			System.out.print("무승부!");
		else if (c.equals("r")) {
			if (y.equals("p"))
				System.out.println("영희 승!");
			else
				System.out.println("철수 승!");
		} else if (c.equals("p")) {
			if (y.equals("s"))
				System.out.println("영희 승!");
			else
				System.out.println("철수 승!");
		} else {
			if(y.equals("r"))
				System.out.println("영희 승!");
			else
				System.out.println("철수 승!");
		}

		input.close();
	}

}
