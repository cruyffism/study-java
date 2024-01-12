package quiz;

import java.util.Scanner;

public class ScoreManagementSystem {

	public static void main(String[] args) {
		String[] student = {"고길동","김길동","이길동", "박길동", "홍길동"};
		String[] subject = {"국어", "영어", "수학"};
		boolean run = true;
		int[] scores = new int[5];
		Scanner scan = new Scanner(System.in);
		
		
		
		while (run) {
			System.out.println("성적관리 프로그램");
			System.out.println("1.성적 입력");
			System.out.println("2.성적 조회");
			System.out.println("3.석차 조회");
			System.out.println("4.프로그램 종료");
			System.out.print("선택> ");
			
			int sel = Integer.parseInt(scan.nextLine());
			
			switch(sel) {
				case 1:
					
					for(int i=0; i<student.length; i++) {
					System.out.println("성적 정보를 입력하세요");
					System.out.println(student[i] + "학생");
					System.out.print("국어 점수: ");
					scores[i] =  Integer.parseInt(scan.nextLine());
					System.out.print("영어 점수: " );
					scores[i] =  Integer.parseInt(scan.nextLine());
					System.out.print("수학 점수: " );
					scores[i] =  Integer.parseInt(scan.nextLine());
				}
					break;
					
				case 2:	
					System.out.println("--성적조회--");
					System.out.println("1.개인별 성적 조회");
					System.out.println("2.과목별 성적 조회");
					System.out.println("3.이전 메뉴 돌아가기");
					System.out.print("선택> ");
					
					int sel2 = Integer.parseInt(scan.nextLine());
					
					if(sel2 == 1) {
						int sum = 0;
						double avg = 0;
						System.out.println("조회할 학생의 이름을 입력하세요.");
						String name = scan.nextLine();
						System.out.println(name +" 학생 성적 정보");
						System.out.println("국어 점수: " + scores[0]);
						System.out.println("영어 점수: " + scores[0]);
						System.out.println("수학 점수: " + scores[0]);
						for(int i =0; i <scores.length; i++) {	
							sum += scores[i]; 
							avg = (double) sum / scores.length;
							System.out.println("총점: " + sum);
							System.out.println("평균: " + avg);
						}
					}
					
					break;
					
			}
		
		}

		
		scan.close();
	}

}
