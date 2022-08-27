package com.login.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/createServlet")
public class CreateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection connection;
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println(" DB connection started");
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
		String Username = request.getParameter("user");
		String Password = request.getParameter("password");
		
		try (PreparedStatement statement = connection.prepareStatement("insert into user values(?,?)");) {
			statement.setString(1, Username);
			statement.setString(2, Password);
			int rows = statement.executeUpdate();
			System.out.println("Rows : " + rows);
			PrintWriter out = response.getWriter();
			out.println("<h1 style='color:green' align='center'>Account created Successfully!!! <h1>");
			out.println("<p><a href='Home.html'>Home Page</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public void destroy() {
		try {
			System.out.println("DB connection closed");
			connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
}
