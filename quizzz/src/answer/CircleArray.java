package answer;

public class CircleArray {

	public static void main(String[] args) {
		Circle[] c = new Circle[5];
		
		for(int i=0; i<c.length; i++)
			c[i] = new Circle(i);
		
		for(int i=0; i<c.length; i++) {
			System.out.print("반지름" + i +"   ");
			System.out.print("원의 넓이 : "+ (int)(c[i].getArea()) + " ");
			System.out.println();
		}

	}

}
