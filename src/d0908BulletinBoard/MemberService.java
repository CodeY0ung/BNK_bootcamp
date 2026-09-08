package d0908BulletinBoard;

public class MemberService {
	
	MemberRepository mr;
	
	public MemberService(MemberRepository mr) {
		this.mr = mr;
	}
	
	// sign-up
	public boolean signUp(Member member) {
		boolean tf = true;
		//null
		if(member == null) {
			System.out.println("정보가 없습니다.");
			tf = false;
		}
		
		//id, pw 중복 검사
		for(User u : mr.ul) {
			if(member.getId().equals(u.getId())) {
				System.out.println("중복된 ID");
				tf = false;
			}
			if(member.getPw().equals(u.getPw())) {
				System.out.println("중복된 PW");
				tf = false;
			}
			if(member.getNickName().equals(u.getNickName())) {
				System.out.println("중복된 닉네임");
				tf = false;
			}
		}
		if(tf) {
			mr.create(member);
			System.out.println("회원가입 완료되었습니다.\n"+member);	
		}
		return tf;
	}
	
	// sign-in
	public User signIn(String id, String pw) {
		boolean isSignIn = false;
		for(User u : mr.ul) {
			if(u.getId().equals(id) && u.getPw().equals(pw)) {
				System.out.println("로그인 되었습니다.");
				isSignIn = true;
				return u;
			}
		}
		if(!isSignIn) {
			System.out.println("회원 정보가 일치하지 않습니다.");
			return null;
		}
		return null;
	}
	
	// findById
	public User findById(String id) {
		User user = mr.findById(id);
		return user;
	}
	
	public void findAll() {
		for(User u : mr.findAll()) {
			if(u.getRank().equals("일반 회원"))
			System.out.println(u);
		}
	}
	
	public void findMemNum() {
		int cnt = 0;
		for(User u : mr.findAll()) {
			if(u.getRank().equals("일반 회원")) {
				cnt++;	
			}
		}
		System.out.println("총 회원 수  : "+cnt);
	}

}
