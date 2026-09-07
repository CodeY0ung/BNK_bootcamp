package d0831;

public class Human extends Parent implements Paintable, Shootable {

	public void study() {
		System.out.println("공부합니다.");
	}
	
	@Override
	public void paint() {
		System.out.println("동양화를 그립니다.");
	}
	
	@Override
	public void shooting() {
		System.out.println("M16 사격을 합니다.");
	}
}
