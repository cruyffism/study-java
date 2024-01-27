package test;

import java.util.Scanner;

public class CoffeeShop {

	static Scanner scan = new Scanner(System.in);
	static Beverage[] beverages = new Beverage[6]; // 최대 6잔의 주문을 받도록 설정
	static int orderCount = 0;

	public static void main(String[] args) {
		System.out.println("****java nara CoffeeShop영업개시****");
		System.out.println("몇 잔을 주문하시겠습니까?");
		orderCount = Integer.parseInt(scan.nextLine());
		System.out.println("총" + orderCount + "잔의 주문 음료를 선택하세요.");
		System.out.println("1. Americano");
		System.out.println("2. Cafelatte");
		System.out.println("3. Cappuccino");
		System.out.println("4. LemonTea");
		System.out.println("5. GinsengTea");
		System.out.println("6. RedginsengTea");

		// 최대 6잔까지 주문을 받음
		for (int i = 0; i < orderCount; i++) {
			System.out.println("주문>>");
			int choice = Integer.parseInt(scan.nextLine());

			// 선택된 음료를 배열에 저장
			switch (choice) {
			case 1:
				beverages[i] = new Coffee("Americano", 1);
				break;
			case 2:
				beverages[i] = new Coffee("Cafelatte", 1);
				break;
			case 3:
				beverages[i] = new Coffee("Cappuccino", 1);
				break;
			case 4:
				beverages[i] = new Tea("LemonTea", 1);
				break;
			case 5:
				beverages[i] = new Tea("GinsengTea", 1);
				break;
			case 6:
				beverages[i] = new Tea("RedginsengTea", 1);
				break;
			default:
				System.out.println("잘못된 선택입니다. 다시 선택하세요.");
				i--; // 잘못된 선택이므로 i를 감소시켜 다시 반복
			}

			beverages[i].calcPrice();
			System.out.println(beverages[i].getName());
		}
		getSalesInfo();
		getTotalPrice();
	}

	public static void getSalesInfo() {
		// 주문된 음료 출력
		for (int i = 0; i < beverages.length; i++) {
			if (beverages[i] != null) {
				System.out.println(
						(i + 1) + "번째 판매 음료는 " + beverages[i].getName() + "이며, 가격은 " + beverages[i].getPrice());
			}
		}
	}

	public static void getTotalPrice() {
		int totalPrice = 0;
		int coffeeAmount = 0; 
		int teaAmount = 0; 
		for (int i = 0; i < orderCount; i++) {
			totalPrice += beverages[i].getPrice();
		}
		System.out.println("총 판매 금액 ==> " + totalPrice);
		  for (Beverage beverage : beverages) {
	            if (beverage instanceof Coffee) {
	            	coffeeAmount += ((Coffee) beverage).getAmount();
	            } else if (beverage instanceof Tea) {
	            	teaAmount += ((Tea) beverage).getAmount();
	            }
	        }
		System.out.println("Coffee의 판매 개수 => " + coffeeAmount +"잔");
		System.out.println("Tea의 판매 개수 => " + teaAmount + "잔");
	}
}