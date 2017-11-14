package TimesTables;

public class TimesTable {
	public void calculation(int A) {
		System.out.println("Printing the " + A + " times table:\n");
		int i = 1;
		while (i <= 10) {
			System.out.println(A + "*" + i + "=" + (i * A));

			i++;
		}
		System.out.println("\nFinished my friends!");
	}
	
	
	public void calculation2(int x, int y) {
		
		if(x < y ) {
			
			while (x <= y) {	
			
				System.out.println("\nPrinting the " + x + " times table:\n");
				int i= 1;
				while (i <= 10) {
				
					System.out.println(x + "*" + i + "=" + (i * x));
			
					i++;
				}
				x++;
			}
			System.out.println("\nFinished my friends!");
	
		}else {
			
			while (x >= y) {	
			
				System.out.println("\nPrinting the " + x + " times table:\n");
				int i= 1;
				while (i <= 10) {
				
					System.out.println(x + "*" + i + "=" + (i * x));
			
					i++;
				}
				x--;
			}
			System.out.println("\nFinished my friends!");
			
		}
		
	}
}
