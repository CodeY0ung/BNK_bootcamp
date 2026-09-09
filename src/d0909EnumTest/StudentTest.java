package d0909EnumTest;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student s1 = new Student(1,"James",Gender.MALE);
		Student s2 = new Student(2,"Ann",Gender.FEMALE);
		Student s3 = new Student(3,"John",Gender.MALE);
		Student s4 = new Student(4,"Jenny",Gender.FEMALE);
		Student s5 = new Student(5,"David",Gender.MALE);
		Student s6 = new Student(6,"Hong",Gender.MALE);
		
		Student[] students = new Student[6];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		students[4] = s5;
		students[5] = s6;
		
		
		int maleCnt = 0;
		int femaleCnt = 0;
		for(Student s : students) {
			// 남학생 수
			if(s.getGender()==(Gender.MALE)) {
				maleCnt++;
			}
			else if(s.getGender().equals(Gender.FEMALE)) {
				femaleCnt++;
			}
		}
		
//		System.out.println(maleCnt);
//		System.out.println(femaleCnt);
		
		Student[] male = new Student[maleCnt];
		Student[] female = new Student[femaleCnt];
		
		int mCnt = 0;
		int fCnt = 0;
		for(Student s : students) {
			if(s.getGender() == Gender.MALE) {
				male[mCnt++] = s;
			}
			else if(s.getGender().equals(Gender.FEMALE)) {
				female[fCnt++] = s;
			}
		}
		
		System.out.println("------- 남학생 배열 -------");
		for(int i = 0; i < maleCnt; i++) {
			System.out.println(male[i]);
		}
		
		System.out.println("------- 여학생 배열 -------");
		for(int i = 0; i < femaleCnt; i++) {
			System.out.println(female[i]);
		}
		
		//성별 당 pass한 인원 수
		s1.setScore(60);
		s2.setScore(70);
		s3.setScore(50);
		s4.setScore(80);
		s5.setScore(50);
		s6.setScore(40);
		
		int mpassCnt = 0;
		int fPassCnt = 0;
		for(Student s : students) {
			if(s.getGender()==Gender.MALE 
					&& s.getStatus()==Status.PASS) {
				mpassCnt++;
			}
			if(s.getGender()==Gender.FEMALE 
					&& s.getStatus()==Status.PASS) {
				fPassCnt++;
			}
		}
		
		System.out.println("남학생 Pass : "+mpassCnt+"명");
		System.out.println("여학생 Pass : "+fPassCnt+"명");
		
	}

}
