package DualFrameCalculator;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionListener;

abstract public class CalculatorFrameParent implements ActionListener{
	
	TextField RESULT;
	TextField SECONDNUM; 
	TextField FIRSTNUM; 
	Button CALCULATION;
	
	public void create(String button) {
		Frame CalcFrame = new Frame("Calculator");
		GridLayout CalcGrid = new GridLayout(4,2);                           //important note: the button string allows me to change the plus button in the child class
		RESULT = new TextField(20);
		Label RESULTtxt = new Label("Result;");
		Label EMPTY = new Label("");
		CALCULATION = new Button(button);
		SECONDNUM = new TextField(20);
		Label SECONDNUMtxt = new Label("Second number:");
		FIRSTNUM= new TextField(20);
		Label FIRSTNUMtxt = new Label("First number:");
		
		CalcFrame.setLayout(CalcGrid);
		CalcFrame.add(FIRSTNUMtxt);
		CalcFrame.add(FIRSTNUM);
		CalcFrame.add(SECONDNUMtxt);
		CalcFrame.add(SECONDNUM);
		CalcFrame.add(EMPTY);
		CalcFrame.add(CALCULATION);
		CalcFrame.add(RESULTtxt);
		CalcFrame.add(RESULT);
		
		
		CalcFrame.setSize(400,400);
		CalcFrame.setVisible(true);
		
		CalculatorWindowEvent event = new CalculatorWindowEvent();
		CalcFrame.addWindowListener(event);
		
	}
	
}
