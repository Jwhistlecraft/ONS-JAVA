package ShafeeqsDualCalc;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class SecondWindow extends Frame{
	TextField T1,T2,T3;
	Button B1;
	Label L1;
	
	public SecondWindow(String T) {
		super(T);
	setLayout(new GridLayout(4,2));
	T1= new TextField(5);
	T2= new TextField(5);
	T3= new TextField(5);
	B1= new Button(T);
	
	add(new Label("First No."));
	add(T1);
	add(new Label("Second No."));
	add(T2);
	add(new Label(""));
	add(B1);
	add(new Label("Results"));
	add(T3);
	
	SecondWindowEvents SE = new SecondWindowEvents();
	B1.addActionListener(SE);
	
	addWindowListener(SE);
	
	}	
	
	public void ShowWindow(String x) {
		setSize(400,400);
		setTitle(x);
		setVisible(true);
		B1.setLabel(x);
	}
	
}
