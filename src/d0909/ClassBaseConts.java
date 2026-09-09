package d0909;


class Role{
	// 상수 -> 전부 대분자로
	public static final int ADMIN = 1;
	public static final int MEMBER = 2;
	public static final int GUEST = 3;
}


public class ClassBaseConts {

	public static void main(String[] args) {

		System.out.println(Role.ADMIN);
		
		int role = Role.GUEST;
		
		switch(role) {
		case Role.GUEST:
			System.out.println("손님입니다.");
			break;
		case Role.MEMBER:
			System.out.println("회원입니다.");
			break;
		case Role.ADMIN:
			System.out.println("관리자입니다.");
			break;
		}
		
	}

}
