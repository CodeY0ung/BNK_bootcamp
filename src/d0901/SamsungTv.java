package d0901;

public class SamsungTv implements Tv{
	
	@Override
	public void turnOn() {
		System.out.println("삼성 tv 전원 켬");
	}
	
	@Override
	public void turnOff() {
		System.out.println("삼성 tv 전원 끔");
	}
	
	@Override
	public void volumeUp() {
		System.out.println("삼성 tv 소리 높임");
	}
	
	@Override
	public void volumeDown() {
		System.out.println("삼성 tv 소리 낮춤");
	}
	
	@Override
	public String toString() {
		return "삼성 TV 입니다.";
	}
	
}
