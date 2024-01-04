package quiz;

import java.util.Scanner;

public class Quiz3_1 {

	public static void main(String[] args) throws Exception {
		
		// 연필의 자루 수와 학생의 인원수를 입력(Scanner 이용)받아서 학생 1명당 받을 수 있는 연필의 자루수와 남는 연필의 개수를 출력하시오.
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("연필자루 수: ");
		int x = scanner.nextInt();
		
		System.out.print("학생 수: ");
		int y = scanner.nextInt();
		
		System.out.println("--------------------------");
		
		System.out.println("학생 1명당 연필 겟수: " + x / y);
		System.out.print("남은 연필 갯수: " + x % y);
		
		
//Scanner scanner = new Scanner(System.in);
//		
//		System.out.print("연필자루 수: ");
//		int pencils = Integer.parseInt(scanner.nextLine());
//		System.out.print("학생 수: ");
//		int students = Integer.parseInt(scanner.nextLine());
//		
//		System.out.println("---------------------");
//		int pencilPerStudent = pencils / students;
//		System.out.println("학생 1명당 연필 갯수: " + pencilPerStudent);
//		int pencilIsLeft = pencils % students;
//		System.out.println("남는 연필 갯수: " + pencilIsLeft);

	}

}
