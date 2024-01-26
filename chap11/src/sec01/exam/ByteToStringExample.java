package sec01.exam;

public class ByteToStringExample {

	public static void main(String[] args) {
//		byte[] bytes = {72, 101, 108, 108, 111, 32, 74, 97, 118, 97};
		byte[] bytes = {73, 32, 108, 111, 118, 101, 32, 121, 111, 117};
		
		String str1 = new String(bytes);
		System.out.println(str1);
		
		String str2 = new String(bytes, 6, 4); //6부터 시작해서 4개!
		System.out.println(str2);

	}

}
