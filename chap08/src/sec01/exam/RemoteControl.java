package sec01.exam;

public interface RemoteControl {
		//상수 필드만 선언 가능
		// 상수 이름은 대문자로 작성 및 서로 다른 단어로 구성 시 언더바로 연결
		public static int MAX_VOLUME = 10;
		int MIN_VOLUME = 0;
		
		//추상 메소드
		void turnOn();
		void turnOff();
		void setVolume(int volume);
}
