package casher;

public class Buyer {
	Product[] cart = new Product[3];
	// 카트 바구니 .. 바구니가 다 차면 새롭게 2배의 크기만큼 생성
	int money = 10000; // 초기 설정 돈 1000
	int bonusPoint = 0; // 포인트는 0원
	int i; // 물건 산 것들과 리스트를 작성하기 위해 필요한 인스턴스

	public void buy(Product p) { // 바이 매서드를 파라미터값으로 조상 프로덕트인 p 설정
		if (money <= p.price) { // 만약에 현재 소지하고 있는 돈이 물건의 가격보다 같거나 적게되면
			System.out.println("잔액이 부족하면 물건을 구매 못해"); // 이렇게 문구 출력
			return; // 더이상 의미 없으므로 리턴으로 종료
		}
		money -= p.price; // 소지금에서 물건의 값을 뺀다
		bonusPoint += p.bonusPoint; // 보너스 포인트 쌓는다.
		System.out.println(p.toString() + "을 구입하셨습니다."); // p인자의 물품 이름을 표시하도록 설정
		add(p); // 물건을 담아주는 함수이다. add(p)형으로 해서 아래의 함수를 적용
	}

	public void add(Product p) { // 물건을 담아주는 함수
		if (i >= cart.length) { //i가 카트 인덱스까지 돌도록 설정 초기 설정 3 
			//만약에 카트인덱스에 담긴 양이 같으면 if문 가동
			Product[] temp = new Product[cart.length * 2];
			//템프라는 새로운 배열을 인스턴스 생성 다만 번지는 cart X2배만큼으로 설정
			System.arraycopy(cart, 0, temp, 0, cart.length);
			//복사해야 할 데이터 원본, 시작인덱스, 복사받을 대상, 시작인덱스, 인덱스 길이
			cart = temp; // 마지막으로 템프에 받은 걸 다시 카트로 다 옮겨담기.(주소 옮겨 담는거다)
		}
		cart[i++] = p; 
		return; //리턴
	}
	
	void summary() { //물건을 인덱스화 한다.
		String itemList = ""; // 아이템 리스트라고 스트링 문자 하나 만들어준다.
		int sum = 0;//사용한 금액을 합산하기위해 선언
		for(int i=0; i<cart.length; i++) { //밖에 선언된 i와는 별개 카트 인덱스만큼 돌린다.
			if(cart[i] == null)  // 만약에 카트주소의 값이 널값이면 빠져 나오게 한다.
				break;
			//1-1. 장바구니에 담긴 물건들의 목록을 만들어 출력!
				itemList += cart[i] + ","; //스트링형 아이템 리스트는 0번지부터 인덱스번지까지
				//1.2 장바구니에 담긴 물건들의 가격을 모두 더해서 출력한다.
				sum += cart[i].price; // 합샘은 카트 0번지부터 담겨져있는 걸 뎃셈한다.
 		}
		//1.3 물건을 사고 남은 금액(money)을 출력한다.
		System.out.println("구입한 물건:" + itemList);
		System.out.println("사용한 금액:" + sum);
		System.out.println("보너스 포인트:" + bonusPoint);
		System.out.println("남은 금액:" + money);
	}
}
