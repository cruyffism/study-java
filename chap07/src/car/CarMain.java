package car;

public class CarMain {
	public static void main(String[] args) {
		//레이서를 부른다.
		Racer man = new Racer();
		Car[] car = new Car[2];
		car[0] = new Maserati();
		car[1] = new Ferrari();
		
		for(int i=0; i<2; i++) {
			man.drive(car[i]);
		}
	}
}
