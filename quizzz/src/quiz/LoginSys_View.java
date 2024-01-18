package quiz;

import java.util.Scanner;

public class LoginSys_View {

	public static LoginSys_Member[] members = new LoginSys_Member[100];
	

	public static int menu(int menuNum) {
		System.out.println("MIT 사이트에 오신 것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.println("선택>");
		return menuNum;
	}
	
	public static void userfault() {
		System.out.println("잘못 입력했습니다.");
		System.out.println("다시 확인해주세요.");
	}
	
	public static void signUp() {
		Scanner scan = new Scanner(System.in);
		System.out.println("회원가입을 합니다.");
		System.out.println("아이디를 입력하세요.");
		
		System.out.print("아이디를 입력하세요 ");
        String id = scan.nextLine();

        System.out.print("비밀번호를 입력하세요 ");
        String password = scan.nextLine();

        System.out.print("이름을 입력하세요 ");
        String name = scan.nextLine();

        System.out.print("전화번호를 입력하세요 ");
        int phoneNumber = scan.nextInt();
        
        LoginSys_Member member = new LoginSys_Member(id, password, name, phoneNumber);
        
        scan.close();
		}

	public static void Login() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("로그인합니다.");
		System.out.print("아이디를 입력하세요");
        String id = scan.nextLine();

        System.out.print("비밀번호를 입력하세요. ");
        String password = scan.nextLine();
        
        LoginSys_Member member = new LoginSys_Member(id, password);
        for(int i=0; i<members.length;i++ ) {
        	members[i] = member;
        }
        scan.close();
	}
	 public static void success() {
		 System.out.println("로그인에 성공했습니다.");
		 String name = members[0].getName();
	     int phoneNumber = members[0].getPhoneNumber();
		 System.out.println("사용자 이름:" + name );
		 System.out.println("사용자 폰번호:" + phoneNumber );
		 
	 }
	 
	 public static void deadline() {
		 if(member)
	 }
	
}
