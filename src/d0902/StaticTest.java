package d0902;

public class StaticTest {

	public static void main(String[] args) {
		
//		StaticA.n = 10;
//		
//		System.out.println(StaticA.n);
//		
//		StaticA.a();
//		
//		StaticA sa1 = new StaticA();
//		StaticA sa2 = new StaticA();
//		StaticA sa3 = new StaticA();
//		
//		System.out.println(sa1.n);
//		System.out.println(sa2.n);
//		System.out.println(sa3.n);
		
		Human h0 = new Human("철수");
		Human h1 = new Human("영희");
		
		System.out.println("만든 인간 숫자 : "+Human.getNum());
		

	}

}
