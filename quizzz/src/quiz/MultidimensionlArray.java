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
		
		int[][] a = new int[6][6]; //6행 6열
		int i, j; 
		
		a[1][1] = 1; //1행 1열에 1을 넣어라 
		System.out.print(a[1][1]); // 8라인의 1출력 
		System.out.println(); //엔터
		
		for(i=2; i<a.length; i++) { // a.length >> 행의 길이를 의미 즉 6!
			for(j=1; j<=i; j++) {
			a[i][j] = a[i-1][j-1] + a[i-1][j]; // 행은 위아래로 움직이고 열은 좌우로 움직인다.
			System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
