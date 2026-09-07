package d0903;

public class Student {
	
//	번호 int, 이름 String, 점수 double
//	학생 정보 3개 만들어서 printArray에 넣어라
	
	int stNum;
	String stName;
	double score;
	
	public Student(int stNum, String stName, double score) {
		this.stNum = stNum;
		this.stName = stName;
		this.score = score;
	}
	
	@Override
	public String toString() {
		return "학생 번호 : "+stNum+", 학생 이름 : "+stName+", 점수 : "+score;
	}

}
