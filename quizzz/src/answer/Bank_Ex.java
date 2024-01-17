package answer;

public class Bank_Ex {

	public static void main(String[] args) {
		//은행 예금 예제를 메서드로 만들어 봅시다.
		Bank user = new Bank();
		int balance = 0; //잔액
		boolean run = true;

		System.out.println("안녕하세요 G BANK입니다.");

		while(run) {
			int selectNum = user.menu();
			switch(selectNum) {
			case 1:
				balance = user.deposit(balance);
				break;
			case 2:
				balance = user.withdraw(balance);
				break;
			case 3:
				user.check(balance);
				break;
			case 4:
				run = user.exit();
				break;
			default :
				user.error();
			}
		}

	}

}
