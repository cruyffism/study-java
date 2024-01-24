package Academic;

public class Teacher extends Member {
	
	String subject; //추가 필드 선언
	
	public Teacher(String name, String id, String password, int position, String subject) { //필드를 초기화하는 생성자
		super(name, id, password, position);
		this.subject = subject;
	}
	
	@Override  //추상 메소드 오버라이딩
	public void work() {
		System.out.println("강의를 합니다.");
	}
	
	@Override //추상 메소드 오버라이딩
	public void test() {
		System.out.println("채점을 합니다.");
	}
	
}
