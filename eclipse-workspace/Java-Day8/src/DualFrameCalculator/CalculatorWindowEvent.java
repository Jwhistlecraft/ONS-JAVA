package DualFrameCalculator;

import java.awt.Event;
import java.awt.Frame;
import java.awt.event.*;


public class CalculatorWindowEvent implements WindowListener {

	public void windowActivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowClosed(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowClosing(WindowEvent arg0) {        //here the important part is the arg0, which is getting the 
		                                                 //source from the call and then setting the frame to not visible
		Frame f = (Frame) arg0.getSource();
		f.setVisible(false);
		
	}

	public void windowDeactivated(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowDeiconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowIconified(WindowEvent arg0) {
		// TODO Auto-generated method stub

	}

	public void windowOpened(WindowEvent arg0) {
		// TODO Auto-generated method stub
	}

}
