package d0909AvengersMapTest;

public class Hero {
	
	private static int cnt;
	private int id;
	private String name;
	private String skill;
	
	private Hero(String name) {
		id = ++cnt;
		this.name = name;
		initSkill();
	}

	public static Hero create(String name) {
		if(name.isEmpty()) {
			System.out.println("이름을 다시 확인해주세요");
			return null;
		}
		return new Hero(name);
	}
	
	private void initSkill() {
		if(this.name.equals("토르")) {
			this.skill = "번개 공격!";
		}
		if(this.name.equals("헐크")) {
			this.skill = "박살내기!";
		}
		if(this.name.equals("캡틴")) {
			this.skill = "방패 던지기!";
		}
	}
	
	public int getId() {
		return id;
	}
	
	public String getSkill() {
		return name+" 출격! "+skill;
	}
	
	public String getName() {
		return name;
	}
}
