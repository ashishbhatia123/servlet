package com.cg.hr;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/HomePage")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		PrintWriter out=response.getWriter();
		out.print("<html>");
			out.print("<head>");
				out.print("<title>HR Application</title>");
			out.print("</head>");
			out.print("<body>");
				out.print("<h1>Capgemini India</h1>");
			//out.print("<a href =\'Welcome.jsp\'>Welcome</a>");
			  //response.sendRedirect("Welcome.jsp");
				RequestDispatcher dispatch =request.getRequestDispatcher("Welcome.jsp");
				dispatch.forward(request, response);
				out.print("</body>");
		out.print("</html>");
		System.out.println("In Servlet");
	}
	
	
	

}
