package quiz;

import java.util.Scanner;

public class ArrayVariableEx2 {

	public static void main(String[] args) {
		// 100개의 정수를 저장할 수 있는 배열을 선언하고 정수를 차례로 입력받다가 0이 입력되면 0을 제외하고 그때까지 입력된 정수를 가장 나중에 입력된 정수부터 차례로 출력
		//입력 예 : 3 5 10 55 0 >> scan.nextInt
		//출력 예: : 55 10 5 3 >> syso
		int[] array = new int[100]; 
		Scanner scan = new Scanner(System.in);
		for(int i=0; i< array.length; i++) {			
			int num = scan.nextInt();
			if(num == 0) {
				for(int j=0; j<i; j++) {
					System.out.print(array[i-j-1]); // 3-0-1, 3-1-1, 3-2-1, >> 이렇게 출력 
				}
				break;
			}
			array[i] =	num; 
		}
		scan.close();
	}

}
