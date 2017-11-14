package windows2;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class windows2 {
	public static void main(String args[]) {
		
		Frame win =new Frame("First Windows App");
		Button b1 = new Button("click1");
		Button b2 = new Button("click2");
		
		win.add(b1,BorderLayout.NORTH);
		win.add(b2,BorderLayout.EAST);
		
		B1Handler E = new B1Handler();
		B2Handler F = new B2Handler(b1);
		
		b1.addActionListener(E);
		b2.addActionListener(F);

		win.setSize(400,400);
		win.setVisible(true);
		
	}

}