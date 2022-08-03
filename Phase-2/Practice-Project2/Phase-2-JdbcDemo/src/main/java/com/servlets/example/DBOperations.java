package com.servlets.example;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/DBOperations")
public class DBOperations extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
 
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try(Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Archu@2000");
				Statement statement = connection.createStatement();) {
			String qry1="create database mydatabase";
			String qry2="use mydatabase";
			String qry3="drop database mydatabase";
			statement.executeUpdate(qry1);
			PrintWriter out = response.getWriter();
			out.println("Database Created!!");
			statement.executeUpdate(qry2);
			out.println("Database selected!!");
			statement.executeUpdate(qry3);
			out.println("Database Deleted!!");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
