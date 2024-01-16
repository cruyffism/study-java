package practice;

import java.util.Scanner;

public class MemberService2_Ex {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		MemberService2 member = new MemberService2();
		
		System.out.println("아이디를 입력해주세요.");
		String id = scan.nextLine();
		System.out.println("패스워드를 입력해주세요.");
		String pw = scan.nextLine();
		boolean result = member.login(id, pw);
		if(result) {
			System.out.println("로그인 되었습니다.");
			member.logout(id);
		}else {
			System.out.println("id 또는 pw가 틀렸어 ");
		}
		scan.close();
	}
}
