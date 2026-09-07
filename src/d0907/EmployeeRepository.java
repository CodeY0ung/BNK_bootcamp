package d0907;

import java.util.ArrayList;
import java.util.List;

public class EmployeeRepository {
	
	List<Employee> em = new ArrayList<>();
	
	// create
	public void create(Employee e) {
		if(e==null) {
			System.out.println("입력 값이 null입니다.");
		}
		em.add(e);
	}
	
	// read
	public Employee getEmployee(String employeeId) {
		for(Employee e : em) {
			if(e.getEmployeeId().equals(employeeId)) {
				return e;
			}
		}
		System.out.println("존재하지 않는 사원입니다.");
		return em.getFirst();
	}
	
	// update
	public void updateEmployeeName(String employeeId, String name) {
		getEmployee(employeeId).setName(name);
	}
	
	// delete
	public void deleteOne(String employeeId) {
		em.remove(getEmployee(employeeId));
	}

}
