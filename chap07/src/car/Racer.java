package car;

public class Racer {
	public void drive(Car car) {
		// Car 형태면 Car가 부모클래스이기 때문에 어떠한 객체라도 다 받을 수 있다.
		car.run();

		// 다형성을 사용하지 않을 경우?
		// 각 형태별 메소드를 만들어줘야함.
		// 오버로드를 사용하면 사용자 입장에서는 동일

//		public void drive(MAserati car) {
//			//다형성을 사용하지 않아 고유의 멤버 사용이 가능
//			car.run();
//		}

//		public void drive(Ferrari car) {
//		//다형성을 사용하지 않아 고유의 멤버 사용이 가능
//		car.run();
//	}

	}
}
