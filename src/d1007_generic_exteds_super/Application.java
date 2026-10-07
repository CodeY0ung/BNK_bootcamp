package d1007_generic_exteds_super;

import java.util.ArrayList;
import java.util.List;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Animal> al = new ArrayList<>();
		al.add(new Animal());
		al.add(new Dog());
		al.add(new Cat());
		
		bark(al);
		
		addBark(al);
		
		bark(al);
		
		List<Dog> dl = new ArrayList<>();
		dl.add(new Dog());
		dl.add(new Dog());
		dl.add(new Dog());
		
		List<Cat> cl = new ArrayList<>();
		cl.add(new Cat());
		cl.add(new Cat());
		cl.add(new Cat());
		
		bark(dl);
//		addBark(dl);
		bark(cl);
//		addBark(cl);
	}
	
//	매개변수로 Animal과 Animal의 자손들은 다 들어올 수 있다. List<Animal>을 매개변수로 받으면 List<Dog>,List<Cat>을 매개변수로 받을 수 없음. List<Animal>만 매개변수로 받을 수 있음. 
	static void bark(List<? extends Animal> a) {
		for(Animal ani : a) {
			ani.bark();
		}
		System.out.println("------------");
	}
	
//	add는 가장 안전한 Animal부터 가능함. Animal의 조상은 메서드 안에서 못넣음. 매개변수가 Animal타입일 수 있기 때문. 매개변수는 최소 animal형.
	static void addBark(List<? super Animal> a) {
		a.add(new Dog());
		a.add(new Cat());
		a.add(new Animal());
	}

}
