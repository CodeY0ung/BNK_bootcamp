package d0901;

public class WheelMouse extends Mouse {

	public void scroll() {
		System.out.println("scroll.....");
	}
	
	@Override
	public void clickLeft() {
		System.out.println("휠 마우스 왼쪽 클릭!!");
	}
	
	public void clickRightt() {
		System.out.println("휠 마우스 오른쪽 클릭!!");
	}
}
