import java.awt.Button;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Home {

	public Home() {

		Frame HomeFrame = new Frame("Banking Home : ");

		Label AccountL = new Label("Account");
		Label TransactionsL = new Label("Transactions : ");
		Button AccGoL = new Button("Go");
		Button TranGoL = new Button("Go");

		Choice Account = new Choice();
		Choice Transactions = new Choice();

		Account.add("New Account");
		Account.add("View Accounts");

		Transactions.add("Deposit");
		Transactions.add("Withdraw");
		Transactions.add("Balance");

		HomeFrame.setLayout(new GridLayout(2, 3));
		HomeFrame.add(AccountL);
		HomeFrame.add(Account);
		HomeFrame.add(AccGoL);
		HomeFrame.add(TransactionsL);
		HomeFrame.add(Transactions);
		HomeFrame.add(TranGoL);

		HomeFrame.setSize(400, 400);
		HomeFrame.setVisible(true);

		AccGoL.addActionListener(

				new ActionListener() {

					public void actionPerformed(ActionEvent arg0) {

						String ActionType = Account.getSelectedItem();

						if (ActionType == "New Account") {

							NewAccount Act = new NewAccount();
						}

						if (ActionType == "View Accounts") {

							ViewAccounts Act = new ViewAccounts();
						}

					}

				}

		);

		TranGoL.addActionListener(

				new ActionListener() {

					public void actionPerformed(ActionEvent arg0) {

						String ActionType = Transactions.getSelectedItem();

						if (ActionType == "Deposit") {

							Deposit Act = new Deposit();
						}

						if (ActionType == "Withdraw") {

							Withdraw Act = new Withdraw();
						}
						if (ActionType == "Balance") {

							Balance Act = new Balance();
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
