package quiz;

import java.util.Scanner;

public class Quiz3_2 {

	public static void main(String[] args) throws Exception{

		Scanner scanner = new Scanner(System.in);
		
		System.out.print("윗변: ");
		int x = scanner.nextInt();
		
		System.out.print("아랫변: ");
		int y = scanner.nextInt();
		
		System.out.print("높이: ");
		int z = scanner.nextInt();
		
		System.out.println("--------------------------");
		
		System.out.println("사다리꼴의 넓이: " + (x+y)*z/2.0 );

	}

}
