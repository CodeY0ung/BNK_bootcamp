package d0909PrinterTetst;

public class BlackWhitePrinter implements Printable {

	@Override
	public void print(Doc doc) {
		System.out.println("흑백으로 출력합니다.");
		System.out.println(doc);
	}
	
	@Override
	public String toString() {
		return "흑백 프린터 입니다.";
	}
	
}
