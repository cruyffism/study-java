package quiz;

import java.util.Scanner;

public class Quiz3_3 {

	public static void main(String[] args) throws Exception {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("첫번째 수: ");
		double num1 = scanner.nextDouble();
		
		System.out.print("두번째 수: ");
		double num2 = scanner.nextDouble();
		
		System.out.println("--------------------------");
		
		double result = num1 / num2;
		
		if (num2 == 0 || num2 == 0.0) {
			System.out.println("결과: " + "무한대" );
		}else {
			System.out.println("결과: " + result);
			
			scanner.close();
		}
		
		
		/*String.valueOf() - 파라미터가 null이면 문자열 "null"을 만들어서 반환한다.
		toString() - 대상 값이 null이면 NPE를 발생시키고 Object에 담긴 값이 String이 아니여도 출력한다.
		null로 인해 발생된 에러는 시간이 지나고, 타인의 소스인경우 디버깅하기 어렵고 어떤의미를 내포하고 있는지 판단하기 어렵다. 
		때문에 NPE를 방지하기 위해 toString보다는 valueOf를 사용하는 것을 추천한다.
		*/
		/*
		 * public static void main(String[] args) { Scanner scanner = new
		 * Scanner(System.in);
		 * 
		 * System.out.print("첫 번째 수: "); double num1 =
		 * Double.parseDouble(scanner.nextLine()); System.out.print("두 번째 수: "); double
		 * num2 = Double.parseDouble(scanner.nextLine());
		 * 
		 * System.out.println("---------------------"); double devide = num1/num2;
		 * String result = (num2 != 0.0) ? String.valueOf(devide) : "무한대";
		 * System.out.print("결과: " + result);
		 * 
		 * scanner.close();
		 */

		
	}

}
