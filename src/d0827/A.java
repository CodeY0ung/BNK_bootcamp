package d0827;

public class A {
	
	
	public int n;
	
	// n값 출력 함수
	public void printN() {
		System.out.println("해당 객체의 n값 : " + n);
	}
	
	
	// setter
	public void setN(int n) {
		this.n = n;
	}
	
	// getter
	public int getN() {
		return n;
	}
	
	// 생성자
	public A() {
		System.out.println("A 생성자");
	}
}
