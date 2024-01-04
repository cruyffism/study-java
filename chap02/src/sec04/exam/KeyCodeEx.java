package sec04.exam;

public class KeyCodeEx {

	public static void main(String[] args) throws Exception {
		int KeyCode;
		
//		KeyCode = System.in.read(); //a 입력
//		System.out.println("KeyCode: " + KeyCode);
//		
//		KeyCode = System.in.read(); //enter 입력(CR)
//		System.out.println("KeyCode: " + KeyCode);
//		
//		KeyCode = System.in.read(); ///enter 입력(LF)
//		System.out.println("KeyCode: " + KeyCode);
		
		while(true) {
			KeyCode = System.in.read();
			System.out.println("KeyCode " + KeyCode);
			if(KeyCode == 113) {
				break; //KeyCode가 113과 도일한 경우 실행
			}
		}
		System.out.println("종료");
		
	}

}
