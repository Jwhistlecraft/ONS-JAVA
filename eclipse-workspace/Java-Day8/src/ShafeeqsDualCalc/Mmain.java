package ShafeeqsDualCalc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class Mmain {
	static SecondWindow win;

	static {
	win = new SecondWindow("calculations");
	}
	
	public static void main(String arg[]) {
		
		MainWindowsEvents ME = new MainWindowsEvents();
		
		Frame F = new Frame("CAlculations");
		F.setLayout(new GridLayout(4,1));
		Button B1 = new Button("Addition");
		Button B2 = new Button("Subtract");
		F.add(B1);
		F.add(B2);
		F.setSize(400,400);
		F.setVisible(true);
		
		F.addWindowListener(ME);
		B1.addActionListener(ME);
		B2.addActionListener(ME);
	}

}
