package DualFrameCalculator;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculations implements ActionListener {
;
	String buttonLabel;
	int tempResult;
	TextField FIRSTNUM;
	TextField SECONDNUM;
	TextField RESULT;
	

	public Calculations(TextField A, TextField B, TextField C, String label) {

		FIRSTNUM = A;
		SECONDNUM = B;		
		RESULT = C;
		buttonLabel = label;	

	}

	public void actionPerformed(ActionEvent arg0) {
		
		int int1 = Integer.parseInt(FIRSTNUM.getText());
		int int2 = Integer.parseInt(SECONDNUM.getText());
		
		if (buttonLabel == "+") {
			 tempResult = int1 + int2; 
		}
		if (buttonLabel == "-") {
			 tempResult = int1 - int2;
		}
		if (buttonLabel == "/") {
			 tempResult = int1 / int2;
		}
		if (buttonLabel == "*") {
			 tempResult = int1 * int2;
		}
		RESULT.setText(Integer.toString(tempResult));
	}

}
