package quiz;

public class Song {
	
		//노래 한 곡을 나타내는 song 클래스를 작성해라 
		// 또한 song 클래스에 다음 생성자와 메소드를 만드세요.
		// 생성자 2개: 기본 생성자와 매개변수로 모든 필드를 초기화하는 생성자
		//노래 정보를 출력하는 show() 메소드
		
	private String title; 
	private String artist; 
	private int year;
	private String country; 
	
	Song() {
		this("title", "artist", 0000, "country");
	}
	
	Song(String title, String artist, int year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
		
	}
	
	void show() {
		System.out.println(year + "년 " + country + " 국적의 " + artist + "가 부른 " + title);
	}

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen", "아바", 1978, "스웨덴");
		song.show();
	}
	
}
