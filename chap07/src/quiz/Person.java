package quiz;

public class Person {
	// 필드
	int age;
	public String name;
	protected int height;
	private int weight;


	// 생성자
	public Person(int age, String name, int height, int weight) {
		this.age = age;
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	
	// weight 필드에 대한 접근자 메서드
	public int getWeight( ) {
		return weight;
	}
}
