package WindowActionCounter;

import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.TextField;

public class Main{
	
	public static void main(String arg[]) {

		Frame HomeFrame = new Frame("Home");
		GridLayout HomeGrid = new GridLayout(4,2);                          
		
		Label miniCount = new Label("mini count");
		TextField Minimize = new TextField(20);
		
		Label maxCount = new Label("maxCount");
		TextField Maximize = new TextField(20);

		Label actiCount = new Label("actiCount");
		TextField Activated = new TextField(20);
	
		Label deactiCount = new Label("deactiCount");
		TextField Deactivated = new TextField(0);
	
		
		
		HomeFrame.setLayout(HomeGrid);
		HomeFrame.add(miniCount);
		HomeFrame.add(Minimize);
		HomeFrame.add(maxCount);
		HomeFrame.add(Maximize);
		HomeFrame.add(actiCount);
		HomeFrame.add(Activated);
		HomeFrame.add(deactiCount);
		HomeFrame.add(Deactivated);


		HomeFrame.setSize(400, 400);
		HomeFrame.setVisible(true);

		MainWindowEvent event = new MainWindowEvent(Minimize, Maximize, Activated, Deactivated);
		HomeFrame.addWindowListener(event);
		
	}
}
