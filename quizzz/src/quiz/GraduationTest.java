package quiz;

import java.util.Scanner;  // ctrl + shift + O

public class GraduationTest {

	public static void main(String[] args) throws Exception {
		//졸업하려면 최소 140점 and 전공 70점 이상 and (교양과 일반은 각각 30점 이상 or 두 과목 합계가 80학점 이상)이어야 한다
		// 세개의 학점을 입력받아서 졸업 여부를 출력!
		
		Scanner scan = new Scanner(System.in);
		
	    System.out.print("전공 이수 학점: ");		
	    int major = scan.nextInt();
	    System.out.print("교양 이수 학점: ");		
	    int sub = scan.nextInt();
	    System.out.print("일반 이수 학점: ");		
	    int common = scan.nextInt();
	    
	    if(major + sub + common >= 140 && major >= 70 && ((sub>=30 && common>=30) || sub + common >= 80)) {
	    	System.out.println("졸업가능");
	    } else {
	    	System.out.println("졸업불가");
	    }
	    
	    scan.close();

	}

}
