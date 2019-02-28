package com.cg.hr.core.services;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;

public interface IEmployeeServices {
	ArrayList<Employee> fetchAllEmp() throws EmpException;
	public Employee getEmpbyEid(int empId)throws  EmpException;
}
