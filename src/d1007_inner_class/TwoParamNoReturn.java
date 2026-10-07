package d1007_inner_class;

interface Calculate{
	int add(int n1, int n2);
}

public class TwoParamNoReturn {

	public static void main(String[] args) {
		
		Calculate c = new Calculate() {
			@Override
			public int add(int n1, int n2) {
				return n1 + n2;
			}
		};
		
		System.out.println(c.add(1, 2));
		
		c = (a,b) -> {
			return a+b; 
		};
		
		c = (a,b) -> a+b;
	}
	
}
