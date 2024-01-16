package answer;

public class Card {
	// 필드
	int num;
	boolean chk;    //   true라면 K가 찍히고, false라면 K가 안찍힌다.
	//생성자
	public Card(int num, boolean chk){
		this.num = num;
		// 인스턴스 생성시 입력한 num로 인스턴스 내부의 num필드를 초기화 시켜준다.
		this.chk = chk;
	}
	public String info() {
		String str = "";
		if(chk) {
			str = num + "K";
//			str = String.valueOf(num) + "K";
//			숫자를 문자열로 변환
		}else {
			str = num+"";
//			str = String.valueOf(num);
		}
		return str;
	}



	public static void main(String[] args) {
		Card card1 = new Card(3, false);
		Card card2 = new Card(2, true);

	    System.out.println(card1.info());
	    System.out.println(card2.info());

	}
	
	
}
