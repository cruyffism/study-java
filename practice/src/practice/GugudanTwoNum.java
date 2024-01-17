package practice;

import java.util.Scanner;

public class GugudanTwoNum {

	public static void main(String[] args) {


		Scanner scan = new Scanner(System.in);
		System.out.println("단을 입력하세요.");
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		
		gugudan(num1, num2);
		
		scan.close();
	}

	public static void gugudan(int num1, int num2) { // 정렬 메소드
		int[] dan = new int[2];
		if(num1>num2) {
			dan[0] = num2; 
			dan[1] = num1;
		} else {
			dan[0] = num1; 
			dan[1] = num2;
		}
		
		for(int i=0; i<dan.length; i++) { // 출력 메소드
			for(int j=1; j<10; j++) {
				System.out.println(dan[i] + "X" + j + "= " + dan[i]*j); 
			}
		}
	}
	
	
	
	
}
