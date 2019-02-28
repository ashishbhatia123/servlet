package com.cg.hr.core.daos;

import java.util.ArrayList;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;

public interface IEmployeeDao {
	ArrayList<Employee> fetchAllEmp() throws EmpException;
		public Employee getEmpbyEid(int empId)throws  EmpException;

}
