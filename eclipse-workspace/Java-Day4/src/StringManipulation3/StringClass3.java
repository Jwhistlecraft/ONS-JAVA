package StringManipulation3;

public class StringClass3 {

	public static void main(String args[]) {

		String example = "I am going to manchester";
		String newString = "";

		for (int i = 0; i < example.length(); i++) {

			String alpha = example.substring(i, i + 1);

			if (alpha.equals(" ")) {
				System.out.println(newString);
				newString = "";
			} 
			else {
				newString += example.substring(i, i + 1);
			}
		}
		System.out.println(newString);
	}
}
