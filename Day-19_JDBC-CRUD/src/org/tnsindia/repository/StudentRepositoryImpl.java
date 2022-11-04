package org.tnsindia.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.tnsindia.dao.StudentDAO;
import org.tnsindia.entities.Student;

public class StudentRepositoryImpl implements StudentRepository{
	
	StudentDAO dao;
	

	public StudentRepositoryImpl() {
		dao=new StudentDAO();
	}

	@Override
	public int create(String query, Student student) {
		PreparedStatement statement=createPrepareStatement(query);
		int count=0;
		try {
			statement.setInt(1, student.getRollno());
			statement.setString(2, student.getName());
			count=statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return count;
	}

	@Override
	public int update(String query, Student student) {
		PreparedStatement statement=createPrepareStatement(query);
		int count=0;
		try {
			statement.setInt(2, student.getRollno());
			statement.setString(1, student.getName());
			count=statement.executeUpdate();

		} catch (SQLException e) {
			System.out.println(e);
		}
		return count;
	}
	

	@Override
	public int delete(String query) {
		Statement statement=createstatement();
		int count=0;
		
		try {
			count=statement.executeUpdate(query);
		} catch (SQLException e) {
			count=0;
			//e.printStackTrace();
		}
		return count;
	}

	@Override
	public ResultSet retrieve(String query) {
		Statement statement=createstatement();
		ResultSet rs;
		try {
			rs=statement.executeQuery(query);
		} catch (SQLException e) {
			rs=null;
			//e.printStackTrace();
		}
		return rs;
	}

	@Override
	public Statement createstatement() {
		Connection c=dao.createConnection();
		Statement statement;
		
		try {
			statement=c.createStatement();
		} catch (SQLException e) {
			statement=null;
			//e.printStackTrace();
		}
		return statement;
	}

	@Override
	public PreparedStatement createPrepareStatement(String query) {
		Connection c=dao.createConnection();
		PreparedStatement statement;
		try {
			statement=c.prepareStatement(query);
		} catch (SQLException e) {
			statement=null;
			//e.printStackTrace();
		}
		return statement;
	}

	
}
