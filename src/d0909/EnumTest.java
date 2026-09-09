package d0909;

enum Human{
	// enum(열거형)의 값(MAN,WOMAN)은 Human 타입(자료형)의 인스턴스이다.
	// enum은 클래스이므로 생성자가 존재한다. 직접 기술하지 않으면 기본생성자가 삽입된다.
	// enum의 생성자는 private으로 선언되어 new를 통한 직접 인스턴스 생성이 불가하다.
	
	// ; 붙이면 class처럼 사용 가능.
	MAN, WOMEN;
	
	Human(){
		System.out.println("Human 생성자 호출");
	}
	
	@Override
	public String toString() {
		return "I am a human";
	}
}

public class EnumTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// man, woman이 human의 인스턴스임..
		System.out.println(Human.MAN);
//		System.out.println(Human.WOMEN);
		
		// 생성자가 private이라서 직접 호출이 안됨.. 싱글톤 패턴
//		Human h = new Human();
	}

}
