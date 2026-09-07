package d0831;

public abstract class Animal {
	
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public Animal() {
		System.out.println("Animal 생성자 호출");
	}
	
	public abstract void cry();

}
