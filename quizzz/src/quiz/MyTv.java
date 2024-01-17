package quiz;

public class MyTv {
	//클래스 외부에서 접근할 수 없도록 제어자를 붙이고 대신 이 변수들의 값을 어디서나
	//읽고 변경할 수 있도록 getter 메소드와 setter 메소드를 추가해라, 실행클래스는 없음
	private boolean isPowerOn;
	private int channel;
	private int volume;
	
	// Getter and setter methods for isPowerOn
	public boolean isPowerOn() {
		return isPowerOn;
	}
	
	public void setPowerOn(boolean isPowerOn) {
		this.isPowerOn = isPowerOn;
	}
	
	 // Getter and setter methods for channel
	public int getChannel() {
			return channel;
	}
	
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	// Getter and setter methods for volume
	public int getVolume() {
		return volume;
	}
	
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
