package BankConstructorOverload;

public class Bank {
	
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		Accounts hsbc1= new Accounts(1);
		Accounts hsbc2= new Accounts(1,2);
		Accounts hsbc3= new Accounts(1,2,3);
		Accounts hsbc4= new Accounts(1,2,3,4);
	}
}
