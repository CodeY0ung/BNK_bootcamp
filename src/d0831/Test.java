package d0831;

public class Test {

	public static void main(String[] args) {
		// 각 도형 넓이
		Square square = new Square(5);
		System.out.println(square.toString());
		
		
		Rectangle oblong = new Rectangle(3,5);
		System.out.println(oblong.toString());
		
		
		Triangle triangle = new Triangle(3,8);
		System.out.println(triangle.toString());
		
		
		Circle circle = new Circle(6);
		System.out.println(circle.toString());
		
	}

}
