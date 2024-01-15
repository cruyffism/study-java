package quiz;

import java.util.Scanner;

public class MemberServiceEx {
	
	public static void main(String[] args) {
		
		MemberService memberService = new MemberService();
		
		Scanner scan = new Scanner(System.in);
		System.out.println("아이디를 입력해주세요");
		String id = scan.nextLine();
		System.out.println("패스워드를 입력해주세요");
		String pw = scan.nextLine();
		boolean result = memberService.login(id, pw);
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout(id);
		} else {
			System.out.println("id 또는 password가 올바르지 않습니다.");
		}
		scan.close();
	}

}
