package quiz;

public class Circle {

	public static void main(String[] args) {
		int[] Circle_arr = new int[5];
		radius(Circle_arr);
	}

	
	 public static int radius(int r[]) {
		 int width = 0;
		 for(int i=0; i<r.length; i++) {
			  width = (int)3.14 * r[i] * r[i];
			 System.out.println(width);
			 System.out.println("반지름 " + r[i] + " 원의 넓이: " + width);
		 }
		 return width;
	 }	

}
