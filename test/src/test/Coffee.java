package test;

public class Coffee extends Beverage {
	private int amount;

	// 수량을 반환하는 메소드
	public int getAmount() {
		return amount;
	}

	// 생성자 메소드
	public Coffee(String name, int amount) {
		super(name); // 부모 클래스의 생성자 호출
		this.amount += amount;
	}

	@Override
	public void calcPrice() { // 추상 인터페이스 구현 메소드
		String name = super.getName();
		setPriceByCoffeeName(name);
	}

	// name에 따라 price 설정하는 메소드
	private void setPriceByCoffeeName(String name) {
		switch (name.toLowerCase()) {
		case "americano":
			setPrice(1500);
			break;

		case "cafelatte":
			setPrice(2500);
			break;

		case "cappuccino":
			setPrice(3000);
			break;
		// 다른 커피 종류에 대한 처리를 추가할 수 있음
		default:
			// 기본 가격 설정 또는 예외 처리 등을 수행할 수 있음
			setPrice(0); // 예시로 0으로 설정
			break;
		}
	}

}
