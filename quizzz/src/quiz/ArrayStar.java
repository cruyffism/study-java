package quiz;

import java.util.Scanner;

public class ArrayStar {

	public static void main(String[] args) {
		// 3개의 숫자를 스캐너를 통해 읽어서 숫자만큼 *을 찍는 프로그램을 완성

		Scanner scan = new Scanner(System.in);

		
		int[] arr =  new int[3];
		System.out.println("3개의 값을 입력하세요.");		
		for(int i=0; i< arr.length; i++) {
			arr[i] = scan.nextInt();
			}
		
			for(int i=0; i<arr.length; i++) {
				System.out.print(arr[i] + ":");
				for(int j=0; j<arr[i]; j++) {
					System.out.print("*");
				}
				
				System.out.println("");
		   }		
		   scan.close();
	}

}
