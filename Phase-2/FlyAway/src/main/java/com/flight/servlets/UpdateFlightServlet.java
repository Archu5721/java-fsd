package com.flight.servlets;

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

@WebServlet("/UpdateFlightServlet")
public class UpdateFlightServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection connection;
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println("DB Connection begins...");
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
		
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		String name = request.getParameter("name");
		int price = Integer.parseInt(request.getParameter("price"));
		
		try (PreparedStatement statement = connection.prepareStatement("update flight set source=?,destination=?,date=?,price=? where name=?");) {
			
			statement.setString(1, source);
			statement.setString(2, destination);
			statement.setString(3, date);
			statement.setInt(4, price);
			statement.setString(5, name);
			int rowsUpdated = statement.executeUpdate();
			System.out.println("Rows : " + rowsUpdated);
			PrintWriter out = response.getWriter();
			out.println("Flight Info Updated!!!");
			out.println("<p><a href='HomeFlight.html'>Home</a></p>");
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
