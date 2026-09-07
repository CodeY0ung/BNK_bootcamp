package d0907;

import java.util.Objects;

public class RegularEmployee extends Employee{
	
	//기본급
	private int salary;
	
	//직급
	private String rank;
	
	public RegularEmployee(boolean isRegular, String name,
			String department, String rank) {
		super(isRegular, name, department);
		this.rank = rank;
		if(rank.equals("관리자")) {
			this.salary = 3_500_000;
		}
		this.salary = 3_000_000;
	}
	
	@Override
	public String toString() {
		return "사원번호 : "+getEmployeeId()+", 이름 : "+getName()+", 부서 : "+getDepartment()+
				", 직급 : "+rank+", 월급 : "+getSalary();
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	@Override
	public int getSalary() {
		return salary;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this == o) {
			return true;
		}
		// 매개변수에 null이거나, 다른 타입 class
		if(o == null || getClass() != o.getClass()) {
			return false;
		}
		// 같은 타입
		RegularEmployee re = (RegularEmployee)o;
		if(this.getEmployeeId().equals(re.getEmployeeId())) {
			return true;
		}
		return false;
	}
	
	// 객체의 주소가 달라도 값이 같으면 정체성을 일치시켜준다.
	@Override
	public int hashCode() {
		return Objects.hash(this.getDepartment(),this.getEmployeeId());
	}

}
