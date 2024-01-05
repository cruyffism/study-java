package quiz;

import java.util.Scanner;

public class BMIcaculator {

	public static void main(String[] args) {
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("키를 입력해 주세요: ");
//		System.out.println("몸무게를 입력해 주세요: ");
//		float height = Float.parseFloat(scanner.nextLine());
//		float weight = Float.parseFloat(scanner.nextLine());
//		float result = Float.parseFloat(weight/(height*0.01)*(height*0.01));
//	
//		if (result <= 18.5) {
//			System.out.println("저체중");
//			
//		} else if (result <= 25) {
//			System.out.println("정상");
//			
//		} else if (result <= 25) {
//			System.out.println("과체중");
//			
//		}  else  {
//			System.out.println("고도비만");
//			
//		}
//		
//		scanner.close();
		
		
		float weight = 0;
		float height = 0;
		Scanner scan = new Scanner(System.in);
		System.out.println("키를 입력해 주세요:");
		height = scan.nextFloat();
		height *= 0.01;
		System.out.println("몸무게를 입력해 주세요: ");
		weight = scan.nextFloat();
		
		float bmi = weight / (height*height);
		
		if (bmi <= 18.5) {
			System.out.println("저체중 입니다.");
		} else if(bmi <= 25) {
			System.out.println("정상체중 입니다.");
		} else if(bmi <= 30) {
			System.out.println("과체중 입니다.");
		}
		else if(bmi <= 40) {
			System.out.println("비만 입니다.");
		} else {
			System.out.println("고도 비만 입니다.");
		}
	}

}
