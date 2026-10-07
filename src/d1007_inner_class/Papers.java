package d1007_inner_class;

public class Papers {

	private String con;
	
	public Papers(String con) {
		this.con = con;
	}
	
	public Printable getPrinter() {
//		메서드 안에 클래스를 숨긴다
//		class Printer implements Printable{
//			@Override
//			public void print() {
//				System.out.println(con);
//			}
//		}
		
//		익명 클래스.. 인터페이스라 new가 안되는데 이렇게하면 class따로 안 만들고 구현 가능함.
		return new Printable() {
			@Override
			public void print() {
				System.out.println(con);
			}
		};
	}
	
//	static이 아니라서 inner member class라고 부른다.
//	private class Printer implements Printable{
//		
//		@Override
//		public void print() {
//			System.out.println(con);
//		}
//	}
}
