package casher;

public class CasherDesk {
	public static void main(String[] args) {
//		Product a = new Tv();
//		casher.buy(a);
		
		Buyer casher = new Buyer();
		casher.buy(new Audio());
		casher.buy(new Tv());
		casher.buy(new Computer());
		casher.buy(new Tv());
		casher.buy(new Audio());
		casher.buy(new PlayStation());
		casher.buy(new Computer());
		casher.summary();
	}
}
