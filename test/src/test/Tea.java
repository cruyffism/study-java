package test;

public class Tea extends Beverage {
	private int amount;

	// 수량을 반환하는 메소드
	public int getAmount() {
		return amount;
	}

	// 생성자 메소드
	public Tea(String name, int amount) {
		super(name); // 부모 클래스의 생성자 호출
		this.amount += amount;
	}

	@Override
	public void calcPrice() { // 추상 인터페이스 구현
		String name = super.getName();
		setPriceByTeaName(name);
	}

	// name에 따라 price 설정하는 메소드
	private void setPriceByTeaName(String name) {
		switch (name.toLowerCase()) {
		case "lemontea":
			setPrice(1500);
			break;

		case "ginsengtea":
			setPrice(2000);
			break;

		case "redginsengtea":
			setPrice(2500);
			break;
		// 다른 티 종류에 대한 처리를 추가할 수 있음
		default:
			// 기본 가격 설정 또는 예외 처리 등을 수행할 수 있음
			setPrice(0); // 예시로 0으로 설정
			break;
		}
	}

}
