package quiz;

public class ThreeNum {

	public static void main(String[] args) {
		//1~9사이로 이루어진 3자리 숫자를 만들어내라
		// 단 중복 없어라 
		
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		
		for(int i =0; i< 3; i++) {
			ballArr[i] = (int)(Math.random() * 9) + 1;
			
			for(int j=0; j<i; j++) {
				if(ballArr[i] == ballArr[j]) {
					i--;
					break;
				}
			}
		}
	}

}
