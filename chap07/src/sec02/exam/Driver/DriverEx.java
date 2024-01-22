package sec02.exam.Driver;

public class DriverEx {

	public static void main(String[] args) {
		Driver driver = new Driver(); // 인스턴스 발생 
		
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus); // Vehicle vehicle = bus; 자동타입변환
		driver.drive(taxi); // Vehicle vehicle = taxi; 자동타입변환

	}

}
