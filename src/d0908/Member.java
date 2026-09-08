package d0908;

public class Member implements Comparable<Member>{
	
	private int mno;
	private String name;
	private int age;
	
	public Member(int mno, String name, int age) {
		this.mno = mno;
		this.name = name;
		this.age = age;
	}
	
	@Override
	public String toString() {
		return "mno : "+mno+", name : "+name+", age : "+age;
	}
	
	public int getMno() {
		return mno;
	}

	public void setMno(int mno) {
		this.mno = mno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(Member o) {
		if(this.name.compareTo(o.name) != 0) {
			return Integer.compare(this.age, o.age);
		}
		return this.name.compareTo(o.name);
//		return o.name.compareTo(this.name); 이름 내림차순
//		return this.name.compareTo(o.name); 이름 오름차순
//		return Integer.compare(o.age, this.age); 나이 내림차순
//		return Integer.compare(this.age, o.age); 나이 오름차순
	}
	
	

}
