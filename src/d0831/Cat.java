package d0831;

public class Cat extends Animal{
	
	public Cat() {
		System.out.println("Cat 생성자 호출");
	}
	
	

	@Override
	public void cry() {
		System.out.println("야옹~");
	}
}
