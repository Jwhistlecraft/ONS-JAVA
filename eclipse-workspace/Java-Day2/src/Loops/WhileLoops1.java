package Loops;

public class WhileLoops1 {
	public static void main(String args[]) {
		int A = 1;
		while (A <= 10) {
			System.out.println(A);
			if (A % 2 == 0) {
				System.out.println("even");
			} else
				System.out.println("false");
			A++;
		}
	}
}
