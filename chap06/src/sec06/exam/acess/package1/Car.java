package sec06.exam.acess.package1;

public class Car {
	//필드
	private int speed;
	private boolean stop;
	//생성자
	
	//메소드
	public int getSpeed() { 
		return speed;
	}
	public void setSpeed(int speed) { 
		if(speed<0) {
			this.speed = 0;
			return;
		}else {
			this.speed = speed;
		}
	}
	
	public boolean isStop( ) {  //getter
		return stop;
	}
	
	public void setStop(boolean stop) { //setter
		this.stop = stop;
		this.speed = 0;
	}
}
