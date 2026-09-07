package d0827;

public class TestScoreManager {

	public static void main(String[] args) {
		// 국어, 영어, 수학 성적을 구하는 프로그램
		// 총점 : 국어점수 + 영어점수 + 수학점수
		// 평균 : 총점 / 과목수
		// 학생 : James, Mark, Ann
		
		String[] names = new String[3];
		int[] kor_scores = {55,66,77};
		int[] eng_scores = {44,33,22};
		int[] math_scores = {54,66,88};
				
		names[0] = "James";
		names[1] = "Mark";
		names[2] = "Ann";
		
		for(int i = 0; i < 3; i++) {
			System.out.println(names[i]+"의 총점 : "+getTotal(i,kor_scores,eng_scores,math_scores)+
					", 평균 : "+getAvg(i,kor_scores,eng_scores,math_scores));
		}
		
	}
	
	// 총점 구하기 함수
	static int getTotal(int num, int[] kor_scores, int[] eng_scores, int[] math_scores) {
		int total = kor_scores[num] + eng_scores[num] + math_scores[num]; 
		return total;
	}
	
	// 평균 구하기 함수
	static int getAvg(int num, int[] kor_scores, int[] eng_scores, int[] math_scores) {
		int avg = (kor_scores[num] + eng_scores[num] + math_scores[num])/3; 
		return avg;
	}

}
