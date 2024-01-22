package scheduler_me;

public class Event {
	// OneDay/Duration/Deadlined Event의 공통 멤버를
	//관리하는 상위 클래스 
		public String title;
		public Event(String title) {
			this.title = title;
		}
}
