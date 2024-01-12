package quiz;

public class TelevisionEx {
	
	public static void main(String[] args) {
	
		Television tv1 = new Television(7, 9,  true);
		Television tv2 = new Television(9, 12,  true);
		
		System.out.println("나의 텔레비전 채널은 " + tv1.channel + ", " + "볼륨은 " + tv1.volume + ", " + "전원 상태는 " + true);
		System.out.println("너의 텔레비전 채널은 " + tv2.channel + ", " + "볼륨은 " + tv2.volume + ", " + "전원 상태는 " + true);
		
		
		
	}
}
