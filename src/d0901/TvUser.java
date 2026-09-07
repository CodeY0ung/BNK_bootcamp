package d0901;

public class TvUser {

	public static void main(String[] args) {
		
//		Tv tv = new SamsungTv();
//		tv.turnOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOff();
		
//		Tv tv = new LgTv();
//		tv.turnOn();
//		tv.volumeUp();
//		tv.volumeDown();
//		tv.turnOff();
		
		TvFactory tvFac1 = new TvFactory("LG");
		tvFac1.getBrand().turnOn();
		tvFac1.getBrand().volumeUp();
		tvFac1.getBrand().volumeDown();
		tvFac1.getBrand().turnOff();
		
		TvFactory tvFac2 = new TvFactory("삼성");
		tvFac2.getBrand().turnOn();
		tvFac2.getBrand().volumeUp();
		tvFac2.getBrand().volumeDown();
		tvFac2.getBrand().turnOff();
		
		
	}
}
