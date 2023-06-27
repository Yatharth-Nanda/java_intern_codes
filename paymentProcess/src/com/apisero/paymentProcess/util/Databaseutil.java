package com.apisero.paymentProcess.util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Databaseutil {
	 public static Connection getConnection() throws IOException, ClassNotFoundException, FileNotFoundException,SQLException{
			Properties prop=new Properties();
			FileInputStream fis=new FileInputStream("dbProp");
			prop.load(fis);
			Class.forName(prop.getProperty("DB_DRIVERCLASS"));
			Connection con=null;
			try {
				con = DriverManager.getConnection(prop.getProperty("DB_URL"),
							(prop.getProperty("DB_USERNAME")),(prop.getProperty("DB_PASSWORD")));
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			
			return con;
		 }
}
