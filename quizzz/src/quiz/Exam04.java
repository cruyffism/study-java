package quiz;

public class Exam04 {

	public static void main(String[] args) {
		//양수 5개를 입력 받아 배열에 저장, 제일 큰 수 출력해라!
		int[] array;
		array = new int[] {1, 5, 3, 8, 2};
		int maxValue = 0;

		for(int i=0; i<array.length; i++) {
			if(array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		
		System.out.println("Max : " + maxValue);
	}

}
