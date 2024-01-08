package sec02.exam;

public class ContinueExample {

	public static void main(String[] args) throws Exception {
		for(int i=1; i<=10; i++) {
			if(i%2 != 0) {
				continue; // 홀수느 건너 뛰고 출력
			}
			System.out.println(i);
		}

	}

}
