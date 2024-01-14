package practice;

public class ThreeNumber {

	public static void main(String[] args) {
//		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9}; 9개 배열 선언
		
		int[] arr =  new int[9];	
		
		int[] arr2 = new int[3];
		
		
		for(int i=0; i<arr.length; i++) { //배열을 for문으로 선언 
			arr[i] = i+1;   // 배열이 0번째일때 1을 넣는다.
		}
		
		for(int num=0; num<3; num++) { // 0~8번째까지 중에 랜덤으로 위치값 뽑기 , 여기서  i a j는 전부 위치값!
			int j = (int)(Math.random()*8)+1;
			arr2[num] = arr[j];   // 값 넣기 
			for(int a=0; a<num; a++) {
				if (arr2[num] == arr2[a]) {
					num--;
					break;
				}
			}

		}
		System.out.print("뽑은 숫자: ");
		for(int i =0; i<arr2.length; i++) {			
			System.out.print(arr2[i]);
		}
	}
}
