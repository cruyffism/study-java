package coffeeShop;

public abstract class Beverage {
	// 맴버변수
	private String name;
	private int price;

	// Beverage 생성자
	public Beverage(String name) {
		this.name = name;
	}

	// getter setter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	// abstract 메서드
	abstract void calcPrice();

	// 출력메서드
	public void print(int i) {
		System.out.println(i + "번째 판매 음료는" + name + "이며,가격은 " + price);
	}
}