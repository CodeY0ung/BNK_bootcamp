package d0909;

interface Animal{
	int DOG = 1;
	int CAT = 2;
}

class Person{
	static final int MAN = 1;
	static final int WOMEN = 2;
}

public class NonSafeConst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		who(Person.WOMEN);
		who(Animal.CAT);
	}
	
	public static void who(int man) {
		switch(man) {
		case Person.MAN:
			System.out.println("남자");
			break;
		case Person.WOMEN:
			System.out.println("여자");
			break;
		}
	}

}
