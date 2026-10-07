package d1007_inner_class;

public class UseMemberInner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Papers p = new Papers("서류내용 : 행복합니다.");
		
		Printable prn = p.getPrinter();
		prn.print();

	}

}
