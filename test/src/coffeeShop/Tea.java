package coffeeShop;

public class Tea extends Beverage {
	//맴버변수
	static int amount;
	
	//Tea 생성자
	public Tea(String name) {
		super(name);
		amount += 1;
		// TODO Auto-generated constructor stub
	}

	//abstract메서드 오버라디으 해서 부모클래스에 price 값 set
	@Override
	void calcPrice() {
		// TODO Auto-generated method stub
		if (super.getName().equals("lemonTea")) {
			super.setPrice(1500);
		} else if (super.getName().equals("ginsengTea")) {
			super.setPrice(2500);
		} else if (super.getName().equals("redginsengTea")) {
			super.setPrice(3000);
		}
	}
}
