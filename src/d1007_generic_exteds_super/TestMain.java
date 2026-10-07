package d1007_generic_exteds_super;

import java.util.ArrayList;
import java.util.List;

public class TestMain {

	public static void main(String[] args) {

		//Animal 또는 Animal의 자식 타입이 저장된 리스트
		List<? extends Animal> ani = new ArrayList<>();
		
		//삽입 불가능
//		ani.add(new Dog());
//		ani.add(new Animal());
//		ani.add(new Cat());
		
		//반환은 가능
		Animal x = ani.get(0);
		
		// 매개변수에 정의하면 매개변수로 여러가지 타입을 받을 수 있다.
		
		//최소 Animal 타입이니까 최대 Object 타입임. Animal부터 부모까지 다 들어가진다.
		List<? super Animal> ani2 = new ArrayList<>();
		ani2.add(new Animal());
		ani2.add(new Dog());
		ani2.add(new Cat());
		
		Object x2 = ani2.get(0);
		
		//매개변수에 <? extends T> : 메서드가 매개변수로 받은 데이터를 get해서 풀어내는 역할을 한다. 부모 타입으로 get 할 수 있음.
		//매개변수에 <? super T> : 메서드가 매개변수로 받은 데이터에 add를 해서 반환하는 역할을 한다. get 할 수 있는데, object로 get 해서 형변환 해야해서 잘 안씀.
		
		List<Animal> al = new ArrayList<>();
		al.add(new Animal());
		al.add(new Dog());
		al.add(new Cat());
		
		bark(al);
		
	}

	static void bark(List<? extends Animal> a) {
		for(Animal ani : a) {
			ani.bark();
		}
	}
}
