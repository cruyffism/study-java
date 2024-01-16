package practice;

import java.util.Scanner;

public class GugudanOver {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		GugudanOver ggdan = new GugudanOver();
		GugudanOver arr = new GugudanOver();
		System.out.println("구구단에서 출력하고자 하는 단을 입력해라");
		int num = scan.nextInt();
		ggdan(num);
		System.out.println("구구단 출력을 위해 2번째 숫자를 써라");
		int num2 = scan.nextInt();
		arr(num, num2);
		scan.close();
	}
	
	public static void ggdan(int num) { //1개의 단만 출력하는 메소드
		for(int i=1; i<10; i++) {
			System.out.println(num + "X" + i + "=" + num * i);
		}
	}
	
	public static void arr(int a, int b) { //정렬 메소드
			int[] dan = new int[2];
			if(a>b) {
				dan[0] = b; 
				dan[1] = a; 
			} else {
				dan[0] = a; 
				dan[1] = b; 
			}
			for(int i=0; i<dan.length; i++) { //출력 메소드
				for(int j=1; j<10; j++) {
					System.out.println(dan[i] + "X" + j + "=" + dan[i]*j);
				}
			}
	}


}
