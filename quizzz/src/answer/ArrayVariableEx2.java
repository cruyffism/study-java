package answer;

import java.util.Scanner;

public class ArrayVariableEx2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int[] arr = new int[100];
		int i, cnt = 0;
		
		for( i=0; i<arr.length; i++) {     //입력
			arr[i] = scan.nextInt();
			
			if( arr[i] == 0)
			{
				break;
			}
			cnt++;
		}
		
		for( i=cnt-1; i>=0; i--) {      //출력
			System.out.print(arr[i]+" ");
		}


		scan.close();

	}

}