package org.tnsindia.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentDAO {
	
	public Connection createConnection()
	{
		String url="jdbc:mysql://localhost:3306/M25";
		String user="root";
		String password="jenny";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e)
		{
			System.out.println("Exception occurred "+e);
		}
		Connection c;
		try {
			c=DriverManager.getConnection(url, user, password);
		} catch (SQLException e) {
			c=null;
			System.out.println("Invalid crendentials");
		}
		return c;
		
	}

}
