package d1007_inner_class;

//	class 안에 class를 정의할 수 있다.

class Outer {
	private static int num = 0;
	
//	class 안에 class를 정의할 수 있다.
	static class Nested1{
		void add(int n) {
			num += n;
		}
	}
	
	static class Nested2{
		int get() {
			return num;
		}
	}
}

//public class는 파일당 하나만 있어야한다. public 붙은 class가 주인임
public class StaticNested {

	Outer.Nested1 n1 = new Outer.Nested1();

}
