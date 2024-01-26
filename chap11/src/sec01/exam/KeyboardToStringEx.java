package sec01.exam;

import java.io.IOException;

public class KeyboardToStringEx {

	public static void main(String[] args) throws IOException {
		byte[] bytes = new byte[100];
		
		System.out.println("입력");
		int readByteNo = System.in.read(bytes);
		
		String str = new String(bytes, 0, readByteNo-2); //길이에 대해 -2를 하고 있는데 이는 엔터값을 빼고 순수하게 결과를 출력하기 위해서이다.
		System.out.println(str);
 
	}

}
