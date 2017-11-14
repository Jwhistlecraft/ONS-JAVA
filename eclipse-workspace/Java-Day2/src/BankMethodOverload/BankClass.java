package BankMethodOverload;

public class BankClass {
	
	public void Tax() {
		System.out.println("Tax rate:" + 15);
	}
	
	public float Tax(int salary) {
		
		float T = (salary*15)/100;
		return T;
	}
	
	public float Tax(int S, float T) {
		
		float Tax = (S*T)/100;
		return Tax;
	}

}
