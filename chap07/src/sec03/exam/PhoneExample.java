package sec03.exam;

public class PhoneExample  {

	public static void main(String[] args) {
		
		//Phone phone = new Phone(); Phone 클래스(추상 클래스)는 객체 생성 불가능 
	
	SmartPhone smartPhone = new SmartPhone("홍길동");
	
//	smartPhone.owner();
	smartPhone.turnOn();
	smartPhone.internetSearch();
	smartPhone.turnOff();
	}
	
}
