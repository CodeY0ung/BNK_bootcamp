package d0901;

public class Train extends Transportation implements TransportationInterface{
	
	public void goTrain() {
		System.out.println("기차에 몸을 싣고");
	}

	@Override
	public void goBusan() {
		System.out.println("부산행 기차에 몸을 싣고");
	}
	
	@Override
	public void go() {
		System.out.println("부산행 기차에 몸을 싣고");
	}
	
	public void take() {
		System.out.println("기차를 탑니다");
	}
}
