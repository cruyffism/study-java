package sec02.exam;

public class BreakOutterEx {

	public static void main(String[] args) throws Exception {
		
		//레이블 입력 시 감싸는 for까지 종료
		Outter:
		for(char upper ='A'; upper<='Z'; upper++) {
			for(char lower = 'a'; lower<='z'; lower++) {
				System.out.println(upper + "-" + lower);
				if(lower=='h') {
					break Outter;
				}
			}
		}
		System.out.println("프로그램 실행 종료");
			
	}

}
