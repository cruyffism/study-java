package sec02.exam;

public class ArrayInArrayEx {

	public static void main(String[] args) {
		int[][]mathScores = new int[2][3]; // 1~2번째 행 모두 3칸을 열겠다
		for(int i=0; i<mathScores.length; i++) { // 행의 길이
			for(int k=0; k<mathScores[i].length; k++) { // 열의 길이
				System.out.println("mathScores["+i+"]["+k+"]=" + mathScores[i][k]);
			}
		}
		System.out.println();
		
		int[][] englishSocres = new int[2][]; // 행과열 둘 다 열지만 행의 개수는 2개 지정 열의 개수는 미정
		englishSocres[0] = new int[2]; //1번째 행에 2칸을 연다
 		englishSocres[1] = new int[3]; //2번째 행에 3칸을 연다
		for(int i= 0; i<englishSocres.length; i++) {
			for(int k=0; k<englishSocres[i].length; k++) {
				System.out.println("englishSocres["+i+"]["+k+"]=" + englishSocres[i][k]);
			}
		}
		System.out.println();
														// 95 80
														// 92 96 80 	
		int[][] javaScores = { {95,80}, {92, 96, 80} }; // 첫번째 행에 값 두 개, 두 번째 행에 값 3개! 
		for(int i=0; i<javaScores[i].length; i++) {
			for(int k=0; k<javaScores[i].length; k++) {
			System.out.println("javaScores["+i+"]["+k+"]=" + javaScores[i][k]);
			}
		}
	}

}
