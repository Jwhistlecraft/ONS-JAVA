package DualFrameCalculator;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.TextField;

class AdditionPerform extends CalculatorFrameParent {

	public void actionPerformed(ActionEvent e) {
		create("+");
		
		Calculations inputOutput = new Calculations(FIRSTNUM, SECONDNUM, RESULT, CALCULATION.getLabel());
		CALCULATION.addActionListener(inputOutput);	
		
	}
}
