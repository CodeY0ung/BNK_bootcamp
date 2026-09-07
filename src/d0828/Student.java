package d0828;

public class Student {

	private String name;
	private int money;
	
	// 현재 타고 있는 버스 정보
	private Bus bus;
	
	// 승차
	public void rideBus(Bus bus) {
		// 학생 돈 1000원 차감
		money -= 1000;
		
		bus.takePessenger(this);
	}
	
	public void setBus(Bus bus) {
		String name = "철수";
		this.bus = bus;
	}
	
	public Bus getBus() {
		return bus;
	}
	
	public Student(String name) {
		this.name = name;
		money = 5000;
	}
	
	public String getName() {
		return name;
	}
	
	public int getMoney() {
		return money;
	}
	
	public void setMoney(int money) {
		this.money = money;
	}

	
	
}
