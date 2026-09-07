package d0831;

public class Child extends Parent{
	
	String lastName;
	String firstName;
	
	public String toString() {
		return "이 사람의 성은 "+super.lastName+"이고, 이름은 "+firstName+"입니다.";
	}
}
