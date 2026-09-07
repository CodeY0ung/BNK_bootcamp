package d0907;

public abstract class Employee {
	
	private int id;
	private String name;
	private String department;
	private String isRegular;
	
	public Employee(boolean isRegular, String name,
			String department) {
		id = 1;
		if(isRegular) {
			this.isRegular = "정규직";
		}else {
			this.isRegular = "비정규직";
		}
		this.name = name;
		this.department = department;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public String getEmployeeId() {
		return department+"-"+id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getDepartment() {
		return department;
	}
	
	public String getIsRegular() {
		return isRegular;
	}
	
	@Override
	public String toString() {
		return "사원";
	}
	
	public abstract int getSalary();
}
