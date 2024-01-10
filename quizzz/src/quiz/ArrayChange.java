package quiz;

public class ArrayChange {

	public static void main(String[] args) {
		// a의 값과 b의 값을 번갈아 c에 저장하는 코드를 작성
		
		int a[] = {10, 20, 30};
		int b[] = {40, 50, 60};
		
		int c[] = new int[6];
		
		for(int i=0; i < a.length; i++) { // 0 2 4 
			c[2*i] = a[i];

	      }	for(int j=0; j < b.length; j++) { // 1 3 5 
				c[2*j+1] = b[j];
			}
			System.out.println("c배열 값:");
			for(int i=0; i<c.length; i++) {
				System.out.print(c[i] + " ");

			}
	
	  	}
	
	}
	

