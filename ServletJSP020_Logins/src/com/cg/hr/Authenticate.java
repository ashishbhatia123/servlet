package com.cg.hr;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/authenticate")
public class Authenticate extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//pick up QueryStringData  -- if data is come throuhj " get " in html
		//pick up horn data  -- if data is come throuhj " post ' in html	
	String userName= request.getParameter("UserName");
	String password= request.getParameter("password");
	RequestDispatcher dispatch = null;
	// for multiple data get
	//String arr[]=request.getParameterValues(arg0);
	if(userName.equals("aa") && (password.equals("aa")))
	{
		String fullName= "aa aaa aaaa";
		System.out.println("ashi");
		//Request Scope
		request.setAttribute("fullname", fullName);
		dispatch= request.getRequestDispatcher("/WEB-INF/pages/MainMenu.jsp");
		dispatch.forward(request, response);
	}
	else
	{
		request.setAttribute("message", "Wrong authentication please do again");
		dispatch= request.getRequestDispatcher("/WEB-INF/pages/Login.jsp");
		dispatch.forward(request, response);
	}
	System.out.println("UserName : "+userName) ; 
}
}

