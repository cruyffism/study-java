package sec01.exam;

public class StudentExample {

	public static void main(String[] args) {
		Student s1 = new Student(); // 아파트 101동 건설 
		System.out.println("s1 변수가 Student 객체를 참조합니다.");

		
		Student s2 = new Student(); // 아파트 102동 건설 
		System.out.println("s2 변수가 또 다른 Student 객체를 참조합니다.");
		
		Student S3 = new Student();
		System.out.println("s3 변수가 또 다른 Student 객체를 참조합니다.");
	}

}
