package d0909;

enum Person2{
	// 생성자에 파라미터가 있기때문에..
	// 이거 인스턴스니까 생성할때 파라미터를 넣어주는거임.
	MAN(29),WOMAN(32);
	
	int age;
	
	Person2(int age){
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	// enum은 상수라서 setter가 있으면 안됨. 근데 이거는 클래스의 필드라서 가능
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "I am "+age+" years old";
	}
}

public class EnumParamConstructor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(Person2.WOMAN);
		System.out.println(Person2.WOMAN.age);
	}

}
