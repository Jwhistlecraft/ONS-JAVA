package TraditionalCalculator;

import java.awt.*;
import java.awt.FlowLayout;

public class CalcMain4 {
	public static void main(String arg[]) {

		Button b16 = new Button("c");
		Button b15 = new Button("=");
		Button b14 = new Button("/");
		Button b13 = new Button("*");
		Button b12 = new Button("-");
		Button b11 = new Button("+");
		Button b10 = new Button("0");
		Button b9 = new Button("1");
		Button b8 = new Button("5");
		Button b7 = new Button("4");
		Button b6 = new Button("3");
		Button b5= new Button("2");
		Button b4 = new Button("9");
		Button b3 = new Button("8");
		Button b2 = new Button("7");
		Button b1= new Button("6");
		
		Frame f = new Frame("Calculator");
		Panel p1 =  new Panel();
		Panel p2 = new Panel();
		TextField screen = new TextField(40);
		GridLayout g = new GridLayout(4,4);
		
		f.add(p1,BorderLayout.NORTH);
		f.add(p2);
		
		p1.add(screen);
			
		p2.setLayout(g);
		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		p2.add(b7);
		p2.add(b8);
		p2.add(b9);
		p2.add(b10);
		p2.add(b11);
		p2.add(b12);
		p2.add(b13);
		p2.add(b14);
		p2.add(b15);
		p2.add(b16);

		f.setSize(400, 400);
		f.setVisible(true);

		eventPerform e = new eventPerform(screen);
	
		
		b11.addActionListener(e);
		b12.addActionListener(e);
		b13.addActionListener(e);
		b14.addActionListener(e);
		b15.addActionListener(e);
		b16.addActionListener(e);
		
		eventPerform2 e2 = new eventPerform2(screen);
		
		
		b1.addActionListener(e2);
		b2.addActionListener(e2);
		b3.addActionListener(e2);
		b4.addActionListener(e2);
		b5.addActionListener(e2);
		b6.addActionListener(e2);
		b7.addActionListener(e2);
		b8.addActionListener(e2);
		b9.addActionListener(e2);
		b10.addActionListener(e2);
	}

}
