package com.cg.hr.core.daos;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

import com.cg.hr.core.beans.Employee;
import com.cg.hr.core.exceptions.EmpException;
import com.cg.hr.core.util.JDBCUtil;
import com.cg.hr.core.util.JPAUtil;

public class EmployeeDaoImpl implements IEmployeeDao{

/*	EntityManager em= null;
	EntityTransaction entityTran  = null;*/
	private Connection connect ;
	
	public EmployeeDaoImpl() throws EmpException {
		
		/*em= JPAUtil.getEntityManager();
		entityTran = em.getTransaction();*/
		JDBCUtil util = new JDBCUtil();
		connect=util.getConnect();
	}
/*s
	@Override
	public Employee addEmployee(Employee emp) {
		
		entityTran.begin();
		em.persist(emp);   // persist is used for insert 
		entityTran.commit();
		return emp;
	}*/

	@Override
	public ArrayList<Employee> fetchAllEmp() throws EmpException {
		Statement stmt = null;
		ResultSet rs =null;
		ArrayList<Employee> empList = new ArrayList<>();
		try
		{// TODO Auto-generated method stub
		/*String selAllQry ="select emps from Employee emps"; //first name must be equal to second i.e emps
		TypedQuery<Employee> tq = em.createQuery(selAllQry, Employee.class);
		ArrayList<Employee> empList = (ArrayList<Employee>) tq.getResultList();*/
			stmt =connect.createStatement();
			rs = stmt.executeQuery("Select * from emp1");
			while(rs.next())
			{
				int empNo = rs.getInt("emp_id");
				String empNm =rs.getString( "emp_name");
				float empSal =rs.getFloat("emp_sal");
				
				Employee emp= new Employee(empNo, empNm, empSal);
				empList.add(emp);
			}
		
		
		return empList;
		}
		
		catch(Exception e)
		{
			
				throw new EmpException("Something went wrong in fetchAll()");
			
		}
		finally
		{
			try
			{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			}
			catch(SQLException e)
			{
				throw new EmpException("something wrong",e);
				
			}
		}
	}
	

	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		if(connect!=null)
		{
			connect.close();
		}
		super.finalize();
	}
	

	/*@Override
	public Employee deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		Employee e1 = new Employee();
		e1.setEmpId(empId);
		em.remove(e1);
		 // not delete because e1 is not in manage stateb it is in start stae
		Employee e1 = em.find(Employee.class, empId);
		entityTran.begin();
		e1.setEmpId(empId);
		em.remove(e1);
		entityTran.commit();
		return e1;
	}*/

	@Override
	public Employee getEmpbyEid(int empId) throws EmpException {
		PreparedStatement stmt = null;
		ResultSet rs =null;
		Employee emp =null;
		try
		{
			stmt =connect.prepareStatement("select emp_id,emp_name,emp_sal from emp1 where emp_id =?");
			stmt.setInt(1, empId);
			rs = stmt.executeQuery();
			while(rs.next())
			{
				int empNo = rs.getInt("emp_id");
				String empNm =rs.getString( "emp_name");
				float empSal =rs.getFloat("emp_sal");
				
				 emp= new Employee(empNo, empNm, empSal);
				
			}
		
		
		return emp;
		}
		
		catch(Exception e)
		{
			
				throw new EmpException("Something went wrong in fetchAll()");
			
		}
		finally
		{
			try
			{
			if(rs!=null)
			{
				rs.close();
			}
			if(stmt!=null)
			{
				stmt.close();
			}
			}
			catch(SQLException e)
			{
				throw new EmpException("something wrong",e);
				
			}
		}
	
	
		
	
	}
/*
	@Override
	public Employee updateEmp(int empId, String newName, float newSal) {
		// TODO Auto-generated method stub
		Employee ee=em.find(Employee.class, empId);
		ee.setEmpName(newName);
		ee.setEmpSal(newSal);
		entityTran.begin();
		em.merge(ee);
		entityTran.commit();
		
		return ee;
	}
	*/

}
