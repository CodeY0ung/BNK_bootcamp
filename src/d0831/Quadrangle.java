package d0831;

public class Quadrangle {
	private double width;
	private double height;
	
	public Quadrangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public void set(double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getArea() {
		return width * height;
	}
	
	public double getWidth() {
		return width;
	}
	
	public double getHeight() {
		return height;
	}

}
