package quiz;

public class Adult extends Person {
    // 생성자
    public Adult(int age, String name, int hegiht, int weight) {
        // 부모 클래스의 생성자 호출
        super(age, name, hegiht, weight);
    }

 	
    
    public static void main(String[] args) {
        // 생성자를 이용하여 Adult 객체를 생성
        Adult adult = new Adult(30, "홍길동", 175, 99);

        System.out.println("나이: " + adult.age);
        System.out.println("이름: " + adult.name);
        System.out.println("키: " + adult.height);
        System.out.println("몸무게: " + adult.getWeight());
    }
}