package d0914Library;

public class OnetimeBooks {
	
	private Long obid;
	private static Long cnt;
	private Long rid;
	private Long bid;
	
	public OnetimeBooks(Long rid, Long bid) {
		obid = ++cnt;
		this.rid = rid;
		this.bid = bid;
	}
	
	public Long getId() {
		return obid;
	}

}
