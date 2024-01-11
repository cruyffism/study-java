package quiz;


public class Arraylotto {
	
    public static void main(String[] args) {
    	//중복값 제거 필요 
    	
        int[] lotto = new int[45];
        
        for(int i = 0; i < 6; i++){
            lotto[i] =(int) (Math.random() * 45)+1;
            System.out.println("ball[" + i + "] :" + lotto[i]);
			for(int j=0; j<i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
    
        }
    }
}
