package Academic;

public abstract class Member implements Task { //추상클래스

	//필드 선언	
	String name; 
	String id;
	String password;
	int position;

	// 기본 생성자
	public Member() {
		
	}
	
	//필드를 초기화하는 생성자
	public Member(String name, String id, String password, int position) {
		this.name =name;
		this.id =id;
		this.password =password;
		this.position =position;
	}

	@Override 
	public void work() {
		
	}
	
	@Override 
	public void test() {
		
	}


}
