package d1007_inner_class;

class Outter{
	private int num = 0;
	
	class Member{
		String s;
		Member(String s){
			this.s = s;
		}
		
		void add(int n) {
			num+=n;
		}
		
		int get() {
			return num;
		}
	}
}
public class MemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Outter o1 = new Outter();
		Outter.Member o1m1 = o1.new Member("aaa");
		
		o1m1.add(10);
		System.out.println(o1m1.get());
		System.out.println(o1m1.s);
		
//		외부 클래스를 먼저 선언하고 외부클래스.new 내부클래스로 정의한다.
		Outter o2 = new Outter();
		Outter.Member o2m2 = o2.new Member("bbb");
		
		o2m2.add(5);
		System.out.println(o2m2.get());
		System.out.println(o2m2.s);

	}

}
