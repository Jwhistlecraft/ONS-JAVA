import java.sql.*;

public class DataBaseAccess {
	static Connection ServerConnection;
	static {

		try {
			Class.forName("com.mysql.jdbc.Driver");

			ServerConnection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankapp", "root", "");

		}

		catch (Exception T) {

			System.out.println(T);
		}
	}
}
