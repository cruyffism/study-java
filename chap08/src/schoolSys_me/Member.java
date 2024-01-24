package schoolSys_me;

public abstract class Member implements Task { //추상클래스

	//필드 선언	
	String m_name; 
	String m_id;
	String m_password;

	// 기본 생성자
	public Member() {
		
	}
	
	//필드를 초기화하는 생성자
	public Member(String m_name, String m_id, String m_password) {
		this.m_name = m_name;
		this.m_id = m_id;
		this.m_password = m_password;
	}

	@Override 
	public void work() {
		
	}
	
	@Override 
	public void test() {
		
	}


}
