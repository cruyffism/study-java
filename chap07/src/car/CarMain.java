package car;

public class CarMain {
	public static void main(String[] args) {
		//레이서를 부른다.
		Racer woman = new Racer();
		Car[] car = new Car[2]; // Car 클래스를 배열로 만듦
		car[0] = new Maserati(); // 0번 배열에 마세라티 클래스가 들어감
		car[1] = new Ferrari(); // 1번 배열에 페라리 클래스가 들어감
		
		for(int i=0; i<2; i++) {
			woman.drive(car[i]);
		}
	}
}
