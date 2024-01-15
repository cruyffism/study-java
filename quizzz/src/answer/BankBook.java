package answer;

public class BankBook {
	int money;
	
	int deposit(int money_in) {
		this.money += money_in;
		return money_in;
	}
	int withdraw(int money_out) {
		// 현재 잔액보다 적은 금액만 출금
		if (this.money <= money_out) {
			System.out.println("금액이 부족합니다.");
		}
		this.money -= money_out;
		return money_out;
	}
	void showMoney() {
		System.out.println
		("현재 잔액은 : " + this.money + " ");
	}

}
