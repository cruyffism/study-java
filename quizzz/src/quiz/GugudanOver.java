package quiz;

import java.util.Scanner;

public class GugudanOver {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		GugudanOver ggdan = new GugudanOver();
		
		System.out.println("출력하고자하는 단을 입력하세요.");
		System.out.print(">");
		int n = scan.nextInt();
		ggdan.gugudan(n);
		
		System.out.println("구구단 출력을 위해서 2번째 숫자를 입력하세요.");
		System.out.print(">");
		int m = scan.nextInt();
		ggdan.gugudan(n,m);
		
		scan.close();

	}
	
	void gugudan(int n) {
		System.out.println(n + "단");
		for(int i=1; i<=9; i++) {
			System.out.println(n + "*" + i + "=" +(n*i));
		}
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
