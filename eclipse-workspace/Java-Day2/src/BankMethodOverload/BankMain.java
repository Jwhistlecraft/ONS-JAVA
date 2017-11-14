package BankMethodOverload;

public class BankMain {
	public static void main(String args[]) {
		float NetSalary= 0;
		BankClass ONS = new BankClass();
		ONS.Tax();
		System.out.println(ONS.Tax(1500));
		System.out.println(ONS.Tax(1500,21));
	}

}
