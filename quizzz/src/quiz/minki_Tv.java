package quiz;

public class minki_Tv {
	String brand;
	int year;
	int inch;
	
	minki_Tv() {
		
	}
	
	minki_Tv(String brand, int year, int inch){
		this.brand = brand;
		this.year = year;
		this.inch = inch;
	}
	
	void show() {
		System.out.println(brand + "에서 만든 " + year + "년형 " + inch + "인치 TV");
	}
}
