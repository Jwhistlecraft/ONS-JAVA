package ShafeeqsDualCalc;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class MainWindowsEvents extends WindowAdapter implements ActionListener{
	
	public void windowClosing(WindowEvent X) {
		System.exit(0);
	}

	
	public void actionPerformed(ActionEvent J) {
		Button Btn = (Button)J.getSource();
		String T = Btn.getLabel();
		Mmain.win.ShowWindow(T);
		
	}


}
