package SchedulerTest_me;

public class PriorityAllocation implements Scheduler {
	
	 void getNextCall() {
		System.out.println("고객의 등급이 높은 고객의 전화를 먼저 가져옵니다.");
	}
	
	 void sendCalltoAgent() {
		System.out.println("업무 skill이 가장 높은 상담원의 대기열에 앞에 우선 배분 합니다.");
	}

}
