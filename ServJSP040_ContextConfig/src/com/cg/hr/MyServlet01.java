package com.cg.hr;

import java.io.IOException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//The context parameter are accessible to all web components in an application
	//Get them from ServletContext
	//accessible to  -->Servlets, jsp ,Filters , Listner
	//Declare common value like company Name,URLs of other applications .
//The config parameters 
	// Get them from ServletConfig (one object per serevlet/JSP
	//Accessible to only a parent web component
	//Not accessible to any other web component 
//@WebServlet("/MyServlet01")
public class MyServlet01 extends HttpServlet {
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
