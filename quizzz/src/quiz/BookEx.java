package quiz;

import java.util.Scanner;

public class BookEx {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Book[] book = new Book[2]; // book 배열 선언
		int i = 0; 
	
		  for(i=0; i<2; i++) {
			  
		  System.out.print("제목 >>"); 
		  String title = scan.nextLine(); 
		  System.out.print("저자 >>"); 
		  String author = scan.nextLine();
		  book[i] = new Book(title, author); // 배열 원소 객체 생성
		  
		  }
		  
		  for(i=0; i<2; i++) { 
			 System.out.print("("+ book[i].title + "," + book[i].author +")"); 
		  }
		
	 scan.close();
	 
	}
	
}






  
 