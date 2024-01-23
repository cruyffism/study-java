package vehicle_1;

public class VehicleEx {
	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare(); X
		
		Bus bus = (Bus) vehicle; //강제타입변환
		
		bus.run();
		bus.checkFare();
	}
}
