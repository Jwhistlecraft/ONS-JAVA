package TraditionalCalculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventPerform2 implements ActionListener {

	TextField screen;
	
	public eventPerform2(TextField A) {
		screen = A;
	}

	public void actionPerformed(ActionEvent e2) {
		Button btn;
		String calculation = "";

		btn = (Button) e2.getSource();
		String op = btn.getLabel();

		calculation = screen.getText() + op;
		screen.setText(calculation);
	}
}