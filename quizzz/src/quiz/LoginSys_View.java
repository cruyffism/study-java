package quiz;

import java.util.Scanner;

public class LoginSys_View {

	public static LoginSys_Member[] members = new LoginSys_Member[100];
	public static int memberCount = 0;
	int menuNum = 0;

	public static int menu(int menuNum) {
		System.out.println("MIT 사이트에 오신 것을 환영합니다.");
		System.out.println("메뉴를 선택해 주세요.");
		System.out.println("1. 회원가입");
		System.out.println("2. 로그인");
		System.out.println("3. 프로그램 종료");
		System.out.println("선택>");
		return menuNum;
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
		  if (memberCount >= members.length) {
	            System.out.println("회원가입이 마감되었습니다. 나중에 다시 찾아와 주세요.");
	        } 
	 }
	 
	 public static void programExit() {
	        Scanner scan = new Scanner(System.in);

	        System.out.println("종료하시겠습니까? (y/n)");
	        char choice = scan.next().charAt(0);

	        if (choice == 'y' || choice == 'Y') {
	            System.out.println("프로그램을 종료합니다.");
	        } else if (choice == 'n' || choice == 'N') {
	            System.out.println("종료 취소");
	        } 
	        scan.close();
	    }
	 
	 public static void userfault(int menuNum) {
		    if (!(menuNum == 1 || menuNum == 2 || menuNum == 3)) {
		        System.out.println("잘못된 입력입니다. 1, 2, 3 중 하나를 선택하세요.");
		    }
		}
	
}
