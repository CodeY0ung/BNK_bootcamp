package d0901;

public class Bus extends Transportation implements TransportationInterface{
	
	public void goBus() {
		System.out.println("버스에 몸을 싣고");
	}

	@Override
	public void goBusan() {
		System.out.println("부산행 버스에 몸을 싣고");
	}
	
	@Override
	public void go() {
		System.out.println("부산행 버스에 몸을 싣고");
	}
	
	
	public void take() {
		System.out.println("버스를 탑니다");
	}
}
