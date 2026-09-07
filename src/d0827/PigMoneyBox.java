package d0827;

public class PigMoneyBox {
	
	// 잔액
	private int balance;
	
	// 10000원으로 초기화
	public PigMoneyBox() {
		System.out.println("돼지저금통이 생성되었습니다.");
		System.out.println("장려금으로 10000원이 지급되었습니다.");
		balance = 10000;
	}
	
	// setter
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// getter
	public int getBalance() {
		return balance; 
	}
	
	// 입금
	public void deposit(int amount) {
		// 0 이하의 수를 입금할 수 없다
		if(amount <= 0) {
			System.out.println("0원 이상 입금해야 합니다.");
		}
		else {
			// 입금한 금액 만큼 잔액이 증가한다
			balance += amount;
		}
	}
	
	// 출금
	public void withdraw(int amount) {
		// 잔액보다 많이 출금할 수 없다
		if(amount > balance) {
			System.out.println("잔액이 부족합니다.");
		}
		else if(amount <= 0) {
			// 0보다 큰 수를 출금해야한다
			System.out.println("0원 이상 출금해야 합니다.");
		}
		else {
			// 출금 한 금액만큼 잔액이 감소한다
			balance -= amount;
		}
	}
}
