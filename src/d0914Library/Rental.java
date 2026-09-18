package d0914Library;

public class Rental {

	private Long rid;
	private static Long cnt;
	private Long sid;
	private String rentalDate;
	private String returnDate;
	
	public Rental(Long sid, String rentalDate, String returnDate) {
		rid = ++cnt;
		this.sid = sid;
		this.rentalDate = rentalDate;
		this.returnDate = returnDate;
	}

	public Long getRid() {
		return rid;
	}

	public String getRentalDate() {
		return rentalDate;
	}

	public void setRentalDate(String rentalDate) {
		this.rentalDate = rentalDate;
	}

	public String getReturnDate() {
		return returnDate;
	}

	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	
}
