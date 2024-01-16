package quiz;

import java.util.Scanner;

public class maxValue {

	public static void main(String[] args) {
		//주어진 배열을 입력받아서 가장 큰 수를 반환하는 메서드를 만들어라
		int[] arr = new int[13];
		
		Scanner scan = new Scanner(System.in);
		System.out.println("입력");
		for(int i=0; i<arr.length; i++) {
		arr[i] = scan.nextInt();
		}
		
		System.out.println("출력: ");
		int max = maxValue.max(arr);
		System.out.println("최대값 :" + max);
		
		scan.close();
	}
	
	public static int max(int a[]) { // a 이름으로 된 숫자 배열, max라는 메소드에 int[]타입을 가진 a 를 매개변수로 갖기
		int max = 0;
		for(int i = 0; i < a.length; i++){
		    if(max < a[i]) { //a[1 2 3 4 5] >> 1이 max에 들어가고 2와 비교 2가 더 크니까  max에 들어가고 3과 비교... 
		        max = a[i];
		    }
		}
		return max;
	}

}
