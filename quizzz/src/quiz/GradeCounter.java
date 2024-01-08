	package quiz;
	
	import java.util.Scanner;
	
	public class GradeCounter {
	
		public static void main(String[] args) {
			//학생의 점수를 받아 수우미양가를 보여주는 프로그램을 만드세요.
			// 조건. 점수가 -1이면 프로그램을종료
			
			Scanner scanner = new Scanner(System.in);
			boolean run = true;
			while (run) {
				System.out.println("점수를 입력해주세요:");
				
				int score = Integer.parseInt(scanner.nextLine());
			
				if(score >= 90 && score <= 100) {
					System.out.println("수");
				} else if (score >= 80) {
					System.out.println("우");
				} else if (score >= 70) {
					System.out.println("미");
				} else if (score >= 60) {
					System.out.println("양");
				} else if  (score <= 59 && score>=0) {
					System.out.println("가");
				} else if(score == -1) {
					run = false;
					break;
				}
			}
			System.out.println("프로그램 종료");
			scanner.close();
		}	
	}
