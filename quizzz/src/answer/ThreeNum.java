package answer;

public class ThreeNum {

	public static void main(String[] args) {
		int[] ballArr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] number = new int[3];
		for(int i=0; i<ballArr.length; i++) {
			int j = (int)(Math.random() * ballArr.length);
			int tmp = 0;
			// 치환을 통해 중복을 제거한다. 
			tmp = ballArr[i];        // tmp = ballarr[0] >> 1
			ballArr[i] = ballArr[j]; // ballarr[0] = ballarr[4]  >> 5
			ballArr[j] = tmp;        // ballarr[4] = tmp >> 1
			
		}

		System.arraycopy(ballArr,0,number,0,3);
		for(int i=0; i<3; i++) {
			System.out.print(number[i]);
		}
	}

}
