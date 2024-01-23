package printer;

public class LGPrint implements Printer {
	@Override
	public void print(String doc) {
		System.out.println("LG 프린터");
		System.out.println(doc + "를 입쇄합니다.");
	}
}
