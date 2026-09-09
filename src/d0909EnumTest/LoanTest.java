package d0909EnumTest;

import java.util.ArrayList;
import java.util.List;

public class LoanTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> cl = new ArrayList<>();
		Customer c1 = new Customer("짱구",5);
		cl.add(c1);
		cl.add(new Customer("철수",5));
		cl.add(new Customer("맹구",5));
		cl.add(new Customer("유리",5));
		
		cl.get(0).setRepaymentStatus(RepaymentStatus.OVERDUE);
		cl.get(1).setRepaymentStatus(RepaymentStatus.ACTIVE);
		cl.get(2).setRepaymentStatus(RepaymentStatus.OVERDUE);
		cl.get(3).setRepaymentStatus(RepaymentStatus.COMPLETED);
		for(Customer c : cl) {
			System.out.println(c);
		}
		
		
		
	}

}
