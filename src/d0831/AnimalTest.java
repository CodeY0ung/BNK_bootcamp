package d0831;

public class AnimalTest {

	public static void main(String[] args) {
		
		Dog dog = new Dog();
		
		Cat cat = new Cat();
		
		Tiger tiger = new Tiger();
		
		Animal[] animals = new Animal[] {
				new Dog(),
				new Cat(),
				new Tiger()
		};
		
		for(Animal animal : animals) {
			animal.cry();
		}
		
		tiger.setName("호랑이");
		System.out.println(tiger.getName());
		
	

	}

}
