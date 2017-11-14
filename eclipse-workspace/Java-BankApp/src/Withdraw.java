
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

public class Withdraw {

	TextField AccountNumber, CurrentBalance, AmountChange, Name, Address, AccountType, Gender;
	Button Find, Submit;

	Connection C;
	Statement ServerQ;

	public Withdraw() {

		Frame HomeFrame = new Frame("Charactor Finder");
		Panel North = new Panel();
		Panel Middle = new Panel();
		Panel South = new Panel();

		AccountNumber = new TextField(20);
		CurrentBalance = new TextField(20);
		AmountChange = new TextField(20);
		Name = new TextField(20);
		Address = new TextField(20);
		AccountType = new TextField(20);
		Gender = new TextField(20);
		Find = new Button("Find");
		Submit = new Button("Submit");

		Label Account_NumberL = new Label("Account Number : ");
		Label Current_BalanceL = new Label("Current Balance : ");
		Label Amount_ChangeL = new Label("Amount to Withdraw ");
		Label NameL = new Label("Name : ");
		Label AddressL = new Label("Address : ");
		Label Account_TypeL = new Label("Account type : ");
		Label GenderL = new Label("Name : ");

		HomeFrame.setLayout(new GridLayout(3, 1));
		HomeFrame.add(North);
		HomeFrame.add(Middle);
		Middle.setLayout(new GridLayout(4, 2));
		HomeFrame.add(South);
		South.setLayout(new GridLayout(2, 2));

		North.add(Account_NumberL);
		North.add(AccountNumber);
		North.add(Find);

		Middle.add(NameL);
		Middle.add(Name);
		Middle.add(AddressL);
		Middle.add(Address);
		Middle.add(Account_TypeL);
		Middle.add(AccountType);
		Middle.add(GenderL);
		Middle.add(Gender);

		South.add(Amount_ChangeL);
		South.add(AmountChange);
		South.add(Submit);
		South.add(Current_BalanceL);
		South.add(CurrentBalance);

		HomeFrame.setSize(400, 400);
		HomeFrame.setVisible(true);

		HomeFrame.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent e) {
				HomeFrame.setVisible(false);
			}
		}

		);

		Find.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				String SearchParam = "";

				if (AccountNumber.getText() != null) {

					SearchParam = AccountNumber.getText();

					try {
						ServerQ = DataBaseAccess.ServerConnection.createStatement();

						String SpecificFinder = "select * from Accounts where AccNo = '" + SearchParam + "'";
						String Balance = "select StartingBalance from accounts where AccNo = '"
								+ AccountNumber.getText() + "'";

						ResultSet BalanceFound = ServerQ.executeQuery(Balance);
						ResultSet AccountFound = ServerQ.executeQuery(SpecificFinder);

						if (AccountFound.next()) {

							String AccountAccNo = AccountFound.getString("AccNo");
							String AccountName = AccountFound.getString("Name");
							String AccountAddress = AccountFound.getString("Address");
							String AccountBalance = AccountFound.getString("StartingBalance");

							Name.setText(AccountName);
							Address.setText(AccountAddress);

							if (AccountAccNo.substring(1, 2).equals("M")) {
								Gender.setText("Male");
							}

							if (AccountAccNo.substring(1, 2).equals("F")) {
								Gender.setText("Female");
							}

							if (AccountAccNo.substring(0, 1).equals("C")) {
								AccountType.setText("Current");
							}

							if (AccountAccNo.substring(0, 1).equals("S")) {
								AccountType.setText("Savings");
							}

							CurrentBalance.setText(AccountBalance);

						}
					} catch (Exception T) {

						System.out.println(T);
						;
					}

				}
			}

		});
		
		Submit.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent arg0) {

				if (CurrentBalance.getText() != null && AmountChange.getText() != null) {

					if (Integer.parseInt(CurrentBalance.getText()) > Integer.parseInt(AmountChange.getText())) {

						Integer newBalance = Integer.parseInt(CurrentBalance.getText())
								- Integer.parseInt(AmountChange.getText());

						CurrentBalance.setText(newBalance.toString());
						String AccNoTemp = AccountNumber.getText();

						try {
							ServerQ = DataBaseAccess.ServerConnection.createStatement();
							String BalanceUpdater = "update accounts set StartingBalance = '" + newBalance
									+ "' where AccNo = '" + AccNoTemp + "'";
							String InsertRecord = "insert into withdrawals values('" + AccountNumber.getText() +"','"+ AmountChange.getText() + "', sysdate())";
							
							ServerQ.executeUpdate(InsertRecord);
							ServerQ.executeUpdate(BalanceUpdater);

						} catch (Exception T) {

							System.out.println(T);
						}
					}
					else {
						String M = "You don't have enough money in the account";
		
						ErrorWindow test = new ErrorWindow(M);	
						
					}

				}

			}

		});

	}

}
