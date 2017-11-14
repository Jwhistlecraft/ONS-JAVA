package ImprovedCalculator;

import java.awt.*;

public class CalcMain4 {
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

		eventPerform e = new eventPerform(t1, t2, t3);
		b1.addActionListener(e);
		b2.addActionListener(e);
		b3.addActionListener(e);
		b4.addActionListener(e);

	}

}
