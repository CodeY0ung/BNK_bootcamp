package d0903;

import d0902.A;
import d0902.B;

public class InfinityArrayTest {

	public static void main(String[] args) {
		
		
//		GenericInfinityArray<String> stArr = new GenericInfinityArray<>();
//		
//		stArr.add("Hi");
//		stArr.add("to");
//		stArr.add("meet");
//		stArr.add("haha");
//		stArr.add("youu");
//		stArr.insert(1, "nice");
//		stArr.modify(5, "you");
//		stArr.remove(4);
//		stArr.printArray();
//		stArr.removeAll();
//		stArr.printArray();
		
		GenericInfinityArray<Integer> intArr = new GenericInfinityArray<>();
		
		intArr.add(0);
		intArr.add(2);
		intArr.add(3);
		intArr.add(6);
		intArr.add(7);
		intArr.add(5);
		intArr.insert(1, 1);
		intArr.modify(4, 4);
		intArr.remove(5);
		intArr.printArray();
		intArr.removeAll();
		intArr.printArray();
		
		

	}

}
