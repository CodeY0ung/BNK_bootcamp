package d0827;

public class Test {

	public static void main(String[] args) {

		PigMoneyBox pmb = new PigMoneyBox();
		
		pmb.deposit(1000);
		pmb.deposit(0);
		pmb.deposit(-1);
		
		pmb.withdraw(1000);
		pmb.withdraw(0);
		pmb.withdraw(-1);
		
		System.out.println("잔액 : "+pmb.getBalance());

	}

}
