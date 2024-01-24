package schoolSys_me;

public class Student extends Member {
	
	String m_major; //추가 필드 선언
	
	public Student(String m_name, String m_id, String m_password, String m_major) { //필드를 초기화하는 생성자
		super(m_name, m_id, m_password);
		this.m_major = m_major;
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
