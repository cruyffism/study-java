package quiz;

public class BoardEx {

	public static void main(String[] args) {
		Board board = new Board("제목", "내용");
		System.out.println("board1: " + board.title + "," + board.content );
		System.out.println();
		
		Board board1 = new Board("title", "content", "writer");
		System.out.println("board1: " + board1.title + "," + board1.content + "," + board1.writer );
		System.out.println();
		
		Board board2 = new Board("title", "content", "writer", "date");
		System.out.println("board3: " + board2.title + "," + board2.content + "," + board2.writer  + "," + board2.date );
		System.out.println();
		
		Board board3 = new Board("title", "content", "writer", "date", 0);
		
		System.out.println("board4: " + board3.title + "," + board3.content + "," + board3.writer  + "," + board3.date );
		System.out.println();
		
	}

}
