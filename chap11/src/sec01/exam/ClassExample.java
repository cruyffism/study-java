package sec01.exam;

public class ClassExample {
	public static void main(String[] args) throws Exception {
//		//how1
		Class clazz = Car.class;
		
		String photop1Path = clazz.getResource("photo1.jpg").getPath();
		String photop2Path = clazz.getResource("images/photo2.jpg").getPath();
		
		System.out.println(photop1Path);
		System.out.println(photop2Path);
	}
}
