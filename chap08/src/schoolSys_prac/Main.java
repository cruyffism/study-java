package schoolSys_prac;

import java.util.Scanner;

public class Main {
	//public은 내 클래스가 다른 클래스에서 접근 가능하다는 것을 의미 
	// 내 클래스에서 static으로 선언하면 다른 클래스에서 인스턴스를 생성하지 않고도 직접 접근하여 사용할 수 있어 편리
	public static Scanner scan = new Scanner(System.in);
	public static Member[] members = new Member[100];
	
	
	//Controller 클래스의 새로운 인스턴스를 생성하는 것
	//프로그램이 시작되면 main 메서드가 호출됨.
	//new Controller();를 통해 Controller 클래스의 새로운 인스턴스를 생성함.
	//Controller 클래스의 생성자가 호출되어 초기화 작업을 수행함.
	//이를 통해 프로그램의 실행이 시작될 수 있음.
	public static void main(String[] args) {
		new Controller();
	}
}
