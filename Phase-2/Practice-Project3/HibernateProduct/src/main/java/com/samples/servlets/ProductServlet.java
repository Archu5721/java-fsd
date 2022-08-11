package com.samples.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.samples.domain.Product;
import com.samples.service.ProductService;

@WebServlet("/productServlet")
public class ProductServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	ProductService productservice;

	@Override
	public void init() throws ServletException {
		super.init();
		this.productservice=new ProductService();
		
	}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Product> products = productservice.getProducts();
		
		request.setAttribute("product_list", products);
		
		RequestDispatcher rd = request.getRequestDispatcher("/Productview.jsp");
		rd.forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name = request.getParameter("Pname");
		int cost = Integer.parseInt(request.getParameter("Pcost"));
		
		Product product = new Product(name, cost);
		
		this.productservice.addProduct(product);
		
		PrintWriter out = response.getWriter();
		out.println("<p><a href = 'index.html'>Home Page</a></p>");
	}

}
