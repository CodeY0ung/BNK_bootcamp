package d0909EnumTest;

public enum Grade {
	BRONZE(0),
	SILVER(10),
	GOLD(20);
	
	int discount;
	
	Grade(int discount){
		this.discount = discount;
	}

	public int calcPrice(int price) {
		return price - (price * discount/100);
	}
}
