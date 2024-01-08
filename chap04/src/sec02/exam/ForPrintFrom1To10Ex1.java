package sec02.exam;

public class ForPrintFrom1To10Ex1 {

	public static void main(String[] args) {
		
		/*
		 * int sum = 0;
		 * 
		 * for(int i=1; i<=100; i++) { //초기화;조건식;증감식 sum += i;
		 * 
		 * }
		 * 
		 * System.out.println("1~100 까지 : " + sum);
		 */
			
			int sum = 0;
			int i=0;  // i를 글로벌로 사용하기 위해 밖에다 변수 선언
			
			for(i=1; i<=100; i++) { //초기화;조건식;증감식
				sum += i;
				
			}
			
				System.out.println("1~" + (i-1) +  " 합 : "+ sum);


	}

}
