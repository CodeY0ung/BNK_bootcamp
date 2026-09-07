package d0902;

public class Human {

	private static int num;
	private int hNum;
	private String name;
	
	public Human(String name) {
		hNum = ++num;
		this.name = name;
	}
	
	public static int getNum() {
		return num;
	}
	
	public int getHnum() {
		return hNum;
	}
	
	
}
