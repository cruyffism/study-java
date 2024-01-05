package sec01.exam;

public class IfDiceEx {
	
	public static void main(String[] args) {

        int num = (int) (Math.random()*6) + 1;// casting
		
		if(num==1) {
			System.out.println("1번이 나욌습니다.");
		} else if(num==2) {
			System.out.println("2번이 나욌습니다.");
		} else if(num==3) {
			System.out.println("3번이 나욌습니다.");
		} else if(num==4) {
			System.out.println("4번이 나욌습니다.");
		} else if(num==5) {
			System.out.println("5번이 나욌습니다.");
		} else {
			System.out.println("6번이 나욌습니다.");
		}
		
		
	}

}

// start부터
//int num = (int)( Math.random()*n) + start;

// 10은 조건에 따라 다른 숫자로 변경 될 수 있다.
//0.0 <= Math.random() < 1.0
//0.0 * 10 <= Math.random() * 10 < 1.0 * 10
//(int)0.0 <= Math.random() * 10 < (int) 10
//0 + 1 <=(int)( Math.random() * 10) + 1 < (int) 10 + 1

