package sec01.exam;

public class StringConvertEx {
	public static void main(String[] args) {
		String strData1 = "200";
		int intData1 = Integer.parseInt(strData1);
		System.out.println(intData1);
		
		int intData2 = 150;
		String strData2 = String.valueOf(intData2);
		System.out.println(strData2);
	}
}
