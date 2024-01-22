package sec02.quiz.Person;

public class PersonEx {

	public static void main(String[] args) {
		Professor a = new Professor();
		a.setPhone("010-123-456");
		System.out.println(a.getPhone());
		Professor p = a;
		System.out.println(p.getPhone());
		

	}

}
