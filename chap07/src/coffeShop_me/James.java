package coffeShop_me;

public class James {
	
	//필드
	int total;

	
	//생성자
	public James(int total) {
		this.total = total;
	}
	

	void buy() {
		Paribaguette paribaguette = new Paribaguette(1000, 1500, 2000);
        CoffeeShop coffeeShop = new CoffeeShop(1000, 2000, 3000);
        System.out.println("단팥빵의 가격:" + paribaguette.rb.getPrice());
        System.out.println("크림도넛의 가격:" + paribaguette.cd.getPrice());
        System.out.println("모카빵의 가격:" + paribaguette.mb.getPrice());
        System.out.println("카푸치노의 가격:" + coffeeShop.ca.getPrice());
        System.out.println("아메리카노 가격:" + coffeeShop.a.getPrice());
        System.out.println("카페라떼 가격:" + coffeeShop.c.getPrice());
        int total = paribaguette.rb.getPrice() + paribaguette.cd.getPrice() + paribaguette.mb.getPrice();
        System.out.println("제임스가 먹은 빵의 총 가격은?" + total);
        System.out.println("제임스가 마신 커피의 총 가격은?"+ coffeeShop.ca.getPrice() + coffeeShop.a.getPrice() + coffeeShop.c.getPrice());
	}
}
