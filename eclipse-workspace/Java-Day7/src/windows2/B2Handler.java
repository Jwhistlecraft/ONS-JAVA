package windows2;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.Button;

public class B2Handler implements ActionListener{
	
	Button btn;
	public B2Handler(Button B) {
		btn = B;                    // the reason for btn = B is because be is a local variable and 
	}	                            // the method below needs access to the reference variable
		                            // stored in B
	
	@Override
	public void actionPerformed(ActionEvent X) {
		
		btn.setLabel("Newport");
	}
		
	
}
