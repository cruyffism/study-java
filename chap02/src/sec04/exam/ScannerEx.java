package sec04.exam;

import java.util.Scanner;

public class ScannerEx {
	// scanner 한글 출력 오류 시 
	// Scanner scanner = new Scanner(System.in, "EUC-KR")
	//					or
	// Scanner scanner = new Scanner(System.in, "UTF-8")
	

	public static void main(String[] args) throws Exception {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열: \"" +  inputData + "\"");
			if(inputData.equals("q")) {
				break;
			}
			
		}
		System.out.println("종료");
		scanner.close();
	}

}
