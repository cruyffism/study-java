package sec03.exam;

public class Car {
 //필드
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; 
	
	//constructor 
	//생성자
	Car() {
		
	}
	
	Car(String model){
		this(model, null, 0);
//		this.model = model;
	}
	
	Car(String model, String color){
		this(model, color, 0);
//		this.model = model;
//		this.color = color;
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
