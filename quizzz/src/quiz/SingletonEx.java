package quiz;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton s = Singleton.getInstance();
		
		s.setNumber(100);
		System.out.println(s.getNumber());

	}

}
