package AdvancedJava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class P1 {
	private static final String DBURL = "jdbc:mysql://localhost:3306/hiteshdb";
	private static final String DBUSERNAME = "root";
	private static final String DBPASSWORD = "1234";
	private static final String SHOW = "Select * from Employee";
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		//(1) Load Driver class [Throw ClassNotFoundException]
				Class.forName("com.mysql.cj.jdbc.Driver");
				
		//(2) get the Connection [Throw SQLException]
			    Connection con = DriverManager.getConnection(DBURL,DBUSERNAME,DBPASSWORD);
	    
		//(3) Create the Statement
				Statement stmt = con.createStatement();
				 
	    //4. Process the Result // Execute the Query
				ResultSet affect = stmt.executeQuery(SHOW);
				
	      
	}

}
