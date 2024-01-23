package sec03.exam.Animal;

public abstract class Animal {
	public String Kind;

	public void breathe() {
		System.out.println("숨을 쉽니다.");
	}

	public abstract void sound();  // 추상 메소드
		

}
