package d0831;

public class Dog extends Animal{
	
	public Dog() {
		System.out.println("Dog 생성자 호출");
	}
	
	

	@Override
	public void cry() {
		System.out.println("멍멍~");
	}
}
