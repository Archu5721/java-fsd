package com.flight.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
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

@WebServlet("/flightdetailServlet")
public class FlightDetailServlet extends HttpServlet {
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
    
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String source = request.getParameter("source");
		String destination = request.getParameter("destination");
		String date = request.getParameter("date");
		try (PreparedStatement statement = connection.prepareStatement("select * from flight where source = ? AND destination = ? AND date = ?");) {
			
			statement.setString(1, source);
			statement.setString(2, destination);
			statement.setString(3, date);
			ResultSet results = statement.executeQuery();
			out.println("<table align='center'>");
			out.println("<tr>");
			
			out.println("<th>Source</th>");
			out.println("<th>Destination</th>");
			out.println("<th>Date</th>");
			out.println("<th>Flight Name</th>");
			out.println("<th>Price</th>");
			out.println("</tr>");
			if(results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("<td>" + results.getString(4) + "</td>");
				out.println("<td>" + results.getInt(5) + "</td>");
				out.println("</tr>");
				out.println("</table>");
				out.println("<p><a href='PersonalDetails.html'>Book Now</a></p>");
				
			}
			else {
				out.println("<h1 align='center' style = 'color:red'>No flights are available right now &#128529</h1>");
				out.println("<p><a href='Home.html'>Home Page</a></p>");
			}
			
			
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
