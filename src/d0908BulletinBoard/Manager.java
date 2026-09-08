package d0908BulletinBoard;

public class Manager extends User{
	
	public Manager(String id, String pw, String nickName, String isManager) {
		super(id,pw,nickName);
		setRank(isManager);
	}
	
	@Override
	public String toString() {
		return "관리자 계정";
	}
	
}
