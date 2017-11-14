package ConvertingintsToStrings;

public class DigitToWords {

	public String Convert(int A) {
		IntToString convertion = new IntToString();

		String answer = "";
		if (A >= 1000 & A <= 9999) {
			answer += convertion.ones(A / 1000) + " Thousand";
			A = A - (A / 1000 * 1000);
		}
		if (A >= 100 & A < 1000) {
			answer += convertion.ones(A / 100) + " Hundered";
			if (A- (A/100*100)>0)
			answer += " and";	
			A = A - (A / 100 * 100);
		}
		if (A >= 20 & A < 100) {
			answer += convertion.tens(A / 10);
			A = A - (A / 10 * 10);
		};
		if (A < 20) {
			answer += convertion.ones(A);
		}
		return answer;
	}

}
