package ImprovedCalculator;

import java.awt.Button;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventPerform implements ActionListener {

	TextField tt1, tt2, tt3;

	public eventPerform(TextField A, TextField B, TextField C) {
		tt1 = A;
		tt2 = B;
		tt3 = C;
	}

	public void actionPerformed(ActionEvent e2) {
		int a = 0;
		int b = 0;
		int c = 0;
		Button btn;

		a = Integer.parseInt(tt1.getText());
		b = Integer.parseInt(tt2.getText());

		btn = (Button) e2.getSource();
		String t = btn.getLabel();

		if (t.equals("+")) {
			c = a + b;
		}
		if (t.equals("-")) {
			c = a - b;
		}
		if (t.equals("/")) {
			c = a / b;
		}
		if (t.equals("*")) {
			c = a * b;
		}

		tt3.setText(Integer.toString(c));

	}

}
