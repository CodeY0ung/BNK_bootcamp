package d0909PrinterTetst;

public class ColorPrinter implements Printable {

	@Override
	public void print(Doc doc) {
		System.out.println("컬러로 출력합니다.");
		System.out.println(doc);
	}
	
	@Override
	public String toString() {
		return "칼라 프린터 입니다.";
	}
}
