package d0902;

public class Student {

	// 학생 번호 stu - 1 부터 숫자만 증가
	private String stNum;
	private static int num;
	private String name;
	
	public Student(String name) {
		this.name = name;
		stNum = "stu - " + ++num;
	}
	
	public String getStNum() {
		return stNum;
	}
	
	
}
