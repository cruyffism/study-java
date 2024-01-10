package answer;

public class Exam06 {

	public static void main(String[] args) {
		//2차원 배열에 학년별(4년)로 1,2학기 성적을 저장하고, 4년 전체 평점 평균을 출력!
		// {88, 89} {78, 90} {95, 90} {99, 100}
		
		int[][]scores = { {88, 89}, {78, 90}, {95, 90}, {99, 100} }; // 4행(중괄호 4개) 2열(괄호안에 값 2개)
		int sum = 0;

		for(int i=0; i<scores.length; i++) { //scores.length는 행의 개수인 4가 된다! 
			for(int j=0; j<scores[i].length; j++) {
				sum += scores[i][j];
			}
			
		}

		System.out.println("총점: " + sum);
		int n = scores.length; //4
		int m = scores[0].length; //2 
		System.out.println("평균: " + sum/(n*m));
	}

}
