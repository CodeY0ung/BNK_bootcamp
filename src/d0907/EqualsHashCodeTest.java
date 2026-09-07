package d0907;

import java.util.HashSet;
import java.util.Set;

public class EqualsHashCodeTest {

	public static void main(String[] args) {
		
		A a = new A();
		A a1 = new A();
		
		B b = new B(1,"AA");
		B b1 = new B(1,"AA");
		B b2 = new B(1,"BB");

		System.out.println(a == a1);
		System.out.println(a.equals(a1));
		System.out.println(b == b1);
		System.out.println(b.equals(b1));
		System.out.println(a.equals(null));
		System.out.println(b.equals(null));
		System.out.println(b.equals(a));
		
		Set<B> setB = new HashSet<>();
		setB.add(b);
		setB.add(b1);
		setB.add(b2);
		setB.add(b2);
		System.out.println(setB.size());
		System.out.println(b.hashCode());
		System.out.println(b1.hashCode());

	}

}
