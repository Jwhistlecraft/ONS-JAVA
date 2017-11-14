package TimesTablesForloops;

public class TimesTable2 {

	public void calculation(int A) {
		System.out.println("Printing the " + A + " times table:\n");

		int i = 1;
		for (i = 1; i <= 10; i++) {
			System.out.println(A + "*" + i + "=" + (i * A));
		}

		System.out.println("\nFinished my friends!");
	}

	public void calculation2(int x, int y) {

		if (x < y) {

			for (x = 1; x <= y; x++) {
				System.out.println("\nPrinting the " + x + " times table:\n");
				
				int i = 1;
				for (i = 1; i <= 10; i++) {
					System.out.println(x + "*" + i + "=" + (i * x));
				}
			}
			System.out.println("\nFinished my friends!");

		} else {

			for (x = 1; x >= y; x--) {
				System.out.println("\nPrinting the " + x + " times table:\n");
	
				int i = 1;
				for (i = 1; i <= 10; i++) {
					System.out.println(x + "*" + i + "=" + (i * x));
				}
			}
			System.out.println("\nFinished my friends!");

		}
	}
}
