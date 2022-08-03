package com.servlets.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class JdbcConnection extends GenericServlet{
	Connection connection;
	PrintWriter out ;
	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Archu@2000");
			out = res.getWriter();
			out.println("DBConnection Established!!");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		try {
			connection.close();
			out.println("Connection CLosed");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

	
}
