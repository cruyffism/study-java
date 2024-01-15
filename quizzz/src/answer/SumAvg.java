package answer;

import java.util.Scanner;

public class SumAvg {
	public static void main(String[] args) {
		//크기 5의 배열의 값을 입력받아서 총점을 구하는 메서드를 만들어 보세요.
		int[] arr = new int[5];
		Scanner scan = new Scanner(System.in);
		System.out.println("정수 5개를 입력하세요.");
		for(int i=0;i<arr.length;i++) {
			arr[i] = scan.nextInt();
		}
		int sum=sum(arr);
		System.out.println("입력된 배열의 합은: " + sum);
		int avg=avg(arr);
		System.out.println("입력된 배열의 평균은 : " + avg);
		
		scan.close();
	}
	public static int sum(int[] a) {
		int sum =0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
		}
		return  sum;
	}
	public static int avg(int[] a) {
		int sum =0;
		int count=0;
		int avg=0;
		for(int i=0;i<a.length;i++) {
			sum +=a[i];
			count++;
		}
		avg = sum/count;
		return avg;
	}
}
