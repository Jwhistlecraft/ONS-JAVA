package CharFinderApp;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JRadioButton;

public class Page {

	TextField ENTERTEXT, RESULT;
	Button FIND, CHANGE;
	JRadioButton CAPS, LOWERS, DIGITS, SPECIALS;

	String capitals;
	String lowers;
	String digits;
	String specials;

	public Page() {

		Frame HomeFrame = new Frame("Charactor Finder");
		Panel North = new Panel();
		Panel Middle = new Panel();
		Panel South = new Panel();

		ENTERTEXT = new TextField(20);
		RESULT = new TextField(20);
		FIND = new Button("FIND");
		CHANGE = new Button("CHANGE");
		CAPS = new JRadioButton();
		LOWERS = new JRadioButton();
		DIGITS = new JRadioButton();
		SPECIALS = new JRadioButton();

		Label caps = new Label("Select capitals");
		Label lowers = new Label("Select lowercases");
		Label digits = new Label("Select digits");
		Label specials = new Label("Select specials");

		HomeFrame.setLayout(new GridLayout(3, 1));
		HomeFrame.add(North);
		HomeFrame.add(Middle);
		Middle.setLayout(new GridLayout(5, 1));
		HomeFrame.add(South);

		North.add(ENTERTEXT);
		Middle.add(CAPS);
		Middle.add(caps);
		Middle.add(LOWERS);
		Middle.add(lowers);
		Middle.add(DIGITS);
		Middle.add(digits);
		Middle.add(SPECIALS);
		Middle.add(specials);
		Middle.add(FIND);
		Middle.add(CHANGE);
		South.add(RESULT);

		HomeFrame.setSize(400, 400);
		HomeFrame.setVisible(true);

		FIND.addActionListener(

				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						int textLength = ENTERTEXT.getText().length();
						String tempResult = "";

						for (int i = 0; i < textLength; i++) {
							Character eachChar = ENTERTEXT.getText().charAt(i);

							if (CAPS.isSelected()) {
								if (Character.isUpperCase(eachChar)) {
									tempResult += eachChar;
								}
							}

							if (LOWERS.isSelected()) {
								if (Character.isLowerCase(eachChar)) {
									tempResult += eachChar;
								}
							}

							if (SPECIALS.isSelected()) {
								if (Character.isLetterOrDigit(eachChar) == false) {
									tempResult += eachChar;
								}
							}
							if (DIGITS.isSelected()) {
								if (Character.isDigit(eachChar)) {
									tempResult += eachChar;
								}
							}
							RESULT.setText(tempResult);
						}

					}
				});

		CHANGE.addActionListener(

				new ActionListener() {
					public void actionPerformed(ActionEvent arg0) {

						int textLength = ENTERTEXT.getText().length();
						String tempResult = "";

						for (int i = 0; i < textLength; i++) {
							Character eachChar = ENTERTEXT.getText().charAt(i);

							if (CAPS.isSelected()) {
								if (Character.isUpperCase(eachChar)) {
									tempResult += Character.toLowerCase(eachChar);
								}
							}

							if (LOWERS.isSelected()) {
								if (Character.isLowerCase(eachChar)) {
									tempResult += Character.toUpperCase(eachChar);
								}
							}

							if (SPECIALS.isSelected()) {
								if (Character.isLetterOrDigit(eachChar) == false) {
									tempResult += eachChar;
								}
							}
							if (DIGITS.isSelected()) {
								if (Character.isDigit(eachChar)) {
									int intTemp = Integer.parseInt(eachChar.toString());
									intTemp = intTemp * 2;
									String tempString = Integer.toString(intTemp) ;
									tempResult += tempString;
								}
							}
							
							RESULT.setText(tempResult);
						}
					}
				}
		);

		HomeFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				System.exit(0);
			}
		}

		);
	}
}
