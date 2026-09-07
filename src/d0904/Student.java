package d0904;

public class Student implements Person{
	
	private static long id;
	private int departmentId;
	private String clName;
	private String name;
	private double[] reqCourseScore;
	private double[] selCourseScore;
	private double korean, math, java, sql, html;
	private String gender;
	
	private Teacher teacher;
	
	public Student(String clName, String name, String gender, Teacher teacher,
			double korean, double math, double java, double sql, double html) {
		if(clName.equals("A")) departmentId = 100;
		if(clName.equals("B")) departmentId = 200;
		if(clName.equals("C")) departmentId = 300;
		++id;
		this.clName = clName;
		this.name = name;
		this.korean = korean;
		this.math = math;
		this.java = java;
		this.sql = sql;
		this.html = html;
		reqCourseScore = new double[3];
		reqCourseScore[0] = korean;
		reqCourseScore[1] = math;
		reqCourseScore[2] = java;
		selCourseScore = new double[3];
		selCourseScore[0] = sql;
		selCourseScore[1] = html;
		this.gender = gender;
		this.teacher = teacher;
		teacher.addSt(this);
	}
	
	@Override
	public String toString() {
		return "학과 코드 : "+departmentId+
				", 학번 : "+id+", 소속 : "+clName+"반 , 이름 : "+name+
				", 성별 : "+gender;
	}
	
	@Override
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public void setClName(String clName){
		this.clName = clName;
	}
	
	@Override
	public String getClName() {
		return clName;
	}
	
	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}
	
	@Override
	public String getGender() {
		return gender;
	}
	
	public int getDepartmentId() {
		return departmentId;
	}
	
	public Long getId() {
		return id;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	
	//필수과목 Setter
	public void setReqScore(double[] scores) {
		int i = 0;
		for(double s : scores) {
			reqCourseScore[i++] = s;
		}
	}
	
	//선택과목 Setter
	public void setSelScore(double[] scores) {
		int i = 0;
		for(double s : scores) {
			selCourseScore[i++] = s;
		}
	}
	//필수 과목 Getter
	public double[] getReq() {
		return reqCourseScore;
	}
	
	//선택 과목 Getter
	public double[] getSel() {
		return selCourseScore;
	}
	
	
	//필수 수강 과목 평균 getter
	public int getReqAvg() {
		int score = 0;
		for(double s : reqCourseScore) {
			score += s;
		}
		return score/3;
	}
	
	public String getGen() {
		return gender;
	}
	

}
