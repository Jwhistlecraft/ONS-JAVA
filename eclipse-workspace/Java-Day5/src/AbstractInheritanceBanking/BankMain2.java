package AbstractInheritanceBanking;

public class BankMain2 {
	public static void main(String args[]) {
		
		HSBC test = new HSBC();
		test.deposite(100);
		test.withdraw(50);
		test.balance();
			
		
	}
	public static void banking(AbstractBankClass x) {
		x.deposite(0);
		x.withdraw(0);
		x.balance();
		
	}

}
