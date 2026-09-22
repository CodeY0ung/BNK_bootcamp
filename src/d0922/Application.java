package d0922;

public class Application {

	public static void main(String[] args) {

		OrderDAO orderDao = new OrderDAO();
		
		orderDao.findOrderList(15);
	}

}
