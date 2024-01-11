package sec02.exam;

public class MemberExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Member member = new Member();
		
		member.name = "최하얀";
		member.age = 23;
		member.id = "white";
		member.Password = "1234";
		
		
		System.out.println("이름: " + member.name);
		System.out.println("나이: " + member.age);
		System.out.println("ID: " + member.id);
		System.out.println("PW: " + member.Password);
		
	}

}
