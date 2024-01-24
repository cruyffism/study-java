package SchedulerTest_me;

import java.util.Scanner;

public class SchedulerEx {
	
	static Scanner scan = new Scanner(System.in);

	public static void select() {
		RoundRobin roundRobin = new RoundRobin();
		LeastJob leastJob = new LeastJob();
		PriorityAllocation priorityAllocation = new PriorityAllocation();
		
		System.out.println("전화 상담 배분방식을 선택하세요.");
		System.out.println("R: 한명씩 차례로 할당");
		System.out.println("L: 쉬고 있거나 대기가 가장 적은 상담원에게 할당");
		System.out.println("P: 우선 순위가 높은 고객 먼저 할당.");
		
		String answer = scan.nextLine();
		
		if(answer.equals("R")||answer.equals("r")) {
			roundRobin.getNextCall();
			roundRobin.sendCalltoAgent();
		} else if(answer.equals("L")||answer.equals("l")) {
			leastJob.getNextCall();
			leastJob.sendCalltoAgent();
		} else if(answer.equals("P")||answer.equals("p")) {
			priorityAllocation.getNextCall();
			priorityAllocation.sendCalltoAgent();
		} else {
			System.out.println("다시 입력하세요.");
		}
		
	}
	
	public static void main(String[] args) {
		select();
	}
}
