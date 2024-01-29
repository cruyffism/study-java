package coffeeShop;

import java.util.Scanner;

public class CoffeShop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("****java nara CoffeeShop영업개시****");
		System.out.print("몇잔을 주문하시겠습니까? ");
		int cup = Integer.parseInt(scan.nextLine());
		
		Beverage[] beverage = new Beverage[cup];
		System.out.println("총 " + cup + "잔의 주문 음료를 선택하세요.");
		System.out.println("1. Americano");
		System.out.println("2. CafeLatte");
		System.out.println("3. Cappuccino");
		System.out.println("4. lemonTea");
		System.out.println("5. ginsengTea");
		System.out.println("6. redginsengTea");
		for(int i = 0; i < beverage.length; i++) {
			System.out.println("주문>>");
			int menu = Integer.parseInt(scan.nextLine());
			switch(menu) {
			case 1: beverage[i] = new Coffee("Americano");
					System.out.println("Americano"); break;
			case 2: beverage[i] = new Coffee("CafeLatte");
					System.out.println("CafeLatte"); break;
			case 3: beverage[i] = new Coffee("Cappuccino");
					System.out.println("Cappuccino"); break;
			case 4: beverage[i] = new Tea("lemonTea");
					System.out.println("lemonTea"); break;
			case 5: beverage[i] = new Tea("ginsengTea");
					System.out.println("ginsengTea"); break;
			case 6: beverage[i] = new Tea("redginsengTea");
					System.out.println("redginsengTea"); break;
			default: 
				System.out.println("잘못 입력하셨습니다.");
				System.out.println("다시 주문 하세요.");
				i = -1;	}
		}
		
		getSalesInfo(beverage);
		System.out.println("총 판매 금액==>" + getTotalPrice(beverage));
		System.out.println("Coffe의 판매 개수=>" + Coffee.amount + "잔");
		System.out.println("Tea의 판매 개수=>" + Tea.amount + "잔");
	}

	 // 결과와 같이 가격을 구하고 판매정보를 출력할 수 있도록 getSalesInfo메소드를 작성하세요
	//음료정보 출력
	static void getSalesInfo(Beverage[] beverage) {
		
		for (int i = 0; i < beverage.length; i++) {
			beverage[i].calcPrice();
			//beverage[i].print(i + 1);
			beverage[i].print(i+1);
		}
	}
            // 결과와 같이 총 판매금액을 구할 수 있도록 getTotalPrice메소드를 작성하세요.
	//총 판매 금액 
	static int getTotalPrice(Beverage[] beverages) {
		int sum = 0;
		for (int i = 0; i < beverages.length; i++) {
			sum += beverages[i].getPrice();
		}
		return sum;
	}
	
}