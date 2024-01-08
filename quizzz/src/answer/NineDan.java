package answer;

import java.util.Scanner;

public class NineDan {

	public static void main(String[] args) {
		// Scanner로 두 개 숫자를 입력받은 후 첫 번째 입력 값은 단을 두 번째 입력값의 배수로 구구단의 데이터를 출력하시오
		Scanner scan = new Scanner(System.in);
		
		int dan, num;
		System.out.println("출력하고자 하는 단을 입력하세요.");
		dan = scan.nextInt();
		System.out.println("출력하고자 데이터을 입력하세요.");
		num = scan.nextInt();

		for(int j=1; j<10; j++) {
			if(j % num == 0) {
				System.out.println(dan + "X" + j + "=" + (dan * j));
			}
		}
		scan.close();
	}

}
