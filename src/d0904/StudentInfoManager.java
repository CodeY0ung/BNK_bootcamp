package d0904;

import java.util.List;
import java.util.Scanner;

public class StudentInfoManager {
	
	List<Student> s;
	
	//create
	public void create(Student st) {
		s.add(st);
	}
	
	//read
	public Student read(int departmentId, Long id) {
		for(Student st : s) {
			if(st.getDepartmentId()==departmentId && 
					st.getId()==id) {
				 return st;
			}
		}
		System.out.println("찾으시는 학생 정보가 없어서 첫번째 학생 정보를 반환합니다.");
		return s.getFirst();
	}
	
	//update
	public void updateNameById(int departmentId, Long id, String name) {
		read(departmentId, id).setName(name);
	}
	
	
	//delete
	public void delete(int departmentId, Long id) {
		s.remove(read(departmentId, id));
	}

}
