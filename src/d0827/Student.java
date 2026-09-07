package d0827;

public class Student {

	private String name;
	private int kor_score;
	private int eng_score;
	private int math_score;
	
	public Student(String name, int Kor_score, 
			int eng_score, int math_score) {
		this.name = name;
		this.kor_score = kor_score;
		this.eng_score = eng_score;
		this.math_score = math_score;
	}
	
	// getter
	public String getName() {
		return name;
	}
	
	// 총합 구하는 함수
	public int getTotal() {
		return kor_score + eng_score + math_score;
	}
	
	// 평균 구하는 함수
	public int getAvg() {
		return (kor_score + eng_score + math_score)/3;
	}
	
	
}
