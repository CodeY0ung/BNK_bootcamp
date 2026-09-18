package d0914Library;

public class Student {
	
	private Long sid;
	private static Long cnt;
	private String name;
	private String tel;
	
	public Student(String name, String tel) {
		sid = ++cnt;
		this.name = name;
		this.tel = tel;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String getTel() {
		return tel;
	}

}
