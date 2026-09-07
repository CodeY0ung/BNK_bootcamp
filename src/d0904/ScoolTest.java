package d0904;

import java.util.ArrayList;
import java.util.List;

public class ScoolTest {

	public static void main(String[] args) {
		
		StudentInfoManager sm = new StudentInfoManager();
		TeacherInfoManager tm = new TeacherInfoManager();
		
		tm.tl = new ArrayList<>();
		tm.tl.add(new Teacher("A", "철수", "국어", "남"));
		tm.tl.add(new Teacher("B", "짱구", "수학", "남"));
		tm.tl.add(new Teacher("C", "유리", "Java", "여"));
		
		sm.s = new ArrayList<>();
		sm.s.add(new Student("A","징징이","남",tm.tl.get(0),
						50,60,70,80,90));
		sm.s.add(new Student("A","스폰지밥","남",tm.tl.get(0),
						70,80,90,100,79));
		sm.s.add(new Student("A","집게사장","남",tm.tl.get(0),
						75,85,95,100,79));
		sm.s.add(new Student("B","뚱이","남",tm.tl.get(1),
				45,36,76,85,76));
		sm.s.add(new Student("B","다람이","여",tm.tl.get(1),
						65,75,4,66,75));
		sm.s.add(new Student("C","영희","여",tm.tl.get(2),
						75,50,6,0,35));
		sm.s.add(new Student("C","철구","남",tm.tl.get(2),
				66,88,44,55,66));
		sm.s.add(new Student("C","플랑크톤","남",tm.tl.get(2),
				55,86,96,100,79));
		
		tm.updateNameByClName("A", "창렬");
		tm.delete("B");
		
		Util.systemStart(tm.tl, sm.s);
		
		
		
//		 "철수" 쌤 반 학생 수 (전체 학생 수 대비 남/여 학생 수)
		
		
//		 "영희"라고 하는 학생의 필수 수강 과목 평균 점수
		
//		 SQL 선택 과목을 수강하는 남학생 수
		
//		 통과하지 못한 학생들의 명단
		

	}

}
