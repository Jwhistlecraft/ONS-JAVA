package Fullcalculator;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class eventPlus implements ActionListener {

	TextField tt1, tt2, tt3;

	public eventPlus(TextField A, TextField B, TextField C) {
		tt1 = A;
		tt2 = B;
		tt3 = C;
	}


	public void actionPerformed(ActionEvent e2) {
		int a= 0;
		int b= 0;
		int c =0;
		
		a = Integer.parseInt(tt1.getText());
		b = Integer.parseInt(tt2.getText());
		c = a + b;
		tt3.setText(Integer.toString(c));
		
	}

}
