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
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ErrorWindow{

		Label ErrorMessage;

	public ErrorWindow(String M) {

		Frame HomeFrame = new Frame("Account Balnce");
		Panel North = new Panel();
		Panel South = new Panel();

		Label ErrorTitle= new Label("You have encountered an Error");
		Label ErrorText = new Label(M);

		HomeFrame.setLayout(new GridLayout(2, 1));
		HomeFrame.add(North);
		HomeFrame.add(South);
		
		North.add(ErrorTitle);
		South.add(ErrorText);


		HomeFrame.setSize(400, 200);
		HomeFrame.setVisible(true);

		HomeFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				HomeFrame.setVisible(false);
			}
		}

		);

	}
}