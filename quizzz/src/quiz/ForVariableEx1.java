package quiz;

public class ForVariableEx1 {

	public static void main(String[] args) {
		
		int even=0;
		for(int i=1; i<=20; i++) {
			if(i%2 == 0) {
				even += i;
			}
		}
		
		System.out.println("1~20 짝수의 합은: " + even);
	}

}
