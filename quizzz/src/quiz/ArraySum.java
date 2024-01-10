package quiz;

public class ArraySum {

	public static void main(String[] args) {
		int[][] scores = {{5, 5, 5, 5,5}, {10, 10, 10, 10, 10}, {20, 20, 20, 20, 20}, {30, 30, 30, 30, 30}}; //4행 5열
		int sum = 0;
		
		for(int i=0; i< scores.length; i++) {
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
		}
		System.out.println("합계: " + sum);
		int n = scores.length;
		int m = scores[0].length;
		System.out.println("평균: " + sum/(n*m));
		
	}

}
