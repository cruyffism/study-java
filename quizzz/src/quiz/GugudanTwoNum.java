package quiz;

import java.util.Scanner;

public class GugudanTwoNum {
	
	 public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
			int num1 = scan.nextInt();
			int num2 = scan.nextInt();
			
			scan.close();
	}


	static void gugudan(int num1, int num2) { 
	
	if(num1 > num2 ) {
		for(int x=2; x<10; x++) {
			for(int y=1; y<10; y++) {
				System.out.println(x + " * " + y + " = " + x*y);
			}
		} 
			
		}
	}


  }



