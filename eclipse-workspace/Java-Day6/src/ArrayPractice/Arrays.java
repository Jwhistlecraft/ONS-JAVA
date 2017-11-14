package ArrayPractice;

public class Arrays {

	public static void main(String args[]) {

		

		int array2rows[][] = { { 8, 9, 19, 11, }, { 12, 13, 14, 15 } };
		int array3rows[][] = { { 8, 9, 19, 11, }, { 12, 13, 14, 15 }, { 15, 16, 18, 19 } };
		
		System.out.println("this is the first array");
		display(array2rows);
		
		System.out.println("this is the second array");
		display(array3rows);
	}
	
	
	public static void display(int x[][]) {
		
		int column;
		int row;

		for ( row = 0; row < x.length; row++) {                
			for ( column = 0; column < x[row].length; column++)
				System.out.print(x[row][column] + "\t");
		}
		System.out.println();
	}
}
