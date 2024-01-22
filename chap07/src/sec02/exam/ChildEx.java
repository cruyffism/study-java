package sec02.exam;

public class ChildEx extends Parent {

	public static void main(String[] args) {
		Child child = new Child(); 
		Parent parent = child; // 자동 타입변환
//		Parent parent =  new Child();도 사용 가능 
		
		parent.method1();
		parent.method2();  //재정의 된 메소드가 호출됨
		//parent.method3(); 호출 불가능
	}

}
