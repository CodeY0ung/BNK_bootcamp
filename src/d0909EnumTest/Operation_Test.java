package d0909EnumTest;

public class Operation_Test {

	public static void main(String[] args) {

		Operation op = Operation.PLUS;
		System.out.println(op.calculate(10, 20));
		
		op = Operation.MINUS;
		System.out.println(op.calculate(10, 20));
	}

}
