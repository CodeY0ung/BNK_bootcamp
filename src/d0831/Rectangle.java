package d0831;

public class Rectangle extends Shape{

	private double width;
	private double height;
	
	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}

	
	
	@Override
	public String toString() {
		return "직사각형의 가로 : "+width+", 세로 : "+height+
				", 면적 : "+getArea();
	}
	
}
