package sec01.exam;

public class Member {
	private String id;
	private String name;
	
	public Member(String id, String name) {
		this.id = id;
		this.name =name;
	}
	
	@Override 
	public String toString() {  //toString 재정의
		return id + ": "+  name;
	}
	
}
