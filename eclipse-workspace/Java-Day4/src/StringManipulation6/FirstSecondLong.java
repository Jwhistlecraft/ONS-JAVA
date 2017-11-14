package StringManipulation6;

public class FirstSecondLong {
	public void finder(String A) {
		
		String example = A + " ";
		String newString = "";
		int counter1 = 0;
		int counter2 = 0;
		String finalString = "";

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
	
	
		String secondExample = example.replace(finalString, " ");
		String newString2= "";
		int counter3 = 0;
		int counter4 = 0;
		String finalString2 = "";
		
		for (int i = 0; i < secondExample.length(); i++) {

			String beta = secondExample.substring(i, i + 1);

			if (beta.equals(" ")) {

				counter3 = newString2.length();

				if (newString2.length() > finalString2.length()) {

					finalString2 = newString2;				
				}

				if (counter3 > counter4) {
					counter4 = counter3;
				}
				newString2 = "";                                 
				
			} else {
				newString2 += secondExample.substring(i, i + 1);
			}
		}
		System.out.println(finalString2 + " has the 2nd most charectors with " + counter4);		
	}	
}

