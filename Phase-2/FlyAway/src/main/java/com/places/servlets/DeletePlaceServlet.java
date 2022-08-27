package com.places.servlets;

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

/**
 * Servlet implementation class DeletePlaceServlet
 */
@WebServlet("/DeletePlaceServlet")
public class DeletePlaceServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	Connection connection;
	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println("DB Connection Begin...");
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

		
		try (PreparedStatement statement = connection.prepareStatement("delete from places where source = ? AND destination=?");) {
			statement.setString(1, source);
			statement.setString(2, destination);

			int rowsDeleted = statement.executeUpdate();
			System.out.println("Rows : " + rowsDeleted);
			PrintWriter out = response.getWriter();
			out.println("<h1 align='center' style='color:green'>Place detail Deleted!!!</h1>");
			out.println("<p><a href='HomePlace.html'>Home</a></p>");
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
