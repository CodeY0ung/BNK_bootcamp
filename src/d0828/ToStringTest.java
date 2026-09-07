package d0828;

public class ToStringTest {

	private int n;
	private String s;
	
	public void setN(int n) {
		this.n = n;
	}
	
	public int getN() {
		return n;
	}
	
	public void setS(String s) {
		this.s = s;
	}
	
	public String getS() {
		return s;
	}
	
	@Override
	public String toString() {
		return "n : "+n+", s : "+s;
	}
}
