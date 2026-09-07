package d0902;

public class StudentStaticTest {

	public static void main(String[] args) {
		
		Student st = new Student("영희");
		Student st1 = new Student("철수");
		Student st2 = new Student("철수");
		
		System.out.println(st2.getStNum());

	}

}
