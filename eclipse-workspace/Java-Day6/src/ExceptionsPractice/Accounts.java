package ExceptionsPractice;

public class Accounts {
	
	public void netSalary(int salary, int absences) throws QAException{
		
		float  netSal = 0;
		
		if (absences > 0) {
			QAException E = new QAException();
			throw E;
			}
		else {
			netSal = salary;
			System.out.println(netSal);
		}
	}

}
