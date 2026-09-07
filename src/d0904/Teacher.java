package d0904;

import java.util.ArrayList;
import java.util.List;

public class Teacher implements Person {
	
	private String clName;
	private String name;
	private String supervisedSub;
	private String gender;
	
	private List<Student> st;
	
	public Teacher(String clName, String name,
			String supervisedSub, String gender) {
		this.clName = clName;
		this.name = name;
		this.supervisedSub = supervisedSub;
		this.gender = gender;
		st = new ArrayList<>();
	}
	
	@Override
	public String toString() {
		return "담당 반 : "+clName+"반, 이름 : "+name+", 담당 과목 : "+
	supervisedSub+", 성별 : "+gender;
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
	
	public List<Student> getSt(){
		return st;
	}
	
	public void addSt(Student s) {
		st.add(s);
	}

}
