package d0907;

import java.util.Objects;

public class B {
	
	int n;
	String s;
	
	public B(int n, String s) {
		this.n = n;
		this.s = s;
	}
	
	@Override
	public String toString() {
		
		return "n : "+n+", s : "+s;
	}
	
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
		B ob = (B)o;
		if(n == ob.n) {
			if(s == ob.s);
			return true;
		}
		return false;
	}
	
	// 객체의 주소가 달라도 값이 같으면 정체성을 일치시켜준다.
	@Override
	public int hashCode() {
		return Objects.hash(n,s);
	}

}
