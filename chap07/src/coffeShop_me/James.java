package coffeShop_me;

public class James {
	
	//필드
	int total;

	
	//생성자
	public James(int total) {
		this.total = total;
	}
	

	void buy() {
        System.out.println("제임스가 먹은 빵의 총 가격은?" + total);
	}
}
