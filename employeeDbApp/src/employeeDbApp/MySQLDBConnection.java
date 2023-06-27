package employeeDbApp;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLDBConnection {
	
	public static Connection getConnection() throws IOException, ClassNotFoundException, SQLException
	{
		Properties prop=new Properties();
		FileInputStream fis=new FileInputStream("dbProp.properties");
		prop.load(fis);
		Class.forName(prop.getProperty("DB_DRIVERCLASS"));
		Connection con=DriverManager.getConnection(prop.getProperty("DB_URL"),
					(prop.getProperty("DB_USERNAME")),(prop.getProperty("DB_PASSWORD")));
		
		
		
		return con;
	}

}
