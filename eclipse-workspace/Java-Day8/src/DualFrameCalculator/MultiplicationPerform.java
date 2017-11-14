package DualFrameCalculator;

import java.awt.event.ActionEvent;

public class MultiplicationPerform extends CalculatorFrameParent {

	public void actionPerformed(ActionEvent e) {
		create("*");

		Calculations inputOutput = new Calculations(FIRSTNUM, SECONDNUM, RESULT, CALCULATION.getLabel());
		CALCULATION.addActionListener(inputOutput);

	}
}
