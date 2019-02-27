package com.cg.hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet("/MyServlet01")
public class MyServlet01 extends HttpServlet {
	private static final long serialVersionUID = 1L;



	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("MyServlet01");	
	PrintWriter out = response.getWriter();
	out.write("Message from servlet01");
	RequestDispatcher dispatch = request.getRequestDispatcher("/MyServlet02");
	
	dispatch.forward(request, response);
	
		
	}



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


	}

}
