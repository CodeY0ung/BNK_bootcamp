package d0904;

import java.util.ArrayList;
import java.util.List;

public class TeacherInfoManager {
	
	List<Teacher> tl;
	
	//create
	public void create(Teacher t) {
		tl.add(t);
	}
	
	//read
	public Teacher read(String clName) {
		for(Teacher t : tl) {
			if(t.getClName().equals(clName)) {
				return t;
			}
		}
		System.out.println("찾으시는 선생님이 존재하지 않아 A반 선생님이 반환됩니다.");
		return tl.getFirst();
	}
	
	//update
	public void updateNameByClName(String clName, String name) {
		read(clName).setName(name);
	}
	
	//delete
	public void delete(String clName) {
		tl.remove(read(clName));
	}
	

}
