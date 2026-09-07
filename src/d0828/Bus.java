package d0828;

public class Bus {

	private String num;
	private int passengerCnt;
	private int income;
	
	// 승차하고 있는 학생
	private Student[] passengers = new Student[3];
	
	
	
	public Bus(String num) {
		this.num = num;
		passengerCnt = 0;
		income = 0;
	}

	
	// 승차
	public void takePessenger(Student student) {
	
		// 수익이 1000 중가한다.
		income += 1000;
		
//		// 학생의 money -1000
//		int money = student.getMoney();
//		student.setMoney(money - 1000);
		
		// 승객 수가 증가 -> 승차 학생 정보 저장
		passengers[passengerCnt] = student;
		passengerCnt ++;
		
		// 승객.bus <- bus
		student.setBus(this);
		
	}
	
	// 승차 중인 학생 정보
	public Student[] getPassengers() {
		return passengers;
	}
	
	// 승차 중인 학생 정보 출력
	public void showInfo() {
		System.out.println("현재 승차 중인 학생 : ");
		for(Student pas : passengers) {
			if(pas != null) {
				System.out.println(pas.getName());
			}
		}
	}
	
	// 하차
	public void removePassengers(Student student) {
		int cnt = 0;
		for(Student pas : passengers) {
			if(pas.equals(student)) {
				// 학생에게 있는 버스 정보 삭제
				passengers[cnt].setBus(null);
				// 버스에 있는 승객 정보 삭제
				passengers[cnt] = null;
			}
			cnt ++;
		}
	}
	
	public int getIncome() {
		return income;
	}
	
	public int getPassengerCnt() {
		return passengerCnt;
	}
	
	public String getNum() {
		return num;
	}
	
	
	
	
}
