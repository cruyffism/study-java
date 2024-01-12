package answer;

public class BoardExample {

	public static void main(String[] args) {
		Board board = new Board("제목", "내용");
		Board board1 = new Board("제목", "내용", "홍길동");
		Board board2 = new Board("제목", "내용", "홍길동", "2025-12-31");
		Board board3 = new Board("제목", "내용", "홍길동", "2025-12-31", 0);

	}

}
