package TraditionalCalculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventPerform implements ActionListener {

	TextField screen;
	int firstInt = 0;
	String operator = "";

	public eventPerform(TextField A) {
		screen = A;
	}

	public void actionPerformed(ActionEvent e) {
		Button btn;
		String calculation = "";
		

		btn = (Button) e.getSource();
		String op = btn.getLabel();
		
		calculation = screen.getText();
		
		if (op.equals("+")) {
			firstInt = Integer.parseInt(calculation);
			screen.setText("");
			operator = "+";
		}
		if (op.equals("-")) {
			firstInt = Integer.parseInt(calculation);
			screen.setText("");
			operator = "-";
		}
		if (op.equals("/")) {
			firstInt = Integer.parseInt(calculation);
			screen.setText("");
			operator = "/";
		}
		if (op.equals("*")) {
			firstInt = Integer.parseInt(calculation);
			screen.setText("");
			operator = "*";
		}
		if (op.equals("=")) {
			
			if (operator.equals("+")) {
				firstInt += Integer.parseInt(calculation);	
			}
			if (operator.equals("-")) {
				firstInt -= Integer.parseInt(calculation);
			}	
			if (operator.equals("*")) {
				firstInt *= Integer.parseInt(calculation);	
			}
			if (operator.equals("/")) {
				firstInt /= Integer.parseInt(calculation);	
			}
			screen.setText(Integer.toString(firstInt));	
			
		}
		if(op.equals("c")) {
			firstInt = 0;
			screen.setText("");
		}
	}
}
