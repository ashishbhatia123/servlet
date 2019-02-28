package com.cg.hr.core.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import com.cg.hr.core.exceptions.EmpException;

public class JDBCUtil {
	private Connection connect;

	public JDBCUtil() throws EmpException {
		super();
	try {
		
	
		Class.forName("oracle.jdbc.OracleDriver");
	String url ="jdbc:oracle:thin:@localhost:1521:XE";
	String userName ="system";
	String password ="Capgemini123";
	
		connect = DriverManager.getConnection(url, userName, password);
	}
	catch (ClassNotFoundException | SQLException e)
	{
		throw new EmpException("Wrong in JBUtil",e);
	}
	
	

}

	public Connection getConnect() {
		return connect;
	}

	
}
