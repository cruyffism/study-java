package sec01.exam;

import java.util.Scanner;

public class SwitchCharEx {

	public static void main(String[] args) {
		char grade = 'a';
		
		switch(grade) {
		case 'A':
		case 'a':
			System.out.println("우수 회원입니다.");
			break;
		case 'B':
		case 'b':
			System.out.println("일반 회원입니다.");
			break;
			default:
				System.out.println("손님입니다.");
		}
		
		Scanner scan = new Scanner(System.in);
		System.out.println("직급을 연력하세요. : ");
		String position = scan.next();
		
		switch(position) {
		case "부장":
			System.out.println(position + "이면 700만원");
			break;
		case "과장":
			System.out.println(position + "이면 500만원");
			break;
		default:
			System.out.println(position + "이면 300만원");
		
		}
		scan.close();
	}

}
