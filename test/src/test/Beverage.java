package test;

public abstract class Beverage {
    private String name; // private으로 변경하여 get과 set만 접근 가능하게..
    private int price;   // private으로 변경하여 get과 set만 접근 가능하게..
    
    // Getter 메소드 and Setter 메소드
    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    //생성자 메소드
    public Beverage(String name) {
        this.name = name;
    }

    public abstract void calcPrice(); //이 코드는 추상 메소드로, 이 메소드를 포함하는 클래스가 추상 클래스일 것이며, 이 클래스를 상속받는 하위 클래스에서 calcPrice 메소드를 구현해야함

    public void print() { // 여기에 출력 로직을 추가

    }
}