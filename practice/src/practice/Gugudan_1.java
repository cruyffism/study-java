package practice;

public class Gugudan_1 {
	//단을 외부데이터로 입력 받아서 구구단을 출력하는 메서드를 만들어 보세요.
	void gugudan(int num) { //매개변수로 숫자형인 num을 받는다.
		for(int i=1; i<10; i++) {
				System.out.println(num + "X" + i + "=" + num * i );

		}
	}
}
