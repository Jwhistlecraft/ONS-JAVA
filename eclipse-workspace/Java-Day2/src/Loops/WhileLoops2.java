package Loops;

public class WhileLoops2 {
	public static void main(String args[]) {
		int A = 1;
		while (A <= 10) {
			int B = 1;
			while (B <= A) {
				System.out.println(A);
				B++;
			}
			A++;
		}
	}
}
