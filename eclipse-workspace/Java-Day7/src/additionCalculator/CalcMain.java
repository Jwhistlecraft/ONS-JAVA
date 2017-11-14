package additionCalculator;

import java.awt.*;
import java.awt.FlowLayout;

public class CalcMain {
	public static void main(String arg[]) {

		TextField t1 = new TextField(10);
		TextField t2 = new TextField(10);
		TextField t3 = new TextField(10);
		Button b1 = new Button("+");
		
		Frame f = new Frame("Calculator");
		FlowLayout fl = new FlowLayout();

		f.setLayout(fl);
		f.add(t1);
		f.add(t2);
		f.add(b1);
		f.add(t3);

		f.setSize(450, 100);
		f.setVisible(true);

		eventPlus e1 = new eventPlus(t1, t2, t3);
		b1.addActionListener(e1);

	}

}
