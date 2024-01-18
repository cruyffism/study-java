package quiz;

public class MonthSchedule {
	private String work; // 하루의 할 일을 나타내는 문자열

	public void setWork(String work) {
		this.work = work;
	}

	public String getWork() {
		return work;
	} // getter

	public void show() {
		if (work == null) {
			System.out.println("없습니다.");
		} else {
			System.out.println(work + "입니다.");
		}
	}
}
