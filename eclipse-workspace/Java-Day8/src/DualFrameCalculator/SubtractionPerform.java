package DualFrameCalculator;

import java.awt.event.ActionEvent;

public class SubtractionPerform extends CalculatorFrameParent {

	public void actionPerformed(ActionEvent e) {
		create("-");

		Calculations inputOutput = new Calculations(FIRSTNUM, SECONDNUM, RESULT, CALCULATION.getLabel());
		CALCULATION.addActionListener(inputOutput);

	}

}
