package d0907;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {
	
	List<Employee> em;
	
	public EmployeeService(List<Employee> em) {
		this.em = em;
	}
	
	// 부서별 총 급여
	public int getTotalSalaryByDep(String dep) {
		int total = 0;
		for(Employee e : em) {
			if(e.getDepartment().equals(dep)) {
				total+=e.getSalary();
			}
		}
		return total;
	}
	
	// 비정규직 중 가장 급여가 높은 사람
	public void getMaxNonRegular() {
		int max = 0;
		String name = "";
		for(Employee e : em) {
			if(e.getIsRegular().equals("비정규직")) {
				if(e.getSalary() > max) {
					max = e.getSalary();
					name = e.getName();
				}
			}
		}
		System.out.println("급여가 가장 높은 비정규직 사원의 이름 : "+name+
				", 급여 : "+max);
		
	}
	
	// 전체 출력
	public void printAll() {
		for(Employee e : em) {
			System.out.println(e);
		}
	}
	
	// 등록
	public void create(Employee e) {
		int max = 0;
		if(e == null) {
			System.out.println("등록할 회원 정보가 존재하지 않습니다.");
		}
		for(Employee emp : em) {
			if(emp.getDepartment().equals(e.getDepartment())) {
				if(emp.getId() > max) {
					max = emp.getId();
				}
			}
		}
		max++;
		e.setId(max);
		em.add(e);
	}

}
