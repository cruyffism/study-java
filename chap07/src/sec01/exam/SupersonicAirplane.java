package sec01.exam;

public class SupersonicAirplane extends Airplane {
	public static final int NORMAL = 1;  //final  >> 선언이 최종 상태이며 수정 불가, 상속 불가 , 재정의 불가
	public static final int SUPERSONIC = 2;

	public int flyMode = NORMAL;

	@Override
	public void fly() {
		if (flyMode == SUPERSONIC) {
			System.out.println("초음속비행입니다.");
		} else {
			// Airplane 객체의 fly() 메소드 호출
			super.fly();
		}
	}

}
