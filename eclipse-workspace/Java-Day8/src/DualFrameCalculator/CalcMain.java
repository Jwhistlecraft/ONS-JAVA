package DualFrameCalculator;

import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class CalcMain {
	public static void main(String args[]) {

		Frame HomeFrame = new Frame("Home");
		GridLayout HomeGrid = new GridLayout(4, 1);      
		Button BTN_ADDITION = new Button("Addition");
		Button BTN_SUBTRACTION = new Button("Subtraction");
		Button BTN_MULTIPLICATION = new Button("Multiplication");
		Button BTN_DIVISION = new Button("Division");

		HomeFrame.setLayout(HomeGrid);

		HomeFrame.add(BTN_ADDITION);
		HomeFrame.add(BTN_MULTIPLICATION);
		HomeFrame.add(BTN_SUBTRACTION);
		HomeFrame.add(BTN_DIVISION);

		HomeFrame.setSize(400, 400);
		HomeFrame.setVisible(true);

		MainWindowEvent event = new MainWindowEvent();
		HomeFrame.addWindowListener(event);

		AdditionPerform event1 = new AdditionPerform();
		BTN_ADDITION.addActionListener(event1);

		SubtractionPerform event2 = new SubtractionPerform();
		BTN_SUBTRACTION.addActionListener(event2);

		DivisionPerform event3 = new DivisionPerform();
		BTN_MULTIPLICATION.addActionListener(event3);

		MultiplicationPerform event4 = new MultiplicationPerform();
		BTN_DIVISION.addActionListener(event4);

	}

}
