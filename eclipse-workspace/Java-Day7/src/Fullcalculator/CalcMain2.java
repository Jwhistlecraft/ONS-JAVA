package Fullcalculator;

import java.awt.*;
import java.awt.FlowLayout;

public class CalcMain2 {
	public static void main(String arg[]) {

		TextField t1 = new TextField(10);
		TextField t2 = new TextField(10);
		TextField t3 = new TextField(10);
		Button b1 = new Button("+");
		Button b2 = new Button("-");
		Button b3 = new Button("/");
		Button b4 = new Button("*");

		Frame f = new Frame("Calculator");
		FlowLayout fl = new FlowLayout();

		f.setLayout(fl);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.add(b4);
		f.add(t3);

		f.setSize(450, 100);
		f.setVisible(true);

		eventPlus e1 = new eventPlus(t1, t2, t3);
		b1.addActionListener(e1);

		eventSubtract e2 = new eventSubtract(t1, t2, t3);
		b2.addActionListener(e2);
		
		eventDivide e3 = new eventDivide(t1, t2, t3);
		b3.addActionListener(e3);
		
		eventMultiply e4 = new eventMultiply(t1, t2, t3);
		b4.addActionListener(e4);

	}

}
