package coffeShop_me;

public class Buy {
	public static void main(int args) {
    	Paribaguette paribaguette = new Paribaguette(1000, 1500, 2000);
    	CoffeeShop coffeeShop = new CoffeeShop(1000, 2000, 3000);
//    	James james = new James(4500);
    	
		System.out.println("단팥빵의 가격:" + paribaguette.rb );
		System.out.println("크림도넛의 가격:" + paribaguette.cd );
		System.out.println("모카빵의 가격:" + paribaguette.mb );
		System.out.println("카푸치노의 가격:" + coffeeShop.ca );
		System.out.println("아메리카노의 가격:" + coffeeShop.a );
		System.out.println("카페라떼의 가격:" + coffeeShop.c );
    	
    }
}