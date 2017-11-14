package AbstractBank;

public class BankMain {
	public static void main(String args[]) {
		HSBC test = new HSBC();
		test.deposite(100);
		test.withdraw(50);
		test.balance();
	}

}
