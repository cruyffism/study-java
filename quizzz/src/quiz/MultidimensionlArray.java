package quiz;

public class MultidimensionlArray {

	public static void main(String[] args) {
		// 파스칼 삼각형을 출력하는 프로그램 작성
		// 6행 6열 배열로 풀이 
		//1
		//11
		//121
		//1331
		//14641
		
		int[][] a = new int[6][6];
		int i, j; 
		
		a[1][1] = 1;
		System.out.print(a[1][1]);
		System.out.println();
		
		for(i=2; i<a.length; i++) {
			for(j=1; j<=i; j++) {
			a[i][j] = a[i-1][j-1] + a[i-1][j];
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
