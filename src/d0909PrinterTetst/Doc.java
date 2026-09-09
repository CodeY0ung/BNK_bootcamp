package d0909PrinterTetst;

public class Doc {

	private String content;
	
	public Doc(String content) {
		this.content = content;
	}
	
	@Override
	public String toString() {
		return "----- 문서 내용 -----\n"+content;
	}
}
