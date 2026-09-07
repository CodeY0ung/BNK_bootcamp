package d0831;

public class A {

	int n;
	double d;
	String s;
	
	public A(int n, double d) {
		this.n = n;
		this.d = d;
	}
	
	public A(int n, double d, String s) {
		this(n,d);
		this.s = s;
	}
}
