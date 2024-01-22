package coffeShop_me;

public class CoffeeShop {
	//필드
	Product a;
	Product c;
	Product ca;
	
	//생성자
	public CoffeeShop(int aPrice, int cPrice, int caPrice) {
		this.a = new Americano(aPrice);
		this.c = new Caffelatte(cPrice);
		this.ca = new Capucchino(caPrice);
	}
	

	
}
