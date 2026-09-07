package d0902;

public class StaticA {

	// StaticA로 만들어진 모든 인스턴스가 공유한다.
	static int n;
	
	public static void a() {
		System.out.println("static method a 호출");
		b();
	}
	
	public static void b() {
		System.out.println("static method b 호출");
	}
	
	// this.n 불가능
	// setter 불가능
}
