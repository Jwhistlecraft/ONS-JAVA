package ChickenCottage;

import java.sql.*;
import com.mysql.*;

public class CottageMain {
	public static void main(String args[]) {
		
		ResultSet Rec;
		Connection C;
		Statement S;
		try {
		Class.forName("com.mysql.jdbc.Driver");
		
		C = DriverManager.getConnection("jdbc:mysql://localhost:3306/ChickenCottage", "root", "");
		S = C.createStatement();
		
		S.executeUpdate("insert into Personal values(24, 'ABC', 'Manchester')");
		}		
		
		catch(Exception T)
		{
			System.out.println(T);
		}
		
	}
}
