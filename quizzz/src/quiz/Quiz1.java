	package quiz;
	
	import java.util.Scanner; //Scanner를 사용하기 위해서 import문을 이용해 호출해야 한다. (내장 객체를 사용하는 방법) >> ctrl + shift + 5
	
	
	public class Quiz1 {
	
		public static void main(String[] args) throws Exception {
			
//			int num1;
//			int num2;
//					
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.println("첫번째 수: ");
//			num1 = scanner.nextInt();
//			System.out.println("두번째 수");
//			num2 = scanner.nextInt();
//			System.out.println("덧셈 결과: ");
//			System.out.println(num1 + num2);
//			
			
			Scanner scanner = new Scanner(System.in);
			
			System.out.println("첫번째 수:");
			String strNum1 = scanner.nextLine();
			System.out.println("두번째 수:");
			String strNum2 = scanner.nextLine();
			
			int num1 = Integer.parseInt(strNum1);
			int num2 = Integer.parseInt(strNum2);
			int result = num1 + num2;
			System.out.println("덧셈 결과:" + result);
			
			scanner.close();
		
	
		}
	
	}
