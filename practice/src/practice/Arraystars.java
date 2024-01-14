package practice;

import java.util.Scanner;

public class Arraystars {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in); 
		System.out.println("3개의 값을 입력하세요");
		
		int arr[] = new int[3];
		
		for(int i=0; i<arr.length; i++) {
			int num = scan.nextInt();
			arr[i] = num;
		}
		for(int i =0; i <arr.length; i++) {
		System.out.print(arr[i]+ ":");
			for(int j=0; j<arr[i]; j++) {
				System.out.print("*");
			}
			System.out.println("");
		}
		
		scan.close();
	}

}
