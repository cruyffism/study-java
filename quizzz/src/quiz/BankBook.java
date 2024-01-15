package quiz;

public class BankBook {
	
	int money = 0;
	
	int deposit(int money_in) {
		this.money += money_in;
		return money;
	}
	
	int withdraw(int money_out) {
		this.money -= money_out;
		return money;
	}
	
	void showMoney() {
		System.out.println("현재 잔액은:");
	}
}
