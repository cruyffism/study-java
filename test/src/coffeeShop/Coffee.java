package coffeeShop;

public class Coffee extends Beverage {
	static int amount;

	//Coffee 생성자
	public Coffee(String name) {
		super(name);
		// TODO Auto-generated constructor stub
		amount += 1;
	}
	


	//abstract메서드 오버라디으 해서 부모클래스에 price 값 set
	@Override
	void calcPrice() {
		// TODO Auto-generated method stub

		if (super.getName().equals("Americano")) {
			super.setPrice(1500);
		} else if (super.getName().equals("CafeLatte")) {
			super.setPrice(2500);
		} else if (super.getName().equals("Cappuccino")) {
			super.setPrice(3000);
		}
	}

}
