package quiz;

public class LoginSys_Member {
	String id; //아이디
	String password; //비번 
	String name;  //이름 
	int phoneNumber; //전화번호
	
	public String getName() {
		return name;
	}
	
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	public LoginSys_Member (String id, String password){
        this.id = id;
        this.password = password;
	}

	public LoginSys_Member(String id, String password, String name, int phoneNumber) { //생성자
        this.id = id;
        this.password = password;
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
	
	  public void prt() { //이름과 전화번호를 출력하는 메서드
	        System.out.println("Name: " + name);
	        System.out.println("Phone Number: " + phoneNumber);
	    }
	
}
