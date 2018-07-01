package com.onnea.web.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.onnea.web.exception.OnneaException;

public abstract class  BaseDAO {
	
	public Connection getConnection() throws OnneaException	{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection(  "jdbc:mysql://localhost:3306/onneadb","dbadmin","dbadmin"); 
			connection.setAutoCommit(false);
			return connection;
			
		} catch (ClassNotFoundException | SQLException e) {
			throw new OnneaException(e);
		}  
	}
	
	public void releaseConnection(Connection connection) {
		
		try {
			connection.close();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return;
	}
	
	public void commit(Connection connection) {
		
		return ;
	}
	
	public void rollback(Connection connection) {
		
		return ;
	}
	

}
