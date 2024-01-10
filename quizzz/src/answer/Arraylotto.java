package answer;

public class Arraylotto {

	public static void main(String[] args) {
 
		int[] ball = new int[45];
		int i, n;
//		int tmp;
		
		for(i=0; i<ball.length; i++) {
			ball[i] = i+1;
		}
		
		for( i=0; i<6; i++) {
			n = (int)(Math.random()*45);
			
//			tmp = ball[i];
			ball[i] = ball[n];
//			ball[n] = tmp;
			
			for(int j=0; j<i; j++) {
				if(ball[i] == ball[j]) {
					i--;
					break;
				}
			}
			
		}
		for( i=0; i<6; i++) {
			
			System.out.println("ball[" + i + "] :" + ball[i]);
		}
		
	}

}
