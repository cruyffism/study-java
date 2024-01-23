package printer_me;

public class Lg implements Printer {

	@Override
	public void print(String doc) {
		System.out.println("LG 프린터"); 
		System.out.println(doc +" 이론 문서를 인쇄합니다."); 
		
	}
}
