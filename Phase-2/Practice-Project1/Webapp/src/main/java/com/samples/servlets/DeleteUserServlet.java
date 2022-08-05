package com.samples.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/deleteuserServlet")
public class DeleteUserServlet extends HttpServlet {
	Connection connection;
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dburl"),context.getInitParameter("dbuser"), 
					context.getInitParameter("dbpassword"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		
		String email = request.getParameter("email");
		
		try (PreparedStatement statement = connection.prepareStatement("delete from user where email = ?");) {
			statement.setString(1, email);
			int rowsDeleted = statement.executeUpdate();
			System.out.println("Rows : " + rowsDeleted);
			PrintWriter out = response.getWriter();
			out.println("Hurray Deleted!!!");
			out.println("<p><a href='Home.html'>Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try {
			System.out.println("DeleteUserServlet.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
