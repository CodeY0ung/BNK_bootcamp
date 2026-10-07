package d1007_inner_class;

class Outer2{
	private int num = 0;
	Member2 m2;
}
// 매우 강한 결합. outer class에서만 사용할거야!! 떼어낼때 지금처럼 잘 안떨어져나가야 제대로 된 내부클래스 설계임.
class Member2{
	String s;
	public Member2(String s) {
		this.s = s;
	}
	
}

public class DevideInnerClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
