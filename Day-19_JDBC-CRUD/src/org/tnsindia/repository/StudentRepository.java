package org.tnsindia.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import org.tnsindia.entities.Student;

public interface StudentRepository {
	
	//abstract method
	public abstract int create(String query, Student student);//creation
	public abstract int update(String query, Student student);//updation
	public abstract int delete(String query);//deletion
	public abstract ResultSet retrieve(String query);//retrive
	Statement createstatement();
	PreparedStatement createPrepareStatement(String query);

	


}
