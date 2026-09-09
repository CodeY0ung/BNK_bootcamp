package d0909;

interface Scale{
	//interface의 필드는 public static final
	int DO = 0; int RE = 1; int MI = 2; int FA = 3;
	int SO = 4; int RA = 5; int TI = 6;
}

enum Scale2{
	// 필드도 아니고, 메소드도 아님
	// 상수용도로 사용되는 객체다.
	DO, RE, MI, FA, SO, RA, TI
}

public class InterfaceBaseConst {

	public static void main(String[] args) {
		int sc = Scale.DO;
		System.out.println(sc);
		
		switch(sc) {
		case Scale.DO -> System.out.println("도");
		case Scale.RE -> System.out.println("레");
		case Scale.MI -> System.out.println("미");
		case Scale.FA -> System.out.println("파");
		case Scale.SO -> System.out.println("솔");
		case Scale.RA -> System.out.println("라");
		case Scale.TI -> System.out.println("시");
		}
		
		Scale2 sc2 = Scale2.DO;
		System.out.println(sc2);
		
		// enum은 case 구문에 타입명을 기입하지 않아도 된다.
		switch(sc2) {
		case DO:
			System.out.println("도~");
			break;
		case RE:
			System.out.println("레~");
			break;
		case MI:
			System.out.println("미~");
			break;
		case FA:
			System.out.println("파~");
			break;
		case SO:
			System.out.println("솔~");
			break;
		case RA:
			System.out.println("라~");
			break;
		case TI:
			System.out.println("시~");
			break;
		}
	}
}
