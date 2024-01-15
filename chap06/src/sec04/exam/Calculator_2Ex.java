package sec04.exam;

public class Calculator_2Ex {
	public static void main(String[] args) {
		Calculator_2 myCal = new Calculator_2();
		
		//정사각형의 넓이 구하기
		double result1 = myCal.areaRectangle(10);
		
		//직사각형의 넓이 구하기
		double result2 = myCal.areaRectangle(10, 20);
		
		//결과 출력
		System.out.println("정사각형의 넓이=" + result1);
		System.out.println("직사각형의 넓이=" + result2);
	}
	
}
