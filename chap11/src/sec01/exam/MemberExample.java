package sec01.exam;

public class MemberExample {

	public static void main(String[] args) {
		Member member = new Member("blue", "이파란");
		
		String strobj = member.toString(); //재정의된 toString() 호출
		System.out.println(strobj); //재정의된 toString()을 호출하고 리턴값을 출력
	}
}
