package d0909PrinterTetst;

public class MixedPrinter implements Printable, Scannable, Duplicatable{

	@Override
	public void duplicate(Doc doc) {
		System.out.println("문서를 복사합니다.");
		System.out.println(doc);
	}

	@Override
	public void Scan(Doc doc) {
		System.out.println("문서를 스캔합니다.");
		System.out.println(doc);
	}

	@Override
	public void print(Doc doc) {
		System.out.println("문서를 출력합니다.");
		System.out.println(doc);
	}
	
	@Override
	public String toString() {
		return "복합기 입니다.";
	}
}
