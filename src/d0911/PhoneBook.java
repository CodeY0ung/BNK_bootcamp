package d0911;

public class PhoneBook {
	
	private String phoneNum;
	private String name;
	private String memo;
	
	public PhoneBook(String phoneNum, String name, String memo) {
		this.phoneNum = phoneNum;
		this.name = name;
		this.memo = memo;
	}
	
	@Override
	public String toString() {
		return name+"\t"+phoneNum+"\t"+memo;
	}
	
	public String getPhoneNum() {
		return phoneNum;
	}
	
	public String getName() {
		return name;
	}
	
	public String getMemo() {
		return memo;
	}

}
