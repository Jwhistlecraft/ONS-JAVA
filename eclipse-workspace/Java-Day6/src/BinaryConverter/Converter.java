package BinaryConverter;

public class Converter {

	public void toBinary(int a) {

		int b = 0;

		String BString = "";

		while (a >= 1) {
			if (a % 2 == 0) {
				BString = BString + "0";
			}
			if (a % 2 != 0) {
				BString = BString + "1";
			}

			a /= 2;
		}

		String BstringReverse = new StringBuilder(BString).reverse().toString();
		int finalBinary = Integer.parseInt(BstringReverse);

		System.out.println(finalBinary);
	}

	public void toDecimal() {

	}

	public void toDecimal(String a) {

		int bits = 1;
		int aInt = 0;
		int finalInt = 0;

		for (int i = 0; i < a.length(); i++) {

			aInt = Integer.parseInt(a.substring(i, i + 1));

			finalInt = finalInt + (bits * aInt);

			bits = (bits * 2);

		}

		System.out.println(finalInt);

	}
}
