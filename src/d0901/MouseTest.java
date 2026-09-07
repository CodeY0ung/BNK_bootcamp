package d0901;

public class MouseTest {

	public static void main(String[] args) {

		Mouse m = new Mouse();
		m.clickLeft();
		m.clickRightt();
		
		WheelMouse wm = new WheelMouse();
		wm.clickLeft();
		wm.clickRightt();
		wm.scroll();
		
		OpticalMouse om = new OpticalMouse();
		om.clickLeft();
		om.clickRightt();
		
		System.out.println("---------------------------");
		
		Mouse[] mouses = {
				om,
				wm,
				m
		};
		
		for(Mouse mo : mouses) {
			mo.clickLeft();
			mo.clickRightt();
		}
		
//		for(int i = 0; i < mouses.length; i++) {
//			if(mouses[i] instanceof Mouse) {
//				System.out.println(i+"번 인덱스는 일반 마우스...");
//			}
//			else if(mouses[i] instanceof WheelMouse) {
//				System.out.println(i+"번 인덱스는 휠 마우스...");
//			}
//			else if(mouses[i] instanceof OpticalMouse) {
//				System.out.println(i+"번 인덱스는 광 마우스...");
//			}
//		}
		
		for(int i = 0; i < mouses.length; i++) {
			if(mouses[i].getClass().equals(Mouse.class)) {
				System.out.println(i+"번 인덱스는 일반 마우스...");
			}
			else if(mouses[i].getClass().equals(WheelMouse.class)) {
				System.out.println(i+"번 인덱스는 휠 마우스...");
			}
			else if(mouses[i].getClass().equals(OpticalMouse.class)) {
				System.out.println(i+"번 인덱스는 광 마우스...");
			}
		}
		
	}

}
