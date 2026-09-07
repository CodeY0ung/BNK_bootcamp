package d0901;

public class TravelTest {

	public static void main(String[] args) {
		
		
		Bus bus = new Bus();
		Train train = new Train();
		BusanTravel bt = new BusanTravel();
		Transportation t = new Transportation();
		Transportation tb = new Bus();
		
		TransportationInterface[] tiArray = new TransportationInterface[2];
		tiArray[0] = bus;
		tiArray[1] = train;
		
		bt.takeT(tiArray);
		bus.stop();
		
	}

}
