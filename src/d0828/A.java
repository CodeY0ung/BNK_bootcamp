package d0828;

public class A {
	
	private int n;
	private double d;
	private float f;
	private char c;
	
	private String s;
	private boolean b;
	
	public double getD() {
		return d;
	}
	
	public float getF() {
		return f;
	}
	
	public char getC() {
		return c;
	}
	
	public boolean getB() {
		return b;
	}
	
	public int getN() {
		return n;
	}
	
	public String getS() {
		return s;
	}
	
	
	
	public A() {
		
	}
	
	public A(int n) {
		this.n = n;
	}
	
	public A(String s) {
		this.s = s;
	}
	
	public A(int n, String s) {
		this.n = n;
		this.s = s;
	}
}
