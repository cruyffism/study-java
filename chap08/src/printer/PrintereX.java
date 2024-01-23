package printer;

public class PrintereX {

	public static void main(String[] args) {
		String doc = "자바 이론 문서";
		SamsungPrint s = new SamsungPrint();
		s.print(doc);
		s.printCMYK(doc);
		System.out.println();
		
		LGPrint l = new LGPrint();
		l.print(doc);
		System.out.println();

	}

}
