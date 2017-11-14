package StringMaipulation4;

public class StringFinder {

	public void finder(String text, String find) {

		int count = 0;
		for (int i = 0; i < text.length() + 1 - find.length(); i++) {    // the +1 to length is needed in the case both
																	     // text and find are the same length
			String alpha = text.substring(i, i + find.length());

			if (alpha.equals(find)) {

				count++;
			}
		}
		if (count == 1) {
			System.out.println("too easy Shafeeq, " + find + " appears " + "once in " + "'" + text + "'" );
		}
		else if (count > 1) {
			System.out.println("too easy Shafeeq, " + find + " appears " + count + " times in " + "'" + text + "'" );
		}
		else {
			System.out.println("don't be daft shafeeq, you are asking me to find a word which is longer than the text! Impossible!");
		}
	}
}
