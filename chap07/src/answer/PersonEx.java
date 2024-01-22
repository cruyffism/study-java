package answer;

public class PersonEx {

	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("010-111-1222");
		System.out.println(a.getPhone());
		Person p = a;
		System.out.println(p.getPhone());

	}

}
