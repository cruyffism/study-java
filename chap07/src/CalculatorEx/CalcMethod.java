package CalculatorEx;

public class CalcMethod extends Calculator  {
	
	@Override
	public int add(int a, int b) {
		System.out.println("add: " + (a + b));
		return a+b;
	}
	
	@Override
	public int subtract(int a, int b) {
		System.out.println("subtract: " + (a - b));
		return a-b;
	}
	
	@Override
	public double average(int[] a) {
	        int sum = 0;
	        for(int i=0; i<a.length; i++) {
	        	sum += a[i];
	        }
	        double average = (double)(sum / a.length);
	        System.out.println("average: " + average);
	        return  average;
	    }
	
}
