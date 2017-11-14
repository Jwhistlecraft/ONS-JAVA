package StringManipulation1;

public class StringClass {
	public static void main(String args[]) {

		String example = "I am going to manchester";

		int count = 1;

		for (int i = 0; i < example.length(); i++) {

			String alpha = example.substring(i, i + 1);

			if (alpha.equals(" ")) {

				count = count + 1;

			}
		}
	 System.out.println(count);
	}
}
