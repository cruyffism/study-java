package boardSys;

public class Board {
	//필드
	String title;
	String writer;
	String content;
	int password;
	
	// getter and setter 
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getPassword() {
		return password;
	}

	public void setPassword(int password) {
		this.password = password;
	}

	Board() {
		
	}
	
	Board(String title, String writer, String content, int password) {
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.password = password;
	}
	
	void prt() {
		System.out.println("제목"+ title + "입니다.");
		System.out.println("작성자"+ writer + "입니다.");
		System.out.println("내용"+ content + "입니다.");
	}
}
