package Scheduler;

//import java.io.IOException;

import java.util.Scanner;

public class SchedulerTest {

	public static void main(String[] args)  {
		// R, L , P
		System.out.println("전화 상담 배분방식을 선택하세요 ");
		System.out.println("R : 한명씩 차례로 할당");
		System.out.println("L : 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P : 우선순위가 높은 고객 먼저 할당");
		
		Scanner scan = new Scanner(System.in);
		
		String ch = scan.next();

		Scheduler scheduler = null;
		
		if( ch.equals("R") || ch.equals("r")) { // 입력받은 값이 R 또는 r이면 
			scheduler = new RoundRobin(); // RoundRobin클래스 생성
		} else if( ch.equals("L") || ch.equals("l")) { // 입력받은 값이 L 또는 l이면
			scheduler = new LeastJob(); // LeastJob 클래스 생성
		} else if (ch.equals("P") || ch.equals("p")) { // 입력받은 값이 P 또는 p이면
			scheduler = new PriorityAllocation(); // PriorityAllocation 클래스 생성
		} else {
			System.out.println("지원하지 않는 기능입니다.");
		}
		scheduler.getNextCall();         // 어떤 정책인가 상관없이 
		scheduler.sendCallToAgent(); // 인터페이스에 선언한 메서드 호출
		
		scan.close();
		
	}

}
