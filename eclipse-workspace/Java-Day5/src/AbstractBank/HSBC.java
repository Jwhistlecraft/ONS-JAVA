package AbstractBank;

public class HSBC extends AbstractClass{
	
	
	int amount=0;
	
	public void withdraw(int A) {
	amount -= A;
	}
	public void deposite(int A) {
	amount += A;	
	}
	public void balance() {
		System.out.println(amount);
	}
}
