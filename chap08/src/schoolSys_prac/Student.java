package schoolSys_prac;

public class Student extends Member {
	// 추가 필드 생성
	private String major;

	// 생성자로 초기화
	public Student(String name, String id, String password, String major) {
		super(name, id, password);
		this.major = major;

	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}
	
	public void work() {
		System.out.println("공부를 합니다.");
	}

	public void test() {
		System.out.println("시험을 봅니다.");
	}
}
