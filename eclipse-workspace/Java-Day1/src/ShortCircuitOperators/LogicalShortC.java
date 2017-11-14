package ShortCircuitOperators;

public class LogicalShortC {
	public static void main(String args[]) {

		int A1, B1;
		A1 = B1 = 10;

		if (A1++ > 15 && B1++ < 20) {
			System.out.println("A1");
		} else {
			System.out.println("B1");
		}

		System.out.println("A=" + A1);
		System.out.println("B1=" + B1);

		// here we can see due to the short circuit && A increments but B doesn't

		int A2, B2;
		A2 = B2 = 10;

		if (A2++ > 15 & B2++ < 20) {
			System.out.println("A2");
		} else {
			System.out.println("B2");
		}

		System.out.println("A2=" + A2);
		System.out.println("B2=" + B2);

		//here we can see that due to the normal & both A and B increment
		
	}

}
