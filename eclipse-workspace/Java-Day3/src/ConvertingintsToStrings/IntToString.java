package ConvertingintsToStrings;

public class IntToString {

	public String ones(int A) {

		String word = "";
		switch (A) {
		case 1:
			word = (" One");
			break;
		case 2:
			word = (" Two");
			break;
		case 3:
			word = (" Three");
			break;
		case 4:
			word = (" Four");
			break;
		case 5:
			word = (" Five");
			break;
		case 6:
			word = (" Six");
			break;
		case 7:
			word = (" Seven");
			break;
		case 8:
			word = (" Eight");
			break;
		case 9:
			word = (" Nine");
			break;
		case 10:
			word = (" Ten");
			break;
		case 11:
			word = (" Eleven");
			break;
		case 12:
			word = (" Twelve");
			break;
		case 13:
			word = (" Thirteen");
			break;
		case 14:
			word = (" Fourteen");
			break;
		case 15:
			word = (" Fifteen");
			break;
		case 16:
			word = (" Sixteen");
			break;
		case 17:
			word = (" Seventeen");
			break;
		case 18:
			word = (" Eighteen");
			break;
		case 19:
			word = (" Nineteen");
			break;
		}
		return word;
	}

	public String tens(int A) {

		String word = "";
		switch (A) {

		case 1:
			word = (" Twenty");
			break;
		case 2:
			word = (" thirty");
			break;
		case 3:
			word = (" Fourty");
			break;
		case 4:
			word = (" Fifity");
			break;
		case 5:
			word = (" Sixty");
			break;
		case 6:
			word = (" Seventy");
			break;
		case 7:
			word = (" Eighty");
			break;
		case 8:
			word = (" Ninty");
			break;
		}
		return word;
	}

}
