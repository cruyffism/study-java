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
		
		
		/*
		  Scanner sc = new Scanner(System.in);

		System.out.print("윗변 : ");
		double lengthTop = sc.nextDouble();
		System.out.print("아랫변 : ");
		double lengthBottom =sc.nextDouble();
		System.out.print("높이 : ");
		double height = sc.nextDouble();
		double result = (lengthTop + lengthBottom) * height / 2.0;
		
		System.out.println("--------------");
		System.out.println("사다리꼴의 넓이 : " + result);
		  
		 */

	}

}
