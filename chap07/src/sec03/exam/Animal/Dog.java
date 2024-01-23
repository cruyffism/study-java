package sec03.exam.Animal;

public class Dog extends Animal {
	
	
	public Dog() {
		this.Kind = "포유류";
	}
	
	@Override
	public void sound() {
		System.out.println("멍멍");
	}
}
