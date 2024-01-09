package quiz;

import java.util.Scanner;

public class Ex05 {

	public static void main(String[] args) {
		//스캐너를 이용해 양수 5개를 입력 받아 배열에 저장, 제일 큰 수 출력해라!
		//배열 생성 후 스캐너로 입력받기 
		Scanner scan =new Scanner(System.in);
		int[] intArray = new int [5];
		int max = 0;
		
		System.out.println("양수 5개를 입력해주세요");
		for(int i=0; i<intArray.length; i++) {
			intArray[i]=scan.nextInt();
			
			if(max<intArray[i]) {
				max = intArray[i];
			}
		}
		System.out.println("가장 큰 수는: " + max);
		scan.close();
		
	}
}
