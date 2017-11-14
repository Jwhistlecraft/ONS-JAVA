package StaticBanks;

public class BankClass {
	
	int A;
	static int Dollar;
	
	public void setDollar(int X) {
		Dollar = X;
	}
	
	public void amount(int Y) {
		System.out.println("Amount =" + (Dollar*Y));
	}
	
	public void show() {
		System.out.println(A);
	}
}
