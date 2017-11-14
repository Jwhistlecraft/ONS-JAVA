package ShafeeqsDualCalc;

import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class SecondWindowEvents extends WindowAdapter implements ActionListener {

	public void windowClosing(WindowEvent e) {
		Mmain.win.setVisible(false);

	}

	public void actionPerformed(ActionEvent S) {
		String T = Mmain.win.getTitle();

		int A, B, C = 0;

		A = Integer.parseInt(Mmain.win.T1.getText());
		B = Integer.parseInt(Mmain.win.T2.getText());

		if (T.equals("Addition")) {
			C = A + B;
		}
		if (T.equals("Subtract")) {
			C = A - B;
		}
		
		Mmain.win.T3.setText(Integer.toString(C));
	
	}

}
