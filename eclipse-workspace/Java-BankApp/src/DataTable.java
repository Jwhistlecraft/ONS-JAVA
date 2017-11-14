import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.*;

public class DataTable {

	public DataTable(List<String[]> accountInfo, String[] columnNames) {


		JFrame DataFrame = new JFrame("View Accounts");
		JTable table = new JTable(accountInfo.toArray(new Object[0][0]),columnNames);

		table.setBounds(30,40,200,300);
		JScrollPane ScrollPane = new JScrollPane(table);

		DataFrame.add(ScrollPane);
		DataFrame.setSize(600, 600);
		DataFrame.setVisible(true);
		
		
		DataFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				DataFrame.setVisible(false);
			}
		}

		);

	}

}