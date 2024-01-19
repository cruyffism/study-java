package sec01.exam;

public class Computer extends Calculator {
	@Override //오버라이딩 중으로 만들기
	double areaCircle(double r) { // 부모 클래스의 메소드 재정의 (오버라이딩)
		System.out.println("Calculator 객체의 areaCircle() 실행");
		return Math.PI * r * r;
	}
	
}
