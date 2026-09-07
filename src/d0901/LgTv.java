package d0901;

public class LgTv implements Tv {
	
	@Override
	public void turnOn() {
		System.out.println("LG tv 전원 켬");
	}
	
	@Override
	public void turnOff() {
		System.out.println("LG tv 전원 끔");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("LG tv 소리 높임");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("LG tv 소리 낮춤");
	}
	
	@Override
	public String toString() {
		return "LG TV 입니다.";
	}
}
