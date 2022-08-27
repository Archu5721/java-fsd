package com.login.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/userServlet")
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Connection connection;

	@Override
	public void init(ServletConfig config) throws ServletException {
		try {
			System.out.println(" DB connection started");
			ServletContext context = config.getServletContext();
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection(context.getInitParameter("dburl"),
					context.getInitParameter("dbuser"), context.getInitParameter("dbpassword"));
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Username = request.getParameter("user");
		String Password = request.getParameter("password");
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		try (PreparedStatement statement = connection
				.prepareStatement("select * from user where email = ? and password = ?")) {
			statement.setString(1, Username);
			statement.setString(2, Password);
			ResultSet rs = statement.executeQuery();
			if (rs.next()) {
				out.println("<h3>Welcome " + Username + "<h3> ");
					RequestDispatcher rd = request.getRequestDispatcher("/BookTicket.jsp");
					rd.forward(request, response);
			} else {
				out.println("<h1 style='color:red' align='center'>Invalid Login!! Please Try Again &#129300</h1>");
				out.println("<br>");
				out.println("<p><a href='Home.html'>Return HomePage</a></p>");
			}
		}

	catch(

	SQLException e)
	{

		e.printStackTrace();
	}
	}

	@Override
	public void destroy() {
		try {
			System.out.println("DB connection closed");
			connection.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
