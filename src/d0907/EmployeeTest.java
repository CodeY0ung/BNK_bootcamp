package d0907;

public class EmployeeTest {

	public static void main(String[] args) {
		// 사번
		// 이름
		// 부서
		// 모든 사원은 기본급이 있다
		// 정규직, 비정규직 사원이 있다
		// 비 정규직 사원은 시급으로 , 정규직은 기본급으로
		// 정규직은 직급에 따라 기본급이 달라짐
		// 직급 : 관리자, 사원
		// 시간당 급여 : 30000
		// 상속 관계 적용
		// 부서별 총 급여
		// 비정규직 중 가장 급여가 높은 사람
		// crud ㄱㄱ
		
		RegularEmployee re0 = new RegularEmployee(true,"짱구","인사","사원");
		RegularEmployee re1 = new RegularEmployee( true,"철수","IT","사원");
		RegularEmployee re2 = new RegularEmployee( true,"맹구","생산","사원");
		RegularEmployee re3 = new RegularEmployee( true,"철수","인사","관리자");
		NonRegularEmployee ne0 = new NonRegularEmployee( false,"스폰지밥","인사",20);
		NonRegularEmployee ne1 = new NonRegularEmployee( false,"뚱이","IT",10);
		NonRegularEmployee ne2 = new NonRegularEmployee( false,"징징이","생산",30);
		
		
		EmployeeRepository er = new EmployeeRepository();
		
		EmployeeService es = new EmployeeService(er.em);
		es.create(re0);
		es.create(re1);
		es.create(re2);
		es.create(re3);
		es.create(ne0);
		es.create(ne1);
		es.create(ne2);
		
		System.out.println(er.getEmployee("인사-1"));
		er.updateEmployeeName("인사-1", "짱아");
//		er.deleteOne("인사-1");
		
		System.out.println(es.getTotalSalaryByDep("생산"));
		es.getMaxNonRegular();
		es.printAll();

	}

}
