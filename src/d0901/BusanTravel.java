package d0901;

public class BusanTravel {

	
	
//	public void goBusanByBus(Bus bus) {
//		bus.goBus();
//	}
//	
//	public void goBusanByTrain(Train train) {
//		train.goTrain();
//	}
	
	public void goBusan(Transportation t) {
		t.go();
	}
	
	public void takeT(TransportationInterface[] t) {
		for(TransportationInterface ti : t) {
			ti.take();
		}
	}
	
	public void goBusan2(Transportation transportation) {
		
		// 매개변수 bus라면 bus.goBus() 호출
		if(transportation instanceof Bus) {
			Bus bus = (Bus)transportation;
			bus.goBus();
		}
		// 매개변수 train이라면 train.goTrain() 호출
		else if(transportation instanceof Train) {
			Train train = (Train)transportation;
			train.goTrain();
		}
	}
	
	
}
