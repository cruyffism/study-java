package sec01.exam;

public class SupersonicAirplaneEx {
	public static void main(String[] args) {
		SupersonicAirplane sa = new SupersonicAirplane();
		sa.takeOff();
		sa.fly(); // 오버라이딩 된 플라이 메소드 안에 super.fly()가 호출됨
		sa.flyMode = SupersonicAirplane.SUPERSONIC;
		sa.fly();  // 오버라이딩 된 플라이 메소드 안에 super.fly()가 호출됨
		sa.flyMode = SupersonicAirplane.NORMAL;
		sa.fly();
		sa.land();
	}

}
