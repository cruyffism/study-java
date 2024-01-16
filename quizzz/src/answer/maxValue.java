package answer;

public class maxValue {
	public static void main(String[] args) {
		//주어진 배열을 입력받아서 가장 큰 수를 반환하는 메서드를 만들어 보세요.
		int[] arr = new int[]{78,54,89,57,84,95,74,91,84,67,52,94,82};
		int max = maxVal(arr);
	 
		System.out.println("최대값 : "+max);

	}
	public static int maxVal(int a[]) {  //정수형 배열을 넣으면 최대값을 찾아내는 기능을 가진 메서드
		int max = 0;
		for(int i=0;i<a.length;i++) {
			if(max<a[i]) {
				max=a[i];
			}	
		}
		return max;
	}
}
