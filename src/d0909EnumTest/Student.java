package d0909EnumTest;

public class Student {

	private int id;
	private String name;
	private Gender gender;
	private int score;
	private Status status; // if score >=60 : pass, else : fail
	
	public Student(int id, String name, Gender gender) {
		this.id = id;
		this.name = name;
		this.gender = gender;
	}
	
	@Override
	public String toString() {
		return "ID : "+id+"\t name : "+name+"\t gender : "+gender;
	}
	
	public Gender getGender() {
		return gender;
	}
	
	public Status getStatus() {
		return status;
	}
	
	public void setScore(int score) {
		this.score = score;
		if(this.score >= 60) {
			this.status = Status.PASS;
		}
		else if(this.score < 60){
			this.status = Status.FAIL;
		}
	}
}
