package d0831;

public class Square {

	private double side;
	
	public Square(double side) {
		this.side = side;
	}
	
	public void setSide(double side) {
		this.side = side;
	}
	
	public double getArea() {
		return side*side;
	}
	
	@Override
	public String toString() {
		return "정사각형의 한 변 : "+side+", 면적 : "+getArea();
	}
}
