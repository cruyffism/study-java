package sec02.exam;

public class OperationEx {

	public static void main(String[] args) {
		//실수 결과를 얻으려면 실수 연산으로 변환이 필요 x,y 둘 중 하나에만 double을 줘도 가능
		int x =1;
		int y =2;
		double result = (double) x / y;
		System.out.println(result);
		
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//byte byteValue3 = byteValue1 + byteValue2;
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유나코드=" + intValue2);
		System.out.println("출력문자=" + (char)intValue2);
		
		int intValue3 = 10;
		int intValue4  = intValue3/4;
		System.out.println(intValue4);
		
		int intValue5 = 10;
		//int intValue6 = 10/4.0;
		double doubleValue = intValue5/4.0;
		System.out.println(doubleValue);
	}

}
