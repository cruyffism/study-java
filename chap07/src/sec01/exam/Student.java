package sec01.exam;

public class Student extends People {
		//필드
		public int studentNo;
		
		//생성자
		public Student(String name, String ssn, int studentNo) {
			super(name, ssn); //자식 생성자의 맨 첫줄에서 부모 생성자의 
			this.studentNo = studentNo;
		}
}
