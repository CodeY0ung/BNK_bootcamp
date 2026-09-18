package d0918;

public class SelectMainTest {

	public static void main(String[] args) {

		EmployeeDAO edao = new EmployeeDAO();
		
		Employee e = edao.findByEmpId(1001);
		System.out.println(e);
	}

}
