package boardSys;

import java.util.Scanner;

public class View {
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		
		public void menu() { //메뉴 메서드
			System.out.println("환영합니다 ^^");
			System.out.print("1.게시 보기 ");
			System.out.print("2.글 작성 ");
			System.out.println("3.종료");
			System.out.println("번호를 입력해주세요.");
			System.out.println(">");	
		}
		 
		public void list() { //1. 게시글 선택 메서드
			System.out.println("*** 리스트 목록을 확인하세요 ***");
			System.out.println("1번째 게시글: 게시판입니다.");
			System.out.println("보고싶은 게시글의 번호를 선택하세요.");
			System.out.println("(0번 입력 시 메인 메뉴로 돌아갑니다.)");
		}
		
		public void viewContent() {// 1-1/ 게시글 보여주기 메서드
			board.prt();
		}
		
		
		public void menu2() { //1-1-1 서브 메뉴 메서드
			System.out.print("1.수정 | ");
			System.out.print("2.삭제 | ");
			System.out.println("3.돌아가기");
			System.out.println("선택 >");	
		}
		
		public void createBoard() { //2 글 작성 메서드
			System.out.println("게시물을 작성합니다.");
			System.out.println("작성자를 입력하세요");
			String writer = scan.nextLine();
		    board.setWriter(writer);
		    System.out.println("제목을 입력하세요");
		    String title = scan.nextLine();
		    board.setTitle(title);
		    System.out.println("글 내용을 입력하세요.");
		    String content = scan.nextLine();
		    board.setContent(content);
		    System.out.println("삭제나 수정 시 사용할 비밀번호를 입력하세요.");
		    int password = scan.nextInt();
		    board.setPassword(password);
		    System.out.println("글 등록 성공");
		}
		


}
