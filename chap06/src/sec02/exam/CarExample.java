package sec02.exam;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성

		
		
		Car car = new Car("그랜저");
		car.model = "아반떼";
		System.out.println(car.model);
		car.maxSpeed = 300;
		System.out.println(car.maxSpeed);
		
		
		
		
		
		Car myCar = new Car("그랜저", "검정", 3000);

		System.out.println("제작회사: " + myCar.company); // 필드 값 읽기
		System.out.println("모델명: " + myCar.model);
		System.out.println("색깔: " + myCar.color);
		System.out.println("최고속도: " + myCar.maxSpeed);
		System.out.println("현재속도: " + myCar.speed);
		myCar.speed = 60;
		System.out.println("수정된 속도: " + myCar.speed); // 필드 값 변경

	}

}
