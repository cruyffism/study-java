package sec02.exam;

public class MemberExample {

	public static void main(String[] args) {

		Member member = new Member(); // 새로운 객체를 만듦
		
		member.name = "최하얀"; // 객체 내부의 변수 정보 기록 
		member.age = 23;
		member.id = "white";
		member.Password = "1234";
		
		Member member2 = new Member();
		
		member2.name = "홍민기";
		member2.age = 23;
		member2.id = "alsrl";
		member2.Password = "5949";
		
		System.out.println("이름: " + member.name);
		System.out.println("나이: " + member.age);
		System.out.println("ID: " + member.id);
		System.out.println("PW: " + member.Password);
		
		System.out.println();
		
		System.out.println("이름: " + member2.name);
		System.out.println("나이: " + member2.age);
		System.out.println("ID: " + member2.id);
		System.out.println("PW: " + member2.Password);
		
	}

}
