package quiz;

public class NewMember {
	//NewMember클래서를 수정하여 
	//생성자에서 name 필드와 age 필드, id필드를 외부에서 받은 값으로 초기화 할 수 있도록 하고
	//NewMemberEx 클래스를 작성해 보시오.
	
	//필드
	String name;
	String id;
	String Password = "****";
	int age;
	
	//생성자 (초기화는 name,age,id만 하라고 했기에 pw는 따로 하지 않는다!)
	NewMember(String name, int age,  String id){
		this.name = name;
		this.age = age;
		this.id = id;
	}
	
}
