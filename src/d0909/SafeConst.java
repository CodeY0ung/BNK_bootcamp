package d0909;

enum Animal1{
	DOG, CAT
}

// enum 자체가 타입이 제한되어있음
enum Person1{
	MAN, WOMAN
}

public class SafeConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		who(Person1.WOMAN);
//		who(Animal1.CAT);
	}
	
	public static void who(Person1 p) {
		switch(p) {
		case Person1.MAN ->System.out.println("남자");
		case Person1.WOMAN -> System.out.println("여자");
		}
	}

}
