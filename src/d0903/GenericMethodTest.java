package d0903;

public class GenericMethodTest {

	public static void main(String[] args) {

		String[] sentence = {
				"Hi",
				"nice",
				"to",
				"meet",
				"you"
		};
//		System.out.println(ArrayPrinter.getLast(sentence));
		ArrayPrinter.printArr(sentence);
		
		Integer[] nums = {
				0,1,2,3,4
		};
//		System.out.println(ArrayPrinter.getLast(nums));
		ArrayPrinter.printArr(nums);
		
		Boolean[] tf = {
				true,
				false,
				true,
				false,
				true
		};
//		System.out.println(ArrayPrinter.getLast(tf));
		ArrayPrinter.printArr(tf);
		
		Object[] o = {
				new Apple(),
				new Orange(),
				new Watermellon()
		};
		ArrayPrinter.printArr(o);
		
		Student[] students = {
				new Student(0,"호동",88.5),
				new Student(1,"승기",60),
				new Student(2,"수근",75.5),
				new Student(3,"지원",90),
		};
		ArrayPrinter.printArr(students);
		
		Character[] c = {
				'A',
				'B',
				'C',
				'D',
				'E'
		};
		ArrayPrinter.printArr(c);
		
	}
}
