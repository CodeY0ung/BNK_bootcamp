package d0904;

import java.util.List;
import java.util.Scanner;

public class Util {
	
//	전체 학생 수
	public static void getTotal(List<Student> st) {
		int cnt = 0;
		for(Student s : st) {
			cnt ++;
		}
		System.out.println("전체 학생 수 : "+cnt);
	}
	
//	"철수" 쌤 반 학생 수 (전체 학생 수 대비 남/여 학생 수)
	public static void getTatalByTname(List<Student> st, String tName) {
		int cnt = 0;
		for(Student s : st) {
			if(s.getTeacher().getName().equals(tName)) {
				cnt++;
			}
		}
		System.out.println(tName+" 선생님 반 학생 수 : "+cnt);
	}

//	"영희"라고 하는 학생의 필수 수강 과목 평균 점수
	public static void getAvgByStName(List<Student> st, String name) {
			for(Student s : st) {
				if(s.getName().equals(name)) {
					System.out.println("이름 : "+name+
							", 필수 수강 과목 평균 점수 : "+s.getReqAvg());
				}
			}
	}
	
//	SQL 선택 과목을 수강하는 학생 수
	public static void getNumManHasSQL(List<Student> st) {
		int cnt = 0;
		for(Student s : st) {
			if(s.getSel()[0]!=0) {
				cnt++;
			}
		}
		System.out.println("SQL 과목을 수강하는 학생 수 : "+cnt);
	}

//	통과하지 못한 학생들의 명단
	public static void getStNonPass(List<Student> st) {
		boolean tf;
		int cnt = 0;
		for(Student s : st) {
			tf = true;
			for(double score : s.getReq()) {
				if(score < 40) {
					tf = false;
				}
			}
			if(s.getReqAvg()<60 || tf==false) {
				cnt ++;
				System.out.println(s.getClName()+"반 Pass를 받지 못한 학생 : "+s.getName());;
			}
		}
	}
	
//	반 이름으로 학생 수 조회
	public static void findTotalByClassName(List<Teacher> t, String clName) {
		int cnt = 0;
		for(Teacher te : t) {
			if(te.getClName().equals(clName)) {
				for(Student s : te.getSt()) {
					cnt++;
				}
			}
		}
		System.out.println(clName+"반 학생 수 : "+cnt);
	}
	
	// 모든 학생 정보 조회
	public static void findAllSt(List<Student> st) {
		for(Student s : st) {
			System.out.println(s.toString());
		}
	}
	
	public static void findAllT(List<Teacher> te) {
		for(Teacher t : te) {
			System.out.println(t.toString());
		}
	}
	
//  관리 시스템 스타트
	public static void systemStart(List<Teacher> t, List<Student> st) {
		System.out.println("0 : 모든 학생 수 조회\n"
				+ "1 : 선생님 이름으로 해당 반의 총점 조회\n"
				+ "2 : 학생 이름으로 그 학생의 필수 과목 평균 점수 조회\n"
				+ "3 : sql을 수강하는 학생 수 조회\n"
				+ "4 : Pass를 받지 못한 학생 전부 조회\n"
				+ "5 : 소속 반 이름으로 해당 반의 총 학생 수 조회\n"
				+ "6 : 모든 학생 정보 조회\n"
				+ "7 : 모든 교사 정보 조회");
		System.out.print("번호를 입력해 주세요 : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		switch(n) {
		case 0 ->  getTotal(st);
		case 1 -> {System.out.println("선생님 이름 : ");
					String name = sc.next();
					getTatalByTname(st, name);}
		case 2 -> {System.out.println("학생 이름 : ");
					String name = sc.next();
					getAvgByStName(st, name);}
		case 3 -> getNumManHasSQL(st);
		case 4 -> getStNonPass(st);
		case 5 -> {System.out.println("반 이름 : ");
					String clName = sc.next();
					findTotalByClassName(t, clName);}
		case 6 -> findAllSt(st);
		case 7 -> findAllT(t);
		}
		sc.close();
	}

}
