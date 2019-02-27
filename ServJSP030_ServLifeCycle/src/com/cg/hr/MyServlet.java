package com.cg.hr;

import java.io.IOException;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// life cycle of methods 

// use init(ServletConfig) : Its for Initialization  , it is a life cycle method 
	//in this -->Initialization , Resource allocation are done here
//init : It is for initialization and overriding
//service() : this method is called on every request
	//this method called do get , do post method  , 
	//Controlling and transformation are also done here
// destroy()  : this method ios called while  un-deploying the file
	// Resource Deallocation 
// Eager: Created at the time of starting the server consumes  memory resources right from beginning 
	// normally used for servlet whic are always used by all the users.
	//loadOnStartup is +ive
	// Home , Login ,MainMenu
//Lazy : created only when first request is come in
	//Normally used for servlet which may be instantiated optionally .
	// ListAllEmps , AddNewEmps 

//Servlet API


@WebServlet(urlPatterns="/MyServlet",loadOnStartup=2)
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

/*	
	public void init(ServletConfig config) throws ServletException {
		System.out.println("In init(ServletConfig)");
	}
*/

	public void init() throws ServletException {
		System.out.println("In init()");
	}
	public void destroy() {
			System.out.println("In Destroy()");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("In doGet()");
	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}      

}
