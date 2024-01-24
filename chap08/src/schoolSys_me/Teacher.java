package schoolSys_me;

public class Teacher extends Member {
	
	String m_subject; //추가 필드 선언
	
	public Teacher(String m_name, String m_id, String m_password, String m_subject) { //필드를 초기화하는 생성자
		super(m_name, m_id, m_password);
		this.m_subject = m_subject;
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
