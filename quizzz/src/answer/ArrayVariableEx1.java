package answer;

import java.util.Scanner;

public class ArrayVariableEx1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		
		System.out.print(arr[2]+" "+arr[4]+" "+arr[arr.length-1]);
		
		scan.close();

	}

}
