package quiz;


public class Arraylotto {
	
	public static void main(String[] args) {
        int[] lotto = new int[45];
        for (int i = 0; i < 6; i++) {
            lotto[i] = (int) (Math.random() * 45) + 1;
            for (int j = 0; j < i; j++) {
                if (lotto[i] == lotto[j]) { // 값이 같으면
                    i--;                    // 중복제거: -i를 해서 i번 인덱스에서 i-1번 인덱스로 가게끔 리셋 후 다시 바깥 for문에 의해 i번 인덱스로가게 한다
                    break;
                }
            }
        }
        for (int i = 0; i < 6; i++) {  // 위에서 값 도출 후 로또 번호 6개 출력 
            System.out.println(lotto[i] + " ");
        }
    }
}