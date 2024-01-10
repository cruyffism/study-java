package quiz;

import java.util.Scanner;

public class ForVariableEx2 {

	public static void main(String[] args) {
		//숫자를 입력받아 그 숫자의 팩토리얼을 구하기
		// 단 1~n을 구하지 않고 n~1을 곱하는 방식
		// 현재 방식은 정방향 순서로 나옴 
		Scanner scanner = new Scanner(System.in);
		System.out.println("N을 입력해 주세요: ");
		int N = Integer.parseInt(scanner.nextLine());
		int result = 1;
		
		for( int i=1; i<=N; i++) {
			
		result *= i;
		}
		System.out.println(result);
		scanner.close();
	}
}
