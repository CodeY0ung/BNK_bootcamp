package d0909PrinterTetst;

import java.util.ArrayList;
import java.util.List;

public class PrinterTest {

	public static void main(String[] args) {

		List<Printable> pl = new ArrayList<>();
		
		Doc doc = new Doc("안녕하세요. 반갑습니다.");
		BlackWhitePrinter bw = new BlackWhitePrinter();
		ColorPrinter c = new ColorPrinter(); 
		MixedPrinter m = new MixedPrinter();
		
		pl.add(bw);
		pl.add(c);
		pl.add(m);
		
		
		for(Printable p : pl) {
			System.out.println(p);
			p.print(doc);
			System.out.println("");
		}
		
		m.duplicate(doc);
		m.Scan(doc);
	}
}
