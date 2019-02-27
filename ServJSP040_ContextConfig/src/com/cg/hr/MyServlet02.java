package com.cg.hr;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/MyServlet02")
public class MyServlet02 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ServletContext ctx= getServletContext();
		String companyName = ctx.getInitParameter("companyName");
		System.out.println(companyName);
		
		ServletConfig config = super.getServletConfig();  // method is come from GenericServlet() class
		String pageTitle = config.getInitParameter("pageTitle");
		System.out.println(pageTitle);
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
