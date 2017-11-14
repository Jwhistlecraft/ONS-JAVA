package Exceptions;

public class Main {
	public static void main(String args[]) {
		
		int A, B;
		float C;

		try {
			A = Integer.parseInt(args[0]);
			B = Integer.parseInt(args[1]);	
			
			C = A / B;
			System.out.println(C);

		} catch (ArithmeticException x) {
			System.out.println("cannot divide by zero");
		} 
		catch (ArrayIndexOutOfBoundsException x) {
			System.out.println("index is out of bounds");
		} 
		catch (NumberFormatException x) {
			System.out.println("Not a parsable string");
		}

	}

}
