package StringManipulation2;

public class StringClass2 {

	public static void main(String args[]) {

		String example = "I am going to manchester";
		String newString = "";

		for (int i = example.length(); i > 0; i--) {

			String alpha = example.substring(i - 1, i);

			if (alpha.equals(" ")) {
				System.out.println(new StringBuilder(newString).reverse().toString());
				newString = "";
			} else {
				newString += example.substring(i - 1, i);
			}
		}
		System.out.println(new StringBuilder(newString).reverse().toString());
	}
}
