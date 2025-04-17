package exampleStudent;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcUtilsStudent {
	
	public static Connection buildConnection() throws Exception
	{
		String connectionUrl = "jdbc:mysql://localhost:3306/cdac";
		String username = "root";
		String password = "password";
		Connection dbconnection = DriverManager.getConnection(connectionUrl,username,password);
		
		return dbconnection;
		
	}
	

}
