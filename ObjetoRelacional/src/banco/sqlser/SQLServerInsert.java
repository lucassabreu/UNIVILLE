package banco.sqlser;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SQLServerInsert {
 
	
	public static void main(String[] args) {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String stringConn = "jdbc:sqlserver://localhost:1433;databaseName=poo2013;user=bob;password=bob121236334";
			Connection conn = DriverManager.getConnection(stringConn);
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
			
		
	}
}