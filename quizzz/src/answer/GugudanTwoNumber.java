package answer;

import java.util.Scanner;

public class GugudanTwoNumber {

	public static void main(String[] args) {
		//두개의 숫자를 입력받아서 작은 수부터 큰 수까지의 구구단을 출력
		System.out.println("숫자 2개를 입력하시오");
		Scanner scan= new Scanner(System.in);
		int min = scan.nextInt();
		int max = scan.nextInt();
		gugudan(min,max);
		
		scan.close();

	}
	
	public static void gugudan(int n, int m) {
		if(n<m) {  //n~m
			for(int i=n; i<=m; i++) {
				System.out.println(i + "단");
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
				}
			}
		} else if(n>m) { //m~n
			for(int i=m;i<=n;i++) {
				System.out.println(i + "단");
				for(int j=1; j<=9; j++) {
					System.out.println(i+"*"+j+"="+(i*j));
			  }
			}
		} else { //n=m
			for(int i=1; i<=9; i++) {
				System.out.println(n+"*"+i+"="+(n*i));
			}
		}
	}

}
