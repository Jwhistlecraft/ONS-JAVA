package ArrayPractice2;

public class CharCounter {

	public void counter(String x) {
		
		System.out.println("Do you want to see a magic trick?");
		System.out.println("watch as i count all lower and uppercase letters in " + x +" WUHAHAHAHA...."
				+ "\n");

		String upperCased = x.toUpperCase();
		char[] capitals = upperCased.toCharArray();
		char[] alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
		int count = 0;

		for (int i = 0; i < alphabet.length; i++) {
			for (int j = 0; j < capitals.length; j++) {
				if (alphabet[i] == capitals[j]) {
					count++;
				}

			}
			if(count>=1) {
				System.out.println("there are " + count + " " + alphabet[i] + "s in " + x);
			}
			count =0;
			
		}
		
		System.out.println("\nTAAAAADAAAAAAAAAH!!! \nThank you, thank you, thank you very much my friends.");

	}

}
