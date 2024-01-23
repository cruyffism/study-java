package printer_me;

public class Samsung implements Printer, ColorPrintabl {

	@Override
	public void print(String doc) {
		System.out.println("삼성 프린터"); 
		System.out.println(doc +" 이론 문서를 인쇄합니다."); 
	}
	
	public void print2(String doc) {
		System.out.println("삼성 프린터"); 
		System.out.println("컬러로 "+ doc +" 이론 문서를 인쇄합니다.");
	}
}
