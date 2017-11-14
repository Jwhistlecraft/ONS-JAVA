package StringManipulation5;

public class LongFinder {

	public void finder(String A) {

		String example = A + " ";
		String newString = "";
		int counter1 = 0;
		int counter2 = 0;
		String finalString = "0";

		for (int i = 0; i < example.length(); i++) {

			String alpha = example.substring(i, i + 1);

			if (alpha.equals(" ")) {

				counter1 = newString.length();

				if (newString.length() > finalString.length()) {

					finalString = newString;
				
				}

				if (counter1 > counter2) {
					counter2 = counter1;
				}
				newString = "";                                 
				
			} else {
				newString += example.substring(i, i + 1);
			}
		}
		System.out.println(finalString + " has the most charectors with " + counter2);
	}

}
