package sec04.exam;

public class Car_1Ex {
	public static void main(String[] args) {
	Car_1 myCar = new Car_1();
	myCar.KeyTurnOn();
	myCar.run();
	int speed = myCar.getSpeed();
	System.out.println("달립니다.(시속:" + speed + "km/h)");
	
	
	}
}
