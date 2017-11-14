package WindowActionCounter;

import java.awt.TextField;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MainWindowEvent implements WindowListener {
	
	TextField Minimize;
	TextField Maximize;
	TextField Activated;
	TextField Deactivated;
	
	int wAcount = 0;
	int wDAcount = 0;
	int wIcount = 0;
	int wDIcount = 0;
	
	
	public MainWindowEvent(TextField A, TextField B, TextField C, TextField D) {
		
		Minimize = A;
		Maximize = B;
		Activated = C;
		Deactivated = D;
		
	}
	
		public void windowActivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			wAcount++;
			Activated.setText(Integer.toString(wAcount));
		}
	
		public void windowClosed(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
	
		public void windowClosing(WindowEvent arg0) {
			// TODO Auto-generated method stub
			System.exit(0);
		}
	
		public void windowDeactivated(WindowEvent arg0) {
			// TODO Auto-generated method stub
			wDAcount ++;
			Deactivated.setText(Integer.toString(wDAcount));
		}
	
		public void windowDeiconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			wDIcount ++;
			Minimize.setText(Integer.toString(wDIcount)); 
		}
	
		public void windowIconified(WindowEvent arg0) {
			// TODO Auto-generated method stub
			wIcount ++;
			Maximize.setText(Integer.toString(wIcount));
		}
	
		public void windowOpened(WindowEvent arg0) {
			// TODO Auto-generated method stub
			
		}
		
	}

	