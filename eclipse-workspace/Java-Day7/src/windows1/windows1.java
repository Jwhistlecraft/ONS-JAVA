package windows1;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class windows1 {
	public static void main(String args[]) {
		Frame win =new Frame("First Windows App");
		Button b1 = new Button("click1");
		Button b2 = new Button("click2");
		Button b3 = new Button("click3");
		Button b4 = new Button("click4");
		Button b5 = new Button("click5");
		win.add(b1,BorderLayout.NORTH);
		win.add(b2,BorderLayout.EAST);
		win.add(b3,BorderLayout.SOUTH);
		win.add(b4,BorderLayout.WEST);
		win.add(b5,BorderLayout.CENTER);
		
		win.setSize(400,400);
		win.setVisible(true);
		
	}

}
