package practice;

public class Lotto {

	public static void main(String[] args) {
		int[] lotto = new int[6]; // 로또 배열을 동시에 선언과 생성함
		for (int i = 0; i < lotto.length; i++) {
			lotto[i] = (int) ((Math.random() * 45) + 1);
			for (int j = 0; j < i; j++) {
				if (lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for (int i = 0; i < lotto.length; i++) {
			System.out.println("번호: " + lotto[i]);
		}
	}

}
