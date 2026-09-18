package d0918;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class InsertMainTest {

	public static void main(String[] args) {

		// DB에 사원정보(Employee) 추가
		// EmployeeDAO 클래스의 insert() 메소드 실행
		// 위 메소드를 실행시키려면...
		// 매개변수 대입해줄 Employee 객체가 있어야 함.
		// * 필요한 인스턴스
		// ** 1. Employee - insert() 메소드의 매개변수에 할당 시킬 차례
		// ** 2. EmployeeDAO
		
//		Employee emp = new Employee();
//		emp.setEmpId(1002);
//		emp.setEmpNo("E1002");
//		emp.setEmpName("홍길동");
//		emp.setSalary(new BigDecimal("3500000.50"));
//		emp.setBirthDate(LocalDate.of(1990, 5, 10));
//		// 년, 월, 일, 시, 분, 초
//		emp.setHireTime(LocalDateTime.of(2026, 9, 17, 9, 20, 30));
		EmployeeDAO empDao = new EmployeeDAO();
//		empDao.insert(emp);
		
//		empDao.update(1001, new Employee(0,null,"호빵맨",null,null,null));
		empDao.deleteByEmpId(1002);
	}

}
