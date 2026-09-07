package d0831;

public class Triangle {

	private double width;
	private double height;
	
	public Triangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void set(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width*height/2;
	}
	
	@Override
	public String toString() {
		return "삼각형의 가로 : "+width+", 세로 : "+height+
				", 면적 : "+getArea();
	}
}
