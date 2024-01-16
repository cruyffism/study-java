package answer;

public class Circle {
	//필드
	int radius;
	//생성자
	public Circle(int radius) {
		this.radius = radius;
	}
	//메서드
	public double getArea() {
		return 3.14*radius*radius;
	}
}
