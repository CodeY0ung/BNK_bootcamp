package d0908BulletinBoard;

public class Member extends User {
	private String name;
	
	public Member(String id, String pw, String name, String nickName) {
		super(id,pw,nickName);
		this.name = name;
		setRank("일반 회원");
	}
	
	@Override
	public String toString() {
		return "id : "+getId()+", pw: "+getPw()+","
				+ " name : "+name+", nickname : "+getNickName();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}
