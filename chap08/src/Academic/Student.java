package Academic;

public class Student extends Member {
	
	String major; //추가 필드 선언
	
	public Student(String name, String id, String password, int position, String major) { //필드를 초기화하는 생성자
		super(name, id, password, position);
		this.major = major;
	}
	
	@Override  //추상 메소드 오버라이딩
	public void work() {
		System.out.println("공부를 합니다.");
	}
	
	@Override //추상 메소드 오버라이딩
	public void test() {
		System.out.println("시험을 봅니다.");
	}

}
