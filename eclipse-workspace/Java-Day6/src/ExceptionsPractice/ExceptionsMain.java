package ExceptionsPractice;

public class ExceptionsMain {
	public static void main(String args[]) {
		Accounts test = new Accounts();
		try {
			test.netSalary(1000,15);
			}
		catch (QAException x) { 
			System.out.println(x.toString());
	}
}
}
