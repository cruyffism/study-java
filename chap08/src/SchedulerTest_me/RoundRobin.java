package SchedulerTest_me;

public class RoundRobin implements Scheduler {

	
	void getNextCall() {
		System.out.println("상담 전화를 순서대로 대기열에서 가져옵니다.");
	}

	void sendCalltoAgent() {
		System.out.println("다음 순서 상담원에게 배분합니다.");
	}
}
