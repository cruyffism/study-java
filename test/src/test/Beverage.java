package test;

public abstract class Beverage {
    private String name; // private으로 변경하여 접근 제한
    private int price;   // private으로 변경하여 접근 제한

    public Beverage(String name) {
        this.name = name;
    }

    // Setter 메소드
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    // Getter 메소드
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    void calcPrice() {
        // 여기에 가격 계산 로직을 추가
    }

    void print() {
        // 여기에 출력 로직을 추가
    }
}