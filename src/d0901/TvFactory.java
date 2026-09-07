package d0901;

public class TvFactory {

	private String brandName;
	
	public TvFactory(String brandName) {
		this.brandName = brandName;
	}
	
	public Tv getBrand() {
		if(brandName.equals("LG")) {
			return new LgTv();
		}
		else if(brandName.equals("삼성")) {
			return new SamsungTv();	
		}
		else {
			return null;
		}
	}
	
}
