package DAO;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

public static Connection createConnection()
{
	Connection connection = null;
	String url = "jdbc:mysql://localhost:3306/healthcare_db";
	String uName = "root";
	String pswd = "11111";
	try{
		Class.forName("com.mysql.jdbc.Driver");
		connection = DriverManager.getConnection(url, uName, pswd);
	}
	catch (Exception e){
		e.printStackTrace();
	}
	return connection;
	}
}