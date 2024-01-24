package schoolSys_prac;

public abstract class Member implements Task {
	//필드 생성
	String name;
	String id;
	String password;
	
	// 기본 필드를 초기화하는 생성자
	public Member(String name, String id, String password) {
		this.name = name;
		this.id = id;
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

}
