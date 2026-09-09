package d0909EnumTest;

public class Customer {
	
	private Long id;
	private static Long cnt = 0L;
	private String name;
	private int age;
	private RepaymentStatus rs;
	
	public Customer(String name, int age) {
		cnt++;
		id = cnt;
		this.name = name;
		this.age = age;
		rs = RepaymentStatus.ACTIVE;
	}
	
	public String toString() {
		return "회원 ID : "+id+", 이름 : "+name+", 나이 : "+age+", 대출 상태 : "+rs;
	}
	
	public void setRepaymentStatus(RepaymentStatus rs) {
		this.rs = rs;
	}
	
	

}
