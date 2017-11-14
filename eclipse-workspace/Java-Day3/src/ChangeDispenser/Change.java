package ChangeDispenser;

public class Change {

	public void ChangeCalc(float A, float B) {

		float paid = B;
		float amount = A;
		String results = "";

		float changeDue = paid - amount;
		System.out.println("Change due:" + changeDue + "\n");

		if (changeDue > 50 ) {
			results += ((int)changeDue/50) + " £50 note ";
			changeDue = changeDue - ((int)changeDue/50 )*50;
		}
		if (changeDue > 20 ) {
			results += ((int)changeDue/20) + " £20 note ";
			changeDue = changeDue - ((int)changeDue/20 )*20;
		}
		if (changeDue > 10) {
			results += ((int)changeDue/10) + "  £10 note ";
			changeDue = changeDue - 10f;
		}
		if (changeDue > 5 && changeDue < 10) {
			results += " £5 note ";
			changeDue = changeDue - 5f;
		}
		if (changeDue > 2 ) {
			results += ((int)changeDue/2) + " £2 coin ";
			changeDue = changeDue -((int)changeDue/2 )*2;
		}
		if (changeDue > 1 ) {
			results +=((int)changeDue/1) + " £1 coin ";
			changeDue = changeDue - ((int)changeDue/1)*1;
		}
		if (changeDue > .5f && changeDue < 1) {
			results += " 50p coin ";
			changeDue = changeDue - .5f;
		}
		if (changeDue > .2f ) {
			results += ((int)(changeDue/.2f)) + " 20p coin ";
			changeDue = changeDue - ((int)(changeDue/.2f))*.2f;
		}
		if (changeDue > .1f ) {
			results += ((int)(changeDue/.1f)) + " 10p coin ";
			changeDue = changeDue - ((int)(changeDue/.1f))*.1f;
		}
		if (changeDue > .05f && changeDue < .1f) {
			results += ((int)(changeDue/.05f)) + " 5p coin ";
			changeDue = changeDue - ((int)(changeDue/.05f))*.05f;
		}
		if (changeDue > .02f ) {
			results += ((int)(changeDue/.02f)) + " 2p coin ";
			changeDue = changeDue - ((int)(changeDue/.02f))*.02f;
		}
		if (changeDue > .01f ) {
			results += ((int)(changeDue/.01f)) + " 1p coin ";
			changeDue = changeDue - .01f;
		}
		if (changeDue < .01f) {
			results += " is due to the customer\n\n";
		}
		System.out.println(results);
	}
}
