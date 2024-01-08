package quiz;

import java.util.Scanner;

public class Gugudan {

	public static void main(String[] args) {
		// Scanner로 두 개 숫자를 입력받은 후 첫 번째 입력 값은 단을 두 번째 입력값의 배수로 구구단의 데이터를 출력하시오
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("출력하고자 하는 단을 입력하세요. : ");
		int a = scanner.nextInt();
		System.out.println("출력하고자 하는 데이터를 입력하세요. : ");
		int b = scanner.nextInt();
		
		for(a=1; a<=10; a++) {
			if(a%b==0) {
				  System.out.println(a + "x" + b  + " = " + a*b );
			}
			scanner.close();
			
		}
	}

}
