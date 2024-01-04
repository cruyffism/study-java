package sec02.exam;

public class StringConversionEx {

	public static void main(String[] args) {
		//String타입을 기본타입으로 변경할때
		int value1 = Integer.parseInt("10");
		double value2 = Double.parseDouble("3.14");
		boolean value3 = Boolean.parseBoolean("true");
		
		System.out.println("value1: " + value1);
		System.out.println("value2: " + value2);
		System.out.println("value3: " + value3);
		
//		String str = "1a";
//		int value = Integer.parseInt(str);
		
		//기본타입을 String타입으로 변경할때
		
		String str1 = String.valueOf(10);
		String str2 = String.valueOf(3.14);
		String str3 = String.valueOf(true);
		
		System.out.println("str1: " + str1);
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
	}

}
