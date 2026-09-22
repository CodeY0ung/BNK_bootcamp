package d0921_reservation_program;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Repository re = new Repository();
		
//		re.createMember("skipper");
//		re.createItem("fish");
		re.requestReservation(1, 21);
	}

}
