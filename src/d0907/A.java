package d0907;

public class A {
	
	int n;
	String s;
	
	public A() {
		n = 1;
		s = "AA";
	}
	
	@Override
	public String toString() {
		return "n : "+n+", s : "+s;
	}
	
	// 동일한 타입의 두 인스턴스를 비교해야함
	// null도 들어올 수 있음
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		
		// 매개변수에 null이거나, 다른 타입 class
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		
		// 같은 타입
		A oa = (A)o;
		if(n == oa.n) {
			if(s == oa.s);
			return true;
		}
		
		return false;
	}
}
