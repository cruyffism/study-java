package sec01.exam;

public class TryCatchFinallyExample {
	
	// try 문에서 Exception 예외가 발생할 경우 catch (Exception e) 로 빠져서 그 안의 실행문을 실행한다.
	// 마지막의 finally블럭은 try-catch문과 함께 예외발생 여부과 관계없이 "항상. 무조건" 실행되어야할 코드를 적는다.


	public static void main(String[] args) {
		try {
			Class clazz = Class.forName("String2"); 
		} catch(ClassNotFoundException e) {
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
