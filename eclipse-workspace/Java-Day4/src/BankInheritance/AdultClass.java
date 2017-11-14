package BankInheritance;

public class AdultClass {
	int amount;

	public void deposite(int A) {
		amount += A;
	}

	final public void withdraw(int x) {
		if (x < amount) {
			amount -= x;
		}
		else {
			System.out.println("not enough funds");
		}
	}
}
