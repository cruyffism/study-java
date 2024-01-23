package printer_me;

public class PrinterEx {

	private static void printer(Samsung samsung) {
		samsung.print("자바");
		samsung.print2("자바");
	}
	
	private static void printer(Lg lg) {
		lg.print("자바");
	}

	public static void main(String[] args) {
		printer(new Samsung());
		printer(new Lg());
	}

}
