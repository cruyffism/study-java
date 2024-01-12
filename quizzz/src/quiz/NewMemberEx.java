package quiz;

public class NewMemberEx {
	public static void main(String[] args) {
		NewMember user1 = new NewMember("홍길동", 25, "hong");
		System.out.println("이름: " + user1.name );
		System.out.println("나이: " + user1.age );
		System.out.println("ID: " + user1.id );
		System.out.println("PW: " + user1.Password );

	}
	
}
