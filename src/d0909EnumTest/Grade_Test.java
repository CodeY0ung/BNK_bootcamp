package d0909EnumTest;

public class Grade_Test {

	public static void main(String[] args) {

		int price = 10000;
		
		int result = Grade.SILVER.calcPrice(price);
		System.out.println(result);
	}

}
