package OddEvenChallenge;

public class ChallengeClass {
	
public static void main(String args[]) {

		String evens = "";
		int i;

		for (i = 1; i <= 10; i++) {
			if (i % 2 == 0) {
				evens += i;
				System.out.println(evens);
			} 
			
			else {
				evens += i;
				System.out.println(i);
			}
		}
	}

}

