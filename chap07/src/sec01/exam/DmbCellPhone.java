package sec01.exam;

public class DmbCellPhone  extends CellPhone{
	//필드
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel) {
		super();//자식 생성자의 맨 첫 줄에서 부모 생성자가 호출됨
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDumb() {
		System.out.println("채널" + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDumb(int channel) {
		this.channel = channel;
		System.out.println("채널" + channel + "번으로 바굽니다.");
	}
	
	void turnOffDumb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
}


