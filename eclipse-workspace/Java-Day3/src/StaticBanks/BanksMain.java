package StaticBanks;

public class BanksMain {
	
	public static void  main(String args[]) {
		BankClass HSBC,Barclays,Natwest;
		
		HSBC= new BankClass();
		Barclays= new BankClass();
		Natwest= new BankClass();
		
		HSBC.setDollar(100);
		Natwest.amount(10);
		Natwest.setDollar(10);
		Barclays.amount(2);
	}

}
