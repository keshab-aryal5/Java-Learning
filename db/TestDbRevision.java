package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class TestDbRevision {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
//		db configuration 
//		a. register driver 
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		
//		b. get connection(url,username,pw)
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		
		
//		transaction 
		
		
		// --------------------------- insert sql ---------------------------------------------------------
		
		//a. write sql
//		String sql = "Insert into user (username,password) values ('admin','67899')";
		//b. create statement.
//		Statement stm = conn.createStatement();
		//c. execute statement.
//		stm.execute(sql);
		//d. close connection.
//		conn.close();
//		System.out.println("Successfully inserted into user");
		
		
		
		//--------------------------------delete sql -------------------------------
//		a. write sql 
//		String sql = "delete from user where id=4";
//		b.create statement 
//		Statement stm = conn.createStatement();
//		c.execute statement 
//		stm.execute(sql);
//		d.close 
//		conn.close();
//		System.out.println("Deleted user successfully.");
		
		
		//-----------------------------------------update sql ----------------------------------
		
//		a.write sql 
//		String sql = "update user set username='super admin' where id=6";
//		b.create stmt 
//		Statement stm = conn.createStatement();
//		c.execute statement.
//		stm.execute(sql);
//		d.close connection 
//		conn.close();
//		System.out.println("Updated user");
		
		//--------------------------------------------------- select sql ----------------------------
		String sql = "select * from user";
		Statement stm = conn.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println("User name: "+rs.getString("username"));
			System.out.println("Password: "+rs.getString("password"));
			System.out.println("--------------------------------------------");
		}
	}
}
