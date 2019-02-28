package com.cg.hr.core.listner;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebListener;

import com.cg.hr.core.services.EmployeeServicesImpl;
import com.cg.hr.core.services.IEmployeeServices;


@WebListener
public class CreateServiceResources implements ServletContextListener {

 private IEmployeeServices services;
   
	
    public void contextDestroyed(ServletContextEvent arg0)  { 
        services=null;
    }

    public void contextInitialized(ServletContextEvent arg0)  { 
    	try {
			services = new EmployeeServicesImpl();
			ServletContext ctx =arg0.getServletContext();
			ctx.setAttribute("services",services);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
    }
	

