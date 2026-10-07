package d1007_inner_class;

interface Singable{
	void sing(String t);
}

public class OneParamNoReturn {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Singable s = new Singable() {
			@Override
			public void sing(String t) {
				System.out.println(t);
			}

		};
		
		s.sing("가요");
		
		s = (t)-> System.out.println(t);
		
		s.sing("동요");
	}

}
