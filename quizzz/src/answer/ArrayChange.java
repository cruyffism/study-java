package answer;

public class ArrayChange {

	public static void main(String[] args) {
		// a의 값과 b의 값을 번갈아 c에 저장하는 코드를 작성
		int a[] = {10, 20, 30};
		int b[] = {40, 50, 60};
		int c[] = new int[6];
		int index = 0;
		for(int i=0; i<a.length; i++) {
			c[index] = a[i];
			c[index+1] = b[i];
			index += 2;
		}
		System.out.println("c배열 값:");
		for(int i=0; i<c.length; i++) {
			System.out.print(c[i] + " ");
		}
		
	}

}


//package Quiz;
//
//public class ArrayChange {
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//		int a[] = {10, 20, 30};  
//		int b[] = {40, 50, 60};
//		int[] c = new int [6];
//		
//		System.out.println("c배열 값: ");
//		
//		System.arraycopy(a, 0, c, 0, 1);
//		System.arraycopy(a, 1, c, 2, 1);
//		System.arraycopy(a, 2, c, 4, 1);
//		System.arraycopy(b, 0, c, 1, 1);
//		System.arraycopy(b, 1, c, 3, 1);
//		System.arraycopy(b, 2, c, 5, 1);
//		
//		for(int i=0; i<c.length; i++) {
//		System.out.print(c[i] + " ");
//		}    
//					
//	}
//
//	  
//
//}
