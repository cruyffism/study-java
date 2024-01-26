package test;

public class Tea extends Beverage {
	int amount;
	
	// 생성자에서 name을 받아와서 price 설정
	public Tea(String name, int amount) {
		super(name); //부모 클래스의 생성자 호출
		setPriceByTeaName(name);
		accumulateAmount(amount);
	}
	
	// name에 따라 price 설정하는 메소드
	 private void setPriceByTeaName(String name) {
		 switch(name.toLowerCase()) {
		 case "LemonTea":
			 setPrice(1500);
			 break;
			 
		 case "GinsengTea":
			 setPrice(2000);
			 break;
			 
		 case "RedginsengTea":
			 setPrice(2500);
			 break;
		 }
	 }
	 
	// 수량을 누적하는 메소드
	    private void accumulateAmount(int amount) {
	        this.amount += amount;
	    }

	    // 수량을 반환하는 메소드
	    public int getAmount() {
	        return amount;
	    }
}
