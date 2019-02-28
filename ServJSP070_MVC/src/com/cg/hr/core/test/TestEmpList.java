package com.cg.hr.core.test;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.services.EmployeeServicesImpl;
import com.cg.hr.core.services.IEmployeeServices;

public class TestEmpList {
	public static void main(String[] args) {
		
	
try
{
	IEmployeeServices services = new EmployeeServicesImpl();

ArrayList<Employee> empList =services.fetchAllEmp();
for(Employee emp: empList)
{
	System.out.println(emp);
}
}
catch( EmpException e)
{
	e.printStackTrace();
}
}
}