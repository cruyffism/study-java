package test;

public class Coffee extends Beverage {
    int amount;

    // 생성자에서 name을 받아와서 price 설정
    public Coffee(String name, int amount) {
        super(name); // 부모 클래스의 생성자 호출
        setPriceByCoffeeName(name);
        accumulateAmount(amount);
    }

    // name에 따라 price 설정하는 메소드
    private void setPriceByCoffeeName(String name) {
        switch (name.toLowerCase()) {
            case "Americano":
                setPrice(1500);
                break;
                
            case "Cafelatte":
                setPrice(2500);
                break;
                
            case "Cappuccino":
            	setPrice(3000);
            // 다른 커피 종류에 대한 처리를 추가할 수 있음
            default:
                // 기본 가격 설정 또는 예외 처리 등을 수행할 수 있음
                setPrice(0); // 예시로 0으로 설정
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
