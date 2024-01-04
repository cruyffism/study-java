package sec02.exam;

public class ByteOperationExample {

	public static void main(String[] args) {
		// 산술 연산식에서 피연산자로 사용되면 int 타입보다 작은 byte, short 타입의 변수는 자동 타입 변환되어 연산을 수행
		byte result1 = 10 + 20;
		System.out.println(result1);
		
		byte x = 10;
		byte y = 20;
		int result2 = x + y;
		System.out.println(result2);
		
		byte value1 = 10;
		int value2 = 100;
		long value3 = 1000L;
		long result = value1 + value2 + value3;
		System.out.println(result);
		
		//다른 타입 연산이 필요한 경우 먼저 강제 변환 뒤 연산 수행
		int intValue = 10;
		double doubleValue = 5.5;
		int result3 = intValue + (int) doubleValue; //result3에 15가 저장됨
		System.out.println(result3);
		
		
	}

}
