package quiz;

import java.util.Scanner;

public class Constellation {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.print("월을 입력해 주세요 : ");
		int month = scanner.nextInt();
		System.out.print("일을 입력해 주세요 : ");
		int date = scanner.nextInt();

		switch (month) {

		case 1:
			if (date < 20) {
				System.out.println("염소자리");
			} else if (date < 32) {
				System.out.println("물병자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 2:
			if (date < 19) {
				System.out.println("물병자리");
			} else if (date < 30) {
				System.out.println("물고기자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 3:
			if (date < 21) {
				System.out.println("물고기자리");
			} else if (date < 32) {
				System.out.println("양자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 4:
			if (date < 20) {
				System.out.println("양자리");
			} else if (date < 31) {
				System.out.println("황소자리");
			}  else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 5:
			if (date < 21) {
				System.out.println("황소자리");
			} else if (date < 32) {
				System.out.println("쌍둥이자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 6:
			if (date < 22) {
				System.out.println("쌍둥이자리");
			} else if (date < 31) {
				System.out.println("게자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 7:
			if (date < 23) {
				System.out.println("게자리");
			} else if (date < 32) {
				System.out.println("사자자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 8:
			if (date < 23) {
				System.out.println("사자자리");
			} else if (date < 32) {
				System.out.println("처녀자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 9:
			if (date < 24) {
				System.out.println("처녀자리");
			} else if (date < 31) {
				System.out.println("천칭자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 10:
			if (date < 23) {
				System.out.println("천칭자리");
			} else if (date < 32) {
				System.out.println("전갈자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 11:
			if (date < 23) {
				System.out.println("전갈자리");
			} else if (date < 31) {
				System.out.println("궁수자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		case 12:
			if (date < 25) {
				System.out.println("궁수자리");
			}  else if (date < 32) {
				System.out.println("염소자리");
			} else {
				System.out.println("날짜 입력이 잘못 되었습니다.");
			}
			break;

		}

	}

}
