package com.airlines.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ShowAirlineServlet
 */
@WebServlet("/ShowAirlineServlet")
public class ShowAirlineServlet extends HttpServlet {
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
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try (Statement statement = connection.createStatement();) {
			ResultSet results = statement.executeQuery("select * from airlines");
			PrintWriter out = response.getWriter();
			out.println("<table align='center'>");
			out.println("<tr>");
			out.println("<th>ID</th>");
			out.println("<th>Flight Name</th>");
			out.println("</tr>");
			while(results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getInt(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<p><a href='HomeAirlines.html'>Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	@Override
	public void destroy() {
		try {
			System.out.println(" DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
