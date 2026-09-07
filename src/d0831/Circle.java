package d0831;

public class Circle {

	private double r;
	private final double PI = 3.14;
	
	public Circle(double r) {
		this.r = r;
	}
	
	public void setR(double r) {
		this.r = r;
	}
	
	public double getArea() {
		return r*r*PI;
	}
	
	@Override
	public String toString() {
		return "원의 반지름 : "+r+", 면적 : "+getArea();
	}
}
