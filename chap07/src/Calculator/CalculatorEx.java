package Calculator;

public class CalculatorEx {

	public static void main(String[] args) {
//		CalcMethod myCalc = new CalcMethod();
//		int[] array = { 1, 2, 3, 4, 5 };
//		
//		myCalc.add(2, 3);
//		myCalc.subtract(2, 3);
//		myCalc.average(array);
//		
		
		
		
		// 정답
		CalcMethod result = new CalcMethod();
		System.out.println("add: " + result.add(2, 3));
		System.out.println("subtract: " + result.subtract(2, 3));
		System.out.println("average: " 
		+ result.average(new int[] { 1, 2, 3, 4, 5 }));
	}

}
