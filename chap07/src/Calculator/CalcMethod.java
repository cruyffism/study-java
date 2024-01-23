package Calculator;

public class CalcMethod extends Calculator {
//	@Override
//	public int add(int a, int b) {
//		int add = a+b;
//		System.out.println("add: " + add);
//		return add;
//	}
//	
//	@Override
//	public int subtract(int a, int b) {
//		int subtract = a-b;
//		System.out.println("subtract: " + subtract);
//		return subtract;
//	}
//	
//	@Override
//	public double average(int[] a) {
//		int sum = 0;
//		for(int i=0; i<a.length; i++) {
//			sum += a[i];
//		}
//		double average = (double) (sum / a.length);
//		System.out.println("average: " + average);
//		return average;
//	}

	
	// 정답
	@Override
	public int add(int a, int b) {
		return a+b;
	}
	@Override
	public int subtract(int a, int b) {
		return a-b;
	}
	@Override
	public double average(int[] a) {
		double sum = 0;
		for(int i=0; i<a.length; i++) {
			sum += a[i];
		}
		return sum / a.length;
	}
}
