package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class TestDB {
	/**
	 * @param args
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static void main(String[] args) throws ClassNotFoundException,SQLException {
		
		//register driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		//getConnection(url,un,pw)
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb","root","root");
		
		
		//************************************ Insert Query **********************************************
		
//		//a. write sql
//		String sql  = "insert into user (username,password) values ('pasa','450')";
//		
//		//b. create statement.
//		Statement stm = con.createStatement();
//		//c. execute sql
//		stm.execute(sql);
//		//d. close db
//		
//		con.close();
//		
//		
//		System.out.println("sccess");
		
		
		
//		**************************************  Delete query ****************************************
//		//a write sql
//		String sql = "delete from user where username='pasa'";
//		
//		//b. create statemetn
//		Statement stm = con.createStatement();
//		
//		//c. execute sql
//		stm.execute(sql);
//		
////		d.close
//		con.close();
//		
//		System.out.println("Deleted successfully");
		
		
//		************************************ update query 
		
////		a. write sql 
//		String sql = "update user set password='happy' where id=12";
//		
////		b.create stmt
//		Statement stm = con.createStatement();
//		
////		c. execute stmt
//		stm.execute(sql);
//		
//		con.close();
//		
//		System.out.println("Updated successfully");
		
		
//		************************************* select ******************************
//		a. write sql 
		String sql = "select * from user";
		
//		b. create stmt 
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		
		while(rs.next())
		{
			System.out.println("Id = "+rs.getInt("id"));
			System.out.println("username = "+rs.getString("username"));
			System.out.println("password = "+rs.getString("password"));
			
			
			System.out.println("*********************************************");
		}
		
	}
}
