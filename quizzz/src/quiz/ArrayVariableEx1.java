package quiz;

import java.util.Scanner;

public class ArrayVariableEx1 {

	public static void main(String[] args) {
		// 정수 10개를 입력받은 후 세번째, 다섯번쨰와 마지막으로 입력받은 정수를 차례로 출력
		// 입력 예 : 5 3 9 6 8 4 2 8 10 1
		// 출력 예 : 9 8 1

		Scanner scan = new Scanner(System.in);
		int[] array = new int [10];
		
		for(int i=0; i<array.length; i++) {
	         array[i] = scan.nextInt();
		}
	        	System.out.print(array[2]);
	            System.out.print(array[4]);
	            System.out.print(array[9]);
	            
	     scan.close();
	}
	
}
