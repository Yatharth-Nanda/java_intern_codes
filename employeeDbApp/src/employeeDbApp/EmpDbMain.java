package employeeDbApp;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class EmpDbMain {

	public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {
		
		//String query="select empid,empName from emp";
		String query="select * from emp";	
		Connection con=MySQLDBConnection .getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		while(rs.next()) // true  //Iterator 
		{
			System.out.println(rs.getInt(1));
			System.out.println(rs.getString(2));
			System.out.println(rs.getString(3));
			System.out.println(rs.getInt(4));
		}
		
	
	}

}
