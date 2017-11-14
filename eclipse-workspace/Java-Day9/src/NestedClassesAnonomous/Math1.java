package NestedClassesAnonomous;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Math1 {
	TextField T1, T2, T3;
	Button B1, B2;
	int A,B,C;
	

	public Math1() {

		Frame f = new Frame("hello");

		T1 = new TextField();
		T2 = new TextField();
		T3 = new TextField();
		B1 = new Button("+");
		B2 = new Button("-");

		f.setLayout(new FlowLayout());
		f.add(T1);
		f.add(T2);
		f.add(B1);
		f.add(B2);
		f.add(T3);
		

		f.setSize(400, 400);
		f.setVisible(true);

		B1.addActionListener(

				new ActionListener() {
					public void actionPerformed(ActionEvent x) {
						

						A = Integer.parseInt(T1.getText());
						B = Integer.parseInt(T2.getText());
						C = A+B;
						
						T3.setText(Integer.toString(C));
						
					}
				}
			);
		
		B2.addActionListener(

				new ActionListener() {
					public void actionPerformed(ActionEvent x) {
											

						A = Integer.parseInt(T1.getText());
						B = Integer.parseInt(T2.getText());
						C = A-B;
						
						T3.setText(Integer.toString(C));
						
					}
				}
			);
		
		f.addWindowListener(new WindowAdapter() { 			
			
					public void windowClosing(WindowEvent e) {
						System.exit(0);
					
					}		
				}		
			);
	}

}
