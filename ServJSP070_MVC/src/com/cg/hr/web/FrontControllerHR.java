package com.cg.hr.web;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.services.EmployeeServicesImpl;
import com.cg.hr.core.services.IEmployeeServices;


@WebServlet("*.hr")
public class FrontControllerHR extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private IEmployeeServices services;
	

	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		super.init();
		try {
			services = new EmployeeServicesImpl();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			throw new ServletException("Missed service reference",e);
		}
	}


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ServletContext ctx = super.getServletContext();
		IEmployeeServices services = (IEmployeeServices) ctx.getAttribute("services");
		String url=request.getRequestURI();
		String command =getCommand(url);
		String prefix="/WEB-INF/pages/";
				String postfix =".jsp";
		/*System.out.println(url);
				System.out.println(getCommand(url));*/
		RequestDispatcher dispatcher= null;
		String jspName=null;
		switch(command)
		{
		case "*":
		{
			
		}
		case "HomePage":
		{
			jspName= "Welcome";
			
			break;
		}
		case "getLoginPage" :
		{
			jspName ="Login";
			
			break;
		}
		case "authenticate" :
		{
			String userName= request.getParameter("UserName");
			String password= request.getParameter("password");
			if(userName.equals("aa") && password.equals("aa"))
			{
				HttpSession session = request.getSession(true); // if not then make session
				// either you write true or getSession() without parameter  is same 
				System.out.println(session.getId());
			session.setAttribute("fullname", "aa aaa aaaa");
			jspName= "MainMenu";
			}
			else
			{
				request.setAttribute("message", "Wrong userName and password");
				jspName ="Login";
			}
				
			break;
		}
		case "printList" :
		{
			ArrayList<Employee> empList;
			try {
				empList = services.fetchAllEmp();
				System.out.println(empList);
				request.setAttribute("empList", empList);
			
				jspName ="EmpList";
			} catch (EmpException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
			break;
		}
		case "viewDetails" :
		{
			String strEmpId = request.getParameter("id");
			int empId= Integer.parseInt(strEmpId);
			
		
				Employee emp;
				try {
					emp = services.getEmpbyEid(empId);
					System.out.println(emp);
					request.setAttribute("emp", emp);
				
					jspName ="EmpDetails";
				} catch (EmpException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			
			
			
			break;
		}
		case "Logout" :
		{
			HttpSession session = request.getSession(false); //if not having session then not make session
			session.invalidate();
			jspName ="Thanks";
			
			break;
		}
		}
		dispatcher =request.getRequestDispatcher(prefix+jspName+postfix);
		dispatcher.forward(request, response);

		
	}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	
	private String getCommand(String url)
	{
	//ServJSP070_MVC/HomePage.hr
		int idxSlash=url.lastIndexOf("/");
		int idxDot = url.lastIndexOf(".");
		if(idxDot<0)
		{
			return "HomePage ";
		}
		else {
		return url.substring(idxSlash+1,idxDot );
		}
		
}
}
