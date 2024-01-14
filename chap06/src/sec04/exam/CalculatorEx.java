package sec04.exam;

public class CalculatorEx {
	public static void main(String[] args) {
		
		Calculator myCalc = new Calculator();
		
		myCalc.powerOn();

		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		double result2 = myCalc.divide(8, 6);
		System.out.println("result2: " + result2);
		
		byte x = 10;
		byte y = 4;
		double result3 = myCalc.divide(x, y);
		System.out.println("result3: " + result3);
		
		myCalc.powerOff();
		
	}
}

