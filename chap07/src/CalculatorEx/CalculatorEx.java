package CalculatorEx;

public class CalculatorEx {

	public static void main(String[] args) {
		
		CalcMethod calcMethod = new CalcMethod();
		int [] a = {1, 2, 3, 4, 5};
		
		
		calcMethod.add(2, 3);
		calcMethod.subtract(2, 3);
		calcMethod.average(a);
		
		System.out.println("--------");
		
		//변수의 자동 타입 변환
		Calculator calculator;
		calculator = new CalcMethod();
		calculator.add(2, 3);
		calcMethod.subtract(2, 3);
		calcMethod.average(a);
		
		System.out.println("--------");
		//매개변수의 자동 타입 변환
		calcMethod(new CalcMethod());
	}
	
	
	public static void calcMethod(CalcMethod calcMethod) {
	
		int [] a = {1, 2, 3, 4, 5};
		calcMethod.add(2, 3);
		calcMethod.subtract(2, 3);
		calcMethod.average(a);
		
	}

}
